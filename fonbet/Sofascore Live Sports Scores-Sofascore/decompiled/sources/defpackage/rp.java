package defpackage;

import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class rp implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics = (AmericanFootballPlayerEventStatistics) obj;
        switch (this.a) {
            case 0:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickReturnsLong()));
            case 1:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickReturnsLong()));
            case 2:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 3:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickReturnsFairCatches()));
            case 4:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickReturnsFairCatches()));
            case 5:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 6:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickReturnsTotal()));
            case 7:
                americanFootballPlayerEventStatistics.getClass();
                return rei.i(12, americanFootballPlayerEventStatistics.getKickingFgMade(), americanFootballPlayerEventStatistics.getKickingFgAttempts(), false);
            case 8:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickoffInside20()));
            case 9:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickingFgMade()));
            case 10:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 11:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 12:
                americanFootballPlayerEventStatistics.getClass();
                return rei.i(12, americanFootballPlayerEventStatistics.getKickingExtraMade(), americanFootballPlayerEventStatistics.getKickingExtraAttempts(), false);
            case 13:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickingExtraMade()));
            case 14:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 15:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickingFgLong()));
            case 16:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickingFgLong()));
            case 17:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 18:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickingTotalPoints()));
            case 19:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickingTotalPoints()));
            case 20:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 21:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickoffEndZone()));
            case 22:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickoffEndZone()));
            case 23:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 24:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickoffOutOfBounds()));
            case 25:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickoffOutOfBounds()));
            case 26:
                americanFootballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 27:
                americanFootballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(americanFootballPlayerEventStatistics.getKickoffInside20()));
            case 28:
                americanFootballPlayerEventStatistics.getClass();
                return rei.i(12, americanFootballPlayerEventStatistics.getPassingCompletions(), americanFootballPlayerEventStatistics.getPassingAttempts(), false);
            default:
                americanFootballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(americanFootballPlayerEventStatistics.getPassingAirYards()));
        }
    }
}
