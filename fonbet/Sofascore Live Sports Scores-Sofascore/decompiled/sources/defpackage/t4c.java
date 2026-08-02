package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.Sports;
import com.sofascore.model.network.response.EventStatisticsGroup;
import com.sofascore.model.network.response.EventStatisticsItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t4c {
    public static final Set a = ph0.a0(new String[]{"Ball possession", "Expected goals", "Total shots", "Shots on target", "Corner kicks", "Yellow cards", "Red cards", "Fouls", "Passes"});
    public static final Set b = ph0.a0(new String[]{"Ball possession", "Big chances"});
    public static final Set c = ph0.a0(new String[]{"Field goals", "3 pointers", "2 pointers", "Free throws"});
    public static final Set d = ph0.a0(new String[]{"Rebounds", "Assists", "Turnovers", "Steals", "Blocks"});
    public static final Set e = ph0.a0(new String[]{"Shooting efficiency", "Wing goals", "Fastbreak goals", "7 meters", "Saves", "2 min penalty", "Technical faults"});
    public static final Set f = ph0.a0(new String[]{"Shots", "Faceoffs won", "Blocked", "Hits", "Penalty minutes", "Takeaways", "Giveaways"});

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0583, code lost:
    
        if ((r0 != null ? r0.size() : 0) >= r10) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x058d, code lost:
    
        if ((r0 != null ? r0.size() : 0) < r10) goto L310;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0592  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List a(int i, String str, List list, boolean z, boolean z2) {
        Collection collection;
        Object obj;
        EventStatisticsItem eventStatisticsItem;
        EventStatisticsItem eventStatisticsItem2;
        EventStatisticsItem eventStatisticsItem3;
        EventStatisticsItem eventStatisticsItem4;
        EventStatisticsItem eventStatisticsItem5;
        Object obj2;
        EventStatisticsItem eventStatisticsItem6;
        Iterator it;
        Object obj3;
        EventStatisticsGroup eventStatisticsGroup;
        EventStatisticsItem eventStatisticsItem7;
        List<EventStatisticsItem> statisticsItems;
        Iterator<T> it2;
        Object obj4;
        EventStatisticsItem eventStatisticsItem8;
        EventStatisticsItem copy;
        List<EventStatisticsItem> statisticsItems2;
        Object obj5;
        EventStatisticsItem copy2;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        EventStatisticsItem eventStatisticsItem9;
        EventStatisticsItem eventStatisticsItem10;
        EventStatisticsItem eventStatisticsItem11;
        EventStatisticsItem eventStatisticsItem12;
        EventStatisticsItem eventStatisticsItem13;
        Object obj12;
        EventStatisticsItem eventStatisticsItem14;
        List<EventStatisticsItem> statisticsItems3;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        boolean z3 = (i & 8) == 0;
        boolean z4 = (i & 16) != 0 ? false : z2;
        list.getClass();
        Set set = z3 ? b : a;
        Integer num = z4 ? r7 : null;
        int intValue = num != null ? num.intValue() : 3;
        r7 = z4 ? 3 : null;
        int intValue2 = r7 != null ? r7.intValue() : 3;
        if (str != null) {
            switch (str.hashCode()) {
                case -2002238939:
                    if (str.equals(Sports.ICE_HOCKEY)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            o13.v(((EventStatisticsGroup) it3.next()).getStatisticsItems(), arrayList);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            if (f.contains(((EventStatisticsItem) next).getName())) {
                                arrayList2.add(next);
                            }
                        }
                        collection = CollectionsKt.H0(c(arrayList2), new wpb(5));
                        break;
                    }
                    break;
                case -877324069:
                    if (str.equals(Sports.TENNIS)) {
                        Iterator it5 = list.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                obj = it5.next();
                                if (Intrinsics.c(((EventStatisticsGroup) obj).getGroupName(), "Service")) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        EventStatisticsGroup eventStatisticsGroup2 = (EventStatisticsGroup) obj;
                        List<EventStatisticsItem> statisticsItems4 = eventStatisticsGroup2 != null ? eventStatisticsGroup2.getStatisticsItems() : null;
                        if (statisticsItems4 != null) {
                            Iterator<T> it6 = statisticsItems4.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    obj10 = it6.next();
                                    if (Intrinsics.c(((EventStatisticsItem) obj10).getName(), "Aces")) {
                                    }
                                } else {
                                    obj10 = null;
                                }
                            }
                            eventStatisticsItem = (EventStatisticsItem) obj10;
                        } else {
                            eventStatisticsItem = null;
                        }
                        if (statisticsItems4 != null) {
                            Iterator<T> it7 = statisticsItems4.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    obj9 = it7.next();
                                    if (Intrinsics.c(((EventStatisticsItem) obj9).getName(), "Double faults")) {
                                    }
                                } else {
                                    obj9 = null;
                                }
                            }
                            eventStatisticsItem2 = (EventStatisticsItem) obj9;
                        } else {
                            eventStatisticsItem2 = null;
                        }
                        if (statisticsItems4 != null) {
                            Iterator<T> it8 = statisticsItems4.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    obj8 = it8.next();
                                    if (Intrinsics.c(((EventStatisticsItem) obj8).getName(), "First serve")) {
                                    }
                                } else {
                                    obj8 = null;
                                }
                            }
                            eventStatisticsItem3 = (EventStatisticsItem) obj8;
                        } else {
                            eventStatisticsItem3 = null;
                        }
                        if (statisticsItems4 != null) {
                            Iterator<T> it9 = statisticsItems4.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    obj7 = it9.next();
                                    if (Intrinsics.c(((EventStatisticsItem) obj7).getName(), "First serve points")) {
                                    }
                                } else {
                                    obj7 = null;
                                }
                            }
                            eventStatisticsItem4 = (EventStatisticsItem) obj7;
                        } else {
                            eventStatisticsItem4 = null;
                        }
                        if (statisticsItems4 != null) {
                            Iterator<T> it10 = statisticsItems4.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    obj6 = it10.next();
                                    if (Intrinsics.c(((EventStatisticsItem) obj6).getName(), "Second serve points")) {
                                    }
                                } else {
                                    obj6 = null;
                                }
                            }
                            eventStatisticsItem5 = (EventStatisticsItem) obj6;
                        } else {
                            eventStatisticsItem5 = null;
                        }
                        Iterator it11 = list.iterator();
                        while (true) {
                            if (it11.hasNext()) {
                                obj2 = it11.next();
                                if (Intrinsics.c(((EventStatisticsGroup) obj2).getGroupName(), "Winners")) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        EventStatisticsGroup eventStatisticsGroup3 = (EventStatisticsGroup) obj2;
                        if (eventStatisticsGroup3 != null && (statisticsItems2 = eventStatisticsGroup3.getStatisticsItems()) != null) {
                            Iterator<T> it12 = statisticsItems2.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    obj5 = it12.next();
                                    if (Intrinsics.c(((EventStatisticsItem) obj5).getName(), "Total")) {
                                    }
                                } else {
                                    obj5 = null;
                                }
                            }
                            EventStatisticsItem eventStatisticsItem15 = (EventStatisticsItem) obj5;
                            if (eventStatisticsItem15 != null) {
                                copy2 = eventStatisticsItem15.copy((r33 & 1) != 0 ? eventStatisticsItem15.name : "Winners", (r33 & 2) != 0 ? eventStatisticsItem15.home : null, (r33 & 4) != 0 ? eventStatisticsItem15.away : null, (r33 & 8) != 0 ? eventStatisticsItem15.compareCode : 0, (r33 & 16) != 0 ? eventStatisticsItem15.otherPlayerSelected : false, (r33 & 32) != 0 ? eventStatisticsItem15.statisticsType : null, (r33 & 64) != 0 ? eventStatisticsItem15.valueType : null, (r33 & 128) != 0 ? eventStatisticsItem15.homeValue : 0.0d, (r33 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? eventStatisticsItem15.awayValue : 0.0d, (r33 & 512) != 0 ? eventStatisticsItem15.homeTotal : null, (r33 & 1024) != 0 ? eventStatisticsItem15.awayTotal : null, (r33 & a.o) != 0 ? eventStatisticsItem15.renderType : null, (r33 & 4096) != 0 ? eventStatisticsItem15.specialStatisticType : null, (r33 & 8192) != 0 ? eventStatisticsItem15.avgRatingVersion : null);
                                eventStatisticsItem6 = copy2;
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj3 = null;
                                    } else {
                                        obj3 = it.next();
                                        if (Intrinsics.c(((EventStatisticsGroup) obj3).getGroupName(), "Unforced errors")) {
                                        }
                                    }
                                }
                                eventStatisticsGroup = (EventStatisticsGroup) obj3;
                                if (eventStatisticsGroup != null && (statisticsItems = eventStatisticsGroup.getStatisticsItems()) != null) {
                                    it2 = statisticsItems.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj4 = null;
                                        } else {
                                            obj4 = it2.next();
                                            if (Intrinsics.c(((EventStatisticsItem) obj4).getName(), "Total")) {
                                            }
                                        }
                                    }
                                    eventStatisticsItem8 = (EventStatisticsItem) obj4;
                                    if (eventStatisticsItem8 != null) {
                                        copy = eventStatisticsItem8.copy((r33 & 1) != 0 ? eventStatisticsItem8.name : "Unforced errors", (r33 & 2) != 0 ? eventStatisticsItem8.home : null, (r33 & 4) != 0 ? eventStatisticsItem8.away : null, (r33 & 8) != 0 ? eventStatisticsItem8.compareCode : 0, (r33 & 16) != 0 ? eventStatisticsItem8.otherPlayerSelected : false, (r33 & 32) != 0 ? eventStatisticsItem8.statisticsType : null, (r33 & 64) != 0 ? eventStatisticsItem8.valueType : null, (r33 & 128) != 0 ? eventStatisticsItem8.homeValue : 0.0d, (r33 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? eventStatisticsItem8.awayValue : 0.0d, (r33 & 512) != 0 ? eventStatisticsItem8.homeTotal : null, (r33 & 1024) != 0 ? eventStatisticsItem8.awayTotal : null, (r33 & a.o) != 0 ? eventStatisticsItem8.renderType : null, (r33 & 4096) != 0 ? eventStatisticsItem8.specialStatisticType : null, (r33 & 8192) != 0 ? eventStatisticsItem8.avgRatingVersion : null);
                                        eventStatisticsItem7 = copy;
                                        collection = c(ph0.x(new EventStatisticsItem[]{eventStatisticsItem, eventStatisticsItem2, eventStatisticsItem3, eventStatisticsItem4, eventStatisticsItem5, eventStatisticsItem6, eventStatisticsItem7}));
                                        break;
                                    }
                                }
                                eventStatisticsItem7 = null;
                                collection = c(ph0.x(new EventStatisticsItem[]{eventStatisticsItem, eventStatisticsItem2, eventStatisticsItem3, eventStatisticsItem4, eventStatisticsItem5, eventStatisticsItem6, eventStatisticsItem7}));
                            }
                        }
                        eventStatisticsItem6 = null;
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        eventStatisticsGroup = (EventStatisticsGroup) obj3;
                        if (eventStatisticsGroup != null) {
                            it2 = statisticsItems.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                }
                            }
                            eventStatisticsItem8 = (EventStatisticsItem) obj4;
                            if (eventStatisticsItem8 != null) {
                            }
                        }
                        eventStatisticsItem7 = null;
                        collection = c(ph0.x(new EventStatisticsItem[]{eventStatisticsItem, eventStatisticsItem2, eventStatisticsItem3, eventStatisticsItem4, eventStatisticsItem5, eventStatisticsItem6, eventStatisticsItem7}));
                    }
                    break;
                case -83759494:
                    if (str.equals(Sports.AMERICAN_FOOTBALL)) {
                        Iterator it13 = list.iterator();
                        while (true) {
                            if (it13.hasNext()) {
                                obj11 = it13.next();
                                if (Intrinsics.c(((EventStatisticsGroup) obj11).getGroupName(), "Offense")) {
                                }
                            } else {
                                obj11 = null;
                            }
                        }
                        EventStatisticsGroup eventStatisticsGroup4 = (EventStatisticsGroup) obj11;
                        List<EventStatisticsItem> statisticsItems5 = eventStatisticsGroup4 != null ? eventStatisticsGroup4.getStatisticsItems() : null;
                        if (statisticsItems5 != null) {
                            Iterator<T> it14 = statisticsItems5.iterator();
                            while (true) {
                                if (it14.hasNext()) {
                                    obj18 = it14.next();
                                    if (Intrinsics.c(((EventStatisticsItem) obj18).getName(), "Touchdowns")) {
                                    }
                                } else {
                                    obj18 = null;
                                }
                            }
                            eventStatisticsItem9 = (EventStatisticsItem) obj18;
                        } else {
                            eventStatisticsItem9 = null;
                        }
                        if (statisticsItems5 != null) {
                            Iterator<T> it15 = statisticsItems5.iterator();
                            while (true) {
                                if (it15.hasNext()) {
                                    obj17 = it15.next();
                                    if (Intrinsics.c(((EventStatisticsItem) obj17).getName(), "Field goals")) {
                                    }
                                } else {
                                    obj17 = null;
                                }
                            }
                            eventStatisticsItem10 = (EventStatisticsItem) obj17;
                        } else {
                            eventStatisticsItem10 = null;
                        }
                        if (statisticsItems5 != null) {
                            Iterator<T> it16 = statisticsItems5.iterator();
                            while (true) {
                                if (it16.hasNext()) {
                                    obj16 = it16.next();
                                    if (Intrinsics.c(((EventStatisticsItem) obj16).getName(), "Total yards")) {
                                    }
                                } else {
                                    obj16 = null;
                                }
                            }
                            eventStatisticsItem11 = (EventStatisticsItem) obj16;
                        } else {
                            eventStatisticsItem11 = null;
                        }
                        if (statisticsItems5 != null) {
                            Iterator<T> it17 = statisticsItems5.iterator();
                            while (true) {
                                if (it17.hasNext()) {
                                    obj15 = it17.next();
                                    if (Intrinsics.c(((EventStatisticsItem) obj15).getName(), "Turnovers")) {
                                    }
                                } else {
                                    obj15 = null;
                                }
                            }
                            eventStatisticsItem12 = (EventStatisticsItem) obj15;
                        } else {
                            eventStatisticsItem12 = null;
                        }
                        if (statisticsItems5 != null) {
                            Iterator<T> it18 = statisticsItems5.iterator();
                            while (true) {
                                if (it18.hasNext()) {
                                    obj14 = it18.next();
                                    if (Intrinsics.c(((EventStatisticsItem) obj14).getName(), "Punts")) {
                                    }
                                } else {
                                    obj14 = null;
                                }
                            }
                            eventStatisticsItem13 = (EventStatisticsItem) obj14;
                        } else {
                            eventStatisticsItem13 = null;
                        }
                        Iterator it19 = list.iterator();
                        while (true) {
                            if (it19.hasNext()) {
                                obj12 = it19.next();
                                if (Intrinsics.c(((EventStatisticsGroup) obj12).getGroupName(), "Other")) {
                                }
                            } else {
                                obj12 = null;
                            }
                        }
                        EventStatisticsGroup eventStatisticsGroup5 = (EventStatisticsGroup) obj12;
                        if (eventStatisticsGroup5 == null || (statisticsItems3 = eventStatisticsGroup5.getStatisticsItems()) == null) {
                            eventStatisticsItem14 = null;
                        } else {
                            Iterator<T> it20 = statisticsItems3.iterator();
                            while (true) {
                                if (it20.hasNext()) {
                                    obj13 = it20.next();
                                    if (Intrinsics.c(((EventStatisticsItem) obj13).getName(), "Penalties")) {
                                    }
                                } else {
                                    obj13 = null;
                                }
                            }
                            eventStatisticsItem14 = (EventStatisticsItem) obj13;
                        }
                        collection = c(ph0.x(new EventStatisticsItem[]{eventStatisticsItem9, eventStatisticsItem10, eventStatisticsItem11, eventStatisticsItem12, eventStatisticsItem13, eventStatisticsItem14}));
                        break;
                    }
                    break;
                case 1767150:
                    if (str.equals(Sports.HANDBALL)) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it21 = list.iterator();
                        while (it21.hasNext()) {
                            o13.v(((EventStatisticsGroup) it21.next()).getStatisticsItems(), arrayList3);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it22 = arrayList3.iterator();
                        while (it22.hasNext()) {
                            Object next2 = it22.next();
                            if (e.contains(((EventStatisticsItem) next2).getName())) {
                                arrayList4.add(next2);
                            }
                        }
                        collection = CollectionsKt.H0(c(arrayList4), new wpb(4));
                        break;
                    }
                    break;
                case 394668909:
                    if (str.equals(Sports.FOOTBALL)) {
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it23 = list.iterator();
                        while (it23.hasNext()) {
                            o13.v(((EventStatisticsGroup) it23.next()).getStatisticsItems(), arrayList5);
                        }
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it24 = arrayList5.iterator();
                        while (it24.hasNext()) {
                            Object next3 = it24.next();
                            if (set.contains(((EventStatisticsItem) next3).getName())) {
                                arrayList6.add(next3);
                            }
                        }
                        collection = b(b(CollectionsKt.H0(CollectionsKt.S0(CollectionsKt.V0(c(arrayList6))), new dy5(1, set)), "Total shots/on target", "Total shots", "Shots on target", z), "Yellow/Red cards", "Yellow cards", "Red cards", z);
                        break;
                    }
                    break;
                case 727149765:
                    if (str.equals(Sports.BASKETBALL)) {
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it25 = list.iterator();
                        while (it25.hasNext()) {
                            o13.v(((EventStatisticsGroup) it25.next()).getStatisticsItems(), arrayList7);
                        }
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it26 = arrayList7.iterator();
                        while (it26.hasNext()) {
                            Object next4 = it26.next();
                            if (c.contains(((EventStatisticsItem) next4).getName())) {
                                arrayList8.add(next4);
                            }
                        }
                        List H0 = CollectionsKt.H0(c(arrayList8), new wpb(2));
                        ArrayList arrayList9 = new ArrayList();
                        Iterator it27 = list.iterator();
                        while (it27.hasNext()) {
                            o13.v(((EventStatisticsGroup) it27.next()).getStatisticsItems(), arrayList9);
                        }
                        ArrayList arrayList10 = new ArrayList();
                        Iterator it28 = arrayList9.iterator();
                        while (it28.hasNext()) {
                            Object next5 = it28.next();
                            if (d.contains(((EventStatisticsItem) next5).getName())) {
                                arrayList10.add(next5);
                            }
                        }
                        List H02 = CollectionsKt.H0(c(arrayList10), new wpb(3));
                        if (!H0.isEmpty() && H02.size() > 1) {
                            collection = CollectionsKt.w0(CollectionsKt.L0(H02, 2), CollectionsKt.L0(H0, 1));
                            break;
                        } else {
                            collection = km5.a;
                            break;
                        }
                    }
                    break;
            }
            if (!z3) {
            }
            if (z4) {
            }
            if (collection != null) {
                return CollectionsKt.L0(collection, intValue2);
            }
            return null;
        }
        collection = null;
        if (!z3) {
        }
        if (z4) {
        }
        if (collection != null) {
        }
        return null;
    }

    public static List b(List list, String str, String str2, String str3, boolean z) {
        Object obj;
        Object obj2;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (Intrinsics.c(((s4c) obj).a, str2)) {
                break;
            }
        }
        s4c s4cVar = (s4c) obj;
        ListIterator listIterator2 = list.listIterator(list.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                obj2 = null;
                break;
            }
            obj2 = listIterator2.previous();
            if (Intrinsics.c(((s4c) obj2).a, str3)) {
                break;
            }
        }
        s4c s4cVar2 = (s4c) obj2;
        if (s4cVar == null || s4cVar2 == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        int indexOf = arrayList.indexOf(s4cVar);
        arrayList.remove(s4cVar);
        arrayList.remove(s4cVar2);
        s4c s4cVar3 = !z ? s4cVar : null;
        if (s4cVar3 == null) {
            s4cVar3 = s4cVar2;
        }
        s4c s4cVar4 = z ? null : s4cVar2;
        if (s4cVar4 != null) {
            s4cVar = s4cVar4;
        }
        arrayList.add(indexOf, new s4c(str, s4cVar3.b + s4cVar.b, s4cVar.c + s4cVar3.c, s4cVar.d + s4cVar3.d, s4cVar.e + s4cVar3.e, s4cVar3.f, s4cVar3.g, s4cVar3.h, false, s4cVar.f, s4cVar.g));
        return arrayList;
    }

    public static ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EventStatisticsItem eventStatisticsItem = (EventStatisticsItem) it.next();
            s4c s4cVar = null;
            if (EventStatisticsItem.getHomeValue$default(eventStatisticsItem, null, 1, null) != 0.0d || EventStatisticsItem.getAwayValue$default(eventStatisticsItem, null, 1, null) != 0.0d) {
                String name = eventStatisticsItem.getName();
                double absoluteHomeValue$default = EventStatisticsItem.getAbsoluteHomeValue$default(eventStatisticsItem, null, 1, null);
                Double homeTotal$default = EventStatisticsItem.getHomeTotal$default(eventStatisticsItem, null, 1, null);
                double doubleValue = homeTotal$default != null ? homeTotal$default.doubleValue() : 0.0d;
                double absoluteAwayValue$default = EventStatisticsItem.getAbsoluteAwayValue$default(eventStatisticsItem, null, 1, null);
                Double awayTotal$default = EventStatisticsItem.getAwayTotal$default(eventStatisticsItem, null, 1, null);
                s4cVar = new s4c(name, absoluteHomeValue$default, doubleValue, absoluteAwayValue$default, awayTotal$default != null ? awayTotal$default.doubleValue() : 0.0d, EventStatisticsItem.getHome$default(eventStatisticsItem, null, 1, null), EventStatisticsItem.getAway$default(eventStatisticsItem, null, 1, null), eventStatisticsItem.isNegativeStatistic(), eventStatisticsItem.getHasTeamValueType(), null, null);
            }
            if (s4cVar != null) {
                arrayList.add(s4cVar);
            }
        }
        return arrayList;
    }
}
