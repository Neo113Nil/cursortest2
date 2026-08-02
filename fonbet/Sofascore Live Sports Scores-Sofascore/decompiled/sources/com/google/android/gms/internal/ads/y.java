package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.b1l;
import defpackage.cqo;
import defpackage.dpo;
import defpackage.wpo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class y {
    public static final z a;

    static {
        int i = dpo.a;
        a = new z();
    }

    public static int A(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wpo)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zzier.b((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        wpo wpoVar = (wpo) list;
        int i3 = 0;
        while (i < size) {
            int zzf = wpoVar.zzf(i);
            i3 += zzier.b((zzf >> 31) ^ (zzf + zzf));
            i++;
        }
        return i3;
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzier.b(i << 3) + 4) * size;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzier.b(i << 3) + 8) * size;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void d(Object obj, Object obj2) {
        zzifm zzifmVar = (zzifm) obj;
        zziib zziibVar = zzifmVar.zzt;
        zziib zziibVar2 = ((zzifm) obj2).zzt;
        zziib zziibVar3 = zziib.f;
        if (!zziibVar3.equals(zziibVar2)) {
            if (zziibVar3.equals(zziibVar)) {
                int i = zziibVar.a + zziibVar2.a;
                int[] copyOf = Arrays.copyOf(zziibVar.b, i);
                System.arraycopy(zziibVar2.b, 0, copyOf, zziibVar.a, zziibVar2.a);
                Object[] copyOf2 = Arrays.copyOf(zziibVar.c, i);
                System.arraycopy(zziibVar2.c, 0, copyOf2, zziibVar.a, zziibVar2.a);
                zziibVar = new zziib(i, copyOf, copyOf2, true);
            } else {
                zziibVar.getClass();
                if (!zziibVar2.equals(zziibVar3)) {
                    if (!zziibVar.e) {
                        a70.i();
                        return;
                    }
                    int i2 = zziibVar.a + zziibVar2.a;
                    zziibVar.e(i2);
                    System.arraycopy(zziibVar2.b, 0, zziibVar.b, zziibVar.a, zziibVar2.a);
                    System.arraycopy(zziibVar2.c, 0, zziibVar.c, zziibVar.a, zziibVar2.a);
                    zziibVar.a = i2;
                }
            }
        }
        zzifmVar.zzt = zziibVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object e(Object obj, int i, zzify zzifyVar, zzifs zzifsVar, Object obj2) {
        if (zzifsVar == null) {
            return obj2;
        }
        if (zzifyVar == null) {
            Iterator<E> it = zzifyVar.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!zzifsVar.a(intValue)) {
                    obj2 = f(i, obj, obj2, intValue);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = zzifyVar.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) zzifyVar.get(i3);
            int intValue2 = num.intValue();
            if (zzifsVar.a(intValue2)) {
                if (i3 != i2) {
                    zzifyVar.set(i2, num);
                }
                i2++;
            } else {
                obj2 = f(i, obj, obj2, intValue2);
            }
        }
        if (i2 != size) {
            zzifyVar.subList(i2, size).clear();
        }
        return obj2;
    }

    public static Object f(int i, Object obj, Object obj2, int i2) {
        if (obj2 == null) {
            obj2 = z.b(obj);
        }
        ((zziib) obj2).d(i << 3, Long.valueOf(i2));
        return obj2;
    }

    public static void g(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzier zzierVar = (zzier) b1lVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzierVar.j(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzierVar.e(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        zzierVar.u(i3);
        while (i2 < list.size()) {
            zzierVar.x(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void h(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzier zzierVar = (zzier) b1lVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzierVar.h(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzierVar.e(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        zzierVar.u(i3);
        while (i2 < list.size()) {
            zzierVar.v(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void i(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzier zzierVar = (zzier) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof cqo)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzierVar.i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzierVar.e(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzier.c(((Long) list.get(i4)).longValue());
            }
            zzierVar.u(i3);
            while (i2 < list.size()) {
                zzierVar.w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        cqo cqoVar = (cqo) list;
        if (!z) {
            while (i2 < cqoVar.c) {
                zzierVar.i(i, cqoVar.k(i2));
                i2++;
            }
            return;
        }
        zzierVar.e(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < cqoVar.c; i6++) {
            i5 += zzier.c(cqoVar.k(i6));
        }
        zzierVar.u(i5);
        while (i2 < cqoVar.c) {
            zzierVar.w(cqoVar.k(i2));
            i2++;
        }
    }

    public static void j(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzier zzierVar = (zzier) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof cqo)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzierVar.i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzierVar.e(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzier.c(((Long) list.get(i4)).longValue());
            }
            zzierVar.u(i3);
            while (i2 < list.size()) {
                zzierVar.w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        cqo cqoVar = (cqo) list;
        if (!z) {
            while (i2 < cqoVar.c) {
                zzierVar.i(i, cqoVar.k(i2));
                i2++;
            }
            return;
        }
        zzierVar.e(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < cqoVar.c; i6++) {
            i5 += zzier.c(cqoVar.k(i6));
        }
        zzierVar.u(i5);
        while (i2 < cqoVar.c) {
            zzierVar.w(cqoVar.k(i2));
            i2++;
        }
    }

    public static void k(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzier zzierVar = (zzier) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof cqo)) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    zzierVar.i(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            zzierVar.e(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += zzier.c((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzierVar.u(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzierVar.w((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        cqo cqoVar = (cqo) list;
        if (!z) {
            while (i2 < cqoVar.c) {
                long k = cqoVar.k(i2);
                zzierVar.i(i, (k >> 63) ^ (k + k));
                i2++;
            }
            return;
        }
        zzierVar.e(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < cqoVar.c; i6++) {
            long k2 = cqoVar.k(i6);
            i5 += zzier.c((k2 >> 63) ^ (k2 + k2));
        }
        zzierVar.u(i5);
        while (i2 < cqoVar.c) {
            long k3 = cqoVar.k(i2);
            zzierVar.w((k3 >> 63) ^ (k3 + k3));
            i2++;
        }
    }

    public static void l(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzier zzierVar = (zzier) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof cqo)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzierVar.j(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzierVar.e(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzierVar.u(i3);
            while (i2 < list.size()) {
                zzierVar.x(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        cqo cqoVar = (cqo) list;
        if (!z) {
            while (i2 < cqoVar.c) {
                zzierVar.j(i, cqoVar.k(i2));
                i2++;
            }
            return;
        }
        zzierVar.e(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < cqoVar.c; i6++) {
            cqoVar.k(i6);
            i5 += 8;
        }
        zzierVar.u(i5);
        while (i2 < cqoVar.c) {
            zzierVar.x(cqoVar.k(i2));
            i2++;
        }
    }

    public static void m(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzier zzierVar = (zzier) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof cqo)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzierVar.j(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzierVar.e(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzierVar.u(i3);
            while (i2 < list.size()) {
                zzierVar.x(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        cqo cqoVar = (cqo) list;
        if (!z) {
            while (i2 < cqoVar.c) {
                zzierVar.j(i, cqoVar.k(i2));
                i2++;
            }
            return;
        }
        zzierVar.e(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < cqoVar.c; i6++) {
            cqoVar.k(i6);
            i5 += 8;
        }
        zzierVar.u(i5);
        while (i2 < cqoVar.c) {
            zzierVar.x(cqoVar.k(i2));
            i2++;
        }
    }

    public static void n(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzier zzierVar = (zzier) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof wpo)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzierVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzierVar.e(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzier.c(((Integer) list.get(i4)).intValue());
            }
            zzierVar.u(i3);
            while (i2 < list.size()) {
                zzierVar.t(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        wpo wpoVar = (wpo) list;
        if (!z) {
            while (i2 < wpoVar.c) {
                zzierVar.f(i, wpoVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzierVar.e(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wpoVar.c; i6++) {
            i5 += zzier.c(wpoVar.zzf(i6));
        }
        zzierVar.u(i5);
        while (i2 < wpoVar.c) {
            zzierVar.t(wpoVar.zzf(i2));
            i2++;
        }
    }

    public static void o(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzier zzierVar = (zzier) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof wpo)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzierVar.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzierVar.e(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzier.b(((Integer) list.get(i4)).intValue());
            }
            zzierVar.u(i3);
            while (i2 < list.size()) {
                zzierVar.u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        wpo wpoVar = (wpo) list;
        if (!z) {
            while (i2 < wpoVar.c) {
                zzierVar.g(i, wpoVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzierVar.e(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wpoVar.c; i6++) {
            i5 += zzier.b(wpoVar.zzf(i6));
        }
        zzierVar.u(i5);
        while (i2 < wpoVar.c) {
            zzierVar.u(wpoVar.zzf(i2));
            i2++;
        }
    }

    public static void p(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzier zzierVar = (zzier) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof wpo)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzierVar.g(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            zzierVar.e(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzier.b((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzierVar.u(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzierVar.u((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        wpo wpoVar = (wpo) list;
        if (!z) {
            while (i2 < wpoVar.c) {
                int zzf = wpoVar.zzf(i2);
                zzierVar.g(i, (zzf >> 31) ^ (zzf + zzf));
                i2++;
            }
            return;
        }
        zzierVar.e(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wpoVar.c; i6++) {
            int zzf2 = wpoVar.zzf(i6);
            i5 += zzier.b((zzf2 >> 31) ^ (zzf2 + zzf2));
        }
        zzierVar.u(i5);
        while (i2 < wpoVar.c) {
            int zzf3 = wpoVar.zzf(i2);
            zzierVar.u((zzf3 >> 31) ^ (zzf3 + zzf3));
            i2++;
        }
    }

    public static void q(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzier zzierVar = (zzier) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof wpo)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzierVar.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzierVar.e(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzierVar.u(i3);
            while (i2 < list.size()) {
                zzierVar.v(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        wpo wpoVar = (wpo) list;
        if (!z) {
            while (i2 < wpoVar.c) {
                zzierVar.h(i, wpoVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzierVar.e(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wpoVar.c; i6++) {
            wpoVar.zzf(i6);
            i5 += 4;
        }
        zzierVar.u(i5);
        while (i2 < wpoVar.c) {
            zzierVar.v(wpoVar.zzf(i2));
            i2++;
        }
    }

    public static void r(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzier zzierVar = (zzier) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof wpo)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzierVar.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzierVar.e(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzierVar.u(i3);
            while (i2 < list.size()) {
                zzierVar.v(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        wpo wpoVar = (wpo) list;
        if (!z) {
            while (i2 < wpoVar.c) {
                zzierVar.h(i, wpoVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzierVar.e(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wpoVar.c; i6++) {
            wpoVar.zzf(i6);
            i5 += 4;
        }
        zzierVar.u(i5);
        while (i2 < wpoVar.c) {
            zzierVar.v(wpoVar.zzf(i2));
            i2++;
        }
    }

    public static void s(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzier zzierVar = (zzier) b1lVar.b;
        int i2 = 0;
        if (!(list instanceof wpo)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzierVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzierVar.e(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzier.c(((Integer) list.get(i4)).intValue());
            }
            zzierVar.u(i3);
            while (i2 < list.size()) {
                zzierVar.t(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        wpo wpoVar = (wpo) list;
        if (!z) {
            while (i2 < wpoVar.c) {
                zzierVar.f(i, wpoVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzierVar.e(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wpoVar.c; i6++) {
            i5 += zzier.c(wpoVar.zzf(i6));
        }
        zzierVar.u(i5);
        while (i2 < wpoVar.c) {
            zzierVar.t(wpoVar.zzf(i2));
            i2++;
        }
    }

    public static void t(int i, List list, b1l b1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzier zzierVar = (zzier) b1lVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzierVar.k(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        zzierVar.e(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        zzierVar.u(i3);
        while (i2 < list.size()) {
            zzierVar.s(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof cqo)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzier.c(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        cqo cqoVar = (cqo) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzier.c(cqoVar.k(i));
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
        if (!(list instanceof cqo)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzier.c(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        cqo cqoVar = (cqo) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzier.c(cqoVar.k(i));
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
        if (!(list instanceof cqo)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += zzier.c((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        cqo cqoVar = (cqo) list;
        int i3 = 0;
        while (i < size) {
            long k = cqoVar.k(i);
            i3 += zzier.c((k >> 63) ^ (k + k));
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
        if (!(list instanceof wpo)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzier.c(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        wpo wpoVar = (wpo) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzier.c(wpoVar.zzf(i));
            i++;
        }
        return i3;
    }

    public static int y(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wpo)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzier.c(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        wpo wpoVar = (wpo) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzier.c(wpoVar.zzf(i));
            i++;
        }
        return i3;
    }

    public static int z(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wpo)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzier.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        wpo wpoVar = (wpo) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzier.b(wpoVar.zzf(i));
            i++;
        }
        return i3;
    }
}
