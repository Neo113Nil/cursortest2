package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class uh8 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ uh8(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = null;
        r1 = null;
        Double d = null;
        r1 = null;
        String str2 = null;
        str = null;
        switch (this.a) {
            case 0:
                return new q9k(R.string.football_expected_goals_conceded);
            case 1:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics.getClass();
                Double goalsPrevented = footballPlayerSeasonStatistics.getGoalsPrevented();
                if (goalsPrevented != null) {
                    double doubleValue = goalsPrevented.doubleValue();
                    if (footballPlayerSeasonStatistics.getGoalsConceded() != null) {
                        str = yid.c("%.2f", Double.valueOf(r6.intValue() + doubleValue));
                    }
                }
                Regex regex = yid.a;
                return str == null ? "-" : str;
            case 2:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics2 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics2.getClass();
                Double goalsPrevented2 = footballPlayerSeasonStatistics2.getGoalsPrevented();
                if (goalsPrevented2 != null) {
                    double doubleValue2 = goalsPrevented2.doubleValue();
                    if (footballPlayerSeasonStatistics2.getGoalsConceded() != null) {
                        str2 = rei.r(yid.m(footballPlayerSeasonStatistics2.getMinutesPlayed()), Double.valueOf(r6.intValue() + doubleValue2));
                    }
                }
                Regex regex2 = yid.a;
                return str2 == null ? "-" : str2;
            case 3:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics3 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics3.getClass();
                Double goalsPrevented3 = footballPlayerSeasonStatistics3.getGoalsPrevented();
                if (goalsPrevented3 != null) {
                    double doubleValue3 = goalsPrevented3.doubleValue();
                    if (footballPlayerSeasonStatistics3.getGoalsConceded() != null) {
                        d = Double.valueOf(r6.intValue() + doubleValue3);
                    }
                }
                return Double.valueOf(yid.k(d));
            case 4:
                return new q9k(R.string.football_expected_goal_involvements_short);
            case 5:
                return new q9k(R.string.football_expected_goal_involvements);
            case 6:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics4 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics4.getClass();
                Double expectedGoals = footballPlayerSeasonStatistics4.getExpectedGoals();
                String g = yid.g(expectedGoals != null ? Double.valueOf(yid.k(footballPlayerSeasonStatistics4.getExpectedAssists()) + expectedGoals.doubleValue()) : null);
                return g == null ? "-" : g;
            case 7:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics5 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics5.getClass();
                Double expectedGoals2 = footballPlayerSeasonStatistics5.getExpectedGoals();
                String r = expectedGoals2 != null ? rei.r(yid.m(footballPlayerSeasonStatistics5.getMinutesPlayed()), Double.valueOf(yid.k(footballPlayerSeasonStatistics5.getExpectedAssists()) + expectedGoals2.doubleValue())) : null;
                Regex regex3 = yid.a;
                return r == null ? "-" : r;
            case 8:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics6 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics6.getClass();
                Double expectedGoals3 = footballPlayerSeasonStatistics6.getExpectedGoals();
                return Double.valueOf(yid.k(expectedGoals3 != null ? Double.valueOf(yid.k(footballPlayerSeasonStatistics6.getExpectedAssists()) + expectedGoals3.doubleValue()) : null));
            case 9:
                return new q9k(R.string.ice_hockey_lineups_goals);
            case 10:
                return new q9k(R.string.goals);
            case 11:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics7 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics7.getClass();
                String y0 = o02.y0(footballPlayerSeasonStatistics7.getGoals());
                Regex regex4 = yid.a;
                return y0;
            case 12:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics8 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics8.getClass();
                Integer goals = footballPlayerSeasonStatistics8.getGoals();
                String j = goals != null ? fc6.j(footballPlayerSeasonStatistics8, Integer.valueOf(goals.intValue())) : null;
                Regex regex5 = yid.a;
                return j == null ? "-" : j;
            case 13:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics9 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics9.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics9.getGoals()));
            case 14:
                return new q9k(R.string.football_goals_conceded_short);
            case 15:
                return new q9k(R.string.football_goals_conceded);
            case 16:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics10 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics10.getClass();
                String y02 = o02.y0(footballPlayerSeasonStatistics10.getGoalsConceded());
                Regex regex6 = yid.a;
                return y02;
            case 17:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics11 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics11.getClass();
                Integer goalsConceded = footballPlayerSeasonStatistics11.getGoalsConceded();
                String j2 = goalsConceded != null ? fc6.j(footballPlayerSeasonStatistics11, Integer.valueOf(goalsConceded.intValue())) : null;
                Regex regex7 = yid.a;
                return j2 == null ? "-" : j2;
            case 18:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics12 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics12.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics12.getGoalsConceded()));
            case 19:
                return new q9k(R.string.football_goals_prevented_short);
            case 20:
                return new q9k(R.string.football_goals_prevented);
            case 21:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics13 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics13.getClass();
                String g2 = yid.g(footballPlayerSeasonStatistics13.getGoalsPrevented());
                return g2 == null ? "-" : g2;
            case 22:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics14 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics14.getClass();
                Double goalsPrevented4 = footballPlayerSeasonStatistics14.getGoalsPrevented();
                String r2 = goalsPrevented4 != null ? rei.r(yid.m(footballPlayerSeasonStatistics14.getMinutesPlayed()), Double.valueOf(goalsPrevented4.doubleValue())) : null;
                Regex regex8 = yid.a;
                return r2 == null ? "-" : r2;
            case 23:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics15 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics15.getClass();
                return Double.valueOf(yid.k(footballPlayerSeasonStatistics15.getGoalsPrevented()));
            case 24:
                return new q9k(R.string.football_goal_involvements_short);
            case 25:
                return new q9k(R.string.football_goal_involvements);
            case 26:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics16 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics16.getClass();
                Integer goals2 = footballPlayerSeasonStatistics16.getGoals();
                String y03 = o02.y0(goals2 != null ? Integer.valueOf(yid.m(footballPlayerSeasonStatistics16.getAssists()) + goals2.intValue()) : null);
                Regex regex9 = yid.a;
                return y03;
            case 27:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics17 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics17.getClass();
                Integer goals3 = footballPlayerSeasonStatistics17.getGoals();
                String j3 = goals3 != null ? fc6.j(footballPlayerSeasonStatistics17, Integer.valueOf(yid.m(footballPlayerSeasonStatistics17.getAssists()) + goals3.intValue())) : null;
                Regex regex10 = yid.a;
                return j3 == null ? "-" : j3;
            case 28:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics18 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics18.getClass();
                Integer goals4 = footballPlayerSeasonStatistics18.getGoals();
                return Integer.valueOf(yid.m(goals4 != null ? Integer.valueOf(yid.m(footballPlayerSeasonStatistics18.getAssists()) + goals4.intValue()) : null));
            default:
                return new q9k(R.string.am_football_interceptions_short);
        }
    }
}
