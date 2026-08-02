package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class nh8 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ nh8(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String j;
        switch (this.a) {
            case 0:
                return new q9k(R.string.football_clean_sheets);
            case 1:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics.getClass();
                String y0 = o02.y0(footballPlayerSeasonStatistics.getCleanSheet());
                Regex regex = yid.a;
                return y0;
            case 2:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics2 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics2.getClass();
                Integer cleanSheet = footballPlayerSeasonStatistics2.getCleanSheet();
                j = cleanSheet != null ? fc6.j(footballPlayerSeasonStatistics2, Integer.valueOf(cleanSheet.intValue())) : null;
                Regex regex2 = yid.a;
                return j == null ? "-" : j;
            case 3:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics3 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics3.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics3.getCleanSheet()));
            case 4:
                return new q9k(R.string.football_crossing_accuracy_percentage_short);
            case 5:
                return new q9k(R.string.football_crossing_accuracy_percentage);
            case 6:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics4 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics4.getClass();
                String o = yid.o(footballPlayerSeasonStatistics4.getAccurateCrosses(), footballPlayerSeasonStatistics4.getTotalCross());
                return o == null ? "-" : o;
            case 7:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics5 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics5.getClass();
                String o2 = yid.o(footballPlayerSeasonStatistics5.getAccurateCrosses(), footballPlayerSeasonStatistics5.getTotalCross());
                return o2 == null ? "-" : o2;
            case 8:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics6 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics6.getClass();
                return Double.valueOf(yid.k(yid.b(footballPlayerSeasonStatistics6.getAccurateCrosses(), footballPlayerSeasonStatistics6.getTotalCross())));
            case 9:
                return new q9k(R.string.football_dribbled_past_short);
            case 10:
                return new n9k(R.string.football_dribbled_past, (Gender) obj);
            case 11:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics7 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics7.getClass();
                String y02 = o02.y0(footballPlayerSeasonStatistics7.getDribbledPast());
                Regex regex3 = yid.a;
                return y02;
            case 12:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics8 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics8.getClass();
                Integer dribbledPast = footballPlayerSeasonStatistics8.getDribbledPast();
                j = dribbledPast != null ? fc6.j(footballPlayerSeasonStatistics8, Integer.valueOf(dribbledPast.intValue())) : null;
                Regex regex4 = yid.a;
                return j == null ? "-" : j;
            case 13:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics9 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics9.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics9.getDribbledPast()));
            case 14:
                return new q9k(R.string.football_errors_to_goal_short);
            case 15:
                return new q9k(R.string.errors_leading_to_goal);
            case 16:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics10 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics10.getClass();
                String y03 = o02.y0(footballPlayerSeasonStatistics10.getErrorLeadToGoal());
                Regex regex5 = yid.a;
                return y03;
            case 17:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics11 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics11.getClass();
                Integer errorLeadToGoal = footballPlayerSeasonStatistics11.getErrorLeadToGoal();
                j = errorLeadToGoal != null ? fc6.j(footballPlayerSeasonStatistics11, Integer.valueOf(errorLeadToGoal.intValue())) : null;
                Regex regex6 = yid.a;
                return j == null ? "-" : j;
            case 18:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics12 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics12.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics12.getErrorLeadToGoal()));
            case 19:
                return new q9k(R.string.football_expected_assists_short);
            case 20:
                return new q9k(R.string.football_expected_assists);
            case 21:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics13 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics13.getClass();
                Double expectedAssists = footballPlayerSeasonStatistics13.getExpectedAssists();
                j = expectedAssists != null ? yid.c("%.2f", expectedAssists) : null;
                Regex regex7 = yid.a;
                return j == null ? "-" : j;
            case 22:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics14 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics14.getClass();
                Double expectedAssists2 = footballPlayerSeasonStatistics14.getExpectedAssists();
                j = expectedAssists2 != null ? rei.r(yid.m(footballPlayerSeasonStatistics14.getMinutesPlayed()), Double.valueOf(expectedAssists2.doubleValue())) : null;
                Regex regex8 = yid.a;
                return j == null ? "-" : j;
            case 23:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics15 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics15.getClass();
                return Double.valueOf(yid.k(footballPlayerSeasonStatistics15.getExpectedAssists()));
            case 24:
                return new q9k(R.string.football_expected_goals_short);
            case 25:
                return new q9k(R.string.football_expected_goals);
            case 26:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics16 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics16.getClass();
                Double expectedGoals = footballPlayerSeasonStatistics16.getExpectedGoals();
                j = expectedGoals != null ? yid.c("%.2f", expectedGoals) : null;
                Regex regex9 = yid.a;
                return j == null ? "-" : j;
            case 27:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics17 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics17.getClass();
                Double expectedGoals2 = footballPlayerSeasonStatistics17.getExpectedGoals();
                j = expectedGoals2 != null ? rei.r(yid.m(footballPlayerSeasonStatistics17.getMinutesPlayed()), Double.valueOf(expectedGoals2.doubleValue())) : null;
                Regex regex10 = yid.a;
                return j == null ? "-" : j;
            case 28:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics18 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics18.getClass();
                return Double.valueOf(yid.k(footballPlayerSeasonStatistics18.getExpectedGoals()));
            default:
                return new q9k(R.string.football_expected_goals_conceded_short);
        }
    }
}
