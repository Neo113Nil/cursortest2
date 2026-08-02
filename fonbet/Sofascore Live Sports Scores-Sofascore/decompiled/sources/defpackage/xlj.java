package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.topperformance.response.TopStatsItem;
import com.sofascore.results.league.fragment.topStats.TopPerformanceCategoryUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xlj {
    public static final xlj a = new xlj();

    public static void a(xbb xbbVar, Context context, int i, List list, Function1 function1) {
        znj znjVar;
        List list2;
        List<TopStatsItem> list3 = list;
        if (list3 != null) {
            String string = context.getString(i);
            string.getClass();
            if (function1 != null && (list2 = (List) function1.invoke(list3)) != null) {
                list3 = list2;
            }
            ArrayList arrayList = new ArrayList(k13.r(list3, 10));
            for (TopStatsItem topStatsItem : list3) {
                int id = topStatsItem.getPlayer().getId();
                String t = tba.t(topStatsItem.getPlayer());
                String position = topStatsItem.getPlayer().getPosition();
                Gender gender = topStatsItem.getPlayer().getGender();
                umj umjVar = new umj(string, topStatsItem.getStatistic());
                Team team = topStatsItem.getPlayer().getTeam();
                if (team != null) {
                    int id2 = team.getId();
                    String p = tba.p(context, team);
                    Country country = team.getCountry();
                    znjVar = new znj(id2, null, Integer.valueOf(team.getType()), p, country != null ? country.getAlpha2() : null);
                } else {
                    znjVar = null;
                }
                unj unjVar = new unj(id, t, position, gender, umjVar, znjVar, true, null);
                int id3 = topStatsItem.getEvent().getId();
                int id4 = Event.getHomeTeam$default(topStatsItem.getEvent(), null, 1, null).getId();
                String p2 = tba.p(context, Event.getHomeTeam$default(topStatsItem.getEvent(), null, 1, null));
                Integer display = Event.getHomeScore$default(topStatsItem.getEvent(), null, 1, null).getDisplay();
                Country country2 = Event.getHomeTeam$default(topStatsItem.getEvent(), null, 1, null).getCountry();
                znj znjVar2 = new znj(id4, display, Integer.valueOf(Event.getHomeTeam$default(topStatsItem.getEvent(), null, 1, null).getType()), p2, country2 != null ? country2.getAlpha2() : null);
                int id5 = Event.getAwayTeam$default(topStatsItem.getEvent(), null, 1, null).getId();
                String p3 = tba.p(context, Event.getAwayTeam$default(topStatsItem.getEvent(), null, 1, null));
                Integer display2 = Event.getAwayScore$default(topStatsItem.getEvent(), null, 1, null).getDisplay();
                Country country3 = Event.getAwayTeam$default(topStatsItem.getEvent(), null, 1, null).getCountry();
                arrayList.add(new tnj(unjVar, new vmj(id3, znjVar2, new znj(id5, display2, Integer.valueOf(Event.getAwayTeam$default(topStatsItem.getEvent(), null, 1, null).getType()), p3, country3 != null ? country3.getAlpha2() : null))));
            }
            xbbVar.add(new TopPerformanceCategoryUiModel(string, l6g.W(l6g.W(arrayList)), qha.y(context, string, "league_top_stats"), qha.A(context, string, "league_top_stats", false)));
        }
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TopStatsItem topStatsItem = (TopStatsItem) it.next();
            arrayList.add(new TopStatsItem(rei.b(2, Double.valueOf(Double.parseDouble(topStatsItem.getStatistic()))), topStatsItem.getPlayer(), topStatsItem.getEvent()));
        }
        return arrayList;
    }
}
