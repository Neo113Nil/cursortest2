package com.vk.auth.smartflow.impl.maxmessenger;

import android.os.Bundle;
import com.vk.superapp.analytics.MaxMessengerAnalytics;
import com.vk.superapp.analytics.di.SakAnalyticsComponent;
import com.vk.superapp.core.ui.component.VkSdkActivity;
import xsna.fpf0;
import xsna.k7m;
import xsna.m7m;
import xsna.w8i;

/* compiled from: MaxMessengerReturnActivity.kt */
/* loaded from: classes15.dex */
public final class MaxMessengerReturnActivity extends VkSdkActivity implements w8i {
    public final MaxMessengerAnalytics f = ((SakAnalyticsComponent) ((k7m) m7m.f(this)).a(fpf0.a(SakAnalyticsComponent.class))).Q9();

    @Override // com.vk.superapp.core.ui.component.VkSdkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f.e();
        finish();
    }

    @Override // com.vk.superapp.core.ui.component.VkSdkActivity, xsna.q0o0
    public final String tag() {
        return "MaxMessengerReturnActivity";
    }
}
