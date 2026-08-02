package com.vk.auth.changepassword;

import android.os.Bundle;
import com.vk.superapp.browser.ui.VkBrowserActivity;
import xsna.e370;
import xsna.hij0;
import xsna.pgn0;
import xsna.r3y;
import xsna.wdx0;

/* compiled from: VkChangePasswordActivity.kt */
/* loaded from: classes15.dex */
public final class VkChangePasswordActivity extends VkBrowserActivity {
    public static final /* synthetic */ int m = 0;

    @Override // com.vk.superapp.browser.ui.VkBrowserActivity, com.vk.superapp.core.ui.component.VkSdkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        R1();
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("service_vk_id", -1L);
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        int i = pgn0.a.a;
        if (longExtra == wdx0Var.c().b.b) {
            wdx0 wdx0Var2 = e370.f;
            if ((wdx0Var2 != null ? wdx0Var2 : null).k()) {
                r3y.a("pass_change", new hij0(this, 22));
                return;
            }
        }
        setResult(1);
        finish();
    }

    @Override // com.vk.superapp.browser.ui.VkBrowserActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        r3y.b();
    }
}
