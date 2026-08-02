package defpackage;

import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class aq implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics = (AmericanFootballPlayerEventStatistics) obj;
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getReceivingDroppedPasses()));
            case 1:
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2 = (AmericanFootballPlayerEventStatistics) obj;
                americanFootballPlayerEventStatistics2.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics2.getRushingAttempts()));
            case 2:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r2.getRushingRedZoneAttempts()));
            case 3:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r2.getRushingAttempts()));
            case 4:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 5:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 6:
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics3 = (AmericanFootballPlayerEventStatistics) obj;
                americanFootballPlayerEventStatistics3.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics3.getRushingYards()));
            case 7:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r2.getRushingYards()));
            case 8:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 9:
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics4 = (AmericanFootballPlayerEventStatistics) obj;
                americanFootballPlayerEventStatistics4.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics4.getRushingTouchdowns()));
            case 10:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r2.getRushingTouchdowns()));
            case 11:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 12:
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics5 = (AmericanFootballPlayerEventStatistics) obj;
                americanFootballPlayerEventStatistics5.getClass();
                Double rushingYardsPerAttempt = americanFootballPlayerEventStatistics5.getRushingYardsPerAttempt();
                return Double.valueOf(rushingYardsPerAttempt != null ? rushingYardsPerAttempt.doubleValue() : 0.0d);
            case 13:
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics6 = (AmericanFootballPlayerEventStatistics) obj;
                americanFootballPlayerEventStatistics6.getClass();
                return rei.g(yid.k(americanFootballPlayerEventStatistics6.getRushingYardsPerAttempt()), 1);
            case 14:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 15:
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics7 = (AmericanFootballPlayerEventStatistics) obj;
                americanFootballPlayerEventStatistics7.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics7.getRushingLongest()));
            case 16:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r2.getRushingLongest()));
            case 17:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 18:
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics8 = (AmericanFootballPlayerEventStatistics) obj;
                americanFootballPlayerEventStatistics8.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics8.getRushingFirstDowns()));
            case 19:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r2.getRushingFirstDowns()));
            case 20:
                ((AmericanFootballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 21:
                AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics9 = (AmericanFootballPlayerEventStatistics) obj;
                americanFootballPlayerEventStatistics9.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics9.getRushingRedZoneAttempts()));
            case 22:
                return new q9k(R.string.am_football_assisted_tackles_short);
            case 23:
                return new q9k(R.string.am_football_assisted_tackles_long);
            case 24:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics.getClass();
                String y0 = o02.y0(americanFootballPlayerSeasonStatistics.getDefensiveAssistTackles());
                Regex regex = yid.a;
                return y0;
            case 25:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics2 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics2.getClass();
                Integer defensiveAssistTackles = americanFootballPlayerSeasonStatistics2.getDefensiveAssistTackles();
                String k = defensiveAssistTackles != null ? wt3.k(americanFootballPlayerSeasonStatistics2, Integer.valueOf(defensiveAssistTackles.intValue())) : null;
                Regex regex2 = yid.a;
                return k == null ? "-" : k;
            case 26:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics3 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics3.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics3.getDefensiveAssistTackles()));
            case 27:
                return new q9k(R.string.am_football_forced_fumbles_short);
            case 28:
                return new q9k(R.string.am_football_forced_fumbles_long);
            default:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics4 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics4.getClass();
                String y02 = o02.y0(americanFootballPlayerSeasonStatistics4.getDefensiveForcedFumbles());
                Regex regex3 = yid.a;
                return y02;
        }
    }
}
