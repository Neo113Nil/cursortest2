package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ps implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ps(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String k;
        switch (this.a) {
            case 0:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics.getClass();
                String y0 = o02.y0(americanFootballPlayerSeasonStatistics.getReceivingLongest());
                Regex regex = yid.a;
                return y0;
            case 1:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics2 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics2.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics2.getReceivingLongest()));
            case 2:
                return new q9k(R.string.am_football_receptions_short);
            case 3:
                return new q9k(R.string.am_football_receptions_long);
            case 4:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics3 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics3.getClass();
                String y02 = o02.y0(americanFootballPlayerSeasonStatistics3.getReceivingReceptions());
                Regex regex2 = yid.a;
                return y02;
            case 5:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics4 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics4.getClass();
                Integer receivingReceptions = americanFootballPlayerSeasonStatistics4.getReceivingReceptions();
                k = receivingReceptions != null ? wt3.k(americanFootballPlayerSeasonStatistics4, Integer.valueOf(receivingReceptions.intValue())) : null;
                Regex regex3 = yid.a;
                return k == null ? "-" : k;
            case 6:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics5 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics5.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics5.getReceivingReceptions()));
            case 7:
                return new q9k(R.string.am_football_receiving_targets_short);
            case 8:
                return new q9k(R.string.am_football_receiving_targets_long);
            case 9:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics6 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics6.getClass();
                String y03 = o02.y0(americanFootballPlayerSeasonStatistics6.getReceivingTargets());
                Regex regex4 = yid.a;
                return y03;
            case 10:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics7 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics7.getClass();
                Integer receivingTargets = americanFootballPlayerSeasonStatistics7.getReceivingTargets();
                k = receivingTargets != null ? wt3.k(americanFootballPlayerSeasonStatistics7, Integer.valueOf(receivingTargets.intValue())) : null;
                Regex regex5 = yid.a;
                return k == null ? "-" : k;
            case 11:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics8 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics8.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics8.getReceivingTargets()));
            case 12:
                return new q9k(R.string.am_football_receiving_touchdowns_short);
            case 13:
                return new q9k(R.string.am_football_receiving_touchdowns_long);
            case 14:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics9 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics9.getClass();
                String y04 = o02.y0(americanFootballPlayerSeasonStatistics9.getReceivingTouchdowns());
                Regex regex6 = yid.a;
                return y04;
            case 15:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics10 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics10.getClass();
                Integer receivingTouchdowns = americanFootballPlayerSeasonStatistics10.getReceivingTouchdowns();
                k = receivingTouchdowns != null ? wt3.k(americanFootballPlayerSeasonStatistics10, Integer.valueOf(receivingTouchdowns.intValue())) : null;
                Regex regex7 = yid.a;
                return k == null ? "-" : k;
            case 16:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics11 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics11.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics11.getReceivingTouchdowns()));
            case 17:
                return new q9k(R.string.am_football_receiving_yards_short);
            case 18:
                return new q9k(R.string.am_football_receiving_yards_long);
            case 19:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics12 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics12.getClass();
                String y05 = o02.y0(americanFootballPlayerSeasonStatistics12.getReceivingYards());
                Regex regex8 = yid.a;
                return y05;
            case 20:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics13 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics13.getClass();
                Integer receivingYards = americanFootballPlayerSeasonStatistics13.getReceivingYards();
                k = receivingYards != null ? wt3.k(americanFootballPlayerSeasonStatistics13, Integer.valueOf(receivingYards.intValue())) : null;
                Regex regex9 = yid.a;
                return k == null ? "-" : k;
            case 21:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics14 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics14.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics14.getReceivingYards()));
            case 22:
                return new q9k(R.string.am_football_average_yards_per_reception_short);
            case 23:
                return new q9k(R.string.am_football_average_yards_per_reception_long);
            case 24:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics15 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics15.getClass();
                Double b = yid.b(americanFootballPlayerSeasonStatistics15.getReceivingYards(), americanFootballPlayerSeasonStatistics15.getReceivingReceptions());
                k = b != null ? o02.P(b.doubleValue(), false) : null;
                return k == null ? "-" : k;
            case 25:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics16 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics16.getClass();
                Double b2 = yid.b(americanFootballPlayerSeasonStatistics16.getReceivingYards(), americanFootballPlayerSeasonStatistics16.getReceivingReceptions());
                k = b2 != null ? o02.P(b2.doubleValue(), false) : null;
                return k == null ? "-" : k;
            case 26:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics17 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics17.getClass();
                return Double.valueOf(yid.k(yid.b(americanFootballPlayerSeasonStatistics17.getReceivingYards(), americanFootballPlayerSeasonStatistics17.getReceivingReceptions())));
            case 27:
                return new q9k(R.string.am_football_rushing_attempts_short);
            case 28:
                return new q9k(R.string.am_football_rushing_attempts_long);
            default:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics18 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics18.getClass();
                String y06 = o02.y0(americanFootballPlayerSeasonStatistics18.getRushingAttempts());
                Regex regex10 = yid.a;
                return y06;
        }
    }
}
