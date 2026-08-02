package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f1729a;

    /* renamed from: b, reason: collision with root package name */
    public static final f1 f1730b;

    /* renamed from: c, reason: collision with root package name */
    public static final f1 f1731c;

    static {
        Class<?> cls;
        Class<?> cls2;
        u0 u0Var = u0.f1715c;
        f1 f1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f1729a = cls;
        try {
            u0 u0Var2 = u0.f1715c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                f1Var = (f1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f1730b = f1Var;
        f1731c = new f1();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i5 += o.g0(((Integer) list.get(i10)).intValue());
        }
        return i5;
    }

    public static int b(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o.e0(i5) + 4) * size;
    }

    public static int c(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o.e0(i5) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i5 += o.g0(((Integer) list.get(i10)).intValue());
        }
        return i5;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i5 += o.g0(((Long) list.get(i10)).longValue());
        }
        return i5;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int intValue = ((Integer) list.get(i10)).intValue();
            i5 += o.f0((intValue >> 31) ^ (intValue << 1));
        }
        return i5;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) list.get(i10)).longValue();
            i5 += o.g0((longValue >> 63) ^ (longValue << 1));
        }
        return i5;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i5 += o.f0(((Integer) list.get(i10)).intValue());
        }
        return i5;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i5 += o.g0(((Long) list.get(i10)).longValue());
        }
        return i5;
    }

    public static void k(f1 f1Var, Object obj, Object obj2) {
        f1Var.getClass();
        y yVar = (y) obj;
        e1 e1Var = yVar.unknownFields;
        e1 e1Var2 = ((y) obj2).unknownFields;
        e1 e1Var3 = e1.f1603f;
        if (!e1Var3.equals(e1Var2)) {
            if (e1Var3.equals(e1Var)) {
                int i5 = e1Var.f1604a + e1Var2.f1604a;
                int[] copyOf = Arrays.copyOf(e1Var.f1605b, i5);
                System.arraycopy(e1Var2.f1605b, 0, copyOf, e1Var.f1604a, e1Var2.f1604a);
                Object[] copyOf2 = Arrays.copyOf(e1Var.f1606c, i5);
                System.arraycopy(e1Var2.f1606c, 0, copyOf2, e1Var.f1604a, e1Var2.f1604a);
                e1Var = new e1(i5, copyOf, copyOf2, true);
            } else {
                e1Var.getClass();
                if (!e1Var2.equals(e1Var3)) {
                    if (!e1Var.f1608e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = e1Var.f1604a + e1Var2.f1604a;
                    e1Var.a(i10);
                    System.arraycopy(e1Var2.f1605b, 0, e1Var.f1605b, e1Var.f1604a, e1Var2.f1604a);
                    System.arraycopy(e1Var2.f1606c, 0, e1Var.f1606c, e1Var.f1604a, e1Var2.f1604a);
                    e1Var.f1604a = i10;
                }
            }
        }
        yVar.unknownFields = e1Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i5, List list, h0 h0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) h0Var.f1616a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                oVar.l0(i5, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        oVar.x0(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            Logger logger = o.f1660f;
            i11++;
        }
        oVar.z0(i11);
        while (i10 < list.size()) {
            oVar.j0(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void n(int i5, List list, h0 h0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) h0Var.f1616a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                double doubleValue = ((Double) list.get(i10)).doubleValue();
                oVar.getClass();
                oVar.q0(i5, Double.doubleToRawLongBits(doubleValue));
                i10++;
            }
            return;
        }
        oVar.x0(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            Logger logger = o.f1660f;
            i11 += 8;
        }
        oVar.z0(i11);
        while (i10 < list.size()) {
            oVar.r0(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void o(int i5, List list, h0 h0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) h0Var.f1616a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                oVar.s0(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        oVar.x0(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += o.g0(((Integer) list.get(i12)).intValue());
        }
        oVar.z0(i11);
        while (i10 < list.size()) {
            oVar.t0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void p(int i5, List list, h0 h0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) h0Var.f1616a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                oVar.o0(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        oVar.x0(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = o.f1660f;
            i11 += 4;
        }
        oVar.z0(i11);
        while (i10 < list.size()) {
            oVar.p0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void q(int i5, List list, h0 h0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) h0Var.f1616a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                oVar.q0(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        oVar.x0(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = o.f1660f;
            i11 += 8;
        }
        oVar.z0(i11);
        while (i10 < list.size()) {
            oVar.r0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void r(int i5, List list, h0 h0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) h0Var.f1616a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                float floatValue = ((Float) list.get(i10)).floatValue();
                oVar.getClass();
                oVar.o0(i5, Float.floatToRawIntBits(floatValue));
                i10++;
            }
            return;
        }
        oVar.x0(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            Logger logger = o.f1660f;
            i11 += 4;
        }
        oVar.z0(i11);
        while (i10 < list.size()) {
            oVar.p0(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void s(int i5, List list, h0 h0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) h0Var.f1616a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                oVar.s0(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        oVar.x0(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += o.g0(((Integer) list.get(i12)).intValue());
        }
        oVar.z0(i11);
        while (i10 < list.size()) {
            oVar.t0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void t(int i5, List list, h0 h0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) h0Var.f1616a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                oVar.A0(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        oVar.x0(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += o.g0(((Long) list.get(i12)).longValue());
        }
        oVar.z0(i11);
        while (i10 < list.size()) {
            oVar.B0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void u(int i5, List list, h0 h0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) h0Var.f1616a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                oVar.o0(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        oVar.x0(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = o.f1660f;
            i11 += 4;
        }
        oVar.z0(i11);
        while (i10 < list.size()) {
            oVar.p0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void v(int i5, List list, h0 h0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) h0Var.f1616a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                oVar.q0(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        oVar.x0(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = o.f1660f;
            i11 += 8;
        }
        oVar.z0(i11);
        while (i10 < list.size()) {
            oVar.r0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void w(int i5, List list, h0 h0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) h0Var.f1616a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                oVar.y0(i5, (intValue >> 31) ^ (intValue << 1));
                i10++;
            }
            return;
        }
        oVar.x0(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int intValue2 = ((Integer) list.get(i12)).intValue();
            i11 += o.f0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        oVar.z0(i11);
        while (i10 < list.size()) {
            int intValue3 = ((Integer) list.get(i10)).intValue();
            oVar.z0((intValue3 >> 31) ^ (intValue3 << 1));
            i10++;
        }
    }

    public static void x(int i5, List list, h0 h0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) h0Var.f1616a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                long longValue = ((Long) list.get(i10)).longValue();
                oVar.A0(i5, (longValue >> 63) ^ (longValue << 1));
                i10++;
            }
            return;
        }
        oVar.x0(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long longValue2 = ((Long) list.get(i12)).longValue();
            i11 += o.g0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        oVar.z0(i11);
        while (i10 < list.size()) {
            long longValue3 = ((Long) list.get(i10)).longValue();
            oVar.B0((longValue3 >> 63) ^ (longValue3 << 1));
            i10++;
        }
    }

    public static void y(int i5, List list, h0 h0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) h0Var.f1616a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                oVar.y0(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        oVar.x0(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += o.f0(((Integer) list.get(i12)).intValue());
        }
        oVar.z0(i11);
        while (i10 < list.size()) {
            oVar.z0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void z(int i5, List list, h0 h0Var, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) h0Var.f1616a;
        int i10 = 0;
        if (!z5) {
            while (i10 < list.size()) {
                oVar.A0(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        oVar.x0(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += o.g0(((Long) list.get(i12)).longValue());
        }
        oVar.z0(i11);
        while (i10 < list.size()) {
            oVar.B0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static Object j(Object obj, int i5, z zVar, Object obj2, f1 f1Var) {
        return obj2;
    }
}
