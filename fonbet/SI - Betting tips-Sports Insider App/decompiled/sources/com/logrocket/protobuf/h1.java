package com.logrocket.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f6725a;

    /* renamed from: b, reason: collision with root package name */
    public static final p1 f6726b;

    /* renamed from: c, reason: collision with root package name */
    public static final p1 f6727c;

    static {
        Class<?> cls;
        Class<?> cls2;
        p1 p1Var = null;
        try {
            cls = Class.forName("com.logrocket.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f6725a = cls;
        try {
            cls2 = Class.forName("com.logrocket.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                p1Var = (p1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f6726b = p1Var;
        f6727c = new p1();
    }

    public static void A(int i5, List list, n0 n0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f6757a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                pVar.E(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        pVar.K(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += p.l(((Integer) list.get(i12)).intValue());
        }
        pVar.M(i11);
        while (i10 < list.size()) {
            pVar.F(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void B(int i5, List list, n0 n0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f6757a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                pVar.A(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        pVar.K(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = p.f6773d;
            i11 += 4;
        }
        pVar.M(i11);
        while (i10 < list.size()) {
            pVar.B(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void C(int i5, List list, n0 n0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f6757a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                pVar.C(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        pVar.K(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = p.f6773d;
            i11 += 8;
        }
        pVar.M(i11);
        while (i10 < list.size()) {
            pVar.D(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void D(int i5, List list, n0 n0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f6757a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                float floatValue = ((Float) list.get(i10)).floatValue();
                pVar.getClass();
                pVar.A(i5, Float.floatToRawIntBits(floatValue));
                i10++;
            }
            return;
        }
        pVar.K(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            Logger logger = p.f6773d;
            i11 += 4;
        }
        pVar.M(i11);
        while (i10 < list.size()) {
            pVar.B(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void E(int i5, List list, n0 n0Var, g1 g1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            n0Var.c(i5, list.get(i10), g1Var);
        }
    }

    public static void F(int i5, List list, n0 n0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f6757a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                pVar.E(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        pVar.K(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += p.l(((Integer) list.get(i12)).intValue());
        }
        pVar.M(i11);
        while (i10 < list.size()) {
            pVar.F(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void G(int i5, List list, n0 n0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f6757a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                pVar.N(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        pVar.K(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += p.q(((Long) list.get(i12)).longValue());
        }
        pVar.M(i11);
        while (i10 < list.size()) {
            pVar.O(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void H(int i5, List list, n0 n0Var, g1 g1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((p) n0Var.f6757a).G(i5, (a) list.get(i10), g1Var);
        }
    }

    public static void I(int i5, List list, n0 n0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f6757a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                pVar.A(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        pVar.K(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = p.f6773d;
            i11 += 4;
        }
        pVar.M(i11);
        while (i10 < list.size()) {
            pVar.B(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void J(int i5, List list, n0 n0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f6757a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                pVar.C(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        pVar.K(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = p.f6773d;
            i11 += 8;
        }
        pVar.M(i11);
        while (i10 < list.size()) {
            pVar.D(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void K(int i5, List list, n0 n0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f6757a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                pVar.L(i5, (intValue >> 31) ^ (intValue << 1));
                i10++;
            }
            return;
        }
        pVar.K(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += p.m(((Integer) list.get(i12)).intValue());
        }
        pVar.M(i11);
        while (i10 < list.size()) {
            int intValue2 = ((Integer) list.get(i10)).intValue();
            pVar.M((intValue2 >> 31) ^ (intValue2 << 1));
            i10++;
        }
    }

    public static void L(int i5, List list, n0 n0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f6757a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                long longValue = ((Long) list.get(i10)).longValue();
                pVar.N(i5, (longValue >> 63) ^ (longValue << 1));
                i10++;
            }
            return;
        }
        pVar.K(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long longValue2 = ((Long) list.get(i12)).longValue();
            i11 += p.q((longValue2 >> 63) ^ (longValue2 << 1));
        }
        pVar.M(i11);
        while (i10 < list.size()) {
            long longValue3 = ((Long) list.get(i10)).longValue();
            pVar.O((longValue3 >> 63) ^ (longValue3 << 1));
            i10++;
        }
    }

    public static void M(int i5, List list, n0 n0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f6757a;
        int i10 = 0;
        if (!(list instanceof i0)) {
            while (i10 < list.size()) {
                pVar.I(i5, (String) list.get(i10));
                i10++;
            }
            return;
        }
        i0 i0Var = (i0) list;
        while (i10 < list.size()) {
            Object k0 = i0Var.k0(i10);
            if (k0 instanceof String) {
                pVar.I(i5, (String) k0);
            } else {
                pVar.y(i5, (j) k0);
            }
            i10++;
        }
    }

    public static void N(int i5, List list, n0 n0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f6757a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                pVar.L(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        pVar.K(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += p.p(((Integer) list.get(i12)).intValue());
        }
        pVar.M(i11);
        while (i10 < list.size()) {
            pVar.M(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void O(int i5, List list, n0 n0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f6757a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                pVar.N(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        pVar.K(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += p.q(((Long) list.get(i12)).longValue());
        }
        pVar.M(i11);
        while (i10 < list.size()) {
            pVar.O(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static int a(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int o3 = p.o(i5) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            o3 += p.h((j) list.get(i10));
        }
        return o3;
    }

    public static int b(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p.o(i5) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a0)) {
            int i10 = 0;
            while (i5 < size) {
                i10 += p.l(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i10;
        }
        a0 a0Var = (a0) list;
        int i11 = 0;
        while (i5 < size) {
            a0Var.b(i5);
            i11 += p.l(a0Var.f6662b[i5]);
            i5++;
        }
        return i11;
    }

    public static int d(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return p.i(i5) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return p.j(i5) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p.o(i5) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a0)) {
            int i10 = 0;
            while (i5 < size) {
                i10 += p.l(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i10;
        }
        a0 a0Var = (a0) list;
        int i11 = 0;
        while (i5 < size) {
            a0Var.b(i5);
            i11 += p.l(a0Var.f6662b[i5]);
            i5++;
        }
        return i11;
    }

    public static int j(int i5, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (p.o(i5) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i5 += p.q(((Long) list.get(i10)).longValue());
        }
        return i5;
    }

    public static int l(int i5, List list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int o3 = p.o(i5) * size;
        for (int i10 = 0; i10 < size; i10++) {
            int b10 = ((a) list.get(i10)).b(g1Var);
            o3 += p.p(b10) + b10;
        }
        return o3;
    }

    public static int m(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p.o(i5) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a0)) {
            int i10 = 0;
            while (i5 < size) {
                i10 += p.m(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i10;
        }
        a0 a0Var = (a0) list;
        int i11 = 0;
        while (i5 < size) {
            a0Var.b(i5);
            i11 += p.m(a0Var.f6662b[i5]);
            i5++;
        }
        return i11;
    }

    public static int o(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p.o(i5) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) list.get(i10)).longValue();
            i5 += p.q((longValue >> 63) ^ (longValue << 1));
        }
        return i5;
    }

    public static int q(int i5, List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int o3 = p.o(i5) * size;
        if (!(list instanceof i0)) {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof j) {
                    int size2 = ((j) obj).size();
                    o3 = p.p(size2) + size2 + o3;
                } else {
                    o3 = p.n((String) obj) + o3;
                }
                i10++;
            }
            return o3;
        }
        i0 i0Var = (i0) list;
        while (i10 < size) {
            Object k0 = i0Var.k0(i10);
            if (k0 instanceof j) {
                int size3 = ((j) k0).size();
                o3 = p.p(size3) + size3 + o3;
            } else {
                o3 = p.n((String) k0) + o3;
            }
            i10++;
        }
        return o3;
    }

    public static int r(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p.o(i5) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a0)) {
            int i10 = 0;
            while (i5 < size) {
                i10 += p.p(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return i10;
        }
        a0 a0Var = (a0) list;
        int i11 = 0;
        while (i5 < size) {
            a0Var.b(i5);
            i11 += p.p(a0Var.f6662b[i5]);
            i5++;
        }
        return i11;
    }

    public static int t(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p.o(i5) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i5 += p.q(((Long) list.get(i10)).longValue());
        }
        return i5;
    }

    public static void v(p1 p1Var, Object obj, Object obj2) {
        p1Var.getClass();
        z zVar = (z) obj;
        o1 o1Var = zVar.unknownFields;
        o1 o1Var2 = ((z) obj2).unknownFields;
        o1 o1Var3 = o1.f6767f;
        if (!o1Var3.equals(o1Var2)) {
            if (o1Var3.equals(o1Var)) {
                int i5 = o1Var.f6768a + o1Var2.f6768a;
                int[] copyOf = Arrays.copyOf(o1Var.f6769b, i5);
                System.arraycopy(o1Var2.f6769b, 0, copyOf, o1Var.f6768a, o1Var2.f6768a);
                Object[] copyOf2 = Arrays.copyOf(o1Var.f6770c, i5);
                System.arraycopy(o1Var2.f6770c, 0, copyOf2, o1Var.f6768a, o1Var2.f6768a);
                o1Var = new o1(i5, copyOf, copyOf2, true);
            } else {
                o1Var.getClass();
                if (!o1Var2.equals(o1Var3)) {
                    if (!o1Var.f6772e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = o1Var.f6768a;
                    int i11 = o1Var2.f6768a + i10;
                    int[] iArr = o1Var.f6769b;
                    if (i11 > iArr.length) {
                        int i12 = (i10 / 2) + i10;
                        if (i12 < i11) {
                            i12 = i11;
                        }
                        if (i12 < 8) {
                            i12 = 8;
                        }
                        o1Var.f6769b = Arrays.copyOf(iArr, i12);
                        o1Var.f6770c = Arrays.copyOf(o1Var.f6770c, i12);
                    }
                    System.arraycopy(o1Var2.f6769b, 0, o1Var.f6769b, o1Var.f6768a, o1Var2.f6768a);
                    System.arraycopy(o1Var2.f6770c, 0, o1Var.f6770c, o1Var.f6768a, o1Var2.f6768a);
                    o1Var.f6768a = i11;
                }
            }
        }
        zVar.unknownFields = o1Var;
    }

    public static boolean w(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void x(int i5, List list, n0 n0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f6757a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                pVar.w(i5, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        pVar.K(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            Logger logger = p.f6773d;
            i11++;
        }
        pVar.M(i11);
        while (i10 < list.size()) {
            pVar.v(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void y(int i5, List list, n0 n0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n0Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((p) n0Var.f6757a).y(i5, (j) list.get(i10));
        }
    }

    public static void z(int i5, List list, n0 n0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p pVar = (p) n0Var.f6757a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                double doubleValue = ((Double) list.get(i10)).doubleValue();
                pVar.getClass();
                pVar.C(i5, Double.doubleToRawLongBits(doubleValue));
                i10++;
            }
            return;
        }
        pVar.K(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            Logger logger = p.f6773d;
            i11 += 8;
        }
        pVar.M(i11);
        while (i10 < list.size()) {
            pVar.D(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }
}
