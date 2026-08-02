package com.google.android.gms.internal.wearable;

import defpackage.a70;
import defpackage.e3c;
import defpackage.k2o;
import defpackage.opn;
import defpackage.txn;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class d {
    public static final e a;

    static {
        int i = opn.a;
        a = new e();
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(Object obj, Object obj2) {
        zzdg zzdgVar = (zzdg) obj;
        zzfj zzfjVar = zzdgVar.zzc;
        zzfj zzfjVar2 = ((zzdg) obj2).zzc;
        zzfj zzfjVar3 = zzfj.f;
        if (!zzfjVar3.equals(zzfjVar2)) {
            if (zzfjVar3.equals(zzfjVar)) {
                int i = zzfjVar.a + zzfjVar2.a;
                int[] copyOf = Arrays.copyOf(zzfjVar.b, i);
                System.arraycopy(zzfjVar2.b, 0, copyOf, zzfjVar.a, zzfjVar2.a);
                Object[] copyOf2 = Arrays.copyOf(zzfjVar.c, i);
                System.arraycopy(zzfjVar2.c, 0, copyOf2, zzfjVar.a, zzfjVar2.a);
                zzfjVar = new zzfj(i, copyOf, copyOf2, true);
            } else {
                zzfjVar.getClass();
                if (!zzfjVar2.equals(zzfjVar3)) {
                    if (!zzfjVar.e) {
                        a70.i();
                        return;
                    }
                    int i2 = zzfjVar.a + zzfjVar2.a;
                    zzfjVar.d(i2);
                    System.arraycopy(zzfjVar2.b, 0, zzfjVar.b, zzfjVar.a, zzfjVar2.a);
                    System.arraycopy(zzfjVar2.c, 0, zzfjVar.c, zzfjVar.a, zzfjVar2.a);
                    zzfjVar.a = i2;
                }
            }
        }
        zzdgVar.zzc = zzfjVar;
    }

    public static Object c(Object obj, int i, zzdp zzdpVar, zzdl zzdlVar, Object obj2, e eVar) {
        if (zzdlVar == null) {
            return obj2;
        }
        int size = zzdpVar.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) zzdpVar.get(i3);
            int intValue = num.intValue();
            if (zzdlVar.a(intValue)) {
                if (i3 != i2) {
                    zzdpVar.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    eVar.getClass();
                    obj2 = e.a(obj);
                }
                eVar.getClass();
                ((zzfj) obj2).c(i << 3, Long.valueOf(intValue));
            }
        }
        if (i2 != size) {
            zzdpVar.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void d(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzcn zzcnVar = (zzcn) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzcnVar.f(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzcnVar.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        zzcnVar.n(i3);
        while (i2 < list.size()) {
            zzcnVar.q(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void e(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzcn zzcnVar = (zzcn) e3cVar.b;
        int i2 = 0;
        if (!(list instanceof txn)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzcnVar.d(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            zzcnVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            zzcnVar.n(i3);
            while (i2 < list.size()) {
                zzcnVar.o(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        txn txnVar = (txn) list;
        if (!z) {
            while (i2 < txnVar.c) {
                txnVar.e(i2);
                zzcnVar.d(i, Float.floatToRawIntBits(txnVar.b[i2]));
                i2++;
            }
            return;
        }
        zzcnVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < txnVar.c; i6++) {
            txnVar.e(i6);
            float f = txnVar.b[i6];
            i5 += 4;
        }
        zzcnVar.n(i5);
        while (i2 < txnVar.c) {
            txnVar.e(i2);
            zzcnVar.o(Float.floatToRawIntBits(txnVar.b[i2]));
            i2++;
        }
    }

    public static void f(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzcn zzcnVar = (zzcn) e3cVar.b;
        int i2 = 0;
        if (!(list instanceof k2o)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzcnVar.e(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzcnVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzcn.s(((Long) list.get(i4)).longValue());
            }
            zzcnVar.n(i3);
            while (i2 < list.size()) {
                zzcnVar.p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        k2o k2oVar = (k2o) list;
        if (!z) {
            while (i2 < k2oVar.c) {
                zzcnVar.e(i, k2oVar.d(i2));
                i2++;
            }
            return;
        }
        zzcnVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < k2oVar.c; i6++) {
            i5 += zzcn.s(k2oVar.d(i6));
        }
        zzcnVar.n(i5);
        while (i2 < k2oVar.c) {
            zzcnVar.p(k2oVar.d(i2));
            i2++;
        }
    }

    public static void g(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzcn zzcnVar = (zzcn) e3cVar.b;
        int i2 = 0;
        if (!(list instanceof k2o)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzcnVar.e(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzcnVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzcn.s(((Long) list.get(i4)).longValue());
            }
            zzcnVar.n(i3);
            while (i2 < list.size()) {
                zzcnVar.p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        k2o k2oVar = (k2o) list;
        if (!z) {
            while (i2 < k2oVar.c) {
                zzcnVar.e(i, k2oVar.d(i2));
                i2++;
            }
            return;
        }
        zzcnVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < k2oVar.c; i6++) {
            i5 += zzcn.s(k2oVar.d(i6));
        }
        zzcnVar.n(i5);
        while (i2 < k2oVar.c) {
            zzcnVar.p(k2oVar.d(i2));
            i2++;
        }
    }

    public static void h(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzcn zzcnVar = (zzcn) e3cVar.b;
        int i2 = 0;
        if (!(list instanceof k2o)) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    zzcnVar.e(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            zzcnVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += zzcn.s((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzcnVar.n(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzcnVar.p((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        k2o k2oVar = (k2o) list;
        if (!z) {
            while (i2 < k2oVar.c) {
                long d = k2oVar.d(i2);
                zzcnVar.e(i, (d >> 63) ^ (d + d));
                i2++;
            }
            return;
        }
        zzcnVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < k2oVar.c; i6++) {
            long d2 = k2oVar.d(i6);
            i5 += zzcn.s((d2 >> 63) ^ (d2 + d2));
        }
        zzcnVar.n(i5);
        while (i2 < k2oVar.c) {
            long d3 = k2oVar.d(i2);
            zzcnVar.p((d3 >> 63) ^ (d3 + d3));
            i2++;
        }
    }

    public static void i(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzcn zzcnVar = (zzcn) e3cVar.b;
        int i2 = 0;
        if (!(list instanceof k2o)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzcnVar.f(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzcnVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzcnVar.n(i3);
            while (i2 < list.size()) {
                zzcnVar.q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        k2o k2oVar = (k2o) list;
        if (!z) {
            while (i2 < k2oVar.c) {
                zzcnVar.f(i, k2oVar.d(i2));
                i2++;
            }
            return;
        }
        zzcnVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < k2oVar.c; i6++) {
            k2oVar.d(i6);
            i5 += 8;
        }
        zzcnVar.n(i5);
        while (i2 < k2oVar.c) {
            zzcnVar.q(k2oVar.d(i2));
            i2++;
        }
    }

    public static void j(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzcn zzcnVar = (zzcn) e3cVar.b;
        int i2 = 0;
        if (!(list instanceof k2o)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzcnVar.f(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzcnVar.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzcnVar.n(i3);
            while (i2 < list.size()) {
                zzcnVar.q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        k2o k2oVar = (k2o) list;
        if (!z) {
            while (i2 < k2oVar.c) {
                zzcnVar.f(i, k2oVar.d(i2));
                i2++;
            }
            return;
        }
        zzcnVar.a(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < k2oVar.c; i6++) {
            k2oVar.d(i6);
            i5 += 8;
        }
        zzcnVar.n(i5);
        while (i2 < k2oVar.c) {
            zzcnVar.q(k2oVar.d(i2));
            i2++;
        }
    }

    public static void k(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzcn zzcnVar = (zzcn) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzcnVar.b(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzcnVar.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzcn.s(((Integer) list.get(i4)).intValue());
        }
        zzcnVar.n(i3);
        while (i2 < list.size()) {
            zzcnVar.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void l(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzcn zzcnVar = (zzcn) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzcnVar.c(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzcnVar.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzcn.r(((Integer) list.get(i4)).intValue());
        }
        zzcnVar.n(i3);
        while (i2 < list.size()) {
            zzcnVar.n(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void m(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzcn zzcnVar = (zzcn) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                zzcnVar.c(i, (intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
            return;
        }
        zzcnVar.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += zzcn.r((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        zzcnVar.n(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            zzcnVar.n((intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    public static void n(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzcn zzcnVar = (zzcn) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzcnVar.d(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzcnVar.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        zzcnVar.n(i3);
        while (i2 < list.size()) {
            zzcnVar.o(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void o(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzcn zzcnVar = (zzcn) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzcnVar.d(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzcnVar.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        zzcnVar.n(i3);
        while (i2 < list.size()) {
            zzcnVar.o(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzcn zzcnVar = (zzcn) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzcnVar.b(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzcnVar.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzcn.s(((Integer) list.get(i4)).intValue());
        }
        zzcnVar.n(i3);
        while (i2 < list.size()) {
            zzcnVar.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, e3c e3cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzcn zzcnVar = (zzcn) e3cVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzcnVar.g(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        zzcnVar.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        zzcnVar.n(i3);
        while (i2 < list.size()) {
            zzcnVar.l(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k2o)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzcn.s(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        k2o k2oVar = (k2o) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzcn.s(k2oVar.d(i));
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
        if (!(list instanceof k2o)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzcn.s(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        k2o k2oVar = (k2o) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzcn.s(k2oVar.d(i));
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
        if (!(list instanceof k2o)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += zzcn.s((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        k2o k2oVar = (k2o) list;
        int i3 = 0;
        while (i < size) {
            long d = k2oVar.d(i);
            i3 += zzcn.s((d >> 63) ^ (d + d));
            i++;
        }
        return i3;
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzcn.s(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int v(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzcn.s(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzcn.r(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int x(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += zzcn.r((intValue >> 31) ^ (intValue + intValue));
        }
        return i;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcn.r(i << 3) + 4) * size;
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcn.r(i << 3) + 8) * size;
    }
}
