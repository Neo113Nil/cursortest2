package com.sofascore.results.main.matches.redesign.trending;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.buzzer.BuzzerActivity;
import com.sofascore.results.main.matches.redesign.trending.TrendingMatchesFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.a52;
import defpackage.ad2;
import defpackage.b1d;
import defpackage.beh;
import defpackage.d0k;
import defpackage.d92;
import defpackage.duf;
import defpackage.e52;
import defpackage.e6b;
import defpackage.fuf;
import defpackage.fwi;
import defpackage.h0k;
import defpackage.haf;
import defpackage.hkg;
import defpackage.i0k;
import defpackage.ilj;
import defpackage.joa;
import defpackage.k0k;
import defpackage.k92;
import defpackage.ke0;
import defpackage.krk;
import defpackage.luj;
import defpackage.mi;
import defpackage.oo8;
import defpackage.otk;
import defpackage.ox1;
import defpackage.oyj;
import defpackage.pzh;
import defpackage.qv5;
import defpackage.s2j;
import defpackage.s9a;
import defpackage.sj4;
import defpackage.sub;
import defpackage.u6b;
import defpackage.u82;
import defpackage.un0;
import defpackage.wca;
import defpackage.x42;
import defpackage.xw3;
import defpackage.ygi;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.util.Calendar;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/main/matches/redesign/trending/TrendingMatchesFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrendingMatchesFragment extends Hilt_TrendingMatchesFragment<oo8> {
    public final /* synthetic */ u82 r = new u82();
    public final otk s;
    public final otk t;
    public final joa u;
    public final joa v;
    public long w;

    public TrendingMatchesFragment() {
        i0k i0kVar = new i0k(this, 3);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new s2j(i0kVar, 10));
        fuf fufVar = duf.a;
        this.s = new otk(fufVar.getOrCreateKotlinClass(k0k.class), new fwi(a, 25), new ilj(3, this, a), new fwi(a, 26));
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(k92.class);
        final int i = 0;
        final int i2 = 1;
        this.t = new otk(orCreateKotlinClass, new i0k(this, 0), new i0k(this, 2), new i0k(this, 1));
        this.u = ypa.a(ysaVar, new Function0(this) { // from class: e0k
            public final /* synthetic */ TrendingMatchesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                TrendingMatchesFragment trendingMatchesFragment = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = trendingMatchesFragment.requireContext();
                        requireContext.getClass();
                        return new oyj(requireContext, (d92) trendingMatchesFragment.v.getValue());
                    default:
                        Context requireContext2 = trendingMatchesFragment.requireContext();
                        requireContext2.getClass();
                        return new d92(requireContext2);
                }
            }
        });
        this.v = ypa.a(ysaVar, new Function0(this) { // from class: e0k
            public final /* synthetic */ TrendingMatchesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                TrendingMatchesFragment trendingMatchesFragment = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = trendingMatchesFragment.requireContext();
                        requireContext.getClass();
                        return new oyj(requireContext, (d92) trendingMatchesFragment.v.getValue());
                    default:
                        Context requireContext2 = trendingMatchesFragment.requireContext();
                        requireContext2.getClass();
                        return new d92(requireContext2);
                }
            }
        });
    }

    public final oyj C() {
        return (oyj) this.u.getValue();
    }

    public final void D() {
        krk krkVar = this.l;
        krkVar.getClass();
        t(((oo8) krkVar).d, new d0k(this, 1));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "TrendingNestedTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).a;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(a52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        int i = 0;
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        int i2 = 3;
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new h0k(viewLifecycleOwner, (b1d) obj, this, null, this, 1), 3);
        u6b viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(x42.class);
        Object obj2 = linkedHashMap.get(orCreateKotlinClass2);
        if (obj2 == null) {
            obj2 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass2, obj2);
        }
        xw3.L(wca.x(viewLifecycleOwner2.getLifecycle()), null, null, new h0k(viewLifecycleOwner2, (b1d) obj2, this, null, this, 2), 3);
        e6b e6bVar2 = e6b.a;
        u6b viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        KClass orCreateKotlinClass3 = fufVar.getOrCreateKotlinClass(e52.class);
        Object obj3 = linkedHashMap.get(orCreateKotlinClass3);
        if (obj3 == null) {
            obj3 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass3, obj3);
        }
        xw3.L(wca.x(viewLifecycleOwner3.getLifecycle()), null, null, new h0k(viewLifecycleOwner3, (b1d) obj3, this, null, this, 0), 3);
        oyj C = C();
        haf hafVar = pzh.b;
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        C.getClass();
        sj4 sj4Var = new sj4(C, 16, recyclerView, i2);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView2 = ((oo8) krkVar3).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView2, requireContext, false, false, null, 30);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        hkg.t(48, ((oo8) krkVar4).d);
        krk krkVar5 = this.l;
        krkVar5.getClass();
        ((oo8) krkVar5).d.addItemDecoration(sj4Var);
        krk krkVar6 = this.l;
        krkVar6.getClass();
        RecyclerView recyclerView3 = ((oo8) krkVar6).d;
        oyj C2 = C();
        Calendar calendar = ke0.a;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        C2.K(this, sub.d(new Pair(SearchResponseKt.SPORT_ENTITY, ke0.b(requireContext2))), true);
        recyclerView3.setAdapter(C2);
        u6b viewLifecycleOwner4 = getViewLifecycleOwner();
        viewLifecycleOwner4.getClass();
        k92 k92Var = (k92) this.t.getValue();
        d92 d92Var = (d92) this.v.getValue();
        d92Var.getClass();
        u82 u82Var = this.r;
        u82Var.getClass();
        viewLifecycleOwner4.getClass();
        d92Var.getClass();
        viewLifecycleOwner4.getLifecycle().a(u82Var);
        u82Var.b = k92Var;
        u82Var.a = d92Var;
        d92Var.n(new ox1(k92Var, 11), new mi(10, k92Var, viewLifecycleOwner4, d92Var));
        d92Var.getBuzzerTracker();
        ((k0k) this.s.getValue()).g.e(getViewLifecycleOwner(), new ygi(8, new d0k(this, i)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        d92 d92Var;
        k0k k0kVar = (k0k) this.s.getValue();
        xw3.L(un0.z(k0kVar), null, null, new luj(k0kVar, null, 2), 3);
        Context requireContext = requireContext();
        requireContext.getClass();
        u82 u82Var = this.r;
        u82Var.getClass();
        int i = BuzzerActivity.O;
        if (!s9a.x(requireContext)) {
            d92 d92Var2 = u82Var.a;
            if (d92Var2 != null) {
                d92Var2.j();
                return;
            }
            return;
        }
        k92 k92Var = u82Var.b;
        if (k92Var != null) {
            k92Var.k(true);
        }
        d92 d92Var3 = u82Var.a;
        if (d92Var3 == null || d92Var3.l() || (d92Var = u82Var.a) == null) {
            return;
        }
        d92Var.o();
    }
}
