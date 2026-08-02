package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsInfo;
import com.sofascore.results.player.statistics.career.modal.CareerStatsFilterModal;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lome;", "Lq8;", "nme", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ome extends q8 {
    public final wve e;
    public final yzc f;
    public final yzc g;
    public final yzc h;
    public final yzc i;
    public final LinkedHashMap j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ome(Application application, wve wveVar) {
        super(application);
        wveVar.getClass();
        this.e = wveVar;
        yzc yzcVar = new yzc();
        this.f = yzcVar;
        this.g = yzcVar;
        yzc yzcVar2 = new yzc();
        this.h = yzcVar2;
        this.i = yzcVar2;
        this.j = new LinkedHashMap();
        this.k = true;
    }

    public static xbb k(ArrayList arrayList, ok2 ok2Var, boolean z, Function1 function1, boolean z2) {
        ArrayList arrayList2;
        String str;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics;
        List list;
        Integer num;
        Season season;
        xbb b = a.b();
        if (!arrayList.isEmpty()) {
            if (z) {
                AbstractPlayerSeasonStatistics.Companion companion = AbstractPlayerSeasonStatistics.INSTANCE;
                arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((PlayerSeasonStatisticsInfo) it.next()).getStatistics());
                }
                AbstractPlayerSeasonStatistics aggregate = companion.aggregate(arrayList3);
                if (aggregate != null) {
                    b.add(new tle(ok2Var, aggregate));
                }
            } else {
                arrayList2 = arrayList;
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Season season2 = ((PlayerSeasonStatisticsInfo) next).getSeason();
                if ((season2 != null ? season2.getYear() : null) != null) {
                    arrayList4.add(next);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                Season season3 = ((PlayerSeasonStatisticsInfo) next2).getSeason();
                String year = season3 != null ? season3.getYear() : null;
                year.getClass();
                Object obj = linkedHashMap.get(year);
                if (obj == null) {
                    obj = wv8.n(linkedHashMap, year);
                }
                ((List) obj).add(next2);
            }
            Set entrySet = linkedHashMap.entrySet();
            int i = 0;
            for (Object obj2 : entrySet) {
                int i2 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                Map.Entry entry = (Map.Entry) obj2;
                String str2 = (String) entry.getKey();
                List list2 = (List) entry.getValue();
                AbstractPlayerSeasonStatistics.Companion companion2 = AbstractPlayerSeasonStatistics.INSTANCE;
                ArrayList arrayList5 = new ArrayList(k13.r(list2, 10));
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(((PlayerSeasonStatisticsInfo) it4.next()).getStatistics());
                }
                AbstractPlayerSeasonStatistics aggregate2 = companion2.aggregate(arrayList5);
                if (aggregate2 != null) {
                    List list3 = (List) function1.invoke(list2);
                    boolean z3 = i != entrySet.size() + (-1);
                    PlayerSeasonStatisticsInfo playerSeasonStatisticsInfo = (PlayerSeasonStatisticsInfo) CollectionsKt.firstOrNull(list2);
                    if (playerSeasonStatisticsInfo == null || (season = playerSeasonStatisticsInfo.getSeason()) == null) {
                        str = str2;
                        abstractPlayerSeasonStatistics = aggregate2;
                        list = list3;
                        num = null;
                    } else {
                        str = str2;
                        abstractPlayerSeasonStatistics = aggregate2;
                        list = list3;
                        num = Integer.valueOf(season.getId());
                    }
                    b.add(new yle(ok2Var, str, abstractPlayerSeasonStatistics, list, z3, num));
                }
                i = i2;
            }
            if (z2) {
                b.add(new wle(ok2Var));
            }
        }
        return a.a(b);
    }

    public static List l(int i, List list) {
        return i5h.q(i5h.p(new a65(i5h.o(new n78(CollectionsKt.N(CollectionsKt.B0(list)), new jie(2), g5h.b), new jie(3)), new gfg(11), 0), i));
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(String str, CareerStatsFilterModal.CareerStatsFilterData careerStatsFilterData, String str2, PickerItem.Tournament tournament, String str3, Function1 function1, Gender gender) {
        nk2 nk2Var;
        vle vleVar;
        ok2 ok2Var;
        nme nmeVar;
        List l;
        boolean z;
        wk2 wk2Var;
        Object obj;
        CareerStatsFilterModal.CareerStatsFilterData careerStatsFilterData2 = careerStatsFilterData;
        careerStatsFilterData2.getClass();
        PlayerCareerStatistics playerCareerStatistics = (PlayerCareerStatistics) this.g.d();
        if (playerCareerStatistics == null) {
            return;
        }
        List a = mk2.a(str2, str3, playerCareerStatistics, careerStatsFilterData2);
        if (str != null) {
            Iterator it = a.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.c(function1.invoke(Integer.valueOf(((nk2) obj).d())), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            nk2Var = (nk2) obj;
        } else {
            nk2Var = (nk2) CollectionsKt.firstOrNull(a);
        }
        xbb b = a.b();
        if (nk2Var != null) {
            List seasons = playerCareerStatistics.getSeasons();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : seasons) {
                PlayerSeasonStatisticsInfo playerSeasonStatisticsInfo = (PlayerSeasonStatisticsInfo) obj2;
                if (mk2.b(str2, playerSeasonStatisticsInfo, nk2Var, careerStatsFilterData2)) {
                    UniqueTournament uniqueTournament = playerSeasonStatisticsInfo.getUniqueTournament();
                    if (uniqueTournament != null) {
                        Boolean bool = (tournament == null || (wk2Var = tournament.a) == null) ? null : (Boolean) wk2Var.e.invoke(uniqueTournament);
                        if (bool != null) {
                            z = bool.booleanValue();
                            if (!z) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                ok2Var = nk2Var.e(careerStatsFilterData2.c, playerCareerStatistics, str3, gender);
                AbstractPlayerSeasonStatistics.Companion companion = AbstractPlayerSeasonStatistics.INSTANCE;
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((PlayerSeasonStatisticsInfo) it2.next()).getStatistics());
                }
                AbstractPlayerSeasonStatistics aggregate = companion.aggregate(arrayList2);
                if (aggregate != null) {
                    if (!wyh.n.contains(str2)) {
                        aggregate = null;
                    }
                    if (aggregate != null) {
                        b.add(new tle(ok2Var, aggregate));
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((PlayerSeasonStatisticsInfo) obj3).getYear() != null) {
                        arrayList3.add(obj3);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    String year = ((PlayerSeasonStatisticsInfo) next).getYear();
                    year.getClass();
                    Object obj4 = linkedHashMap.get(year);
                    if (obj4 == null) {
                        obj4 = wv8.n(linkedHashMap, year);
                    }
                    ((List) obj4).add(next);
                }
                Set entrySet = linkedHashMap.entrySet();
                Iterator it4 = entrySet.iterator();
                boolean z2 = false;
                int i = 0;
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        b.q();
                        throw null;
                    }
                    Map.Entry entry = (Map.Entry) next2;
                    String str4 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    LinkedHashMap linkedHashMap2 = this.j;
                    if (i == 0 && this.k) {
                        str4.getClass();
                        linkedHashMap2.put(str4, Boolean.TRUE);
                        this.k = z2;
                    }
                    boolean booleanValue = ((Boolean) linkedHashMap2.getOrDefault(str4, Boolean.FALSE)).booleanValue();
                    boolean z3 = (i == entrySet.size() + (-1) || booleanValue) ? z2 : true;
                    Team team = careerStatsFilterData2.a;
                    if (team == null || (l = a.c(Integer.valueOf(team.getId()))) == null) {
                        l = l(3, list);
                    }
                    String str5 = str4;
                    b.add(new xle(ok2Var, str5, list, l, z3, booleanValue));
                    if (booleanValue) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Object obj5 : list) {
                            PlayerSeasonStatisticsInfo playerSeasonStatisticsInfo2 = (PlayerSeasonStatisticsInfo) obj5;
                            Pair pair = new Pair(playerSeasonStatisticsInfo2.getUniqueTournament(), playerSeasonStatisticsInfo2.getStatistics().getType());
                            Object obj6 = linkedHashMap3.get(pair);
                            if (obj6 == null) {
                                obj6 = new ArrayList();
                                linkedHashMap3.put(pair, obj6);
                            }
                            ((List) obj6).add(obj5);
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                            if (((Pair) entry2.getKey()).a != null) {
                                linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        Set entrySet2 = linkedHashMap4.entrySet();
                        int i3 = 0;
                        for (Object obj7 : entrySet2) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                b.q();
                                throw null;
                            }
                            Map.Entry entry3 = (Map.Entry) obj7;
                            Pair pair2 = (Pair) entry3.getKey();
                            List list2 = (List) entry3.getValue();
                            AbstractPlayerSeasonStatistics.Companion companion2 = AbstractPlayerSeasonStatistics.INSTANCE;
                            Set set = entrySet;
                            Iterator it5 = it4;
                            ArrayList arrayList4 = new ArrayList(k13.r(list2, 10));
                            Iterator it6 = list2.iterator();
                            while (it6.hasNext()) {
                                arrayList4.add(((PlayerSeasonStatisticsInfo) it6.next()).getStatistics());
                            }
                            AbstractPlayerSeasonStatistics aggregate2 = companion2.aggregate(arrayList4);
                            if (aggregate2 != null) {
                                Object obj8 = pair2.a;
                                obj8.getClass();
                                String str6 = str5;
                                str5 = str6;
                                b.add(new ule(ok2Var, (UniqueTournament) obj8, str6, aggregate2, i3 == entrySet2.size() + (-1) && i != set.size() + (-1)));
                                Unit unit = Unit.a;
                            }
                            entrySet = set;
                            it4 = it5;
                            i3 = i4;
                        }
                    }
                    careerStatsFilterData2 = careerStatsFilterData;
                    entrySet = entrySet;
                    it4 = it4;
                    i = i2;
                    z2 = false;
                }
                vleVar = null;
                b.add(new wle(ok2Var));
                xbb a2 = a.a(b);
                if (ok2Var == null) {
                    nmeVar = new nme(new vle(ok2Var), a2, a);
                } else {
                    km5 km5Var = km5.a;
                    nmeVar = new nme(vleVar, km5Var, km5Var);
                }
                this.h.j(nmeVar);
            }
        }
        vleVar = null;
        ok2Var = null;
        xbb a22 = a.a(b);
        if (ok2Var == null) {
        }
        this.h.j(nmeVar);
    }
}
