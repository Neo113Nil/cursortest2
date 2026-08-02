package com.sofascore.results.player.statistics.career;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsInfo;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.player.statistics.career.modal.CareerStatsFilterModal;
import com.sofascore.results.player.statistics.career.modal.b;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.aba;
import defpackage.apa;
import defpackage.bme;
import defpackage.cme;
import defpackage.d81;
import defpackage.dme;
import defpackage.dsi;
import defpackage.duf;
import defpackage.e1d;
import defpackage.e81;
import defpackage.eme;
import defpackage.eoh;
import defpackage.eyd;
import defpackage.fuf;
import defpackage.fzg;
import defpackage.g7;
import defpackage.gv9;
import defpackage.hkg;
import defpackage.hme;
import defpackage.joa;
import defpackage.jp1;
import defpackage.k13;
import defpackage.kl2;
import defpackage.km5;
import defpackage.krk;
import defpackage.kse;
import defpackage.lk2;
import defpackage.mj5;
import defpackage.mk2;
import defpackage.mme;
import defpackage.mqi;
import defpackage.n9e;
import defpackage.nk2;
import defpackage.nme;
import defpackage.o13;
import defpackage.ok2;
import defpackage.ome;
import defpackage.ord;
import defpackage.otk;
import defpackage.pk2;
import defpackage.ple;
import defpackage.r9k;
import defpackage.rq3;
import defpackage.s1h;
import defpackage.tc3;
import defpackage.un0;
import defpackage.vj1;
import defpackage.vk2;
import defpackage.vle;
import defpackage.vt2;
import defpackage.wj1;
import defpackage.wk2;
import defpackage.wle;
import defpackage.wxc;
import defpackage.wyh;
import defpackage.xbb;
import defpackage.xq8;
import defpackage.xw3;
import defpackage.yid;
import defpackage.yk2;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yzc;
import defpackage.z1;
import defpackage.z71;
import defpackage.z8e;
import defpackage.zb9;
import defpackage.zle;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/results/player/statistics/career/PlayerCareerStatisticsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lxq8;", "Lcom/sofascore/results/player/statistics/career/modal/b;", "Lkl2;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlayerCareerStatisticsFragment extends Hilt_PlayerCareerStatisticsFragment<xq8> implements b, kl2 {
    public final joa A;
    public vle B;
    public final joa C;
    public final mqi D;
    public boolean E;
    public final mqi F;
    public CareerStatsFilterModal.CareerStatsFilterData G;
    public final e1d H;
    public final e1d I;
    public final e1d J;
    public final e1d K;
    public final HashMap L;
    public final joa M;
    public boolean N;
    public final otk r;
    public final otk s;
    public final otk t;
    public final joa u;
    public final joa v;
    public final joa w;
    public final joa x;
    public final joa y;
    public final joa z;

    public PlayerCareerStatisticsFragment() {
        fuf fufVar = duf.a;
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        this.r = new otk(fufVar.getOrCreateKotlinClass(ple.class), new hme(this, i), new hme(this, i3), new hme(this, i2));
        int i4 = 3;
        int i5 = 4;
        int i6 = 5;
        this.s = new otk(fufVar.getOrCreateKotlinClass(ome.class), new hme(this, i4), new hme(this, i6), new hme(this, i5));
        int i7 = 7;
        int i8 = 8;
        this.t = new otk(fufVar.getOrCreateKotlinClass(dsi.class), new hme(this, 6), new hme(this, i8), new hme(this, i7));
        dme dmeVar = new dme(this, i7);
        ysa ysaVar = ysa.c;
        this.u = ypa.a(ysaVar, dmeVar);
        this.v = ypa.a(ysaVar, new dme(this, 11));
        this.w = ypa.a(ysaVar, new dme(this, 12));
        this.x = n9e.M(new dme(this, 13), new dme(this, i));
        this.y = n9e.M(new apa(0, 5, PlayerCareerStatisticsFragment.class, this, "isBaseball", "isBaseball()Z"), new dme(this, i2));
        this.z = ypa.a(ysaVar, new dme(this, i3));
        this.A = n9e.M(new dme(this, i4), new dme(this, i5));
        this.C = ypa.a(ysaVar, new dme(this, i6));
        this.D = ypa.b(new dme(this, i8));
        this.F = ypa.b(new dme(this, 9));
        km5 km5Var = km5.a;
        this.H = e.f(km5Var);
        this.I = e.f(km5Var);
        this.J = e.f(null);
        this.K = e.f(null);
        this.L = new HashMap();
        this.M = ypa.a(ysaVar, new dme(this, 10));
    }

    public final ple C() {
        return (ple) this.r.getValue();
    }

    public final TypeHeaderView D() {
        return (TypeHeaderView) this.A.getValue();
    }

    public final CareerStatsFilterModal.CareerStatsFilterData E() {
        CareerStatsFilterModal.CareerStatsFilterData careerStatsFilterData = this.G;
        return careerStatsFilterData == null ? F() : careerStatsFilterData;
    }

    public final CareerStatsFilterModal.CareerStatsFilterData F() {
        return (CareerStatsFilterModal.CareerStatsFilterData) this.F.getValue();
    }

    public final int G() {
        List M = M();
        int i = 0;
        if (M != null && M.isEmpty()) {
            return 0;
        }
        Iterator it = M.iterator();
        while (it.hasNext()) {
            if (!Intrinsics.c(((UniqueTournament) it.next()).getCompetitionType(), wk2.j.a) && (i = i + 1) < 0) {
                kotlin.collections.b.p();
                throw null;
            }
        }
        return i;
    }

    public final PickerItem.Tournament H() {
        return (PickerItem.Tournament) ((eoh) this.J).getValue();
    }

    public final wxc I() {
        return (wxc) this.w.getValue();
    }

    public final String K() {
        Player player = C().l;
        if (player != null) {
            return player.getSportSlug();
        }
        return null;
    }

    public final bme L() {
        return (bme) this.v.getValue();
    }

    public final List M() {
        return (List) ((eoh) this.H).getValue();
    }

    public final ome N() {
        return (ome) this.s.getValue();
    }

    public final void O(boolean z) {
        TypeHeaderView D = D();
        if (D != null) {
            D.setVisibility(!z ? 0 : 8);
        }
        LinearLayout linearLayout = ((kse) this.C.getValue()).a;
        linearLayout.getClass();
        linearLayout.setVisibility(!z ? 0 : 8);
        krk krkVar = this.l;
        krkVar.getClass();
        ((xq8) krkVar).c.setVisibility(z ? 8 : 0);
        krk krkVar2 = this.l;
        mqi mqiVar = this.D;
        if (z) {
            krkVar2.getClass();
            if (((xq8) krkVar2).b.indexOfChild((GraphicLarge) mqiVar.getValue()) == -1) {
                krk krkVar3 = this.l;
                krkVar3.getClass();
                z8e.r(((xq8) krkVar3).b, (GraphicLarge) mqiVar.getValue(), false);
            }
        } else {
            krkVar2.getClass();
            ((xq8) krkVar2).b.removeView((GraphicLarge) mqiVar.getValue());
        }
        krk krkVar4 = this.l;
        krkVar4.getClass();
        ((xq8) krkVar4).b.requestLayout();
    }

    public final boolean P() {
        return Intrinsics.c(K(), Sports.BASEBALL);
    }

    public final void Q(int i) {
        Integer num;
        ScrollInterceptorHorizontalScrollView b = L().o.b();
        Integer num2 = null;
        int m = yid.m(b != null ? Integer.valueOf(b.getMaxScrollDistance()) : null);
        if (m > 0) {
            ScrollInterceptorHorizontalScrollView b2 = L().o.b();
            int m2 = yid.m(b2 != null ? Integer.valueOf(b2.getWidth()) : null);
            nme nmeVar = (nme) N().i.d();
            List list = nmeVar != null ? nmeVar.c : null;
            if (list == null) {
                list = km5.a;
            }
            float f = (i + (m2 / 2)) / (r2 + m);
            Context requireContext = requireContext();
            requireContext.getClass();
            if (hkg.c0(requireContext)) {
                f = 1.0f - f;
            }
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                i2 += ((nk2) it.next()).g().size();
            }
            int i3 = (int) (f * i2);
            int i4 = i2 - 1;
            if (i3 > i4) {
                i3 = i4;
            }
            TypeHeaderView D = D();
            int m3 = yid.m(D != null ? Integer.valueOf(D.getSelectedIndex()) : null);
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            boolean c0 = hkg.c0(requireContext2);
            if (i == 0) {
                num = Integer.valueOf(c0 ? list.size() - 1 : 0);
            } else if (i == m) {
                num = Integer.valueOf(c0 ? 0 : list.size() - 1);
            } else {
                Iterator it2 = list.iterator();
                int i5 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int i6 = r5 + 1;
                    nk2 nk2Var = (nk2) it2.next();
                    int i7 = r5 == m3 ? i5 - 2 : r5 == m3 + 1 ? i5 + 2 : i5;
                    i5 += nk2Var.g().size();
                    int i8 = r5 == m3 ? i5 + 2 : r5 == m3 + (-1) ? i5 - 2 : i5;
                    if (i7 <= i3 && i3 <= i8) {
                        num2 = Integer.valueOf(r5);
                        break;
                    }
                    r5 = i6;
                }
                num = num2;
            }
            if (num == null || num.intValue() == m3) {
                return;
            }
            TypeHeaderView D2 = D();
            if (D2 != null) {
                D2.setSelectedIndex(num.intValue());
            }
            nk2 nk2Var2 = (nk2) CollectionsKt.a0(num.intValue(), list);
            if (nk2Var2 != null) {
                T(((e81) nk2Var2).a);
            }
        }
    }

    public final void R() {
        Boolean bool;
        UniqueTournament uniqueTournament;
        int i = 0;
        this.E = false;
        this.N = true;
        PickerItem.Tournament H = H();
        Integer num = null;
        if (H != null) {
            bool = Boolean.valueOf(H.b != null);
        } else {
            bool = null;
        }
        if (Intrinsics.c(bool, Boolean.TRUE)) {
            PickerItem.Tournament H2 = H();
            if (H2 != null && (uniqueTournament = H2.b) != null) {
                num = Integer.valueOf(uniqueTournament.getId());
            }
            List list = (List) this.L.get(num);
            if (list == null) {
                list = km5.a;
            }
            ((eoh) this.I).setValue(list);
            ((eoh) this.K).setValue((Season.SubSeasonType) CollectionsKt.firstOrNull(list));
            ComposeView composeView = I().d;
            if (list.size() <= 1 && !list.contains(Season.SubSeasonType.REGULAR_SEASON) && !list.contains(Season.SubSeasonType.PLAYOFFS)) {
                i = 8;
            }
            composeView.setVisibility(i);
        } else {
            I().d.setVisibility(8);
        }
        u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x020a, code lost:
    
        if (r8 == null) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x059f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(PlayerCareerStatistics playerCareerStatistics) {
        Object obj;
        ok2 ok2Var;
        nme nmeVar;
        ome omeVar;
        String str;
        ome omeVar2;
        cme cmeVar;
        Gender gender;
        TypeHeaderView D;
        gv9 headerTypes;
        nme nmeVar2;
        Team team;
        Integer num;
        Integer num2;
        List seasons;
        wk2 wk2Var;
        if (playerCareerStatistics == null) {
            u();
            return;
        }
        String K = K();
        if (K != null) {
            List seasons2 = playerCareerStatistics.getSeasons();
            ArrayList arrayList = new ArrayList();
            Iterator it = seasons2.iterator();
            while (true) {
                boolean z = false;
                Boolean bool = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                UniqueTournament uniqueTournament = ((PlayerSeasonStatisticsInfo) next).getUniqueTournament();
                if (uniqueTournament != null) {
                    PickerItem.Tournament H = H();
                    if (H != null && (wk2Var = H.a) != null) {
                        bool = (Boolean) wk2Var.e.invoke(uniqueTournament);
                    }
                    z = Intrinsics.c(bool, Boolean.FALSE);
                }
                if (!z) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                PlayerSeasonStatisticsInfo playerSeasonStatisticsInfo = (PlayerSeasonStatisticsInfo) it2.next();
                List k = kotlin.collections.b.k(playerSeasonStatisticsInfo.getTeam());
                List<Team> previousTeams = playerSeasonStatisticsInfo.getPreviousTeams();
                if (previousTeams == null) {
                    previousTeams = km5.a;
                }
                o13.v(CollectionsKt.w0(previousTeams, k), arrayList2);
            }
            List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList2));
            int i = 1;
            if (!this.E) {
                this.E = true;
                if (playerCareerStatistics.getSeasons().size() > 1) {
                    CareerStatsFilterModal.CareerStatsFilterData F = F();
                    List seasons3 = playerCareerStatistics.getSeasons();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = seasons3.iterator();
                    while (it3.hasNext()) {
                        Integer startYear = ((PlayerSeasonStatisticsInfo) it3.next()).getStartYear();
                        if (startYear != null) {
                            arrayList3.add(startYear);
                        }
                    }
                    F.d = (Integer) CollectionsKt.p0(arrayList3);
                    CareerStatsFilterModal.CareerStatsFilterData F2 = F();
                    List seasons4 = playerCareerStatistics.getSeasons();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = seasons4.iterator();
                    while (it4.hasNext()) {
                        Integer endYear = ((PlayerSeasonStatisticsInfo) it4.next()).getEndYear();
                        if (endYear != null) {
                            arrayList4.add(endYear);
                        }
                    }
                    F2.e = (Integer) CollectionsKt.k0(arrayList4);
                } else {
                    F().d = null;
                    F().e = null;
                }
                CareerStatsFilterModal.CareerStatsFilterData E = E();
                E.a = null;
                E.b = vk2.c;
                E.d = F().d;
                E.e = F().e;
                U();
            }
            aba.y(I().b, 0, 3);
            I().b.setOnClickListener(new eyd(3, this, S0));
            Player player = C().l;
            List a = mk2.a(K, player != null ? player.getPosition() : null, playerCareerStatistics, E());
            if (a.isEmpty()) {
                O(true);
                return;
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : a) {
                if (obj2 instanceof e81) {
                    arrayList5.add(obj2);
                }
            }
            ArrayList arrayList6 = new ArrayList(k13.r(arrayList5, 10));
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                arrayList6.add(((e81) it5.next()).a.a);
            }
            List<wj1> S02 = CollectionsKt.S0(CollectionsKt.V0(arrayList6));
            joa joaVar = this.y;
            SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) joaVar.getValue();
            if (segmentedButtonsView != null) {
                ArrayList arrayList7 = new ArrayList(k13.r(S02, 10));
                for (wj1 wj1Var : S02) {
                    String name = wj1Var.name();
                    String string = requireContext().getString(wj1Var.a);
                    string.getClass();
                    arrayList7.add(new s1h(name, string, true));
                }
                SegmentedButtonsView segmentedButtonsView2 = (SegmentedButtonsView) joaVar.getValue();
                String selectedItem = segmentedButtonsView2 != null ? segmentedButtonsView2.getSelectedItem() : null;
                if (selectedItem != null) {
                    if (!S02.isEmpty()) {
                        Iterator it6 = S02.iterator();
                        while (it6.hasNext()) {
                            if (Intrinsics.c(((wj1) it6.next()).name(), selectedItem)) {
                                break;
                            }
                        }
                    }
                    selectedItem = null;
                }
                PlayerCareerStatistics playerCareerStatistics2 = (PlayerCareerStatistics) N().g.d();
                PlayerSeasonStatisticsInfo playerSeasonStatisticsInfo2 = (playerCareerStatistics2 == null || (seasons = playerCareerStatistics2.getSeasons()) == null) ? null : (PlayerSeasonStatisticsInfo) CollectionsKt.firstOrNull(seasons);
                if (playerSeasonStatisticsInfo2 != null) {
                    AbstractPlayerSeasonStatistics statistics = playerSeasonStatisticsInfo2.getStatistics();
                    statistics.getClass();
                    num = ((BaseballPlayerSeasonStatistics) statistics).getPitchingGamesPlayed();
                } else {
                    num = null;
                }
                int m = yid.m(num);
                if (playerSeasonStatisticsInfo2 != null) {
                    AbstractPlayerSeasonStatistics statistics2 = playerSeasonStatisticsInfo2.getStatistics();
                    statistics2.getClass();
                    num2 = ((BaseballPlayerSeasonStatistics) statistics2).getBattingGamesPlayed();
                } else {
                    num2 = null;
                }
                selectedItem = (m > yid.m(num2) ? wj1.c : wj1.b).name();
                SegmentedButtonsView.t(segmentedButtonsView, arrayList7, selectedItem, 4);
            }
            TypeHeaderView D2 = D();
            String selectedItem2 = D2 != null ? D2.getSelectedItem() : null;
            joa joaVar2 = this.z;
            if (selectedItem2 == null) {
                nk2 nk2Var = (nk2) CollectionsKt.firstOrNull(a);
                if (nk2Var != null) {
                    if (((Boolean) joaVar2.getValue()).booleanValue()) {
                        nk2Var = null;
                    }
                    if (nk2Var != null) {
                        selectedItem2 = requireContext().getString(nk2Var.d());
                    }
                }
                selectedItem2 = null;
            }
            int i2 = 2;
            if (P()) {
                SegmentedButtonsView segmentedButtonsView3 = (SegmentedButtonsView) joaVar.getValue();
                String selectedItem3 = segmentedButtonsView3 != null ? segmentedButtonsView3.getSelectedItem() : null;
                if (selectedItem3 != null) {
                    ome N = N();
                    CareerStatsFilterModal.CareerStatsFilterData E2 = E();
                    E2.getClass();
                    PlayerCareerStatistics playerCareerStatistics3 = (PlayerCareerStatistics) N.g.d();
                    if (playerCareerStatistics3 != null) {
                        wj1 valueOf = wj1.valueOf(selectedItem3);
                        ArrayList b = d81.b(valueOf);
                        int i3 = valueOf.a;
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it7 = b.iterator();
                        while (it7.hasNext()) {
                            o13.v(((e81) it7.next()).e(fzg.d, playerCareerStatistics3, null, null).b, arrayList8);
                        }
                        ok2 ok2Var2 = new ok2(arrayList8, i3);
                        List seasons5 = playerCareerStatistics3.getSeasons();
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj3 : seasons5) {
                            PlayerSeasonStatisticsInfo playerSeasonStatisticsInfo3 = (PlayerSeasonStatisticsInfo) obj3;
                            playerSeasonStatisticsInfo3.getClass();
                            int ordinal = valueOf.ordinal();
                            if (ordinal == 0) {
                                AbstractPlayerSeasonStatistics statistics3 = playerSeasonStatisticsInfo3.getStatistics();
                                statistics3.getClass();
                                if (yid.m(((BaseballPlayerSeasonStatistics) statistics3).getBattingGamesPlayed()) <= 0) {
                                    i = 1;
                                    i2 = 2;
                                }
                                team = playerSeasonStatisticsInfo3.getTeam();
                                if ((team != null ? Integer.valueOf(team.getId()) : null) != null) {
                                }
                                i = 1;
                                i2 = 2;
                            } else if (ordinal == i) {
                                AbstractPlayerSeasonStatistics statistics4 = playerSeasonStatisticsInfo3.getStatistics();
                                statistics4.getClass();
                                if (yid.m(((BaseballPlayerSeasonStatistics) statistics4).getPitchingGamesPlayed()) <= 0) {
                                    i = 1;
                                    i2 = 2;
                                }
                                team = playerSeasonStatisticsInfo3.getTeam();
                                if ((team != null ? Integer.valueOf(team.getId()) : null) != null) {
                                }
                                i = 1;
                                i2 = 2;
                            } else {
                                if (ordinal != i2) {
                                    zzl.b();
                                    return;
                                }
                                AbstractPlayerSeasonStatistics statistics5 = playerSeasonStatisticsInfo3.getStatistics();
                                statistics5.getClass();
                                if (yid.m(((BaseballPlayerSeasonStatistics) statistics5).getFieldingGamesPlayed()) <= 0) {
                                    i = 1;
                                    i2 = 2;
                                }
                                team = playerSeasonStatisticsInfo3.getTeam();
                                if ((team != null ? Integer.valueOf(team.getId()) : null) != null) {
                                    Team team2 = E2.a;
                                    if ((team2 != null ? Integer.valueOf(team2.getId()) : null) != null) {
                                        Team team3 = E2.a;
                                        Integer valueOf2 = team3 != null ? Integer.valueOf(team3.getId()) : null;
                                        Team team4 = playerSeasonStatisticsInfo3.getTeam();
                                        if (!Intrinsics.c(valueOf2, team4 != null ? Integer.valueOf(team4.getId()) : null)) {
                                        }
                                    }
                                    Integer num3 = E2.d;
                                    Integer num4 = E2.e;
                                    if (yid.m(num3) <= yid.m(playerSeasonStatisticsInfo3.getStartYear())) {
                                        if ((num4 != null ? num4.intValue() : Integer.MAX_VALUE) >= yid.m(playerSeasonStatisticsInfo3.getEndYear())) {
                                            arrayList9.add(obj3);
                                        }
                                    }
                                }
                                i = 1;
                                i2 = 2;
                            }
                        }
                        xbb k2 = ome.k(arrayList9, ok2Var2, true, new ord(12, E2, playerCareerStatistics3), false);
                        yzc yzcVar = N.h;
                        if (k2.isEmpty()) {
                            k2 = null;
                        }
                        if (k2 != null) {
                            nmeVar2 = new nme(new vle(ok2Var2), k2, b);
                        } else {
                            km5 km5Var = km5.a;
                            nmeVar2 = new nme(null, km5Var, km5Var);
                        }
                        yzcVar.j(nmeVar2);
                    }
                    TypeHeaderView D3 = D();
                    if (D3 != null) {
                        ArrayList b2 = d81.b(wj1.valueOf(selectedItem3));
                        ArrayList arrayList10 = new ArrayList(k13.r(b2, 10));
                        Iterator it8 = b2.iterator();
                        while (it8.hasNext()) {
                            e81 e81Var = (e81) it8.next();
                            String name2 = e81Var.a.name();
                            String string2 = requireContext().getString(e81Var.b);
                            string2.getClass();
                            arrayList10.add(new vt2(name2, string2, false, null, null, null, null, 252));
                        }
                        D3.w(arrayList10, selectedItem2, Boolean.TRUE);
                        return;
                    }
                    return;
                }
                return;
            }
            if (selectedItem2 == null || (((Boolean) joaVar2.getValue()).booleanValue() && ((D = D()) == null || (headerTypes = D.getHeaderTypes()) == null || headerTypes.size() != a.size()))) {
                TypeHeaderView D4 = D();
                if (D4 != null) {
                    ArrayList arrayList11 = new ArrayList(k13.r(a, 10));
                    Iterator it9 = a.iterator();
                    while (it9.hasNext()) {
                        arrayList11.add(requireContext().getString(((nk2) it9.next()).d()));
                    }
                    TypeHeaderView.z(D4, arrayList11, null, 2);
                }
                this.N = true;
                return;
            }
            PickerItem.Tournament H2 = H();
            if (Intrinsics.c(H2 != null ? Boolean.valueOf(H2.b != null) : null, Boolean.FALSE)) {
                ome N2 = N();
                String str2 = selectedItem2;
                CareerStatsFilterModal.CareerStatsFilterData E3 = E();
                PickerItem.Tournament H3 = H();
                Player player2 = C().l;
                if (player2 != null) {
                    String position = player2.getPosition();
                    omeVar = N2;
                    str = position;
                } else {
                    omeVar = N2;
                    str = null;
                }
                cme cmeVar2 = new cme(this, 3);
                Player player3 = C().l;
                if (player3 != null) {
                    gender = player3.getGender();
                    omeVar2 = omeVar;
                    cmeVar = cmeVar2;
                } else {
                    omeVar2 = omeVar;
                    cmeVar = cmeVar2;
                    gender = null;
                }
                omeVar2.m(str2, E3, K, H3, str, cmeVar, gender);
                return;
            }
            String str3 = selectedItem2;
            ome N3 = N();
            CareerStatsFilterModal.CareerStatsFilterData E4 = E();
            Player player4 = C().l;
            String position2 = player4 != null ? player4.getPosition() : null;
            Player player5 = C().l;
            Gender gender2 = player5 != null ? player5.getGender() : null;
            E4.getClass();
            PlayerCareerStatistics playerCareerStatistics4 = (PlayerCareerStatistics) N3.g.d();
            if (playerCareerStatistics4 == null) {
                return;
            }
            List a2 = mk2.a(K, position2, playerCareerStatistics4, E4);
            xbb b3 = a.b();
            Iterator it10 = a2.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it10.next();
                int d = ((nk2) obj).d();
                Context context = getContext();
                if (Intrinsics.c(context != null ? context.getString(d) : null, str3)) {
                    break;
                }
            }
            nk2 nk2Var2 = (nk2) obj;
            if (nk2Var2 != null) {
                List seasons6 = playerCareerStatistics4.getSeasons();
                ArrayList arrayList12 = new ArrayList();
                for (Object obj4 : seasons6) {
                    if (mk2.b(K, (PlayerSeasonStatisticsInfo) obj4, nk2Var2, E4)) {
                        arrayList12.add(obj4);
                    }
                }
                if (arrayList12.isEmpty()) {
                    arrayList12 = null;
                }
                if (arrayList12 != null) {
                    ok2Var = nk2Var2.e(E4.c, playerCareerStatistics4, position2, gender2);
                    b3.addAll(ome.k(arrayList12, ok2Var, wyh.n.contains(K), new mme(E4, N3), true));
                    xbb a3 = a.a(b3);
                    yzc yzcVar2 = N3.h;
                    if (ok2Var == null) {
                        nmeVar = new nme(new vle(ok2Var), a3, a2);
                    } else {
                        km5 km5Var2 = km5.a;
                        nmeVar = new nme(null, km5Var2, km5Var2);
                    }
                    yzcVar2.j(nmeVar);
                }
            }
            ok2Var = null;
            xbb a32 = a.a(b3);
            yzc yzcVar22 = N3.h;
            if (ok2Var == null) {
            }
            yzcVar22.j(nmeVar);
        }
    }

    public final void T(vj1 vj1Var) {
        ArrayList arrayList = L().i;
        arrayList.getClass();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            zle zleVar = (zle) it.next();
            zleVar.getClass();
            if (zleVar instanceof wle) {
                break;
            } else {
                i++;
            }
        }
        Integer valueOf = i == -1 ? null : Integer.valueOf(i);
        vj1Var.getClass();
        e81 e81Var = new e81(vj1Var);
        List<lk2> g = e81Var.g();
        ArrayList arrayList2 = new ArrayList(k13.r(g, 10));
        for (lk2 lk2Var : g) {
            arrayList2.add(new pk2((r9k) lk2Var.j().invoke(null), (r9k) lk2Var.h().invoke(null), new z71(24), new z71(25)));
        }
        wle wleVar = new wle(new ok2(arrayList2, e81Var.b));
        if (valueOf == null) {
            L().r(wleVar);
            return;
        }
        bme L = L();
        int intValue = valueOf.intValue();
        L.i.set(intValue, wleVar);
        L.notifyItemChanged(L.g.size() + intValue);
    }

    public final void U() {
        if (Intrinsics.c(E(), F())) {
            I().b.setImageTintList(ColorStateList.valueOf(requireContext().getColor(R.color.n_lv_1)));
            z8e.V(requireContext().getColor(R.color.surface_2), I().b);
        } else {
            I().b.setImageTintList(ColorStateList.valueOf(requireContext().getColor(R.color.primary_default)));
            z8e.V(requireContext().getColor(R.color.primary_highlight), I().b);
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return xq8.a(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "CareerTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        yk2 yk2Var;
        l();
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((xq8) krkVar).d;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((xq8) krkVar2).c;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        aba.G(((xq8) krkVar3).c);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        ((xq8) krkVar4).c.setAdapter(L());
        wxc I = I();
        ComposeView composeView = I.d;
        ComposeView composeView2 = I.c;
        ComposeView composeView3 = I.e;
        int i = 1;
        composeView.setContent(new tc3(279997890, new eme(this, i), true));
        int i2 = 2;
        int i3 = 0;
        if (Intrinsics.c(K(), Sports.FOOTBALL)) {
            composeView3.setVisibility(0);
            composeView3.setContent(new tc3(1054300039, new eme(this, i2), true));
        } else {
            composeView2.setVisibility(0);
            composeView2.setContent(new tc3(-1066631522, new eme(this, 3), true));
        }
        krk krkVar5 = this.l;
        krkVar5.getClass();
        AppBarLayout appBarLayout = ((xq8) krkVar5).b;
        joa joaVar = this.x;
        yk2 yk2Var2 = (yk2) joaVar.getValue();
        if (yk2Var2 != null) {
            Context context = appBarLayout.getContext();
            context.getClass();
            yk2 yk2Var3 = ((Boolean) n9e.x(context, new jp1(K(), i2))).booleanValue() ? yk2Var2 : null;
            if (yk2Var3 != null) {
                FrameLayout frameLayout = yk2Var3.a;
                frameLayout.getClass();
                z8e.r(appBarLayout, frameLayout, true);
            }
        }
        ConstraintLayout constraintLayout = I().a;
        constraintLayout.getClass();
        z8e.r(appBarLayout, constraintLayout, true);
        SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) this.y.getValue();
        if (segmentedButtonsView != null) {
            z8e.r(appBarLayout, segmentedButtonsView, true);
        }
        TypeHeaderView D = D();
        if (D != null) {
            z8e.r(appBarLayout, D, true);
        }
        LinearLayout linearLayout = ((kse) this.C.getValue()).a;
        linearLayout.getClass();
        z8e.r(appBarLayout, linearLayout, false);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        if (!((Boolean) n9e.x(requireContext2, new jp1(K(), i2))).booleanValue() && (yk2Var = (yk2) joaVar.getValue()) != null) {
            yk2Var.b.setVisibility(8);
            bme L = L();
            FrameLayout frameLayout2 = yk2Var.a;
            frameLayout2.getClass();
            g7.o(L, frameLayout2, 6);
        }
        C().q.e(getViewLifecycleOwner(), new z1(29, new cme(this, i3)));
        N().g.e(getViewLifecycleOwner(), new z1(29, new cme(this, i)));
        N().i.e(getViewLifecycleOwner(), new z1(29, new cme(this, 5)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        Boolean bool;
        UniqueTournament uniqueTournament;
        Player player = C().l;
        Integer valueOf = player != null ? Integer.valueOf(player.getId()) : null;
        String K = K();
        Season.SubSeasonType subSeasonType = (Season.SubSeasonType) ((eoh) this.K).getValue();
        PickerItem.Tournament H = H();
        Integer valueOf2 = (H == null || (uniqueTournament = H.b) == null) ? null : Integer.valueOf(uniqueTournament.getId());
        PickerItem.Tournament H2 = H();
        if (H2 != null) {
            bool = Boolean.valueOf(H2.b != null);
        } else {
            bool = null;
        }
        if (Intrinsics.c(bool, Boolean.FALSE) && valueOf != null && K != null) {
            ome N = N();
            int intValue = valueOf.intValue();
            vk2 vk2Var = E().b;
            vk2Var.getClass();
            xw3.L(un0.z(N), null, null, new mj5(N, intValue, vk2Var, K, (rq3) null, 9), 3);
            return;
        }
        if (valueOf == null || K == null || subSeasonType == null || valueOf2 == null) {
            return;
        }
        String label = K.equals(Sports.FOOTBALL) ? E().b.a : subSeasonType.getLabel();
        ome N2 = N();
        int intValue2 = valueOf.intValue();
        int intValue3 = valueOf2.intValue();
        label.getClass();
        xw3.L(un0.z(N2), null, null, new zb9(N2, intValue2, intValue3, label, K, (rq3) null), 3);
    }
}
