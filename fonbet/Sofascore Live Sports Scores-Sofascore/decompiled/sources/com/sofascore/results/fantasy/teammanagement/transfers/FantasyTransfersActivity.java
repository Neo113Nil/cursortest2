package com.sofascore.results.fantasy.teammanagement.transfers;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.teammanagement.transfers.FantasyTransfersActivity;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;
import defpackage.ao7;
import defpackage.db;
import defpackage.dd;
import defpackage.ev6;
import defpackage.f5p;
import defpackage.ho7;
import defpackage.hpo;
import defpackage.i6d;
import defpackage.joa;
import defpackage.k7d;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.px0;
import defpackage.q7d;
import defpackage.qa7;
import defpackage.rq3;
import defpackage.ty0;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z3f;
import defpackage.z8e;
import java.io.Serializable;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/fantasy/teammanagement/transfers/FantasyTransfersActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "u6h", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyTransfersActivity extends Hilt_FantasyTransfersActivity {
    public static final /* synthetic */ int Q = 0;
    public dd K;
    public NavHostFragment L;
    public k7d M;
    public final joa N;
    public final joa O;
    public final mqi P;

    public FantasyTransfersActivity() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: ym7
            public final /* synthetic */ FantasyTransfersActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FantasyTransfersActivity fantasyTransfersActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = FantasyTransfersActivity.Q;
                        Intent intent = fantasyTransfersActivity.getIntent();
                        intent.getClass();
                        Serializable y = g7a.y(intent, "competition", ev6.class);
                        if (y != null) {
                            return (ev6) y;
                        }
                        a70.p("Serializable competition not found");
                        return null;
                    case 1:
                        int i4 = FantasyTransfersActivity.Q;
                        Intent intent2 = fantasyTransfersActivity.getIntent();
                        intent2.getClass();
                        Serializable y2 = g7a.y(intent2, "gameweek", ho7.class);
                        if (y2 != null) {
                            return (ho7) y2;
                        }
                        a70.p("Serializable gameweek not found");
                        return null;
                    default:
                        k7d k7dVar = fantasyTransfersActivity.M;
                        if (k7dVar == null) {
                            Intrinsics.i("navController");
                            throw null;
                        }
                        k6d k6dVar = k7dVar.b;
                        if (k6dVar.o == null) {
                            a70.r("You must call setViewModelStore() before calling getViewModelStoreOwner().");
                            return null;
                        }
                        d6d e = k6dVar.e(R.id.nav_graph_transfers);
                        if (!(e.b instanceof g7d)) {
                            a70.p("No NavGraph with ID 2131364473 is on the NavController's back stack");
                            return null;
                        }
                        qtk defaultViewModelProviderFactory = fantasyTransfersActivity.getDefaultViewModelProviderFactory();
                        stk viewModelStore = e.getViewModelStore();
                        ly3 r = ufa.r(e);
                        r.getClass();
                        g7h g7hVar = new g7h(viewModelStore, defaultViewModelProviderFactory, r);
                        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(ao7.class);
                        orCreateKotlinClass.getClass();
                        String qualifiedName = orCreateKotlinClass.getQualifiedName();
                        if (qualifiedName != null) {
                            return (ao7) g7hVar.u("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
                        }
                        a70.p("Local and anonymous classes can not be ViewModels");
                        return null;
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.N = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.O = ypa.a(ysaVar, new Function0(this) { // from class: ym7
            public final /* synthetic */ FantasyTransfersActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FantasyTransfersActivity fantasyTransfersActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = FantasyTransfersActivity.Q;
                        Intent intent = fantasyTransfersActivity.getIntent();
                        intent.getClass();
                        Serializable y = g7a.y(intent, "competition", ev6.class);
                        if (y != null) {
                            return (ev6) y;
                        }
                        a70.p("Serializable competition not found");
                        return null;
                    case 1:
                        int i4 = FantasyTransfersActivity.Q;
                        Intent intent2 = fantasyTransfersActivity.getIntent();
                        intent2.getClass();
                        Serializable y2 = g7a.y(intent2, "gameweek", ho7.class);
                        if (y2 != null) {
                            return (ho7) y2;
                        }
                        a70.p("Serializable gameweek not found");
                        return null;
                    default:
                        k7d k7dVar = fantasyTransfersActivity.M;
                        if (k7dVar == null) {
                            Intrinsics.i("navController");
                            throw null;
                        }
                        k6d k6dVar = k7dVar.b;
                        if (k6dVar.o == null) {
                            a70.r("You must call setViewModelStore() before calling getViewModelStoreOwner().");
                            return null;
                        }
                        d6d e = k6dVar.e(R.id.nav_graph_transfers);
                        if (!(e.b instanceof g7d)) {
                            a70.p("No NavGraph with ID 2131364473 is on the NavController's back stack");
                            return null;
                        }
                        qtk defaultViewModelProviderFactory = fantasyTransfersActivity.getDefaultViewModelProviderFactory();
                        stk viewModelStore = e.getViewModelStore();
                        ly3 r = ufa.r(e);
                        r.getClass();
                        g7h g7hVar = new g7h(viewModelStore, defaultViewModelProviderFactory, r);
                        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(ao7.class);
                        orCreateKotlinClass.getClass();
                        String qualifiedName = orCreateKotlinClass.getQualifiedName();
                        if (qualifiedName != null) {
                            return (ao7) g7hVar.u("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
                        }
                        a70.p("Local and anonymous classes can not be ViewModels");
                        return null;
                }
            }
        });
        final int i3 = 2;
        this.P = ypa.b(new Function0(this) { // from class: ym7
            public final /* synthetic */ FantasyTransfersActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FantasyTransfersActivity fantasyTransfersActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = FantasyTransfersActivity.Q;
                        Intent intent = fantasyTransfersActivity.getIntent();
                        intent.getClass();
                        Serializable y = g7a.y(intent, "competition", ev6.class);
                        if (y != null) {
                            return (ev6) y;
                        }
                        a70.p("Serializable competition not found");
                        return null;
                    case 1:
                        int i4 = FantasyTransfersActivity.Q;
                        Intent intent2 = fantasyTransfersActivity.getIntent();
                        intent2.getClass();
                        Serializable y2 = g7a.y(intent2, "gameweek", ho7.class);
                        if (y2 != null) {
                            return (ho7) y2;
                        }
                        a70.p("Serializable gameweek not found");
                        return null;
                    default:
                        k7d k7dVar = fantasyTransfersActivity.M;
                        if (k7dVar == null) {
                            Intrinsics.i("navController");
                            throw null;
                        }
                        k6d k6dVar = k7dVar.b;
                        if (k6dVar.o == null) {
                            a70.r("You must call setViewModelStore() before calling getViewModelStoreOwner().");
                            return null;
                        }
                        d6d e = k6dVar.e(R.id.nav_graph_transfers);
                        if (!(e.b instanceof g7d)) {
                            a70.p("No NavGraph with ID 2131364473 is on the NavController's back stack");
                            return null;
                        }
                        qtk defaultViewModelProviderFactory = fantasyTransfersActivity.getDefaultViewModelProviderFactory();
                        stk viewModelStore = e.getViewModelStore();
                        ly3 r = ufa.r(e);
                        r.getClass();
                        g7h g7hVar = new g7h(viewModelStore, defaultViewModelProviderFactory, r);
                        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(ao7.class);
                        orCreateKotlinClass.getClass();
                        String qualifiedName = orCreateKotlinClass.getQualifiedName();
                        if (qualifiedName != null) {
                            return (ao7) g7hVar.u("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
                        }
                        a70.p("Local and anonymous classes can not be ViewModels");
                        return null;
                }
            }
        });
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getOnBackPressedDispatcher().a(this, new px0(4, this, false));
        rq3 rq3Var = null;
        View inflate = getLayoutInflater().inflate(R.layout.activity_fantasy_team_management, (ViewGroup) null, false);
        int i = R.id.app_bar_layout;
        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar_layout, inflate);
        if (toolbarBackgroundAppBarLayout != null) {
            i = R.id.collapsing_toolbar;
            if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate)) != null) {
                i = R.id.nav_host_fragment;
                if (((FragmentContainerView) nq8.B(R.id.nav_host_fragment, inflate)) != null) {
                    View B = nq8.B(R.id.toolbar, inflate);
                    if (B != null) {
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                        this.K = new dd(coordinatorLayout, toolbarBackgroundAppBarLayout, z3f.b(B), 0);
                        setContentView(coordinatorLayout);
                        dd ddVar = this.K;
                        if (ddVar == null) {
                            Intrinsics.i("binding");
                            throw null;
                        }
                        H((UnderlinedToolbar) ((z3f) ddVar.d).c);
                        dd ddVar2 = this.K;
                        if (ddVar2 == null) {
                            Intrinsics.i("binding");
                            throw null;
                        }
                        z3f z3fVar = (z3f) ddVar2.d;
                        String string = getString(R.string.transfers);
                        joa joaVar = this.O;
                        AbstractActivity.M(this, z3fVar, string, f5p.B(this, ((ho7) joaVar.getValue()).a.c, ((ho7) joaVar.getValue()).a.b), null, 40);
                        dd ddVar3 = this.K;
                        if (ddVar3 == null) {
                            Intrinsics.i("binding");
                            throw null;
                        }
                        ((UnderlinedToolbar) ((z3f) ddVar3.d).c).setBackground(null);
                        dd ddVar4 = this.K;
                        if (ddVar4 == null) {
                            Intrinsics.i("binding");
                            throw null;
                        }
                        ((ToolbarBackgroundAppBarLayout) ddVar4.c).setBackground(new ty0(((ev6) this.N.getValue()).a));
                        Fragment E = k().E(R.id.nav_host_fragment);
                        E.getClass();
                        NavHostFragment navHostFragment = (NavHostFragment) E;
                        this.L = navHostFragment;
                        k7d j = navHostFragment.j();
                        this.M = j;
                        if (j == null) {
                            Intrinsics.i("navController");
                            throw null;
                        }
                        j.b.r(((q7d) j.h.getValue()).b(R.navigation.nav_graph_squad_transfers), getIntent().getExtras());
                        hpo hpoVar = new hpo(new HashSet());
                        k7d k7dVar = this.M;
                        if (k7dVar == null) {
                            Intrinsics.i("navController");
                            throw null;
                        }
                        k7dVar.a(new db(this, hpoVar));
                        k7d k7dVar2 = this.M;
                        if (k7dVar2 == null) {
                            Intrinsics.i("navController");
                            throw null;
                        }
                        k7dVar2.a(new i6d() { // from class: xm7
                            @Override // defpackage.i6d
                            public final void a(k7d k7dVar3, s6d s6dVar, Bundle bundle2) {
                                int i2 = FantasyTransfersActivity.Q;
                                s6dVar.getClass();
                                dd ddVar5 = FantasyTransfersActivity.this.K;
                                if (ddVar5 != null) {
                                    ((UnderlinedToolbar) ((z3f) ddVar5.d).c).setNavigationIcon(R.drawable.ic_arrow_back);
                                } else {
                                    Intrinsics.i("binding");
                                    throw null;
                                }
                            }
                        });
                        z8e.x(this, ((ao7) this.P.getValue()).q, new qa7(this, rq3Var, 6));
                        return;
                    }
                    i = R.id.toolbar;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
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
        return "FantasyTransfersScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
