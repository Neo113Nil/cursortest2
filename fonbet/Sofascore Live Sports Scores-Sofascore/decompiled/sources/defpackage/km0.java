package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class km0 {
    public static final km0 f = new km0(km5.a, null);
    public final List a;
    public final Double b;
    public final int c;
    public final int d;
    public final List e;

    public km0(List list, Double d) {
        List list2;
        list.getClass();
        this.a = list;
        this.b = d;
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((jm0) it.next()).a.size();
        }
        this.c = i2;
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            i += ((jm0) it2.next()).b;
        }
        this.d = i;
        List list3 = this.a;
        ArrayList arrayList = new ArrayList(k13.r(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList.add(Integer.valueOf(((jm0) it3.next()).b));
        }
        List T = CollectionsKt.T(arrayList);
        Iterator it4 = T.iterator();
        if (it4.hasNext()) {
            Object next = it4.next();
            ArrayList arrayList2 = new ArrayList(k13.r(T, 10));
            arrayList2.add(next);
            while (it4.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() + ((Number) it4.next()).intValue());
                arrayList2.add(next);
            }
            list2 = arrayList2;
        } else {
            list2 = km5.a;
        }
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km0)) {
            return false;
        }
        km0 km0Var = (km0) obj;
        return Intrinsics.c(this.a, km0Var.a) && Intrinsics.c(this.b, km0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Double d = this.b;
        return hashCode + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        return "AttackMomentumGraphConfig(periods=" + this.a + ", lastMinute=" + this.b + ")";
    }
}
