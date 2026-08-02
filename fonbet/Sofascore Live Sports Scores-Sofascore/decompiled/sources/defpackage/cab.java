package defpackage;

import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.SeasonRatingBreakdown;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.FootballTeamSeasonStatistics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cab {
    public static final cab a = new cab();
    public static final List b = b.j(aab.Dribbles, aab.Touches);
    public static final List c = b.j(aab.DefensiveContributions, aab.DuelsWon);
    public static final List d = b.j(aab.GoalsPrevented, aab.Saves);
    public static final List e = b.j(bab.l, bab.m);
    public static final List f = b.j(bab.n, bab.o);
    public static final List g = b.j(bab.p, bab.q);

    public static Pair a(List list, xbb xbbVar) {
        if (!Boolean.valueOf(!xbbVar.isEmpty()).equals(Boolean.TRUE)) {
            return null;
        }
        w9b w9bVar = (w9b) CollectionsKt.firstOrNull(xbbVar);
        i06 l = w9bVar != null ? l(list, w9bVar) : null;
        w9b w9bVar2 = (w9b) CollectionsKt.a0(1, xbbVar);
        return new Pair(l, w9bVar2 != null ? l(list, w9bVar2) : null);
    }

    public static x9b b(PlayerData playerData, xbb xbbVar, Double d2) {
        w9b w9bVar = (w9b) CollectionsKt.firstOrNull(xbbVar);
        t9b g2 = w9bVar != null ? g(playerData, w9bVar) : null;
        w9b w9bVar2 = (w9b) CollectionsKt.a0(1, xbbVar);
        return new x9b(d2, g2, w9bVar2 != null ? g(playerData, w9bVar2) : null);
    }

    public static x9b c(SeasonRatingBreakdown seasonRatingBreakdown, Double d2, List list) {
        aab aabVar = (aab) CollectionsKt.a0(0, list);
        t9b d3 = aabVar != null ? d(seasonRatingBreakdown, aabVar) : null;
        aab aabVar2 = (aab) CollectionsKt.a0(1, list);
        return new x9b(d2, d3, aabVar2 != null ? d(seasonRatingBreakdown, aabVar2) : null);
    }

    public static t9b d(SeasonRatingBreakdown seasonRatingBreakdown, aab aabVar) {
        Double d2 = (Double) aabVar.b.invoke(seasonRatingBreakdown);
        if (d2 == null) {
            return null;
        }
        return new t9b(aabVar.a, (String) aabVar.c.invoke(Double.valueOf(d2.doubleValue())));
    }

    public static Pair e(FootballTeamSeasonStatistics footballTeamSeasonStatistics, List list) {
        if (footballTeamSeasonStatistics != null && footballTeamSeasonStatistics.getMatches() > 0) {
            bab babVar = (bab) CollectionsKt.a0(0, list);
            i06 f2 = babVar != null ? f(footballTeamSeasonStatistics, babVar) : null;
            bab babVar2 = (bab) CollectionsKt.a0(1, list);
            i06 f3 = babVar2 != null ? f(footballTeamSeasonStatistics, babVar2) : null;
            if (f2 != null || f3 != null) {
                return new Pair(f2, f3);
            }
        }
        return null;
    }

    public static i06 f(FootballTeamSeasonStatistics footballTeamSeasonStatistics, bab babVar) {
        Double d2 = (Double) babVar.b.invoke(footballTeamSeasonStatistics);
        if (d2 == null) {
            return null;
        }
        double doubleValue = d2.doubleValue();
        int i = babVar.a;
        Function1 function1 = babVar.c;
        if (!babVar.d) {
            doubleValue /= footballTeamSeasonStatistics.getMatches();
        }
        return new i06(i, (String) function1.invoke(Double.valueOf(doubleValue)));
    }

    public static t9b g(PlayerData playerData, w9b w9bVar) {
        FootballPlayerEventStatistics footballStatistics = playerData.getFootballStatistics();
        if (!Boolean.valueOf(yid.m(footballStatistics != null ? footballStatistics.getMinutesPlayed() : null) > 0).equals(Boolean.TRUE)) {
            return null;
        }
        int i = w9bVar.b;
        Function1 function1 = w9bVar.d;
        FootballPlayerEventStatistics footballStatistics2 = playerData.getFootballStatistics();
        return new t9b(i, (String) function1.invoke(footballStatistics2 != null ? (Number) w9bVar.c.invoke(footballStatistics2) : null));
    }

    public static List h(ArrayList arrayList, aab... aabVarArr) {
        ArrayList arrayList2 = new ArrayList();
        for (aab aabVar : aabVarArr) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SeasonRatingBreakdown seasonRatingBreakdown = ((PlayerData) it.next()).getSeasonRatingBreakdown();
                    if ((seasonRatingBreakdown != null ? (Double) aabVar.b.invoke(seasonRatingBreakdown) : null) != null) {
                        arrayList2.add(aabVar);
                        break;
                    }
                }
            }
        }
        return CollectionsKt.L0(arrayList2, 2);
    }

    public static xbb i(LineupsResponse lineupsResponse, w9b... w9bVarArr) {
        xbb b2 = a.b();
        for (w9b w9bVar : w9bVarArr) {
            if (m(LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers(), w9bVar) || m(LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getPlayers(), w9bVar)) {
                b2.add(w9bVar);
                if (b2.size() > 1) {
                    break;
                }
            }
        }
        return a.a(b2);
    }

    public static List j(List list, bab... babVarArr) {
        ArrayList arrayList = new ArrayList();
        for (bab babVar : babVarArr) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (babVar.b.invoke((FootballTeamSeasonStatistics) it.next()) != null) {
                            arrayList.add(babVar);
                            break;
                        }
                    }
                }
            }
        }
        return CollectionsKt.L0(arrayList, 2);
    }

    public static String k(Number number) {
        if (number != null) {
            return String.valueOf(number.intValue());
        }
        return null;
    }

    public static i06 l(List list, w9b w9bVar) {
        Number number;
        int i = w9bVar.a;
        Function1 function1 = w9bVar.d;
        Iterator it = list.iterator();
        double d2 = 0.0d;
        while (it.hasNext()) {
            PlayerEventStatistics statistics = ((PlayerData) it.next()).getStatistics();
            Double d3 = null;
            if (!(statistics instanceof FootballPlayerEventStatistics)) {
                statistics = null;
            }
            FootballPlayerEventStatistics footballPlayerEventStatistics = (FootballPlayerEventStatistics) statistics;
            if (footballPlayerEventStatistics != null && (number = (Number) w9bVar.c.invoke(footballPlayerEventStatistics)) != null) {
                d3 = Double.valueOf(number.doubleValue());
            }
            d2 += yid.k(d3);
        }
        return new i06(i, (String) function1.invoke(Double.valueOf(d2)));
    }

    public static boolean m(List list, w9b w9bVar) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PlayerEventStatistics statistics = ((PlayerData) it.next()).getStatistics();
            Number number = null;
            if (!(statistics instanceof FootballPlayerEventStatistics)) {
                statistics = null;
            }
            FootballPlayerEventStatistics footballPlayerEventStatistics = (FootballPlayerEventStatistics) statistics;
            if (footballPlayerEventStatistics != null) {
                number = (Number) w9bVar.c.invoke(footballPlayerEventStatistics);
            }
            if (number != null) {
                return true;
            }
        }
        return false;
    }
}
