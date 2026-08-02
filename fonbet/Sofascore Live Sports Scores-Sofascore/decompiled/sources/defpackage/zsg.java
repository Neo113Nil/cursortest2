package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class zsg {
    public static final Class a;
    public static final ybk b;
    public static final ybk c;

    static {
        Class<?> cls;
        Class<?> cls2;
        hff hffVar = hff.c;
        ybk ybkVar = null;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            hff hffVar2 = hff.c;
            try {
                cls2 = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                ybkVar = (ybk) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = ybkVar;
        c = new ybk();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += g03.j(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (g03.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (g03.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += g03.j(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += g03.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += g03.i((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += g03.j((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += g03.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += g03.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void k(ybk ybkVar, Object obj, Object obj2) {
        ybkVar.getClass();
        gw8 gw8Var = (gw8) obj;
        wbk wbkVar = gw8Var.unknownFields;
        wbk wbkVar2 = ((gw8) obj2).unknownFields;
        wbk wbkVar3 = wbk.f;
        if (!wbkVar3.equals(wbkVar2)) {
            if (wbkVar3.equals(wbkVar)) {
                int i = wbkVar.a + wbkVar2.a;
                int[] copyOf = Arrays.copyOf(wbkVar.b, i);
                System.arraycopy(wbkVar2.b, 0, copyOf, wbkVar.a, wbkVar2.a);
                Object[] copyOf2 = Arrays.copyOf(wbkVar.c, i);
                System.arraycopy(wbkVar2.c, 0, copyOf2, wbkVar.a, wbkVar2.a);
                wbkVar = new wbk(i, copyOf, copyOf2, true);
            } else {
                wbkVar.getClass();
                if (!wbkVar2.equals(wbkVar3)) {
                    if (!wbkVar.e) {
                        a70.i();
                        return;
                    }
                    int i2 = wbkVar.a + wbkVar2.a;
                    wbkVar.a(i2);
                    System.arraycopy(wbkVar2.b, 0, wbkVar.b, wbkVar.a, wbkVar2.a);
                    System.arraycopy(wbkVar2.c, 0, wbkVar.c, wbkVar.a, wbkVar2.a);
                    wbkVar.a = i2;
                }
            }
        }
        gw8Var.unknownFields = wbkVar;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, sz8 sz8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g03 g03Var = (g03) sz8Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                g03Var.n(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        g03Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        g03Var.A(i3);
        while (i2 < list.size()) {
            byte b2 = ((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0;
            if (g03Var.d == g03Var.c) {
                g03Var.k();
            }
            byte[] bArr = g03Var.b;
            int i5 = g03Var.d;
            g03Var.d = i5 + 1;
            bArr[i5] = b2;
            i2++;
        }
    }

    public static void n(int i, List list, sz8 sz8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g03 g03Var = (g03) sz8Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                g03Var.r(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        g03Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        g03Var.A(i3);
        while (i2 < list.size()) {
            g03Var.s(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, sz8 sz8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g03 g03Var = (g03) sz8Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                g03Var.t(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        g03Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += g03.j(((Integer) list.get(i4)).intValue());
        }
        g03Var.A(i3);
        while (i2 < list.size()) {
            g03Var.u(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, sz8 sz8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g03 g03Var = (g03) sz8Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                g03Var.p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        g03Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        g03Var.A(i3);
        while (i2 < list.size()) {
            g03Var.q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, sz8 sz8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g03 g03Var = (g03) sz8Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                g03Var.r(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        g03Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        g03Var.A(i3);
        while (i2 < list.size()) {
            g03Var.s(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, sz8 sz8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g03 g03Var = (g03) sz8Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                g03Var.p(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        g03Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        g03Var.A(i3);
        while (i2 < list.size()) {
            g03Var.q(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, sz8 sz8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g03 g03Var = (g03) sz8Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                g03Var.t(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        g03Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += g03.j(((Integer) list.get(i4)).intValue());
        }
        g03Var.A(i3);
        while (i2 < list.size()) {
            g03Var.u(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, sz8 sz8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g03 g03Var = (g03) sz8Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                g03Var.B(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        g03Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += g03.j(((Long) list.get(i4)).longValue());
        }
        g03Var.A(i3);
        while (i2 < list.size()) {
            g03Var.C(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, sz8 sz8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g03 g03Var = (g03) sz8Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                g03Var.p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        g03Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        g03Var.A(i3);
        while (i2 < list.size()) {
            g03Var.q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, sz8 sz8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g03 g03Var = (g03) sz8Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                g03Var.r(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        g03Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        g03Var.A(i3);
        while (i2 < list.size()) {
            g03Var.s(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, sz8 sz8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g03 g03Var = (g03) sz8Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                g03Var.z(i, (intValue >> 31) ^ (intValue << 1));
                i2++;
            }
            return;
        }
        g03Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += g03.i((intValue2 >> 31) ^ (intValue2 << 1));
        }
        g03Var.A(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            g03Var.A((intValue3 >> 31) ^ (intValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, sz8 sz8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g03 g03Var = (g03) sz8Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                g03Var.B(i, (longValue >> 63) ^ (longValue << 1));
                i2++;
            }
            return;
        }
        g03Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += g03.j((longValue2 >> 63) ^ (longValue2 << 1));
        }
        g03Var.A(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            g03Var.C((longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, sz8 sz8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g03 g03Var = (g03) sz8Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                g03Var.z(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        g03Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += g03.i(((Integer) list.get(i4)).intValue());
        }
        g03Var.A(i3);
        while (i2 < list.size()) {
            g03Var.A(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, sz8 sz8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g03 g03Var = (g03) sz8Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                g03Var.B(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        g03Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += g03.j(((Long) list.get(i4)).longValue());
        }
        g03Var.A(i3);
        while (i2 < list.size()) {
            g03Var.C(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object j(Object obj, int i, s7a s7aVar, Object obj2, ybk ybkVar) {
        return obj2;
    }
}
