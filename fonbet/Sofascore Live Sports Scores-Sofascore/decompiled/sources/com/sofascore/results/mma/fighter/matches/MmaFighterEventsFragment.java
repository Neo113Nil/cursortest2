package com.sofascore.results.mma.fighter.matches;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.mma.fighter.matches.MmaFighterEventsFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.a52;
import defpackage.ad2;
import defpackage.b1c;
import defpackage.b1d;
import defpackage.bba;
import defpackage.beh;
import defpackage.bmc;
import defpackage.duf;
import defpackage.e6b;
import defpackage.eqb;
import defpackage.jmc;
import defpackage.joa;
import defpackage.krk;
import defpackage.llc;
import defpackage.lsb;
import defpackage.mj5;
import defpackage.mqi;
import defpackage.oo8;
import defpackage.otk;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.u6b;
import defpackage.u6e;
import defpackage.un0;
import defpackage.va8;
import defpackage.wca;
import defpackage.wya;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.znc;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/mma/fighter/matches/MmaFighterEventsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaFighterEventsFragment extends Hilt_MmaFighterEventsFragment<oo8> {
    public final mqi r;
    public final otk s;
    public final mqi t;
    public final mqi u;
    public boolean v;

    public MmaFighterEventsFragment() {
        final int i = 0;
        this.r = ypa.b(new Function0(this) { // from class: wnc
            public final /* synthetic */ MmaFighterEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MmaFighterEventsFragment mmaFighterEventsFragment = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = mmaFighterEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "FIGHTER", Team.class);
                        if (M != null) {
                            return (Team) M;
                        }
                        a70.p("Serializable FIGHTER not found");
                        return null;
                    default:
                        Context requireContext = mmaFighterEventsFragment.requireContext();
                        requireContext.getClass();
                        return new bmc(requireContext, fmc.b, 8);
                }
            }
        });
        joa a = ypa.a(ysa.c, new jmc(new jmc(this, 5), 6));
        this.s = new otk(duf.a.getOrCreateKotlinClass(znc.class), new llc(a, 7), new wya(12, this, a), new llc(a, 8));
        final int i2 = 1;
        this.t = ypa.b(new Function0(this) { // from class: wnc
            public final /* synthetic */ MmaFighterEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MmaFighterEventsFragment mmaFighterEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = mmaFighterEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "FIGHTER", Team.class);
                        if (M != null) {
                            return (Team) M;
                        }
                        a70.p("Serializable FIGHTER not found");
                        return null;
                    default:
                        Context requireContext = mmaFighterEventsFragment.requireContext();
                        requireContext.getClass();
                        return new bmc(requireContext, fmc.b, 8);
                }
            }
        });
        this.u = ypa.b(new b1c(24));
        this.v = true;
    }

    public final bmc C() {
        return (bmc) this.t.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "FightsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 4);
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(a52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new va8(viewLifecycleOwner, (b1d) obj, this, (rq3) null, this), 3);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((oo8) krkVar3).d.setAdapter(C());
        u6e u6eVar = new u6e(C(), true, new bba(this, 14));
        krk krkVar4 = this.l;
        krkVar4.getClass();
        ((oo8) krkVar4).d.addOnScrollListener(u6eVar);
        ((znc) this.s.getValue()).g.e(getViewLifecycleOwner(), new eqb(8, new lsb(7, this, u6eVar)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        znc zncVar = (znc) this.s.getValue();
        xw3.L(un0.z(zncVar), null, null, new mj5(zncVar, ((Team) this.r.getValue()).getId(), (rq3) null, 7), 3);
    }
}
