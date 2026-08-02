package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class eq implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ eq(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics.getClass();
                Integer defensiveForcedFumbles = americanFootballPlayerSeasonStatistics.getDefensiveForcedFumbles();
                String k = defensiveForcedFumbles != null ? wt3.k(americanFootballPlayerSeasonStatistics, Integer.valueOf(defensiveForcedFumbles.intValue())) : null;
                Regex regex = yid.a;
                return k == null ? "-" : k;
            case 1:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics2 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics2.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics2.getDefensiveForcedFumbles()));
            case 2:
                return new q9k(R.string.am_football_interceptions_short);
            case 3:
                return new q9k(R.string.am_football_interceptions_long);
            case 4:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics3 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics3.getClass();
                String y0 = o02.y0(americanFootballPlayerSeasonStatistics3.getDefensiveInterceptions());
                Regex regex2 = yid.a;
                return y0;
            case 5:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics4 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics4.getClass();
                Integer defensiveInterceptions = americanFootballPlayerSeasonStatistics4.getDefensiveInterceptions();
                String k2 = defensiveInterceptions != null ? wt3.k(americanFootballPlayerSeasonStatistics4, Integer.valueOf(defensiveInterceptions.intValue())) : null;
                Regex regex3 = yid.a;
                return k2 == null ? "-" : k2;
            case 6:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics5 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics5.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics5.getDefensiveInterceptions()));
            case 7:
                return new q9k(R.string.am_football_interception_return_yards_short);
            case 8:
                return new q9k(R.string.am_football_interception_return_yards_long);
            case 9:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics6 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics6.getClass();
                String y02 = o02.y0(americanFootballPlayerSeasonStatistics6.getDefensiveInterceptionsYards());
                Regex regex4 = yid.a;
                return y02;
            case 10:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics7 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics7.getClass();
                Integer defensiveInterceptionsYards = americanFootballPlayerSeasonStatistics7.getDefensiveInterceptionsYards();
                String k3 = defensiveInterceptionsYards != null ? wt3.k(americanFootballPlayerSeasonStatistics7, Integer.valueOf(defensiveInterceptionsYards.intValue())) : null;
                Regex regex5 = yid.a;
                return k3 == null ? "-" : k3;
            case 11:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics8 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics8.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics8.getDefensiveInterceptionsYards()));
            case 12:
                return new q9k(R.string.am_football_average_interception_return_yards_short);
            case 13:
                return new q9k(R.string.am_football_average_interception_return_yards_long);
            case 14:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics9 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics9.getClass();
                Double b = yid.b(americanFootballPlayerSeasonStatistics9.getDefensiveInterceptionsYards(), americanFootballPlayerSeasonStatistics9.getDefensiveInterceptions());
                return o02.y0(b != null ? Integer.valueOf((int) b.doubleValue()) : null);
            case 15:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics10 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics10.getClass();
                Double b2 = yid.b(americanFootballPlayerSeasonStatistics10.getDefensiveInterceptionsYards(), americanFootballPlayerSeasonStatistics10.getDefensiveInterceptions());
                return o02.y0(b2 != null ? Integer.valueOf((int) b2.doubleValue()) : null);
            case 16:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics11 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics11.getClass();
                return Double.valueOf(yid.k(yid.b(americanFootballPlayerSeasonStatistics11.getDefensiveInterceptionsYards(), americanFootballPlayerSeasonStatistics11.getDefensiveInterceptions())));
            case 17:
                return new q9k(R.string.am_football_interception_touchdowns_short);
            case 18:
                return new q9k(R.string.am_football_interception_touchdowns);
            case 19:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics12 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics12.getClass();
                String y03 = o02.y0(americanFootballPlayerSeasonStatistics12.getDefensiveInterceptionsTouchdowns());
                Regex regex6 = yid.a;
                return y03;
            case 20:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics13 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics13.getClass();
                Integer defensiveInterceptionsTouchdowns = americanFootballPlayerSeasonStatistics13.getDefensiveInterceptionsTouchdowns();
                String k4 = defensiveInterceptionsTouchdowns != null ? wt3.k(americanFootballPlayerSeasonStatistics13, Integer.valueOf(defensiveInterceptionsTouchdowns.intValue())) : null;
                Regex regex7 = yid.a;
                return k4 == null ? "-" : k4;
            case 21:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics14 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics14.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics14.getDefensiveInterceptionsTouchdowns()));
            case 22:
                return new q9k(R.string.am_football_passes_defended_short);
            case 23:
                return new q9k(R.string.am_football_passes_defended_long);
            case 24:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics15 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics15.getClass();
                String y04 = o02.y0(americanFootballPlayerSeasonStatistics15.getDefensivePassesDefensed());
                Regex regex8 = yid.a;
                return y04;
            case 25:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics16 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics16.getClass();
                Integer defensivePassesDefensed = americanFootballPlayerSeasonStatistics16.getDefensivePassesDefensed();
                String k5 = defensivePassesDefensed != null ? wt3.k(americanFootballPlayerSeasonStatistics16, Integer.valueOf(defensivePassesDefensed.intValue())) : null;
                Regex regex9 = yid.a;
                return k5 == null ? "-" : k5;
            case 26:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics17 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics17.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics17.getDefensivePassesDefensed()));
            case 27:
                return new q9k(R.string.am_football_sacks_short);
            case 28:
                return new q9k(R.string.legend_am_foot_sacks);
            default:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics18 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics18.getClass();
                Double defensiveSacks = americanFootballPlayerSeasonStatistics18.getDefensiveSacks();
                String P = defensiveSacks != null ? o02.P(defensiveSacks.doubleValue(), false) : null;
                Regex regex10 = yid.a;
                return P == null ? "-" : P;
        }
    }
}
