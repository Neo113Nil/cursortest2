package defpackage;

import com.sofascore.model.UniqueTournamentSeasonsSpinnerData;
import com.sofascore.model.network.response.EventStatisticsGroup;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.network.response.EventStatisticsPeriod;
import com.sofascore.model.newNetwork.statistics.season.team.TennisTeamSeasonStatistics;
import com.sofascore.model.team.TennisSurfaceType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k36 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ List s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k36(int i, List list, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = i;
        this.s = list;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        List list = this.s;
        switch (i) {
            case 0:
                return new k36(0, list, rq3Var);
            case 1:
                return new k36(1, list, rq3Var);
            case 2:
                return new k36(2, list, rq3Var);
            default:
                return new k36(3, list, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((k36) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        zqc zqcVar;
        String away$default;
        Double f;
        String away$default2;
        Double f2;
        String home$default;
        Double f3;
        String home$default2;
        Double f4;
        EventStatisticsItem eventStatisticsItem;
        String home$default3;
        Double f5;
        EventStatisticsItem eventStatisticsItem2;
        String home$default4;
        Double f6;
        EventStatisticsItem eventStatisticsItem3;
        String home$default5;
        Double f7;
        EventStatisticsItem eventStatisticsItem4;
        String home$default6;
        Double f8;
        String away$default3;
        Double f9;
        String away$default4;
        Double f10;
        String home$default7;
        Double f11;
        String home$default8;
        Double f12;
        String away$default5;
        Double f13;
        String away$default6;
        Double f14;
        String home$default9;
        Double f15;
        String home$default10;
        Double f16;
        String away$default7;
        Double f17;
        String away$default8;
        Double f18;
        String home$default11;
        Double f19;
        String home$default12;
        Double f20;
        String away$default9;
        Double f21;
        String away$default10;
        Double f22;
        String home$default13;
        Double f23;
        String home$default14;
        Double f24;
        String away$default11;
        Double f25;
        String away$default12;
        Double f26;
        String home$default15;
        Double f27;
        String home$default16;
        Double f28;
        String away$default13;
        Double f29;
        String away$default14;
        Double f30;
        String home$default17;
        Double f31;
        String home$default18;
        Double f32;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        int i = this.r;
        int i2 = 10;
        int i3 = 1;
        List<EventStatisticsPeriod> list = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                rfo.F(list);
                return list;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                Double valueOf = Double.valueOf(0.0d);
                list.getClass();
                int c = sub.c(k13.r(list, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                for (EventStatisticsPeriod eventStatisticsPeriod : list) {
                    linkedHashMap.put(eventStatisticsPeriod.getPeriod(), eventStatisticsPeriod.getGroups());
                }
                Map c2 = i5k.c(linkedHashMap);
                c2.remove("ALL15MIN");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(sub.c(c2.size()));
                for (Map.Entry entry : c2.entrySet()) {
                    Object key = entry.getKey();
                    Iterable<EventStatisticsGroup> iterable = (Iterable) entry.getValue();
                    int c3 = sub.c(k13.r(iterable, i2));
                    if (c3 < 16) {
                        c3 = 16;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(c3);
                    for (EventStatisticsGroup eventStatisticsGroup : iterable) {
                        String lowerCase = eventStatisticsGroup.getGroupName().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        List<EventStatisticsItem> statisticsItems = eventStatisticsGroup.getStatisticsItems();
                        int c4 = sub.c(k13.r(statisticsItems, i2));
                        if (c4 < 16) {
                            c4 = 16;
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(c4);
                        for (Object obj2 : statisticsItems) {
                            String lowerCase2 = ((EventStatisticsItem) obj2).getName().toLowerCase(Locale.ROOT);
                            lowerCase2.getClass();
                            linkedHashMap4.put(lowerCase2, obj2);
                        }
                        linkedHashMap3.put(lowerCase, linkedHashMap4);
                        i2 = 10;
                    }
                    linkedHashMap2.put(key, linkedHashMap3);
                    i2 = 10;
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                Iterator it = linkedHashMap2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    Map map = (Map) entry2.getValue();
                    Map map2 = (Map) map.get("strikes");
                    Map map3 = (Map) map.get("distance");
                    Map map4 = (Map) map.get("ground");
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    lnc q = ccd.q(map2 != null ? (EventStatisticsItem) map2.get("significant strikes") : null, map2 != null ? (EventStatisticsItem) map2.get("strikes") : null);
                    brc brcVar = brc.a;
                    arrayList3.add(new yqc("landed_all_strikes", brcVar, q.a, q.b, null, null, q.c, false, 864));
                    arrayList2.add(new src("total_strikes", arrayList3));
                    ArrayList arrayList4 = new ArrayList();
                    lnc q2 = ccd.q(map2 != null ? (EventStatisticsItem) map2.get("significant strikes distance") : null, map2 != null ? (EventStatisticsItem) map2.get("strikes distance") : null);
                    brc brcVar2 = brc.b;
                    arrayList4.add(new yqc("distance", brcVar2, q2.a, q2.b, null, null, q2.c, false, 864));
                    lnc q3 = ccd.q(map2 != null ? (EventStatisticsItem) map2.get("significant strikes ground") : null, map2 != null ? (EventStatisticsItem) map2.get("strikes ground") : null);
                    arrayList4.add(new yqc("ground", brcVar2, q3.a, q3.b, null, null, q3.c, false, 864));
                    arrayList2.add(new src("strikes_by_position", arrayList4));
                    ArrayList arrayList5 = new ArrayList();
                    EventStatisticsItem eventStatisticsItem5 = map2 != null ? (EventStatisticsItem) map2.get("significant strikes head") : null;
                    EventStatisticsItem eventStatisticsItem6 = map2 != null ? (EventStatisticsItem) map2.get("significant strikes head percentage") : null;
                    EventStatisticsItem eventStatisticsItem7 = map2 != null ? (EventStatisticsItem) map2.get("significant strikes body") : null;
                    EventStatisticsItem eventStatisticsItem8 = map2 != null ? (EventStatisticsItem) map2.get("significant strikes body percentage") : null;
                    EventStatisticsItem eventStatisticsItem9 = map2 != null ? (EventStatisticsItem) map2.get("significant strikes legs") : null;
                    Iterator it2 = it;
                    EventStatisticsItem eventStatisticsItem10 = map2 != null ? (EventStatisticsItem) map2.get("significant strikes legs percentage") : null;
                    Double d = valueOf;
                    arrayList5.add(new yqc("head", brc.e, new arc((eventStatisticsItem6 == null || (home$default18 = EventStatisticsItem.getHome$default(eventStatisticsItem6, null, 1, null)) == null || (f32 = b.f(home$default18)) == null) ? 0.0d : f32.doubleValue(), (eventStatisticsItem5 == null || (home$default17 = EventStatisticsItem.getHome$default(eventStatisticsItem5, null, 1, null)) == null || (f31 = b.f(home$default17)) == null) ? 0.0d : f31.doubleValue(), null), new arc((eventStatisticsItem6 == null || (away$default14 = EventStatisticsItem.getAway$default(eventStatisticsItem6, null, 1, null)) == null || (f30 = b.f(away$default14)) == null) ? 0.0d : f30.doubleValue(), (eventStatisticsItem5 == null || (away$default13 = EventStatisticsItem.getAway$default(eventStatisticsItem5, null, 1, null)) == null || (f29 = b.f(away$default13)) == null) ? 0.0d : f29.doubleValue(), null), null, null, ccd.y(eventStatisticsItem5 != null ? Integer.valueOf(EventStatisticsItem.getCompareCode$default(eventStatisticsItem5, null, 1, null)) : null), false, 864));
                    arrayList5.add(new yqc("body", brc.f, new arc((eventStatisticsItem8 == null || (home$default16 = EventStatisticsItem.getHome$default(eventStatisticsItem8, null, 1, null)) == null || (f28 = b.f(home$default16)) == null) ? 0.0d : f28.doubleValue(), (eventStatisticsItem7 == null || (home$default15 = EventStatisticsItem.getHome$default(eventStatisticsItem7, null, 1, null)) == null || (f27 = b.f(home$default15)) == null) ? 0.0d : f27.doubleValue(), null), new arc((eventStatisticsItem8 == null || (away$default12 = EventStatisticsItem.getAway$default(eventStatisticsItem8, null, 1, null)) == null || (f26 = b.f(away$default12)) == null) ? 0.0d : f26.doubleValue(), (eventStatisticsItem7 == null || (away$default11 = EventStatisticsItem.getAway$default(eventStatisticsItem7, null, 1, null)) == null || (f25 = b.f(away$default11)) == null) ? 0.0d : f25.doubleValue(), null), null, null, ccd.y(eventStatisticsItem7 != null ? Integer.valueOf(EventStatisticsItem.getCompareCode$default(eventStatisticsItem7, null, 1, null)) : null), false, 864));
                    arrayList5.add(new yqc("legs", brc.g, new arc((eventStatisticsItem10 == null || (home$default14 = EventStatisticsItem.getHome$default(eventStatisticsItem10, null, 1, null)) == null || (f24 = b.f(home$default14)) == null) ? 0.0d : f24.doubleValue(), (eventStatisticsItem9 == null || (home$default13 = EventStatisticsItem.getHome$default(eventStatisticsItem9, null, 1, null)) == null || (f23 = b.f(home$default13)) == null) ? 0.0d : f23.doubleValue(), null), new arc((eventStatisticsItem10 == null || (away$default10 = EventStatisticsItem.getAway$default(eventStatisticsItem10, null, 1, null)) == null || (f22 = b.f(away$default10)) == null) ? 0.0d : f22.doubleValue(), (eventStatisticsItem9 == null || (away$default9 = EventStatisticsItem.getAway$default(eventStatisticsItem9, null, 1, null)) == null || (f21 = b.f(away$default9)) == null) ? 0.0d : f21.doubleValue(), null), null, null, ccd.y(eventStatisticsItem9 != null ? Integer.valueOf(EventStatisticsItem.getCompareCode$default(eventStatisticsItem9, null, 1, null)) : null), false, 864));
                    arrayList2.add(new src("strikes_by_zones", arrayList5));
                    ArrayList arrayList6 = new ArrayList();
                    EventStatisticsItem eventStatisticsItem11 = map2 != null ? (EventStatisticsItem) map2.get("knockdowns") : null;
                    arc arcVar = new arc((eventStatisticsItem11 == null || (home$default12 = EventStatisticsItem.getHome$default(eventStatisticsItem11, null, 1, null)) == null || (f20 = b.f(home$default12)) == null) ? 0.0d : f20.doubleValue(), (eventStatisticsItem11 == null || (home$default11 = EventStatisticsItem.getHome$default(eventStatisticsItem11, null, 1, null)) == null || (f19 = b.f(home$default11)) == null) ? 0.0d : f19.doubleValue(), null);
                    arc arcVar2 = new arc((eventStatisticsItem11 == null || (away$default8 = EventStatisticsItem.getAway$default(eventStatisticsItem11, null, 1, null)) == null || (f18 = b.f(away$default8)) == null) ? 0.0d : f18.doubleValue(), (eventStatisticsItem11 == null || (away$default7 = EventStatisticsItem.getAway$default(eventStatisticsItem11, null, 1, null)) == null || (f17 = b.f(away$default7)) == null) ? 0.0d : f17.doubleValue(), null);
                    brc brcVar3 = brc.d;
                    arrayList6.add(new yqc("knockdowns", brcVar3, arcVar, arcVar2, null, null, ccd.y(eventStatisticsItem11 != null ? Integer.valueOf(EventStatisticsItem.getCompareCode$default(eventStatisticsItem11, null, 1, null)) : null), false, 864));
                    urc urcVar = urc.c;
                    arrayList2.add(new src("knockdowns", arrayList6, urcVar));
                    arrayList.add(new trc("significant_strikes", arrayList2));
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    lnc q4 = ccd.q(map4 != null ? (EventStatisticsItem) map4.get("takedowns succeeded") : null, map4 != null ? (EventStatisticsItem) map4.get("takedowns attempted") : null);
                    arrayList8.add(new yqc("success_attempted", brcVar, q4.a, q4.b, null, null, q4.c, false, 864));
                    arrayList7.add(new src("takedowns", arrayList8));
                    ArrayList arrayList9 = new ArrayList();
                    EventStatisticsItem eventStatisticsItem12 = map4 != null ? (EventStatisticsItem) map4.get("transitions succeeded") : null;
                    arrayList9.add(new yqc("transitions_succeeded", brcVar3, new arc((eventStatisticsItem12 == null || (home$default10 = EventStatisticsItem.getHome$default(eventStatisticsItem12, null, 1, null)) == null || (f16 = b.f(home$default10)) == null) ? 0.0d : f16.doubleValue(), (eventStatisticsItem12 == null || (home$default9 = EventStatisticsItem.getHome$default(eventStatisticsItem12, null, 1, null)) == null || (f15 = b.f(home$default9)) == null) ? 0.0d : f15.doubleValue(), null), new arc((eventStatisticsItem12 == null || (away$default6 = EventStatisticsItem.getAway$default(eventStatisticsItem12, null, 1, null)) == null || (f14 = b.f(away$default6)) == null) ? 0.0d : f14.doubleValue(), (eventStatisticsItem12 == null || (away$default5 = EventStatisticsItem.getAway$default(eventStatisticsItem12, null, 1, null)) == null || (f13 = b.f(away$default5)) == null) ? 0.0d : f13.doubleValue(), null), null, null, ccd.y(eventStatisticsItem12 != null ? Integer.valueOf(EventStatisticsItem.getCompareCode$default(eventStatisticsItem12, null, 1, null)) : null), false, 864));
                    arrayList7.add(new src("transitions_succeeded", arrayList9, urcVar));
                    ArrayList arrayList10 = new ArrayList();
                    EventStatisticsItem eventStatisticsItem13 = map4 != null ? (EventStatisticsItem) map4.get("submissions attempted") : null;
                    arrayList10.add(new yqc("total_attempts", brc.c, new arc((eventStatisticsItem13 == null || (home$default8 = EventStatisticsItem.getHome$default(eventStatisticsItem13, null, 1, null)) == null || (f12 = b.f(home$default8)) == null) ? 0.0d : f12.doubleValue(), (eventStatisticsItem13 == null || (home$default7 = EventStatisticsItem.getHome$default(eventStatisticsItem13, null, 1, null)) == null || (f11 = b.f(home$default7)) == null) ? 0.0d : f11.doubleValue(), null), new arc((eventStatisticsItem13 == null || (away$default4 = EventStatisticsItem.getAway$default(eventStatisticsItem13, null, 1, null)) == null || (f10 = b.f(away$default4)) == null) ? 0.0d : f10.doubleValue(), (eventStatisticsItem13 == null || (away$default3 = EventStatisticsItem.getAway$default(eventStatisticsItem13, null, 1, null)) == null || (f9 = b.f(away$default3)) == null) ? 0.0d : f9.doubleValue(), null), null, null, ccd.y(eventStatisticsItem13 != null ? Integer.valueOf(EventStatisticsItem.getCompareCode$default(eventStatisticsItem13, null, 1, null)) : null), false, 864));
                    arrayList7.add(new src("submissions", arrayList10));
                    arrayList.add(new trc("grappling", arrayList7));
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    valueOf = d;
                    arc arcVar3 = new arc(0.0d, 0.0d, valueOf);
                    double doubleValue = (map3 == null || (eventStatisticsItem4 = (EventStatisticsItem) map3.get("distance seconds")) == null || (home$default6 = EventStatisticsItem.getHome$default(eventStatisticsItem4, null, 1, null)) == null || (f8 = b.f(home$default6)) == null) ? 0.0d : f8.doubleValue();
                    double doubleValue2 = (map3 == null || (eventStatisticsItem3 = (EventStatisticsItem) map3.get("distance percent")) == null || (home$default5 = EventStatisticsItem.getHome$default(eventStatisticsItem3, null, 1, null)) == null || (f7 = b.f(home$default5)) == null) ? 0.0d : f7.doubleValue();
                    double doubleValue3 = (map4 == null || (eventStatisticsItem2 = (EventStatisticsItem) map4.get("ground seconds")) == null || (home$default4 = EventStatisticsItem.getHome$default(eventStatisticsItem2, null, 1, null)) == null || (f6 = b.f(home$default4)) == null) ? 0.0d : f6.doubleValue();
                    double doubleValue4 = (map4 == null || (eventStatisticsItem = (EventStatisticsItem) map4.get("ground percent")) == null || (home$default3 = EventStatisticsItem.getHome$default(eventStatisticsItem, null, 1, null)) == null || (f5 = b.f(home$default3)) == null) ? 0.0d : f5.doubleValue();
                    brc brcVar4 = brc.h;
                    arrayList12.add(new yqc("distance", brcVar4, new arc(doubleValue2, doubleValue, valueOf), arcVar3, null, null, null, true, 352));
                    double d2 = doubleValue3;
                    arrayList12.add(new yqc("ground", brcVar4, new arc(doubleValue4, d2, valueOf), arcVar3, null, null, null, true, 352));
                    arrayList11.add(new src("time_in_position", arrayList12, urc.d));
                    ArrayList arrayList13 = new ArrayList();
                    EventStatisticsItem eventStatisticsItem14 = map4 != null ? (EventStatisticsItem) map4.get("ground clinch control seconds") : null;
                    EventStatisticsItem eventStatisticsItem15 = map4 != null ? (EventStatisticsItem) map4.get("ground clinch control percent") : null;
                    arrayList13.add(new yqc("ground", brcVar2, new arc((eventStatisticsItem15 == null || (home$default2 = EventStatisticsItem.getHome$default(eventStatisticsItem15, null, 1, null)) == null || (f4 = b.f(home$default2)) == null) ? 0.0d : f4.doubleValue(), (eventStatisticsItem14 == null || (home$default = EventStatisticsItem.getHome$default(eventStatisticsItem14, null, 1, null)) == null || (f3 = b.f(home$default)) == null) ? 0.0d : f3.doubleValue(), Double.valueOf(d2)), new arc((eventStatisticsItem15 == null || (away$default2 = EventStatisticsItem.getAway$default(eventStatisticsItem15, null, 1, null)) == null || (f2 = b.f(away$default2)) == null) ? 0.0d : f2.doubleValue(), (eventStatisticsItem14 == null || (away$default = EventStatisticsItem.getAway$default(eventStatisticsItem14, null, 1, null)) == null || (f = b.f(away$default)) == null) ? 0.0d : f.doubleValue(), Double.valueOf(d2)), null, null, ccd.y(eventStatisticsItem14 != null ? Integer.valueOf(EventStatisticsItem.getCompareCode$default(eventStatisticsItem14, null, 1, null)) : null), true, 352));
                    arrayList11.add(new src("control_in_position", arrayList13));
                    arrayList.add(new trc("position_statistics_live", arrayList11));
                    String str = (String) entry2.getKey();
                    str.getClass();
                    switch (str.hashCode()) {
                        case 49746:
                            if (str.equals("1ST")) {
                                zqcVar = zqc.ROUND_1;
                                break;
                            }
                            zqcVar = zqc.TOTAL;
                            break;
                        case 50536:
                            if (str.equals("2ND")) {
                                zqcVar = zqc.ROUND_2;
                                break;
                            }
                            zqcVar = zqc.TOTAL;
                            break;
                        case 51621:
                            if (str.equals("3RD")) {
                                zqcVar = zqc.ROUND_3;
                                break;
                            }
                            zqcVar = zqc.TOTAL;
                            break;
                        case 52648:
                            if (str.equals("4TH")) {
                                zqcVar = zqc.ROUND_4;
                                break;
                            }
                            zqcVar = zqc.TOTAL;
                            break;
                        case 53609:
                            if (str.equals("5TH")) {
                                zqcVar = zqc.ROUND_5;
                                break;
                            }
                            zqcVar = zqc.TOTAL;
                            break;
                        case 64897:
                            if (str.equals("ALL")) {
                                zqcVar = zqc.TOTAL;
                                break;
                            }
                            zqcVar = zqc.TOTAL;
                            break;
                        default:
                            zqcVar = zqc.TOTAL;
                            break;
                    }
                    linkedHashMap5.put(zqcVar, arrayList);
                    it = it2;
                }
                return linkedHashMap5;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                list.getClass();
                ltb ltbVar = new ltb();
                ltbVar.put(TennisSurfaceType.ALL, wba.L(list));
                TennisSurfaceType tennisSurfaceType = TennisSurfaceType.GRASS;
                ArrayList arrayList14 = new ArrayList();
                for (Object obj3 : list) {
                    String groundType = ((TennisTeamSeasonStatistics) obj3).getGroundType();
                    if (groundType != null) {
                        String lowerCase3 = groundType.toLowerCase(Locale.ROOT);
                        lowerCase3.getClass();
                        bool5 = Boolean.valueOf(StringsKt.J(lowerCase3, "grass", false));
                    } else {
                        bool5 = null;
                    }
                    if (Intrinsics.c(bool5, Boolean.TRUE)) {
                        arrayList14.add(obj3);
                    }
                }
                ltbVar.put(tennisSurfaceType, wba.L(arrayList14));
                TennisSurfaceType tennisSurfaceType2 = TennisSurfaceType.CLAY;
                ArrayList arrayList15 = new ArrayList();
                for (Object obj4 : list) {
                    String groundType2 = ((TennisTeamSeasonStatistics) obj4).getGroundType();
                    if (groundType2 != null) {
                        String lowerCase4 = groundType2.toLowerCase(Locale.ROOT);
                        lowerCase4.getClass();
                        bool4 = Boolean.valueOf(StringsKt.J(lowerCase4, "clay", false));
                    } else {
                        bool4 = null;
                    }
                    if (Intrinsics.c(bool4, Boolean.TRUE)) {
                        arrayList15.add(obj4);
                    }
                }
                ltbVar.put(tennisSurfaceType2, wba.L(arrayList15));
                TennisSurfaceType tennisSurfaceType3 = TennisSurfaceType.HARD;
                ArrayList arrayList16 = new ArrayList();
                for (Object obj5 : list) {
                    String groundType3 = ((TennisTeamSeasonStatistics) obj5).getGroundType();
                    if (groundType3 != null) {
                        String lowerCase5 = groundType3.toLowerCase(Locale.ROOT);
                        lowerCase5.getClass();
                        bool3 = Boolean.valueOf(StringsKt.J(lowerCase5, "hard", false));
                    } else {
                        bool3 = null;
                    }
                    if (Intrinsics.c(bool3, Boolean.TRUE)) {
                        arrayList16.add(obj5);
                    }
                }
                ltbVar.put(tennisSurfaceType3, wba.L(arrayList16));
                TennisSurfaceType tennisSurfaceType4 = TennisSurfaceType.INDOOR_HARD;
                ArrayList arrayList17 = new ArrayList();
                for (Object obj6 : list) {
                    String groundType4 = ((TennisTeamSeasonStatistics) obj6).getGroundType();
                    if (groundType4 != null) {
                        String lowerCase6 = groundType4.toLowerCase(Locale.ROOT);
                        lowerCase6.getClass();
                        bool2 = Boolean.valueOf(StringsKt.J(lowerCase6, "hardcourt indoor", false));
                    } else {
                        bool2 = null;
                    }
                    if (Intrinsics.c(bool2, Boolean.TRUE)) {
                        arrayList17.add(obj6);
                    }
                }
                ltbVar.put(tennisSurfaceType4, wba.L(arrayList17));
                TennisSurfaceType tennisSurfaceType5 = TennisSurfaceType.OUTDOOR_HARD;
                ArrayList arrayList18 = new ArrayList();
                for (Object obj7 : list) {
                    String groundType5 = ((TennisTeamSeasonStatistics) obj7).getGroundType();
                    if (groundType5 != null) {
                        String lowerCase7 = groundType5.toLowerCase(Locale.ROOT);
                        lowerCase7.getClass();
                        bool = Boolean.valueOf(StringsKt.J(lowerCase7, "hardcourt outdoor", false));
                    } else {
                        bool = null;
                    }
                    if (Intrinsics.c(bool, Boolean.TRUE)) {
                        arrayList18.add(obj7);
                    }
                }
                ltbVar.put(tennisSurfaceType5, wba.L(arrayList18));
                return ltbVar.d();
            default:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                ArrayList arrayList19 = new ArrayList(k13.r(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData = (UniqueTournamentSeasonsSpinnerData) it3.next();
                    arrayList19.add(new oxh(uniqueTournamentSeasonsSpinnerData, uniqueTournamentSeasonsSpinnerData.getUniqueTournament().getName(), new tc3(-334817927, new r0j(uniqueTournamentSeasonsSpinnerData, i3), true), null, null, false, 248));
                }
                return l6g.W(arrayList19);
        }
    }
}
