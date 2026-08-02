package com.sofascore.results.league.fragment.cuptree;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.appsflyer.internal.i;
import com.sofascore.model.Sports;
import com.sofascore.model.cuptree.CupTree;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.league.view.cuptree.CupTreeExtendedView;
import com.sofascore.results.league.view.cuptree.ExpandButton;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.view.CupTreeView;
import defpackage.bsk;
import defpackage.co8;
import defpackage.du1;
import defpackage.duf;
import defpackage.e1d;
import defpackage.e6b;
import defpackage.eoh;
import defpackage.i21;
import defpackage.j01;
import defpackage.j58;
import defpackage.joa;
import defpackage.k0;
import defpackage.km5;
import defpackage.krk;
import defpackage.n84;
import defpackage.nq8;
import defpackage.o3a;
import defpackage.otk;
import defpackage.px0;
import defpackage.q8g;
import defpackage.rq3;
import defpackage.s02;
import defpackage.srk;
import defpackage.t21;
import defpackage.t62;
import defpackage.tc3;
import defpackage.tgj;
import defpackage.u6b;
import defpackage.un0;
import defpackage.w1;
import defpackage.x1;
import defpackage.xw3;
import defpackage.y1;
import defpackage.y7;
import defpackage.yea;
import defpackage.yhk;
import defpackage.yid;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/league/fragment/cuptree/BaseCupTreeFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lco8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseCupTreeFragment extends AbstractFragment<co8> {
    public final otk m;
    public final q8g n;
    public boolean o;
    public MenuItem p;
    public String q;
    public final e1d r;
    public final e1d s;
    public final px0 t;
    public final i21 u;

    public BaseCupTreeFragment() {
        joa a = ypa.a(ysa.c, new w1(new w1(this, 10), 11));
        this.m = new otk(duf.a.getOrCreateKotlinClass(n84.class), new x1(a, 5), new y1(7, this, a), new x1(a, 6));
        this.n = q8g.CARD;
        this.o = true;
        this.r = e.f(km5.a);
        this.s = e.f(null);
        this.t = new px0(this, 1);
        this.u = new i21(this, 0);
    }

    public final List A() {
        return (List) ((eoh) this.r).getValue();
    }

    public boolean B() {
        return false;
    }

    public boolean C() {
        return false;
    }

    public Integer D() {
        return null;
    }

    public Integer E() {
        return null;
    }

    /* renamed from: F, reason: from getter */
    public q8g getN() {
        return this.n;
    }

    public abstract Season G();

    public abstract Tournament H();

    public abstract void I(boolean z);

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (((defpackage.co8) r2).h.getVisibility() == 0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(CupTree cupTree, boolean z) {
        int i;
        MenuItem menuItem;
        MenuItem menuItem2;
        krk krkVar = this.l;
        krkVar.getClass();
        ConstraintLayout constraintLayout = ((co8) krkVar).k;
        if (A().size() <= 1) {
            int i2 = CupTreeView.q;
            if (t62.x(cupTree)) {
                int i3 = CupTreeExtendedView.p;
                if (s02.D(cupTree)) {
                    krk krkVar2 = this.l;
                    krkVar2.getClass();
                }
            }
            i = 8;
            constraintLayout.setVisibility(i);
            int i4 = CupTreeView.q;
            boolean z2 = (t62.x(cupTree) || z) ? false : true;
            menuItem = this.p;
            if (menuItem != null) {
                menuItem.setEnabled(z2);
            }
            menuItem2 = this.p;
            if (menuItem2 != null) {
                menuItem2.setVisible(z2);
            }
            krk krkVar3 = this.l;
            krkVar3.getClass();
            co8 co8Var = (co8) krkVar3;
            NestedScrollView nestedScrollView = co8Var.c;
            CoordinatorLayout coordinatorLayout = co8Var.i;
            CupTreeView cupTreeView = co8Var.d;
            if (!t62.x(cupTree) && !z) {
                if (nestedScrollView.getVisibility() != 0) {
                    nestedScrollView.setVisibility(0);
                    tgj.p(nestedScrollView, 0L, 3);
                    tgj.q(coordinatorLayout, null, 15);
                }
                cupTreeView.setCupTrees(a.c(cupTree));
                return;
            }
            int i5 = CupTreeExtendedView.p;
            if (s02.D(cupTree)) {
                cupTreeView.setCupTrees(a.c(cupTree));
                if (nestedScrollView.getVisibility() == 0) {
                    return;
                }
                nestedScrollView.setVisibility(0);
                tgj.p(nestedScrollView, 0L, 3);
                tgj.q(coordinatorLayout, null, 15);
                return;
            }
            CupTreeExtendedView cupTreeExtendedView = co8Var.e;
            String sportSlug = H().getSportSlug();
            Integer F = o3a.F(H());
            Season G = G();
            cupTreeExtendedView.o(cupTree, sportSlug, F, G != null ? G.getName() : null, B(), A().size() <= 1 ? this.u : null);
            if (coordinatorLayout.getVisibility() == 0) {
                return;
            }
            coordinatorLayout.setVisibility(8);
            tgj.q(nestedScrollView, null, 15);
            tgj.p(coordinatorLayout, 0L, 3);
            return;
        }
        i = 0;
        constraintLayout.setVisibility(i);
        int i42 = CupTreeView.q;
        if (t62.x(cupTree)) {
        }
        menuItem = this.p;
        if (menuItem != null) {
        }
        menuItem2 = this.p;
        if (menuItem2 != null) {
        }
        krk krkVar32 = this.l;
        krkVar32.getClass();
        co8 co8Var2 = (co8) krkVar32;
        NestedScrollView nestedScrollView2 = co8Var2.c;
        CoordinatorLayout coordinatorLayout2 = co8Var2.i;
        CupTreeView cupTreeView2 = co8Var2.d;
        if (!t62.x(cupTree)) {
        }
        int i52 = CupTreeExtendedView.p;
        if (s02.D(cupTree)) {
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_cup_tree, (ViewGroup) null, false);
        int i = R.id.category_spinner;
        ComposeView composeView = (ComposeView) nq8.B(R.id.category_spinner, inflate);
        if (composeView != null) {
            i = R.id.compact_container;
            NestedScrollView nestedScrollView = (NestedScrollView) nq8.B(R.id.compact_container, inflate);
            if (nestedScrollView != null) {
                i = R.id.cup_tree_view;
                CupTreeView cupTreeView = (CupTreeView) nq8.B(R.id.cup_tree_view, inflate);
                if (cupTreeView != null) {
                    i = R.id.cup_tree_view_extended;
                    CupTreeExtendedView cupTreeExtendedView = (CupTreeExtendedView) nq8.B(R.id.cup_tree_view_extended, inflate);
                    if (cupTreeExtendedView != null) {
                        i = R.id.divider;
                        View B = nq8.B(R.id.divider, inflate);
                        if (B != null) {
                            i = R.id.expand;
                            ExpandButton expandButton = (ExpandButton) nq8.B(R.id.expand, inflate);
                            if (expandButton != null) {
                                i = R.id.expand_placeholder;
                                FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.expand_placeholder, inflate);
                                if (frameLayout != null) {
                                    i = R.id.expanded_container;
                                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) nq8.B(R.id.expanded_container, inflate);
                                    if (coordinatorLayout != null) {
                                        i = R.id.follow_button_holder;
                                        FrameLayout frameLayout2 = (FrameLayout) nq8.B(R.id.follow_button_holder, inflate);
                                        if (frameLayout2 != null) {
                                            i = R.id.spinner_container;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.spinner_container, inflate);
                                            if (constraintLayout != null) {
                                                return new co8((LinearLayout) inflate, composeView, nestedScrollView, cupTreeView, cupTreeExtendedView, B, expandButton, frameLayout, coordinatorLayout, frameLayout2, constraintLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Season G = G();
        this.q = G != null ? G.getName() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String p() {
        boolean z;
        String str;
        UniqueTournament uniqueTournament = H().getUniqueTournament();
        String str2 = null;
        Integer valueOf = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
        boolean z2 = false;
        if (Intrinsics.c(H().getSportSlug(), Sports.BASEBALL)) {
            yea yeaVar = j58.a;
            if (!CollectionsKt.R(j58.d(), valueOf)) {
                z = true;
                if (valueOf != null && valueOf.intValue() == 132) {
                    str = this.q;
                    if (str != null) {
                        Season G = G();
                        if (G != null) {
                            str2 = G.getName();
                        }
                    } else {
                        str2 = str;
                    }
                    if (str2 != null) {
                        Locale locale = Locale.US;
                        String k = i.k(locale, str2, locale);
                        if (StringsKt.J(k, "cup", false) || StringsKt.J(k, "tournament", false)) {
                            z2 = true;
                        }
                    }
                }
                return !z ? "PostseasonTab" : (Intrinsics.c(H().getCategory().getSlug(), "usa-college") || z2) ? "BracketTab" : (valueOf != null && valueOf.intValue() == 132) ? "PlayoffsTab" : (valueOf != null && valueOf.intValue() == 9464) ? "PlayoffsTab" : "CupTreeTab";
            }
        }
        z = false;
        if (valueOf != null) {
            str = this.q;
            if (str != null) {
            }
            if (str2 != null) {
            }
        }
        if (!z) {
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        FragmentActivity requireActivity = requireActivity();
        int i = 1;
        k0 k0Var = new k0(this, i);
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        requireActivity.addMenuProvider(k0Var, viewLifecycleOwner, e6b.e);
        FragmentActivity requireActivity2 = requireActivity();
        BaseActivity baseActivity = requireActivity2 instanceof BaseActivity ? (BaseActivity) requireActivity2 : null;
        if (baseActivity != null) {
            krk krkVar = this.l;
            krkVar.getClass();
            FrameLayout frameLayout = ((co8) krkVar).h;
            KProperty[] kPropertyArr = BaseActivity.H;
            j01 j01Var = new j01(frameLayout, r7, baseActivity);
            WeakHashMap weakHashMap = bsk.a;
            srk.c(frameLayout, j01Var);
        }
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((co8) krkVar2).b.setContent(new tc3(436978143, new t21(this, 11), true));
        krk krkVar3 = this.l;
        krkVar3.getClass();
        CupTreeView cupTreeView = ((co8) krkVar3).d;
        Tournament H = H();
        q8g n = getN();
        boolean B = B();
        H.getClass();
        n.getClass();
        Integer F = o3a.F(H);
        r7 = F != null ? F.intValue() : 0;
        int id = H.getId();
        cupTreeView.l = true;
        cupTreeView.m = Integer.valueOf(r7);
        cupTreeView.n = Integer.valueOf(id);
        cupTreeView.o = true;
        cupTreeView.rowStyle = n;
        cupTreeView.p = B;
        requireActivity().getOnBackPressedDispatcher().a(this, this.t);
        ((n84) this.m.getValue()).g.e(getViewLifecycleOwner(), new y7(i, new i21(this, i)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        if (this.o) {
            n84 n84Var = (n84) this.m.getValue();
            UniqueTournament uniqueTournament = H().getUniqueTournament();
            rq3 rq3Var = null;
            int m = yid.m(uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null);
            Season G = G();
            xw3.L(un0.z(n84Var), null, null, new du1(n84Var, m, yid.m(G != null ? Integer.valueOf(G.getId()) : null), rq3Var, 1), 3);
        }
    }
}
