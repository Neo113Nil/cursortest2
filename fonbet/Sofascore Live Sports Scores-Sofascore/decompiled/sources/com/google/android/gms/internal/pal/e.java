package com.google.android.gms.internal.pal;

import defpackage.e3c;
import defpackage.h8n;
import defpackage.hdn;
import defpackage.kcn;
import defpackage.r7n;
import defpackage.v9n;
import defpackage.x5n;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class e {
    public static final Class a;
    public static final hdn b;
    public static final hdn c;
    public static final hdn d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = u(false);
        c = u(true);
        d = new hdn();
    }

    public static int A(List list) {
        return list.size() * 8;
    }

    public static int B(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v9n)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzach.d(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        v9n v9nVar = (v9n) list;
        int i3 = 0;
        while (i < size) {
            v9nVar.h(i);
            i3 += zzach.d(v9nVar.b[i]);
            i++;
        }
        return i3;
    }

    public static int C(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzach.b(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int D(int i, Object obj, kcn kcnVar) {
        if (obj instanceof zzadl) {
            zzadl zzadlVar = (zzadl) obj;
            int a2 = zzach.a(i << 3);
            int length = zzadlVar.b != null ? ((r7n) zzadlVar.b).c.length : zzadlVar.a != null ? zzadlVar.a.k() : 0;
            return x5n.t(length, length, a2);
        }
        int a3 = zzach.a(i << 3);
        zzabi zzabiVar = (zzabi) ((zzaef) obj);
        int b2 = zzabiVar.b();
        if (b2 == -1) {
            b2 = kcnVar.zza(zzabiVar);
            zzabiVar.c(b2);
        }
        return x5n.t(b2, b2, a3);
    }

    public static int E(int i, List list, kcn kcnVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int f = zzach.f(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzadl) {
                zzadl zzadlVar = (zzadl) obj;
                int length = zzadlVar.b != null ? ((r7n) zzadlVar.b).c.length : zzadlVar.a != null ? zzadlVar.a.k() : 0;
                f = x5n.t(length, length, f);
            } else {
                zzabi zzabiVar = (zzabi) ((zzaef) obj);
                int b2 = zzabiVar.b();
                if (b2 == -1) {
                    b2 = kcnVar.zza(zzabiVar);
                    zzabiVar.c(b2);
                }
                f = x5n.t(b2, b2, f);
            }
        }
        return f;
    }

    public static int F(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v9n)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zzach.a((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        v9n v9nVar = (v9n) list;
        int i3 = 0;
        while (i < size) {
            v9nVar.h(i);
            int i4 = v9nVar.b[i];
            i3 += zzach.a((i4 >> 31) ^ (i4 + i4));
            i++;
        }
        return i3;
    }

    public static int G(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += zzach.b((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    public static int H(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int f = zzach.f(i) * size;
        if (!(list instanceof zzadn)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzaby) {
                    int m = ((zzaby) obj).m();
                    f = x5n.t(m, m, f);
                } else {
                    f = zzach.e((String) obj) + f;
                }
                i2++;
            }
            return f;
        }
        zzadn zzadnVar = (zzadn) list;
        while (i2 < size) {
            Object zzf = zzadnVar.zzf(i2);
            if (zzf instanceof zzaby) {
                int m2 = ((zzaby) zzf).m();
                f = x5n.t(m2, m2, f);
            } else {
                f = zzach.e((String) zzf) + f;
            }
            i2++;
        }
        return f;
    }

    public static int I(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v9n)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzach.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        v9n v9nVar = (v9n) list;
        int i3 = 0;
        while (i < size) {
            v9nVar.h(i);
            i3 += zzach.a(v9nVar.b[i]);
            i++;
        }
        return i3;
    }

    public static int J(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzach.b(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static Object a(int i, List list, zzadd zzaddVar, Object obj, hdn hdnVar) {
        if (zzaddVar == null) {
            return obj;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!zzaddVar.a(intValue)) {
                    obj = b(i, intValue, obj, hdnVar);
                    it.remove();
                }
            }
            return obj;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int intValue2 = num.intValue();
            if (zzaddVar.a(intValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj = b(i, intValue2, obj, hdnVar);
            }
        }
        if (i2 == size) {
            return obj;
        }
        list.subList(i2, size).clear();
        return obj;
    }

    public static Object b(int i, int i2, Object obj, hdn hdnVar) {
        if (obj == null) {
            hdnVar.getClass();
            obj = zzafj.b();
        }
        hdnVar.getClass();
        ((zzafj) obj).c(i << 3, Long.valueOf(i2));
        return obj;
    }

    public static void c(hdn hdnVar, zzacz zzaczVar, Object obj) {
        hdnVar.getClass();
        zzafj zzafjVar = zzaczVar.zzc;
        zzafj zzafjVar2 = ((zzacz) obj).zzc;
        if (!zzafjVar2.equals(zzafj.f)) {
            int i = zzafjVar.a + zzafjVar2.a;
            int[] copyOf = Arrays.copyOf(zzafjVar.b, i);
            System.arraycopy(zzafjVar2.b, 0, copyOf, zzafjVar.a, zzafjVar2.a);
            Object[] copyOf2 = Arrays.copyOf(zzafjVar.c, i);
            System.arraycopy(zzafjVar2.c, 0, copyOf2, zzafjVar.a, zzafjVar2.a);
            zzafjVar = new zzafj(i, copyOf, copyOf2, true);
        }
        zzaczVar.zzc = zzafjVar;
    }

    public static void d(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8n h8nVar = (h8n) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h8nVar.i(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        h8nVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        h8nVar.t(i3);
        while (i2 < list.size()) {
            h8nVar.g(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void e(int i, List list, e3c e3cVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3cVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((h8n) e3cVar.b).j(i, (zzaby) list.get(i2));
        }
    }

    public static void f(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8n h8nVar = (h8n) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h8nVar.m(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        h8nVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        h8nVar.t(i3);
        while (i2 < list.size()) {
            h8nVar.n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void g(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8n h8nVar = (h8n) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h8nVar.o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h8nVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzach.d(((Integer) list.get(i4)).intValue());
        }
        h8nVar.t(i3);
        while (i2 < list.size()) {
            h8nVar.p(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void h(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8n h8nVar = (h8n) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h8nVar.k(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h8nVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        h8nVar.t(i3);
        while (i2 < list.size()) {
            h8nVar.l(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void i(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8n h8nVar = (h8n) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h8nVar.m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        h8nVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        h8nVar.t(i3);
        while (i2 < list.size()) {
            h8nVar.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void j(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8n h8nVar = (h8n) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h8nVar.k(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        h8nVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        h8nVar.t(i3);
        while (i2 < list.size()) {
            h8nVar.l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void k(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8n h8nVar = (h8n) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h8nVar.o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h8nVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzach.d(((Integer) list.get(i4)).intValue());
        }
        h8nVar.t(i3);
        while (i2 < list.size()) {
            h8nVar.p(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void l(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8n h8nVar = (h8n) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h8nVar.u(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        h8nVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzach.b(((Long) list.get(i4)).longValue());
        }
        h8nVar.t(i3);
        while (i2 < list.size()) {
            h8nVar.v(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void m(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8n h8nVar = (h8n) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h8nVar.k(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h8nVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        h8nVar.t(i3);
        while (i2 < list.size()) {
            h8nVar.l(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void n(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8n h8nVar = (h8n) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h8nVar.m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        h8nVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        h8nVar.t(i3);
        while (i2 < list.size()) {
            h8nVar.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void o(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8n h8nVar = (h8n) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                h8nVar.s(i, (intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
            return;
        }
        h8nVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += zzach.a((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        h8nVar.t(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            h8nVar.t((intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    public static void p(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8n h8nVar = (h8n) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                h8nVar.u(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        h8nVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += zzach.b((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        h8nVar.t(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            h8nVar.v((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    public static void q(int i, List list, e3c e3cVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8n h8nVar = (h8n) e3cVar.b;
        int i2 = 0;
        if (!(list instanceof zzadn)) {
            while (i2 < list.size()) {
                h8nVar.q(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzadn zzadnVar = (zzadn) list;
        while (i2 < list.size()) {
            Object zzf = zzadnVar.zzf(i2);
            if (zzf instanceof String) {
                h8nVar.q(i, (String) zzf);
            } else {
                h8nVar.j(i, (zzaby) zzf);
            }
            i2++;
        }
    }

    public static void r(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8n h8nVar = (h8n) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h8nVar.s(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h8nVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzach.a(((Integer) list.get(i4)).intValue());
        }
        h8nVar.t(i3);
        while (i2 < list.size()) {
            h8nVar.t(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void s(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8n h8nVar = (h8n) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h8nVar.u(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        h8nVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzach.b(((Long) list.get(i4)).longValue());
        }
        h8nVar.t(i3);
        while (i2 < list.size()) {
            h8nVar.v(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean t(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static hdn u(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (hdn) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int f = zzach.f(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int m = ((zzaby) list.get(i2)).m();
            f = x5n.t(m, m, f);
        }
        return f;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v9n)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzach.d(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        v9n v9nVar = (v9n) list;
        int i3 = 0;
        while (i < size) {
            v9nVar.h(i);
            i3 += zzach.d(v9nVar.b[i]);
            i++;
        }
        return i3;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.a(i << 3) + 4) * size;
    }

    public static int y(List list) {
        return list.size() * 4;
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.a(i << 3) + 8) * size;
    }
}
