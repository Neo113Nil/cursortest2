package com.sofascore.results.fantasy.competition;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.components.view.FantasyNotificationsActionButton;
import defpackage.ap6;
import defpackage.bp6;
import defpackage.bti;
import defpackage.c13;
import defpackage.cp6;
import defpackage.do7;
import defpackage.dsi;
import defpackage.duf;
import defpackage.ev6;
import defpackage.fuf;
import defpackage.gp6;
import defpackage.gz8;
import defpackage.hp6;
import defpackage.ip6;
import defpackage.joa;
import defpackage.jp6;
import defpackage.k50;
import defpackage.lq2;
import defpackage.mkj;
import defpackage.mp1;
import defpackage.otk;
import defpackage.q5a;
import defpackage.rfi;
import defpackage.rq3;
import defpackage.un0;
import defpackage.wj0;
import defpackage.wzb;
import defpackage.x16;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/fantasy/competition/FantasyCompetitionActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "Llq2;", "<init>", "()V", "mx9", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyCompetitionActivity extends Hilt_FantasyCompetitionActivity implements lq2 {
    public static final /* synthetic */ int R = 0;
    public final joa K;
    public final joa L;
    public final otk M;
    public final otk N;
    public jp6 O;
    public boolean P;
    public MenuItem Q;

    public FantasyCompetitionActivity() {
        int i = 0;
        ap6 ap6Var = new ap6(this, i);
        ysa ysaVar = ysa.c;
        this.K = ypa.a(ysaVar, ap6Var);
        int i2 = 1;
        this.L = ypa.a(ysaVar, new ap6(this, i2));
        cp6 cp6Var = new cp6(this, i);
        fuf fufVar = duf.a;
        int i3 = 2;
        this.M = new otk(fufVar.getOrCreateKotlinClass(hp6.class), new cp6(this, i2), cp6Var, new cp6(this, i3));
        this.N = new otk(fufVar.getOrCreateKotlinClass(dsi.class), new cp6(this, 4), new cp6(this, 3), new cp6(this, 5));
        new ap6(this, i3);
        this.P = true;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        hp6 S = S();
        xw3.L(un0.z(S), null, null, new gp6(S, null, 1), 3);
    }

    public final bti Q() {
        return (bti) this.K.getValue();
    }

    public final mkj R() {
        return (mkj) this.L.getValue();
    }

    public final hp6 S() {
        return (hp6) this.M.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        FantasyCompetitionType fantasyCompetitionType;
        super.onCreate(bundle);
        setContentView(Q().a);
        do7 do7Var = (do7) S().i.a.getValue();
        rq3 rq3Var = null;
        this.x.b = (do7Var == null || (fantasyCompetitionType = do7Var.c.d) == null) ? null : fantasyCompetitionType.getAnalyticsName();
        Bundle extras = getIntent().getExtras();
        ip6 ip6Var = extras != null ? (ip6) gz8.M(extras, "FANTASY_INITIAL_TAB", ip6.class) : null;
        int i = 0;
        Q().d.removeViewAt(0);
        Q().d.addView(R().a, 0);
        mkj R2 = R();
        UnderlinedToolbar underlinedToolbar = R2.a;
        underlinedToolbar.getClass();
        ViewGroup.LayoutParams layoutParams = underlinedToolbar.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams");
            return;
        }
        c13 c13Var = (c13) layoutParams;
        ((FrameLayout.LayoutParams) c13Var).height = wzb.b(getResources().getDimension(R.dimen.tab_height));
        ((FrameLayout.LayoutParams) c13Var).width = -1;
        c13Var.a = 1;
        underlinedToolbar.setLayoutParams(c13Var);
        R2.a.setBackground(null);
        H(R().a);
        Q().g.setSelectedTabIndicatorColor(getColor(R.color.on_color_primary));
        this.o = Q().f;
        q5a.H(this, Q().g, Q().i, new x16(this, 6), new rfi(14));
        z8e.x(this, new wj0(S().i, 3), new k50(this, ip6Var, rq3Var, 5));
        z8e.x(this, S().m, new bp6(this, rq3Var, i));
        z8e.x(this, S().u, new bp6(this, rq3Var, 1));
        z8e.x(this, S().k, new mp1(this, rq3Var, 2));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        View actionView;
        FantasyNotificationsActionButton fantasyNotificationsActionButton;
        menu.getClass();
        getMenuInflater().inflate(R.menu.menu_fantasy_competition, menu);
        this.Q = menu.findItem(R.id.bell_button);
        hp6 S = S();
        do7 do7Var = S.f;
        Integer valueOf = do7Var != null ? Integer.valueOf(do7Var.c.c) : S.g;
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            MenuItem menuItem = this.Q;
            if (menuItem != null && (actionView = menuItem.getActionView()) != null && (fantasyNotificationsActionButton = (FantasyNotificationsActionButton) actionView.findViewById(R.id.notifications_button)) != null) {
                fantasyNotificationsActionButton.a = Integer.valueOf(intValue);
                fantasyNotificationsActionButton.d(intValue);
            }
        }
        do7 do7Var2 = (do7) S().i.a.getValue();
        if (do7Var2 != null) {
            ev6 ev6Var = do7Var2.c;
            MenuItem menuItem2 = this.Q;
            if (menuItem2 != null) {
                menuItem2.setVisible(!ev6Var.w);
            }
        }
        return true;
    }

    @Override // com.sofascore.results.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getOnBackPressedDispatcher().c();
        return true;
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "FantasyCompetitionScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    /* renamed from: v */
    public final boolean getL() {
        return false;
    }

    @Override // defpackage.lq2
    public final void a() {
    }

    @Override // defpackage.lq2
    public final void b() {
    }

    @Override // defpackage.lq2
    public final void c() {
    }
}
