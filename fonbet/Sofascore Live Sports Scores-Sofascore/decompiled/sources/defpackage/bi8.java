package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class bi8 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ bi8(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String j;
        switch (this.a) {
            case 0:
                return new q9k(R.string.interceptions);
            case 1:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics.getClass();
                String y0 = o02.y0(footballPlayerSeasonStatistics.getInterceptions());
                Regex regex = yid.a;
                return y0;
            case 2:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics2 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics2.getClass();
                Integer interceptions = footballPlayerSeasonStatistics2.getInterceptions();
                j = interceptions != null ? fc6.j(footballPlayerSeasonStatistics2, Integer.valueOf(interceptions.intValue())) : null;
                Regex regex2 = yid.a;
                return j == null ? "-" : j;
            case 3:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics3 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics3.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics3.getInterceptions()));
            case 4:
                return new q9k(R.string.football_key_passes_short);
            case 5:
                return new q9k(R.string.key_passes);
            case 6:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics4 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics4.getClass();
                String y02 = o02.y0(footballPlayerSeasonStatistics4.getKeyPasses());
                Regex regex3 = yid.a;
                return y02;
            case 7:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics5 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics5.getClass();
                Integer keyPasses = footballPlayerSeasonStatistics5.getKeyPasses();
                j = keyPasses != null ? fc6.j(footballPlayerSeasonStatistics5, Integer.valueOf(keyPasses.intValue())) : null;
                Regex regex4 = yid.a;
                return j == null ? "-" : j;
            case 8:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics6 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics6.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics6.getKeyPasses()));
            case 9:
                return new q9k(R.string.football_long_balls_accuracy_percentage_short);
            case 10:
                return new q9k(R.string.football_long_balls_accuracy_percentage);
            case 11:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics7 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics7.getClass();
                String o = yid.o(footballPlayerSeasonStatistics7.getAccurateLongBalls(), footballPlayerSeasonStatistics7.getTotalLongBalls());
                return o == null ? "-" : o;
            case 12:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics8 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics8.getClass();
                String o2 = yid.o(footballPlayerSeasonStatistics8.getAccurateLongBalls(), footballPlayerSeasonStatistics8.getTotalLongBalls());
                return o2 == null ? "-" : o2;
            case 13:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics9 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics9.getClass();
                return Double.valueOf(yid.k(yid.b(footballPlayerSeasonStatistics9.getAccurateLongBalls(), footballPlayerSeasonStatistics9.getTotalLongBalls())));
            case 14:
                return new q9k(R.string.matches_played_short);
            case 15:
                return new q9k(R.string.matches_played);
            case 16:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics10 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics10.getClass();
                String y03 = o02.y0(footballPlayerSeasonStatistics10.getAppearances());
                Regex regex5 = yid.a;
                return y03;
            case 17:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics11 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics11.getClass();
                String y04 = o02.y0(footballPlayerSeasonStatistics11.getAppearances());
                Regex regex6 = yid.a;
                return y04;
            case 18:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics12 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics12.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics12.getAppearances()));
            case 19:
                return new q9k(R.string.basketball_lineups_minutes_played);
            case 20:
                return new q9k(R.string.football_minutes_played);
            case 21:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics13 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics13.getClass();
                String y05 = o02.y0(footballPlayerSeasonStatistics13.getMinutesPlayed());
                Regex regex7 = yid.a;
                return y05;
            case 22:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics14 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics14.getClass();
                Integer minutesPlayed = footballPlayerSeasonStatistics14.getMinutesPlayed();
                j = minutesPlayed != null ? rei.l(yid.m(footballPlayerSeasonStatistics14.getAppearances()), Integer.valueOf(minutesPlayed.intValue())) : null;
                Regex regex8 = yid.a;
                return j == null ? "-" : j;
            case 23:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics15 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics15.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics15.getAppearances()));
            case 24:
                return new q9k(R.string.football_pass_accuracy_percentage_short);
            case 25:
                return new q9k(R.string.football_passing_accuracy_percentage);
            case 26:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics16 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics16.getClass();
                String o3 = yid.o(footballPlayerSeasonStatistics16.getAccuratePasses(), footballPlayerSeasonStatistics16.getTotalPasses());
                return o3 == null ? "-" : o3;
            case 27:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics17 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics17.getClass();
                String o4 = yid.o(footballPlayerSeasonStatistics17.getAccuratePasses(), footballPlayerSeasonStatistics17.getTotalPasses());
                return o4 == null ? "-" : o4;
            case 28:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics18 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics18.getClass();
                return Double.valueOf(yid.k(yid.b(footballPlayerSeasonStatistics18.getAccuratePasses(), footballPlayerSeasonStatistics18.getTotalPasses())));
            default:
                return new q9k(R.string.football_penalties_saved_short);
        }
    }
}
