package defpackage;

import android.content.Context;
import com.sofascore.model.newNetwork.topperformance.response.BasketballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FootballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FutsalTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.RugbyTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.TennisTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import com.sofascore.model.newNetwork.topperformance.response.VolleyballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.TopTeamsStatisticsItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class lpj {
    public static List a(Context context, TopPerformanceStatistics topPerformanceStatistics) {
        context.getClass();
        topPerformanceStatistics.getClass();
        return topPerformanceStatistics instanceof FootballTopTeamsStatistics ? b(context, topPerformanceStatistics, yoj.e) : topPerformanceStatistics instanceof BasketballTopTeamsStatistics ? b(context, topPerformanceStatistics, voj.e) : topPerformanceStatistics instanceof IceHockeyTopTeamsStatistics ? b(context, topPerformanceStatistics, cpj.e) : topPerformanceStatistics instanceof HandballTopTeamsStatistics ? b(context, topPerformanceStatistics, bpj.e) : topPerformanceStatistics instanceof TennisTopTeamsStatistics ? b(context, topPerformanceStatistics, hpj.e) : topPerformanceStatistics instanceof RugbyTopTeamsStatistics ? b(context, topPerformanceStatistics, fpj.e) : topPerformanceStatistics instanceof VolleyballTopTeamsStatistics ? b(context, topPerformanceStatistics, kpj.e) : topPerformanceStatistics instanceof FutsalTopTeamsStatistics ? b(context, topPerformanceStatistics, zoj.e) : km5.a;
    }

    public static ArrayList b(Context context, TopPerformanceStatistics topPerformanceStatistics, kp5 kp5Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<E> it = kp5Var.iterator();
        while (it.hasNext()) {
            ipj ipjVar = (ipj) it.next();
            ipjVar.getClass();
            context.getClass();
            String string = context.getString(ipjVar.d());
            string.getClass();
            List<TopTeamsStatisticsItem> b = ipjVar.b(topPerformanceStatistics);
            if (b != null) {
                for (TopTeamsStatisticsItem topTeamsStatisticsItem : b) {
                    String a = ipjVar.a(topTeamsStatisticsItem.getStatistics());
                    if (a != null) {
                        arrayList2.add(new noj(topTeamsStatisticsItem.getTeam(), new jei(string, a, null)));
                    }
                }
                arrayList.add(new moj(string, new ArrayList(arrayList2)));
                arrayList2.clear();
            } else {
                arrayList.add(new moj(string, km5.a));
            }
        }
        return arrayList;
    }
}
