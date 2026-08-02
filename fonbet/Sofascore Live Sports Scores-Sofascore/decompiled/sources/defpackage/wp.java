package defpackage;

import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class wp implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics = (AmericanFootballPlayerEventStatistics) obj;
        switch (this.a) {
            case 0:
                americanFootballPlayerEventStatistics.getClass();
                return rei.g(yid.k(americanFootballPlayerEventStatistics.getPuntReturnsAverageYards()), 1);
            case 1:
                americanFootballPlayerEventStatistics.getClass();
                Double puntReturnsAverageYards = americanFootballPlayerEventStatistics.getPuntReturnsAverageYards();
                return Double.valueOf(puntReturnsAverageYards != null ? puntReturnsAverageYards.doubleValue() : 0.0d);
            case 2:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 3:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntReturnsTouchdowns()));
            case 4:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntReturnsTouchdowns()));
            case 5:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 6:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntReturnsLong()));
            case 7:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntReturnsLong()));
            case 8:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 9:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntReturnsFairCatches()));
            case 10:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntReturnsFairCatches()));
            case 11:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 12:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntReturnsTotal()));
            case 13:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntingTotal()));
            case 14:
                americanFootballPlayerEventStatistics.getClass();
                Double puntingHangTime = americanFootballPlayerEventStatistics.getPuntingHangTime();
                return Double.valueOf(puntingHangTime != null ? puntingHangTime.doubleValue() : 0.0d);
            case 15:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntingTotal()));
            case 16:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 17:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 18:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntingYards()));
            case 19:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntingYards()));
            case 20:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 21:
                americanFootballPlayerEventStatistics.getClass();
                return rei.g(yid.k(americanFootballPlayerEventStatistics.getPuntingYardsPerPuntAvg()), 1);
            case 22:
                americanFootballPlayerEventStatistics.getClass();
                Double puntingYardsPerPuntAvg = americanFootballPlayerEventStatistics.getPuntingYardsPerPuntAvg();
                return Double.valueOf(puntingYardsPerPuntAvg != null ? puntingYardsPerPuntAvg.doubleValue() : 0.0d);
            case 23:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 24:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntingInside20()));
            case 25:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntingInside20()));
            case 26:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 27:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntingLongest()));
            case 28:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntingLongest()));
            default:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
        }
    }
}
