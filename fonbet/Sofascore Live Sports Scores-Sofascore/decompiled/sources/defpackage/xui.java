package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.model.newNetwork.TeamDetailsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentSeasons;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatisticsResponse;
import com.sofascore.model.newNetwork.statistics.season.team.TennisTeamSeasonStatistics;
import com.sofascore.model.team.TennisSurfaceType;
import com.sofascore.results.R;
import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xui implements f73 {
    public final j0j a;
    public final Context b;
    public final String c;

    public xui(j0j j0jVar, Context context, String str) {
        j0jVar.getClass();
        this.a = j0jVar;
        this.b = context;
        this.c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x004e, code lost:
    
        if (r2 == r4) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f0  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ltb] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v3, types: [km5] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // defpackage.f73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, rq3 rq3Var) {
        uui uuiVar;
        int i2;
        TeamDetailsResponse teamDetailsResponse;
        Team team;
        Team team2;
        StatisticsSeasonsResponse statisticsSeasonsResponse;
        boolean equals;
        List list;
        List<UniqueTournamentSeasons> uniqueTournamentSeasons;
        Iterator it;
        String label;
        Map<Integer, Map<Integer, List<String>>> typesMap;
        Iterator<Map.Entry<Integer, Map<Integer, List<String>>>> it2;
        Object obj;
        List J;
        int i3 = i;
        if (rq3Var instanceof uui) {
            uuiVar = (uui) rq3Var;
            int i4 = uuiVar.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                uuiVar.v = i4 - Integer.MIN_VALUE;
                Object obj2 = uuiVar.t;
                lu3 lu3Var = lu3.a;
                i2 = uuiVar.v;
                j0j j0jVar = this.a;
                ?? r9 = 0;
                r9 = 0;
                if (i2 != 0) {
                    y6a.M(obj2);
                    uuiVar.r = i3;
                    uuiVar.v = 1;
                    obj2 = j0jVar.k(i3, uuiVar);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        team2 = uuiVar.s;
                        y6a.M(obj2);
                        statisticsSeasonsResponse = (StatisticsSeasonsResponse) obj2;
                        equals = this.c.equals(Sports.TENNIS);
                        int i5 = 10;
                        Context context = this.b;
                        if (equals) {
                            list = km5.a;
                        } else {
                            if (statisticsSeasonsResponse != null && (J = jca.J(statisticsSeasonsResponse)) != null) {
                                if (J.isEmpty()) {
                                    J = null;
                                }
                                if (J != null) {
                                    String string = context.getString(R.string.tennis_all_tournaments);
                                    ArrayList arrayList = new ArrayList(k13.r(J, 10));
                                    Iterator it3 = J.iterator();
                                    while (it3.hasNext()) {
                                        int intValue = ((Number) it3.next()).intValue();
                                        String valueOf = String.valueOf(intValue);
                                        arrayList.add(new y83(new Season(intValue, valueOf, valueOf), l6g.K(Season.SubSeasonType.OVERALL), new ComparisonSeasonInfo.TennisYearInfo(valueOf), valueOf));
                                    }
                                    list = a.c(new m93(null, string, l6g.W(arrayList), true));
                                    if (list == null) {
                                        list = km5.a;
                                    }
                                }
                            }
                            list = null;
                            if (list == null) {
                            }
                        }
                        ?? ltbVar = new ltb();
                        if (statisticsSeasonsResponse != null && (typesMap = statisticsSeasonsResponse.getTypesMap()) != null) {
                            it2 = typesMap.entrySet().iterator();
                            while (it2.hasNext()) {
                                for (Map.Entry<Integer, List<String>> entry : it2.next().getValue().entrySet()) {
                                    int intValue2 = entry.getKey().intValue();
                                    List<String> value = entry.getValue();
                                    Integer num = new Integer(intValue2);
                                    ArrayList arrayList2 = new ArrayList();
                                    for (String str : value) {
                                        Iterator it4 = Season.SubSeasonType.getEntries().iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                obj = null;
                                                break;
                                            }
                                            obj = it4.next();
                                            if (Intrinsics.c(((Season.SubSeasonType) obj).getLabel(), str)) {
                                                break;
                                            }
                                        }
                                        Season.SubSeasonType subSeasonType = (Season.SubSeasonType) obj;
                                        if (subSeasonType != null) {
                                            arrayList2.add(subSeasonType);
                                        }
                                    }
                                    ltbVar.put(num, arrayList2);
                                }
                            }
                        }
                        ltb d = ltbVar.d();
                        if (statisticsSeasonsResponse != null && (uniqueTournamentSeasons = statisticsSeasonsResponse.getUniqueTournamentSeasons()) != null) {
                            r9 = new ArrayList(k13.r(uniqueTournamentSeasons, 10));
                            it = uniqueTournamentSeasons.iterator();
                            while (it.hasNext()) {
                                wak W = w3a.W((UniqueTournamentSeasons) it.next());
                                int i6 = W.a;
                                Integer num2 = new Integer(i6);
                                String str2 = W.b;
                                List<Season> list2 = W.c;
                                ArrayList arrayList3 = new ArrayList(k13.r(list2, i5));
                                for (Season season : list2) {
                                    gv9 a = z83.a(season, d);
                                    int id = season.getId();
                                    Season.SubSeasonType subSeasonType2 = (Season.SubSeasonType) CollectionsKt.firstOrNull(a);
                                    if (subSeasonType2 == null || (label = subSeasonType2.getLabel()) == null) {
                                        label = Season.SubSeasonType.OVERALL.getLabel();
                                    }
                                    Iterator it5 = it;
                                    arrayList3.add(new y83(season, a, new ComparisonSeasonInfo.UniqueTournamentSeasonInfo(i6, id, label), w3a.C(season, context)));
                                    it = it5;
                                }
                                r9.add(new m93(num2, str2, l6g.W(arrayList3), false));
                                it = it;
                                i5 = 10;
                            }
                        }
                        if (r9 == 0) {
                            r9 = km5.a;
                        }
                        int id2 = team2.getId();
                        String p = tba.p(context, team2);
                        if (qea.y(team2) && team2.getSport() != null) {
                            Set set = wyh.a;
                            if (!wyh.e(team2.getSportSlug())) {
                                p = wv8.i(p, " ", context.getString(R.string.female_team));
                            }
                        }
                        return new x63(new b73(id2, p, team2), l6g.W(CollectionsKt.w0(r9, list)));
                    }
                    i3 = uuiVar.r;
                    y6a.M(obj2);
                }
                teamDetailsResponse = (TeamDetailsResponse) yaa.x((x2g) obj2);
                if (teamDetailsResponse != null || (team = teamDetailsResponse.getTeam()) == null) {
                    return null;
                }
                uuiVar.s = team;
                uuiVar.r = i3;
                uuiVar.v = 2;
                Object t = j0jVar.t(i3, uuiVar);
                if (t != lu3Var) {
                    obj2 = t;
                    team2 = team;
                    statisticsSeasonsResponse = (StatisticsSeasonsResponse) obj2;
                    equals = this.c.equals(Sports.TENNIS);
                    int i52 = 10;
                    Context context2 = this.b;
                    if (equals) {
                    }
                    ?? ltbVar2 = new ltb();
                    if (statisticsSeasonsResponse != null) {
                        it2 = typesMap.entrySet().iterator();
                        while (it2.hasNext()) {
                        }
                    }
                    ltb d2 = ltbVar2.d();
                    if (statisticsSeasonsResponse != null) {
                        r9 = new ArrayList(k13.r(uniqueTournamentSeasons, 10));
                        it = uniqueTournamentSeasons.iterator();
                        while (it.hasNext()) {
                        }
                    }
                    if (r9 == 0) {
                    }
                    int id22 = team2.getId();
                    String p2 = tba.p(context2, team2);
                    if (qea.y(team2)) {
                        Set set2 = wyh.a;
                        if (!wyh.e(team2.getSportSlug())) {
                        }
                    }
                    return new x63(new b73(id22, p2, team2), l6g.W(CollectionsKt.w0(r9, list)));
                }
                return lu3Var;
            }
        }
        uuiVar = new uui(this, (sq3) rq3Var);
        Object obj22 = uuiVar.t;
        lu3 lu3Var2 = lu3.a;
        i2 = uuiVar.v;
        j0j j0jVar2 = this.a;
        ?? r92 = 0;
        r92 = 0;
        if (i2 != 0) {
        }
        teamDetailsResponse = (TeamDetailsResponse) yaa.x((x2g) obj22);
        if (teamDetailsResponse != null) {
        }
        return null;
    }

    @Override // defpackage.f73
    public final ComparisonSeasonInfo b(ComparisonSeasonInfo comparisonSeasonInfo, String str) {
        comparisonSeasonInfo.getClass();
        if (comparisonSeasonInfo instanceof ComparisonSeasonInfo.TennisYearInfo) {
            return new ComparisonSeasonInfo.TennisYearInfo(str);
        }
        if (comparisonSeasonInfo instanceof ComparisonSeasonInfo.UniqueTournamentSeasonInfo) {
            return ComparisonSeasonInfo.UniqueTournamentSeasonInfo.a((ComparisonSeasonInfo.UniqueTournamentSeasonInfo) comparisonSeasonInfo, str);
        }
        zzl.b();
        return null;
    }

    @Override // defpackage.f73
    public final Object c(int i, qo2 qo2Var, ComparisonSeasonInfo comparisonSeasonInfo, oyg oygVar) {
        if (comparisonSeasonInfo instanceof ComparisonSeasonInfo.TennisYearInfo) {
            return e(i, ((ComparisonSeasonInfo.TennisYearInfo) comparisonSeasonInfo).a, oygVar);
        }
        if (comparisonSeasonInfo instanceof ComparisonSeasonInfo.UniqueTournamentSeasonInfo) {
            return d(i, (ComparisonSeasonInfo.UniqueTournamentSeasonInfo) comparisonSeasonInfo, oygVar);
        }
        zzl.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo, sq3 sq3Var) {
        vui vuiVar;
        int i2;
        ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo2;
        if (sq3Var instanceof vui) {
            vuiVar = (vui) sq3Var;
            int i3 = vuiVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vuiVar.u = i3 - Integer.MIN_VALUE;
                vui vuiVar2 = vuiVar;
                Object obj = vuiVar2.s;
                lu3 lu3Var = lu3.a;
                i2 = vuiVar2.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    int i4 = uniqueTournamentSeasonInfo.a;
                    int i5 = uniqueTournamentSeasonInfo.b;
                    String str = uniqueTournamentSeasonInfo.c;
                    vuiVar2.r = uniqueTournamentSeasonInfo;
                    vuiVar2.u = 1;
                    obj = this.a.q(i, i4, i5, str, this.c, vuiVar2);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    uniqueTournamentSeasonInfo2 = uniqueTournamentSeasonInfo;
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uniqueTournamentSeasonInfo2 = vuiVar2.r;
                    y6a.M(obj);
                }
                TeamSeasonStatisticsResponse teamSeasonStatisticsResponse = (TeamSeasonStatisticsResponse) obj;
                return new h93(new d73(new Integer(uniqueTournamentSeasonInfo2.a), null, null, null, null, null, teamSeasonStatisticsResponse != null ? (TeamSeasonStatistics) teamSeasonStatisticsResponse.getStatistics() : null, 62));
            }
        }
        vuiVar = new vui(this, sq3Var);
        vui vuiVar22 = vuiVar;
        Object obj2 = vuiVar22.s;
        lu3 lu3Var2 = lu3.a;
        i2 = vuiVar22.u;
        if (i2 != 0) {
        }
        TeamSeasonStatisticsResponse teamSeasonStatisticsResponse2 = (TeamSeasonStatisticsResponse) obj2;
        if (teamSeasonStatisticsResponse2 != null) {
        }
        return new h93(new d73(new Integer(uniqueTournamentSeasonInfo2.a), null, null, null, null, null, teamSeasonStatisticsResponse2 != null ? (TeamSeasonStatistics) teamSeasonStatisticsResponse2.getStatistics() : null, 62));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f A[LOOP:0: B:11:0x0069->B:13:0x006f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae A[LOOP:1: B:16:0x00a8->B:18:0x00ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, String str, sq3 sq3Var) {
        wui wuiVar;
        int i2;
        d73 d73Var;
        if (sq3Var instanceof wui) {
            wuiVar = (wui) sq3Var;
            int i3 = wuiVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wuiVar.t = i3 - Integer.MIN_VALUE;
                Object obj = wuiVar.r;
                lu3 lu3Var = lu3.a;
                i2 = wuiVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    wuiVar.t = 1;
                    obj = this.a.v(i, str, wuiVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Map map = (Map) obj;
                gv9 W = l6g.W(uaa.u(this.b, CollectionsKt.S0(map.keySet())));
                LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), new d73(null, null, null, null, null, null, (TennisTeamSeasonStatistics) entry.getValue(), 62));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(sub.c(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(((TennisSurfaceType) entry2.getKey()).name(), entry2.getValue());
                }
                d73Var = (d73) linkedHashMap2.get("ALL");
                if (d73Var == null) {
                    d73Var = new d73(null, null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                }
                return new g93(d73Var, linkedHashMap2, W);
            }
        }
        wuiVar = new wui(this, sq3Var);
        Object obj2 = wuiVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = wuiVar.t;
        if (i2 != 0) {
        }
        Map map2 = (Map) obj2;
        gv9 W2 = l6g.W(uaa.u(this.b, CollectionsKt.S0(map2.keySet())));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(sub.c(map2.size()));
        while (r12.hasNext()) {
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap(sub.c(linkedHashMap3.size()));
        while (r11.hasNext()) {
        }
        d73Var = (d73) linkedHashMap22.get("ALL");
        if (d73Var == null) {
        }
        return new g93(d73Var, linkedHashMap22, W2);
    }
}
