package com.youngjoo.simplelauncher;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SimpleLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return SimpleLauncherFragment.newInstance();
    }
}
