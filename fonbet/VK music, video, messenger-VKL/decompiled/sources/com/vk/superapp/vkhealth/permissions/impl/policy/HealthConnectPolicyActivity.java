package com.vk.superapp.vkhealth.permissions.impl.policy;

import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.vkontakte.android.R;
import xsna.anj;
import xsna.e370;
import xsna.rex0;

/* compiled from: HealthConnectPolicyActivity.kt */
/* loaded from: classes6.dex */
public final class HealthConnectPolicyActivity extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(this, Uri.parse(anj.c(R.string.vk_health_connect_policy_url, this)));
    }
}
