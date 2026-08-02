package defpackage;

import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class yp implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics = (AmericanFootballPlayerEventStatistics) obj;
        switch (this.a) {
            case 0:
                americanFootballPlayerEventStatistics.getClass();
                return rei.g(yid.k(americanFootballPlayerEventStatistics.getPuntingAverageHangTime()), 1);
            case 1:
                americanFootballPlayerEventStatistics.getClass();
                Double puntingAverageHangTime = americanFootballPlayerEventStatistics.getPuntingAverageHangTime();
                return Double.valueOf(puntingAverageHangTime != null ? puntingAverageHangTime.doubleValue() : 0.0d);
            case 2:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 3:
                americanFootballPlayerEventStatistics.getClass();
                return rei.g(yid.k(americanFootballPlayerEventStatistics.getPuntingHangTime()), 1);
            case 4:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getReceivingReceptions()));
            case 5:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getReceivingDroppedPasses()));
            case 6:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getReceivingReceptions()));
            case 7:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 8:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getReceivingRedZoneTargets()));
            case 9:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getReceivingRedZoneTargets()));
            case 10:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 11:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getReceivingYardsAfterCatch()));
            case 12:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getReceivingYardsAfterCatch()));
            case 13:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 14:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 15:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getReceivingTouchdowns()));
            case 16:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getReceivingTargets()));
            case 17:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getReceivingTargets()));
            case 18:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 19:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getReceivingYards()));
            case 20:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getReceivingYards()));
            case 21:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 22:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getReceivingTouchdowns()));
            case 23:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 24:
                americanFootballPlayerEventStatistics.getClass();
                return rei.g(yid.k(americanFootballPlayerEventStatistics.getReceivingYardsPerReception()), 1);
            case 25:
                americanFootballPlayerEventStatistics.getClass();
                Double receivingYardsPerReception = americanFootballPlayerEventStatistics.getReceivingYardsPerReception();
                return Double.valueOf(receivingYardsPerReception != null ? receivingYardsPerReception.doubleValue() : 0.0d);
            case 26:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 27:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getReceivingLongest()));
            case 28:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getReceivingLongest()));
            default:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
        }
    }
}
