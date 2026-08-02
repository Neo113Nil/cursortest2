package com.sofascore.results.bettingtips.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.network.response.bettingtips.TrendingOddsResponse;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.anc;
import defpackage.duf;
import defpackage.eo8;
import defpackage.fwi;
import defpackage.g7;
import defpackage.ilj;
import defpackage.joa;
import defpackage.k13;
import defpackage.krk;
import defpackage.l0k;
import defpackage.n0k;
import defpackage.o5i;
import defpackage.otk;
import defpackage.q2g;
import defpackage.qdj;
import defpackage.rq3;
import defpackage.s2j;
import defpackage.un0;
import defpackage.vd6;
import defpackage.w1i;
import defpackage.w3a;
import defpackage.xw3;
import defpackage.ygi;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.zu1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/bettingtips/fragment/TrendingOddsFragment;", "Lcom/sofascore/results/bettingtips/fragment/AbstractBettingTipsFragment;", "Lcom/sofascore/model/network/response/bettingtips/TrendingOddsResponse;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TrendingOddsFragment extends Hilt_TrendingOddsFragment<TrendingOddsResponse> {
    public final otk v;
    public final joa w;

    public TrendingOddsFragment() {
        s2j s2jVar = new s2j(this, 11);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new s2j(s2jVar, 12));
        this.v = new otk(duf.a.getOrCreateKotlinClass(n0k.class), new fwi(a, 27), new ilj(4, this, a), new fwi(a, 28));
        this.w = ypa.a(ysaVar, new w1i(this, 27));
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void D() {
        krk krkVar = this.l;
        krkVar.getClass();
        RecyclerView recyclerView = ((eo8) krkVar).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((eo8) krkVar2).d.setAdapter(M());
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void G() {
        M().s();
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void H(Object obj) {
        TrendingOddsResponse trendingOddsResponse = (TrendingOddsResponse) obj;
        trendingOddsResponse.getClass();
        List<Event> H0 = CollectionsKt.H0(trendingOddsResponse.getEvents(), new o5i(trendingOddsResponse, 4));
        ArrayList arrayList = new ArrayList(k13.r(H0, 10));
        for (Event event : H0) {
            Tournament tournament = event.getTournament();
            Context requireContext = requireContext();
            requireContext.getClass();
            arrayList.add(new vd6(event, w3a.R(tournament, requireContext, false, false, A().k(), false, false, null, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), trendingOddsResponse.getOddsMap().get(Integer.valueOf(event.getId())), trendingOddsResponse.getWinningOddsMap().get(Integer.valueOf(event.getId()))));
        }
        M().F(arrayList);
        if (this.n) {
            return;
        }
        krk krkVar = this.l;
        krkVar.getClass();
        ((eo8) krkVar).d.scrollToPosition(0);
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void I() {
        super.I();
        M().m.clear();
    }

    public final l0k M() {
        return (l0k) this.w.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "TrendingOddsTab";
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        ((n0k) this.v.getValue()).g.e(getViewLifecycleOwner(), this);
        A().g.e(getViewLifecycleOwner(), new ygi(9, new qdj(this, 8)));
        g7.o(M(), C(), 6);
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((eo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        zu1 zu1Var = (zu1) A().g.d();
        if (zu1Var != null) {
            Integer num = (Integer) A().j.d();
            if (num == null) {
                h(new q2g(new Exception()));
                return;
            }
            n0k n0kVar = (n0k) this.v.getValue();
            xw3.L(un0.z(n0kVar), null, null, new anc(n0kVar, num.intValue(), zu1Var.a, (rq3) null, 18), 3);
        }
    }
}
