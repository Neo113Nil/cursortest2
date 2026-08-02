package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ws implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String k;
        switch (this.a) {
            case 0:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics.getClass();
                Integer rushingAttempts = americanFootballPlayerSeasonStatistics.getRushingAttempts();
                k = rushingAttempts != null ? wt3.k(americanFootballPlayerSeasonStatistics, Integer.valueOf(rushingAttempts.intValue())) : null;
                Regex regex = yid.a;
                return k == null ? "-" : k;
            case 1:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics2 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics2.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics2.getRushingAttempts()));
            case 2:
                return new q9k(R.string.am_football_rushing_first_downs_short);
            case 3:
                return new q9k(R.string.am_football_rushing_first_downs_long);
            case 4:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics3 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics3.getClass();
                String y0 = o02.y0(americanFootballPlayerSeasonStatistics3.getRushingFirstDowns());
                Regex regex2 = yid.a;
                return y0;
            case 5:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics4 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics4.getClass();
                Integer rushingFirstDowns = americanFootballPlayerSeasonStatistics4.getRushingFirstDowns();
                k = rushingFirstDowns != null ? wt3.k(americanFootballPlayerSeasonStatistics4, Integer.valueOf(rushingFirstDowns.intValue())) : null;
                Regex regex3 = yid.a;
                return k == null ? "-" : k;
            case 6:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics5 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics5.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics5.getRushingFirstDowns()));
            case 7:
                return new q9k(R.string.am_football_lineups_fumbles);
            case 8:
                return new q9k(R.string.legend_am_foot_fumbles);
            case 9:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics6 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics6.getClass();
                String y02 = o02.y0(americanFootballPlayerSeasonStatistics6.getFumbleFumbles());
                Regex regex4 = yid.a;
                return y02;
            case 10:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics7 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics7.getClass();
                Integer fumbleFumbles = americanFootballPlayerSeasonStatistics7.getFumbleFumbles();
                k = fumbleFumbles != null ? wt3.k(americanFootballPlayerSeasonStatistics7, Integer.valueOf(fumbleFumbles.intValue())) : null;
                Regex regex5 = yid.a;
                return k == null ? "-" : k;
            case 11:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics8 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics8.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics8.getFumbleFumbles()));
            case 12:
                return new q9k(R.string.am_football_longest_rush_short);
            case 13:
                return new q9k(R.string.am_football_longest_rush_long);
            case 14:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics9 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics9.getClass();
                String y03 = o02.y0(americanFootballPlayerSeasonStatistics9.getRushingLongest());
                Regex regex6 = yid.a;
                return y03;
            case 15:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics10 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics10.getClass();
                String y04 = o02.y0(americanFootballPlayerSeasonStatistics10.getRushingLongest());
                Regex regex7 = yid.a;
                return y04;
            case 16:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics11 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics11.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics11.getRushingLongest()));
            case 17:
                return new q9k(R.string.am_football_rushing_touchdowns_short);
            case 18:
                return new q9k(R.string.am_football_rushing_touchdowns_long);
            case 19:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics12 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics12.getClass();
                String y05 = o02.y0(americanFootballPlayerSeasonStatistics12.getRushingTouchdowns());
                Regex regex8 = yid.a;
                return y05;
            case 20:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics13 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics13.getClass();
                Integer rushingTouchdowns = americanFootballPlayerSeasonStatistics13.getRushingTouchdowns();
                k = rushingTouchdowns != null ? wt3.k(americanFootballPlayerSeasonStatistics13, Integer.valueOf(rushingTouchdowns.intValue())) : null;
                Regex regex9 = yid.a;
                return k == null ? "-" : k;
            case 21:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics14 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics14.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics14.getRushingTouchdowns()));
            case 22:
                return new q9k(R.string.am_football_rushing_yards_short);
            case 23:
                return new q9k(R.string.am_football_rushing_yards_long);
            case 24:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics15 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics15.getClass();
                String y06 = o02.y0(americanFootballPlayerSeasonStatistics15.getRushingYards());
                Regex regex10 = yid.a;
                return y06;
            case 25:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics16 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics16.getClass();
                Integer rushingYards = americanFootballPlayerSeasonStatistics16.getRushingYards();
                k = rushingYards != null ? wt3.k(americanFootballPlayerSeasonStatistics16, Integer.valueOf(rushingYards.intValue())) : null;
                Regex regex11 = yid.a;
                return k == null ? "-" : k;
            case 26:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics17 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics17.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics17.getRushingYards()));
            case 27:
                return new q9k(R.string.am_football_average_rushing_yards_per_attempt_short);
            case 28:
                return new q9k(R.string.am_football_average_rushing_yards_per_attempt_long);
            default:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics18 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics18.getClass();
                Double b = yid.b(americanFootballPlayerSeasonStatistics18.getRushingYards(), americanFootballPlayerSeasonStatistics18.getRushingAttempts());
                k = b != null ? o02.P(b.doubleValue(), false) : null;
                return k == null ? "-" : k;
        }
    }
}
