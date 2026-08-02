package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class e4 {

    /* renamed from: a, reason: collision with root package name */
    public static final e3 f5441a;

    static {
        a4 a4Var = a4.f5397c;
        f5441a = new e3(6);
    }

    public static void a(int i5, List list, r3 r3Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z2 z2Var = (z2) r3Var.f5558a;
        int i10 = 0;
        if (!(list instanceof h3)) {
            if (!z5) {
                while (i10 < list.size()) {
                    int intValue = ((Integer) list.get(i10)).intValue();
                    z2Var.Z(i5, (intValue >> 31) ^ (intValue + intValue));
                    i10++;
                }
                return;
            }
            z2Var.Y(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue2 = ((Integer) list.get(i12)).intValue();
                i11 += z2.e0((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            z2Var.a0(i11);
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                z2Var.a0((intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
            return;
        }
        h3 h3Var = (h3) list;
        if (!z5) {
            while (i10 < h3Var.f5473c) {
                int b10 = h3Var.b(i10);
                z2Var.Z(i5, (b10 >> 31) ^ (b10 + b10));
                i10++;
            }
            return;
        }
        z2Var.Y(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < h3Var.f5473c; i14++) {
            int b11 = h3Var.b(i14);
            i13 += z2.e0((b11 >> 31) ^ (b11 + b11));
        }
        z2Var.a0(i13);
        while (i10 < h3Var.f5473c) {
            int b12 = h3Var.b(i10);
            z2Var.a0((b12 >> 31) ^ (b12 + b12));
            i10++;
        }
    }

    public static void b(int i5, List list, r3 r3Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z2 z2Var = (z2) r3Var.f5558a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                long longValue = ((Long) list.get(i10)).longValue();
                z2Var.b0(i5, (longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
            return;
        }
        z2Var.Y(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long longValue2 = ((Long) list.get(i12)).longValue();
            i11 += z2.O((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        z2Var.a0(i11);
        while (i10 < list.size()) {
            long longValue3 = ((Long) list.get(i10)).longValue();
            z2Var.c0((longValue3 >> 63) ^ (longValue3 + longValue3));
            i10++;
        }
    }

    public static void c(int i5, List list, r3 r3Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z2 z2Var = (z2) r3Var.f5558a;
        int i10 = 0;
        if (!(list instanceof h3)) {
            if (!z5) {
                while (i10 < list.size()) {
                    z2Var.Z(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            z2Var.Y(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += z2.e0(((Integer) list.get(i12)).intValue());
            }
            z2Var.a0(i11);
            while (i10 < list.size()) {
                z2Var.a0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h3 h3Var = (h3) list;
        if (!z5) {
            while (i10 < h3Var.f5473c) {
                z2Var.Z(i5, h3Var.b(i10));
                i10++;
            }
            return;
        }
        z2Var.Y(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < h3Var.f5473c; i14++) {
            i13 += z2.e0(h3Var.b(i14));
        }
        z2Var.a0(i13);
        while (i10 < h3Var.f5473c) {
            z2Var.a0(h3Var.b(i10));
            i10++;
        }
    }

    public static void d(int i5, List list, r3 r3Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z2 z2Var = (z2) r3Var.f5558a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                z2Var.b0(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        z2Var.Y(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += z2.O(((Long) list.get(i12)).longValue());
        }
        z2Var.a0(i11);
        while (i10 < list.size()) {
            z2Var.c0(((Long) list.get(i10)).longValue());
            i10++;
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
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h3)) {
            int i10 = 0;
            while (i5 < size) {
                i10 += z2.O(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i10;
        }
        h3 h3Var = (h3) list;
        int i11 = 0;
        while (i5 < size) {
            i11 += z2.O(h3Var.b(i5));
            i5++;
        }
        return i11;
    }

    public static int g(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (z2.e0(i5 << 3) + 4) * size;
    }

    public static int h(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (z2.e0(i5 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h3)) {
            int i10 = 0;
            while (i5 < size) {
                i10 += z2.O(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i10;
        }
        h3 h3Var = (h3) list;
        int i11 = 0;
        while (i5 < size) {
            i11 += z2.O(h3Var.b(i5));
            i5++;
        }
        return i11;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i5 += z2.O(((Long) list.get(i10)).longValue());
        }
        return i5;
    }

    public static int k(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h3)) {
            int i10 = 0;
            while (i5 < size) {
                int intValue = ((Integer) list.get(i5)).intValue();
                i10 += z2.e0((intValue >> 31) ^ (intValue + intValue));
                i5++;
            }
            return i10;
        }
        h3 h3Var = (h3) list;
        int i11 = 0;
        while (i5 < size) {
            int b10 = h3Var.b(i5);
            i11 += z2.e0((b10 >> 31) ^ (b10 + b10));
            i5++;
        }
        return i11;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) list.get(i10)).longValue();
            i5 += z2.O((longValue >> 63) ^ (longValue + longValue));
        }
        return i5;
    }

    public static int m(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h3)) {
            int i10 = 0;
            while (i5 < size) {
                i10 += z2.e0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i10;
        }
        h3 h3Var = (h3) list;
        int i11 = 0;
        while (i5 < size) {
            i11 += z2.e0(h3Var.b(i5));
            i5++;
        }
        return i11;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i5 += z2.O(((Long) list.get(i10)).longValue());
        }
        return i5;
    }

    public static Object o(int i5, int i10, Object obj, Object obj2) {
        Object obj3 = obj2;
        if (obj2 == null) {
            g3 g3Var = (g3) obj;
            h4 h4Var = g3Var.zzc;
            obj3 = h4Var;
            if (h4Var == h4.f5474f) {
                h4 b10 = h4.b();
                g3Var.zzc = b10;
                obj3 = b10;
            }
        }
        ((h4) obj3).c(i5 << 3, Long.valueOf(i10));
        return obj3;
    }

    public static void p(Object obj, Object obj2) {
        g3 g3Var = (g3) obj;
        h4 h4Var = g3Var.zzc;
        h4 h4Var2 = ((g3) obj2).zzc;
        h4 h4Var3 = h4.f5474f;
        if (!h4Var3.equals(h4Var2)) {
            if (h4Var3.equals(h4Var)) {
                int i5 = h4Var.f5475a + h4Var2.f5475a;
                int[] copyOf = Arrays.copyOf(h4Var.f5476b, i5);
                System.arraycopy(h4Var2.f5476b, 0, copyOf, h4Var.f5475a, h4Var2.f5475a);
                Object[] copyOf2 = Arrays.copyOf(h4Var.f5477c, i5);
                System.arraycopy(h4Var2.f5477c, 0, copyOf2, h4Var.f5475a, h4Var2.f5475a);
                h4Var = new h4(i5, copyOf, copyOf2, true);
            } else {
                h4Var.getClass();
                if (!h4Var2.equals(h4Var3)) {
                    if (!h4Var.f5479e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = h4Var.f5475a + h4Var2.f5475a;
                    h4Var.e(i10);
                    System.arraycopy(h4Var2.f5476b, 0, h4Var.f5476b, h4Var.f5475a, h4Var2.f5475a);
                    System.arraycopy(h4Var2.f5477c, 0, h4Var.f5477c, h4Var.f5475a, h4Var2.f5475a);
                    h4Var.f5475a = i10;
                }
            }
        }
        g3Var.zzc = h4Var;
    }

    public static void q(int i5, List list, r3 r3Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z2 z2Var = (z2) r3Var.f5558a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                byte booleanValue = ((Boolean) list.get(i10)).booleanValue();
                z2Var.a0(i5 << 3);
                int i11 = z2Var.f5665e;
                try {
                    int i12 = i11 + 1;
                    try {
                        z2Var.f5663c[i11] = booleanValue;
                        z2Var.f5665e = i12;
                        i10++;
                    } catch (IndexOutOfBoundsException e7) {
                        e = e7;
                        i11 = i12;
                        throw new com.google.android.gms.internal.measurement.y4(i11, z2Var.f5664d, 1, e, 1);
                    }
                } catch (IndexOutOfBoundsException e9) {
                    e = e9;
                }
            }
            return;
        }
        z2Var.Y(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Boolean) list.get(i14)).getClass();
            i13++;
        }
        z2Var.a0(i13);
        while (i10 < list.size()) {
            byte booleanValue2 = ((Boolean) list.get(i10)).booleanValue();
            int i15 = z2Var.f5665e;
            try {
                int i16 = i15 + 1;
                try {
                    z2Var.f5663c[i15] = booleanValue2;
                    z2Var.f5665e = i16;
                    i10++;
                } catch (IndexOutOfBoundsException e10) {
                    e = e10;
                    i15 = i16;
                    throw new com.google.android.gms.internal.measurement.y4(i15, z2Var.f5664d, 1, e, 1);
                }
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
            }
        }
    }

    public static void r(int i5, List list, r3 r3Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z2 z2Var = (z2) r3Var.f5558a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                z2Var.T(i5, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        z2Var.Y(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        z2Var.a0(i11);
        while (i10 < list.size()) {
            z2Var.U(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void s(int i5, List list, r3 r3Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z2 z2Var = (z2) r3Var.f5558a;
        int i10 = 0;
        if (!(list instanceof h3)) {
            if (!z5) {
                while (i10 < list.size()) {
                    z2Var.V(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            z2Var.Y(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += z2.O(((Integer) list.get(i12)).intValue());
            }
            z2Var.a0(i11);
            while (i10 < list.size()) {
                z2Var.W(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h3 h3Var = (h3) list;
        if (!z5) {
            while (i10 < h3Var.f5473c) {
                z2Var.V(i5, h3Var.b(i10));
                i10++;
            }
            return;
        }
        z2Var.Y(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < h3Var.f5473c; i14++) {
            i13 += z2.O(h3Var.b(i14));
        }
        z2Var.a0(i13);
        while (i10 < h3Var.f5473c) {
            z2Var.W(h3Var.b(i10));
            i10++;
        }
    }

    public static void t(int i5, List list, r3 r3Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z2 z2Var = (z2) r3Var.f5558a;
        int i10 = 0;
        if (!(list instanceof h3)) {
            if (!z5) {
                while (i10 < list.size()) {
                    z2Var.R(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            z2Var.Y(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            z2Var.a0(i11);
            while (i10 < list.size()) {
                z2Var.S(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h3 h3Var = (h3) list;
        if (!z5) {
            while (i10 < h3Var.f5473c) {
                z2Var.R(i5, h3Var.b(i10));
                i10++;
            }
            return;
        }
        z2Var.Y(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < h3Var.f5473c; i14++) {
            h3Var.b(i14);
            i13 += 4;
        }
        z2Var.a0(i13);
        while (i10 < h3Var.f5473c) {
            z2Var.S(h3Var.b(i10));
            i10++;
        }
    }

    public static void u(int i5, List list, r3 r3Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z2 z2Var = (z2) r3Var.f5558a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                z2Var.T(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        z2Var.Y(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        z2Var.a0(i11);
        while (i10 < list.size()) {
            z2Var.U(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void v(int i5, List list, r3 r3Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z2 z2Var = (z2) r3Var.f5558a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                z2Var.R(i5, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        z2Var.Y(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        z2Var.a0(i11);
        while (i10 < list.size()) {
            z2Var.S(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void w(int i5, List list, r3 r3Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z2 z2Var = (z2) r3Var.f5558a;
        int i10 = 0;
        if (!(list instanceof h3)) {
            if (!z5) {
                while (i10 < list.size()) {
                    z2Var.V(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            z2Var.Y(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += z2.O(((Integer) list.get(i12)).intValue());
            }
            z2Var.a0(i11);
            while (i10 < list.size()) {
                z2Var.W(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h3 h3Var = (h3) list;
        if (!z5) {
            while (i10 < h3Var.f5473c) {
                z2Var.V(i5, h3Var.b(i10));
                i10++;
            }
            return;
        }
        z2Var.Y(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < h3Var.f5473c; i14++) {
            i13 += z2.O(h3Var.b(i14));
        }
        z2Var.a0(i13);
        while (i10 < h3Var.f5473c) {
            z2Var.W(h3Var.b(i10));
            i10++;
        }
    }

    public static void x(int i5, List list, r3 r3Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z2 z2Var = (z2) r3Var.f5558a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                z2Var.b0(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        z2Var.Y(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += z2.O(((Long) list.get(i12)).longValue());
        }
        z2Var.a0(i11);
        while (i10 < list.size()) {
            z2Var.c0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void y(int i5, List list, r3 r3Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z2 z2Var = (z2) r3Var.f5558a;
        int i10 = 0;
        if (!(list instanceof h3)) {
            if (!z5) {
                while (i10 < list.size()) {
                    z2Var.R(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            z2Var.Y(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            z2Var.a0(i11);
            while (i10 < list.size()) {
                z2Var.S(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h3 h3Var = (h3) list;
        if (!z5) {
            while (i10 < h3Var.f5473c) {
                z2Var.R(i5, h3Var.b(i10));
                i10++;
            }
            return;
        }
        z2Var.Y(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < h3Var.f5473c; i14++) {
            h3Var.b(i14);
            i13 += 4;
        }
        z2Var.a0(i13);
        while (i10 < h3Var.f5473c) {
            z2Var.S(h3Var.b(i10));
            i10++;
        }
    }

    public static void z(int i5, List list, r3 r3Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z2 z2Var = (z2) r3Var.f5558a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                z2Var.T(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        z2Var.Y(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        z2Var.a0(i11);
        while (i10 < list.size()) {
            z2Var.U(((Long) list.get(i10)).longValue());
            i10++;
        }
    }
}
