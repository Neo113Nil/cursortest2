package com.google.android.gms.internal.consent_sdk;

import defpackage.a70;
import defpackage.ceo;
import defpackage.f3p;
import defpackage.g5p;
import defpackage.haf;
import defpackage.k1p;
import defpackage.muo;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class f {
    public static final haf a;

    static {
        int i = k1p.a;
        a = new haf(27);
    }

    public static void a(int i, List list, muo muoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpv zzpvVar = (zzpv) muoVar.b;
        int i2 = 0;
        if (!(list instanceof f3p)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzpvVar.w(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            zzpvVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzpv.c((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzpvVar.x(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzpvVar.x((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        f3p f3pVar = (f3p) list;
        if (!z) {
            while (i2 < f3pVar.c) {
                int d = f3pVar.d(i2);
                zzpvVar.w(i, (d >> 31) ^ (d + d));
                i2++;
            }
            return;
        }
        zzpvVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < f3pVar.c; i6++) {
            int d2 = f3pVar.d(i6);
            i5 += zzpv.c((d2 >> 31) ^ (d2 + d2));
        }
        zzpvVar.x(i5);
        while (i2 < f3pVar.c) {
            int d3 = f3pVar.d(i2);
            zzpvVar.x((d3 >> 31) ^ (d3 + d3));
            i2++;
        }
    }

    public static void b(int i, List list, muo muoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpv zzpvVar = (zzpv) muoVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                zzpvVar.y(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        zzpvVar.v(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += zzpv.d((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        zzpvVar.x(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzpvVar.z((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    public static void c(int i, List list, muo muoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpv zzpvVar = (zzpv) muoVar.b;
        int i2 = 0;
        if (!(list instanceof f3p)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzpvVar.w(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzpvVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzpv.c(((Integer) list.get(i4)).intValue());
            }
            zzpvVar.x(i3);
            while (i2 < list.size()) {
                zzpvVar.x(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        f3p f3pVar = (f3p) list;
        if (!z) {
            while (i2 < f3pVar.c) {
                zzpvVar.w(i, f3pVar.d(i2));
                i2++;
            }
            return;
        }
        zzpvVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < f3pVar.c; i6++) {
            i5 += zzpv.c(f3pVar.d(i6));
        }
        zzpvVar.x(i5);
        while (i2 < f3pVar.c) {
            zzpvVar.x(f3pVar.d(i2));
            i2++;
        }
    }

    public static void d(int i, List list, muo muoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpv zzpvVar = (zzpv) muoVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzpvVar.y(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzpvVar.v(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzpv.d(((Long) list.get(i4)).longValue());
        }
        zzpvVar.x(i3);
        while (i2 < list.size()) {
            zzpvVar.z(((Long) list.get(i2)).longValue());
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
        if (!(list instanceof f3p)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzpv.d(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        f3p f3pVar = (f3p) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzpv.d(f3pVar.d(i));
            i++;
        }
        return i3;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzpv.c(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzpv.c(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f3p)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzpv.d(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        f3p f3pVar = (f3p) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzpv.d(f3pVar.d(i));
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
            i += zzpv.d(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int k(int i, Object obj, g5p g5pVar) {
        int i2 = i << 3;
        if (obj instanceof zzra) {
            int c = zzpv.c(i2);
            int a2 = ((zzra) obj).a();
            return ceo.h(a2, a2, c);
        }
        int c2 = zzpv.c(i2);
        int c3 = ((zzpa) obj).c(g5pVar);
        return ceo.h(c3, c3, c2);
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f3p)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zzpv.c((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        f3p f3pVar = (f3p) list;
        int i3 = 0;
        while (i < size) {
            int d = f3pVar.d(i);
            i3 += zzpv.c((d >> 31) ^ (d + d));
            i++;
        }
        return i3;
    }

    public static int m(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += zzpv.d((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f3p)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzpv.c(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        f3p f3pVar = (f3p) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzpv.c(f3pVar.d(i));
            i++;
        }
        return i3;
    }

    public static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzpv.d(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void p(Object obj, Object obj2) {
        zzqm zzqmVar = (zzqm) obj;
        zzsq zzsqVar = zzqmVar.zzc;
        zzsq zzsqVar2 = ((zzqm) obj2).zzc;
        zzsq zzsqVar3 = zzsq.e;
        if (!zzsqVar3.equals(zzsqVar2)) {
            if (zzsqVar3.equals(zzsqVar)) {
                zzsqVar.getClass();
                zzsqVar2.getClass();
                int[] copyOf = Arrays.copyOf(zzsqVar.a, 0);
                System.arraycopy(zzsqVar2.a, 0, copyOf, 0, 0);
                Object[] copyOf2 = Arrays.copyOf(zzsqVar.b, 0);
                System.arraycopy(zzsqVar2.b, 0, copyOf2, 0, 0);
                zzsqVar = new zzsq(copyOf, copyOf2, true);
            } else {
                zzsqVar.getClass();
                if (!zzsqVar2.equals(zzsqVar3)) {
                    if (!zzsqVar.d) {
                        a70.i();
                        return;
                    }
                    int[] iArr = zzsqVar.a;
                    int length = iArr.length;
                    System.arraycopy(zzsqVar2.a, 0, iArr, 0, 0);
                    System.arraycopy(zzsqVar2.b, 0, zzsqVar.b, 0, 0);
                }
            }
        }
        zzqmVar.zzc = zzsqVar;
    }

    public static void q(int i, List list, muo muoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpv zzpvVar = (zzpv) muoVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzpvVar.g(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        zzpvVar.v(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        zzpvVar.x(i3);
        while (i2 < list.size()) {
            zzpvVar.f(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void r(int i, List list, muo muoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpv zzpvVar = (zzpv) muoVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzpvVar.m(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzpvVar.v(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        zzpvVar.x(i3);
        while (i2 < list.size()) {
            zzpvVar.n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void s(int i, List list, muo muoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpv zzpvVar = (zzpv) muoVar.b;
        int i2 = 0;
        if (!(list instanceof f3p)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzpvVar.o(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzpvVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzpv.d(((Integer) list.get(i4)).intValue());
            }
            zzpvVar.x(i3);
            while (i2 < list.size()) {
                zzpvVar.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        f3p f3pVar = (f3p) list;
        if (!z) {
            while (i2 < f3pVar.c) {
                zzpvVar.o(i, f3pVar.d(i2));
                i2++;
            }
            return;
        }
        zzpvVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < f3pVar.c; i6++) {
            i5 += zzpv.d(f3pVar.d(i6));
        }
        zzpvVar.x(i5);
        while (i2 < f3pVar.c) {
            zzpvVar.p(f3pVar.d(i2));
            i2++;
        }
    }

    public static void t(int i, List list, muo muoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpv zzpvVar = (zzpv) muoVar.b;
        int i2 = 0;
        if (!(list instanceof f3p)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzpvVar.k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzpvVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzpvVar.x(i3);
            while (i2 < list.size()) {
                zzpvVar.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        f3p f3pVar = (f3p) list;
        if (!z) {
            while (i2 < f3pVar.c) {
                zzpvVar.k(i, f3pVar.d(i2));
                i2++;
            }
            return;
        }
        zzpvVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < f3pVar.c; i6++) {
            f3pVar.d(i6);
            i5 += 4;
        }
        zzpvVar.x(i5);
        while (i2 < f3pVar.c) {
            zzpvVar.l(f3pVar.d(i2));
            i2++;
        }
    }

    public static void u(int i, List list, muo muoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpv zzpvVar = (zzpv) muoVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzpvVar.m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzpvVar.v(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        zzpvVar.x(i3);
        while (i2 < list.size()) {
            zzpvVar.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void v(int i, List list, muo muoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpv zzpvVar = (zzpv) muoVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzpvVar.k(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzpvVar.v(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        zzpvVar.x(i3);
        while (i2 < list.size()) {
            zzpvVar.l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void w(int i, List list, muo muoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpv zzpvVar = (zzpv) muoVar.b;
        int i2 = 0;
        if (!(list instanceof f3p)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzpvVar.o(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzpvVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzpv.d(((Integer) list.get(i4)).intValue());
            }
            zzpvVar.x(i3);
            while (i2 < list.size()) {
                zzpvVar.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        f3p f3pVar = (f3p) list;
        if (!z) {
            while (i2 < f3pVar.c) {
                zzpvVar.o(i, f3pVar.d(i2));
                i2++;
            }
            return;
        }
        zzpvVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < f3pVar.c; i6++) {
            i5 += zzpv.d(f3pVar.d(i6));
        }
        zzpvVar.x(i5);
        while (i2 < f3pVar.c) {
            zzpvVar.p(f3pVar.d(i2));
            i2++;
        }
    }

    public static void x(int i, List list, muo muoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpv zzpvVar = (zzpv) muoVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzpvVar.y(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzpvVar.v(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzpv.d(((Long) list.get(i4)).longValue());
        }
        zzpvVar.x(i3);
        while (i2 < list.size()) {
            zzpvVar.z(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void y(int i, List list, muo muoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpv zzpvVar = (zzpv) muoVar.b;
        int i2 = 0;
        if (!(list instanceof f3p)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzpvVar.k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzpvVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzpvVar.x(i3);
            while (i2 < list.size()) {
                zzpvVar.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        f3p f3pVar = (f3p) list;
        if (!z) {
            while (i2 < f3pVar.c) {
                zzpvVar.k(i, f3pVar.d(i2));
                i2++;
            }
            return;
        }
        zzpvVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < f3pVar.c; i6++) {
            f3pVar.d(i6);
            i5 += 4;
        }
        zzpvVar.x(i5);
        while (i2 < f3pVar.c) {
            zzpvVar.l(f3pVar.d(i2));
            i2++;
        }
    }

    public static void z(int i, List list, muo muoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpv zzpvVar = (zzpv) muoVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzpvVar.m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzpvVar.v(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        zzpvVar.x(i3);
        while (i2 < list.size()) {
            zzpvVar.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
