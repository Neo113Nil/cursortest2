package com.sofascore.results.bettingtips.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.bettingtips.H2HStreaksResponse;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.anc;
import defpackage.duf;
import defpackage.eo8;
import defpackage.fwi;
import defpackage.hlj;
import defpackage.ilj;
import defpackage.joa;
import defpackage.k13;
import defpackage.klj;
import defpackage.krk;
import defpackage.otk;
import defpackage.q2g;
import defpackage.qdj;
import defpackage.rq3;
import defpackage.s2j;
import defpackage.ud6;
import defpackage.un0;
import defpackage.uri;
import defpackage.w1i;
import defpackage.xw3;
import defpackage.ygi;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.zu1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/bettingtips/fragment/TopH2HFragment;", "Lcom/sofascore/results/bettingtips/fragment/AbstractBettingTipsFragment;", "Lcom/sofascore/model/network/response/bettingtips/H2HStreaksResponse;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TopH2HFragment extends Hilt_TopH2HFragment<H2HStreaksResponse> {
    public final otk v;
    public final joa w;

    public TopH2HFragment() {
        s2j s2jVar = new s2j(this, 4);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new s2j(s2jVar, 5));
        this.v = new otk(duf.a.getOrCreateKotlinClass(klj.class), new fwi(a, 19), new ilj(0, this, a), new fwi(a, 20));
        this.w = ypa.a(ysaVar, new w1i(this, 22));
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void D() {
        krk krkVar = this.l;
        krkVar.getClass();
        RecyclerView recyclerView = ((eo8) krkVar).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        joa joaVar = this.w;
        hlj hljVar = (hlj) joaVar.getValue();
        uri uriVar = new uri(this, 11);
        hljVar.getClass();
        hljVar.a.d = uriVar;
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((eo8) krkVar2).d.setAdapter((hlj) joaVar.getValue());
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void G() {
        ((hlj) this.w.getValue()).s();
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void H(Object obj) {
        H2HStreaksResponse h2HStreaksResponse = (H2HStreaksResponse) obj;
        h2HStreaksResponse.getClass();
        List<Event> events = h2HStreaksResponse.getEvents();
        ArrayList arrayList = new ArrayList(k13.r(events, 10));
        for (Event event : events) {
            arrayList.add(new ud6(A().k(), event, h2HStreaksResponse.getH2hMap().get(Integer.valueOf(event.getId()))));
        }
        ((hlj) this.w.getValue()).F(arrayList);
        if (this.n) {
            return;
        }
        krk krkVar = this.l;
        krkVar.getClass();
        ((eo8) krkVar).d.scrollToPosition(0);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "TopHead2HeadTab";
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        ((klj) this.v.getValue()).g.e(getViewLifecycleOwner(), this);
        A().g.e(getViewLifecycleOwner(), new ygi(5, new qdj(this, 1)));
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
            klj kljVar = (klj) this.v.getValue();
            xw3.L(un0.z(kljVar), null, null, new anc(kljVar, num.intValue(), zu1Var.a, (rq3) null, 17), 3);
        }
    }
}
