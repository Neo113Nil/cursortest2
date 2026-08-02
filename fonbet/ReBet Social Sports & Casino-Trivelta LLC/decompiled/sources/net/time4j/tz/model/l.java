package net.time4j.tz.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import li.AbstractC5468b;
import li.AbstractC5469c;
import li.InterfaceC5467a;
import li.InterfaceC5473g;
import net.time4j.tz.m;
import net.time4j.tz.p;
import net.time4j.tz.q;
import oi.EnumC5900A;

/* loaded from: classes5.dex */
public abstract class l implements m, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final String f58399a = System.getProperty("line.separator");

    public static long f(int i10) {
        return (System.currentTimeMillis() / 1000) + ((long) (i10 * 3.1556952E7d));
    }

    public static m g(p pVar, List list, List list2, boolean z10, boolean z11) {
        List list3;
        List list4;
        if (z10) {
            ArrayList arrayList = new ArrayList(list);
            ArrayList arrayList2 = new ArrayList(list2);
            Collections.sort(arrayList);
            Collections.sort(arrayList2, k.INSTANCE);
            list4 = arrayList2;
            list3 = arrayList;
        } else {
            list3 = list;
            list4 = list2;
        }
        int size = list3.size();
        if (size == 0) {
            return list4.isEmpty() ? new e(pVar) : new j(pVar, list4, false);
        }
        p p10 = p.p(((q) list3.get(0)).f());
        if (z11 && !pVar.equals(p10)) {
            throw new IllegalArgumentException("Initial offset " + pVar + " not equal to previous offset of first transition: " + p10);
        }
        if (list4.isEmpty()) {
            return new a(list3, false, z11);
        }
        q qVar = (q) list3.get(size - 1);
        long e10 = qVar.e() + 1;
        long f10 = f(1);
        if (e10 < f10) {
            List list5 = list4;
            list4 = list5;
            list3.addAll(j.s(qVar, list5, e10, f10));
        }
        return new b(size, list3, list4, false, z11);
    }

    public static List h(int i10) {
        return Collections.singletonList(p.p(i10));
    }

    public static List i(int i10, int i11) {
        p p10 = p.p(i10);
        p p11 = p.p(i11);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(p10);
        arrayList.add(p11);
        return Collections.unmodifiableList(arrayList);
    }

    public static long j(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        return AbstractC5469c.i(EnumC5900A.UNIX.i(AbstractC5468b.i(interfaceC5467a.n(), interfaceC5467a.o(), interfaceC5467a.p()), EnumC5900A.MODIFIED_JULIAN_DATE), 86400L) + (interfaceC5473g.q() * 3600) + (interfaceC5473g.l() * 60) + interfaceC5473g.i();
    }

    @Override // net.time4j.tz.m
    public boolean isEmpty() {
        return false;
    }
}
