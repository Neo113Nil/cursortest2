package com.sofascore.results.mma.fightNight;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.mma.fightNight.MmaFightNightFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.a52;
import defpackage.ad2;
import defpackage.ao2;
import defpackage.b1d;
import defpackage.beh;
import defpackage.duf;
import defpackage.e6b;
import defpackage.eqb;
import defpackage.g08;
import defpackage.ida;
import defpackage.jmc;
import defpackage.joa;
import defpackage.krk;
import defpackage.llc;
import defpackage.ly7;
import defpackage.mqi;
import defpackage.oo8;
import defpackage.otk;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.u6b;
import defpackage.umc;
import defpackage.un0;
import defpackage.va8;
import defpackage.vmc;
import defpackage.wca;
import defpackage.wya;
import defpackage.xw3;
import defpackage.ymc;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/mma/fightNight/MmaFightNightFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaFightNightFragment extends Hilt_MmaFightNightFragment<oo8> {
    public final otk r;
    public final mqi s;
    public final mqi t;
    public final mqi u;

    public MmaFightNightFragment() {
        final int i = 1;
        final int i2 = 2;
        joa a = ypa.a(ysa.c, new jmc(new jmc(this, 1), 2));
        this.r = new otk(duf.a.getOrCreateKotlinClass(vmc.class), new llc(a, 3), new wya(10, this, a), new llc(a, 4));
        final int i3 = 0;
        this.s = ypa.b(new Function0(this) { // from class: tmc
            public final /* synthetic */ MmaFightNightFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                MmaFightNightFragment mmaFightNightFragment = this.b;
                switch (i4) {
                    case 0:
                        Bundle requireArguments = mmaFightNightFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_TOURNAMENT", Tournament.class);
                        if (M != null) {
                            return (Tournament) M;
                        }
                        a70.p("Serializable ARG_TOURNAMENT not found");
                        return null;
                    case 1:
                        Bundle requireArguments2 = mmaFightNightFragment.requireArguments();
                        requireArguments2.getClass();
                        Serializable M2 = gz8.M(requireArguments2, "MMA_FIGHT_NIGHT_FRAGMENT_TYPE", g08.class);
                        if (M2 instanceof g08) {
                            return (g08) M2;
                        }
                        return null;
                    default:
                        Context requireContext = mmaFightNightFragment.requireContext();
                        requireContext.getClass();
                        g08 g08Var = (g08) mmaFightNightFragment.t.getValue();
                        UniqueTournament uniqueTournament = ((Tournament) mmaFightNightFragment.s.getValue()).getUniqueTournament();
                        return new ymc(requireContext, g08Var, (uniqueTournament != null ? uniqueTournament.getId() : 0) == 19906);
                }
            }
        });
        this.t = ypa.b(new Function0(this) { // from class: tmc
            public final /* synthetic */ MmaFightNightFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i;
                MmaFightNightFragment mmaFightNightFragment = this.b;
                switch (i4) {
                    case 0:
                        Bundle requireArguments = mmaFightNightFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_TOURNAMENT", Tournament.class);
                        if (M != null) {
                            return (Tournament) M;
                        }
                        a70.p("Serializable ARG_TOURNAMENT not found");
                        return null;
                    case 1:
                        Bundle requireArguments2 = mmaFightNightFragment.requireArguments();
                        requireArguments2.getClass();
                        Serializable M2 = gz8.M(requireArguments2, "MMA_FIGHT_NIGHT_FRAGMENT_TYPE", g08.class);
                        if (M2 instanceof g08) {
                            return (g08) M2;
                        }
                        return null;
                    default:
                        Context requireContext = mmaFightNightFragment.requireContext();
                        requireContext.getClass();
                        g08 g08Var = (g08) mmaFightNightFragment.t.getValue();
                        UniqueTournament uniqueTournament = ((Tournament) mmaFightNightFragment.s.getValue()).getUniqueTournament();
                        return new ymc(requireContext, g08Var, (uniqueTournament != null ? uniqueTournament.getId() : 0) == 19906);
                }
            }
        });
        this.u = ypa.b(new Function0(this) { // from class: tmc
            public final /* synthetic */ MmaFightNightFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                MmaFightNightFragment mmaFightNightFragment = this.b;
                switch (i4) {
                    case 0:
                        Bundle requireArguments = mmaFightNightFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_TOURNAMENT", Tournament.class);
                        if (M != null) {
                            return (Tournament) M;
                        }
                        a70.p("Serializable ARG_TOURNAMENT not found");
                        return null;
                    case 1:
                        Bundle requireArguments2 = mmaFightNightFragment.requireArguments();
                        requireArguments2.getClass();
                        Serializable M2 = gz8.M(requireArguments2, "MMA_FIGHT_NIGHT_FRAGMENT_TYPE", g08.class);
                        if (M2 instanceof g08) {
                            return (g08) M2;
                        }
                        return null;
                    default:
                        Context requireContext = mmaFightNightFragment.requireContext();
                        requireContext.getClass();
                        g08 g08Var = (g08) mmaFightNightFragment.t.getValue();
                        UniqueTournament uniqueTournament = ((Tournament) mmaFightNightFragment.s.getValue()).getUniqueTournament();
                        return new ymc(requireContext, g08Var, (uniqueTournament != null ? uniqueTournament.getId() : 0) == 19906);
                }
            }
        });
    }

    public final ymc C() {
        return (ymc) this.u.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        g08 g08Var = (g08) this.t.getValue();
        int i = g08Var == null ? -1 : umc.a[g08Var.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "FightsTab" : "EarlyPrelimsTab" : "PrelimsTab" : "MainCardTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
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
        krk krkVar4 = this.l;
        krkVar4.getClass();
        RecyclerView recyclerView2 = ((oo8) krkVar4).d;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView2.setPaddingRelative(recyclerView2.getPaddingStart(), ao2.s(4, requireContext2), recyclerView2.getPaddingEnd(), recyclerView2.getPaddingBottom());
        ((vmc) this.r.getValue()).g.e(getViewLifecycleOwner(), new eqb(5, new ida(this, 29)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        vmc vmcVar = (vmc) this.r.getValue();
        mqi mqiVar = this.s;
        UniqueTournament uniqueTournament = ((Tournament) mqiVar.getValue()).getUniqueTournament();
        int id = uniqueTournament != null ? uniqueTournament.getId() : 0;
        int id2 = ((Tournament) mqiVar.getValue()).getId();
        g08 g08Var = (g08) this.t.getValue();
        xw3.L(un0.z(vmcVar), null, null, new ly7(vmcVar, id, id2, g08Var != null ? g08Var.a : Season.YEAR_ALL_TIME, (rq3) null), 3);
    }
}
