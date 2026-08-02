package com.sofascore.results.bettingtips.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.bettingtips.EventBetBoost;
import com.sofascore.model.network.response.bettingtips.BetBoostsResponse;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.duf;
import defpackage.eo8;
import defpackage.fu1;
import defpackage.g6b;
import defpackage.g7;
import defpackage.gu1;
import defpackage.hu1;
import defpackage.j29;
import defpackage.joa;
import defpackage.k13;
import defpackage.ke0;
import defpackage.krk;
import defpackage.lu1;
import defpackage.mqi;
import defpackage.mu1;
import defpackage.nu1;
import defpackage.otk;
import defpackage.ou4;
import defpackage.q3;
import defpackage.rld;
import defpackage.ru1;
import defpackage.su1;
import defpackage.tj;
import defpackage.un0;
import defpackage.w1;
import defpackage.x1;
import defpackage.xbb;
import defpackage.xw3;
import defpackage.y1;
import defpackage.y7;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.zsk;
import defpackage.zu1;
import defpackage.zu3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/bettingtips/fragment/BetBoostFragment;", "Lcom/sofascore/results/bettingtips/fragment/AbstractBettingTipsFragment;", "Lcom/sofascore/model/network/response/bettingtips/BetBoostsResponse;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BetBoostFragment extends Hilt_BetBoostFragment<BetBoostsResponse> {
    public final j29 A;
    public final otk v;
    public ou4 w;
    public boolean x;
    public final mqi y;
    public final joa z;

    public BetBoostFragment() {
        w1 w1Var = new w1(this, 19);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new w1(w1Var, 20));
        this.v = new otk(duf.a.getOrCreateKotlinClass(su1.class), new x1(a, 15), new y1(12, this, a), new x1(a, 16));
        this.x = true;
        this.y = ypa.b(new mu1(this, 2));
        this.z = ypa.a(ysaVar, new mu1(this, 3));
        this.A = new j29(Integer.valueOf(R.drawable.bet_boost_empty_state), Integer.valueOf(R.string.bet_boost_empty_title), Integer.valueOf(R.string.bet_boost_empty_text), 497);
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    /* renamed from: B, reason: from getter */
    public final j29 getA() {
        return this.A;
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
        lu1 M = M();
        g6b lifecycle = getLifecycle();
        lifecycle.getClass();
        zsk zskVar = new zsk(lifecycle, 45);
        zskVar.c(new mu1(this, 0), null);
        M.n = zskVar;
        if (this.w == null) {
            ou4 ou4Var = new ou4(1);
            this.w = ou4Var;
            ou4Var.c(isResumed(), new mu1(this, 1));
        }
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void G() {
        M().s();
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void H(Object obj) {
        ou4 ou4Var;
        Integer M;
        int intValue;
        BetBoostsResponse betBoostsResponse = (BetBoostsResponse) obj;
        betBoostsResponse.getClass();
        if (!this.n) {
            krk krkVar = this.l;
            krkVar.getClass();
            ((eo8) krkVar).d.scrollToPosition(0);
        }
        if (betBoostsResponse.getBetBoosts().isEmpty()) {
            krk krkVar2 = this.l;
            krkVar2.getClass();
            ((eo8) krkVar2).c.setVisibility(0);
            C().setVisibility(8);
            M().s();
            return;
        }
        xbb b = a.b();
        b.add(gu1.a);
        List<EventBetBoost> betBoosts = betBoostsResponse.getBetBoosts();
        ArrayList arrayList = new ArrayList(k13.r(betBoosts, 10));
        Iterator<T> it = betBoosts.iterator();
        while (it.hasNext()) {
            arrayList.add(new fu1((EventBetBoost) it.next()));
        }
        b.addAll(arrayList);
        if (!zu3.h.hasMcc(Integer.valueOf(ke0.c))) {
            Context requireContext = requireContext();
            requireContext.getClass();
            if (rld.j(requireContext) != null) {
                b.add(hu1.a);
            }
        }
        M().F(a.a(b));
        C().setVisibility(0);
        if (this.x && A().k != 0 && (M = z8e.M(M().i, new nu1(this, 0))) != null && (intValue = M.intValue()) > 1) {
            krk krkVar3 = this.l;
            krkVar3.getClass();
            t(((eo8) krkVar3).d, new tj(this, intValue, 2));
        }
        this.x = false;
        if (!isResumed() || (ou4Var = this.w) == null) {
            return;
        }
        ou4Var.f();
    }

    public final lu1 M() {
        return (lu1) this.z.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ou4 ou4Var = this.w;
        if (ou4Var != null) {
            ou4Var.b();
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        ou4 ou4Var;
        super.onResume();
        if (M().getItemCount() <= M().h.size() + 1 || (ou4Var = this.w) == null) {
            return;
        }
        ou4Var.f();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "BetBoostTab";
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        otk otkVar = this.v;
        su1 su1Var = (su1) otkVar.getValue();
        xw3.L(un0.z(su1Var), null, null, new q3(su1Var, null, 8), 3);
        ((su1) otkVar.getValue()).h.e(getViewLifecycleOwner(), this);
        A().g.e(getViewLifecycleOwner(), new y7(4, new nu1(this, 1)));
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((eo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        g7.o(M(), C(), 6);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        zu1 zu1Var = (zu1) A().g.d();
        if (zu1Var != null) {
            su1 su1Var = (su1) this.v.getValue();
            String str = zu1Var.a;
            int i = A().k;
            xw3.L(un0.z(su1Var), null, null, new ru1(str, A().l, i, su1Var, null), 3);
        }
    }
}
