package com.vk.superapp.browser.internal.ui.identity.fragments;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.vk.superapp.core.ui.VkDelegatingActivity;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.e370;
import xsna.gfx0;
import xsna.gi6;
import xsna.oek0;
import xsna.oqx0;
import xsna.ozl;
import xsna.s3q0;
import xsna.tgn0;
import xsna.xgx0;

/* compiled from: VkIdentityActivity.kt */
/* loaded from: classes6.dex */
public class VkIdentityActivity extends VkDelegatingActivity {
    public int g;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @ozl
    public final void onBackPressed() {
        Fragment G = getSupportFragmentManager().G(this.g);
        if ((G instanceof gi6) && ((gi6) G).a0()) {
            return;
        }
        super.onBackPressed();
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
        Window window = getWindow();
        gfx0 gfx0Var2 = e370.b;
        if (gfx0Var2 == null) {
            gfx0Var2 = null;
        }
        gfx0Var2.getClass();
        boolean z = !dhr0.M();
        oek0 oek0Var = new oek0(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var)).f(z);
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.vk_fragment_container);
        int id = frameLayout.getId();
        setContentView(frameLayout);
        this.g = id;
        if (getSupportFragmentManager().G(this.g) == null) {
            Intent intent = getIntent();
            try {
                if ((intent != null ? intent.getSerializableExtra("fragmentClass") : null) != null) {
                    O1(this.g);
                } else {
                    finish();
                    s3q0 s3q0Var = s3q0.a;
                }
            } catch (Exception e) {
                xgx0.a.getClass();
                xgx0.d(e);
                finish();
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
    }
}
