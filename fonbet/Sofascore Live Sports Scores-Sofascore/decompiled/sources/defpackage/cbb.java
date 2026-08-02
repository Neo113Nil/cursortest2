package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.topperformance.response.AmericanFootballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.BasketballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.topStats.TopPlayerCategoryUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cbb {
    public static final cbb a = new cbb();

    public static ArrayList a(Context context, IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics, int i, boolean z, String str, hub hubVar) {
        context.getClass();
        List S0 = CollectionsKt.S0(vab.h);
        yre[] yreVarArr = yre.c;
        return c(context, iceHockeyTopPlayersStatistics, S0, i, z, str, hubVar);
    }

    public static List b(Context context, TopPerformanceStatistics topPerformanceStatistics, String str) {
        context.getClass();
        topPerformanceStatistics.getClass();
        if (topPerformanceStatistics instanceof BasketballTopPlayersStatistics) {
            BasketballTopPlayersStatistics copy$default = BasketballTopPlayersStatistics.copy$default((BasketballTopPlayersStatistics) topPerformanceStatistics, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33299543, null);
            copy$default.getClass();
            return d(context, copy$default, nab.e, 5, true, str, 64);
        }
        if (topPerformanceStatistics instanceof IceHockeyTopPlayersStatistics) {
            return a(context, (IceHockeyTopPlayersStatistics) topPerformanceStatistics, 5, true, str, hub.a);
        }
        if (topPerformanceStatistics instanceof HandballTopPlayersStatistics) {
            return d(context, (HandballTopPlayersStatistics) topPerformanceStatistics, tab.e, 5, true, str, 64);
        }
        if (!(topPerformanceStatistics instanceof AmericanFootballTopPlayersStatistics)) {
            return km5.a;
        }
        return c(context, (AmericanFootballTopPlayersStatistics) topPerformanceStatistics, hab.f, 5, true, str, hub.a);
    }

    public static ArrayList c(Context context, Object obj, List list, int i, boolean z, String str, hub hubVar) {
        boolean z2;
        Context context2 = context;
        hub hubVar2 = hubVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean c = Intrinsics.c(Season.SubSeasonType.PLAYOFFS.getLabel(), str);
        String q = dmi.q(" - ", context2.getString(R.string.playoffs));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zab zabVar = (zab) it.next();
            if (hubVar2 == null || zabVar.c(hubVar2)) {
                String y = dmi.y(zabVar.d(context2), c ? q : "");
                List<TopPlayersStatisticsItem> b = zabVar.b(obj);
                if (b != null) {
                    if (z) {
                        b = aik.I(i, b);
                    }
                    for (TopPlayersStatisticsItem topPlayersStatisticsItem : b) {
                        arrayList2.add(new fmj(topPlayersStatisticsItem.getPlayer(), topPlayersStatisticsItem.getTeam(), topPlayersStatisticsItem.getPlayedEnough(), new jei(y, zabVar.a(topPlayersStatisticsItem.getStatistics()), null)));
                        c = c;
                    }
                    z2 = c;
                    arrayList.add(new cmj(y, new ArrayList(arrayList2), zabVar.h()));
                    arrayList2.clear();
                } else {
                    z2 = c;
                    arrayList.add(new cmj(y, km5.a, null));
                }
            } else {
                z2 = c;
            }
            context2 = context;
            c = z2;
            hubVar2 = hubVar;
        }
        return arrayList;
    }

    public static /* synthetic */ ArrayList d(Context context, TopPerformanceStatistics topPerformanceStatistics, kp5 kp5Var, int i, boolean z, String str, int i2) {
        if ((i2 & 8) != 0) {
            i = Integer.MAX_VALUE;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = false;
        }
        return c(context, topPerformanceStatistics, kp5Var, i3, z, str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gv9 e(cbb cbbVar, Context context, Object obj, List list, int i, boolean z, String str, hub hubVar, boolean z2, boolean z3, int i2) {
        znj znjVar;
        List<Integer> teamIds;
        gv9 gv9Var;
        int i3 = (i2 & 8) != 0 ? Integer.MAX_VALUE : i;
        hub hubVar2 = (i2 & 64) != 0 ? null : hubVar;
        boolean z4 = (i2 & 128) != 0 ? false : z2;
        cbbVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean equals = "playoffs".equals(str);
        String q = dmi.q(" - ", context.getString(R.string.playoffs));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zab zabVar = (zab) it.next();
            if (hubVar2 == null || zabVar.c(hubVar2)) {
                String y = dmi.y(zabVar.d(context), equals ? q : "");
                List<TopPlayersStatisticsItem> b = zabVar.b(obj);
                if (b != null) {
                    if (z) {
                        b = aik.I(i3, b);
                    }
                    for (TopPlayersStatisticsItem topPlayersStatisticsItem : b) {
                        int id = topPlayersStatisticsItem.getPlayer().getId();
                        String t = tba.t(topPlayersStatisticsItem.getPlayer());
                        String position = topPlayersStatisticsItem.getPlayer().getPosition();
                        Gender gender = topPlayersStatisticsItem.getPlayer().getGender();
                        umj umjVar = new umj(y, zabVar.a(topPlayersStatisticsItem.getStatistics()));
                        Team team = topPlayersStatisticsItem.getTeam();
                        if (team != null) {
                            if (!z3) {
                                team = null;
                            }
                            if (team != null) {
                                int id2 = team.getId();
                                String p = tba.p(context, team);
                                Country country = team.getCountry();
                                znjVar = new znj(id2, null, Integer.valueOf(team.getType()), p, country != null ? country.getAlpha2() : null);
                                teamIds = topPlayersStatisticsItem.getTeamIds();
                                if (teamIds != null) {
                                    if (!z3) {
                                        teamIds = null;
                                    }
                                    if (teamIds != null) {
                                        gv9Var = l6g.W(teamIds);
                                        arrayList2.add(new vnj(new unj(id, t, position, gender, umjVar, znjVar, topPlayersStatisticsItem.getPlayedEnough(), gv9Var)));
                                    }
                                }
                                gv9Var = null;
                                arrayList2.add(new vnj(new unj(id, t, position, gender, umjVar, znjVar, topPlayersStatisticsItem.getPlayedEnough(), gv9Var)));
                            }
                        }
                        znjVar = null;
                        teamIds = topPlayersStatisticsItem.getTeamIds();
                        if (teamIds != null) {
                        }
                        gv9Var = null;
                        arrayList2.add(new vnj(new unj(id, t, position, gender, umjVar, znjVar, topPlayersStatisticsItem.getPlayedEnough(), gv9Var)));
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList.add(new TopPlayerCategoryUiModel(y, l6g.W(arrayList2), qha.y(context, y, "league_top_players"), qha.A(context, y, "league_top_players", z4), zabVar.g()));
                        arrayList2.clear();
                    }
                } else {
                    arrayList.add(new TopPlayerCategoryUiModel(y, rlh.b, null, null, null));
                }
            }
        }
        return l6g.W(arrayList);
    }
}
