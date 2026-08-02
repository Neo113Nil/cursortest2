package defpackage;

import com.sofascore.model.network.response.BaseballPlayerEventStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class w71 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ w71(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
        switch (this.a) {
            case 0:
                baseballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(baseballPlayerEventStatistics.getBattingBaseOnBalls()));
            case 1:
                baseballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 2:
                baseballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(baseballPlayerEventStatistics.getBattingStrikeOuts()));
            case 3:
                baseballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(baseballPlayerEventStatistics.getFieldingPutOuts()));
            case 4:
                baseballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 5:
                baseballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(baseballPlayerEventStatistics.getFieldingAssists()));
            case 6:
                baseballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(baseballPlayerEventStatistics.getFieldingAssists()));
            case 7:
                baseballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 8:
                baseballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(baseballPlayerEventStatistics.getFieldingTotalErrors()));
            case 9:
                baseballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(baseballPlayerEventStatistics.getFieldingTotalErrors()));
            case 10:
                baseballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 11:
                baseballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(baseballPlayerEventStatistics.getFieldingDoublePlays()));
            case 12:
                baseballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(baseballPlayerEventStatistics.getFieldingDoublePlays()));
            case 13:
                baseballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 14:
                baseballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(baseballPlayerEventStatistics.getFieldingStolenBasesCaught()));
            case 15:
                baseballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(baseballPlayerEventStatistics.getFieldingStolenBasesCaught()));
            case 16:
                baseballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 17:
                baseballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(baseballPlayerEventStatistics.getFieldingStolenBasesAllowed()));
            case 18:
                baseballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(baseballPlayerEventStatistics.getFieldingStolenBasesAllowed()));
            case 19:
                baseballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 20:
                baseballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(baseballPlayerEventStatistics.getFieldingPutOuts()));
            case 21:
                baseballPlayerEventStatistics.getClass();
                return rei.b(1, Double.valueOf(yid.k(baseballPlayerEventStatistics.getPitchingInningsPitched())));
            case 22:
                baseballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(baseballPlayerEventStatistics.getPitchingStrikeOuts()));
            case 23:
                baseballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.k(baseballPlayerEventStatistics.getPitchingInningsPitched()));
            case 24:
                baseballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 25:
                baseballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(baseballPlayerEventStatistics.getPitchingHomeRuns()));
            case 26:
                baseballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(baseballPlayerEventStatistics.getPitchingHomeRuns()));
            case 27:
                baseballPlayerEventStatistics.getClass();
                return Boolean.TRUE;
            case 28:
                baseballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(baseballPlayerEventStatistics.getPitchingPitchesThrown()));
            default:
                baseballPlayerEventStatistics.getClass();
                return Double.valueOf(yid.m(baseballPlayerEventStatistics.getPitchingPitchesThrown()));
        }
    }
}
