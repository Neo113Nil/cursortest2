package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2149y;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f19504a = A();

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f19505b = B();

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f19506c = new o0();

    public static Class A() {
        if (b0.f19462d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static m0 B() {
        try {
            Class C10 = C();
            if (C10 == null) {
                return null;
            }
            return (m0) C10.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class C() {
        if (b0.f19462d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D(AbstractC2141p abstractC2141p, Object obj, Object obj2) {
        C2143s c10 = abstractC2141p.c(obj2);
        if (c10.j()) {
            return;
        }
        abstractC2141p.d(obj).p(c10);
    }

    public static void E(K k10, Object obj, Object obj2, long j10) {
        p0.O(obj, j10, k10.mergeFrom(p0.z(obj, j10), p0.z(obj2, j10)));
    }

    public static void F(m0 m0Var, Object obj, Object obj2) {
        m0Var.p(obj, m0Var.k(m0Var.g(obj), m0Var.g(obj2)));
    }

    public static void G(Class cls) {
        Class cls2;
        if (!AbstractC2147w.class.isAssignableFrom(cls) && !b0.f19462d && (cls2 = f19504a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean H(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object I(Object obj, int i10, int i11, Object obj2, m0 m0Var) {
        if (obj2 == null) {
            obj2 = m0Var.f(obj);
        }
        m0Var.e(obj2, i10, i11);
        return obj2;
    }

    public static m0 J() {
        return f19505b;
    }

    public static m0 K() {
        return f19506c;
    }

    public static void L(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.writeBoolList(i10, list, z10);
    }

    public static void M(int i10, List list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.writeBytesList(i10, list);
    }

    public static void N(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.writeDoubleList(i10, list, z10);
    }

    public static void O(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.writeEnumList(i10, list, z10);
    }

    public static void P(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.writeFixed32List(i10, list, z10);
    }

    public static void Q(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.writeFixed64List(i10, list, z10);
    }

    public static void R(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.writeFloatList(i10, list, z10);
    }

    public static void S(int i10, List list, s0 s0Var, f0 f0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.a(i10, list, f0Var);
    }

    public static void T(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.writeInt32List(i10, list, z10);
    }

    public static void U(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.writeInt64List(i10, list, z10);
    }

    public static void V(int i10, List list, s0 s0Var, f0 f0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.f(i10, list, f0Var);
    }

    public static void W(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.writeSFixed32List(i10, list, z10);
    }

    public static void X(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.writeSFixed64List(i10, list, z10);
    }

    public static void Y(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.writeSInt32List(i10, list, z10);
    }

    public static void Z(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.writeSInt64List(i10, list, z10);
    }

    public static int a(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC2135j.O(i10) + AbstractC2135j.y(size) : size * AbstractC2135j.c(i10, true);
    }

    public static void a0(int i10, List list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.writeStringList(i10, list);
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.writeUInt32List(i10, list, z10);
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O10 = size * AbstractC2135j.O(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            O10 += AbstractC2135j.g((AbstractC2132g) list.get(i11));
        }
        return O10;
    }

    public static void c0(int i10, List list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.writeUInt64List(i10, list, z10);
    }

    public static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        return z10 ? AbstractC2135j.O(i10) + AbstractC2135j.y(e10) : e10 + (size * AbstractC2135j.O(i10));
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2148x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2135j.k(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC2135j.O(i10) + AbstractC2135j.y(size * 4) : size * AbstractC2135j.l(i10, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC2135j.O(i10) + AbstractC2135j.y(size * 8) : size * AbstractC2135j.n(i10, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i10, List list, f0 f0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC2135j.r(i10, (P) list.get(i12), f0Var);
        }
        return i11;
    }

    public static int k(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        return z10 ? AbstractC2135j.O(i10) + AbstractC2135j.y(l10) : l10 + (size * AbstractC2135j.O(i10));
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2148x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2135j.v(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int m(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        return z10 ? AbstractC2135j.O(i10) + AbstractC2135j.y(n10) : n10 + (list.size() * AbstractC2135j.O(i10));
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2135j.x(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static int o(int i10, Object obj, f0 f0Var) {
        return AbstractC2135j.z(i10, (P) obj, f0Var);
    }

    public static int p(int i10, List list, f0 f0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O10 = AbstractC2135j.O(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            O10 += AbstractC2135j.B((P) list.get(i11), f0Var);
        }
        return O10;
    }

    public static int q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        return z10 ? AbstractC2135j.O(i10) + AbstractC2135j.y(r10) : r10 + (size * AbstractC2135j.O(i10));
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2148x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2135j.J(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t10 = t(list);
        return z10 ? AbstractC2135j.O(i10) + AbstractC2135j.y(t10) : t10 + (size * AbstractC2135j.O(i10));
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2135j.L(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static int u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int O10 = AbstractC2135j.O(i10) * size;
        if (!(list instanceof C)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                O10 += obj instanceof AbstractC2132g ? AbstractC2135j.g((AbstractC2132g) obj) : AbstractC2135j.N((String) obj);
                i11++;
            }
            return O10;
        }
        C c10 = (C) list;
        while (i11 < size) {
            Object raw = c10.getRaw(i11);
            O10 += raw instanceof AbstractC2132g ? AbstractC2135j.g((AbstractC2132g) raw) : AbstractC2135j.N((String) raw);
            i11++;
        }
        return O10;
    }

    public static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        return z10 ? AbstractC2135j.O(i10) + AbstractC2135j.y(w10) : w10 + (size * AbstractC2135j.O(i10));
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2148x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2135j.Q(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        return z10 ? AbstractC2135j.O(i10) + AbstractC2135j.y(y10) : y10 + (size * AbstractC2135j.O(i10));
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2135j.S(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static Object z(Object obj, int i10, List list, AbstractC2149y.a aVar, Object obj2, m0 m0Var) {
        if (aVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!aVar.isInRange(intValue)) {
                    obj2 = I(obj, i10, intValue, obj2, m0Var);
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
            if (aVar.isInRange(intValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = I(obj, i10, intValue2, obj2, m0Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }
}
