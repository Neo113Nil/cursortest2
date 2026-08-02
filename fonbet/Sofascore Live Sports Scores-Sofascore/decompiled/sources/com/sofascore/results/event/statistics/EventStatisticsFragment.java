package com.sofascore.results.event.statistics;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import defpackage.a70;
import defpackage.ay5;
import defpackage.bc6;
import defpackage.duf;
import defpackage.fi5;
import defpackage.fo8;
import defpackage.fuf;
import defpackage.joa;
import defpackage.krk;
import defpackage.ml8;
import defpackage.mqi;
import defpackage.mr5;
import defpackage.n9e;
import defpackage.nb6;
import defpackage.nq8;
import defpackage.ob6;
import defpackage.otk;
import defpackage.pb6;
import defpackage.qb6;
import defpackage.rb6;
import defpackage.rlh;
import defpackage.s16;
import defpackage.t06;
import defpackage.tb6;
import defpackage.u6b;
import defpackage.v1h;
import defpackage.y7;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1h;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/statistics/EventStatisticsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lfo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventStatisticsFragment extends Hilt_EventStatisticsFragment<fo8> {
    public final qb6 A;
    public final pb6 B;
    public final mqi C;
    public final otk r;
    public final otk s;
    public final joa t;
    public boolean u;
    public final joa v;
    public final joa w;
    public final joa x;
    public final joa y;
    public final s16 z;

    public EventStatisticsFragment() {
        tb6 tb6Var = new tb6(this, 3);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new t06(tb6Var, 11));
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(bc6.class), new ay5(a, 23), new fi5(this, a, 15), new ay5(a, 24));
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        this.s = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new tb6(this, i), new tb6(this, i3), new tb6(this, i2));
        this.t = ypa.a(ysaVar, new ob6(this, i));
        this.u = true;
        int i4 = 7;
        this.v = n9e.M(new ob6(this, i4), new ob6(this, 8));
        this.w = n9e.M(new ob6(this, 9), new ob6(this, 10));
        this.x = n9e.M(new ob6(this, 11), new ob6(this, 12));
        this.y = n9e.M(new ob6(this, i2), new ob6(this, i3));
        this.z = new s16(this, i4);
        this.A = new qb6(this, i3);
        this.B = new pb6(this, i2);
        this.C = ypa.b(new ob6(this, 6));
    }

    public final nb6 C() {
        return (nb6) this.t.getValue();
    }

    public final Event D() {
        Object d = ((mr5) this.s.getValue()).v.d();
        if (d != null) {
            return (Event) d;
        }
        a70.r("Required value was null.");
        return null;
    }

    public final ml8 E() {
        return (ml8) this.v.getValue();
    }

    public final bc6 F() {
        return (bc6) this.r.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_event_statistics_layout, (ViewGroup) null, false);
        int i = R.id.periods_header;
        SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.periods_header, inflate);
        if (segmentedButtonsView != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
            if (recyclerView != null) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                return new fo8(swipeRefreshLayout, segmentedButtonsView, recyclerView, swipeRefreshLayout);
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "StatisticsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((fo8) krkVar).d;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        SegmentedButtonsView segmentedButtonsView = ((fo8) krkVar2).b;
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair(bool, bool);
        int i = 0;
        segmentedButtonsView.k = new pb6(this, i);
        segmentedButtonsView.g = false;
        segmentedButtonsView.h = pair;
        segmentedButtonsView.j = v1h.f;
        segmentedButtonsView.i = new z1h(0);
        rlh rlhVar = rlh.b;
        if (!rlhVar.isEmpty()) {
            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
        }
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((fo8) krkVar3).c.setAdapter(C());
        krk krkVar4 = this.l;
        krkVar4.getClass();
        RecyclerView recyclerView = ((fo8) krkVar4).c;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar5 = this.l;
        krkVar5.getClass();
        ((fo8) krkVar5).c.addOnScrollListener(new rb6(this));
        F().h.e(getViewLifecycleOwner(), new y7(23, new qb6(this, i)));
        bc6 F = F();
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        F.g(viewLifecycleOwner, new ob6(this, 3));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        F().m(D());
    }
}
