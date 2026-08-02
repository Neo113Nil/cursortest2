package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.BaseballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballRankedStatistic;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballRankedStatistics;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ja1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ ja1(Function1 function1, Function1 function12, int i) {
        this.a = i;
        this.b = function1;
        this.c = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.c;
        Function1 function12 = this.b;
        switch (i) {
            case 0:
                BaseballRankedStatistics baseballRankedStatistics = (BaseballRankedStatistics) obj;
                baseballRankedStatistics.getClass();
                BaseballRankedStatistic baseballRankedStatistic = (BaseballRankedStatistic) function12.invoke(baseballRankedStatistics);
                if (baseballRankedStatistic != null && (r3 = baseballRankedStatistic.getValue()) != null) {
                    break;
                }
                break;
            case 1:
                BaseballPlayerSeasonStatistics baseballPlayerSeasonStatistics = (BaseballPlayerSeasonStatistics) obj;
                baseballPlayerSeasonStatistics.getClass();
                Number number = (Number) function12.invoke(baseballPlayerSeasonStatistics);
                if (number != null) {
                    break;
                }
                break;
            case 2:
                obj.getClass();
                if (function12 != null) {
                    function12.invoke(obj);
                }
                function1.invoke(obj);
                break;
            case 3:
                function12.invoke(obj);
                function1.invoke(obj);
                break;
            default:
                function12.invoke(obj);
                function1.invoke(obj);
                break;
        }
        return Unit.a;
    }
}
