package com.vk.tabbar.settings.impl.suggests;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.core.ui.themes.VKTheme;
import com.vk.metrics.eventtracking.b;
import com.vk.tabbar.core.api.domain.TabbarState;
import com.vk.tabbar.settings.api.di.TabbarSettingsComponent;
import com.vkontakte.android.R;
import xsna.d3n0;
import xsna.dhr0;
import xsna.e3m;
import xsna.fpf0;
import xsna.jai;
import xsna.k7m;
import xsna.m7m;
import xsna.mnh0;
import xsna.mun0;
import xsna.rv7;
import xsna.v8i;
import xsna.w8i;
import xsna.wwn0;

/* compiled from: TabbarSuggestActivity.kt */
/* loaded from: classes6.dex */
public final class TabbarSuggestActivity extends AppCompatActivity implements w8i, dhr0.e {
    public static final /* synthetic */ int h = 0;
    public final wwn0 f = ((TabbarSettingsComponent) ((k7m) m7m.f(this)).a(fpf0.a(TabbarSettingsComponent.class))).c1();
    public final mun0 g = ((TabbarSettingsComponent) ((k7m) m7m.f(this)).a(fpf0.a(TabbarSettingsComponent.class))).wc();

    /* compiled from: TabbarSuggestActivity.kt */
    public static final class a {
        public static Intent a(Context context, int i, TabbarState tabbarState) {
            Intent intent = new Intent(context, (Class<?>) TabbarSuggestActivity.class);
            intent.putExtra("current_tab", i);
            intent.putExtra("suggest_tabbar", tabbarState);
            return intent;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        int intExtra = getIntent().getIntExtra("current_tab", 0);
        TabbarState tabbarState = (TabbarState) getIntent().getParcelableExtra("suggest_tabbar");
        wwn0 wwn0Var = this.f;
        d3n0 a2 = wwn0Var.a(intExtra, tabbarState);
        if (a2 == null) {
            b.a.a(new IllegalStateException("Suggest info can't be parsed due to illegal params"));
            finish();
            return;
        }
        dhr0.u0(getWindow(), NavigationBarStyle.DYNAMIC);
        mnh0.y(e3m.f(R.attr.vk_ui_header_background, this), this);
        dhr0.f(this);
        v8i.a(this, new jai(-1739120846, new rv7(9, a2, this), true));
        this.g.b(a2.e, a2.a, a2.c, a2.g);
        wwn0Var.b();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        dhr0.a.getClass();
        dhr0.X(this);
        super.onDestroy();
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        dhr0.u0(getWindow(), NavigationBarStyle.DYNAMIC);
        mnh0.y(e3m.f(R.attr.vk_ui_header_background, this), this);
    }
}
