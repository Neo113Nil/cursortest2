package defpackage;

import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class up implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics = (AmericanFootballPlayerEventStatistics) obj;
        switch (this.a) {
            case 0:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getPassingCompletions()));
            case 1:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 2:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getPassingDroppedPasses()));
            case 3:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getPassingDroppedPasses()));
            case 4:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 5:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getPassingFirstDowns()));
            case 6:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getPassingFirstDowns()));
            case 7:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 8:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.valueOf(yid.m(americanFootballPlayerEventStatistics.getPassingCompletions()) > 0);
            case 9:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getPassingInterceptions()));
            case 10:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getPassingYards()));
            case 11:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getPassingYards()));
            case 12:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 13:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getPassingTouchdowns()));
            case 14:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getPassingTouchdowns()));
            case 15:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 16:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getPassingInterceptions()));
            case 17:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 18:
                americanFootballPlayerEventStatistics.getClass();
                return rei.g(yid.k(americanFootballPlayerEventStatistics.getPassingYardsPerAttempt()), 1);
            case 19:
                americanFootballPlayerEventStatistics.getClass();
                Double passingYardsPerAttempt = americanFootballPlayerEventStatistics.getPassingYardsPerAttempt();
                return Double.valueOf(passingYardsPerAttempt != null ? passingYardsPerAttempt.doubleValue() : 0.0d);
            case 20:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 21:
                americanFootballPlayerEventStatistics.getClass();
                return rei.b(1, Double.valueOf(americanFootballPlayerEventStatistics.calculatePasserRating()));
            case 22:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(americanFootballPlayerEventStatistics.calculatePasserRating());
            case 23:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 24:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getPassingAirYards()));
            case 25:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntReturnsTotal()));
            case 26:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 27:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntReturnsYards()));
            case 28:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getPuntReturnsYards()));
            default:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
        }
    }
}
