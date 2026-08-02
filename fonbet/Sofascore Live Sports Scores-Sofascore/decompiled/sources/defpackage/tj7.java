package defpackage;

import com.sofascore.model.fantasy.FantasyLeagueConfig;
import com.sofascore.model.fantasy.FantasyPlayerStatistic;
import com.sofascore.model.fantasy.FantasyPointsCalculatorItem;
import com.sofascore.model.fantasy.FantasyRoundPlayerEvent;
import com.sofascore.model.fantasy.FantasyRoundPlayerStatistics;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tj7 {
    public final s96 a;
    public final wi7 b;

    public tj7(s96 s96Var, wi7 wi7Var) {
        s96Var.getClass();
        wi7Var.getClass();
        this.a = s96Var;
        this.b = wi7Var;
    }

    public static int a(int i, String str, Map map, FantasyLeagueConfig fantasyLeagueConfig, int i2) {
        FantasyRoundPlayerStatistics fantasyRoundPlayerStatistics;
        FantasyPointsCalculatorItem fantasyPointsCalculatorItem;
        if (fantasyLeagueConfig == null || (fantasyRoundPlayerStatistics = (FantasyRoundPlayerStatistics) map.get(Integer.valueOf(i))) == null) {
            return 0;
        }
        Iterator<T> it = fantasyRoundPlayerStatistics.getEventStatistics().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            int i4 = 0;
            for (FantasyPlayerStatistic fantasyPlayerStatistic : ((FantasyRoundPlayerEvent) it.next()).getStatistics()) {
                Map<String, FantasyPointsCalculatorItem> calculator = fantasyLeagueConfig.getCalculator();
                i4 += (calculator == null || (fantasyPointsCalculatorItem = calculator.get(fantasyPlayerStatistic.getKey())) == null) ? 0 : fantasyPointsCalculatorItem.calculatePoints(fantasyPlayerStatistic, str);
            }
            i3 += i4 * i2;
        }
        return i3;
    }
}
