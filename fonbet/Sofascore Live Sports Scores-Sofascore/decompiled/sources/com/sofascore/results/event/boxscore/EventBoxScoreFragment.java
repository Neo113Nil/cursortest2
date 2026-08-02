package com.sofascore.results.event.boxscore;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.n;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.common.widget.NestedCoordinatorLayout;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.Sports;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a22;
import defpackage.a5f;
import defpackage.a70;
import defpackage.ao2;
import defpackage.b0i;
import defpackage.c75;
import defpackage.duf;
import defpackage.fi5;
import defpackage.fuf;
import defpackage.g5k;
import defpackage.hf9;
import defpackage.hv5;
import defpackage.ip1;
import defpackage.j63;
import defpackage.j92;
import defpackage.joa;
import defpackage.k13;
import defpackage.k43;
import defpackage.km5;
import defpackage.krk;
import defpackage.kv5;
import defpackage.m22;
import defpackage.mqi;
import defpackage.mr5;
import defpackage.nh3;
import defpackage.nq8;
import defpackage.nt5;
import defpackage.o12;
import defpackage.ok3;
import defpackage.ot5;
import defpackage.otk;
import defpackage.p12;
import defpackage.p24;
import defpackage.pd0;
import defpackage.pt5;
import defpackage.qt5;
import defpackage.qwk;
import defpackage.r8;
import defpackage.r82;
import defpackage.rq3;
import defpackage.rt5;
import defpackage.tt5;
import defpackage.u6b;
import defpackage.u71;
import defpackage.uic;
import defpackage.un0;
import defpackage.waa;
import defpackage.wt;
import defpackage.wyh;
import defpackage.xh;
import defpackage.xq5;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yzc;
import defpackage.z1;
import defpackage.z12;
import defpackage.z8e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/boxscore/EventBoxScoreFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "La22;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventBoxScoreFragment extends Hilt_EventBoxScoreFragment<a22> {
    public boolean A;
    public final mqi B;
    public final rt5 C;
    public final otk r;
    public final otk s;
    public final yzc t;
    public final yzc u;
    public final joa v;
    public final mqi w;
    public final LinkedHashMap x;
    public m22 y;
    public boolean z;

    public EventBoxScoreFragment() {
        fuf fufVar = duf.a;
        int i = 1;
        int i2 = 2;
        this.r = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new tt5(this, 0), new tt5(this, i2), new tt5(this, i));
        tt5 tt5Var = new tt5(this, 3);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new j63(tt5Var, 22));
        this.s = new otk(fufVar.getOrCreateKotlinClass(kv5.class), new p24(a, 21), new fi5(this, a, i2), new p24(a, 22));
        yzc yzcVar = new yzc(new hf9());
        this.t = yzcVar;
        this.u = yzcVar;
        this.v = ypa.a(ysaVar, new pt5(this, i));
        this.w = ypa.b(new pt5(this, i2));
        this.x = new LinkedHashMap();
        this.B = ypa.b(new qt5(0));
        this.C = new rt5(this);
    }

    public final void C(RecyclerView recyclerView) {
        HashMap hashMap;
        n layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        LinkedHashMap linkedHashMap = this.x;
        Iterator it = linkedHashMap.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                z12 z12Var = (z12) it.next();
                int i = z12Var.b;
                m22 m22Var = z12Var.a;
                if (i <= findFirstVisibleItemPosition && z12Var.c >= findFirstVisibleItemPosition && computeVerticalScrollOffset != 0) {
                    krk krkVar = this.l;
                    krkVar.getClass();
                    if (((a22) krkVar).e.getChildCount() == 0) {
                        View view = (View) linkedHashMap.get(z12Var);
                        if (view != null) {
                            hf9 hf9Var = (hf9) this.u.d();
                            Integer num = (hf9Var == null || (hashMap = hf9Var.d) == null) ? null : (Integer) hashMap.get(m22Var.a);
                            if (num != null) {
                                int intValue = num.intValue();
                                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) p12.a(view).g;
                                if (scrollInterceptorHorizontalScrollView.getScrollX() != intValue) {
                                    t(scrollInterceptorHorizontalScrollView, new r82(25, scrollInterceptorHorizontalScrollView, num));
                                }
                            }
                            krk krkVar2 = this.l;
                            krkVar2.getClass();
                            ((a22) krkVar2).e.addView(view);
                        }
                        this.y = m22Var;
                    }
                }
            } else {
                krk krkVar3 = this.l;
                krkVar3.getClass();
                if (((a22) krkVar3).e.getChildCount() != 0) {
                    krk krkVar4 = this.l;
                    krkVar4.getClass();
                    ((a22) krkVar4).e.removeAllViews();
                }
            }
        }
        krk krkVar5 = this.l;
        krkVar5.getClass();
        FrameLayout frameLayout = ((a22) krkVar5).e;
        krk krkVar6 = this.l;
        krkVar6.getClass();
        frameLayout.setVisibility(((a22) krkVar6).e.getChildCount() != 0 ? 0 : 8);
    }

    public final int D() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        Context requireContext = requireContext();
        requireContext.getClass();
        int s = ao2.s(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, requireContext);
        int dimensionPixelSize = requireContext().getResources().getDimensionPixelSize(R.dimen.sort_lineups_column_width);
        String s2 = ok3.s(E());
        s2.getClass();
        int i2 = Intrinsics.c(s2, Sports.VOLLEYBALL) ? 4 : 3;
        int i3 = 7;
        while (i - (i3 * dimensionPixelSize) < s) {
            if (i3 == i2) {
                String s3 = ok3.s(E());
                s3.getClass();
                return Intrinsics.c(s3, Sports.VOLLEYBALL) ? 4 : 3;
            }
            i3--;
        }
        return i3;
    }

    public final Event E() {
        Object d = ((mr5) this.r.getValue()).v.d();
        if (d != null) {
            return (Event) d;
        }
        a70.r("Required value was null.");
        return null;
    }

    public final o12 F() {
        return (o12) this.v.getValue();
    }

    public final kv5 G() {
        return (kv5) this.s.getValue();
    }

    public final boolean H() {
        return Intrinsics.c(ok3.s(E()), Sports.BASEBALL);
    }

    public final void I(List list) {
        LinkedHashMap linkedHashMap = this.x;
        linkedHashMap.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z12 z12Var = (z12) it.next();
            p12 a = p12.a(LayoutInflater.from(getContext()).inflate(R.layout.box_score_category_item, (ViewGroup) null, false));
            m22 m22Var = z12Var.a;
            String s = ok3.s(E());
            s.getClass();
            int i = 1;
            pd0.j(a, m22Var, s.equals(Sports.VOLLEYBALL) ? 4 : 3, !Intrinsics.c(ok3.s(E()), Sports.VOLLEYBALL), (Intrinsics.c(ok3.s(E()), Sports.VOLLEYBALL) || H()) ? Integer.valueOf(R.string.legend) : null, this.t, new k43(1, this, EventBoxScoreFragment.class, "showBoxScoreLegend", "showBoxScoreLegend(Ljava/lang/String;)V", 0, 17), new nt5(this, i));
            linkedHashMap.put(z12Var, (ConstraintLayout) a.b);
        }
    }

    public final void K(boolean z) {
        List c;
        if (Intrinsics.c(ok3.s(E()), Sports.VOLLEYBALL) || H()) {
            if (H()) {
                c = u71.h;
            } else if (Intrinsics.c(ok3.s(E()), Sports.VOLLEYBALL) && z) {
                hv5 hv5Var = (hv5) G().s.d();
                c = hv5Var != null ? hv5Var.b : null;
                if (c == null) {
                    c = km5.a;
                }
            } else {
                c = a.c(qwk.e);
            }
            krk krkVar = this.l;
            krkVar.getClass();
            g5k g5kVar = new g5k(((a22) krkVar).h);
            ArrayList arrayList = new ArrayList(k13.r(c, 10));
            Iterator it = c.iterator();
            while (it.hasNext()) {
                arrayList.add(getString(((b0i) it.next()).g()));
            }
            g5kVar.a = arrayList;
            g5kVar.m = new wt(2, this, c);
            g5kVar.j = true;
            g5kVar.b();
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.box_score_fragment_layout, (ViewGroup) null, false);
        int i = R.id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) nq8.B(R.id.app_bar, inflate);
        if (appBarLayout != null) {
            i = R.id.box_score_appearance;
            View B = nq8.B(R.id.box_score_appearance, inflate);
            if (B != null) {
                c75 a = c75.a(B);
                i = R.id.coordinator_layout;
                if (((NestedCoordinatorLayout) nq8.B(R.id.coordinator_layout, inflate)) != null) {
                    i = R.id.empty_state;
                    GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.empty_state, inflate);
                    if (graphicLarge != null) {
                        i = R.id.floating_header_container;
                        FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.floating_header_container, inflate);
                        if (frameLayout != null) {
                            i = R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                            if (recyclerView != null) {
                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                                i = R.id.section_selector;
                                TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.section_selector, inflate);
                                if (typeHeaderView != null) {
                                    i = R.id.team_selector;
                                    SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.team_selector, inflate);
                                    if (segmentedButtonsView != null) {
                                        return new a22(swipeRefreshLayout, appBarLayout, a, graphicLarge, frameLayout, recyclerView, swipeRefreshLayout, typeHeaderView, segmentedButtonsView);
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

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        kv5 G = G();
        int D = D();
        if (G.o != D) {
            G.o = D;
            int i = G.p;
            if (!G.m) {
                Event event = G.f;
                if (event == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                String s = ok3.s(event);
                s.getClass();
                D = s.equals(Sports.VOLLEYBALL) ? 4 : 3;
            }
            G.p = D;
            if (D == i) {
                G.o(false);
            } else if (G.n(D)) {
                G.u();
            } else {
                G.o(true);
            }
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "BoxScoreTab";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010a  */
    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(View view, Bundle bundle) {
        boolean z;
        SharedPreferences d;
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((a22) krkVar).g;
        swipeRefreshLayout.getClass();
        rq3 rq3Var = null;
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        int i = 1;
        ((a22) krkVar2).b.a(new xq5(this, i));
        krk krkVar3 = this.l;
        krkVar3.getClass();
        int i2 = 0;
        ((a22) krkVar3).f.setAdapter(new nh3(new l[]{F(), (xh) this.w.getValue()}));
        krk krkVar4 = this.l;
        krkVar4.getClass();
        RecyclerView recyclerView = ((a22) krkVar4).f;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        recyclerView.addOnScrollListener(this.C);
        o12 F = F();
        ot5 ot5Var = new ot5(this, i2);
        F.getClass();
        F.a.d = ot5Var;
        xh xhVar = (xh) this.w.getValue();
        ot5 ot5Var2 = new ot5(this, i);
        xhVar.getClass();
        xhVar.a.d = ot5Var2;
        krk krkVar5 = this.l;
        krkVar5.getClass();
        ConstraintLayout constraintLayout = ((a22) krkVar5).c.a;
        constraintLayout.getClass();
        constraintLayout.setVisibility(8);
        kv5 G = G();
        int D = D();
        Event E = E();
        G.f = E;
        if (!Intrinsics.c(E.getSportSlug(), Sports.BASEBALL)) {
            Context i3 = G.i();
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = i3.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
            if (!sharedPreferences.getBoolean("LINEUPS_VIEW_MODE_LONG", false)) {
                z = false;
                G.m = z;
                G.o = D;
                int i4 = 4;
                int i5 = 3;
                if (!z) {
                    String s = ok3.s(E);
                    s.getClass();
                    D = s.equals(Sports.VOLLEYBALL) ? 4 : 3;
                }
                G.p = D;
                if (!Intrinsics.c(E.getSportSlug(), Sports.VOLLEYBALL)) {
                    G.r.j(new hv5(true, null, null));
                }
                z8e.y(this, G().w, new ip1(this, rq3Var, 12));
                kv5 G2 = G();
                u6b viewLifecycleOwner = getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                G2.g(viewLifecycleOwner, new pt5(this, i2));
                G().s.e(getViewLifecycleOwner(), new z1(8, new nt5(this, i5)));
                G().u.e(getViewLifecycleOwner(), new z1(8, new nt5(this, i4)));
                krk krkVar6 = this.l;
                krkVar6.getClass();
                ((a22) krkVar6).e.addOnLayoutChangeListener(new r8(this, 3));
                waa.w(this.u).e(getViewLifecycleOwner(), new z1(8, new nt5(this, 5)));
            }
        }
        z = true;
        G.m = z;
        G.o = D;
        int i42 = 4;
        int i52 = 3;
        if (!z) {
        }
        G.p = D;
        if (!Intrinsics.c(E.getSportSlug(), Sports.VOLLEYBALL)) {
        }
        z8e.y(this, G().w, new ip1(this, rq3Var, 12));
        kv5 G22 = G();
        u6b viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        G22.g(viewLifecycleOwner2, new pt5(this, i2));
        G().s.e(getViewLifecycleOwner(), new z1(8, new nt5(this, i52)));
        G().u.e(getViewLifecycleOwner(), new z1(8, new nt5(this, i42)));
        krk krkVar62 = this.l;
        krkVar62.getClass();
        ((a22) krkVar62).e.addOnLayoutChangeListener(new r8(this, 3));
        waa.w(this.u).e(getViewLifecycleOwner(), new z1(8, new nt5(this, 5)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        kv5 G = G();
        int i = 1;
        boolean z = G().s.d() != null;
        rq3 rq3Var = null;
        if (G.l == null) {
            Set set = wyh.a;
            Event event = G.f;
            if (event == null) {
                Intrinsics.i("event");
                throw null;
            }
            G.l = wyh.g(ok3.s(event)) ? TeamSelection.Combined : TeamSelection.First;
        }
        xw3.L(un0.z(G), null, null, new j92(G, z, rq3Var, i), 3);
    }
}
