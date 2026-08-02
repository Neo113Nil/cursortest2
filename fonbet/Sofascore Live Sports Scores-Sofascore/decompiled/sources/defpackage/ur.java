package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ur implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String k;
        switch (this.a) {
            case 0:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics.getClass();
                Integer passingTouchdowns = americanFootballPlayerSeasonStatistics.getPassingTouchdowns();
                k = passingTouchdowns != null ? wt3.k(americanFootballPlayerSeasonStatistics, Integer.valueOf(passingTouchdowns.intValue())) : null;
                Regex regex = yid.a;
                return k == null ? "-" : k;
            case 1:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics2 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics2.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics2.getPassingTouchdowns()));
            case 2:
                return new q9k(R.string.am_football_passing_yards_short);
            case 3:
                return new q9k(R.string.am_football_passing_yards_long);
            case 4:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics3 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics3.getClass();
                String y0 = o02.y0(americanFootballPlayerSeasonStatistics3.getPassingYards());
                Regex regex2 = yid.a;
                return y0;
            case 5:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics4 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics4.getClass();
                Integer passingYards = americanFootballPlayerSeasonStatistics4.getPassingYards();
                k = passingYards != null ? wt3.k(americanFootballPlayerSeasonStatistics4, Integer.valueOf(passingYards.intValue())) : null;
                Regex regex3 = yid.a;
                return k == null ? "-" : k;
            case 6:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics5 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics5.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics5.getPassingYards()));
            case 7:
                return new q9k(R.string.am_football_average_passing_yards_per_attempt_short);
            case 8:
                return new q9k(R.string.am_football_average_passing_yards_per_attempt_long);
            case 9:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics6 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics6.getClass();
                Double b = yid.b(americanFootballPlayerSeasonStatistics6.getPassingYards(), americanFootballPlayerSeasonStatistics6.getPassingAttempts());
                k = b != null ? o02.P(b.doubleValue(), false) : null;
                return k == null ? "-" : k;
            case 10:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics7 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics7.getClass();
                Double b2 = yid.b(americanFootballPlayerSeasonStatistics7.getPassingYards(), americanFootballPlayerSeasonStatistics7.getPassingAttempts());
                k = b2 != null ? o02.P(b2.doubleValue(), false) : null;
                return k == null ? "-" : k;
            case 11:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics8 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics8.getClass();
                return Double.valueOf(yid.k(yid.b(americanFootballPlayerSeasonStatistics8.getPassingYards(), americanFootballPlayerSeasonStatistics8.getPassingAttempts())));
            case 12:
                return new q9k(R.string.am_football_punts_inside_20_short);
            case 13:
                return new q9k(R.string.am_football_punts_inside_20_long);
            case 14:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics9 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics9.getClass();
                String y02 = o02.y0(americanFootballPlayerSeasonStatistics9.getPuntingInside20());
                Regex regex4 = yid.a;
                return y02;
            case 15:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics10 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics10.getClass();
                Integer puntingInside20 = americanFootballPlayerSeasonStatistics10.getPuntingInside20();
                k = puntingInside20 != null ? wt3.k(americanFootballPlayerSeasonStatistics10, Integer.valueOf(puntingInside20.intValue())) : null;
                Regex regex5 = yid.a;
                return k == null ? "-" : k;
            case 16:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics11 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics11.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics11.getPuntingInside20()));
            case 17:
                return new q9k(R.string.am_football_punts_inside_20_percent_short);
            case 18:
                return new q9k(R.string.am_football_punts_inside_20_percent_long);
            case 19:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics12 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics12.getClass();
                String o = yid.o(americanFootballPlayerSeasonStatistics12.getPuntingInside20(), americanFootballPlayerSeasonStatistics12.getPuntingTotal());
                return o == null ? "-" : o;
            case 20:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics13 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics13.getClass();
                String o2 = yid.o(americanFootballPlayerSeasonStatistics13.getPuntingInside20(), americanFootballPlayerSeasonStatistics13.getPuntingTotal());
                return o2 == null ? "-" : o2;
            case 21:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics14 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics14.getClass();
                return Double.valueOf(yid.k(yid.b(americanFootballPlayerSeasonStatistics14.getPuntingInside20(), americanFootballPlayerSeasonStatistics14.getPuntingTotal())));
            case 22:
                return new q9k(R.string.am_football_longest_punt_short);
            case 23:
                return new q9k(R.string.am_football_longest_punt_long);
            case 24:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics15 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics15.getClass();
                String y03 = o02.y0(americanFootballPlayerSeasonStatistics15.getPuntingLongest());
                Regex regex6 = yid.a;
                return y03;
            case 25:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics16 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics16.getClass();
                String y04 = o02.y0(americanFootballPlayerSeasonStatistics16.getPuntingLongest());
                Regex regex7 = yid.a;
                return y04;
            case 26:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics17 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics17.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics17.getPuntingLongest()));
            case 27:
                return new q9k(R.string.am_football_net_average_punt_yards_short);
            case 28:
                return new q9k(R.string.am_football_net_average_punt_yards_long);
            default:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics18 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics18.getClass();
                Double b3 = yid.b(americanFootballPlayerSeasonStatistics18.getPuntingNetYards(), americanFootballPlayerSeasonStatistics18.getPuntingTotal());
                k = b3 != null ? o02.P(b3.doubleValue(), false) : null;
                return k == null ? "-" : k;
        }
    }
}
