package com.vk.libvideo.live.impl.broadcast_settings;

import android.R;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.vkontakte.android.VKActivity;
import xsna.dhr0;
import xsna.s3q0;
import xsna.tk5;

/* compiled from: BroadcastSettingsActivity.kt */
/* loaded from: classes3.dex */
public final class BroadcastSettingsActivity extends VKActivity {
    @Override // com.vk.core.ui.themes.ThemableActivity
    public final boolean Q1() {
        return true;
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public final void onBackPressed() {
        if (getSupportFragmentManager().K() > 1) {
            getSupportFragmentManager().W();
        } else {
            finish();
        }
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(dhr0.C().c);
        dhr0.v0(this);
        dhr0.r0(this);
        super.onCreate(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        a b = tk5.b(supportFragmentManager, supportFragmentManager);
        BroadcastSettingsFragment broadcastSettingsFragment = new BroadcastSettingsFragment();
        broadcastSettingsFragment.setArguments(getIntent().getExtras());
        s3q0 s3q0Var = s3q0.a;
        b.g(R.id.content, broadcastSettingsFragment, BroadcastSettingsFragment.class.getCanonicalName());
        b.d(null);
        b.k(false);
    }
}
