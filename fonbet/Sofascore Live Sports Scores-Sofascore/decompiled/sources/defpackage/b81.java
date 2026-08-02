package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.BaseballPlayerSeasonStatistics;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class b81 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c81 b;

    public /* synthetic */ b81(c81 c81Var, int i) {
        this.a = i;
        this.b = c81Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        c81 c81Var = this.b;
        switch (i) {
            case 0:
                BaseballPlayerSeasonStatistics baseballPlayerSeasonStatistics = (BaseballPlayerSeasonStatistics) obj;
                baseballPlayerSeasonStatistics.getClass();
                Number number = (Number) c81Var.a.e.invoke(baseballPlayerSeasonStatistics);
                if (number == null) {
                    return 0;
                }
                return number;
            case 1:
                return new q9k(c81Var.a.c);
            case 2:
                return new q9k(c81Var.a.b);
            default:
                BaseballPlayerSeasonStatistics baseballPlayerSeasonStatistics2 = (BaseballPlayerSeasonStatistics) obj;
                baseballPlayerSeasonStatistics2.getClass();
                String str = (String) c81Var.a.h.invoke(baseballPlayerSeasonStatistics2);
                Regex regex = yid.a;
                return str == null ? "-" : str;
        }
    }
}
