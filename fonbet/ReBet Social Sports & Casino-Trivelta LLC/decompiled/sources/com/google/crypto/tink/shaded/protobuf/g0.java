package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC3493z;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f37286a = A();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f37287b = B(false);

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f37288c = B(true);

    /* renamed from: d, reason: collision with root package name */
    public static final k0 f37289d = new m0();

    public static Class A() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static k0 B(boolean z10) {
        try {
            Class C10 = C();
            if (C10 == null) {
                return null;
            }
            return (k0) C10.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class C() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D(AbstractC3485q abstractC3485q, Object obj, Object obj2) {
        AbstractC3487t c10 = abstractC3485q.c(obj2);
        if (c10.d()) {
            return;
        }
        abstractC3485q.d(obj).h(c10);
    }

    public static void E(J j10, Object obj, Object obj2, long j11) {
        o0.R(obj, j11, j10.mergeFrom(o0.C(obj, j11), o0.C(obj2, j11)));
    }

    public static void F(k0 k0Var, Object obj, Object obj2) {
        k0Var.p(obj, k0Var.k(k0Var.g(obj), k0Var.g(obj2)));
    }

    public static k0 G() {
        return f37287b;
    }

    public static k0 H() {
        return f37288c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!AbstractC3491x.class.isAssignableFrom(cls) && (cls2 = f37286a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean J(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object K(Object obj, int i10, int i11, Object obj2, k0 k0Var) {
        if (obj2 == null) {
            obj2 = k0Var.f(obj);
        }
        k0Var.e(obj2, i10, i11);
        return obj2;
    }

    public static k0 L() {
        return f37289d;
    }

    public static void M(int i10, List list, r0 r0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.writeBoolList(i10, list, z10);
    }

    public static void N(int i10, List list, r0 r0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.writeBytesList(i10, list);
    }

    public static void O(int i10, List list, r0 r0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.writeDoubleList(i10, list, z10);
    }

    public static void P(int i10, List list, r0 r0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.writeEnumList(i10, list, z10);
    }

    public static void Q(int i10, List list, r0 r0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.writeFixed32List(i10, list, z10);
    }

    public static void R(int i10, List list, r0 r0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.writeFixed64List(i10, list, z10);
    }

    public static void S(int i10, List list, r0 r0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.writeFloatList(i10, list, z10);
    }

    public static void T(int i10, List list, r0 r0Var, e0 e0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.f(i10, list, e0Var);
    }

    public static void U(int i10, List list, r0 r0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.writeInt32List(i10, list, z10);
    }

    public static void V(int i10, List list, r0 r0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.writeInt64List(i10, list, z10);
    }

    public static void W(int i10, List list, r0 r0Var, e0 e0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.c(i10, list, e0Var);
    }

    public static void X(int i10, List list, r0 r0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.writeSFixed32List(i10, list, z10);
    }

    public static void Y(int i10, List list, r0 r0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.writeSFixed64List(i10, list, z10);
    }

    public static void Z(int i10, List list, r0 r0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.writeSInt32List(i10, list, z10);
    }

    public static int a(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC3479k.L(i10) + AbstractC3479k.x(size) : size * AbstractC3479k.d(i10, true);
    }

    public static void a0(int i10, List list, r0 r0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.writeSInt64List(i10, list, z10);
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i10, List list, r0 r0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.writeStringList(i10, list);
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int L10 = size * AbstractC3479k.L(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            L10 += AbstractC3479k.g((AbstractC3476h) list.get(i11));
        }
        return L10;
    }

    public static void c0(int i10, List list, r0 r0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.writeUInt32List(i10, list, z10);
    }

    public static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        return z10 ? AbstractC3479k.L(i10) + AbstractC3479k.x(e10) : e10 + (size * AbstractC3479k.L(i10));
    }

    public static void d0(int i10, List list, r0 r0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.writeUInt64List(i10, list, z10);
    }

    public static int e(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC3492y)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += AbstractC3479k.k(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        AbstractC3492y abstractC3492y = (AbstractC3492y) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += AbstractC3479k.k(abstractC3492y.getInt(i10));
            i10++;
        }
        return i12;
    }

    public static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC3479k.L(i10) + AbstractC3479k.x(size * 4) : size * AbstractC3479k.l(i10, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC3479k.L(i10) + AbstractC3479k.x(size * 8) : size * AbstractC3479k.n(i10, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i10, List list, e0 e0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC3479k.r(i10, (O) list.get(i12), e0Var);
        }
        return i11;
    }

    public static int k(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        return z10 ? AbstractC3479k.L(i10) + AbstractC3479k.x(l10) : l10 + (size * AbstractC3479k.L(i10));
    }

    public static int l(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC3492y)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += AbstractC3479k.u(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        AbstractC3492y abstractC3492y = (AbstractC3492y) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += AbstractC3479k.u(abstractC3492y.getInt(i10));
            i10++;
        }
        return i12;
    }

    public static int m(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        return z10 ? AbstractC3479k.L(i10) + AbstractC3479k.x(n10) : n10 + (list.size() * AbstractC3479k.L(i10));
    }

    public static int n(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof F)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += AbstractC3479k.w(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        F f10 = (F) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += AbstractC3479k.w(f10.getLong(i10));
            i10++;
        }
        return i12;
    }

    public static int o(int i10, Object obj, e0 e0Var) {
        return AbstractC3479k.y(i10, (O) obj, e0Var);
    }

    public static int p(int i10, List list, e0 e0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int L10 = AbstractC3479k.L(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            L10 += AbstractC3479k.z((O) list.get(i11), e0Var);
        }
        return L10;
    }

    public static int q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        return z10 ? AbstractC3479k.L(i10) + AbstractC3479k.x(r10) : r10 + (size * AbstractC3479k.L(i10));
    }

    public static int r(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC3492y)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += AbstractC3479k.G(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        AbstractC3492y abstractC3492y = (AbstractC3492y) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += AbstractC3479k.G(abstractC3492y.getInt(i10));
            i10++;
        }
        return i12;
    }

    public static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t10 = t(list);
        return z10 ? AbstractC3479k.L(i10) + AbstractC3479k.x(t10) : t10 + (size * AbstractC3479k.L(i10));
    }

    public static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof F)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += AbstractC3479k.I(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        F f10 = (F) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += AbstractC3479k.I(f10.getLong(i10));
            i10++;
        }
        return i12;
    }

    public static int u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int L10 = AbstractC3479k.L(i10) * size;
        if (!(list instanceof D)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                L10 += obj instanceof AbstractC3476h ? AbstractC3479k.g((AbstractC3476h) obj) : AbstractC3479k.K((String) obj);
                i11++;
            }
            return L10;
        }
        D d10 = (D) list;
        while (i11 < size) {
            Object raw = d10.getRaw(i11);
            L10 += raw instanceof AbstractC3476h ? AbstractC3479k.g((AbstractC3476h) raw) : AbstractC3479k.K((String) raw);
            i11++;
        }
        return L10;
    }

    public static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        return z10 ? AbstractC3479k.L(i10) + AbstractC3479k.x(w10) : w10 + (size * AbstractC3479k.L(i10));
    }

    public static int w(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC3492y)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += AbstractC3479k.N(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        AbstractC3492y abstractC3492y = (AbstractC3492y) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += AbstractC3479k.N(abstractC3492y.getInt(i10));
            i10++;
        }
        return i12;
    }

    public static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        return z10 ? AbstractC3479k.L(i10) + AbstractC3479k.x(y10) : y10 + (size * AbstractC3479k.L(i10));
    }

    public static int y(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof F)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += AbstractC3479k.P(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        F f10 = (F) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += AbstractC3479k.P(f10.getLong(i10));
            i10++;
        }
        return i12;
    }

    public static Object z(Object obj, int i10, List list, AbstractC3493z.c cVar, Object obj2, k0 k0Var) {
        if (cVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!cVar.isInRange(intValue)) {
                    obj2 = K(obj, i10, intValue, obj2, k0Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int intValue2 = num.intValue();
            if (cVar.isInRange(intValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = K(obj, i10, intValue2, obj2, k0Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }
}
