package com.sofascore.results.bettingtips.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.network.response.bettingtips.EventStreak;
import com.sofascore.model.network.response.bettingtips.HighValueStreaksResponse;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.ca9;
import defpackage.da9;
import defpackage.duf;
import defpackage.ea9;
import defpackage.eo8;
import defpackage.g5k;
import defpackage.ga9;
import defpackage.hv7;
import defpackage.ix7;
import defpackage.joa;
import defpackage.k13;
import defpackage.kp5;
import defpackage.krk;
import defpackage.otk;
import defpackage.q2g;
import defpackage.qu1;
import defpackage.rq3;
import defpackage.s16;
import defpackage.sr8;
import defpackage.un0;
import defpackage.ur1;
import defpackage.xw3;
import defpackage.y7;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z07;
import defpackage.z8e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/bettingtips/fragment/HighValueStreaksFragment;", "Lcom/sofascore/results/bettingtips/fragment/AbstractBettingTipsFragment;", "Lcom/sofascore/model/network/response/bettingtips/HighValueStreaksResponse;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HighValueStreaksFragment extends Hilt_HighValueStreaksFragment<HighValueStreaksResponse> {
    public final otk v;
    public ca9 w;
    public ca9 x;
    public final joa y;

    public HighValueStreaksFragment() {
        hv7 hv7Var = new hv7(this, 6);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new hv7(hv7Var, 7));
        this.v = new otk(duf.a.getOrCreateKotlinClass(ga9.class), new ix7(a, 3), new z07(22, this, a), new ix7(a, 4));
        this.w = ca9.b;
        this.y = ypa.a(ysaVar, new sr8(this, 4));
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void D() {
        krk krkVar = this.l;
        krkVar.getClass();
        RecyclerView recyclerView = ((eo8) krkVar).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        joa joaVar = this.y;
        da9 da9Var = (da9) joaVar.getValue();
        s16 s16Var = new s16(this, 27);
        da9Var.getClass();
        da9Var.a.d = s16Var;
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((eo8) krkVar2).d.setAdapter((da9) joaVar.getValue());
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    /* renamed from: E */
    public final boolean getN() {
        return this.n && this.x == this.w;
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void G() {
        ((da9) this.y.getValue()).s();
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void H(Object obj) {
        List<EventStreak> head2head;
        HighValueStreaksResponse highValueStreaksResponse = (HighValueStreaksResponse) obj;
        highValueStreaksResponse.getClass();
        String str = this.w.a;
        ca9 ca9Var = ca9.b;
        boolean equals = str.equals("general");
        joa joaVar = this.y;
        if (equals) {
            List<EventStreak> general = highValueStreaksResponse.getGeneral();
            if (general != null) {
                ((da9) joaVar.getValue()).F(general);
            }
        } else if (this.w.a.equals("head2head") && (head2head = highValueStreaksResponse.getHead2head()) != null) {
            ((da9) joaVar.getValue()).F(head2head);
        }
        if (!getN()) {
            krk krkVar = this.l;
            krkVar.getClass();
            ((eo8) krkVar).d.scrollToPosition(0);
        }
        this.x = this.w;
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void I() {
        this.w = ca9.b;
        super.I();
        krk krkVar = this.l;
        krkVar.getClass();
        ((eo8) krkVar).g.t(null, false);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "HighValueStreaksTab";
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        ((ga9) this.v.getValue()).g.e(getViewLifecycleOwner(), this);
        A().g.e(getViewLifecycleOwner(), new y7(27, new ea9(this, 0)));
        krk krkVar = this.l;
        krkVar.getClass();
        g5k g5kVar = new g5k(((eo8) krkVar).g);
        g5kVar.k = true;
        kp5 kp5Var = ca9.d;
        ArrayList arrayList = new ArrayList(k13.r(kp5Var, 10));
        Iterator<E> it = kp5Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((ca9) it.next()).a);
        }
        g5kVar.a = arrayList;
        g5kVar.d = new ea9(this, 1);
        g5kVar.m = new ur1(this, 9);
        g5kVar.b();
        krk krkVar2 = this.l;
        krkVar2.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((eo8) krkVar2).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        Integer num = (Integer) A().j.d();
        if (num == null) {
            h(new q2g(new Exception()));
            return;
        }
        ga9 ga9Var = (ga9) this.v.getValue();
        xw3.L(un0.z(ga9Var), null, null, new qu1(ga9Var, num.intValue(), (rq3) null, 14), 3);
    }
}
