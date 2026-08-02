package com.sofascore.results.player.statistics.regular;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.SeasonKt;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentSeasons;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import defpackage.ao2;
import defpackage.awe;
import defpackage.bte;
import defpackage.bwe;
import defpackage.cwe;
import defpackage.dsi;
import defpackage.duf;
import defpackage.dwe;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.eqb;
import defpackage.esk;
import defpackage.ewe;
import defpackage.f5k;
import defpackage.fuf;
import defpackage.fzg;
import defpackage.g7;
import defpackage.gme;
import defpackage.gv9;
import defpackage.hse;
import defpackage.hwe;
import defpackage.j29;
import defpackage.j58;
import defpackage.joa;
import defpackage.jp5;
import defpackage.jpe;
import defpackage.k13;
import defpackage.km5;
import defpackage.krk;
import defpackage.l6g;
import defpackage.mqi;
import defpackage.mwe;
import defpackage.n9e;
import defpackage.nwe;
import defpackage.otk;
import defpackage.oxh;
import defpackage.ple;
import defpackage.qa7;
import defpackage.rq3;
import defpackage.s1h;
import defpackage.ss5;
import defpackage.tc3;
import defpackage.tue;
import defpackage.un0;
import defpackage.vce;
import defpackage.vp9;
import defpackage.vr1;
import defpackage.vwe;
import defpackage.vxc;
import defpackage.wrf;
import defpackage.wyh;
import defpackage.x2e;
import defpackage.xre;
import defpackage.xve;
import defpackage.xw3;
import defpackage.yea;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.yq8;
import defpackage.ysa;
import defpackage.yve;
import defpackage.z8e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/player/statistics/regular/PlayerSeasonStatisticsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lyq8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlayerSeasonStatisticsFragment extends Hilt_PlayerSeasonStatisticsFragment<yq8> {
    public final mqi A;
    public final mqi B;
    public final mqi C;
    public final mqi D;
    public final joa E;
    public final joa F;
    public final mqi G;
    public final joa H;
    public final HashMap I;
    public final HashMap J;
    public final e1d K;
    public final e1d L;
    public final e1d M;
    public final e1d N;
    public final e1d O;
    public final e1d P;
    public String Q;
    public String R;
    public awe S;
    public final e1d T;
    public final mqi U;
    public final otk r;
    public final otk s;
    public final otk t;
    public final mqi u;
    public final mqi v;
    public final mqi w;
    public final mqi x;
    public final mqi y;
    public final j29 z;

    public PlayerSeasonStatisticsFragment() {
        hwe hweVar = new hwe(this, 6);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new vce(hweVar, 10));
        fuf fufVar = duf.a;
        int i = 1;
        this.r = new otk(fufVar.getOrCreateKotlinClass(nwe.class), new x2e(a, 13), new bte(this, a, i), new x2e(a, 14));
        this.s = new otk(fufVar.getOrCreateKotlinClass(ple.class), new hwe(this, 0), new hwe(this, 2), new hwe(this, 1));
        this.t = new otk(fufVar.getOrCreateKotlinClass(dsi.class), new hwe(this, 3), new hwe(this, 5), new hwe(this, 4));
        this.u = ypa.b(new cwe(this, 9));
        this.v = ypa.b(new cwe(this, 15));
        this.w = ypa.b(new cwe(this, 0));
        this.x = ypa.b(new cwe(this, i));
        this.y = ypa.b(new cwe(this, 2));
        this.z = new j29(Integer.valueOf(R.drawable.no_statistics), Integer.valueOf(R.string.no_statistics), Integer.valueOf(R.string.no_statistics_text), 497);
        this.A = ypa.b(new cwe(this, 3));
        this.B = ypa.b(new cwe(this, 4));
        this.C = ypa.b(new cwe(this, 5));
        this.D = ypa.b(new cwe(this, 6));
        this.E = ypa.a(ysaVar, new cwe(this, 7));
        this.F = ypa.a(ysaVar, new cwe(this, 10));
        this.G = ypa.b(new cwe(this, 11));
        this.H = n9e.M(new cwe(this, 12), new cwe(this, 13));
        this.I = new HashMap();
        this.J = new HashMap();
        km5 km5Var = km5.a;
        this.K = e.f(km5Var);
        this.L = e.f(km5Var);
        this.M = e.f(null);
        this.N = e.f(null);
        this.O = e.f(null);
        this.P = e.f(Boolean.TRUE);
        this.Q = "";
        this.T = e.f(null);
        this.U = ypa.b(new cwe(this, 14));
    }

    public final vwe C() {
        return (vwe) this.u.getValue();
    }

    public final xre D() {
        return (xre) this.H.getValue();
    }

    public final yve E() {
        String H = H();
        if (Intrinsics.c(H, Sports.BASKETBALL)) {
            return (vr1) this.E.getValue();
        }
        if (Intrinsics.c(H, Sports.ICE_HOCKEY)) {
            return (vp9) this.F.getValue();
        }
        return null;
    }

    public final Season F() {
        return (Season) ((eoh) this.N).getValue();
    }

    public final fzg G() {
        return (fzg) ((eoh) this.O).getValue();
    }

    public final String H() {
        Sport sport;
        Team team = ((Player) this.v.getValue()).getTeam();
        if (team == null || (sport = team.getSport()) == null) {
            return null;
        }
        return sport.getSlug();
    }

    public final SegmentedButtonsView I() {
        return (SegmentedButtonsView) this.D.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6, types: [km5] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Iterable] */
    public final void K() {
        ?? r2;
        otk otkVar = this.s;
        ple pleVar = (ple) otkVar.getValue();
        UniqueTournament uniqueTournament = (UniqueTournament) ((eoh) this.M).getValue();
        pleVar.m = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
        ple pleVar2 = (ple) otkVar.getValue();
        Season F = F();
        pleVar2.n = F != null ? Integer.valueOf(F.getId()) : null;
        Season F2 = F();
        List list = (List) this.J.get(F2 != null ? Integer.valueOf(F2.getId()) : null);
        if (list != null) {
            r2 = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r2.add(((Season.SubSeasonType) it.next()).getLabel());
            }
        } else {
            r2 = km5.a;
        }
        jp5 entries = Season.SubSeasonType.getEntries();
        ArrayList arrayList = new ArrayList(k13.r(entries, 10));
        Iterator it2 = entries.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Season.SubSeasonType) it2.next()).getLabel());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : r2) {
            if (arrayList.contains((String) obj)) {
                arrayList2.add(obj);
            }
        }
        List<String> H0 = CollectionsKt.H0(arrayList2, new ss5(arrayList, 1));
        I().setFallbackToLabel(Boolean.FALSE);
        SegmentedButtonsView I = I();
        ArrayList arrayList3 = new ArrayList(k13.r(H0, 10));
        for (String str : H0) {
            Set set = f5k.a;
            Context requireContext = requireContext();
            requireContext.getClass();
            arrayList3.add(new s1h(str, f5k.b(requireContext, str, H()), true));
        }
        I.s(arrayList3, this.R, true);
        esk eskVar = I.d;
        this.R = null;
        ComposeView composeView = eskVar.a;
        ViewGroup.LayoutParams layoutParams = composeView.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
        ViewGroup.LayoutParams layoutParams2 = composeView.getLayoutParams();
        int marginEnd = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0;
        ViewGroup.LayoutParams layoutParams3 = composeView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
        ViewGroup.LayoutParams layoutParams4 = composeView.getLayoutParams();
        if (layoutParams4 == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
        marginLayoutParams2.setMarginStart(marginStart);
        marginLayoutParams2.topMargin = 0;
        marginLayoutParams2.setMarginEnd(marginEnd);
        marginLayoutParams2.bottomMargin = i;
        composeView.setLayoutParams(marginLayoutParams2);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return yq8.a(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        Set set = wyh.a;
        String H = H();
        return (CollectionsKt.R(wyh.m, H) || Intrinsics.c(H, Sports.RUGBY)) ? "SeasonTab" : "StatisticsTab";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0309  */
    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(View view, Bundle bundle) {
        List<fzg> list;
        String H;
        xre D;
        xre D2;
        HashMap hashMap;
        Object obj;
        Object obj2;
        l();
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((yq8) krkVar).d;
        swipeRefreshLayout.getClass();
        rq3 rq3Var = null;
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((yq8) krkVar2).c;
        recyclerView.setItemAnimator(null);
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        recyclerView.setAdapter(C());
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), ao2.s(4, requireContext2), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
        int i = 0;
        wrf.a(recyclerView, new bwe(this, i));
        vwe C = C();
        ewe eweVar = new ewe(this, i);
        C.getClass();
        C.a.d = eweVar;
        StatisticsSeasonsResponse statisticsSeasonsResponse = (StatisticsSeasonsResponse) this.y.getValue();
        e1d e1dVar = this.K;
        j29 j29Var = this.z;
        if (statisticsSeasonsResponse != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = statisticsSeasonsResponse.getUniqueTournamentSeasons().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = this.I;
                if (!hasNext) {
                    break;
                }
                UniqueTournamentSeasons uniqueTournamentSeasons = (UniqueTournamentSeasons) it.next();
                arrayList.add(uniqueTournamentSeasons.getUniqueTournament());
                hashMap.put(Integer.valueOf(uniqueTournamentSeasons.getUniqueTournament().getId()), uniqueTournamentSeasons.getSeasons());
            }
            ((eoh) e1dVar).setValue(arrayList);
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                int id = ((UniqueTournament) obj).getId();
                Integer num = (Integer) this.w.getValue();
                if (num != null && id == num.intValue()) {
                    break;
                }
            }
            UniqueTournament uniqueTournament = (UniqueTournament) obj;
            if (uniqueTournament == null) {
                uniqueTournament = (UniqueTournament) CollectionsKt.firstOrNull(arrayList);
            }
            e1d e1dVar2 = this.M;
            ((eoh) e1dVar2).setValue(uniqueTournament);
            UniqueTournament uniqueTournament2 = (UniqueTournament) ((eoh) e1dVar2).getValue();
            Object obj3 = (List) hashMap.get(uniqueTournament2 != null ? Integer.valueOf(uniqueTournament2.getId()) : null);
            if (obj3 == null) {
                obj3 = km5.a;
            }
            e1d e1dVar3 = this.L;
            ((eoh) e1dVar3).setValue(obj3);
            Iterator it3 = ((List) ((eoh) e1dVar3).getValue()).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                int id2 = ((Season) obj2).getId();
                Integer num2 = (Integer) this.x.getValue();
                if (num2 != null && id2 == num2.intValue()) {
                    break;
                }
            }
            Season season = (Season) obj2;
            if (season == null) {
                season = (Season) CollectionsKt.firstOrNull((List) ((eoh) e1dVar3).getValue());
            }
            ((eoh) this.N).setValue(season);
            Map<Integer, Map<Integer, List<String>>> typesMap = statisticsSeasonsResponse.getTypesMap();
            if (typesMap != null) {
                Iterator<Map.Entry<Integer, Map<Integer, List<String>>>> it4 = typesMap.entrySet().iterator();
                while (it4.hasNext()) {
                    for (Map.Entry<Integer, List<String>> entry : it4.next().getValue().entrySet()) {
                        this.J.put(entry.getKey(), SeasonKt.mapToSubSeasonType(entry.getValue()));
                    }
                }
            }
            if (((List) ((eoh) e1dVar).getValue()).isEmpty()) {
                C().F(a.c(j29Var));
            }
            K();
        } else {
            C().F(a.c(j29Var));
        }
        if (!((List) ((eoh) e1dVar).getValue()).isEmpty()) {
            krk krkVar3 = this.l;
            krkVar3.getClass();
            LinearLayout linearLayout = ((yq8) krkVar3).b;
            mqi mqiVar = this.A;
            linearLayout.addView(((vxc) mqiVar.getValue()).a);
            krk krkVar4 = this.l;
            krkVar4.getClass();
            ((yq8) krkVar4).b.addView(I());
            vxc vxcVar = (vxc) mqiVar.getValue();
            ComposeView composeView = vxcVar.c;
            ComposeView composeView2 = vxcVar.e;
            composeView.setContent(new tc3(1023370851, new dwe(this, i), true));
            vxcVar.d.setContent(new tc3(-113143860, new dwe(this, 1), true));
            jpe jpeVar = fzg.c;
            String H2 = H();
            jpeVar.getClass();
            if (H2 != null) {
                switch (H2.hashCode()) {
                    case -1160328212:
                        if (H2.equals(Sports.VOLLEYBALL)) {
                            list = b.j(fzg.f, fzg.e);
                            break;
                        }
                        break;
                    case -83759494:
                        if (H2.equals(Sports.AMERICAN_FOOTBALL)) {
                            list = b.j(fzg.f, fzg.e);
                            break;
                        }
                        break;
                    case 108869083:
                        if (H2.equals(Sports.RUGBY)) {
                            list = b.j(fzg.f, fzg.e);
                            break;
                        }
                        break;
                    case 727149765:
                        if (H2.equals(Sports.BASKETBALL)) {
                            list = b.j(fzg.d, fzg.e, fzg.f);
                            break;
                        }
                        break;
                }
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                    for (fzg fzgVar : list) {
                        arrayList2.add(new oxh(fzgVar, getString(fzgVar.b), null, null, null, false, 252));
                    }
                    gv9 W = l6g.W(arrayList2);
                    fzg fzgVar2 = (fzg) CollectionsKt.firstOrNull(list);
                    if (fzgVar2 == null) {
                        fzgVar2 = fzg.d;
                    }
                    ((eoh) this.O).setValue(fzgVar2);
                    composeView2.setVisibility(0);
                    composeView2.setContent(new tc3(-1229317380, new gme(8, W, this), true));
                }
                H = H();
                if (H != null) {
                    int hashCode = H.hashCode();
                    mqi mqiVar2 = this.C;
                    switch (hashCode) {
                        case -2002238939:
                            if (H.equals(Sports.ICE_HOCKEY)) {
                                r1.p(C().g.size(), (vp9) this.F.getValue());
                                break;
                            }
                            break;
                        case -1160328212:
                            if (H.equals(Sports.VOLLEYBALL) && (D = D()) != null) {
                                r3.p(C().g.size(), D);
                                break;
                            }
                            break;
                        case 108869083:
                            if (H.equals(Sports.RUGBY) && (D2 = D()) != null) {
                                r3.p(C().g.size(), D2);
                                break;
                            }
                            break;
                        case 394668909:
                            if (H.equals(Sports.FOOTBALL)) {
                                vwe C2 = C();
                                hse hseVar = (hse) mqiVar2.getValue();
                                View childAt = hseVar.getChildAt(0);
                                if (childAt != null) {
                                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                    if (layoutParams == null) {
                                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                        return;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                    int marginStart = marginLayoutParams.getMarginStart();
                                    int marginEnd = marginLayoutParams.getMarginEnd();
                                    int i2 = marginLayoutParams.bottomMargin;
                                    marginLayoutParams.setMarginStart(marginStart);
                                    marginLayoutParams.topMargin = 0;
                                    marginLayoutParams.setMarginEnd(marginEnd);
                                    marginLayoutParams.bottomMargin = i2;
                                    childAt.setLayoutParams(marginLayoutParams);
                                }
                                C2.p(C2.g.size(), hseVar);
                                r1.p(C().g.size(), (xve) this.B.getValue());
                                g7.o(C(), (tue) this.G.getValue(), 6);
                                break;
                            }
                            break;
                        case 727149765:
                            if (H.equals(Sports.BASKETBALL)) {
                                yea yeaVar = j58.a;
                                if (j58.k()) {
                                    r1.p(C().g.size(), (hse) mqiVar2.getValue());
                                }
                                r1.p(C().g.size(), (vr1) this.E.getValue());
                                xre D3 = D();
                                if (D3 != null) {
                                    r3.p(C().g.size(), D3);
                                    break;
                                }
                            }
                            break;
                    }
                }
            }
            list = null;
            if (list != null) {
            }
            H = H();
            if (H != null) {
            }
        }
        ((nwe) this.r.getValue()).h.e(getViewLifecycleOwner(), new eqb(13, new bwe(this, 5)));
        z8e.y(this, ((ple) this.s.getValue()).y, new qa7(this, rq3Var, 29));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        e1d e1dVar = this.M;
        if (((UniqueTournament) ((eoh) e1dVar).getValue()) == null || F() == null || this.Q.length() <= 0) {
            return;
        }
        String H = H();
        UniqueTournament uniqueTournament = (UniqueTournament) ((eoh) e1dVar).getValue();
        Integer valueOf = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
        Season F = F();
        Integer valueOf2 = F != null ? Integer.valueOf(F.getId()) : null;
        if (H == null || valueOf == null || valueOf2 == null) {
            return;
        }
        int intValue = valueOf2.intValue();
        int intValue2 = valueOf.intValue();
        Player player = (Player) this.v.getValue();
        String str = this.Q;
        Season F2 = F();
        awe aweVar = new awe(player, intValue2, intValue, str, H, F2 != null ? F2.getYear() : null);
        awe aweVar2 = this.S;
        if (aweVar2 != null && aweVar2.equals(aweVar)) {
            n();
            return;
        }
        ((hse) this.C.getValue()).r(null, null);
        ((xve) this.B.getValue()).setVisibility(8);
        yve E = E();
        if (E != null) {
            E.setVisibility(8);
        }
        xre D = D();
        if (D != null) {
            D.setVisibility(8);
        }
        ((tue) this.G.getValue()).setVisibility(8);
        C().s();
        nwe nweVar = (nwe) this.r.getValue();
        xw3.L(un0.z(nweVar), null, null, new mwe(aweVar, nweVar, null), 3);
        this.S = aweVar;
    }
}
