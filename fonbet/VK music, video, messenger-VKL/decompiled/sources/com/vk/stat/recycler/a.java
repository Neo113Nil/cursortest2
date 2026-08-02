package com.vk.stat.recycler;

import com.vk.stat.recycler.Measurement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.c5g;
import xsna.e43;
import xsna.j5g;
import xsna.vu5;

/* compiled from: Accumulator.kt */
/* loaded from: classes5.dex */
public final class a {
    public final int a;
    public final Measurement.Type b;
    public final String c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();

    /* compiled from: Accumulator.kt */
    /* renamed from: com.vk.stat.recycler.a$a, reason: collision with other inner class name */
    public static final class C1787a {
        public final int a;
        public final long b;
        public final long c;
        public final long d;
        public final long e;

        public C1787a(long j, long j2, int i, long j3, long j4) {
            this.a = i;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1787a)) {
                return false;
            }
            C1787a c1787a = (C1787a) obj;
            return this.a == c1787a.a && this.b == c1787a.b && this.c == c1787a.c && this.d == c1787a.d && this.e == c1787a.e;
        }

        public final int hashCode() {
            return Long.hashCode(this.e) + bh10.a(bh10.a(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(count=");
            sb.append(this.a);
            sb.append(", avg=");
            sb.append(this.b);
            sb.append(", median=");
            sb.append(this.c);
            sb.append(", percentile75=");
            sb.append(this.d);
            sb.append(", percentile90=");
            return vu5.a(')', this.e, sb);
        }
    }

    public a(int i, Measurement.Type type, String str) {
        this.a = i;
        this.b = type;
        this.c = str;
    }

    public static C1787a a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        List list2 = list;
        Iterator it = list2.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((Measurement) it.next()).c;
        }
        long size = j / list.size();
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((Measurement) it2.next()).c));
        }
        List C0 = j5g.C0(arrayList);
        int size2 = list.size() % 2 == 0 ? (list.size() / 2) + 1 : list.size() / 2;
        int floor = (int) Math.floor(list.size() * 0.75d);
        int floor2 = (int) Math.floor(list.size() * 0.9d);
        int size3 = list.size();
        int h = e43.h(list);
        if (size2 > h) {
            size2 = h;
        }
        long longValue = ((Number) C0.get(size2)).longValue();
        int h2 = e43.h(list);
        if (floor > h2) {
            floor = h2;
        }
        long longValue2 = ((Number) C0.get(floor)).longValue();
        int h3 = e43.h(list);
        if (floor2 > h3) {
            floor2 = h3;
        }
        C1787a c1787a = new C1787a(size, longValue, size3, longValue2, ((Number) C0.get(floor2)).longValue());
        list.clear();
        return c1787a;
    }
}
