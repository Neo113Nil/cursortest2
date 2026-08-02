package com.sofascore.results.team.standings;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.local_persistance.BrandingTeam;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.team.standings.TeamStandingsFragment;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bte;
import defpackage.duf;
import defpackage.e1d;
import defpackage.e6b;
import defpackage.eoh;
import defpackage.fwi;
import defpackage.h2j;
import defpackage.hai;
import defpackage.i2j;
import defpackage.ioe;
import defpackage.jai;
import defpackage.joa;
import defpackage.jtd;
import defpackage.k0;
import defpackage.km5;
import defpackage.krk;
import defpackage.l2j;
import defpackage.lm5;
import defpackage.mqi;
import defpackage.o1i;
import defpackage.oo8;
import defpackage.otk;
import defpackage.pyn;
import defpackage.qai;
import defpackage.tai;
import defpackage.tc3;
import defpackage.tz9;
import defpackage.un0;
import defpackage.uri;
import defpackage.vxc;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.zni;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/team/standings/TeamStandingsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamStandingsFragment extends Hilt_TeamStandingsFragment<oo8> {
    public final e1d A;
    public final mqi B;
    public final otk r;
    public final joa s;
    public final joa t;
    public final mqi u;
    public final mqi v;
    public Map w;
    public final e1d x;
    public final e1d y;
    public final e1d z;

    public TeamStandingsFragment() {
        int i = 27;
        o1i o1iVar = new o1i(this, i);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new o1i(o1iVar, 28));
        this.r = new otk(duf.a.getOrCreateKotlinClass(l2j.class), new fwi(a, 13), new bte(this, a, i), new fwi(a, 14));
        this.s = ypa.a(ysaVar, new h2j(this, 2));
        this.t = ypa.a(ysaVar, new h2j(this, 3));
        this.u = ypa.b(new h2j(this, 4));
        this.v = ypa.b(new h2j(this, 5));
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.w = lm5Var;
        km5 km5Var = km5.a;
        this.x = e.f(km5Var);
        this.y = e.f(km5Var);
        this.z = e.f(null);
        this.A = e.f(null);
        this.B = ypa.b(new h2j(this, 0));
    }

    public final jai C() {
        return (jai) this.v.getValue();
    }

    public final Team D() {
        return (Team) this.s.getValue();
    }

    public final l2j E() {
        return (l2j) this.r.getValue();
    }

    public final void F() {
        jai C = C();
        ArrayList arrayList = C.i;
        arrayList.getClass();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            next.getClass();
            if (next instanceof tai) {
                break;
            } else {
                i++;
            }
        }
        Integer valueOf = i == -1 ? null : Integer.valueOf(i);
        if (valueOf != null) {
            C.notifyItemChanged(valueOf.intValue());
        }
        C.s();
        u();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        C().notifyDataSetChanged();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "StandingsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getClass();
        requireActivity.addMenuProvider(new k0(this, 15), getViewLifecycleOwner(), e6b.e);
        final boolean G = tz9.G((BrandingTeam) this.t.getValue());
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView2 = ((oo8) krkVar3).d;
        jai C = C();
        hai[] haiVarArr = hai.a;
        krk krkVar4 = this.l;
        krkVar4.getClass();
        recyclerView2.addItemDecoration(new qai(C, ((oo8) krkVar4).d, C().u, G));
        jai C2 = C();
        uri uriVar = new uri(this, 5);
        C2.getClass();
        C2.a.d = uriVar;
        final int i = 1;
        C2.w = new h2j(this, i);
        jtd.a(view, new pyn(21, view, this));
        jai C3 = C();
        mqi mqiVar = this.B;
        ConstraintLayout constraintLayout = ((vxc) mqiVar.getValue()).a;
        constraintLayout.getClass();
        C3.p(C3.g.size(), constraintLayout);
        if (G) {
            ((vxc) mqiVar.getValue()).a.setBackground(null);
        }
        final int i2 = 0;
        ((vxc) mqiVar.getValue()).c.setContent(new tc3(415828741, new Function2(this) { // from class: j2j
            public final /* synthetic */ TeamStandingsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i3 = i2;
                a99 a99Var = nf3.a;
                Object obj3 = null;
                boolean z = G;
                TeamStandingsFragment teamStandingsFragment = this.b;
                switch (i3) {
                    case 0:
                        of3 of3Var = (of3) obj;
                        int intValue = ((Integer) obj2).intValue();
                        av8 av8Var = (av8) of3Var;
                        if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                            av8Var.d0(179463532);
                            List<UniqueTournament> list = (List) ((eoh) teamStandingsFragment.x).getValue();
                            ArrayList arrayList = new ArrayList(k13.r(list, 10));
                            for (UniqueTournament uniqueTournament : list) {
                                arrayList.add(new oxh(uniqueTournament, tba.x(uniqueTournament), yqo.H(-443423106, av8Var, new fwe(uniqueTournament, 2)), null, null, false, 248));
                            }
                            av8Var.s(false);
                            gv9 W = l6g.W(arrayList);
                            uxh uxhVar = z ? rxh.i : sxh.i;
                            Iterator<E> it = W.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (Intrinsics.c(((oxh) next).a, (UniqueTournament) ((eoh) teamStandingsFragment.z).getValue())) {
                                        obj3 = next;
                                    }
                                }
                            }
                            oxh oxhVar = (oxh) obj3;
                            boolean i4 = av8Var.i(teamStandingsFragment);
                            Object O = av8Var.O();
                            if (i4 || O == a99Var) {
                                O = new i2j(teamStandingsFragment, 0);
                                av8Var.n0(O);
                            }
                            r4a.j(W, oxhVar, (Function1) O, null, uxhVar, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 1000);
                        } else {
                            av8Var.W();
                        }
                        break;
                    default:
                        of3 of3Var2 = (of3) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        av8 av8Var2 = (av8) of3Var2;
                        if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                            List<Season> list2 = (List) ((eoh) teamStandingsFragment.y).getValue();
                            ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                            for (Season season : list2) {
                                arrayList2.add(new oxh(season, season.getYear(), null, null, null, false, 252));
                            }
                            gv9 W2 = l6g.W(arrayList2);
                            uxh uxhVar2 = z ? rxh.i : sxh.i;
                            Iterator<E> it2 = W2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    if (Intrinsics.c(((oxh) next2).a, (Season) ((eoh) teamStandingsFragment.A).getValue())) {
                                        obj3 = next2;
                                    }
                                }
                            }
                            oxh oxhVar2 = (oxh) obj3;
                            boolean i5 = av8Var2.i(teamStandingsFragment);
                            Object O2 = av8Var2.O();
                            if (i5 || O2 == a99Var) {
                                O2 = new i2j(teamStandingsFragment, 1);
                                av8Var2.n0(O2);
                            }
                            r4a.j(W2, oxhVar2, (Function1) O2, null, uxhVar2, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 1000);
                        } else {
                            av8Var2.W();
                        }
                        break;
                }
                return Unit.a;
            }
        }, true));
        ((vxc) mqiVar.getValue()).d.setContent(new tc3(1290217198, new Function2(this) { // from class: j2j
            public final /* synthetic */ TeamStandingsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i3 = i;
                a99 a99Var = nf3.a;
                Object obj3 = null;
                boolean z = G;
                TeamStandingsFragment teamStandingsFragment = this.b;
                switch (i3) {
                    case 0:
                        of3 of3Var = (of3) obj;
                        int intValue = ((Integer) obj2).intValue();
                        av8 av8Var = (av8) of3Var;
                        if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                            av8Var.d0(179463532);
                            List<UniqueTournament> list = (List) ((eoh) teamStandingsFragment.x).getValue();
                            ArrayList arrayList = new ArrayList(k13.r(list, 10));
                            for (UniqueTournament uniqueTournament : list) {
                                arrayList.add(new oxh(uniqueTournament, tba.x(uniqueTournament), yqo.H(-443423106, av8Var, new fwe(uniqueTournament, 2)), null, null, false, 248));
                            }
                            av8Var.s(false);
                            gv9 W = l6g.W(arrayList);
                            uxh uxhVar = z ? rxh.i : sxh.i;
                            Iterator<E> it = W.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (Intrinsics.c(((oxh) next).a, (UniqueTournament) ((eoh) teamStandingsFragment.z).getValue())) {
                                        obj3 = next;
                                    }
                                }
                            }
                            oxh oxhVar = (oxh) obj3;
                            boolean i4 = av8Var.i(teamStandingsFragment);
                            Object O = av8Var.O();
                            if (i4 || O == a99Var) {
                                O = new i2j(teamStandingsFragment, 0);
                                av8Var.n0(O);
                            }
                            r4a.j(W, oxhVar, (Function1) O, null, uxhVar, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 1000);
                        } else {
                            av8Var.W();
                        }
                        break;
                    default:
                        of3 of3Var2 = (of3) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        av8 av8Var2 = (av8) of3Var2;
                        if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                            List<Season> list2 = (List) ((eoh) teamStandingsFragment.y).getValue();
                            ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                            for (Season season : list2) {
                                arrayList2.add(new oxh(season, season.getYear(), null, null, null, false, 252));
                            }
                            gv9 W2 = l6g.W(arrayList2);
                            uxh uxhVar2 = z ? rxh.i : sxh.i;
                            Iterator<E> it2 = W2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    if (Intrinsics.c(((oxh) next2).a, (Season) ((eoh) teamStandingsFragment.A).getValue())) {
                                        obj3 = next2;
                                    }
                                }
                            }
                            oxh oxhVar2 = (oxh) obj3;
                            boolean i5 = av8Var2.i(teamStandingsFragment);
                            Object O2 = av8Var2.O();
                            if (i5 || O2 == a99Var) {
                                O2 = new i2j(teamStandingsFragment, 1);
                                av8Var2.n0(O2);
                            }
                            r4a.j(W2, oxhVar2, (Function1) O2, null, uxhVar2, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 1000);
                        } else {
                            av8Var2.W();
                        }
                        break;
                }
                return Unit.a;
            }
        }, true));
        l2j E = E();
        E.i.e(getViewLifecycleOwner(), new ioe(25, new i2j(this, 3)));
        E.p.e(getViewLifecycleOwner(), new ioe(25, new i2j(this, 4)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        n();
        if (((List) ((eoh) this.x).getValue()).isEmpty()) {
            l2j E = E();
            xw3.L(un0.z(E), null, null, new zni(E, D().getId(), null, 2), 3);
            return;
        }
        UniqueTournament uniqueTournament = (UniqueTournament) ((eoh) this.z).getValue();
        Season season = (Season) ((eoh) this.A).getValue();
        if (uniqueTournament == null || season == null) {
            return;
        }
        E().u(uniqueTournament.getId(), season.getId(), uniqueTournament.getCategory().getSport().getSlug(), Integer.valueOf(D().getId()), StringsKt.toIntOrNull(season.getYear()));
    }
}
