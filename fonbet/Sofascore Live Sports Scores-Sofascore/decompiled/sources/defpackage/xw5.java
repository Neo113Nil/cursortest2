package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n;
import com.ironsource.L6;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.TvType;
import com.sofascore.model.database.DbEventScore;
import com.sofascore.model.database.DbFantasyCompetition;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyLeagueType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.EventBestPlayer;
import com.sofascore.model.newNetwork.EventBestPlayersSummaryResponse;
import com.sofascore.model.newNetwork.FanPlayerOfTheMatchOption;
import com.sofascore.model.newNetwork.FanPlayerOfTheMatchResponse;
import com.sofascore.results.R;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.event.details.view.tv.model.TvChannelData;
import com.sofascore.results.event.hockeyplaybyplay.EventHockeyPlayByPlayFragment;
import com.sofascore.results.event.matches.EventMatchesFragment;
import com.sofascore.results.event.mmastatistics.EventMmaStatisticsFragment;
import com.sofascore.results.event.odds.eventrecomended.EventRecommendedOddsFragment;
import com.sofascore.results.fantasy.comparison.selectplayer.FantasyComparisonPlayersDialogFragment;
import com.sofascore.results.fantasy.competition.FantasyCompetitionActivity;
import com.sofascore.results.fantasy.competition.statistics.FantasyCompetitionStatisticsFragment;
import com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerBottomSheet;
import com.sofascore.results.fantasy.league.FantasyLeagueActivity;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class xw5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xw5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x060f A[LOOP:11: B:253:0x0609->B:255:0x060f, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v30, types: [g7, java.lang.Object, w0, ys2] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        FanPlayerOfTheMatchOption fanPlayerOfTheMatchOption;
        EventBestPlayer eventBestPlayer;
        EventBestPlayer eventBestPlayer2;
        List<FanPlayerOfTheMatchOption> options;
        FanPlayerOfTheMatchOption fanPlayerOfTheMatchOption2;
        Iterator it;
        zqc zqcVar;
        FragmentActivity O;
        int i;
        fo7 fo7Var;
        int i2 = this.a;
        int i3 = 7;
        int i4 = 3;
        final int i5 = 0;
        int i6 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                zw5 zw5Var = (zw5) obj2;
                ww5 ww5Var = (ww5) obj;
                ww5Var.getClass();
                e9b e9bVar = ww5Var.a;
                TeamSelection teamSelection = ((rw5) ((sw5) obj3)).a;
                return ww5.a(ww5Var, e9b.a(e9bVar, teamSelection == TeamSelection.Second ? zw5Var.n : zw5Var.m, null, teamSelection, 2), false, 2);
            case 1:
                EventDetailsFragment eventDetailsFragment = (EventDetailsFragment) obj3;
                String str = (String) obj2;
                v3k v3kVar = (v3k) obj;
                joa joaVar = eventDetailsFragment.S;
                k3k k3kVar = (k3k) joaVar.getValue();
                if (k3kVar != null) {
                    int id = eventDetailsFragment.F().getId();
                    String statusType = eventDetailsFragment.F().getStatusType();
                    long startTimestamp = eventDetailsFragment.F().getStartTimestamp();
                    Locale locale = Locale.getDefault();
                    Team homeTeam$default = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null);
                    Context requireContext = eventDetailsFragment.requireContext();
                    requireContext.getClass();
                    String p = tba.p(requireContext, homeTeam$default);
                    Team awayTeam$default = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null);
                    Context requireContext2 = eventDetailsFragment.requireContext();
                    requireContext2.getClass();
                    TvChannelData tvChannelData = new TvChannelData(id, statusType, startTimestamp, String.format(locale, str, Arrays.copyOf(new Object[]{p, tba.p(requireContext2, awayTeam$default)}, 2)), eventDetailsFragment.F().getHasBet365LiveStream(), eventDetailsFragment.F().getBet365ExcludedCountryCodes(), TvType.EVENT);
                    v3kVar.getClass();
                    k3kVar.n(tvChannelData, v3kVar, eventDetailsFragment.D().l.c());
                }
                k3k k3kVar2 = (k3k) joaVar.getValue();
                if (k3kVar2 != null) {
                    v3kVar.getClass();
                    k3kVar2.setTvChannelsListData(v3kVar);
                }
                return Unit.a;
            case 2:
                EventDetailsFragment eventDetailsFragment2 = (EventDetailsFragment) obj3;
                iy5 iy5Var = (iy5) obj2;
                int intValue = ((Integer) obj).intValue();
                EventBestPlayersSummaryResponse eventBestPlayersSummaryResponse = iy5Var.v;
                ly5 ly5Var = iy5Var.w;
                FanPlayerOfTheMatchResponse fanPlayerOfTheMatchResponse = ly5Var != null ? ly5Var.a : null;
                if (fanPlayerOfTheMatchResponse == null || (options = fanPlayerOfTheMatchResponse.getOptions()) == null) {
                    fanPlayerOfTheMatchOption = null;
                } else {
                    Iterator it2 = options.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            fanPlayerOfTheMatchOption2 = it2.next();
                            if (((FanPlayerOfTheMatchOption) fanPlayerOfTheMatchOption2).getPlayer().getId() == intValue) {
                            }
                        } else {
                            fanPlayerOfTheMatchOption2 = 0;
                        }
                    }
                    fanPlayerOfTheMatchOption = fanPlayerOfTheMatchOption2;
                }
                if (fanPlayerOfTheMatchOption != null) {
                    eventDetailsFragment2.T(fanPlayerOfTheMatchOption.getPlayer(), fanPlayerOfTheMatchOption.getTeam(), fanPlayerOfTheMatchOption.getRating());
                } else if (eventBestPlayersSummaryResponse != null) {
                    List<EventBestPlayer> leaderboard = eventBestPlayersSummaryResponse.getLeaderboard();
                    if (leaderboard != null) {
                        Iterator it3 = leaderboard.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                eventBestPlayer2 = it3.next();
                                if (((EventBestPlayer) eventBestPlayer2).getPlayer().getId() == intValue) {
                                }
                            } else {
                                eventBestPlayer2 = 0;
                            }
                        }
                        eventBestPlayer = eventBestPlayer2;
                    } else {
                        eventBestPlayer = null;
                    }
                    if (eventBestPlayer != null) {
                        Team team = eventBestPlayer.getTeam();
                        if (team == null) {
                            team = eventBestPlayer.getPlayer().getTeam();
                        }
                        if (team != null) {
                            eventDetailsFragment2.T(eventBestPlayer.getPlayer(), team, b.f(eventBestPlayer.getValue()));
                        }
                    } else {
                        EventBestPlayer playerOfTheMatch = eventBestPlayersSummaryResponse.getPlayerOfTheMatch();
                        if (playerOfTheMatch != null) {
                            if (playerOfTheMatch.getPlayer().getId() != intValue) {
                                playerOfTheMatch = null;
                            }
                            if (playerOfTheMatch != null) {
                                Team team2 = playerOfTheMatch.getTeam();
                                if (team2 == null) {
                                    team2 = playerOfTheMatch.getPlayer().getTeam();
                                }
                                if (team2 != null) {
                                    eventDetailsFragment2.T(playerOfTheMatch.getPlayer(), team2, b.f(playerOfTheMatch.getValue()));
                                }
                            }
                        }
                    }
                }
                return Unit.a;
            case 3:
                int intValue2 = ((Integer) obj).intValue();
                dz5 E = ((EventDetailsFragment) obj3).E();
                xw3.L(un0.z(E), null, null, new z23(E, intValue2, (TvChannelData) obj2, o3k.a, (rq3) null, 3), 3);
                return Unit.a;
            case 4:
                EventDetailsFragment eventDetailsFragment3 = (EventDetailsFragment) obj3;
                lmj lmjVar = (lmj) obj2;
                ((View) obj).getClass();
                if (eventDetailsFragment3.getContext() == null) {
                    return Unit.a;
                }
                g7 g7Var = eventDetailsFragment3.D;
                if (g7Var == null) {
                    Intrinsics.i(L6.G1);
                    throw null;
                }
                int indexOf = g7Var.h.indexOf(lmjVar);
                if (indexOf >= 0) {
                    xx5 K = eventDetailsFragment3.K();
                    g7 g7Var2 = eventDetailsFragment3.D;
                    if (g7Var2 == null) {
                        Intrinsics.i(L6.G1);
                        throw null;
                    }
                    int size = g7Var2.g.size();
                    g7 g7Var3 = eventDetailsFragment3.D;
                    if (g7Var3 == null) {
                        Intrinsics.i(L6.G1);
                        throw null;
                    }
                    K.setTargetPosition(g7Var3.i.size() + size + indexOf);
                    krk krkVar = eventDetailsFragment3.l;
                    krkVar.getClass();
                    n layoutManager = ((hy4) krkVar).b.getLayoutManager();
                    layoutManager.getClass();
                    ((LinearLayoutManager) layoutManager).startSmoothScroll(eventDetailsFragment3.K());
                }
                return Unit.a;
            case 5:
                p06 p06Var = (p06) obj2;
                f06 f06Var = (f06) obj;
                f06Var.getClass();
                e9b e9bVar2 = f06Var.b;
                TeamSelection teamSelection2 = ((yz5) ((zz5) obj3)).a;
                return f06.a(f06Var, null, e9b.a(e9bVar2, teamSelection2 == TeamSelection.Second ? p06Var.n : p06Var.m, null, teamSelection2, 2), null, null, null, null, null, false, 253);
            case 6:
                Player player = (Player) obj;
                player.getClass();
                Object orDefault = ((LinkedHashMap) obj2).getOrDefault(player, Boolean.TRUE);
                orDefault.getClass();
                ((EventHockeyPlayByPlayFragment) obj3).E(player, ((Boolean) orDefault).booleanValue());
                return Unit.a;
            case 7:
                u26 u26Var = (u26) obj2;
                List list = (List) obj;
                list.getClass();
                ?? E2 = ((EventMatchesFragment) obj3).E();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (obj4 instanceof Event) {
                        if (((Event) obj4).getStartTimestamp() * 1000 < System.currentTimeMillis()) {
                            i5++;
                        }
                        arrayList.add(obj4);
                    } else {
                        arrayList.add(obj4);
                    }
                    if (i5 == 30) {
                        Team team3 = u26Var.c;
                        E2.getClass();
                        E2.t.a = team3;
                        LinkedHashSet d0 = CollectionsKt.d0(arrayList, CollectionsKt.W0(E2.i));
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj5 : d0) {
                            if (obj5 instanceof y21) {
                                arrayList2.add(obj5);
                            }
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            E2.w((y21) it.next());
                        }
                        E2.F(arrayList);
                        return Unit.a;
                    }
                }
                Team team32 = u26Var.c;
                E2.getClass();
                E2.t.a = team32;
                LinkedHashSet d02 = CollectionsKt.d0(arrayList, CollectionsKt.W0(E2.i));
                ArrayList arrayList22 = new ArrayList();
                while (r1.hasNext()) {
                }
                it = arrayList22.iterator();
                while (it.hasNext()) {
                }
                E2.F(arrayList);
                return Unit.a;
            case 8:
                EventMmaStatisticsFragment eventMmaStatisticsFragment = (EventMmaStatisticsFragment) obj3;
                String str2 = (String) obj2;
                ((View) obj).getClass();
                krk krkVar2 = eventMmaStatisticsFragment.l;
                krkVar2.getClass();
                r15 = ((knc) krkVar2).d.getScrollY() > 0;
                jnc jncVar = (jnc) eventMmaStatisticsFragment.u.getValue();
                zqc.b.getClass();
                str2.getClass();
                zqc[] values = zqc.values();
                int length = values.length;
                while (true) {
                    if (i5 < length) {
                        zqc zqcVar2 = values[i5];
                        if (Intrinsics.c(zqcVar2.name(), str2)) {
                            zqcVar = zqcVar2;
                        } else {
                            i5++;
                        }
                    } else {
                        zqcVar = null;
                    }
                }
                if (zqcVar == null) {
                    zqcVar = zqc.CAREER;
                }
                jncVar.a(zqcVar, r15);
                return Unit.a;
            case 9:
                final m46 m46Var = (m46) obj3;
                final Function1 function1 = (Function1) obj2;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                esaVar.f("TeamSelector", "TeamSelector", new tc3(2060318692, new ct8() { // from class: j46
                    @Override // defpackage.ct8
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i7 = i5;
                        utc utcVar = utc.a;
                        a99 a99Var = nf3.a;
                        Function1 function12 = function1;
                        m46 m46Var2 = m46Var;
                        switch (i7) {
                            case 0:
                                of3 of3Var = (of3) obj7;
                                int intValue3 = ((Integer) obj8).intValue();
                                ((xpa) obj6).getClass();
                                av8 av8Var = (av8) of3Var;
                                if (av8Var.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    e9b e9bVar3 = m46Var2.a;
                                    gv9 gv9Var = e9bVar3.b.a;
                                    TeamSelection teamSelection3 = e9bVar3.c;
                                    boolean g = av8Var.g(function12);
                                    Object O2 = av8Var.O();
                                    if (g || O2 == a99Var) {
                                        O2 = new rzm(1, function12);
                                        av8Var.n0(O2);
                                    }
                                    l4a.a(gv9Var, teamSelection3, (Function1) O2, u0a.F(utcVar, icb.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 62), null, false, av8Var, 0, 48);
                                } else {
                                    av8Var.W();
                                }
                                break;
                            default:
                                of3 of3Var2 = (of3) obj7;
                                int intValue4 = ((Integer) obj8).intValue();
                                ((xpa) obj6).getClass();
                                av8 av8Var2 = (av8) of3Var2;
                                if (av8Var2.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    xtc F = u0a.F(utcVar, m46Var2.a.a.isEmpty() ? icb.c : icb.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 62);
                                    boolean g2 = av8Var2.g(function12);
                                    Object O3 = av8Var2.O();
                                    if (g2 || O3 == a99Var) {
                                        O3 = new k46(0, function12);
                                        av8Var2.n0(O3);
                                    }
                                    Function1 function13 = (Function1) O3;
                                    boolean i8 = av8Var2.i(m46Var2);
                                    Object O4 = av8Var2.O();
                                    if (i8 || O4 == a99Var) {
                                        O4 = new x16(m46Var2, 2);
                                        av8Var2.n0(O4);
                                    }
                                    td4.a(function13, F, (Function1) O4, av8Var2, 0, 0);
                                } else {
                                    av8Var2.W();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                }, true));
                if (m46Var.b != null) {
                    final int i7 = r15 ? 1 : 0;
                    esaVar.f("RugbyField", "RugbyField", new tc3(-589475874, new ct8() { // from class: j46
                        @Override // defpackage.ct8
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i72 = i7;
                            utc utcVar = utc.a;
                            a99 a99Var = nf3.a;
                            Function1 function12 = function1;
                            m46 m46Var2 = m46Var;
                            switch (i72) {
                                case 0:
                                    of3 of3Var = (of3) obj7;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    ((xpa) obj6).getClass();
                                    av8 av8Var = (av8) of3Var;
                                    if (av8Var.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        e9b e9bVar3 = m46Var2.a;
                                        gv9 gv9Var = e9bVar3.b.a;
                                        TeamSelection teamSelection3 = e9bVar3.c;
                                        boolean g = av8Var.g(function12);
                                        Object O2 = av8Var.O();
                                        if (g || O2 == a99Var) {
                                            O2 = new rzm(1, function12);
                                            av8Var.n0(O2);
                                        }
                                        l4a.a(gv9Var, teamSelection3, (Function1) O2, u0a.F(utcVar, icb.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 62), null, false, av8Var, 0, 48);
                                    } else {
                                        av8Var.W();
                                    }
                                    break;
                                default:
                                    of3 of3Var2 = (of3) obj7;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    ((xpa) obj6).getClass();
                                    av8 av8Var2 = (av8) of3Var2;
                                    if (av8Var2.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        xtc F = u0a.F(utcVar, m46Var2.a.a.isEmpty() ? icb.c : icb.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 62);
                                        boolean g2 = av8Var2.g(function12);
                                        Object O3 = av8Var2.O();
                                        if (g2 || O3 == a99Var) {
                                            O3 = new k46(0, function12);
                                            av8Var2.n0(O3);
                                        }
                                        Function1 function13 = (Function1) O3;
                                        boolean i8 = av8Var2.i(m46Var2);
                                        Object O4 = av8Var2.O();
                                        if (i8 || O4 == a99Var) {
                                            O4 = new x16(m46Var2, 2);
                                            av8Var2.n0(O4);
                                        }
                                        td4.a(function13, F, (Function1) O4, av8Var2, 0, 0);
                                    } else {
                                        av8Var2.W();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, true));
                }
                gv9 gv9Var = m46Var.a.a;
                esaVar.a(gv9Var.size(), null, new xo(gv9Var, 6), new tc3(2039820996, new l46(gv9Var, m46Var, function1, i5), true));
                return Unit.a;
            case 10:
                p46 p46Var = (p46) obj2;
                m46 m46Var2 = (m46) obj;
                m46Var2.getClass();
                e9b e9bVar3 = m46Var2.a;
                TeamSelection teamSelection3 = ((g46) ((h46) obj3)).a;
                return m46.a(m46Var2, e9b.a(e9bVar3, teamSelection3 == TeamSelection.Second ? p46Var.n : p46Var.m, null, teamSelection3, 2), null, false, 6);
            case 11:
                EventRecommendedOddsFragment eventRecommendedOddsFragment = (EventRecommendedOddsFragment) obj3;
                cdi cdiVar = (cdi) obj2;
                pld pldVar = (pld) obj;
                pldVar.getClass();
                if (eventRecommendedOddsFragment.t == null) {
                    ou4 ou4Var = new ou4(1);
                    eventRecommendedOddsFragment.t = ou4Var;
                    ou4Var.c(eventRecommendedOddsFragment.isResumed(), new mi(22, pldVar, eventRecommendedOddsFragment, cdiVar));
                }
                return Unit.a;
            case 12:
                return new zpf((gv9) obj3, (gv9) obj2, ((zpf) obj).c);
            case 13:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                return Long.valueOf(((v76) obj3).d.b0(glgVar, (Team) obj2));
            case 14:
                ArrayList arrayList3 = (ArrayList) obj2;
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                nlg V0 = glgVar2.V0((String) obj3);
                try {
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        V0.q(i6, ((Number) it4.next()).intValue());
                        i6++;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    while (V0.U0()) {
                        arrayList4.add(Integer.valueOf((int) V0.getLong(0)));
                    }
                    V0.close();
                    return arrayList4;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 15:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                ((v76) obj3).h.J(glgVar3, (ArrayList) obj2);
                return Unit.a;
            case 16:
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                ((v76) obj3).b.a0(glgVar4, (Tournament) obj2);
                return Unit.a;
            case 17:
                glg glgVar5 = (glg) obj;
                glgVar5.getClass();
                ((v76) obj3).e.a0(glgVar5, (DbEventScore) obj2);
                return Unit.a;
            case 18:
                glg glgVar6 = (glg) obj;
                glgVar6.getClass();
                return Integer.valueOf(((v76) obj3).f.e0(glgVar6, (Stage) obj2));
            case 19:
                return new le(new oj6((View) obj3, (Function0) obj2), 10);
            case 20:
                ArrayList arrayList5 = (ArrayList) obj3;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                esaVar2.a(arrayList5.size(), new zi(24, new yn6(7), arrayList5), new do6(arrayList5, 0), new tc3(802480018, new aj(5, arrayList5, (Function1) obj2), true));
                return Unit.a;
            case 21:
                s37 s37Var = (s37) obj;
                s37Var.getClass();
                int i8 = FantasyLeagueActivity.N;
                inb.E((Context) obj3, s37Var.a, ((lo6) obj2).g);
                return Unit.a;
            case 22:
                otk otkVar = ((FantasyComparisonPlayersDialogFragment) obj2).C;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel.getClass();
                Context context = ((ComposeView) obj3).getContext();
                context.getClass();
                FragmentActivity K2 = hkg.K(context);
                if (K2 != null) {
                    int i9 = ((yc7) otkVar.getValue()).f;
                    FantasyCompetitionType fantasyCompetitionType = FantasyCompetitionType.SEASON;
                    int i10 = ((yc7) otkVar.getValue()).g;
                    boolean z = ((yc7) otkVar.getValue()).h;
                    fantasyCompetitionType.getClass();
                    FantasyFootballPlayerBottomSheet fantasyFootballPlayerBottomSheet = new FantasyFootballPlayerBottomSheet();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(SearchResponseKt.PLAYER_ENTITY, fantasyRoundPlayerUiModel);
                    bundle.putBoolean("tripleCaptain", false);
                    bundle.putInt("competitionId", i9);
                    bundle.putSerializable("competitionType", fantasyCompetitionType);
                    bundle.putInt("roundId", i10);
                    bundle.putBoolean("assetsRestricted", z);
                    fantasyFootballPlayerBottomSheet.setArguments(bundle);
                    AppCompatActivity appCompatActivity = K2 instanceof AppCompatActivity ? (AppCompatActivity) K2 : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyFootballPlayerBottomSheet, appCompatActivity, null, i4));
                    }
                }
                return Unit.a;
            case 23:
                glg glgVar7 = (glg) obj;
                glgVar7.getClass();
                return Long.valueOf(((rp6) obj3).b.b0(glgVar7, (DbFantasyCompetition) obj2));
            case 24:
                Context context2 = (Context) obj3;
                nr6 nr6Var = (nr6) obj2;
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                int i11 = activityResult.a;
                if (i11 == -1) {
                    nr6Var.m();
                } else if (i11 == 98 && (O = hkg.O(context2)) != null) {
                    Intent intent = activityResult.b;
                    if (intent == null) {
                        intent = new Intent();
                        intent.putExtra("competitionId", nr6Var.h.c.c);
                        Unit unit = Unit.a;
                    }
                    z8e.C(O, 98, intent);
                }
                return Unit.a;
            case 25:
                is6 is6Var = (is6) obj3;
                hp6 hp6Var = (hp6) obj2;
                ActivityResult activityResult2 = (ActivityResult) obj;
                activityResult2.getClass();
                int i12 = activityResult2.a;
                Intent intent2 = activityResult2.b;
                if (i12 != 111) {
                    if (i12 == 222 && intent2 != null) {
                        Serializable y = g7a.y(intent2, "FANTASY_LEAGUE_EXTRA", j67.class);
                        if (y == null) {
                            a70.p("Serializable FANTASY_LEAGUE_EXTRA not found");
                            return null;
                        }
                        j67 j67Var = (j67) y;
                        int i13 = j67Var.a;
                        is6Var.getClass();
                        Iterator it5 = is6Var.l().c.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                ?? next = it5.next();
                                j67 j67Var2 = ((fo7) next).a;
                                if (j67Var2 != null && j67Var2.a == i13) {
                                    fo7Var = next;
                                }
                            } else {
                                fo7Var = null;
                            }
                        }
                        fo7 fo7Var2 = fo7Var;
                        if (fo7Var2 != null) {
                            eo7 eo7Var = fo7Var2.b;
                            boolean z2 = fo7Var2.c;
                            eo7Var.getClass();
                            fo7 fo7Var3 = new fo7(j67Var, eo7Var, z2);
                            gs6 l = is6Var.l();
                            gv9<fo7> gv9Var2 = is6Var.l().c;
                            ArrayList arrayList6 = new ArrayList(k13.r(gv9Var2, 10));
                            for (fo7 fo7Var4 : gv9Var2) {
                                j67 j67Var3 = fo7Var4.a;
                                if (j67Var3 != null && j67Var3.a == i13) {
                                    fo7Var4 = fo7Var3;
                                }
                                arrayList6.add(fo7Var4);
                            }
                            ((eoh) is6Var.g).setValue(gs6.a(l, l6g.W(arrayList6), null, 0, 0, 59));
                        }
                    }
                    return Unit.a;
                }
                if (intent2 != null) {
                    Serializable y2 = g7a.y(intent2, "FANTASY_LEAGUE_ID_EXTRA", Integer.class);
                    if (y2 == null) {
                        a70.p("Serializable FANTASY_LEAGUE_ID_EXTRA not found");
                        return null;
                    }
                    int intValue3 = ((Number) y2).intValue();
                    ArrayList w0 = CollectionsKt.w0(is6Var.l().d, is6Var.l().c);
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it6 = w0.iterator();
                    while (it6.hasNext()) {
                        Object next2 = it6.next();
                        j67 j67Var4 = ((fo7) next2).a;
                        if (j67Var4 != null && j67Var4.a != intValue3) {
                            arrayList7.add(next2);
                        }
                    }
                    Pair Q = rz8.Q(arrayList7, is6Var.i(), new yn6(26));
                    List list2 = (List) Q.a;
                    List list3 = (List) Q.b;
                    gs6 l2 = is6Var.l();
                    gv9 W = l6g.W(list2);
                    gv9 W2 = l6g.W(list3);
                    if (w0.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it7 = w0.iterator();
                        int i14 = 0;
                        while (it7.hasNext()) {
                            if (((fo7) it7.next()).c && (i14 = i14 + 1) < 0) {
                                kotlin.collections.b.p();
                                throw null;
                            }
                        }
                        i = i14;
                    }
                    if (!w0.isEmpty()) {
                        Iterator it8 = w0.iterator();
                        while (it8.hasNext()) {
                            j67 j67Var5 = ((fo7) it8.next()).a;
                            if ((j67Var5 != null ? j67Var5.j : null) == FantasyLeagueType.RANDOM && (i5 = i5 + 1) < 0) {
                                kotlin.collections.b.p();
                                throw null;
                            }
                        }
                    }
                    ((eoh) is6Var.g).setValue(gs6.a(l2, W, W2, i, i5, 3));
                    hp6Var.l(tmh.e);
                }
                return Unit.a;
            case 26:
                Context context3 = (Context) obj2;
                do7 do7Var = (do7) obj;
                do7Var.getClass();
                ((Function0) obj3).invoke();
                FragmentActivity O2 = hkg.O(context3);
                if (O2 != null) {
                    O2.finish();
                }
                FragmentActivity K3 = hkg.K(context3);
                if (K3 != null) {
                    K3.overridePendingTransition(R.anim.anim_fade_in_activity, R.anim.anim_fade_out_activity);
                }
                int i15 = FantasyCompetitionActivity.R;
                mx9.z(context3, do7Var.c.c, 12);
                return Unit.a;
            case 27:
                wu6 wu6Var = (wu6) obj3;
                esa esaVar3 = (esa) obj;
                esaVar3.getClass();
                gv9 gv9Var3 = wu6Var.c;
                esaVar3.a(gv9Var3.size(), null, new xo(gv9Var3, i3), new tc3(802480018, new vu6(gv9Var3, (Function1) obj2, wu6Var), true));
                return Unit.a;
            case 28:
                FantasyCompetitionStatisticsFragment fantasyCompetitionStatisticsFragment = (FantasyCompetitionStatisticsFragment) obj2;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel2.getClass();
                FragmentActivity O3 = hkg.O((Context) obj3);
                if (O3 != null) {
                    int i16 = fantasyCompetitionStatisticsFragment.D().w;
                    FantasyCompetitionType fantasyCompetitionType2 = fantasyCompetitionStatisticsFragment.D().u.c.d;
                    int i17 = fantasyCompetitionStatisticsFragment.D().x;
                    boolean z3 = fantasyCompetitionStatisticsFragment.D().u.c.A;
                    fantasyCompetitionType2.getClass();
                    FantasyFootballPlayerBottomSheet fantasyFootballPlayerBottomSheet2 = new FantasyFootballPlayerBottomSheet();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable(SearchResponseKt.PLAYER_ENTITY, fantasyRoundPlayerUiModel2);
                    bundle2.putBoolean("tripleCaptain", false);
                    bundle2.putInt("competitionId", i16);
                    bundle2.putSerializable("competitionType", fantasyCompetitionType2);
                    bundle2.putInt("roundId", i17);
                    bundle2.putBoolean("assetsRestricted", z3);
                    fantasyFootballPlayerBottomSheet2.setArguments(bundle2);
                    AppCompatActivity appCompatActivity2 = O3 instanceof AppCompatActivity ? (AppCompatActivity) O3 : null;
                    if (appCompatActivity2 != null) {
                        wca.x(appCompatActivity2.getLifecycle()).b(new r1(fantasyFootballPlayerBottomSheet2, appCompatActivity2, null, i4));
                    }
                }
                return Unit.a;
            default:
                Context context4 = (Context) obj2;
                esa esaVar4 = (esa) obj;
                esaVar4.getClass();
                for (Map.Entry entry : ((zx6) obj3).b.entrySet()) {
                    String str3 = (String) entry.getKey();
                    esa.d(esaVar4, str3, null, new tc3(1886486218, new d67(18, str3, (List) entry.getValue(), context4), true), 2);
                }
                return Unit.a;
        }
    }
}
