package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class zq implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ zq(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String k;
        switch (this.a) {
            case 0:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics.getClass();
                Integer kickingFgMade = americanFootballPlayerSeasonStatistics.getKickingFgMade();
                k = kickingFgMade != null ? wt3.k(americanFootballPlayerSeasonStatistics, Integer.valueOf(kickingFgMade.intValue())) : null;
                Regex regex = yid.a;
                return k == null ? "-" : k;
            case 1:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics2 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics2.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics2.getKickingFgMade()));
            case 2:
                return new q9k(R.string.am_football_field_goal_percentage_short);
            case 3:
                return new q9k(R.string.am_football_field_goal_percentage_long);
            case 4:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics3 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics3.getClass();
                String o = yid.o(americanFootballPlayerSeasonStatistics3.getKickingFgMade(), americanFootballPlayerSeasonStatistics3.getKickingFgAttempts());
                return o == null ? "-" : o;
            case 5:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics4 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics4.getClass();
                String o2 = yid.o(americanFootballPlayerSeasonStatistics4.getKickingFgMade(), americanFootballPlayerSeasonStatistics4.getKickingFgAttempts());
                return o2 == null ? "-" : o2;
            case 6:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics5 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics5.getClass();
                return Double.valueOf(yid.k(yid.b(americanFootballPlayerSeasonStatistics5.getKickingFgMade(), americanFootballPlayerSeasonStatistics5.getKickingFgAttempts())));
            case 7:
                return new q9k(R.string.am_football_longest_field_goal_made_short);
            case 8:
                return new q9k(R.string.legend_am_foot_longest_field_goal_made);
            case 9:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics6 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics6.getClass();
                String y0 = o02.y0(americanFootballPlayerSeasonStatistics6.getKickingFgLong());
                Regex regex2 = yid.a;
                return y0;
            case 10:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics7 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics7.getClass();
                String y02 = o02.y0(americanFootballPlayerSeasonStatistics7.getKickingFgLong());
                Regex regex3 = yid.a;
                return y02;
            case 11:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics8 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics8.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics8.getKickingFgLong()));
            case 12:
                return new q9k(R.string.am_football_total_kicking_points_short);
            case 13:
                return new q9k(R.string.am_football_total_kicking_points_long);
            case 14:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics9 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics9.getClass();
                String y03 = o02.y0(americanFootballPlayerSeasonStatistics9.getKickingTotalPoints());
                Regex regex4 = yid.a;
                return y03;
            case 15:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics10 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics10.getClass();
                Integer kickingTotalPoints = americanFootballPlayerSeasonStatistics10.getKickingTotalPoints();
                k = kickingTotalPoints != null ? wt3.k(americanFootballPlayerSeasonStatistics10, Integer.valueOf(kickingTotalPoints.intValue())) : null;
                Regex regex5 = yid.a;
                return k == null ? "-" : k;
            case 16:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics11 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics11.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics11.getKickingTotalPoints()));
            case 17:
                return new q9k(R.string.am_football_attempted_kick_returns_short);
            case 18:
                return new q9k(R.string.am_football_attempted_kick_returns_long);
            case 19:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics12 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics12.getClass();
                String y04 = o02.y0(americanFootballPlayerSeasonStatistics12.getKickReturnsTotal());
                Regex regex6 = yid.a;
                return y04;
            case 20:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics13 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics13.getClass();
                Integer kickReturnsTotal = americanFootballPlayerSeasonStatistics13.getKickReturnsTotal();
                k = kickReturnsTotal != null ? wt3.k(americanFootballPlayerSeasonStatistics13, Integer.valueOf(kickReturnsTotal.intValue())) : null;
                Regex regex7 = yid.a;
                return k == null ? "-" : k;
            case 21:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics14 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics14.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics14.getKickReturnsTotal()));
            case 22:
                return new q9k(R.string.am_football_average_kick_return_yards_short);
            case 23:
                return new q9k(R.string.am_football_average_kick_return_yards_long);
            case 24:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics15 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics15.getClass();
                Double b = yid.b(americanFootballPlayerSeasonStatistics15.getKickReturnsYards(), americanFootballPlayerSeasonStatistics15.getKickReturnsTotal());
                k = b != null ? o02.P(b.doubleValue(), false) : null;
                return k == null ? "-" : k;
            case 25:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics16 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics16.getClass();
                Double b2 = yid.b(americanFootballPlayerSeasonStatistics16.getKickReturnsYards(), americanFootballPlayerSeasonStatistics16.getKickReturnsTotal());
                k = b2 != null ? o02.P(b2.doubleValue(), false) : null;
                return k == null ? "-" : k;
            case 26:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics17 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics17.getClass();
                return Double.valueOf(yid.k(yid.b(americanFootballPlayerSeasonStatistics17.getKickReturnsYards(), americanFootballPlayerSeasonStatistics17.getKickReturnsTotal())));
            case 27:
                return new q9k(R.string.am_football_fair_catch_kick_short);
            case 28:
                return new q9k(R.string.am_football_fair_catch_kick);
            default:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics18 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics18.getClass();
                String y05 = o02.y0(americanFootballPlayerSeasonStatistics18.getKickReturnsFairCatches());
                Regex regex8 = yid.a;
                return y05;
        }
    }
}
