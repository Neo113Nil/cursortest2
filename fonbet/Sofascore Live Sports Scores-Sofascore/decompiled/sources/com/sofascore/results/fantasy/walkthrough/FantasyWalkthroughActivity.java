package com.sofascore.results.fantasy.walkthrough;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.model.firebase.AdType;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.fantasy.walkthrough.createteam.FantasyWalkthroughCreateTeamFragment;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;
import defpackage.a70;
import defpackage.dmi;
import defpackage.duf;
import defpackage.ed;
import defpackage.ev6;
import defpackage.fuf;
import defpackage.g7a;
import defpackage.g9a;
import defpackage.gv9;
import defpackage.gz8;
import defpackage.k50;
import defpackage.l6g;
import defpackage.nq8;
import defpackage.otk;
import defpackage.oy0;
import defpackage.oz6;
import defpackage.qp7;
import defpackage.rq3;
import defpackage.uaa;
import defpackage.vp7;
import defpackage.vxd;
import defpackage.wo7;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z3f;
import defpackage.z8e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/walkthrough/FantasyWalkthroughActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final class FantasyWalkthroughActivity extends AbstractActivity {
    public static final /* synthetic */ int L = 0;
    public final otk J;
    public final otk K;

    public FantasyWalkthroughActivity() {
        wo7 wo7Var = new wo7(this, 0);
        fuf fufVar = duf.a;
        this.J = new otk(fufVar.getOrCreateKotlinClass(vp7.class), new wo7(this, 1), wo7Var, new wo7(this, 2));
        this.K = new otk(fufVar.getOrCreateKotlinClass(g9a.class), new wo7(this, 4), new wo7(this, 3), new wo7(this, 5));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        Serializable y = g7a.y(intent, "competition", ev6.class);
        if (y == null) {
            a70.p("Serializable competition not found");
            return;
        }
        ev6 ev6Var = (ev6) y;
        int i = 0;
        View inflate = getLayoutInflater().inflate(R.layout.activity_fantasy_walkthrough, (ViewGroup) null, false);
        int i2 = R.id.app_bar_layout;
        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar_layout, inflate);
        if (toolbarBackgroundAppBarLayout != null) {
            i2 = R.id.collapsing_toolbar;
            if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate)) != null) {
                if (((FragmentContainerView) nq8.B(R.id.container, inflate)) != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                    i2 = R.id.toolbar;
                    View B = nq8.B(R.id.toolbar, inflate);
                    if (B != null) {
                        z3f b = z3f.b(B);
                        UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) b.c;
                        ed edVar = new ed(0, toolbarBackgroundAppBarLayout, coordinatorLayout, coordinatorLayout, b);
                        setContentView(coordinatorLayout);
                        H(underlinedToolbar);
                        underlinedToolbar.setNavigationIcon(R.drawable.ic_arrow_back);
                        underlinedToolbar.setBackground(null);
                        toolbarBackgroundAppBarLayout.setBackground(new oy0());
                        AbstractActivity.M(this, b, getTitle().toString(), ev6Var.e, vxd.j(ev6Var.a, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "category/", "/image"), 24);
                        otk otkVar = this.J;
                        z8e.x(this, ((vp7) otkVar.getValue()).m, new k50(this, edVar, (rq3) null, 8));
                        ((g9a) this.K.getValue()).l(this, AdType.Interstitial.Fantasy);
                        if (bundle != null && (arrayList = (ArrayList) gz8.M(bundle, "squad", ArrayList.class)) != null) {
                            vp7 vp7Var = (vp7) otkVar.getValue();
                            qp7 k = vp7Var.k();
                            gv9 W = l6g.W(arrayList);
                            if (!arrayList.isEmpty()) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if ((((oz6) it.next()) instanceof FantasyRoundPlayerUiModel) && (i = i + 1) < 0) {
                                        b.p();
                                        throw null;
                                    }
                                }
                            }
                            vp7Var.m(qp7.a(k, W, i, false, false, null, null, 487));
                            vp7Var.n();
                        }
                        a aVar = new a(k());
                        aVar.l(R.id.container, new FantasyWalkthroughCreateTeamFragment(), null);
                        aVar.f();
                        return;
                    }
                } else {
                    i2 = R.id.container;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
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

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("squad", new ArrayList(((vp7) this.J.getValue()).k().d));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "FantasyWalkthroughScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
