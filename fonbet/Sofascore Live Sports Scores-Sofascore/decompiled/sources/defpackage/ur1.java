package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.sofascore.model.PlayerTransferFilterData;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.TeamPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.UniqueTournamentGroup;
import com.sofascore.model.newNetwork.UniqueTournamentTeamsResponse;
import com.sofascore.model.newNetwork.newRankings.Ranking;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatisticsResponse;
import com.sofascore.model.newNetwork.statistics.season.team.TennisTeamSeasonStatistics;
import com.sofascore.model.newNetwork.topperformance.StatisticsType;
import com.sofascore.model.team.TennisSurfaceType;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.bettingtips.fragment.HighValueStreaksFragment;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelGraphView;
import com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelView;
import com.sofascore.results.event.mmastatistics.EventMmaStatisticsFragment;
import com.sofascore.results.league.fragment.events.LeagueEventsFragment;
import com.sofascore.results.league.historical.LeagueHistoricalDataActivity;
import com.sofascore.results.league.historical.topperformance.HistoricalDataTopPerformanceModal;
import com.sofascore.results.league.view.cuptree.CupTreeExtendedView;
import com.sofascore.results.main.favorites.FavoriteEntitiesFragment;
import com.sofascore.results.main.favorites.FavoriteEventsFragment;
import com.sofascore.results.main.leagues.StageCategoryEventsFragment;
import com.sofascore.results.main.search.SearchActivity;
import com.sofascore.results.mma.organisation.events.MmaOrganisationEventsFragment;
import com.sofascore.results.mma.organisation.rankings.MmaOrganisationRankingsFragment;
import com.sofascore.results.player.matches.PlayerEventsFragment;
import com.sofascore.results.team.playerstats.TeamPlayerStatsFragment;
import com.sofascore.results.team.statistics.TeamSeasonStatisticsFragment;
import com.sofascore.results.transfers.PlayerTransfersActivity;
import com.sofascore.results.venue.matches.VenueMatchesFragment;
import com.sofascore.results.venue.summary.venueinfo.VenueHighlightsView;
import com.sofascore.results.view.SofaTextInputLayout;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ur1 implements d5k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ur1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.d5k
    public final void a(int i, String str) {
        Object obj;
        Object value;
        bv7 bv7Var;
        nre nreVar;
        Object obj2;
        List<Team> teams;
        List H0;
        Sport sport;
        List list;
        ArrayList<Ranking> arrayList;
        String name;
        ovj ovjVar;
        Object obj3;
        Intent intent;
        Object obj4;
        Object obj5;
        Object obj6;
        Object p9iVar;
        List list2;
        Double b;
        TennisTeamSeasonStatistics tennisTeamSeasonStatistics;
        int i2 = this.a;
        int i3 = 18;
        int i4 = 10;
        int i5 = 6;
        int i6 = 1;
        Object obj7 = this.b;
        switch (i2) {
            case 0:
                vr1 vr1Var = (vr1) obj7;
                str.getClass();
                vr1Var.m = i;
                vr1Var.n();
                return;
            case 1:
                int i7 = CricketWagonWheelView.l;
                str.getClass();
                CricketWagonWheelGraphView cricketWagonWheelGraphView = (CricketWagonWheelGraphView) ((p12) obj7).c;
                o14.d.getClass();
                Iterator<E> it = o14.g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((o14) next).a.equals(str)) {
                            obj = next;
                        }
                    } else {
                        obj = null;
                    }
                }
                o14 o14Var = (o14) obj;
                if (o14Var == null) {
                    o14Var = o14.e;
                }
                cricketWagonWheelGraphView.setHitsFilterType(o14Var);
                return;
            case 2:
                CupTreeExtendedView cupTreeExtendedView = (CupTreeExtendedView) obj7;
                int i8 = CupTreeExtendedView.p;
                str.getClass();
                ((RecyclerView) cupTreeExtendedView.d.i).post(new pn0(cupTreeExtendedView, i, 6));
                return;
            case 3:
                str.getClass();
                ((EventDetailsFragment) obj7).V(str);
                return;
            case 4:
                EventMmaStatisticsFragment eventMmaStatisticsFragment = (EventMmaStatisticsFragment) obj7;
                str.getClass();
                krk krkVar = eventMmaStatisticsFragment.l;
                krkVar.getClass();
                SwipeRefreshLayout swipeRefreshLayout = ((knc) krkVar).a;
                swipeRefreshLayout.getClass();
                eventMmaStatisticsFragment.t(swipeRefreshLayout, new xw5(r11, eventMmaStatisticsFragment, str));
                return;
            case 5:
                FavoriteEntitiesFragment favoriteEntitiesFragment = (FavoriteEntitiesFragment) obj7;
                str.getClass();
                if (!str.equals(favoriteEntitiesFragment.C().m.getValue())) {
                    Context requireContext = favoriteEntitiesFragment.requireContext();
                    requireContext.getClass();
                    nv.z0(requireContext, kv.CLICK, "chip_sport_selection", "favorite_tab");
                }
                vs7 vs7Var = (vs7) favoriteEntitiesFragment.s.getValue();
                vs7Var.getClass();
                vs7Var.o = str;
                fdi fdiVar = favoriteEntitiesFragment.C().m;
                fdiVar.getClass();
                fdiVar.m(null, str);
                return;
            case 6:
                FavoriteEventsFragment favoriteEventsFragment = (FavoriteEventsFragment) obj7;
                str.getClass();
                if (!str.equals((String) favoriteEventsFragment.E().n.getValue())) {
                    Context requireContext2 = favoriteEventsFragment.requireContext();
                    requireContext2.getClass();
                    nv.z0(requireContext2, kv.CLICK, "chip_sport_selection", "favorite_tab");
                }
                favoriteEventsFragment.y = true;
                vs7 D = favoriteEventsFragment.D();
                D.getClass();
                D.o = str;
                is7 E = favoriteEventsFragment.E();
                fdi fdiVar2 = E.n;
                if (Intrinsics.c(fdiVar2.getValue(), str)) {
                    return;
                }
                do {
                    value = fdiVar2.getValue();
                } while (!fdiVar2.k(value, str));
                E.m(false);
                return;
            case 7:
                tv7 tv7Var = (tv7) obj7;
                str.getClass();
                UniqueTournamentGroup uniqueTournamentGroup = (UniqueTournamentGroup) CollectionsKt.a0(i, tv7Var.j);
                if (uniqueTournamentGroup == null || (bv7Var = tv7Var.i) == null) {
                    return;
                }
                bv7Var.invoke(Integer.valueOf(uniqueTournamentGroup.getTournamentId()));
                return;
            case 8:
                str.getClass();
                ((q09) obj7).l(str);
                return;
            case 9:
                HighValueStreaksFragment highValueStreaksFragment = (HighValueStreaksFragment) obj7;
                str.getClass();
                boolean z = false;
                Object obj8 = null;
                for (Object obj9 : ca9.d) {
                    if (((ca9) obj9).a.equals(str)) {
                        if (z) {
                            a70.p("Collection contains more than one matching element.");
                            return;
                        } else {
                            obj8 = obj9;
                            z = true;
                        }
                    }
                }
                if (!z) {
                    ogj.m("Collection contains no element matching the predicate.");
                    return;
                } else {
                    highValueStreaksFragment.w = (ca9) obj8;
                    highValueStreaksFragment.u();
                    return;
                }
            case 10:
                HistoricalDataTopPerformanceModal historicalDataTopPerformanceModal = (HistoricalDataTopPerformanceModal) obj7;
                otk otkVar = historicalDataTopPerformanceModal.C;
                str.getClass();
                kp5 kp5Var = nre.d;
                if (i == 0) {
                    kp5Var = null;
                }
                ((ac9) otkVar.getValue()).k = (kp5Var == null || (nreVar = (nre) CollectionsKt.a0(i, kp5Var)) == null) ? null : nreVar.a;
                ((ac9) otkVar.getValue()).k((i1g) historicalDataTopPerformanceModal.K.getValue());
                return;
            case 11:
                vp9 vp9Var = (vp9) obj7;
                str.getClass();
                vp9Var.k = i;
                vp9Var.n();
                return;
            case 12:
                LeagueEventsFragment leagueEventsFragment = (LeagueEventsFragment) obj7;
                joa joaVar = leagueEventsFragment.y;
                str.getClass();
                if (!leagueEventsFragment.w) {
                    String str2 = !str.equals(SearchResponseKt.PLAYER_ENTITY) ? str : null;
                    if (str2 == null) {
                        str2 = "team";
                    }
                    Context requireContext3 = leagueEventsFragment.requireContext();
                    requireContext3.getClass();
                    nv.z0(requireContext3, kv.CLICK, str2, "matches_screen");
                }
                leagueEventsFragment.w = false;
                Iterator<E> it2 = uwa.h.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (((uwa) obj2).a.equals(str)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                uwa uwaVar = (uwa) obj2;
                if (uwaVar != null) {
                    zwa G = leagueEventsFragment.G();
                    uwa uwaVar2 = G.p;
                    G.p = uwaVar;
                    G.w();
                    LinkedHashMap linkedHashMap = G.q;
                    boolean z2 = (linkedHashMap.get(uwaVar2) == null && linkedHashMap.get(uwaVar) == null) ? false : true;
                    if (z2) {
                        G.m();
                    }
                    if (z2) {
                        u6e.b(leagueEventsFragment.E());
                        leagueEventsFragment.D().s();
                        leagueEventsFragment.v = true;
                    }
                    vwa vwaVar = (vwa) leagueEventsFragment.G().i.d();
                    if (vwaVar == null) {
                        return;
                    }
                    krk krkVar2 = leagueEventsFragment.l;
                    krkVar2.getClass();
                    ((po8) krkVar2).d.setVisibility(8);
                    int ordinal = uwaVar.ordinal();
                    if (ordinal != 1 && ordinal != 2) {
                        if (ordinal == 3 || ordinal == 4) {
                            krk krkVar3 = leagueEventsFragment.l;
                            krkVar3.getClass();
                            ((po8) krkVar3).i.setVisibility(0);
                            krk krkVar4 = leagueEventsFragment.l;
                            krkVar4.getClass();
                            ((po8) krkVar4).c.setVisibility(0);
                            krk krkVar5 = leagueEventsFragment.l;
                            krkVar5.getClass();
                            ((po8) krkVar5).e.setVisibility(8);
                            UniqueTournamentTeamsResponse uniqueTournamentTeamsResponse = vwaVar.c;
                            if (uniqueTournamentTeamsResponse == null || (teams = uniqueTournamentTeamsResponse.getTeams()) == null || (H0 = CollectionsKt.H0(teams, new cp(leagueEventsFragment, 18))) == null) {
                                return;
                            }
                            krk krkVar6 = leagueEventsFragment.l;
                            krkVar6.getClass();
                            ((po8) krkVar6).k.setVisibility(0);
                            krk krkVar7 = leagueEventsFragment.l;
                            krkVar7.getClass();
                            ((po8) krkVar7).m.setImageResource(R.drawable.team_logo_placeholder);
                            krk krkVar8 = leagueEventsFragment.l;
                            krkVar8.getClass();
                            ((po8) krkVar8).m.setImageTintList(eq3.q(R.color.neutral_default, leagueEventsFragment.requireContext()));
                            if (((twa) joaVar.getValue()).isEmpty()) {
                                twa twaVar = (twa) joaVar.getValue();
                                twaVar.getClass();
                                twaVar.a.addAll(H0);
                                twaVar.b.addAll(H0);
                                ((twa) joaVar.getValue()).notifyDataSetChanged();
                            }
                            krk krkVar9 = leagueEventsFragment.l;
                            krkVar9.getClass();
                            CharSequence hint = ((po8) krkVar9).l.getHint();
                            if (hint == null || hint.length() == 0) {
                                krk krkVar10 = leagueEventsFragment.l;
                                krkVar10.getClass();
                                SofaTextInputLayout sofaTextInputLayout = ((po8) krkVar10).l;
                                Set set = wyh.a;
                                Team team = (Team) CollectionsKt.firstOrNull(H0);
                                sofaTextInputLayout.setHint(wyh.e((team == null || (sport = team.getSport()) == null) ? null : sport.getSlug()) ? R.string.select_player : R.string.select_team);
                            }
                            krk krkVar11 = leagueEventsFragment.l;
                            krkVar11.getClass();
                            ((po8) krkVar11).j.getText().clear();
                            krk krkVar12 = leagueEventsFragment.l;
                            krkVar12.getClass();
                            ((po8) krkVar12).j.setOnItemClickListener(new yh5(leagueEventsFragment, 1));
                            Team u = leagueEventsFragment.G().u();
                            if (u != null) {
                                krk krkVar13 = leagueEventsFragment.l;
                                krkVar13.getClass();
                                MaterialAutoCompleteTextView materialAutoCompleteTextView = ((po8) krkVar13).j;
                                Context requireContext4 = leagueEventsFragment.requireContext();
                                requireContext4.getClass();
                                materialAutoCompleteTextView.setText((CharSequence) tba.p(requireContext4, u), false);
                                leagueEventsFragment.H(u);
                            }
                            krk krkVar14 = leagueEventsFragment.l;
                            krkVar14.getClass();
                            ((po8) krkVar14).j.setOnFocusChangeListener(new jr2(leagueEventsFragment, i5));
                            return;
                        }
                        if (ordinal != 5) {
                            krk krkVar15 = leagueEventsFragment.l;
                            krkVar15.getClass();
                            ((po8) krkVar15).k.setVisibility(8);
                            krk krkVar16 = leagueEventsFragment.l;
                            krkVar16.getClass();
                            ((po8) krkVar16).e.setVisibility(8);
                            krk krkVar17 = leagueEventsFragment.l;
                            krkVar17.getClass();
                            ((po8) krkVar17).i.setVisibility(8);
                            krk krkVar18 = leagueEventsFragment.l;
                            krkVar18.getClass();
                            ((po8) krkVar18).c.setVisibility(8);
                            return;
                        }
                    }
                    krk krkVar19 = leagueEventsFragment.l;
                    krkVar19.getClass();
                    ((po8) krkVar19).i.setVisibility(0);
                    krk krkVar20 = leagueEventsFragment.l;
                    krkVar20.getClass();
                    ((po8) krkVar20).c.setVisibility(0);
                    krk krkVar21 = leagueEventsFragment.l;
                    krkVar21.getClass();
                    ((po8) krkVar21).k.setVisibility(8);
                    krk krkVar22 = leagueEventsFragment.l;
                    krkVar22.getClass();
                    ((po8) krkVar22).e.setVisibility(0);
                    return;
                }
                return;
            case 13:
                LeagueHistoricalDataActivity leagueHistoricalDataActivity = (LeagueHistoricalDataActivity) obj7;
                int i9 = LeagueHistoricalDataActivity.Q;
                str.getClass();
                leagueHistoricalDataActivity.Q(i);
                nv.z0(leagueHistoricalDataActivity, kv.CLICK, "change_season", "historical_data");
                return;
            case 14:
                MmaOrganisationEventsFragment mmaOrganisationEventsFragment = (MmaOrganisationEventsFragment) obj7;
                str.getClass();
                rpc valueOf = rpc.valueOf(str);
                if (valueOf == rpc.b) {
                    krk krkVar23 = mmaOrganisationEventsFragment.l;
                    krkVar23.getClass();
                    RecyclerView recyclerView = ((xq8) krkVar23).c;
                    u6e u6eVar = new u6e(mmaOrganisationEventsFragment.C(), true, new mpc(mmaOrganisationEventsFragment, 1));
                    u6eVar.f = true;
                    recyclerView.addOnScrollListener(u6eVar);
                } else {
                    g9i g9iVar = mmaOrganisationEventsFragment.D().j;
                    if (g9iVar != null) {
                        g9iVar.e(null);
                    }
                    krk krkVar24 = mmaOrganisationEventsFragment.l;
                    krkVar24.getClass();
                    ((xq8) krkVar24).c.clearOnScrollListeners();
                }
                mmaOrganisationEventsFragment.C().s();
                bmc C = mmaOrganisationEventsFragment.C();
                qpc qpcVar = (qpc) mmaOrganisationEventsFragment.D().g.d();
                if (qpcVar == null || (list = (List) qpcVar.a.get(valueOf)) == null) {
                    list = km5.a;
                }
                C.H(list);
                ((zoc) mmaOrganisationEventsFragment.w.getValue()).setVisibility(valueOf == rpc.c ? 0 : 8);
                return;
            case 15:
                MmaOrganisationRankingsFragment mmaOrganisationRankingsFragment = (MmaOrganisationRankingsFragment) obj7;
                mqi mqiVar = mmaOrganisationRankingsFragment.x;
                str.getClass();
                mmaOrganisationRankingsFragment.u = str;
                List list3 = (List) ((aqc) mmaOrganisationRankingsFragment.t.getValue()).g.d();
                if (list3 != null) {
                    if (Intrinsics.c(mmaOrganisationRankingsFragment.u, "MALE")) {
                        arrayList = new ArrayList();
                        for (Object obj10 : list3) {
                            if (((Ranking) obj10).getRankingType().getGender() == Gender.Male) {
                                arrayList.add(obj10);
                            }
                        }
                    } else {
                        arrayList = new ArrayList();
                        for (Object obj11 : list3) {
                            if (((Ranking) obj11).getRankingType().getGender() == Gender.Female) {
                                arrayList.add(obj11);
                            }
                        }
                    }
                    nqc nqcVar = (nqc) mqiVar.getValue();
                    Context context = nqcVar.b;
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Ranking ranking : arrayList) {
                        arrayList2.add(ranking.getRankingType());
                        String weightClass = ranking.getRankingType().getWeightClass();
                        if (weightClass != null) {
                            name = tnf.q(context, weightClass);
                        } else {
                            name = ranking.getRankingType().getName();
                            if (name == null) {
                                name = context.getString(R.string.value_unknown);
                                name.getClass();
                            }
                        }
                        arrayList3.add(new zl2(name, nqcVar.g.size() + (arrayList2.size() - 1)));
                        arrayList2.add(4);
                        arrayList2.addAll(ranking.getRankingRows());
                    }
                    nqcVar.F(arrayList2);
                    nqcVar.l = arrayList3;
                    ArrayList arrayList4 = ((nqc) mqiVar.getValue()).l;
                    if (arrayList4 == null) {
                        Intrinsics.i("categories");
                        throw null;
                    }
                    ((eoh) mmaOrganisationRankingsFragment.w).setValue(arrayList4);
                    krk krkVar25 = mmaOrganisationRankingsFragment.l;
                    krkVar25.getClass();
                    ((gp8) krkVar25).e.setVisibility(list3.size() >= 5 ? 0 : 8);
                    return;
                }
                return;
            case 16:
                PlayerEventsFragment playerEventsFragment = (PlayerEventsFragment) obj7;
                str.getClass();
                xse l = k03.l(playerEventsFragment.G(), str);
                playerEventsFragment.v = new vse(l);
                playerEventsFragment.C().Y(playerEventsFragment.v);
                Context requireContext5 = playerEventsFragment.requireContext();
                requireContext5.getClass();
                n9e.u(requireContext5, new ord(i3, playerEventsFragment, l));
                return;
            case 17:
                tue.n((tue) obj7, str);
                return;
            case 18:
                PlayerTransfersActivity playerTransfersActivity = (PlayerTransfersActivity) obj7;
                int i10 = PlayerTransfersActivity.R;
                str.getClass();
                pvj valueOf2 = pvj.valueOf(str);
                if (playerTransfersActivity.P().g().b == valueOf2) {
                    ovj g = playerTransfersActivity.P().g();
                    boolean z3 = !playerTransfersActivity.P().g().a;
                    pvj pvjVar = g.b;
                    pvjVar.getClass();
                    ovjVar = new ovj(z3, pvjVar);
                } else {
                    ovjVar = new ovj(playerTransfersActivity.P().g().a, valueOf2);
                }
                n9e.u(playerTransfersActivity, new qdj(ovjVar, i5));
                playerTransfersActivity.P().h = ovjVar;
                rvj O = playerTransfersActivity.O();
                O.getClass();
                pvj pvjVar2 = ovjVar.b;
                pvjVar2.getClass();
                O.n = pvjVar2;
                O.s();
                PlayerTransferFilterData playerTransferFilterData = playerTransfersActivity.P().g;
                if (playerTransferFilterData != null) {
                    playerTransfersActivity.Q(playerTransferFilterData);
                } else {
                    playerTransfersActivity.Q(null);
                }
                TypeHeaderView typeHeaderView = (TypeHeaderView) playerTransfersActivity.O.getValue();
                List<vt2> list4 = (List) playerTransfersActivity.L.getValue();
                ArrayList arrayList5 = new ArrayList(k13.r(list4, 10));
                for (vt2 vt2Var : list4) {
                    arrayList5.add(vt2.a(vt2Var, false, Intrinsics.c(vt2Var.a, str) ? new tc3(530778946, new ef8(1, playerTransfersActivity, ovjVar), true) : null, 239));
                }
                TypeHeaderView.x(typeHeaderView, arrayList5, null, 6);
                return;
            case 19:
                int i11 = SearchActivity.Q;
                str.getClass();
                ((SearchActivity) obj7).S().h.l(hwg.h.get(i));
                return;
            case 20:
                StageCategoryEventsFragment stageCategoryEventsFragment = (StageCategoryEventsFragment) obj7;
                str.getClass();
                List list5 = (List) stageCategoryEventsFragment.F().k.d();
                if (list5 != null) {
                    Iterator it3 = list5.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj3 = it3.next();
                            if (Intrinsics.c(stageCategoryEventsFragment.E((UniqueStage) obj3), str)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    UniqueStage uniqueStage = (UniqueStage) obj3;
                    if (uniqueStage != null) {
                        stageCategoryEventsFragment.F().m(uniqueStage.getId());
                        FragmentActivity requireActivity = stageCategoryEventsFragment.requireActivity();
                        BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
                        if (baseActivity == null || (intent = baseActivity.getIntent()) == null) {
                            return;
                        }
                        Context requireContext6 = stageCategoryEventsFragment.requireContext();
                        requireContext6.getClass();
                        nv.i0(requireContext6, uniqueStage, intent);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                jai jaiVar = (jai) obj7;
                str.getClass();
                jaiVar.s();
                Iterator<E> it4 = rv8.f.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj4 = it4.next();
                        if (((rv8) obj4).a.equals(str)) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                rv8 rv8Var = (rv8) obj4;
                if (rv8Var != null) {
                    p9iVar = new q9i(rv8Var);
                } else {
                    Iterator<E> it5 = ip.g.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            obj5 = it5.next();
                            if (((ip) obj5).a.equals(str)) {
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    ip ipVar = (ip) obj5;
                    if (ipVar != null) {
                        p9iVar = new o9i(ipVar);
                    } else {
                        Iterator<E> it6 = t52.h.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                obj6 = it6.next();
                                if (((t52) obj6).a.equals(str)) {
                                }
                            } else {
                                obj6 = null;
                            }
                        }
                        t52 t52Var = (t52) obj6;
                        p9iVar = t52Var != null ? new p9i(t52Var) : null;
                    }
                }
                if (p9iVar != null) {
                    jaiVar.m.invoke(p9iVar);
                    return;
                }
                return;
            case 22:
                TeamPlayerStatsFragment teamPlayerStatsFragment = (TeamPlayerStatsFragment) obj7;
                str.getClass();
                List list6 = (List) teamPlayerStatsFragment.F().h.d();
                nk2 nk2Var = list6 != null ? (nk2) CollectionsKt.a0(i, list6) : null;
                boolean z4 = !Intrinsics.c(teamPlayerStatsFragment.F().n, nk2Var);
                tyi F = teamPlayerStatsFragment.F();
                boolean c = Intrinsics.c(F.n, nk2Var);
                F.n = nk2Var;
                F.o = !c ? 1 : F.o;
                yzc yzcVar = F.i;
                ArrayList arrayList6 = F.k;
                ArrayList<TeamPlayerSeasonStatistics> f = arrayList6 != null ? F.f(arrayList6) : null;
                nk2 nk2Var2 = F.n;
                if (nk2Var2 != null) {
                    int i12 = F.o;
                    boolean z5 = F.m.c == oei.d;
                    if (f != null) {
                        ArrayList arrayList7 = new ArrayList();
                        for (TeamPlayerSeasonStatistics teamPlayerSeasonStatistics : f) {
                            List<lk2> g2 = nk2Var2.g();
                            ArrayList arrayList8 = new ArrayList(k13.r(g2, i4));
                            int i13 = 0;
                            for (lk2 lk2Var : g2) {
                                lk2Var.getClass();
                                ft ftVar = (ft) lk2Var;
                                AbstractPlayerSeasonStatistics statistics = teamPlayerSeasonStatistics.getStatistics();
                                statistics.getClass();
                                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics = (AmericanFootballPlayerSeasonStatistics) statistics;
                                double doubleValue = ((Number) ftVar.g().invoke(americanFootballPlayerSeasonStatistics)).doubleValue();
                                if (!z5 && !Intrinsics.c(ftVar.d().invoke(americanFootballPlayerSeasonStatistics), ftVar.i().invoke(americanFootballPlayerSeasonStatistics)) && (b = yid.b(Double.valueOf(doubleValue), americanFootballPlayerSeasonStatistics.getAppearances())) != null) {
                                    doubleValue = b.doubleValue();
                                }
                                String str3 = (String) (z5 ? ftVar.d() : ftVar.i()).invoke(americanFootballPlayerSeasonStatistics);
                                if (doubleValue != 0.0d) {
                                    i13++;
                                }
                                arrayList8.add(new Pair(str3, Double.valueOf(doubleValue)));
                                i6 = 1;
                            }
                            qyi qyiVar = i13 > i6 ? new qyi(teamPlayerSeasonStatistics.getPlayer(), nk2Var2, arrayList8) : null;
                            if (qyiVar != null) {
                                arrayList7.add(qyiVar);
                            }
                            i4 = 10;
                            i6 = 1;
                        }
                        list2 = CollectionsKt.H0(arrayList7, new d5c(i12, 3));
                    } else {
                        list2 = null;
                    }
                    yzcVar.j(list2);
                }
                krk krkVar26 = teamPlayerStatsFragment.l;
                krkVar26.getClass();
                ((xq8) krkVar26).c.scrollToPosition(0);
                if (nk2Var != null) {
                    teamPlayerStatsFragment.G(nk2Var, (tug) teamPlayerStatsFragment.C.getValue(), teamPlayerStatsFragment.F().o, z4);
                    return;
                }
                return;
            case 23:
                TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = (TeamSeasonStatisticsFragment) obj7;
                str.getClass();
                y0j L = teamSeasonStatisticsFragment.L();
                List list7 = (List) teamSeasonStatisticsFragment.L().l.d();
                TennisSurfaceType tennisSurfaceType = list7 != null ? (TennisSurfaceType) CollectionsKt.a0(i, list7) : null;
                yzc yzcVar2 = L.i;
                Map map = L.m;
                TeamSeasonStatisticsResponse teamSeasonStatisticsResponse = (map == null || (tennisTeamSeasonStatistics = (TennisTeamSeasonStatistics) map.get(tennisSurfaceType)) == null) ? null : new TeamSeasonStatisticsResponse(tennisTeamSeasonStatistics, null, null, null, new StatisticsType(Sports.TENNIS, ""));
                z0j z0jVar = (z0j) yzcVar2.d();
                yzcVar2.j(new z0j(teamSeasonStatisticsResponse, Intrinsics.c(z0jVar != null ? Boolean.valueOf(z0jVar.b) : null, Boolean.TRUE)));
                return;
            case 24:
                int i14 = VenueHighlightsView.i;
                str.getClass();
                ((VenueHighlightsView) obj7).l(str);
                return;
            default:
                VenueMatchesFragment venueMatchesFragment = (VenueMatchesFragment) obj7;
                str.getClass();
                if (str.equals(venueMatchesFragment.E().j)) {
                    return;
                }
                venueMatchesFragment.C().s();
                u6e.b((u6e) venueMatchesFragment.v.getValue());
                venueMatchesFragment.u = true;
                onk E2 = venueMatchesFragment.E();
                int D2 = venueMatchesFragment.D();
                E2.j = str;
                xw3.L(un0.z(E2), null, null, new jr5(E2, D2, str, (rq3) null), 3);
                return;
        }
    }
}
