package com.sofascore.results.event.overs;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import defpackage.a70;
import defpackage.ao2;
import defpackage.b7;
import defpackage.duf;
import defpackage.fuf;
import defpackage.hfe;
import defpackage.krk;
import defpackage.lqb;
import defpackage.mqi;
import defpackage.mr5;
import defpackage.o13;
import defpackage.otk;
import defpackage.r1h;
import defpackage.r46;
import defpackage.rlh;
import defpackage.s46;
import defpackage.t1h;
import defpackage.t46;
import defpackage.ta0;
import defpackage.tc3;
import defpackage.u46;
import defpackage.u6b;
import defpackage.un0;
import defpackage.v1h;
import defpackage.v46;
import defpackage.x16;
import defpackage.x46;
import defpackage.xq8;
import defpackage.xw3;
import defpackage.y46;
import defpackage.y7;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.z1h;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/overs/EventOversFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lxq8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventOversFragment extends Hilt_EventOversFragment<xq8> {
    public final otk r;
    public final otk s;
    public final mqi t;
    public final mqi u;
    public final mqi v;

    public EventOversFragment() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(y46.class), new v46(this, 0), new v46(this, 2), new v46(this, 1));
        this.s = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new v46(this, 3), new v46(this, 5), new v46(this, 4));
        this.t = ypa.b(new s46(this, 0));
        this.u = ypa.b(new s46(this, 1));
        this.v = ypa.b(new s46(this, 2));
    }

    public final CricketEvent C() {
        Object d = ((mr5) this.s.getValue()).v.d();
        if (d == null) {
            a70.r("Required value was null.");
            return null;
        }
        Event event = (Event) d;
        if (event instanceof CricketEvent) {
            return (CricketEvent) event;
        }
        a70.p("Failed requirement.");
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return xq8.a(getLayoutInflater());
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        ((r46) this.t.getValue()).notifyDataSetChanged();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "OversTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((xq8) krkVar).d;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        mqi mqiVar = this.u;
        SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) mqiVar.getValue();
        segmentedButtonsView.getClass();
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair(bool, bool);
        t46 t46Var = new t46(this, 1);
        String str = "First";
        t1h[] t1hVarArr = {new r1h("First", new tc3(772595396, new u46(this, 0), true)), new r1h("Second", new tc3(-562778333, new u46(this, 1), true))};
        rlh rlhVar = rlh.b;
        rlhVar.getClass();
        hfe d = rlhVar.d();
        o13.w(d, t1hVarArr);
        b7 d2 = d.d();
        Intrinsics.c(C().getStatusType(), StatusKt.STATUS_IN_PROGRESS);
        Integer currentBattingTeamId = C().getCurrentBattingTeamId();
        int id = Event.getAwayTeam$default(C(), null, 1, null).getId();
        if (currentBattingTeamId != null && currentBattingTeamId.intValue() == id) {
            str = "Second";
        }
        segmentedButtonsView.k = t46Var;
        segmentedButtonsView.g = true;
        segmentedButtonsView.h = pair;
        segmentedButtonsView.j = v1h.f;
        segmentedButtonsView.i = new z1h(0);
        segmentedButtonsView.setSelectedItem(str);
        if (d2 == null) {
            d2 = rlh.b;
        }
        if (!d2.isEmpty()) {
            SegmentedButtonsView.t(segmentedButtonsView, d2, null, 6);
        }
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((xq8) krkVar2).c;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((xq8) krkVar3).c.setAdapter((r46) this.t.getValue());
        krk krkVar4 = this.l;
        krkVar4.getClass();
        RecyclerView recyclerView2 = ((xq8) krkVar4).c;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView2.setPaddingRelative(recyclerView2.getPaddingStart(), ao2.s(8, requireContext2), recyclerView2.getPaddingEnd(), recyclerView2.getPaddingBottom());
        krk krkVar5 = this.l;
        krkVar5.getClass();
        AppBarLayout appBarLayout = ((xq8) krkVar5).b;
        mqi mqiVar2 = this.v;
        appBarLayout.addView(((lqb) mqiVar2.getValue()).a);
        Unit unit = Unit.a;
        ConstraintLayout constraintLayout = ((lqb) mqiVar2.getValue()).a;
        constraintLayout.getClass();
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            return;
        }
        ta0 ta0Var = (ta0) layoutParams;
        ta0Var.a = 1;
        constraintLayout.setLayoutParams(ta0Var);
        appBarLayout.addView((SegmentedButtonsView) mqiVar.getValue());
        SegmentedButtonsView segmentedButtonsView2 = (SegmentedButtonsView) mqiVar.getValue();
        ViewGroup.LayoutParams layoutParams2 = segmentedButtonsView2.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            return;
        }
        ta0 ta0Var2 = (ta0) layoutParams2;
        ta0Var2.a = 0;
        segmentedButtonsView2.setLayoutParams(ta0Var2);
        otk otkVar = this.r;
        int i = 3;
        ((y46) otkVar.getValue()).g.e(getViewLifecycleOwner(), new y7(19, new x16(this, i)));
        y46 y46Var = (y46) otkVar.getValue();
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        y46Var.g(viewLifecycleOwner, new s46(this, i));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        y46 y46Var = (y46) this.r.getValue();
        xw3.L(un0.z(y46Var), null, null, new x46(y46Var, C(), null), 3);
    }
}
