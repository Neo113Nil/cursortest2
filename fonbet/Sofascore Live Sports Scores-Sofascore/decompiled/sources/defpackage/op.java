package defpackage;

import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class op implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics = (AmericanFootballPlayerEventStatistics) obj;
        switch (this.a) {
            case 0:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getFumbleOutOfBounds()));
            case 1:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getFumbleOutOfBounds()));
            case 2:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 3:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getFumbleOwnFumbleRecovery()));
            case 4:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getDefensiveInterceptions()));
            case 5:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 6:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getDefensiveInterceptionsTouchdowns()));
            case 7:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getDefensiveInterceptionsTouchdowns()));
            case 8:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 9:
                americanFootballPlayerEventStatistics.getClass();
                return rei.g(yid.k(americanFootballPlayerEventStatistics.getInterceptionReturnsAverageYards()), 1);
            case 10:
                americanFootballPlayerEventStatistics.getClass();
                Double interceptionReturnsAverageYards = americanFootballPlayerEventStatistics.getInterceptionReturnsAverageYards();
                return Double.valueOf(interceptionReturnsAverageYards != null ? interceptionReturnsAverageYards.doubleValue() : 0.0d);
            case 11:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 12:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getInterceptionReturnsLongest()));
            case 13:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getInterceptionReturnsLongest()));
            case 14:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 15:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getDefensiveInterceptions()));
            case 16:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 17:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getDefensiveInterceptionsYards()));
            case 18:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getDefensiveInterceptionsYards()));
            case 19:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickReturnsTotal()));
            case 20:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 21:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickReturnsYards()));
            case 22:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickReturnsYards()));
            case 23:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 24:
                americanFootballPlayerEventStatistics.getClass();
                return rei.g(yid.k(americanFootballPlayerEventStatistics.getKickReturnsAverageYards()), 1);
            case 25:
                americanFootballPlayerEventStatistics.getClass();
                Double kickReturnsAverageYards = americanFootballPlayerEventStatistics.getKickReturnsAverageYards();
                return Double.valueOf(kickReturnsAverageYards != null ? kickReturnsAverageYards.doubleValue() : 0.0d);
            case 26:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 27:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickReturnsTouchdowns()));
            case 28:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickReturnsTouchdowns()));
            default:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
        }
    }
}
