package com.sofascore.results.bettingtips.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.network.response.bettingtips.DroppingOddsResponse;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.duf;
import defpackage.eo8;
import defpackage.g7;
import defpackage.h63;
import defpackage.id5;
import defpackage.j63;
import defpackage.joa;
import defpackage.k13;
import defpackage.kd5;
import defpackage.kr1;
import defpackage.krk;
import defpackage.kz3;
import defpackage.ok0;
import defpackage.otk;
import defpackage.p24;
import defpackage.q2g;
import defpackage.rq3;
import defpackage.td6;
import defpackage.un0;
import defpackage.w3a;
import defpackage.xw3;
import defpackage.y1;
import defpackage.y7;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.zu1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/bettingtips/fragment/DroppingOddsFragment;", "Lcom/sofascore/results/bettingtips/fragment/AbstractBettingTipsFragment;", "Lcom/sofascore/model/network/response/bettingtips/DroppingOddsResponse;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DroppingOddsFragment extends Hilt_DroppingOddsFragment<DroppingOddsResponse> {
    public final otk v;
    public final joa w;

    public DroppingOddsFragment() {
        j63 j63Var = new j63(this, 11);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new j63(j63Var, 12));
        this.v = new otk(duf.a.getOrCreateKotlinClass(kd5.class), new p24(a, 9), new y1(26, this, a), new p24(a, 10));
        this.w = ypa.a(ysaVar, new h63(this, 19));
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
        id5 id5Var = (id5) joaVar.getValue();
        kr1 kr1Var = new kr1(this, 26);
        id5Var.getClass();
        id5Var.a.d = kr1Var;
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((eo8) krkVar2).d.setAdapter((id5) joaVar.getValue());
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void G() {
        ((id5) this.w.getValue()).s();
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void H(Object obj) {
        DroppingOddsResponse droppingOddsResponse = (DroppingOddsResponse) obj;
        droppingOddsResponse.getClass();
        List<Event> events = droppingOddsResponse.getEvents();
        ArrayList arrayList = new ArrayList(k13.r(events, 10));
        for (Event event : events) {
            Tournament tournament = event.getTournament();
            Context requireContext = requireContext();
            requireContext.getClass();
            arrayList.add(new td6(event, w3a.R(tournament, requireContext, false, false, A().k(), false, false, null, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), droppingOddsResponse.getOddsMap().get(Integer.valueOf(event.getId()))));
        }
        ((id5) this.w.getValue()).F(arrayList);
        if (this.n) {
            return;
        }
        krk krkVar = this.l;
        krkVar.getClass();
        ((eo8) krkVar).d.scrollToPosition(0);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "DroppingOddsTab";
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        ((kd5) this.v.getValue()).g.e(getViewLifecycleOwner(), this);
        A().g.e(getViewLifecycleOwner(), new y7(13, new kz3(this, 14)));
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((eo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        g7.o((id5) this.w.getValue(), C(), 6);
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
            kd5 kd5Var = (kd5) this.v.getValue();
            xw3.L(un0.z(kd5Var), null, null, new ok0(kd5Var, num.intValue(), zu1Var.a, (rq3) null, 7), 3);
        }
    }
}
