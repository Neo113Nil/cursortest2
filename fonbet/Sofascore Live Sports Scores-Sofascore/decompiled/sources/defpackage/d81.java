package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class d81 {
    public static BaseballPlayerSeasonStatistics a(PlayerSeasonStatisticsInfo playerSeasonStatisticsInfo) {
        AbstractPlayerSeasonStatistics statistics = playerSeasonStatisticsInfo.getStatistics();
        statistics.getClass();
        return (BaseballPlayerSeasonStatistics) statistics;
    }

    public static ArrayList b(wj1 wj1Var) {
        wj1Var.getClass();
        kp5 kp5Var = vj1.w;
        ArrayList arrayList = new ArrayList();
        for (Object obj : kp5Var) {
            if (((vj1) obj).a == wj1Var) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new e81((vj1) it.next()));
        }
        return arrayList2;
    }
}
