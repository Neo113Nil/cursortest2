package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.newNetwork.statistics.season.team.TennisTeamSeasonStatistics;
import com.sofascore.results.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class u6j {
    public static final String a(TennisTeamSeasonStatistics tennisTeamSeasonStatistics) {
        Integer aces = tennisTeamSeasonStatistics.getAces();
        Integer matches = tennisTeamSeasonStatistics.getMatches();
        if (aces == null || matches == null) {
            return null;
        }
        int intValue = matches.intValue();
        return intValue == 0 ? "0.0" : String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(aces.intValue() / intValue)}, 1));
    }

    public static final Double b(TennisTeamSeasonStatistics tennisTeamSeasonStatistics) {
        Integer breakPointsTotal = tennisTeamSeasonStatistics.getBreakPointsTotal();
        Integer breakPointsScored = tennisTeamSeasonStatistics.getBreakPointsScored();
        if (breakPointsTotal == null || breakPointsScored == null) {
            return null;
        }
        int intValue = breakPointsScored.intValue();
        int intValue2 = breakPointsTotal.intValue();
        return Double.valueOf(intValue2 == 0 ? 0.0d : (intValue / intValue2) * 100.0d);
    }

    public static final String c(TennisTeamSeasonStatistics tennisTeamSeasonStatistics) {
        Integer breakPointsTotal = tennisTeamSeasonStatistics.getBreakPointsTotal();
        Integer breakPointsScored = tennisTeamSeasonStatistics.getBreakPointsScored();
        if (breakPointsTotal == null || breakPointsScored == null) {
            return null;
        }
        return rei.f(breakPointsScored.intValue(), 0, Integer.valueOf(breakPointsTotal.intValue()));
    }

    public static final Double d(TennisTeamSeasonStatistics tennisTeamSeasonStatistics) {
        Integer opponentBreakPointsTotal = tennisTeamSeasonStatistics.getOpponentBreakPointsTotal();
        Integer opponentBreakPointsScored = tennisTeamSeasonStatistics.getOpponentBreakPointsScored();
        if (opponentBreakPointsTotal == null || opponentBreakPointsScored == null) {
            return null;
        }
        int intValue = opponentBreakPointsScored.intValue();
        int intValue2 = opponentBreakPointsTotal.intValue();
        return Double.valueOf(intValue2 == 0 ? 0.0d : ((intValue2 - intValue) / intValue2) * 100.0d);
    }

    public static final String e(TennisTeamSeasonStatistics tennisTeamSeasonStatistics) {
        Integer opponentBreakPointsTotal = tennisTeamSeasonStatistics.getOpponentBreakPointsTotal();
        Integer opponentBreakPointsScored = tennisTeamSeasonStatistics.getOpponentBreakPointsScored();
        if (opponentBreakPointsTotal == null || opponentBreakPointsScored == null) {
            return null;
        }
        int intValue = opponentBreakPointsScored.intValue();
        int intValue2 = opponentBreakPointsTotal.intValue();
        return rei.f(intValue2 - intValue, 0, Integer.valueOf(intValue2));
    }

    public static final String f(TennisTeamSeasonStatistics tennisTeamSeasonStatistics) {
        Integer secondServeTotal = tennisTeamSeasonStatistics.getSecondServeTotal();
        Integer secondServePointsTotal = tennisTeamSeasonStatistics.getSecondServePointsTotal();
        Integer matches = tennisTeamSeasonStatistics.getMatches();
        if (secondServeTotal == null || secondServePointsTotal == null || matches == null) {
            return null;
        }
        int intValue = matches.intValue();
        return intValue == 0 ? "0.0" : String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf((secondServeTotal.intValue() - secondServePointsTotal.intValue()) / intValue)}, 1));
    }

    public static final Double g(TennisTeamSeasonStatistics tennisTeamSeasonStatistics) {
        Integer firstServeTotal = tennisTeamSeasonStatistics.getFirstServeTotal();
        Integer firstServePointsTotal = tennisTeamSeasonStatistics.getFirstServePointsTotal();
        if (firstServeTotal == null || firstServePointsTotal == null) {
            return null;
        }
        int intValue = firstServePointsTotal.intValue();
        int intValue2 = firstServeTotal.intValue();
        return Double.valueOf(intValue2 == 0 ? 0.0d : (intValue / intValue2) * 100.0d);
    }

    public static final Double h(TennisTeamSeasonStatistics tennisTeamSeasonStatistics) {
        Integer firstServePointsTotal = tennisTeamSeasonStatistics.getFirstServePointsTotal();
        Integer firstServePointsScored = tennisTeamSeasonStatistics.getFirstServePointsScored();
        if (firstServePointsTotal == null || firstServePointsScored == null) {
            return null;
        }
        int intValue = firstServePointsScored.intValue();
        int intValue2 = firstServePointsTotal.intValue();
        return Double.valueOf(intValue2 == 0 ? 0.0d : (intValue / intValue2) * 100.0d);
    }

    public static final xbb i(TennisTeamSeasonStatistics tennisTeamSeasonStatistics, TennisTeamSeasonStatistics tennisTeamSeasonStatistics2) {
        xbb b = a.b();
        Double g = g(tennisTeamSeasonStatistics);
        Double g2 = g(tennisTeamSeasonStatistics2);
        if (g != null && g2 != null) {
            double doubleValue = g2.doubleValue();
            double doubleValue2 = g.doubleValue();
            b.add(new i8g(new q9k(R.string.tennis_first_serve), rei.e(Double.valueOf(doubleValue2), 0, 6), rei.e(Double.valueOf(doubleValue), 0, 6), Double.valueOf(doubleValue2), Double.valueOf(doubleValue)));
        }
        String a = a(tennisTeamSeasonStatistics);
        String a2 = a(tennisTeamSeasonStatistics2);
        if (a != null && a2 != null) {
            b.add(new i8g(new q9k(R.string.tennis_average_aces_per_match), a, a2, Double.valueOf(Double.parseDouble(a)), Double.valueOf(Double.parseDouble(a2))));
        }
        String e = e(tennisTeamSeasonStatistics);
        String e2 = e(tennisTeamSeasonStatistics2);
        if (e != null && e2 != null) {
            b.add(new i8g(new q9k(R.string.break_points_saved), e, e2, d(tennisTeamSeasonStatistics), d(tennisTeamSeasonStatistics2)));
        }
        String c = c(tennisTeamSeasonStatistics);
        String c2 = c(tennisTeamSeasonStatistics2);
        if (c != null && c2 != null) {
            b.add(new i8g(new q9k(R.string.break_points_converted), c, c2, b(tennisTeamSeasonStatistics), b(tennisTeamSeasonStatistics2)));
        }
        return a.a(b);
    }

    public static final xbb j(TennisTeamSeasonStatistics tennisTeamSeasonStatistics, Context context) {
        xbb b = a.b();
        String string = context.getString(R.string.performance);
        string.getClass();
        xbb b2 = a.b();
        String p = p(tennisTeamSeasonStatistics);
        if (p != null) {
            String string2 = context.getString(R.string.tennis_matches_won);
            string2.getClass();
            b2.add(new jei(string2, p, null));
        }
        String o = o(tennisTeamSeasonStatistics);
        if (o != null) {
            String string3 = context.getString(R.string.tournaments_won);
            string3.getClass();
            b2.add(new jei(string3, o, null));
        }
        String k = k(tennisTeamSeasonStatistics, context);
        if (k != null) {
            String string4 = context.getString(R.string.result);
            string4.getClass();
            b2.add(new jei(string4, k, null));
        }
        xbb a = a.a(b2);
        km5 km5Var = km5.a;
        ezg.g(b, string, a, km5Var);
        String string5 = context.getString(R.string.tennis_service_stat);
        string5.getClass();
        xbb b3 = a.b();
        Double g = g(tennisTeamSeasonStatistics);
        if (g != null) {
            double doubleValue = g.doubleValue();
            String string6 = context.getString(R.string.tennis_first_serve);
            string6.getClass();
            b3.add(new jei(string6, rei.e(Double.valueOf(doubleValue), 0, 6), null));
        }
        Double h = h(tennisTeamSeasonStatistics);
        if (h != null) {
            double doubleValue2 = h.doubleValue();
            String string7 = context.getString(R.string.tennis_first_serve_points_won);
            string7.getClass();
            b3.add(new jei(string7, rei.e(Double.valueOf(doubleValue2), 0, 6), null));
        }
        Double l = l(tennisTeamSeasonStatistics);
        if (l != null) {
            double doubleValue3 = l.doubleValue();
            String string8 = context.getString(R.string.tennis_second_serve);
            string8.getClass();
            b3.add(new jei(string8, rei.e(Double.valueOf(doubleValue3), 0, 6), null));
        }
        Double m = m(tennisTeamSeasonStatistics);
        if (m != null) {
            double doubleValue4 = m.doubleValue();
            String string9 = context.getString(R.string.tennis_second_serve_points);
            string9.getClass();
            b3.add(new jei(string9, rei.e(Double.valueOf(doubleValue4), 0, 6), null));
        }
        String a2 = a(tennisTeamSeasonStatistics);
        if (a2 != null) {
            String string10 = context.getString(R.string.tennis_average_aces_per_match);
            string10.getClass();
            b3.add(new jei(string10, a2, null));
        }
        String f = f(tennisTeamSeasonStatistics);
        if (f != null) {
            String string11 = context.getString(R.string.tennis_average_double_faults_per_match);
            string11.getClass();
            b3.add(new jei(string11, f, null));
        }
        ezg.g(b, string5, a.a(b3), km5Var);
        String string12 = context.getString(R.string.tennis_pressure_metrics);
        string12.getClass();
        xbb b4 = a.b();
        String e = e(tennisTeamSeasonStatistics);
        if (e != null) {
            String string13 = context.getString(R.string.break_points_saved);
            string13.getClass();
            b4.add(new jei(string13, e, null));
        }
        String c = c(tennisTeamSeasonStatistics);
        if (c != null) {
            String string14 = context.getString(R.string.break_points_converted);
            string14.getClass();
            b4.add(new jei(string14, c, null));
        }
        String n = n(tennisTeamSeasonStatistics);
        if (n != null) {
            String string15 = context.getString(R.string.tennis_tiebreaks_won);
            string15.getClass();
            b4.add(new jei(string15, n, null));
        }
        ezg.g(b, string12, a.a(b4), km5Var);
        String string16 = context.getString(R.string.tennis_disclaimer);
        string16.getClass();
        b.add(new w5b(string16));
        return a.a(b);
    }

    public static final String k(TennisTeamSeasonStatistics tennisTeamSeasonStatistics, Context context) {
        String placementRoundName = tennisTeamSeasonStatistics.getPlacementRoundName();
        Boolean placementIsWinner = tennisTeamSeasonStatistics.getPlacementIsWinner();
        if (placementRoundName == null || placementIsWinner == null) {
            return null;
        }
        return placementIsWinner.booleanValue() ? context.getString(R.string.winner) : d7g.c(context, placementRoundName, Sports.TENNIS);
    }

    public static final Double l(TennisTeamSeasonStatistics tennisTeamSeasonStatistics) {
        Integer secondServeTotal = tennisTeamSeasonStatistics.getSecondServeTotal();
        Integer secondServePointsTotal = tennisTeamSeasonStatistics.getSecondServePointsTotal();
        if (secondServeTotal == null || secondServePointsTotal == null) {
            return null;
        }
        int intValue = secondServePointsTotal.intValue();
        int intValue2 = secondServeTotal.intValue();
        return Double.valueOf(intValue2 == 0 ? 0.0d : (intValue / intValue2) * 100.0d);
    }

    public static final Double m(TennisTeamSeasonStatistics tennisTeamSeasonStatistics) {
        Integer secondServeTotal = tennisTeamSeasonStatistics.getSecondServeTotal();
        Integer secondServePointsScored = tennisTeamSeasonStatistics.getSecondServePointsScored();
        if (secondServeTotal == null || secondServePointsScored == null) {
            return null;
        }
        int intValue = secondServePointsScored.intValue();
        int intValue2 = secondServeTotal.intValue();
        return Double.valueOf(intValue2 == 0 ? 0.0d : (intValue / intValue2) * 100.0d);
    }

    public static final String n(TennisTeamSeasonStatistics tennisTeamSeasonStatistics) {
        Integer tiebreaksWon = tennisTeamSeasonStatistics.getTiebreaksWon();
        Integer tiebreakLosses = tennisTeamSeasonStatistics.getTiebreakLosses();
        if (tiebreaksWon == null || tiebreakLosses == null) {
            return null;
        }
        int intValue = tiebreakLosses.intValue();
        int intValue2 = tiebreaksWon.intValue();
        return rei.f(intValue2, 0, Integer.valueOf(intValue + intValue2));
    }

    public static final String o(TennisTeamSeasonStatistics tennisTeamSeasonStatistics) {
        Integer tournamentsPlayed = tennisTeamSeasonStatistics.getTournamentsPlayed();
        Integer tournamentsWon = tennisTeamSeasonStatistics.getTournamentsWon();
        if (tournamentsPlayed == null || tournamentsWon == null) {
            return null;
        }
        return rei.f(tournamentsWon.intValue(), 0, Integer.valueOf(tournamentsPlayed.intValue()));
    }

    public static final String p(TennisTeamSeasonStatistics tennisTeamSeasonStatistics) {
        Integer matches = tennisTeamSeasonStatistics.getMatches();
        Integer wins = tennisTeamSeasonStatistics.getWins();
        if (matches == null || wins == null) {
            return null;
        }
        return rei.f(wins.intValue(), 0, Integer.valueOf(matches.intValue()));
    }
}
