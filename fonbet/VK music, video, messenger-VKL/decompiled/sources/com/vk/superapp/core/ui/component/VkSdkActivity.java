package com.vk.superapp.core.ui.component;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import xsna.prw;
import xsna.q0o0;

/* compiled from: VkSdkActivity.kt */
/* loaded from: classes11.dex */
public abstract class VkSdkActivity extends AppCompatActivity implements q0o0 {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        prw.h(this, tag(), null);
    }

    public String tag() {
        return "VkSdkActivity";
    }
}
