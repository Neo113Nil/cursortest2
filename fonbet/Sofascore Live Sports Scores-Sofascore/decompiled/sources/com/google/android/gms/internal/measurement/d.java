package com.google.android.gms.internal.measurement;

import defpackage.a70;
import defpackage.ewm;
import defpackage.hcn;
import defpackage.j8n;
import defpackage.odn;
import defpackage.tan;
import defpackage.x5n;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class d {
    public static final e a;

    static {
        int i = j8n.a;
        a = new e();
    }

    public static int A(int i, Object obj, odn odnVar) {
        int i2 = i << 3;
        if (obj instanceof zzaem) {
            int b = zzada.b(i2);
            int a2 = ((zzaem) obj).a();
            return x5n.c(a2, a2, b);
        }
        int b2 = zzada.b(i2);
        int i3 = ((zzacb) obj).i(odnVar);
        return x5n.c(i3, i3, b2);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(Object obj, Object obj2) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVar = zzaduVar.zzc;
        zzaga zzagaVar2 = ((zzadu) obj2).zzc;
        zzaga zzagaVar3 = zzaga.f;
        if (!zzagaVar3.equals(zzagaVar2)) {
            if (zzagaVar3.equals(zzagaVar)) {
                int i = zzagaVar.a + zzagaVar2.a;
                int[] copyOf = Arrays.copyOf(zzagaVar.b, i);
                System.arraycopy(zzagaVar2.b, 0, copyOf, zzagaVar.a, zzagaVar2.a);
                Object[] copyOf2 = Arrays.copyOf(zzagaVar.c, i);
                System.arraycopy(zzagaVar2.c, 0, copyOf2, zzagaVar.a, zzagaVar2.a);
                zzagaVar = new zzaga(i, copyOf, copyOf2, true);
            } else {
                zzagaVar.getClass();
                if (!zzagaVar2.equals(zzagaVar3)) {
                    if (!zzagaVar.e) {
                        a70.i();
                        return;
                    }
                    int i2 = zzagaVar.a + zzagaVar2.a;
                    zzagaVar.e(i2);
                    System.arraycopy(zzagaVar2.b, 0, zzagaVar.b, zzagaVar.a, zzagaVar2.a);
                    System.arraycopy(zzagaVar2.c, 0, zzagaVar.c, zzagaVar.a, zzagaVar2.a);
                    zzagaVar.a = i2;
                }
            }
        }
        zzaduVar.zzc = zzagaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object c(Object obj, int i, zzaef zzaefVar, zzadz zzadzVar, Object obj2, e eVar) {
        if (zzadzVar == null) {
            return obj2;
        }
        if (zzaefVar == null) {
            Iterator<E> it = zzaefVar.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!zzadzVar.a(intValue)) {
                    if (obj2 == null) {
                        eVar.getClass();
                        obj2 = e.a(obj);
                    }
                    eVar.getClass();
                    ((zzaga) obj2).d(i << 3, Long.valueOf(intValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = zzaefVar.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) zzaefVar.get(i3);
            int intValue2 = num.intValue();
            if (zzadzVar.a(intValue2)) {
                if (i3 != i2) {
                    zzaefVar.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    eVar.getClass();
                    obj2 = e.a(obj);
                }
                eVar.getClass();
                ((zzaga) obj2).d(i << 3, Long.valueOf(intValue2));
            }
        }
        if (i2 != size) {
            zzaefVar.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void d(int i, List list, ewm ewmVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) ewmVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzadaVar.k(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzadaVar.f(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        zzadaVar.v(i3);
        while (i2 < list.size()) {
            zzadaVar.y(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void e(int i, List list, ewm ewmVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) ewmVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzadaVar.i(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzadaVar.f(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        zzadaVar.v(i3);
        while (i2 < list.size()) {
            zzadaVar.w(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void f(int i, List list, ewm ewmVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) ewmVar.b;
        int i2 = 0;
        if (!(list instanceof hcn)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.j(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzadaVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzada.c(((Long) list.get(i4)).longValue());
            }
            zzadaVar.v(i3);
            while (i2 < list.size()) {
                zzadaVar.x(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        hcn hcnVar = (hcn) list;
        if (!z) {
            while (i2 < hcnVar.c) {
                zzadaVar.j(i, hcnVar.k(i2));
                i2++;
            }
            return;
        }
        zzadaVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < hcnVar.c; i6++) {
            i5 += zzada.c(hcnVar.k(i6));
        }
        zzadaVar.v(i5);
        while (i2 < hcnVar.c) {
            zzadaVar.x(hcnVar.k(i2));
            i2++;
        }
    }

    public static void g(int i, List list, ewm ewmVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) ewmVar.b;
        int i2 = 0;
        if (!(list instanceof hcn)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.j(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzadaVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzada.c(((Long) list.get(i4)).longValue());
            }
            zzadaVar.v(i3);
            while (i2 < list.size()) {
                zzadaVar.x(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        hcn hcnVar = (hcn) list;
        if (!z) {
            while (i2 < hcnVar.c) {
                zzadaVar.j(i, hcnVar.k(i2));
                i2++;
            }
            return;
        }
        zzadaVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < hcnVar.c; i6++) {
            i5 += zzada.c(hcnVar.k(i6));
        }
        zzadaVar.v(i5);
        while (i2 < hcnVar.c) {
            zzadaVar.x(hcnVar.k(i2));
            i2++;
        }
    }

    public static void h(int i, List list, ewm ewmVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) ewmVar.b;
        int i2 = 0;
        if (!(list instanceof hcn)) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    zzadaVar.j(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            zzadaVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += zzada.c((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzadaVar.v(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzadaVar.x((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        hcn hcnVar = (hcn) list;
        if (!z) {
            while (i2 < hcnVar.c) {
                long k = hcnVar.k(i2);
                zzadaVar.j(i, (k >> 63) ^ (k + k));
                i2++;
            }
            return;
        }
        zzadaVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < hcnVar.c; i6++) {
            long k2 = hcnVar.k(i6);
            i5 += zzada.c((k2 >> 63) ^ (k2 + k2));
        }
        zzadaVar.v(i5);
        while (i2 < hcnVar.c) {
            long k3 = hcnVar.k(i2);
            zzadaVar.x((k3 >> 63) ^ (k3 + k3));
            i2++;
        }
    }

    public static void i(int i, List list, ewm ewmVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) ewmVar.b;
        int i2 = 0;
        if (!(list instanceof hcn)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzadaVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzadaVar.v(i3);
            while (i2 < list.size()) {
                zzadaVar.y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        hcn hcnVar = (hcn) list;
        if (!z) {
            while (i2 < hcnVar.c) {
                zzadaVar.k(i, hcnVar.k(i2));
                i2++;
            }
            return;
        }
        zzadaVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < hcnVar.c; i6++) {
            hcnVar.k(i6);
            i5 += 8;
        }
        zzadaVar.v(i5);
        while (i2 < hcnVar.c) {
            zzadaVar.y(hcnVar.k(i2));
            i2++;
        }
    }

    public static void j(int i, List list, ewm ewmVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) ewmVar.b;
        int i2 = 0;
        if (!(list instanceof hcn)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzadaVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzadaVar.v(i3);
            while (i2 < list.size()) {
                zzadaVar.y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        hcn hcnVar = (hcn) list;
        if (!z) {
            while (i2 < hcnVar.c) {
                zzadaVar.k(i, hcnVar.k(i2));
                i2++;
            }
            return;
        }
        zzadaVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < hcnVar.c; i6++) {
            hcnVar.k(i6);
            i5 += 8;
        }
        zzadaVar.v(i5);
        while (i2 < hcnVar.c) {
            zzadaVar.y(hcnVar.k(i2));
            i2++;
        }
    }

    public static void k(int i, List list, ewm ewmVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) ewmVar.b;
        int i2 = 0;
        if (!(list instanceof tan)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzadaVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzada.c(((Integer) list.get(i4)).intValue());
            }
            zzadaVar.v(i3);
            while (i2 < list.size()) {
                zzadaVar.u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tan tanVar = (tan) list;
        if (!z) {
            while (i2 < tanVar.c) {
                zzadaVar.g(i, tanVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzadaVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < tanVar.c; i6++) {
            i5 += zzada.c(tanVar.zzf(i6));
        }
        zzadaVar.v(i5);
        while (i2 < tanVar.c) {
            zzadaVar.u(tanVar.zzf(i2));
            i2++;
        }
    }

    public static void l(int i, List list, ewm ewmVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) ewmVar.b;
        int i2 = 0;
        if (!(list instanceof tan)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzadaVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzada.b(((Integer) list.get(i4)).intValue());
            }
            zzadaVar.v(i3);
            while (i2 < list.size()) {
                zzadaVar.v(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tan tanVar = (tan) list;
        if (!z) {
            while (i2 < tanVar.c) {
                zzadaVar.h(i, tanVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzadaVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < tanVar.c; i6++) {
            i5 += zzada.b(tanVar.zzf(i6));
        }
        zzadaVar.v(i5);
        while (i2 < tanVar.c) {
            zzadaVar.v(tanVar.zzf(i2));
            i2++;
        }
    }

    public static void m(int i, List list, ewm ewmVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) ewmVar.b;
        int i2 = 0;
        if (!(list instanceof tan)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzadaVar.h(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            zzadaVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzada.b((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzadaVar.v(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzadaVar.v((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        tan tanVar = (tan) list;
        if (!z) {
            while (i2 < tanVar.c) {
                int zzf = tanVar.zzf(i2);
                zzadaVar.h(i, (zzf >> 31) ^ (zzf + zzf));
                i2++;
            }
            return;
        }
        zzadaVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < tanVar.c; i6++) {
            int zzf2 = tanVar.zzf(i6);
            i5 += zzada.b((zzf2 >> 31) ^ (zzf2 + zzf2));
        }
        zzadaVar.v(i5);
        while (i2 < tanVar.c) {
            int zzf3 = tanVar.zzf(i2);
            zzadaVar.v((zzf3 >> 31) ^ (zzf3 + zzf3));
            i2++;
        }
    }

    public static void n(int i, List list, ewm ewmVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) ewmVar.b;
        int i2 = 0;
        if (!(list instanceof tan)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzadaVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzadaVar.v(i3);
            while (i2 < list.size()) {
                zzadaVar.w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tan tanVar = (tan) list;
        if (!z) {
            while (i2 < tanVar.c) {
                zzadaVar.i(i, tanVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzadaVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < tanVar.c; i6++) {
            tanVar.zzf(i6);
            i5 += 4;
        }
        zzadaVar.v(i5);
        while (i2 < tanVar.c) {
            zzadaVar.w(tanVar.zzf(i2));
            i2++;
        }
    }

    public static void o(int i, List list, ewm ewmVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) ewmVar.b;
        int i2 = 0;
        if (!(list instanceof tan)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzadaVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzadaVar.v(i3);
            while (i2 < list.size()) {
                zzadaVar.w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tan tanVar = (tan) list;
        if (!z) {
            while (i2 < tanVar.c) {
                zzadaVar.i(i, tanVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzadaVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < tanVar.c; i6++) {
            tanVar.zzf(i6);
            i5 += 4;
        }
        zzadaVar.v(i5);
        while (i2 < tanVar.c) {
            zzadaVar.w(tanVar.zzf(i2));
            i2++;
        }
    }

    public static void p(int i, List list, ewm ewmVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) ewmVar.b;
        int i2 = 0;
        if (!(list instanceof tan)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzadaVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzada.c(((Integer) list.get(i4)).intValue());
            }
            zzadaVar.v(i3);
            while (i2 < list.size()) {
                zzadaVar.u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tan tanVar = (tan) list;
        if (!z) {
            while (i2 < tanVar.c) {
                zzadaVar.g(i, tanVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzadaVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < tanVar.c; i6++) {
            i5 += zzada.c(tanVar.zzf(i6));
        }
        zzadaVar.v(i5);
        while (i2 < tanVar.c) {
            zzadaVar.u(tanVar.zzf(i2));
            i2++;
        }
    }

    public static void q(int i, List list, ewm ewmVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) ewmVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzadaVar.l(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        zzadaVar.f(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        zzadaVar.v(i3);
        while (i2 < list.size()) {
            zzadaVar.t(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hcn)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzada.c(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        hcn hcnVar = (hcn) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzada.c(hcnVar.k(i));
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
        if (!(list instanceof hcn)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzada.c(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        hcn hcnVar = (hcn) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzada.c(hcnVar.k(i));
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
        if (!(list instanceof hcn)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += zzada.c((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        hcn hcnVar = (hcn) list;
        int i3 = 0;
        while (i < size) {
            long k = hcnVar.k(i);
            i3 += zzada.c((k >> 63) ^ (k + k));
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
        if (!(list instanceof tan)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzada.c(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        tan tanVar = (tan) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzada.c(tanVar.zzf(i));
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
        if (!(list instanceof tan)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzada.c(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        tan tanVar = (tan) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzada.c(tanVar.zzf(i));
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
        if (!(list instanceof tan)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzada.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        tan tanVar = (tan) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzada.b(tanVar.zzf(i));
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
        if (!(list instanceof tan)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zzada.b((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        tan tanVar = (tan) list;
        int i3 = 0;
        while (i < size) {
            int zzf = tanVar.zzf(i);
            i3 += zzada.b((zzf >> 31) ^ (zzf + zzf));
            i++;
        }
        return i3;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzada.b(i << 3) + 4) * size;
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzada.b(i << 3) + 8) * size;
    }
}
