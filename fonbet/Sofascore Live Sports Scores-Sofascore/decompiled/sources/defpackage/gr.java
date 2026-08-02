package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class gr implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ gr(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String k;
        switch (this.a) {
            case 0:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics.getClass();
                Integer kickReturnsFairCatches = americanFootballPlayerSeasonStatistics.getKickReturnsFairCatches();
                k = kickReturnsFairCatches != null ? wt3.k(americanFootballPlayerSeasonStatistics, Integer.valueOf(kickReturnsFairCatches.intValue())) : null;
                Regex regex = yid.a;
                return k == null ? "-" : k;
            case 1:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics2 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics2.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics2.getKickReturnsFairCatches()));
            case 2:
                return new q9k(R.string.kick_returns_longest_short);
            case 3:
                return new q9k(R.string.kick_returns_longest);
            case 4:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics3 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics3.getClass();
                String y0 = o02.y0(americanFootballPlayerSeasonStatistics3.getKickReturnsLong());
                Regex regex2 = yid.a;
                return y0;
            case 5:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics4 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics4.getClass();
                String y02 = o02.y0(americanFootballPlayerSeasonStatistics4.getKickReturnsLong());
                Regex regex3 = yid.a;
                return y02;
            case 6:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics5 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics5.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics5.getKickReturnsLong()));
            case 7:
                return new q9k(R.string.am_football_kick_return_touchdowns);
            case 8:
                return new q9k(R.string.legend_am_foot_kick_return_touchdowns);
            case 9:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics6 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics6.getClass();
                String y03 = o02.y0(americanFootballPlayerSeasonStatistics6.getKickReturnsTouchdowns());
                Regex regex4 = yid.a;
                return y03;
            case 10:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics7 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics7.getClass();
                Integer kickReturnsTouchdowns = americanFootballPlayerSeasonStatistics7.getKickReturnsTouchdowns();
                k = kickReturnsTouchdowns != null ? wt3.k(americanFootballPlayerSeasonStatistics7, Integer.valueOf(kickReturnsTouchdowns.intValue())) : null;
                Regex regex5 = yid.a;
                return k == null ? "-" : k;
            case 11:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics8 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics8.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics8.getKickReturnsTouchdowns()));
            case 12:
                return new q9k(R.string.am_football_kick_return_yards_short);
            case 13:
                return new q9k(R.string.am_football_kick_return_yards_long);
            case 14:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics9 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics9.getClass();
                String y04 = o02.y0(americanFootballPlayerSeasonStatistics9.getKickReturnsYards());
                Regex regex6 = yid.a;
                return y04;
            case 15:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics10 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics10.getClass();
                Integer kickReturnsYards = americanFootballPlayerSeasonStatistics10.getKickReturnsYards();
                k = kickReturnsYards != null ? wt3.k(americanFootballPlayerSeasonStatistics10, Integer.valueOf(kickReturnsYards.intValue())) : null;
                Regex regex7 = yid.a;
                return k == null ? "-" : k;
            case 16:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics11 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics11.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics11.getKickReturnsYards()));
            case 17:
                return new q9k(R.string.am_football_attempted_passes_short);
            case 18:
                return new q9k(R.string.am_football_attempted_passes_long);
            case 19:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics12 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics12.getClass();
                String y05 = o02.y0(americanFootballPlayerSeasonStatistics12.getPassingAttempts());
                Regex regex8 = yid.a;
                return y05;
            case 20:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics13 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics13.getClass();
                Integer passingAttempts = americanFootballPlayerSeasonStatistics13.getPassingAttempts();
                k = passingAttempts != null ? wt3.k(americanFootballPlayerSeasonStatistics13, Integer.valueOf(passingAttempts.intValue())) : null;
                Regex regex9 = yid.a;
                return k == null ? "-" : k;
            case 21:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics14 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics14.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics14.getPassingAttempts()));
            case 22:
                return new q9k(R.string.am_football_completed_passes_short);
            case 23:
                return new q9k(R.string.am_football_completed_passes_long);
            case 24:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics15 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics15.getClass();
                String y06 = o02.y0(americanFootballPlayerSeasonStatistics15.getPassingCompletions());
                Regex regex10 = yid.a;
                return y06;
            case 25:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics16 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics16.getClass();
                Integer passingCompletions = americanFootballPlayerSeasonStatistics16.getPassingCompletions();
                k = passingCompletions != null ? wt3.k(americanFootballPlayerSeasonStatistics16, Integer.valueOf(passingCompletions.intValue())) : null;
                Regex regex11 = yid.a;
                return k == null ? "-" : k;
            case 26:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics17 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics17.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics17.getPassingCompletions()));
            case 27:
                return new q9k(R.string.am_football_completion_pct_short);
            case 28:
                return new q9k(R.string.am_football_completion_pct_long);
            default:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics18 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics18.getClass();
                String o = yid.o(americanFootballPlayerSeasonStatistics18.getPassingCompletions(), americanFootballPlayerSeasonStatistics18.getPassingAttempts());
                return o == null ? "-" : o;
        }
    }
}
