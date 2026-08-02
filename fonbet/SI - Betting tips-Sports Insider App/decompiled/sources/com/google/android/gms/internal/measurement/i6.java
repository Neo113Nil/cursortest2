package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class i6 {

    /* renamed from: a, reason: collision with root package name */
    public static final e5 f5086a;

    static {
        e6 e6Var = e6.f5030c;
        f5086a = new e5(6);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(Object obj, Object obj2) {
        g5 g5Var = (g5) obj;
        l6 l6Var = g5Var.zzc;
        l6 l6Var2 = ((g5) obj2).zzc;
        l6 l6Var3 = l6.f5126f;
        if (!l6Var3.equals(l6Var2)) {
            if (l6Var3.equals(l6Var)) {
                int i5 = l6Var.f5127a + l6Var2.f5127a;
                int[] copyOf = Arrays.copyOf(l6Var.f5128b, i5);
                System.arraycopy(l6Var2.f5128b, 0, copyOf, l6Var.f5127a, l6Var2.f5127a);
                Object[] copyOf2 = Arrays.copyOf(l6Var.f5129c, i5);
                System.arraycopy(l6Var2.f5129c, 0, copyOf2, l6Var.f5127a, l6Var2.f5127a);
                l6Var = new l6(i5, copyOf, copyOf2, true);
            } else {
                l6Var.getClass();
                if (!l6Var2.equals(l6Var3)) {
                    if (!l6Var.f5131e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = l6Var.f5127a + l6Var2.f5127a;
                    l6Var.e(i10);
                    System.arraycopy(l6Var2.f5128b, 0, l6Var.f5128b, l6Var.f5127a, l6Var2.f5127a);
                    System.arraycopy(l6Var2.f5129c, 0, l6Var.f5129c, l6Var.f5127a, l6Var2.f5127a);
                    l6Var.f5127a = i10;
                }
            }
        }
        g5Var.zzc = l6Var;
    }

    public static void c(int i5, List list, u5 u5Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) u5Var.f5267a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                x4Var.R(i5, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        x4Var.M(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        x4Var.V(i11);
        while (i10 < list.size()) {
            x4Var.Y(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void d(int i5, List list, u5 u5Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) u5Var.f5267a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                x4Var.P(i5, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        x4Var.M(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        x4Var.V(i11);
        while (i10 < list.size()) {
            x4Var.W(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void e(int i5, List list, u5 u5Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) u5Var.f5267a;
        int i10 = 0;
        if (!(list instanceof t5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    x4Var.Q(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            x4Var.M(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += x4.K(((Long) list.get(i12)).longValue());
            }
            x4Var.V(i11);
            while (i10 < list.size()) {
                x4Var.X(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        t5 t5Var = (t5) list;
        if (!z5) {
            while (i10 < t5Var.f5252c) {
                x4Var.Q(i5, t5Var.b(i10));
                i10++;
            }
            return;
        }
        x4Var.M(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < t5Var.f5252c; i14++) {
            i13 += x4.K(t5Var.b(i14));
        }
        x4Var.V(i13);
        while (i10 < t5Var.f5252c) {
            x4Var.X(t5Var.b(i10));
            i10++;
        }
    }

    public static void f(int i5, List list, u5 u5Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) u5Var.f5267a;
        int i10 = 0;
        if (!(list instanceof t5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    x4Var.Q(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            x4Var.M(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += x4.K(((Long) list.get(i12)).longValue());
            }
            x4Var.V(i11);
            while (i10 < list.size()) {
                x4Var.X(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        t5 t5Var = (t5) list;
        if (!z5) {
            while (i10 < t5Var.f5252c) {
                x4Var.Q(i5, t5Var.b(i10));
                i10++;
            }
            return;
        }
        x4Var.M(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < t5Var.f5252c; i14++) {
            i13 += x4.K(t5Var.b(i14));
        }
        x4Var.V(i13);
        while (i10 < t5Var.f5252c) {
            x4Var.X(t5Var.b(i10));
            i10++;
        }
    }

    public static void g(int i5, List list, u5 u5Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) u5Var.f5267a;
        int i10 = 0;
        if (!(list instanceof t5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    long longValue = ((Long) list.get(i10)).longValue();
                    x4Var.Q(i5, (longValue >> 63) ^ (longValue + longValue));
                    i10++;
                }
                return;
            }
            x4Var.M(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long longValue2 = ((Long) list.get(i12)).longValue();
                i11 += x4.K((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            x4Var.V(i11);
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                x4Var.X((longValue3 >> 63) ^ (longValue3 + longValue3));
                i10++;
            }
            return;
        }
        t5 t5Var = (t5) list;
        if (!z5) {
            while (i10 < t5Var.f5252c) {
                long b10 = t5Var.b(i10);
                x4Var.Q(i5, (b10 >> 63) ^ (b10 + b10));
                i10++;
            }
            return;
        }
        x4Var.M(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < t5Var.f5252c; i14++) {
            long b11 = t5Var.b(i14);
            i13 += x4.K((b11 >> 63) ^ (b11 + b11));
        }
        x4Var.V(i13);
        while (i10 < t5Var.f5252c) {
            long b12 = t5Var.b(i10);
            x4Var.X((b12 >> 63) ^ (b12 + b12));
            i10++;
        }
    }

    public static void h(int i5, List list, u5 u5Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) u5Var.f5267a;
        int i10 = 0;
        if (!(list instanceof t5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    x4Var.R(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            x4Var.M(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            x4Var.V(i11);
            while (i10 < list.size()) {
                x4Var.Y(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        t5 t5Var = (t5) list;
        if (!z5) {
            while (i10 < t5Var.f5252c) {
                x4Var.R(i5, t5Var.b(i10));
                i10++;
            }
            return;
        }
        x4Var.M(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < t5Var.f5252c; i14++) {
            t5Var.b(i14);
            i13 += 8;
        }
        x4Var.V(i13);
        while (i10 < t5Var.f5252c) {
            x4Var.Y(t5Var.b(i10));
            i10++;
        }
    }

    public static void i(int i5, List list, u5 u5Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) u5Var.f5267a;
        int i10 = 0;
        if (!(list instanceof t5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    x4Var.R(i5, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            x4Var.M(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            x4Var.V(i11);
            while (i10 < list.size()) {
                x4Var.Y(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        t5 t5Var = (t5) list;
        if (!z5) {
            while (i10 < t5Var.f5252c) {
                x4Var.R(i5, t5Var.b(i10));
                i10++;
            }
            return;
        }
        x4Var.M(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < t5Var.f5252c; i14++) {
            t5Var.b(i14);
            i13 += 8;
        }
        x4Var.V(i13);
        while (i10 < t5Var.f5252c) {
            x4Var.Y(t5Var.b(i10));
            i10++;
        }
    }

    public static void j(int i5, List list, u5 u5Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) u5Var.f5267a;
        int i10 = 0;
        if (!(list instanceof h5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    x4Var.N(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            x4Var.M(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += x4.K(((Integer) list.get(i12)).intValue());
            }
            x4Var.V(i11);
            while (i10 < list.size()) {
                x4Var.U(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z5) {
            while (i10 < h5Var.f5076c) {
                x4Var.N(i5, h5Var.c(i10));
                i10++;
            }
            return;
        }
        x4Var.M(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < h5Var.f5076c; i14++) {
            i13 += x4.K(h5Var.c(i14));
        }
        x4Var.V(i13);
        while (i10 < h5Var.f5076c) {
            x4Var.U(h5Var.c(i10));
            i10++;
        }
    }

    public static void k(int i5, List list, u5 u5Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) u5Var.f5267a;
        int i10 = 0;
        if (!(list instanceof h5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    x4Var.O(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            x4Var.M(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += x4.b0(((Integer) list.get(i12)).intValue());
            }
            x4Var.V(i11);
            while (i10 < list.size()) {
                x4Var.V(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z5) {
            while (i10 < h5Var.f5076c) {
                x4Var.O(i5, h5Var.c(i10));
                i10++;
            }
            return;
        }
        x4Var.M(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < h5Var.f5076c; i14++) {
            i13 += x4.b0(h5Var.c(i14));
        }
        x4Var.V(i13);
        while (i10 < h5Var.f5076c) {
            x4Var.V(h5Var.c(i10));
            i10++;
        }
    }

    public static void l(int i5, List list, u5 u5Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) u5Var.f5267a;
        int i10 = 0;
        if (!(list instanceof h5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    int intValue = ((Integer) list.get(i10)).intValue();
                    x4Var.O(i5, (intValue >> 31) ^ (intValue + intValue));
                    i10++;
                }
                return;
            }
            x4Var.M(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue2 = ((Integer) list.get(i12)).intValue();
                i11 += x4.b0((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            x4Var.V(i11);
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                x4Var.V((intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z5) {
            while (i10 < h5Var.f5076c) {
                int c2 = h5Var.c(i10);
                x4Var.O(i5, (c2 >> 31) ^ (c2 + c2));
                i10++;
            }
            return;
        }
        x4Var.M(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < h5Var.f5076c; i14++) {
            int c8 = h5Var.c(i14);
            i13 += x4.b0((c8 >> 31) ^ (c8 + c8));
        }
        x4Var.V(i13);
        while (i10 < h5Var.f5076c) {
            int c10 = h5Var.c(i10);
            x4Var.V((c10 >> 31) ^ (c10 + c10));
            i10++;
        }
    }

    public static void m(int i5, List list, u5 u5Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) u5Var.f5267a;
        int i10 = 0;
        if (!(list instanceof h5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    x4Var.P(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            x4Var.M(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            x4Var.V(i11);
            while (i10 < list.size()) {
                x4Var.W(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z5) {
            while (i10 < h5Var.f5076c) {
                x4Var.P(i5, h5Var.c(i10));
                i10++;
            }
            return;
        }
        x4Var.M(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < h5Var.f5076c; i14++) {
            h5Var.c(i14);
            i13 += 4;
        }
        x4Var.V(i13);
        while (i10 < h5Var.f5076c) {
            x4Var.W(h5Var.c(i10));
            i10++;
        }
    }

    public static void n(int i5, List list, u5 u5Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) u5Var.f5267a;
        int i10 = 0;
        if (!(list instanceof h5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    x4Var.P(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            x4Var.M(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            x4Var.V(i11);
            while (i10 < list.size()) {
                x4Var.W(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z5) {
            while (i10 < h5Var.f5076c) {
                x4Var.P(i5, h5Var.c(i10));
                i10++;
            }
            return;
        }
        x4Var.M(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < h5Var.f5076c; i14++) {
            h5Var.c(i14);
            i13 += 4;
        }
        x4Var.V(i13);
        while (i10 < h5Var.f5076c) {
            x4Var.W(h5Var.c(i10));
            i10++;
        }
    }

    public static void o(int i5, List list, u5 u5Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) u5Var.f5267a;
        int i10 = 0;
        if (!(list instanceof h5)) {
            if (!z5) {
                while (i10 < list.size()) {
                    x4Var.N(i5, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            x4Var.M(i5, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += x4.K(((Integer) list.get(i12)).intValue());
            }
            x4Var.V(i11);
            while (i10 < list.size()) {
                x4Var.U(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z5) {
            while (i10 < h5Var.f5076c) {
                x4Var.N(i5, h5Var.c(i10));
                i10++;
            }
            return;
        }
        x4Var.M(i5, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < h5Var.f5076c; i14++) {
            i13 += x4.K(h5Var.c(i14));
        }
        x4Var.V(i13);
        while (i10 < h5Var.f5076c) {
            x4Var.U(h5Var.c(i10));
            i10++;
        }
    }

    public static void p(int i5, List list, u5 u5Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) u5Var.f5267a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i10)).booleanValue();
                x4Var.V(i5 << 3);
                x4Var.T(booleanValue ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        x4Var.M(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            i11++;
        }
        x4Var.V(i11);
        while (i10 < list.size()) {
            x4Var.T(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t5)) {
            int i10 = 0;
            while (i5 < size) {
                i10 += x4.K(((Long) list.get(i5)).longValue());
                i5++;
            }
            return i10;
        }
        t5 t5Var = (t5) list;
        int i11 = 0;
        while (i5 < size) {
            i11 += x4.K(t5Var.b(i5));
            i5++;
        }
        return i11;
    }

    public static int r(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t5)) {
            int i10 = 0;
            while (i5 < size) {
                i10 += x4.K(((Long) list.get(i5)).longValue());
                i5++;
            }
            return i10;
        }
        t5 t5Var = (t5) list;
        int i11 = 0;
        while (i5 < size) {
            i11 += x4.K(t5Var.b(i5));
            i5++;
        }
        return i11;
    }

    public static int s(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t5)) {
            int i10 = 0;
            while (i5 < size) {
                long longValue = ((Long) list.get(i5)).longValue();
                i10 += x4.K((longValue >> 63) ^ (longValue + longValue));
                i5++;
            }
            return i10;
        }
        t5 t5Var = (t5) list;
        int i11 = 0;
        while (i5 < size) {
            long b10 = t5Var.b(i5);
            i11 += x4.K((b10 >> 63) ^ (b10 + b10));
            i5++;
        }
        return i11;
    }

    public static int t(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h5)) {
            int i10 = 0;
            while (i5 < size) {
                i10 += x4.K(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i10;
        }
        h5 h5Var = (h5) list;
        int i11 = 0;
        while (i5 < size) {
            i11 += x4.K(h5Var.c(i5));
            i5++;
        }
        return i11;
    }

    public static int u(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h5)) {
            int i10 = 0;
            while (i5 < size) {
                i10 += x4.K(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i10;
        }
        h5 h5Var = (h5) list;
        int i11 = 0;
        while (i5 < size) {
            i11 += x4.K(h5Var.c(i5));
            i5++;
        }
        return i11;
    }

    public static int v(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h5)) {
            int i10 = 0;
            while (i5 < size) {
                i10 += x4.b0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i10;
        }
        h5 h5Var = (h5) list;
        int i11 = 0;
        while (i5 < size) {
            i11 += x4.b0(h5Var.c(i5));
            i5++;
        }
        return i11;
    }

    public static int w(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h5)) {
            int i10 = 0;
            while (i5 < size) {
                int intValue = ((Integer) list.get(i5)).intValue();
                i10 += x4.b0((intValue >> 31) ^ (intValue + intValue));
                i5++;
            }
            return i10;
        }
        h5 h5Var = (h5) list;
        int i11 = 0;
        while (i5 < size) {
            int c2 = h5Var.c(i5);
            i11 += x4.b0((c2 >> 31) ^ (c2 + c2));
            i5++;
        }
        return i11;
    }

    public static int x(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x4.b0(i5 << 3) + 4) * size;
    }

    public static int y(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x4.b0(i5 << 3) + 8) * size;
    }
}
