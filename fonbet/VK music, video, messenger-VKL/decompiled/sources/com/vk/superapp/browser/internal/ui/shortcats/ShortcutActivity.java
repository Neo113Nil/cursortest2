package com.vk.superapp.browser.internal.ui.shortcats;

import android.os.Bundle;
import android.view.ViewGroup;
import com.vk.superapp.core.ui.component.VkSdkActivity;
import com.vkontakte.android.R;
import xsna.e370;
import xsna.ehj0;
import xsna.gfx0;
import xsna.ko3;
import xsna.q55;
import xsna.tgn0;
import xsna.xgx0;

/* compiled from: ShortcutActivity.kt */
/* loaded from: classes6.dex */
public final class ShortcutActivity extends VkSdkActivity {
    public ehj0 f;
    public ViewGroup g;

    public final void g0() {
        ViewGroup viewGroup = this.g;
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.setVisibility(0);
    }

    @Override // com.vk.superapp.core.ui.component.VkSdkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        tgn0 tgn0Var = e370.x;
        if (tgn0Var == null) {
            tgn0Var = null;
        }
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        setTheme(tgn0Var.c(gfx0Var));
        super.onCreate(bundle);
        setContentView(R.layout.vk_shortcut_activity);
        if (!getIntent().hasExtra("app_id")) {
            xgx0.a.getClass();
            xgx0.b("App id is required param!");
            finish();
        }
        this.f = new ehj0(this, getIntent().getLongExtra("app_id", -1L));
        this.g = (ViewGroup) findViewById(R.id.error);
        findViewById(R.id.error_retry).setOnClickListener(new ko3(this, 10));
        ehj0 ehj0Var = this.f;
        ehj0 ehj0Var2 = ehj0Var != null ? ehj0Var : null;
        ehj0Var2.getClass();
        q55 q55Var = q55.a;
        q55.a(ehj0Var2.d);
        ehj0Var2.a();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ehj0 ehj0Var = this.f;
        if (ehj0Var == null) {
            ehj0Var = null;
        }
        ehj0Var.getClass();
        q55 q55Var = q55.a;
        q55.e(ehj0Var.d);
        ehj0Var.c.e();
    }
}
