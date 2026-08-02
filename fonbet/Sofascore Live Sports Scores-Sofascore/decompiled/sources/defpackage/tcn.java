package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class tcn {
    public static final idn a;

    static {
        int i = o7n.a;
        a = new idn();
    }

    public static int A(int i, Object obj, pcn pcnVar) {
        int i2 = i << 3;
        if (!(obj instanceof san)) {
            int r = r8n.r(i2);
            int c = ((k7n) obj).c(pcnVar);
            return x5n.x(c, c, r);
        }
        san sanVar = (san) obj;
        int r2 = r8n.r(i2);
        int length = sanVar.b != null ? sanVar.b.c.length : sanVar.a != null ? ((y9n) sanVar.a).e() : 0;
        return x5n.x(length, length, r2);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(Object obj, Object obj2) {
        y9n y9nVar = (y9n) obj;
        fdn fdnVar = y9nVar.zzc;
        fdn fdnVar2 = ((y9n) obj2).zzc;
        fdn fdnVar3 = fdn.f;
        if (!fdnVar3.equals(fdnVar2)) {
            if (fdnVar3.equals(fdnVar)) {
                int i = fdnVar.a + fdnVar2.a;
                int[] copyOf = Arrays.copyOf(fdnVar.b, i);
                System.arraycopy(fdnVar2.b, 0, copyOf, fdnVar.a, fdnVar2.a);
                Object[] copyOf2 = Arrays.copyOf(fdnVar.c, i);
                System.arraycopy(fdnVar2.c, 0, copyOf2, fdnVar.a, fdnVar2.a);
                fdnVar = new fdn(i, copyOf, copyOf2, true);
            } else {
                fdnVar.getClass();
                if (!fdnVar2.equals(fdnVar3)) {
                    if (!fdnVar.e) {
                        a70.i();
                        return;
                    }
                    int i2 = fdnVar.a + fdnVar2.a;
                    fdnVar.e(i2);
                    System.arraycopy(fdnVar2.b, 0, fdnVar.b, fdnVar.a, fdnVar2.a);
                    System.arraycopy(fdnVar2.c, 0, fdnVar.c, fdnVar.a, fdnVar2.a);
                    fdnVar.a = i2;
                }
            }
        }
        y9nVar.zzc = fdnVar;
    }

    public static Object c(Object obj, int i, ian ianVar, can canVar, Object obj2, edn ednVar) {
        if (canVar == null) {
            return obj2;
        }
        if (ianVar == null) {
            Iterator it = ianVar.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!canVar.a(intValue)) {
                    if (obj2 == null) {
                        obj2 = ednVar.h(obj);
                    }
                    ednVar.a(i, intValue, obj2);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = ianVar.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) ianVar.get(i3);
            int intValue2 = num.intValue();
            if (canVar.a(intValue2)) {
                if (i3 != i2) {
                    ianVar.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    obj2 = ednVar.h(obj);
                }
                ednVar.a(i, intValue2, obj2);
            }
        }
        if (i2 != size) {
            ianVar.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void d(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r8n r8nVar = (r8n) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof u8n)) {
            if (!z) {
                while (i2 < list.size()) {
                    r8nVar.f(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            r8nVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                i3 += 8;
            }
            r8nVar.n(i3);
            while (i2 < list.size()) {
                r8nVar.q(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        u8n u8nVar = (u8n) list;
        if (!z) {
            while (i2 < u8nVar.c) {
                u8nVar.e(i2);
                r8nVar.f(i, Double.doubleToRawLongBits(u8nVar.b[i2]));
                i2++;
            }
            return;
        }
        r8nVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < u8nVar.c; i6++) {
            u8nVar.e(i6);
            double d = u8nVar.b[i6];
            i5 += 8;
        }
        r8nVar.n(i5);
        while (i2 < u8nVar.c) {
            u8nVar.e(i2);
            r8nVar.q(Double.doubleToRawLongBits(u8nVar.b[i2]));
            i2++;
        }
    }

    public static void e(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r8n r8nVar = (r8n) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof l9n)) {
            if (!z) {
                while (i2 < list.size()) {
                    r8nVar.d(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            r8nVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            r8nVar.n(i3);
            while (i2 < list.size()) {
                r8nVar.o(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        l9n l9nVar = (l9n) list;
        if (!z) {
            while (i2 < l9nVar.c) {
                l9nVar.e(i2);
                r8nVar.d(i, Float.floatToRawIntBits(l9nVar.b[i2]));
                i2++;
            }
            return;
        }
        r8nVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < l9nVar.c; i6++) {
            l9nVar.e(i6);
            float f = l9nVar.b[i6];
            i5 += 4;
        }
        r8nVar.n(i5);
        while (i2 < l9nVar.c) {
            l9nVar.e(i2);
            r8nVar.o(Float.floatToRawIntBits(l9nVar.b[i2]));
            i2++;
        }
    }

    public static void f(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r8n r8nVar = (r8n) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof zan)) {
            if (!z) {
                while (i2 < list.size()) {
                    r8nVar.e(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            r8nVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r8n.s(((Long) list.get(i4)).longValue());
            }
            r8nVar.n(i3);
            while (i2 < list.size()) {
                r8nVar.p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zan zanVar = (zan) list;
        if (!z) {
            while (i2 < zanVar.c) {
                r8nVar.e(i, zanVar.d(i2));
                i2++;
            }
            return;
        }
        r8nVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zanVar.c; i6++) {
            i5 += r8n.s(zanVar.d(i6));
        }
        r8nVar.n(i5);
        while (i2 < zanVar.c) {
            r8nVar.p(zanVar.d(i2));
            i2++;
        }
    }

    public static void g(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r8n r8nVar = (r8n) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof zan)) {
            if (!z) {
                while (i2 < list.size()) {
                    r8nVar.e(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            r8nVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r8n.s(((Long) list.get(i4)).longValue());
            }
            r8nVar.n(i3);
            while (i2 < list.size()) {
                r8nVar.p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zan zanVar = (zan) list;
        if (!z) {
            while (i2 < zanVar.c) {
                r8nVar.e(i, zanVar.d(i2));
                i2++;
            }
            return;
        }
        r8nVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zanVar.c; i6++) {
            i5 += r8n.s(zanVar.d(i6));
        }
        r8nVar.n(i5);
        while (i2 < zanVar.c) {
            r8nVar.p(zanVar.d(i2));
            i2++;
        }
    }

    public static void h(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r8n r8nVar = (r8n) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof zan)) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    r8nVar.e(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            r8nVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += r8n.s((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            r8nVar.n(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                r8nVar.p((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        zan zanVar = (zan) list;
        if (!z) {
            while (i2 < zanVar.c) {
                long d = zanVar.d(i2);
                r8nVar.e(i, (d >> 63) ^ (d + d));
                i2++;
            }
            return;
        }
        r8nVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zanVar.c; i6++) {
            long d2 = zanVar.d(i6);
            i5 += r8n.s((d2 >> 63) ^ (d2 + d2));
        }
        r8nVar.n(i5);
        while (i2 < zanVar.c) {
            long d3 = zanVar.d(i2);
            r8nVar.p((d3 >> 63) ^ (d3 + d3));
            i2++;
        }
    }

    public static void i(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r8n r8nVar = (r8n) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof zan)) {
            if (!z) {
                while (i2 < list.size()) {
                    r8nVar.f(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            r8nVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            r8nVar.n(i3);
            while (i2 < list.size()) {
                r8nVar.q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zan zanVar = (zan) list;
        if (!z) {
            while (i2 < zanVar.c) {
                r8nVar.f(i, zanVar.d(i2));
                i2++;
            }
            return;
        }
        r8nVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zanVar.c; i6++) {
            zanVar.d(i6);
            i5 += 8;
        }
        r8nVar.n(i5);
        while (i2 < zanVar.c) {
            r8nVar.q(zanVar.d(i2));
            i2++;
        }
    }

    public static void j(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r8n r8nVar = (r8n) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof zan)) {
            if (!z) {
                while (i2 < list.size()) {
                    r8nVar.f(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            r8nVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            r8nVar.n(i3);
            while (i2 < list.size()) {
                r8nVar.q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zan zanVar = (zan) list;
        if (!z) {
            while (i2 < zanVar.c) {
                r8nVar.f(i, zanVar.d(i2));
                i2++;
            }
            return;
        }
        r8nVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zanVar.c; i6++) {
            zanVar.d(i6);
            i5 += 8;
        }
        r8nVar.n(i5);
        while (i2 < zanVar.c) {
            r8nVar.q(zanVar.d(i2));
            i2++;
        }
    }

    public static void k(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r8n r8nVar = (r8n) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof aan)) {
            if (!z) {
                while (i2 < list.size()) {
                    r8nVar.b(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            r8nVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r8n.s(((Integer) list.get(i4)).intValue());
            }
            r8nVar.n(i3);
            while (i2 < list.size()) {
                r8nVar.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        aan aanVar = (aan) list;
        if (!z) {
            while (i2 < aanVar.c) {
                r8nVar.b(i, aanVar.zzf(i2));
                i2++;
            }
            return;
        }
        r8nVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < aanVar.c; i6++) {
            i5 += r8n.s(aanVar.zzf(i6));
        }
        r8nVar.n(i5);
        while (i2 < aanVar.c) {
            r8nVar.m(aanVar.zzf(i2));
            i2++;
        }
    }

    public static void l(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r8n r8nVar = (r8n) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof aan)) {
            if (!z) {
                while (i2 < list.size()) {
                    r8nVar.c(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            r8nVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r8n.r(((Integer) list.get(i4)).intValue());
            }
            r8nVar.n(i3);
            while (i2 < list.size()) {
                r8nVar.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        aan aanVar = (aan) list;
        if (!z) {
            while (i2 < aanVar.c) {
                r8nVar.c(i, aanVar.zzf(i2));
                i2++;
            }
            return;
        }
        r8nVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < aanVar.c; i6++) {
            i5 += r8n.r(aanVar.zzf(i6));
        }
        r8nVar.n(i5);
        while (i2 < aanVar.c) {
            r8nVar.n(aanVar.zzf(i2));
            i2++;
        }
    }

    public static void m(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r8n r8nVar = (r8n) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof aan)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    r8nVar.c(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            r8nVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += r8n.r((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            r8nVar.n(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                r8nVar.n((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        aan aanVar = (aan) list;
        if (!z) {
            while (i2 < aanVar.c) {
                int zzf = aanVar.zzf(i2);
                r8nVar.c(i, (zzf >> 31) ^ (zzf + zzf));
                i2++;
            }
            return;
        }
        r8nVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < aanVar.c; i6++) {
            int zzf2 = aanVar.zzf(i6);
            i5 += r8n.r((zzf2 >> 31) ^ (zzf2 + zzf2));
        }
        r8nVar.n(i5);
        while (i2 < aanVar.c) {
            int zzf3 = aanVar.zzf(i2);
            r8nVar.n((zzf3 >> 31) ^ (zzf3 + zzf3));
            i2++;
        }
    }

    public static void n(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r8n r8nVar = (r8n) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof aan)) {
            if (!z) {
                while (i2 < list.size()) {
                    r8nVar.d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            r8nVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            r8nVar.n(i3);
            while (i2 < list.size()) {
                r8nVar.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        aan aanVar = (aan) list;
        if (!z) {
            while (i2 < aanVar.c) {
                r8nVar.d(i, aanVar.zzf(i2));
                i2++;
            }
            return;
        }
        r8nVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < aanVar.c; i6++) {
            aanVar.zzf(i6);
            i5 += 4;
        }
        r8nVar.n(i5);
        while (i2 < aanVar.c) {
            r8nVar.o(aanVar.zzf(i2));
            i2++;
        }
    }

    public static void o(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r8n r8nVar = (r8n) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof aan)) {
            if (!z) {
                while (i2 < list.size()) {
                    r8nVar.d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            r8nVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            r8nVar.n(i3);
            while (i2 < list.size()) {
                r8nVar.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        aan aanVar = (aan) list;
        if (!z) {
            while (i2 < aanVar.c) {
                r8nVar.d(i, aanVar.zzf(i2));
                i2++;
            }
            return;
        }
        r8nVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < aanVar.c; i6++) {
            aanVar.zzf(i6);
            i5 += 4;
        }
        r8nVar.n(i5);
        while (i2 < aanVar.c) {
            r8nVar.o(aanVar.zzf(i2));
            i2++;
        }
    }

    public static void p(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r8n r8nVar = (r8n) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof aan)) {
            if (!z) {
                while (i2 < list.size()) {
                    r8nVar.b(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            r8nVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r8n.s(((Integer) list.get(i4)).intValue());
            }
            r8nVar.n(i3);
            while (i2 < list.size()) {
                r8nVar.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        aan aanVar = (aan) list;
        if (!z) {
            while (i2 < aanVar.c) {
                r8nVar.b(i, aanVar.zzf(i2));
                i2++;
            }
            return;
        }
        r8nVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < aanVar.c; i6++) {
            i5 += r8n.s(aanVar.zzf(i6));
        }
        r8nVar.n(i5);
        while (i2 < aanVar.c) {
            r8nVar.m(aanVar.zzf(i2));
            i2++;
        }
    }

    public static void q(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r8n r8nVar = (r8n) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof s7n)) {
            if (!z) {
                while (i2 < list.size()) {
                    r8nVar.g(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            r8nVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                i3++;
            }
            r8nVar.n(i3);
            while (i2 < list.size()) {
                r8nVar.l(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        s7n s7nVar = (s7n) list;
        if (!z) {
            while (i2 < s7nVar.c) {
                s7nVar.h(i2);
                r8nVar.g(i, s7nVar.b[i2]);
                i2++;
            }
            return;
        }
        r8nVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < s7nVar.c; i6++) {
            s7nVar.h(i6);
            boolean z2 = s7nVar.b[i6];
            i5++;
        }
        r8nVar.n(i5);
        while (i2 < s7nVar.c) {
            s7nVar.h(i2);
            r8nVar.l(s7nVar.b[i2] ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zan)) {
            int i2 = 0;
            while (i < size) {
                i2 += r8n.s(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zan zanVar = (zan) list;
        int i3 = 0;
        while (i < size) {
            i3 += r8n.s(zanVar.d(i));
            i++;
        }
        return i3;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zan)) {
            int i2 = 0;
            while (i < size) {
                i2 += r8n.s(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zan zanVar = (zan) list;
        int i3 = 0;
        while (i < size) {
            i3 += r8n.s(zanVar.d(i));
            i++;
        }
        return i3;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zan)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += r8n.s((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        zan zanVar = (zan) list;
        int i3 = 0;
        while (i < size) {
            long d = zanVar.d(i);
            i3 += r8n.s((d >> 63) ^ (d + d));
            i++;
        }
        return i3;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof aan)) {
            int i2 = 0;
            while (i < size) {
                i2 += r8n.s(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        aan aanVar = (aan) list;
        int i3 = 0;
        while (i < size) {
            i3 += r8n.s(aanVar.zzf(i));
            i++;
        }
        return i3;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof aan)) {
            int i2 = 0;
            while (i < size) {
                i2 += r8n.s(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        aan aanVar = (aan) list;
        int i3 = 0;
        while (i < size) {
            i3 += r8n.s(aanVar.zzf(i));
            i++;
        }
        return i3;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof aan)) {
            int i2 = 0;
            while (i < size) {
                i2 += r8n.r(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        aan aanVar = (aan) list;
        int i3 = 0;
        while (i < size) {
            i3 += r8n.r(aanVar.zzf(i));
            i++;
        }
        return i3;
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof aan)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += r8n.r((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        aan aanVar = (aan) list;
        int i3 = 0;
        while (i < size) {
            int zzf = aanVar.zzf(i);
            i3 += r8n.r((zzf >> 31) ^ (zzf + zzf));
            i++;
        }
        return i3;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r8n.r(i << 3) + 4) * size;
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r8n.r(i << 3) + 8) * size;
    }
}
