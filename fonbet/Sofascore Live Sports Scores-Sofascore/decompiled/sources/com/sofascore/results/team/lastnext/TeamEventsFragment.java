package com.sofascore.results.team.lastnext;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.team.lastnext.TeamEventsFragment;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.a52;
import defpackage.ad2;
import defpackage.ao2;
import defpackage.b1d;
import defpackage.beh;
import defpackage.bte;
import defpackage.cce;
import defpackage.dq8;
import defpackage.duf;
import defpackage.dvi;
import defpackage.e6b;
import defpackage.fwi;
import defpackage.hj;
import defpackage.ioe;
import defpackage.joa;
import defpackage.jzk;
import defpackage.k53;
import defpackage.krk;
import defpackage.m1f;
import defpackage.mwi;
import defpackage.nq8;
import defpackage.nv;
import defpackage.o1i;
import defpackage.otk;
import defpackage.owi;
import defpackage.pwi;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.rwi;
import defpackage.twi;
import defpackage.u6b;
import defpackage.u6e;
import defpackage.ua0;
import defpackage.un0;
import defpackage.uri;
import defpackage.uwi;
import defpackage.wca;
import defpackage.wj0;
import defpackage.xw3;
import defpackage.xwi;
import defpackage.y21;
import defpackage.yaa;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/team/lastnext/TeamEventsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Ldq8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamEventsFragment extends Hilt_TeamEventsFragment<dq8> {
    public pwi A;
    public final otk r;
    public final joa s;
    public final joa t;
    public boolean u;
    public boolean v;
    public boolean w;
    public Integer x;
    public long y;
    public AppBarLayout z;

    public TeamEventsFragment() {
        o1i o1iVar = new o1i(this, 18);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new o1i(o1iVar, 19));
        this.r = new otk(duf.a.getOrCreateKotlinClass(xwi.class), new fwi(a, 1), new bte(this, a, 21), new fwi(a, 2));
        this.s = ypa.a(ysaVar, new owi(this, 1));
        this.t = ypa.a(ysaVar, new owi(this, 2));
        this.u = true;
        this.v = true;
    }

    public static int C(List list) {
        int i = 0;
        for (Object obj : list) {
            y21 y21Var = obj instanceof y21 ? (y21) obj : null;
            Event d = y21Var != null ? y21Var.d() : null;
            if (StatusKt.STATUS_FINISHED.equals(d != null ? d.getStatusType() : null) && d.getStartTimestamp() < yaa.w()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final jzk D() {
        return (jzk) this.s.getValue();
    }

    public final xwi E() {
        return (xwi) this.r.getValue();
    }

    public final void F(List list) {
        int C = C(list);
        krk krkVar = this.l;
        krkVar.getClass();
        RecyclerView recyclerView = ((dq8) krkVar).h;
        int size = D().g.size() + C;
        if (size < 0) {
            size = 0;
        }
        krk krkVar2 = this.l;
        krkVar2.getClass();
        int height = ((dq8) krkVar2).h.getHeight() / 2;
        n layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(size, height);
        }
    }

    public final void G() {
        Context requireContext = requireContext();
        requireContext.getClass();
        long v = yaa.v() - this.y;
        twi twiVar = (twi) E().n.a.getValue();
        nv.L(requireContext, "team_matches", v, twiVar != null ? twiVar.b : "");
    }

    public final void H() {
        Object value = E().n.a.getValue();
        twi twiVar = twi.e;
        krk krkVar = this.l;
        if (value == twiVar) {
            krkVar.getClass();
            ((dq8) krkVar).b.y(1);
            return;
        }
        krkVar.getClass();
        n layoutManager = ((dq8) krkVar).h.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        int C = C(D().i);
        int size = D().g.size() + C;
        boolean z = size > findLastVisibleItemPosition;
        boolean z2 = size < findFirstVisibleItemPosition;
        boolean z3 = C >= 0 && findFirstVisibleItemPosition != -1;
        boolean z4 = z || z2;
        if (!z3 || !z4) {
            krk krkVar2 = this.l;
            krkVar2.getClass();
            ((dq8) krkVar2).b.y(1);
            return;
        }
        Drawable drawable = requireContext().getDrawable(z ? R.drawable.ic_chevron_down_large_16 : R.drawable.ic_chevron_up_large_16);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((dq8) krkVar3).b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        ((dq8) krkVar4).b.y(0);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_team_events, (ViewGroup) null, false);
        int i = R.id.back_to_today_button;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) nq8.B(R.id.back_to_today_button, inflate);
        if (extendedFloatingActionButton != null) {
            i = R.id.calendar_compose_view;
            ComposeView composeView = (ComposeView) nq8.B(R.id.calendar_compose_view, inflate);
            if (composeView != null) {
                i = R.id.calendar_scroll_view;
                NestedScrollView nestedScrollView = (NestedScrollView) nq8.B(R.id.calendar_scroll_view, inflate);
                if (nestedScrollView != null) {
                    i = R.id.competition_filter_container;
                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.competition_filter_container, inflate);
                    if (frameLayout != null) {
                        i = R.id.competition_filter_spinner;
                        ComposeView composeView2 = (ComposeView) nq8.B(R.id.competition_filter_spinner, inflate);
                        if (composeView2 != null) {
                            i = R.id.display_mode_selector;
                            SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.display_mode_selector, inflate);
                            if (segmentedButtonsView != null) {
                                i = R.id.recycler_view;
                                RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                                if (recyclerView != null) {
                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                                    i = R.id.singles_doubles_filter;
                                    TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.singles_doubles_filter, inflate);
                                    if (typeHeaderView != null) {
                                        return new dq8(swipeRefreshLayout, extendedFloatingActionButton, composeView, nestedScrollView, frameLayout, composeView2, segmentedButtonsView, recyclerView, swipeRefreshLayout, typeHeaderView);
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
    public final void onDestroyView() {
        AppBarLayout appBarLayout;
        pwi pwiVar = this.A;
        if (pwiVar != null && (appBarLayout = this.z) != null) {
            appBarLayout.f(pwiVar);
        }
        this.A = null;
        this.z = null;
        super.onDestroyView();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        uwi uwiVar = (uwi) E().j.d();
        if (Intrinsics.c(uwiVar != null ? Boolean.valueOf(uwiVar.c) : null, Boolean.TRUE)) {
            G();
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.y = yaa.v();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "MatchesTab";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 != 0) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [pwi, ua0] */
    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(View view, Bundle bundle) {
        Integer num;
        Integer num2;
        AppBarLayout appBarLayout;
        Bundle arguments = getArguments();
        rq3 rq3Var = null;
        if (arguments != null) {
            int i = arguments.getInt("INITIAL_TOURNAMENT_ID");
            num = Integer.valueOf(i);
        }
        num = null;
        this.x = num;
        String text = E().g.getTeamColors().getText();
        if (text != null) {
            int parseColor = Color.parseColor(text);
            Context requireContext = requireContext();
            requireContext.getClass();
            num2 = Integer.valueOf(k53.f0(parseColor, requireContext));
        } else {
            num2 = null;
        }
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((dq8) krkVar).i;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, num2, null, 4);
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(a52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        int i2 = 0;
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new cce(viewLifecycleOwner, (b1d) obj, this, (rq3) null, this), 3);
        int i3 = 2;
        u6e u6eVar = new u6e(D(), false, new uri(this, i3));
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((dq8) krkVar2).h;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), ao2.s(4, requireContext2), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
        Context requireContext3 = requireContext();
        requireContext3.getClass();
        z8e.b0(recyclerView, requireContext3, false, false, null, 30);
        recyclerView.addOnScrollListener(u6eVar);
        recyclerView.setAdapter(D());
        krk krkVar3 = this.l;
        krkVar3.getClass();
        int i4 = 1;
        ((dq8) krkVar3).b.y(1);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        z8e.a0(((dq8) krkVar4).b, 1000L, new owi(this, 3));
        krk krkVar5 = this.l;
        krkVar5.getClass();
        ((dq8) krkVar5).h.addOnScrollListener(new rwi(this));
        final AppBarLayout appBarLayout2 = (AppBarLayout) requireActivity().findViewById(R.id.app_bar);
        if (appBarLayout2 != 0) {
            t(appBarLayout2, new dvi(5, this, appBarLayout2));
            ?? r7 = new ua0() { // from class: pwi
                @Override // defpackage.ua0
                public final void a(AppBarLayout appBarLayout3, int i5) {
                    dq8 dq8Var = (dq8) TeamEventsFragment.this.l;
                    if (dq8Var != null) {
                        dq8Var.b.setTranslationY(-(appBarLayout2.getTotalScrollRange() + i5));
                    }
                }
            };
            appBarLayout2.a(r7);
            this.A = r7;
            appBarLayout = appBarLayout2;
        } else {
            appBarLayout = null;
        }
        this.z = appBarLayout;
        E().j.e(getViewLifecycleOwner(), new ioe(22, new mwi(this, u6eVar, i4)));
        E().l.e(getViewLifecycleOwner(), new ioe(22, new mwi(this, u6eVar, i3)));
        z8e.y(this, new wj0(E().n, 3), new m1f(this, rq3Var, 26));
        xwi E = E();
        u6b viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        E.g(viewLifecycleOwner2, new owi(this, i2));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        if (E().j.d() != null) {
            E().l();
            return;
        }
        xwi E = E();
        xw3.L(un0.z(E), null, null, new hj(E, (rq3) null, 6), 3);
    }
}
