package com.vk.superapp.logs;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.vk.superapp.core.ui.component.VkSdkActivity;
import com.vkontakte.android.R;
import xsna.e370;
import xsna.gfx0;
import xsna.qgn0;
import xsna.tgn0;
import xsna.tk5;

/* compiled from: SuperappLogsActivity.kt */
/* loaded from: classes6.dex */
public final class SuperappLogsActivity extends VkSdkActivity {
    @Override // com.vk.superapp.core.ui.component.VkSdkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tgn0 tgn0Var = e370.x;
        if (tgn0Var == null) {
            tgn0Var = null;
        }
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        setTheme(tgn0Var.c(gfx0Var));
        setContentView(R.layout.vk_activity_superapp_logs);
        if (getSupportFragmentManager().G(R.id.fragment_container) == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            a b = tk5.b(supportFragmentManager, supportFragmentManager);
            b.g(R.id.fragment_container, new qgn0(), null);
            b.k(false);
        }
    }
}
