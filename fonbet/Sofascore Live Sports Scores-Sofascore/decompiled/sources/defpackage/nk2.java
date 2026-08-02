package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public interface nk2 {
    int d();

    default ok2 e(fzg fzgVar, PlayerCareerStatistics playerCareerStatistics, String str, Gender gender) {
        fzgVar.getClass();
        int d = d();
        List g = g();
        ArrayList arrayList = new ArrayList();
        for (Object obj : g) {
            lk2 lk2Var = (lk2) obj;
            List seasons = playerCareerStatistics.getSeasons();
            if (seasons == null || !seasons.isEmpty()) {
                Iterator it = seasons.iterator();
                while (true) {
                    if (it.hasNext()) {
                        AbstractPlayerSeasonStatistics statistics = ((PlayerSeasonStatisticsInfo) it.next()).getStatistics();
                        statistics.getClass();
                        if (lk2Var.k(statistics, str)) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            lk2 lk2Var2 = (lk2) it2.next();
            lk2Var2.getClass();
            arrayList2.add(new pk2((r9k) lk2Var2.j().invoke(gender), (r9k) lk2Var2.h().invoke(gender), kk2.a[fzgVar.ordinal()] == 1 ? lk2Var2.i() : lk2Var2.d(), lk2Var2.g()));
        }
        return new ok2(arrayList2, d);
    }

    List g();
}
