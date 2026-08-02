package com.vk.superapp.catalog.impl.v1;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.vk.superapp.core.ui.component.VkSdkActivity;
import com.vkontakte.android.R;
import xsna.e370;
import xsna.gfx0;
import xsna.hhn0;
import xsna.tgn0;
import xsna.tk5;
import xsna.wo6;

/* compiled from: SuperappCatalogActivity.kt */
/* loaded from: classes6.dex */
public final class SuperappCatalogActivity extends VkSdkActivity {
    public static final /* synthetic */ int f = 0;

    @Override // com.vk.superapp.core.ui.component.VkSdkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.vk_miniapp_container_id);
        setContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        tgn0 tgn0Var = e370.x;
        if (tgn0Var == null) {
            tgn0Var = null;
        }
        gfx0 gfx0Var = e370.b;
        setTheme(tgn0Var.c(gfx0Var != null ? gfx0Var : null));
        if (getSupportFragmentManager().G(R.id.vk_miniapp_container_id) == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            a b = tk5.b(supportFragmentManager, supportFragmentManager);
            hhn0.a aVar = new hhn0.a();
            String stringExtra = getIntent().getStringExtra("sectionId");
            Bundle bundle2 = aVar.a;
            bundle2.putString("sectionId", stringExtra);
            Object invoke = aVar.b.invoke();
            ((wo6) invoke).setArguments(bundle2);
            b.f(R.id.vk_miniapp_container_id, (Fragment) invoke, "catalog", 1);
            b.k(true);
        }
    }
}
