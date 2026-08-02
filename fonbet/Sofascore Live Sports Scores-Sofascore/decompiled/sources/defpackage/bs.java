package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class bs implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ bs(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String P;
        switch (this.a) {
            case 0:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics.getClass();
                Double b = yid.b(americanFootballPlayerSeasonStatistics.getPuntingNetYards(), americanFootballPlayerSeasonStatistics.getPuntingTotal());
                P = b != null ? o02.P(b.doubleValue(), false) : null;
                return P == null ? "-" : P;
            case 1:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics2 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics2.getClass();
                return Double.valueOf(yid.k(yid.b(americanFootballPlayerSeasonStatistics2.getPuntingNetYards(), americanFootballPlayerSeasonStatistics2.getPuntingTotal())));
            case 2:
                return new q9k(R.string.am_football_punts_short);
            case 3:
                return new q9k(R.string.am_football_punts_long);
            case 4:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics3 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics3.getClass();
                String y0 = o02.y0(americanFootballPlayerSeasonStatistics3.getPuntingTotal());
                Regex regex = yid.a;
                return y0;
            case 5:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics4 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics4.getClass();
                Integer puntingTotal = americanFootballPlayerSeasonStatistics4.getPuntingTotal();
                P = puntingTotal != null ? wt3.k(americanFootballPlayerSeasonStatistics4, Integer.valueOf(puntingTotal.intValue())) : null;
                Regex regex2 = yid.a;
                return P == null ? "-" : P;
            case 6:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics5 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics5.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics5.getPuntingTotal()));
            case 7:
                return new q9k(R.string.am_football_touchbacks_short);
            case 8:
                return new q9k(R.string.am_football_touchbacks_long);
            case 9:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics6 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics6.getClass();
                String y02 = o02.y0(americanFootballPlayerSeasonStatistics6.getPuntingTouchbacks());
                Regex regex3 = yid.a;
                return y02;
            case 10:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics7 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics7.getClass();
                Integer puntingTouchbacks = americanFootballPlayerSeasonStatistics7.getPuntingTouchbacks();
                P = puntingTouchbacks != null ? wt3.k(americanFootballPlayerSeasonStatistics7, Integer.valueOf(puntingTouchbacks.intValue())) : null;
                Regex regex4 = yid.a;
                return P == null ? "-" : P;
            case 11:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics8 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics8.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics8.getPuntingTouchbacks()));
            case 12:
                return new q9k(R.string.am_football_touchback_percentage_short);
            case 13:
                return new q9k(R.string.am_football_touchback_percentage_long);
            case 14:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics9 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics9.getClass();
                String o = yid.o(americanFootballPlayerSeasonStatistics9.getPuntingTouchbacks(), americanFootballPlayerSeasonStatistics9.getPuntingTotal());
                return o == null ? "-" : o;
            case 15:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics10 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics10.getClass();
                String o2 = yid.o(americanFootballPlayerSeasonStatistics10.getPuntingTouchbacks(), americanFootballPlayerSeasonStatistics10.getPuntingTotal());
                return o2 == null ? "-" : o2;
            case 16:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics11 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics11.getClass();
                return Double.valueOf(yid.k(yid.b(americanFootballPlayerSeasonStatistics11.getPuntingTouchbacks(), americanFootballPlayerSeasonStatistics11.getPuntingTotal())));
            case 17:
                return new q9k(R.string.am_football_average_punt_yards_short);
            case 18:
                return new q9k(R.string.am_football_average_punt_yards_long);
            case 19:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics12 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics12.getClass();
                Double b2 = yid.b(americanFootballPlayerSeasonStatistics12.getPuntingYards(), americanFootballPlayerSeasonStatistics12.getPuntingTotal());
                P = b2 != null ? o02.P(b2.doubleValue(), false) : null;
                return P == null ? "-" : P;
            case 20:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics13 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics13.getClass();
                Double b3 = yid.b(americanFootballPlayerSeasonStatistics13.getPuntingYards(), americanFootballPlayerSeasonStatistics13.getPuntingTotal());
                P = b3 != null ? o02.P(b3.doubleValue(), false) : null;
                return P == null ? "-" : P;
            case 21:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics14 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics14.getClass();
                return Double.valueOf(yid.k(yid.b(americanFootballPlayerSeasonStatistics14.getPuntingYards(), americanFootballPlayerSeasonStatistics14.getPuntingTotal())));
            case 22:
                return new q9k(R.string.am_football_attempted_punt_returns_short);
            case 23:
                return new q9k(R.string.am_football_attempted_punt_returns_long);
            case 24:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics15 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics15.getClass();
                String y03 = o02.y0(americanFootballPlayerSeasonStatistics15.getPuntReturnsTotal());
                Regex regex5 = yid.a;
                return y03;
            case 25:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics16 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics16.getClass();
                Integer puntReturnsTotal = americanFootballPlayerSeasonStatistics16.getPuntReturnsTotal();
                P = puntReturnsTotal != null ? wt3.k(americanFootballPlayerSeasonStatistics16, Integer.valueOf(puntReturnsTotal.intValue())) : null;
                Regex regex6 = yid.a;
                return P == null ? "-" : P;
            case 26:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics17 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics17.getClass();
                return Integer.valueOf(yid.m(americanFootballPlayerSeasonStatistics17.getPuntReturnsTotal()));
            case 27:
                return new q9k(R.string.am_football_average_punt_return_yards_short);
            case 28:
                return new q9k(R.string.am_football_average_punt_return_yards_long);
            default:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics18 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics18.getClass();
                Double b4 = yid.b(americanFootballPlayerSeasonStatistics18.getPuntReturnsYards(), americanFootballPlayerSeasonStatistics18.getPuntReturnsTotal());
                P = b4 != null ? o02.P(b4.doubleValue(), false) : null;
                return P == null ? "-" : P;
        }
    }
}
