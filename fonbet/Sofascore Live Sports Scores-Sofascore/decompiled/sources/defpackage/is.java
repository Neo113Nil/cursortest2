package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class is implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ is(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String P;
        switch (this.a) {
            case 0:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics.getClass();
                Double b = yid.b(americanFootballPlayerSeasonStatistics.getPuntReturnsYards(), americanFootballPlayerSeasonStatistics.getPuntReturnsTotal());
                P = b != null ? o02.P(b.doubleValue(), false) : null;
                return P == null ? "-" : P;
            case 1:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics2 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics2.getClass();
                return Double.valueOf(yid.k(yid.b(americanFootballPlayerSeasonStatistics2.getPuntReturnsYards(), americanFootballPlayerSeasonStatistics2.getPuntReturnsTotal())));
            case 2:
                return new q9k(R.string.am_football_fair_catch_punt_short);
            case 3:
                return new q9k(R.string.am_football_fair_catch_punt);
            case 4:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics3 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics3.getClass();
                String y0 = o02.y0(americanFootballPlayerSeasonStatistics3.getPuntReturnsFairCatches());
                Regex regex = yid.a;
                return y0;
            case 5:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics4 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics4.getClass();
                Integer puntReturnsFairCatches = americanFootballPlayerSeasonStatistics4.getPuntReturnsFairCatches();
                P = puntReturnsFairCatches != null ? wt3.k(americanFootballPlayerSeasonStatistics4, Integer.valueOf(puntReturnsFairCatches.intValue())) : null;
                Regex regex2 = yid.a;
                return P == null ? "-" : P;
            case 6:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics5 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics5.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics5.getPuntReturnsFairCatches()));
            case 7:
                return new q9k(R.string.am_football_longest_punt_short);
            case 8:
                return new q9k(R.string.punt_returns_longest);
            case 9:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics6 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics6.getClass();
                String y02 = o02.y0(americanFootballPlayerSeasonStatistics6.getPuntReturnsLong());
                Regex regex3 = yid.a;
                return y02;
            case 10:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics7 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics7.getClass();
                String y03 = o02.y0(americanFootballPlayerSeasonStatistics7.getPuntReturnsLong());
                Regex regex4 = yid.a;
                return y03;
            case 11:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics8 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics8.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics8.getPuntReturnsLong()));
            case 12:
                return new q9k(R.string.legend_am_foot_punt_return_touchdowns_short);
            case 13:
                return new q9k(R.string.legend_am_foot_punt_return_touchdowns);
            case 14:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics9 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics9.getClass();
                String y04 = o02.y0(americanFootballPlayerSeasonStatistics9.getPuntReturnsTouchdowns());
                Regex regex5 = yid.a;
                return y04;
            case 15:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics10 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics10.getClass();
                Integer puntReturnsTouchdowns = americanFootballPlayerSeasonStatistics10.getPuntReturnsTouchdowns();
                P = puntReturnsTouchdowns != null ? wt3.k(americanFootballPlayerSeasonStatistics10, Integer.valueOf(puntReturnsTouchdowns.intValue())) : null;
                Regex regex6 = yid.a;
                return P == null ? "-" : P;
            case 16:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics11 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics11.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics11.getPuntReturnsTouchdowns()));
            case 17:
                return new q9k(R.string.am_football_punt_return_yards_short);
            case 18:
                return new q9k(R.string.am_football_punt_return_yards_long);
            case 19:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics12 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics12.getClass();
                String y05 = o02.y0(americanFootballPlayerSeasonStatistics12.getPuntReturnsYards());
                Regex regex7 = yid.a;
                return y05;
            case 20:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics13 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics13.getClass();
                Integer puntReturnsYards = americanFootballPlayerSeasonStatistics13.getPuntReturnsYards();
                P = puntReturnsYards != null ? wt3.k(americanFootballPlayerSeasonStatistics13, Integer.valueOf(puntReturnsYards.intValue())) : null;
                Regex regex8 = yid.a;
                return P == null ? "-" : P;
            case 21:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics14 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics14.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics14.getPuntReturnsYards()));
            case 22:
                return new q9k(R.string.am_football_receiving_1_downs_short);
            case 23:
                return new q9k(R.string.am_football_receiving_1_downs_long);
            case 24:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics15 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics15.getClass();
                String y06 = o02.y0(americanFootballPlayerSeasonStatistics15.getReceivingFirstDowns());
                Regex regex9 = yid.a;
                return y06;
            case 25:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics16 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics16.getClass();
                Integer receivingFirstDowns = americanFootballPlayerSeasonStatistics16.getReceivingFirstDowns();
                P = receivingFirstDowns != null ? wt3.k(americanFootballPlayerSeasonStatistics16, Integer.valueOf(receivingFirstDowns.intValue())) : null;
                Regex regex10 = yid.a;
                return P == null ? "-" : P;
            case 26:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics17 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics17.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics17.getReceivingFirstDowns()));
            case 27:
                return new q9k(R.string.am_football_longest_reception_short);
            case 28:
                return new q9k(R.string.am_football_longest_reception_long);
            default:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics18 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics18.getClass();
                String y07 = o02.y0(americanFootballPlayerSeasonStatistics18.getReceivingLongest());
                Regex regex11 = yid.a;
                return y07;
        }
    }
}
