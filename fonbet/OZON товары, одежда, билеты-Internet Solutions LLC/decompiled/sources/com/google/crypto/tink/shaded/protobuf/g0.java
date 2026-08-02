package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5919z;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f59370a;

    /* renamed from: b, reason: collision with root package name */
    private static final m0<?, ?> f59371b;

    /* renamed from: c, reason: collision with root package name */
    private static final o0 f59372c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f59373d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        int i11 = c0.f59349d;
        m0<?, ?> m0Var = null;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f59370a = cls;
        try {
            int i12 = c0.f59349d;
            try {
                cls2 = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                m0Var = (m0) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (Throwable unused3) {
        }
        f59371b = m0Var;
        f59372c = new o0();
    }

    public static void A(int i11, List<Long> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5907m) t0Var).B(i11, list, z11);
    }

    public static void B(int i11, List<Integer> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5907m) t0Var).D(i11, list, z11);
    }

    public static void C(int i11, List<Long> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5907m) t0Var).F(i11, list, z11);
    }

    public static void D(int i11, List<Integer> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5907m) t0Var).K(i11, list, z11);
    }

    public static void E(int i11, List<Long> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5907m) t0Var).M(i11, list, z11);
    }

    static int a(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5918y)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += AbstractC5906l.k(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        C5918y c5918y = (C5918y) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += AbstractC5906l.k(c5918y.getInt(i11));
            i11++;
        }
        return i13;
    }

    static int b(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC5906l.i(i11) + 4) * size;
    }

    static int c(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC5906l.i(i11) + 8) * size;
    }

    static int d(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5918y)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += AbstractC5906l.k(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        C5918y c5918y = (C5918y) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += AbstractC5906l.k(c5918y.getInt(i11));
            i11++;
        }
        return i13;
    }

    static int e(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof I)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += AbstractC5906l.k(list.get(i11).longValue());
                i11++;
            }
            return i12;
        }
        I i13 = (I) list;
        int i14 = 0;
        while (i11 < size) {
            i14 += AbstractC5906l.k(i13.getLong(i11));
            i11++;
        }
        return i14;
    }

    static int f(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5918y)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += AbstractC5906l.f(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        C5918y c5918y = (C5918y) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += AbstractC5906l.f(c5918y.getInt(i11));
            i11++;
        }
        return i13;
    }

    static int g(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof I)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += AbstractC5906l.g(list.get(i11).longValue());
                i11++;
            }
            return i12;
        }
        I i13 = (I) list;
        int i14 = 0;
        while (i11 < size) {
            i14 += AbstractC5906l.g(i13.getLong(i11));
            i11++;
        }
        return i14;
    }

    static int h(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5918y)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += AbstractC5906l.j(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        C5918y c5918y = (C5918y) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += AbstractC5906l.j(c5918y.getInt(i11));
            i11++;
        }
        return i13;
    }

    static int i(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof I)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += AbstractC5906l.k(list.get(i11).longValue());
                i11++;
            }
            return i12;
        }
        I i13 = (I) list;
        int i14 = 0;
        while (i11 < size) {
            i14 += AbstractC5906l.k(i13.getLong(i11));
            i11++;
        }
        return i14;
    }

    static <UT, UB> UB j(Object obj, int i11, List<Integer> list, C5919z.c cVar, UB ub2, m0<UT, UB> m0Var) {
        if (cVar == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (!cVar.a()) {
                    ub2 = (UB) m(obj, i11, intValue, ub2, m0Var);
                    it.remove();
                }
            }
            return ub2;
        }
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Integer num = list.get(i13);
            int intValue2 = num.intValue();
            if (cVar.a()) {
                if (i13 != i12) {
                    list.set(i12, num);
                }
                i12++;
            } else {
                ub2 = (UB) m(obj, i11, intValue2, ub2, m0Var);
            }
        }
        if (i12 != size) {
            list.subList(i12, size).clear();
        }
        return ub2;
    }

    public static void k(Class<?> cls) {
        if (AbstractC5917x.class.isAssignableFrom(cls)) {
            return;
        }
        int i11 = c0.f59349d;
        Class<?> cls2 = f59370a;
        if (cls2 != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <UT, UB> UB m(Object obj, int i11, int i12, UB ub2, m0<UT, UB> m0Var) {
        if (ub2 == null) {
            ub2 = (UB) m0Var.f(obj);
        }
        m0Var.e(ub2, i11, i12);
        return ub2;
    }

    public static m0<?, ?> n() {
        return f59371b;
    }

    public static o0 o() {
        return f59372c;
    }

    public static void p(int i11, List<Boolean> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5907m) t0Var).c(i11, list, z11);
    }

    public static void q(int i11, List<Double> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5907m) t0Var).g(i11, list, z11);
    }

    public static void r(int i11, List<Integer> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5907m) t0Var).j(i11, list, z11);
    }

    public static void s(int i11, List<Integer> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5907m) t0Var).l(i11, list, z11);
    }

    public static void t(int i11, List<Long> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5907m) t0Var).n(i11, list, z11);
    }

    public static void u(int i11, List<Float> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5907m) t0Var).p(i11, list, z11);
    }

    public static void v(int i11, List<?> list, t0 t0Var, f0<?> f0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5907m c5907m = (C5907m) t0Var;
        c5907m.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            c5907m.q(i11, list.get(i12), f0Var);
        }
    }

    public static void w(int i11, List<Integer> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5907m) t0Var).s(i11, list, z11);
    }

    public static void x(int i11, List<Long> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5907m) t0Var).u(i11, list, z11);
    }

    public static void y(int i11, List<?> list, t0 t0Var, f0<?> f0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5907m c5907m = (C5907m) t0Var;
        c5907m.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            c5907m.w(i11, list.get(i12), f0Var);
        }
    }

    public static void z(int i11, List<Integer> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5907m) t0Var).z(i11, list, z11);
    }
}
