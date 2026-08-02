package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.ScoreCricketInning;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.network.response.EventStatisticsGroup;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.network.response.EventStatisticsPeriod;
import com.sofascore.model.network.response.EventStatisticsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ey5 {
    public static final ey5 a = new ey5();
    public static final ArrayList b;

    static {
        IntRange intRange = new IntRange(1, 7, 1);
        ArrayList arrayList = new ArrayList(k13.r(intRange, 10));
        v6a it = intRange.iterator();
        while (it.c) {
            arrayList.add("period" + it.nextInt());
        }
        b = CollectionsKt.w0(b.j("overtime", "penalties"), arrayList);
    }

    public static ArrayList a(int i, List list, boolean z) {
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                return yso.F(i, "", arrayList);
            }
            ScoreCricketInning scoreCricketInning = (ScoreCricketInning) it.next();
            Integer run = scoreCricketInning.getRun();
            if (run == null || run.intValue() != -1) {
                str = String.valueOf(scoreCricketInning.getRun());
            } else if (!z) {
                str = "X";
            }
            arrayList.add(str);
        }
    }

    public static vsi b(ScoreCricketInning scoreCricketInning) {
        return new vsi(String.valueOf(yid.m(scoreCricketInning != null ? scoreCricketInning.getHits() : null)), String.valueOf(yid.m(scoreCricketInning != null ? scoreCricketInning.getErrors() : null)), String.valueOf(yid.m(scoreCricketInning != null ? scoreCricketInning.getRun() : null)));
    }

    public static int c(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        Integer intOrNull = StringsKt.toIntOrNull(sb.toString());
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [vsi] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v4, types: [km5] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r8v13, types: [vsi] */
    /* JADX WARN: Type inference failed for: r9v23, types: [km5] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zsi d(Context context, Event event, gv9 gv9Var, EventStatisticsResponse eventStatisticsResponse) {
        gv9 W;
        xsi xsiVar;
        boolean z;
        EventStatisticsItem eventStatisticsItem;
        List<EventStatisticsPeriod> statistics;
        Object obj;
        List<EventStatisticsGroup> groups;
        Object obj2;
        List<EventStatisticsItem> statisticsItems;
        Object obj3;
        ?? r9;
        ?? r10;
        Set<String> keySet;
        Set<String> keySet2;
        gv9 gv9Var2;
        Set<String> keySet3;
        Set<String> keySet4;
        Set<String> keySet5;
        Set<String> keySet6;
        Set<Map.Entry<String, ScoreCricketInning>> entrySet;
        List H0;
        Set<Map.Entry<String, ScoreCricketInning>> entrySet2;
        List H02;
        context.getClass();
        event.getClass();
        String s = ok3.s(event);
        ?? r4 = 0;
        if (Intrinsics.c(s, Sports.BASEBALL)) {
            Map<String, ScoreCricketInning> innings = Event.getHomeScore$default(event, null, 1, null).getInnings();
            Map<String, ScoreCricketInning> innings2 = Event.getAwayScore$default(event, null, 1, null).getInnings();
            if (innings == null || (entrySet2 = innings.entrySet()) == null || (H02 = CollectionsKt.H0(entrySet2, new y73(23))) == null) {
                r9 = km5.a;
            } else {
                r9 = new ArrayList(k13.r(H02, 10));
                Iterator it = H02.iterator();
                while (it.hasNext()) {
                    r9.add((ScoreCricketInning) ((Map.Entry) it.next()).getValue());
                }
            }
            if (innings2 == null || (entrySet = innings2.entrySet()) == null || (H0 = CollectionsKt.H0(entrySet, new y73(24))) == null) {
                r10 = km5.a;
            } else {
                r10 = new ArrayList(k13.r(H0, 10));
                Iterator it2 = H0.iterator();
                while (it2.hasNext()) {
                    r10.add((ScoreCricketInning) ((Map.Entry) it2.next()).getValue());
                }
            }
            int max = Math.max((innings == null || (keySet6 = innings.keySet()) == null) ? 0 : keySet6.size(), (innings2 == null || (keySet5 = innings2.keySet()) == null) ? 0 : keySet5.size());
            ?? r11 = ((innings == null || (keySet4 = innings.keySet()) == null || !keySet4.contains("inning10")) && (innings2 == null || (keySet = innings2.keySet()) == null || !keySet.contains("inning10"))) ? false : true;
            ?? r1 = ((innings == null || (keySet3 = innings.keySet()) == null || !keySet3.contains("inning11")) && (innings2 == null || (keySet2 = innings2.keySet()) == null || !keySet2.contains("inning11"))) ? false : true;
            ScoreCricketInning scoreCricketInning = (ScoreCricketInning) CollectionsKt.firstOrNull(r9);
            Integer run = scoreCricketInning != null ? scoreCricketInning.getRun() : null;
            ScoreCricketInning scoreCricketInning2 = (ScoreCricketInning) CollectionsKt.firstOrNull(r10);
            ?? r2 = r11 == true && max == 1 && run != null && (scoreCricketInning2 != null ? scoreCricketInning2.getRun() : null) != null;
            xbb b2 = a.b();
            if (r2 == true) {
                b2.add("EI");
            } else {
                int i = 9;
                if (!Intrinsics.c(event.getStatusType(), StatusKt.STATUS_IN_PROGRESS) && max <= 9) {
                    i = max;
                }
                if (1 <= i) {
                    int i2 = 1;
                    while (true) {
                        b2.add(String.valueOf(i2));
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                if (r1 == true) {
                    if (10 <= max) {
                        int i3 = 10;
                        while (true) {
                            b2.add(String.valueOf(i3));
                            if (i3 == max) {
                                break;
                            }
                            i3++;
                        }
                    }
                } else if (r11 != false) {
                    b2.add("EI");
                }
            }
            gv9 W2 = l6g.W(a.a(b2));
            if (!me4.t(StatusKt.STATUS_NOT_STARTED, event) && !r9.isEmpty() && !r10.isEmpty()) {
                ?? r42 = (Event.getHomeScore$default(event, null, 1, null).getInningsBaseball() == null && Event.getAwayScore$default(event, null, 1, null).getInningsBaseball() == null) ? 0 : 1;
                gv9 W3 = l6g.W(a(W2.size(), r9, ok3.D(event)));
                gv9 W4 = l6g.W(a(W2.size(), r10, ok3.D(event)));
                if (gv9Var != null) {
                    ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                    Iterator it3 = gv9Var.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((nm1) it3.next()).a);
                    }
                    gv9Var2 = l6g.W(arrayList);
                } else {
                    gv9Var2 = null;
                }
                boolean D = ok3.D(event);
                vsi b3 = b(Event.getHomeScore$default(event, null, 1, null).getInningsBaseball());
                if (r42 == 0) {
                    b3 = null;
                }
                return new wsi(W3, W4, W2, gv9Var2, gv9Var, D, b3, r42 != 0 ? b(Event.getAwayScore$default(event, null, 1, null).getInningsBaseball()) : null);
            }
        } else if (Intrinsics.c(s, Sports.ICE_HOCKEY) && !ok3.E(event)) {
            Map<String, String> periods = event.getPeriods();
            if (periods == null) {
                W = l6g.W(km5.a);
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = b.iterator();
                int i4 = 0;
                while (it4.hasNext()) {
                    Object next = it4.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        b.q();
                        throw null;
                    }
                    String str = (String) next;
                    String str2 = periods.get(str);
                    if (str2 != null) {
                        ?? r112 = (Event.getHomeScore$default(event, null, 1, null).getScoreByPeriodName(str) == null || Event.getAwayScore$default(event, null, 1, null).getScoreByPeriodName(str) == null) ? r4 : true;
                        Integer defaultPeriodCount = event.getDefaultPeriodCount();
                        if (i4 < (defaultPeriodCount != null ? defaultPeriodCount.intValue() : r4) || r112 != false) {
                            String w = t6a.w(context, str2);
                            Integer scoreByPeriodName = Event.getHomeScore$default(event, null, 1, null).getScoreByPeriodName(str);
                            String valueOf = scoreByPeriodName != null ? String.valueOf(scoreByPeriodName.intValue()) : null;
                            String str3 = valueOf == null ? "" : valueOf;
                            Integer scoreByPeriodName2 = Event.getAwayScore$default(event, null, 1, null).getScoreByPeriodName(str);
                            String valueOf2 = scoreByPeriodName2 != null ? String.valueOf(scoreByPeriodName2.intValue()) : null;
                            String str4 = valueOf2 == null ? "" : valueOf2;
                            if (ok3.D(event)) {
                                String lastPeriod = event.getLastPeriod();
                                if (Intrinsics.c(lastPeriod != null ? Boolean.valueOf(StringsKt.J(lastPeriod, str, r4)) : null, Boolean.TRUE)) {
                                    z = true;
                                    xsiVar = new xsi(str, w, str3, str4, z);
                                    if (xsiVar != null) {
                                        arrayList2.add(xsiVar);
                                    }
                                    i4 = i5;
                                    r4 = 0;
                                }
                            }
                            z = false;
                            xsiVar = new xsi(str, w, str3, str4, z);
                            if (xsiVar != null) {
                            }
                            i4 = i5;
                            r4 = 0;
                        }
                    }
                    xsiVar = null;
                    if (xsiVar != null) {
                    }
                    i4 = i5;
                    r4 = 0;
                }
                W = l6g.W(arrayList2);
            }
            gv9 gv9Var3 = W;
            if (!gv9Var3.isEmpty()) {
                if (eventStatisticsResponse != null && (statistics = eventStatisticsResponse.getStatistics()) != null) {
                    Iterator it5 = statistics.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it5.next();
                        String lowerCase = ((EventStatisticsPeriod) obj).getPeriod().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.equals(Season.YEAR_ALL_TIME)) {
                            break;
                        }
                    }
                    EventStatisticsPeriod eventStatisticsPeriod = (EventStatisticsPeriod) obj;
                    if (eventStatisticsPeriod != null && (groups = eventStatisticsPeriod.getGroups()) != null) {
                        Iterator it6 = groups.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it6.next();
                            String lowerCase2 = ((EventStatisticsGroup) obj2).getGroupName().toLowerCase(Locale.ROOT);
                            lowerCase2.getClass();
                            if (lowerCase2.equals("match overview")) {
                                break;
                            }
                        }
                        EventStatisticsGroup eventStatisticsGroup = (EventStatisticsGroup) obj2;
                        if (eventStatisticsGroup != null && (statisticsItems = eventStatisticsGroup.getStatisticsItems()) != null) {
                            Iterator it7 = statisticsItems.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it7.next();
                                String lowerCase3 = ((EventStatisticsItem) obj3).getName().toLowerCase(Locale.ROOT);
                                lowerCase3.getClass();
                                if (lowerCase3.equals("shots on goal")) {
                                    break;
                                }
                            }
                            eventStatisticsItem = (EventStatisticsItem) obj3;
                            int id = Event.getHomeTeam$default(event, null, 1, null).getId();
                            int id2 = Event.getAwayTeam$default(event, null, 1, null).getId();
                            String nameCode = Event.getHomeTeam$default(event, null, 1, null).getNameCode();
                            String str5 = nameCode != null ? "" : nameCode;
                            String nameCode2 = Event.getAwayTeam$default(event, null, 1, null).getNameCode();
                            return new ysi(id, id2, str5, nameCode2 != null ? "" : nameCode2, eventStatisticsItem == null ? Integer.valueOf(wzb.a(EventStatisticsItem.getHomeValue$default(eventStatisticsItem, null, 1, null))) : null, eventStatisticsItem != null ? Integer.valueOf(wzb.a(EventStatisticsItem.getAwayValue$default(eventStatisticsItem, null, 1, null))) : null, gv9Var3);
                        }
                    }
                }
                eventStatisticsItem = null;
                int id3 = Event.getHomeTeam$default(event, null, 1, null).getId();
                int id22 = Event.getAwayTeam$default(event, null, 1, null).getId();
                String nameCode3 = Event.getHomeTeam$default(event, null, 1, null).getNameCode();
                if (nameCode3 != null) {
                }
                String nameCode22 = Event.getAwayTeam$default(event, null, 1, null).getNameCode();
                return new ysi(id3, id22, str5, nameCode22 != null ? "" : nameCode22, eventStatisticsItem == null ? Integer.valueOf(wzb.a(EventStatisticsItem.getHomeValue$default(eventStatisticsItem, null, 1, null))) : null, eventStatisticsItem != null ? Integer.valueOf(wzb.a(EventStatisticsItem.getAwayValue$default(eventStatisticsItem, null, 1, null))) : null, gv9Var3);
            }
        }
        return null;
    }
}
