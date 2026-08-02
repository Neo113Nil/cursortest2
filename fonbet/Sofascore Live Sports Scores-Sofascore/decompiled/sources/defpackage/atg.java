package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class atg {
    public static final Class a;
    public static final zbk b;
    public static final zbk c;

    static {
        Class<?> cls;
        Class<?> cls2;
        kff kffVar = kff.c;
        zbk zbkVar = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            kff kffVar2 = kff.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                zbkVar = (zbk) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = zbkVar;
        c = new zbk();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += h03.j(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (h03.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (h03.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += h03.j(((Integer) list.get(i2)).intValue());
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
            i += h03.j(((Long) list.get(i2)).longValue());
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
            i += h03.i((intValue >> 31) ^ (intValue << 1));
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
            i += h03.j((longValue >> 63) ^ (longValue << 1));
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
            i += h03.i(((Integer) list.get(i2)).intValue());
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
            i += h03.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void k(zbk zbkVar, Object obj, Object obj2) {
        zbkVar.getClass();
        hw8 hw8Var = (hw8) obj;
        xbk xbkVar = hw8Var.unknownFields;
        xbk xbkVar2 = ((hw8) obj2).unknownFields;
        xbk xbkVar3 = xbk.f;
        if (!xbkVar3.equals(xbkVar2)) {
            if (xbkVar3.equals(xbkVar)) {
                int i = xbkVar.a + xbkVar2.a;
                int[] copyOf = Arrays.copyOf(xbkVar.b, i);
                System.arraycopy(xbkVar2.b, 0, copyOf, xbkVar.a, xbkVar2.a);
                Object[] copyOf2 = Arrays.copyOf(xbkVar.c, i);
                System.arraycopy(xbkVar2.c, 0, copyOf2, xbkVar.a, xbkVar2.a);
                xbkVar = new xbk(i, copyOf, copyOf2, true);
            } else {
                xbkVar.getClass();
                if (!xbkVar2.equals(xbkVar3)) {
                    if (!xbkVar.e) {
                        a70.i();
                        return;
                    }
                    int i2 = xbkVar.a + xbkVar2.a;
                    xbkVar.a(i2);
                    System.arraycopy(xbkVar2.b, 0, xbkVar.b, xbkVar.a, xbkVar2.a);
                    System.arraycopy(xbkVar2.c, 0, xbkVar.c, xbkVar.a, xbkVar2.a);
                    xbkVar.a = i2;
                }
            }
        }
        hw8Var.unknownFields = xbkVar;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, t9d t9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h03 h03Var = (h03) t9dVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h03Var.o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        h03Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        h03Var.D(i3);
        while (i2 < list.size()) {
            h03Var.m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, t9d t9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h03 h03Var = (h03) t9dVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h03Var.t(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        h03Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        h03Var.D(i3);
        while (i2 < list.size()) {
            h03Var.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, t9d t9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h03 h03Var = (h03) t9dVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h03Var.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h03Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += h03.j(((Integer) list.get(i4)).intValue());
        }
        h03Var.D(i3);
        while (i2 < list.size()) {
            h03Var.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, t9d t9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h03 h03Var = (h03) t9dVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h03Var.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h03Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        h03Var.D(i3);
        while (i2 < list.size()) {
            h03Var.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, t9d t9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h03 h03Var = (h03) t9dVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h03Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        h03Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        h03Var.D(i3);
        while (i2 < list.size()) {
            h03Var.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, t9d t9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h03 h03Var = (h03) t9dVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h03Var.r(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        h03Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        h03Var.D(i3);
        while (i2 < list.size()) {
            h03Var.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, t9d t9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h03 h03Var = (h03) t9dVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h03Var.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h03Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += h03.j(((Integer) list.get(i4)).intValue());
        }
        h03Var.D(i3);
        while (i2 < list.size()) {
            h03Var.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, t9d t9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h03 h03Var = (h03) t9dVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h03Var.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        h03Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += h03.j(((Long) list.get(i4)).longValue());
        }
        h03Var.D(i3);
        while (i2 < list.size()) {
            h03Var.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, t9d t9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h03 h03Var = (h03) t9dVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h03Var.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h03Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        h03Var.D(i3);
        while (i2 < list.size()) {
            h03Var.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, t9d t9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h03 h03Var = (h03) t9dVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h03Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        h03Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        h03Var.D(i3);
        while (i2 < list.size()) {
            h03Var.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, t9d t9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h03 h03Var = (h03) t9dVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                h03Var.C(i, (intValue >> 31) ^ (intValue << 1));
                i2++;
            }
            return;
        }
        h03Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += h03.i((intValue2 >> 31) ^ (intValue2 << 1));
        }
        h03Var.D(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            h03Var.D((intValue3 >> 31) ^ (intValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, t9d t9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h03 h03Var = (h03) t9dVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                h03Var.E(i, (longValue >> 63) ^ (longValue << 1));
                i2++;
            }
            return;
        }
        h03Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += h03.j((longValue2 >> 63) ^ (longValue2 << 1));
        }
        h03Var.D(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            h03Var.F((longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, t9d t9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h03 h03Var = (h03) t9dVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h03Var.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h03Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += h03.i(((Integer) list.get(i4)).intValue());
        }
        h03Var.D(i3);
        while (i2 < list.size()) {
            h03Var.D(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, t9d t9dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h03 h03Var = (h03) t9dVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                h03Var.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        h03Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += h03.j(((Long) list.get(i4)).longValue());
        }
        h03Var.D(i3);
        while (i2 < list.size()) {
            h03Var.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object j(Object obj, int i, t7a t7aVar, Object obj2, zbk zbkVar) {
        return obj2;
    }
}
