package com.google.android.gms.internal.play_billing;

import defpackage.a70;
import defpackage.d1l;
import defpackage.eao;
import defpackage.jpe;
import defpackage.o7o;
import defpackage.pfo;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class f {
    public static final jpe a;

    static {
        int i = o7o.a;
        a = new jpe(24);
    }

    public static void a(int i, List list, d1l d1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eao eaoVar = (eao) d1lVar.b;
        int i2 = 0;
        if (!(list instanceof pfo)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    eaoVar.t(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            eaoVar.s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzfx.c((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            eaoVar.u(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                eaoVar.u((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        pfo pfoVar = (pfo) list;
        if (!z) {
            while (i2 < pfoVar.c) {
                int d = pfoVar.d(i2);
                eaoVar.t(i, (d >> 31) ^ (d + d));
                i2++;
            }
            return;
        }
        eaoVar.s(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < pfoVar.c; i6++) {
            int d2 = pfoVar.d(i6);
            i5 += zzfx.c((d2 >> 31) ^ (d2 + d2));
        }
        eaoVar.u(i5);
        while (i2 < pfoVar.c) {
            int d3 = pfoVar.d(i2);
            eaoVar.u((d3 >> 31) ^ (d3 + d3));
            i2++;
        }
    }

    public static void b(int i, List list, d1l d1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eao eaoVar = (eao) d1lVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                eaoVar.v(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        eaoVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += zzfx.d((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        eaoVar.u(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            eaoVar.w((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    public static void c(int i, List list, d1l d1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eao eaoVar = (eao) d1lVar.b;
        int i2 = 0;
        if (!(list instanceof pfo)) {
            if (!z) {
                while (i2 < list.size()) {
                    eaoVar.t(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eaoVar.s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzfx.c(((Integer) list.get(i4)).intValue());
            }
            eaoVar.u(i3);
            while (i2 < list.size()) {
                eaoVar.u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        pfo pfoVar = (pfo) list;
        if (!z) {
            while (i2 < pfoVar.c) {
                eaoVar.t(i, pfoVar.d(i2));
                i2++;
            }
            return;
        }
        eaoVar.s(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < pfoVar.c; i6++) {
            i5 += zzfx.c(pfoVar.d(i6));
        }
        eaoVar.u(i5);
        while (i2 < pfoVar.c) {
            eaoVar.u(pfoVar.d(i2));
            i2++;
        }
    }

    public static void d(int i, List list, d1l d1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eao eaoVar = (eao) d1lVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eaoVar.v(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        eaoVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzfx.d(((Long) list.get(i4)).longValue());
        }
        eaoVar.u(i3);
        while (i2 < list.size()) {
            eaoVar.w(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof pfo)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzfx.d(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        pfo pfoVar = (pfo) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzfx.d(pfoVar.d(i));
            i++;
        }
        return i3;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzfx.c(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzfx.c(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof pfo)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzfx.d(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        pfo pfoVar = (pfo) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzfx.d(pfoVar.d(i));
            i++;
        }
        return i3;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzfx.d(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof pfo)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zzfx.c((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        pfo pfoVar = (pfo) list;
        int i3 = 0;
        while (i < size) {
            int d = pfoVar.d(i);
            i3 += zzfx.c((d >> 31) ^ (d + d));
            i++;
        }
        return i3;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += zzfx.d((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof pfo)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzfx.c(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        pfo pfoVar = (pfo) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzfx.c(pfoVar.d(i));
            i++;
        }
        return i3;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzfx.d(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void o(Object obj, Object obj2) {
        zzgp zzgpVar = (zzgp) obj;
        zzir zzirVar = zzgpVar.zzc;
        zzir zzirVar2 = ((zzgp) obj2).zzc;
        zzir zzirVar3 = zzir.f;
        if (!zzirVar3.equals(zzirVar2)) {
            if (zzirVar3.equals(zzirVar)) {
                int i = zzirVar.a + zzirVar2.a;
                int[] copyOf = Arrays.copyOf(zzirVar.b, i);
                System.arraycopy(zzirVar2.b, 0, copyOf, zzirVar.a, zzirVar2.a);
                Object[] copyOf2 = Arrays.copyOf(zzirVar.c, i);
                System.arraycopy(zzirVar2.c, 0, copyOf2, zzirVar.a, zzirVar2.a);
                zzirVar = new zzir(i, copyOf, copyOf2, true);
            } else {
                zzirVar.getClass();
                if (!zzirVar2.equals(zzirVar3)) {
                    if (!zzirVar.e) {
                        a70.i();
                        return;
                    }
                    int i2 = zzirVar.a + zzirVar2.a;
                    zzirVar.e(i2);
                    System.arraycopy(zzirVar2.b, 0, zzirVar.b, zzirVar.a, zzirVar2.a);
                    System.arraycopy(zzirVar2.c, 0, zzirVar.c, zzirVar.a, zzirVar2.a);
                    zzirVar.a = i2;
                }
            }
        }
        zzgpVar.zzc = zzirVar;
    }

    public static void p(int i, List list, d1l d1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eao eaoVar = (eao) d1lVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eaoVar.g(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        eaoVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        eaoVar.u(i3);
        while (i2 < list.size()) {
            eaoVar.e(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void q(int i, List list, d1l d1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eao eaoVar = (eao) d1lVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eaoVar.l(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        eaoVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        eaoVar.u(i3);
        while (i2 < list.size()) {
            eaoVar.m(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void r(int i, List list, d1l d1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eao eaoVar = (eao) d1lVar.b;
        int i2 = 0;
        if (!(list instanceof pfo)) {
            if (!z) {
                while (i2 < list.size()) {
                    eaoVar.n(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eaoVar.s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzfx.d(((Integer) list.get(i4)).intValue());
            }
            eaoVar.u(i3);
            while (i2 < list.size()) {
                eaoVar.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        pfo pfoVar = (pfo) list;
        if (!z) {
            while (i2 < pfoVar.c) {
                eaoVar.n(i, pfoVar.d(i2));
                i2++;
            }
            return;
        }
        eaoVar.s(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < pfoVar.c; i6++) {
            i5 += zzfx.d(pfoVar.d(i6));
        }
        eaoVar.u(i5);
        while (i2 < pfoVar.c) {
            eaoVar.o(pfoVar.d(i2));
            i2++;
        }
    }

    public static void s(int i, List list, d1l d1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eao eaoVar = (eao) d1lVar.b;
        int i2 = 0;
        if (!(list instanceof pfo)) {
            if (!z) {
                while (i2 < list.size()) {
                    eaoVar.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eaoVar.s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            eaoVar.u(i3);
            while (i2 < list.size()) {
                eaoVar.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        pfo pfoVar = (pfo) list;
        if (!z) {
            while (i2 < pfoVar.c) {
                eaoVar.j(i, pfoVar.d(i2));
                i2++;
            }
            return;
        }
        eaoVar.s(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < pfoVar.c; i6++) {
            pfoVar.d(i6);
            i5 += 4;
        }
        eaoVar.u(i5);
        while (i2 < pfoVar.c) {
            eaoVar.k(pfoVar.d(i2));
            i2++;
        }
    }

    public static void t(int i, List list, d1l d1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eao eaoVar = (eao) d1lVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eaoVar.l(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        eaoVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        eaoVar.u(i3);
        while (i2 < list.size()) {
            eaoVar.m(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, d1l d1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eao eaoVar = (eao) d1lVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eaoVar.j(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        eaoVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        eaoVar.u(i3);
        while (i2 < list.size()) {
            eaoVar.k(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void v(int i, List list, d1l d1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eao eaoVar = (eao) d1lVar.b;
        int i2 = 0;
        if (!(list instanceof pfo)) {
            if (!z) {
                while (i2 < list.size()) {
                    eaoVar.n(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eaoVar.s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzfx.d(((Integer) list.get(i4)).intValue());
            }
            eaoVar.u(i3);
            while (i2 < list.size()) {
                eaoVar.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        pfo pfoVar = (pfo) list;
        if (!z) {
            while (i2 < pfoVar.c) {
                eaoVar.n(i, pfoVar.d(i2));
                i2++;
            }
            return;
        }
        eaoVar.s(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < pfoVar.c; i6++) {
            i5 += zzfx.d(pfoVar.d(i6));
        }
        eaoVar.u(i5);
        while (i2 < pfoVar.c) {
            eaoVar.o(pfoVar.d(i2));
            i2++;
        }
    }

    public static void w(int i, List list, d1l d1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eao eaoVar = (eao) d1lVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eaoVar.v(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        eaoVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzfx.d(((Long) list.get(i4)).longValue());
        }
        eaoVar.u(i3);
        while (i2 < list.size()) {
            eaoVar.w(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void x(int i, List list, d1l d1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eao eaoVar = (eao) d1lVar.b;
        int i2 = 0;
        if (!(list instanceof pfo)) {
            if (!z) {
                while (i2 < list.size()) {
                    eaoVar.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eaoVar.s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            eaoVar.u(i3);
            while (i2 < list.size()) {
                eaoVar.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        pfo pfoVar = (pfo) list;
        if (!z) {
            while (i2 < pfoVar.c) {
                eaoVar.j(i, pfoVar.d(i2));
                i2++;
            }
            return;
        }
        eaoVar.s(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < pfoVar.c; i6++) {
            pfoVar.d(i6);
            i5 += 4;
        }
        eaoVar.u(i5);
        while (i2 < pfoVar.c) {
            eaoVar.k(pfoVar.d(i2));
            i2++;
        }
    }

    public static void y(int i, List list, d1l d1lVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eao eaoVar = (eao) d1lVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eaoVar.l(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        eaoVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        eaoVar.u(i3);
        while (i2 < list.size()) {
            eaoVar.m(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
