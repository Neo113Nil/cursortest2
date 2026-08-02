package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n6l {
    public static final n6l a = new n6l();
    public static final e5f b = new e5f("widget_has_finished");
    public static final e5f c = new e5f("widget_notification_status");
    public static final e5f d = new e5f("widget_favorites_list");
    public static final e5f e = new e5f("widget_is_loading");
    public static final e5f f = new e5f("widget_last_updated_time");
    public static final e5f g = new e5f("widget_height_dp");
    public static final e5f h = new e5f("widget_width_dp");
    public static final e5f i = new e5f("widget_page_index");
    public static final e5f j = new e5f("widget_page_offsets");
    public static final e5f k = new e5f("widget_has_previous");
    public static final e5f l = new e5f("widget_has_next");

    public static List a(p0d p0dVar) {
        List Y;
        String str = (String) p0dVar.c(j);
        if (str != null && (Y = StringsKt.Y(str, new char[]{','})) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = Y.iterator();
            while (it.hasNext()) {
                Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
                if (intOrNull != null) {
                    arrayList.add(intOrNull);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                return arrayList;
            }
        }
        return a.c(0);
    }

    public static LinkedHashMap b(Context context, List list) {
        long startDateTimestamp;
        String i2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            v6l v6lVar = (v6l) obj;
            if (v6lVar instanceof r6l) {
                startDateTimestamp = ((r6l) v6lVar).a.getStartTimestamp();
            } else {
                if (!(v6lVar instanceof u6l)) {
                    zzl.b();
                    return null;
                }
                startDateTimestamp = ((u6l) v6lVar).a.getStartDateTimestamp();
            }
            if (ug5.u(startDateTimestamp)) {
                i2 = context.getString(R.string.today);
            } else if (ug5.v(startDateTimestamp)) {
                i2 = context.getString(R.string.tomorrow);
            } else if (ug5.w(startDateTimestamp)) {
                i2 = context.getString(R.string.yesterday);
            } else {
                bi4 bi4Var = bi4.PATTERN_DMY;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                i2 = fc6.i(startDateTimestamp, hk4.a(bi4Var.d()));
            }
            i2.getClass();
            Object obj2 = linkedHashMap.get(i2);
            if (obj2 == null) {
                obj2 = wv8.n(linkedHashMap, i2);
            }
            ((List) obj2).add(obj);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(float f2, int i2, List list, Context context, ct8 ct8Var, sq3 sq3Var) {
        m6l m6lVar;
        lu3 lu3Var;
        int i3;
        float f3;
        float f4;
        float f5;
        int intValue;
        List list2;
        float f6;
        int i4;
        ct8 ct8Var2;
        int i5;
        Object obj;
        Context context2;
        z7l z7lVar;
        int i6;
        int i7;
        z7l z7lVar2;
        int i8;
        Context context3;
        List list3;
        int i9;
        Iterator it;
        boolean z;
        Iterator it2;
        ArrayList arrayList;
        Object V;
        k6l k6lVar;
        List list4;
        Collection k2;
        Iterable c2;
        l7l l7lVar;
        l7l l7lVar2;
        int i10 = i2;
        if (sq3Var instanceof m6l) {
            m6lVar = (m6l) sq3Var;
            int i11 = m6lVar.C;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                m6lVar.C = i11 - Integer.MIN_VALUE;
                Object obj2 = m6lVar.A;
                lu3Var = lu3.a;
                i3 = m6lVar.C;
                if (i3 != 0) {
                    f3 = 3.0f;
                    f4 = 32.0f;
                    f5 = 40.0f;
                    y6a.M(obj2);
                    List c3 = list.isEmpty() ? a.c(new Integer(0)) : list;
                    int c4 = llf.c(i10, 0, b.i(c3));
                    intValue = ((Number) c3.get(c4)).intValue();
                    int i12 = (int) (((((f2 - 40.0f) - 32.0f) - 3.0f) - 28.0f) / 44.0f);
                    if (i12 < 0) {
                        i12 = 0;
                    }
                    int c5 = llf.c(i12 + 1, 6, 30);
                    Integer num = new Integer(intValue);
                    Integer num2 = new Integer(c5);
                    list2 = list;
                    m6lVar.w = list2;
                    m6lVar.x = context;
                    m6lVar.y = (hoi) ct8Var;
                    m6lVar.r = f2;
                    m6lVar.s = i10;
                    m6lVar.t = c4;
                    m6lVar.u = intValue;
                    m6lVar.v = c5;
                    m6lVar.C = 1;
                    Object invoke = ct8Var.invoke(num, num2, m6lVar);
                    if (invoke != lu3Var) {
                        f6 = f2;
                        i4 = c5;
                        ct8Var2 = ct8Var;
                        i5 = c4;
                        obj = invoke;
                        context2 = context;
                    }
                    return lu3Var;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i7 = m6lVar.u;
                        k6lVar = m6lVar.z;
                        list4 = m6lVar.w;
                        y6a.M(obj2);
                        list4.getClass();
                        k6lVar.getClass();
                        xbb b2 = a.b();
                        b2.addAll(CollectionsKt.L0(list4, k6lVar.b));
                        b2.add(Integer.valueOf(i7));
                        if (k6lVar.d) {
                            b2.add(Integer.valueOf(k6lVar.a.size() + i7));
                        }
                        return new l6l(k6lVar, a.a(b2), i7);
                    }
                    i4 = m6lVar.v;
                    i9 = m6lVar.u;
                    i5 = m6lVar.t;
                    i8 = m6lVar.s;
                    f3 = 3.0f;
                    f6 = m6lVar.r;
                    f4 = 32.0f;
                    context3 = m6lVar.x;
                    f5 = 40.0f;
                    list3 = m6lVar.w;
                    y6a.M(obj2);
                    z7lVar2 = (z7l) obj2;
                    int i13 = i9;
                    i6 = i4;
                    i7 = i13;
                    ArrayList arrayList2 = z7lVar2.a;
                    ArrayList arrayList3 = new ArrayList();
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object r6lVar = next instanceof Event ? new r6l((Event) next) : next instanceof Stage ? new u6l((Stage) next) : null;
                        if (r6lVar != null) {
                            arrayList3.add(r6lVar);
                        }
                    }
                    boolean z2 = z7lVar2.b;
                    context3.getClass();
                    List<Map.Entry> S0 = CollectionsKt.S0(b(context3, arrayList3).entrySet());
                    S0.getClass();
                    float f7 = ((f6 - f5) - f4) - f3;
                    ArrayList arrayList4 = new ArrayList();
                    loop1: for (Map.Entry entry : S0) {
                        if (!((List) entry.getValue()).isEmpty()) {
                            if (p75.a(f7, 72.0f) < 0) {
                                break;
                            }
                            f7 -= 28.0f;
                            for (v6l v6lVar : (List) entry.getValue()) {
                                z = z2;
                                if (p75.a(f7, 44.0f) < 0) {
                                    break loop1;
                                }
                                arrayList4.add(v6lVar);
                                f7 -= 44.0f;
                                z2 = z;
                            }
                        }
                    }
                    z = z2;
                    k6l k6lVar2 = new k6l(arrayList4, i5, i5 <= 0, arrayList4.isEmpty() && (arrayList4.size() < arrayList3.size() || z));
                    n7l n7lVar = n7l.a;
                    m6lVar.w = list3;
                    m6lVar.x = null;
                    m6lVar.y = null;
                    m6lVar.z = k6lVar2;
                    m6lVar.r = f6;
                    m6lVar.s = i8;
                    m6lVar.t = i5;
                    m6lVar.u = i7;
                    m6lVar.v = i6;
                    m6lVar.C = 3;
                    ArrayList arrayList5 = new ArrayList();
                    it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        v6l v6lVar2 = (v6l) it2.next();
                        if (v6lVar2 instanceof r6l) {
                            Event event = ((r6l) v6lVar2).a;
                            List<Team> j2 = b.j(Event.getHomeTeam$default(event, null, 1, null), Event.getAwayTeam$default(event, null, 1, null));
                            k2 = new ArrayList();
                            for (Team team : j2) {
                                int type = team.getType();
                                if (type == 0) {
                                    c2 = a.c(new l7l(ljg.j(team.getId(), "team_"), pco.R(team.getId())));
                                } else if (type == 1) {
                                    c2 = a.c(new l7l(ljg.j(team.getId(), "player_"), pco.R(team.getId())));
                                } else if (type != 2) {
                                    c2 = km5.a;
                                } else {
                                    SubTeam subTeam1 = team.getSubTeam1();
                                    if (subTeam1 != null) {
                                        int id = subTeam1.getId();
                                        l7lVar = new l7l(ljg.j(id, "subteam_"), pco.R(id));
                                    } else {
                                        l7lVar = null;
                                    }
                                    SubTeam subTeam2 = team.getSubTeam2();
                                    if (subTeam2 != null) {
                                        int id2 = subTeam2.getId();
                                        l7lVar2 = new l7l(ljg.j(id2, "subteam_"), pco.R(id2));
                                    } else {
                                        l7lVar2 = null;
                                    }
                                    c2 = ph0.x(new l7l[]{l7lVar, l7lVar2});
                                }
                                o13.v(c2, k2);
                            }
                        } else {
                            if (!(v6lVar2 instanceof u6l)) {
                                zzl.b();
                                return null;
                            }
                            n7l n7lVar2 = n7l.a;
                            k2 = b.k(n7l.c(((u6l) v6lVar2).a));
                        }
                        o13.v(k2, arrayList5);
                    }
                    List S02 = CollectionsKt.S0(CollectionsKt.V0(arrayList5));
                    arrayList = new ArrayList();
                    for (Object obj3 : S02) {
                        if (n7l.b.get(((l7l) obj3).a) == null) {
                            arrayList.add(obj3);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        V = wba.V(1500L, new i3l(arrayList, context3, null, 5), m6lVar);
                        if (V != lu3.a) {
                            V = Unit.a;
                        }
                    } else {
                        V = Unit.a;
                    }
                    if (V != lu3Var) {
                        k6lVar = k6lVar2;
                        list4 = list3;
                        list4.getClass();
                        k6lVar.getClass();
                        xbb b22 = a.b();
                        b22.addAll(CollectionsKt.L0(list4, k6lVar.b));
                        b22.add(Integer.valueOf(i7));
                        if (k6lVar.d) {
                        }
                        return new l6l(k6lVar, a.a(b22), i7);
                    }
                    return lu3Var;
                }
                f3 = 3.0f;
                f4 = 32.0f;
                f5 = 40.0f;
                i4 = m6lVar.v;
                int i14 = m6lVar.u;
                i5 = m6lVar.t;
                int i15 = m6lVar.s;
                f6 = m6lVar.r;
                ct8Var2 = (ct8) m6lVar.y;
                context2 = m6lVar.x;
                list2 = m6lVar.w;
                y6a.M(obj2);
                intValue = i14;
                i10 = i15;
                obj = obj2;
                z7lVar = (z7l) obj;
                if (z7lVar.a.isEmpty() || intValue <= 0) {
                    int i16 = i10;
                    i6 = i4;
                    i7 = intValue;
                    z7lVar2 = z7lVar;
                    i8 = i16;
                    context3 = context2;
                    list3 = list2;
                    ArrayList arrayList22 = z7lVar2.a;
                    ArrayList arrayList32 = new ArrayList();
                    it = arrayList22.iterator();
                    while (it.hasNext()) {
                    }
                    boolean z22 = z7lVar2.b;
                    context3.getClass();
                    List<Map.Entry> S03 = CollectionsKt.S0(b(context3, arrayList32).entrySet());
                    S03.getClass();
                    float f72 = ((f6 - f5) - f4) - f3;
                    ArrayList arrayList42 = new ArrayList();
                    loop1: while (r7.hasNext()) {
                    }
                    z = z22;
                    k6l k6lVar22 = new k6l(arrayList42, i5, i5 <= 0, arrayList42.isEmpty() && (arrayList42.size() < arrayList32.size() || z));
                    n7l n7lVar3 = n7l.a;
                    m6lVar.w = list3;
                    m6lVar.x = null;
                    m6lVar.y = null;
                    m6lVar.z = k6lVar22;
                    m6lVar.r = f6;
                    m6lVar.s = i8;
                    m6lVar.t = i5;
                    m6lVar.u = i7;
                    m6lVar.v = i6;
                    m6lVar.C = 3;
                    ArrayList arrayList52 = new ArrayList();
                    it2 = arrayList42.iterator();
                    while (it2.hasNext()) {
                    }
                    List S022 = CollectionsKt.S0(CollectionsKt.V0(arrayList52));
                    arrayList = new ArrayList();
                    while (r1.hasNext()) {
                    }
                    if (arrayList.isEmpty()) {
                    }
                    if (V != lu3Var) {
                    }
                    return lu3Var;
                }
                Integer num3 = new Integer(0);
                Integer num4 = new Integer(i4);
                m6lVar.w = list2;
                m6lVar.x = context2;
                m6lVar.y = null;
                m6lVar.r = f6;
                m6lVar.s = i10;
                m6lVar.t = 0;
                m6lVar.u = 0;
                m6lVar.v = i4;
                m6lVar.C = 2;
                obj2 = ct8Var2.invoke(num3, num4, m6lVar);
                if (obj2 != lu3Var) {
                    i8 = i10;
                    context3 = context2;
                    list3 = list2;
                    i9 = 0;
                    i5 = 0;
                    z7lVar2 = (z7l) obj2;
                    int i132 = i9;
                    i6 = i4;
                    i7 = i132;
                    ArrayList arrayList222 = z7lVar2.a;
                    ArrayList arrayList322 = new ArrayList();
                    it = arrayList222.iterator();
                    while (it.hasNext()) {
                    }
                    boolean z222 = z7lVar2.b;
                    context3.getClass();
                    List<Map.Entry> S032 = CollectionsKt.S0(b(context3, arrayList322).entrySet());
                    S032.getClass();
                    float f722 = ((f6 - f5) - f4) - f3;
                    ArrayList arrayList422 = new ArrayList();
                    loop1: while (r7.hasNext()) {
                    }
                    z = z222;
                    k6l k6lVar222 = new k6l(arrayList422, i5, i5 <= 0, arrayList422.isEmpty() && (arrayList422.size() < arrayList322.size() || z));
                    n7l n7lVar32 = n7l.a;
                    m6lVar.w = list3;
                    m6lVar.x = null;
                    m6lVar.y = null;
                    m6lVar.z = k6lVar222;
                    m6lVar.r = f6;
                    m6lVar.s = i8;
                    m6lVar.t = i5;
                    m6lVar.u = i7;
                    m6lVar.v = i6;
                    m6lVar.C = 3;
                    ArrayList arrayList522 = new ArrayList();
                    it2 = arrayList422.iterator();
                    while (it2.hasNext()) {
                    }
                    List S0222 = CollectionsKt.S0(CollectionsKt.V0(arrayList522));
                    arrayList = new ArrayList();
                    while (r1.hasNext()) {
                    }
                    if (arrayList.isEmpty()) {
                    }
                    if (V != lu3Var) {
                    }
                }
                return lu3Var;
            }
        }
        m6lVar = new m6l(this, sq3Var);
        Object obj22 = m6lVar.A;
        lu3Var = lu3.a;
        i3 = m6lVar.C;
        if (i3 != 0) {
        }
        z7lVar = (z7l) obj;
        if (z7lVar.a.isEmpty()) {
        }
        int i162 = i10;
        i6 = i4;
        i7 = intValue;
        z7lVar2 = z7lVar;
        i8 = i162;
        context3 = context2;
        list3 = list2;
        ArrayList arrayList2222 = z7lVar2.a;
        ArrayList arrayList3222 = new ArrayList();
        it = arrayList2222.iterator();
        while (it.hasNext()) {
        }
        boolean z2222 = z7lVar2.b;
        context3.getClass();
        List<Map.Entry> S0322 = CollectionsKt.S0(b(context3, arrayList3222).entrySet());
        S0322.getClass();
        float f7222 = ((f6 - f5) - f4) - f3;
        ArrayList arrayList4222 = new ArrayList();
        loop1: while (r7.hasNext()) {
        }
        z = z2222;
        k6l k6lVar2222 = new k6l(arrayList4222, i5, i5 <= 0, arrayList4222.isEmpty() && (arrayList4222.size() < arrayList3222.size() || z));
        n7l n7lVar322 = n7l.a;
        m6lVar.w = list3;
        m6lVar.x = null;
        m6lVar.y = null;
        m6lVar.z = k6lVar2222;
        m6lVar.r = f6;
        m6lVar.s = i8;
        m6lVar.t = i5;
        m6lVar.u = i7;
        m6lVar.v = i6;
        m6lVar.C = 3;
        ArrayList arrayList5222 = new ArrayList();
        it2 = arrayList4222.iterator();
        while (it2.hasNext()) {
        }
        List S02222 = CollectionsKt.S0(CollectionsKt.V0(arrayList5222));
        arrayList = new ArrayList();
        while (r1.hasNext()) {
        }
        if (arrayList.isEmpty()) {
        }
        if (V != lu3Var) {
        }
        return lu3Var;
    }
}
