package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ife extends v6 implements Collection, fia {
    public c7 a;
    public Object[] b;
    public Object[] c;
    public int d;
    public ug5 e = new ug5();
    public Object[] f;
    public Object[] g;
    public int h;

    public ife(c7 c7Var, Object[] objArr, Object[] objArr2, int i) {
        this.a = c7Var;
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.f = objArr;
        this.g = objArr2;
        this.h = c7Var.size();
    }

    public static void e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(Object[] objArr, int i, Object[][] objArr2) {
        r4 r4Var = new r4(objArr2);
        int i2 = i >> 5;
        int i3 = this.d;
        Object[] z = i2 < (1 << i3) ? z(objArr, i, i3, r4Var) : s(objArr);
        while (r4Var.hasNext()) {
            this.d += 5;
            z = v(z);
            int i4 = this.d;
            z(z, 1 << i4, i4, r4Var);
        }
        return z;
    }

    public final void B(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.d;
        if (size > (1 << i)) {
            this.f = C(v(objArr), objArr2, this.d + 5);
            this.g = objArr3;
            this.d += 5;
            this.h = size() + 1;
            return;
        }
        if (objArr == null) {
            this.f = objArr2;
            this.g = objArr3;
            this.h = size() + 1;
        } else {
            this.f = C(objArr, objArr2, i);
            this.g = objArr3;
            this.h = size() + 1;
        }
    }

    public final Object[] C(Object[] objArr, Object[] objArr2, int i) {
        int C = x2a.C(size() - 1, i);
        Object[] s = s(objArr);
        if (i == 5) {
            s[C] = objArr2;
            return s;
        }
        s[C] = C((Object[]) s[C], objArr2, i - 5);
        return s;
    }

    public final int D(Function1 function1, Object[] objArr, int i, int i2, ca caVar, ArrayList arrayList, ArrayList arrayList2) {
        if (q(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = caVar.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) function1.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : u();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        caVar.a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int E(Function1 function1, Object[] objArr, int i, ca caVar) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = s(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        caVar.a = objArr2;
        return i2;
    }

    public final int F(Function1 function1, int i, ca caVar) {
        int E = E(function1, this.g, i, caVar);
        Object obj = caVar.a;
        if (E == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, E, i, (Object) null);
        this.g = objArr;
        this.h = size() - (i - E);
        return E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (F(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(Function1 function1) {
        int i;
        Function1 function12 = function1;
        int M = M();
        Object[] objArr = null;
        ca caVar = new ca(objArr);
        boolean z = false;
        if (this.f != null) {
            v4 r = r(0);
            int i2 = 32;
            while (i2 == 32 && r.hasNext()) {
                i2 = E(function12, (Object[]) r.next(), 32, caVar);
            }
            if (i2 == 32) {
                int F = F(function12, M, caVar);
                if (F == 0) {
                    y(size(), this.d, this.f);
                }
            } else {
                int i3 = (r.b - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (r.hasNext()) {
                    i4 = D(function12, (Object[]) r.next(), 32, i4, caVar, arrayList2, arrayList);
                    function12 = function1;
                }
                int D = D(function1, this.g, M, i4, caVar, arrayList2, arrayList);
                Object obj = caVar.a;
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, D, 32, (Object) null);
                boolean isEmpty = arrayList.isEmpty();
                Object[] objArr3 = this.f;
                if (isEmpty) {
                    objArr3.getClass();
                } else {
                    objArr3 = z(objArr3, i3, this.d, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    h3f.a("invalid size");
                }
                if (size == 0) {
                    this.d = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.d;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.d = i - 5;
                        Object[] objArr4 = objArr3[0];
                        objArr4.getClass();
                        objArr3 = objArr4;
                    }
                    objArr = w(i5, i, objArr3);
                }
                this.f = objArr;
                this.g = objArr2;
                this.h = size + D;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] H(Object[] objArr, int i, int i2, ca caVar) {
        int C = x2a.C(i2, i);
        if (i == 0) {
            Object obj = objArr[C];
            Object[] s = s(objArr);
            mh0.d(C, C + 1, 32, objArr, s);
            s[31] = caVar.a;
            caVar.a = obj;
            return s;
        }
        int C2 = objArr[31] == null ? x2a.C(J() - 1, i) : 31;
        Object[] s2 = s(objArr);
        int i3 = i - 5;
        int i4 = C + 1;
        if (i4 <= C2) {
            while (true) {
                Object obj2 = s2[C2];
                obj2.getClass();
                s2[C2] = H((Object[]) obj2, i3, 0, caVar);
                if (C2 == i4) {
                    break;
                }
                C2--;
            }
        }
        Object obj3 = s2[C];
        obj3.getClass();
        s2[C] = H((Object[]) obj3, i3, i2, caVar);
        return s2;
    }

    public final Object I(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        Object[] objArr2 = this.g;
        if (size == 1) {
            Object obj = objArr2[0];
            y(i, i2, objArr);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] s = s(objArr2);
        mh0.d(i3, i3 + 1, size, objArr2, s);
        s[size - 1] = null;
        this.f = objArr;
        this.g = s;
        this.h = (i + size) - 1;
        this.d = i2;
        return obj2;
    }

    public final int J() {
        if (size() <= 32) {
            return 0;
        }
        return (size() - 1) & (-32);
    }

    public final Object[] K(Object[] objArr, int i, int i2, Object obj, ca caVar) {
        int C = x2a.C(i2, i);
        Object[] s = s(objArr);
        if (i != 0) {
            Object obj2 = s[C];
            obj2.getClass();
            s[C] = K((Object[]) obj2, i - 5, i2, obj, caVar);
            return s;
        }
        if (s != objArr) {
            ((AbstractList) this).modCount++;
        }
        caVar.a = s[C];
        s[C] = obj;
        return s;
    }

    public final void L(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] u;
        if (i3 < 1) {
            h3f.a("requires at least one nullBuffer");
        }
        Object[] s = s(objArr);
        objArr2[0] = s;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            mh0.d(size + 1, i4, i2, s, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                u = s;
            } else {
                u = u();
                i3--;
                objArr2[i3] = u;
            }
            int i7 = i2 - i6;
            mh0.d(0, i7, i2, s, objArr3);
            mh0.d(size + 1, i4, i7, s, u);
            objArr3 = u;
        }
        Iterator it = collection.iterator();
        e(s, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] u2 = u();
            e(u2, 0, it);
            objArr2[i8] = u2;
        }
        e(objArr3, 0, it);
    }

    public final int M() {
        int size = size();
        return size <= 32 ? size : size - ((size - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        b0a.z(i, size());
        if (i == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int J = J();
        if (i >= J) {
            p(i - J, obj, this.f);
            return;
        }
        ca caVar = new ca(null);
        Object[] objArr = this.f;
        objArr.getClass();
        p(0, caVar.a, o(objArr, this.d, i, obj, caVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] u;
        b0a.z(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (size() - i2)) - 1) / 32;
        if (size == 0) {
            J();
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.g;
            Object[] s = s(objArr);
            mh0.d(size2 + 1, i3, M(), objArr, s);
            e(s, i3, collection.iterator());
            this.g = s;
            this.h = collection.size() + size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int M = M();
        int size3 = collection.size() + size();
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= J()) {
            u = u();
            collection2 = collection;
            L(collection2, i, this.g, M, objArr2, size, u);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.g;
            if (size3 > M) {
                int i4 = size3 - M;
                Object[] t = t(i4, objArr3);
                n(collection2, i, i4, objArr2, size, t);
                objArr2 = objArr2;
                u = t;
            } else {
                u = u();
                int i5 = M - size3;
                mh0.d(0, i5, M, objArr3, u);
                int i6 = 32 - i5;
                Object[] t2 = t(i6, this.g);
                int i7 = size - 1;
                objArr2[i7] = t2;
                n(collection2, i, i6, objArr2, i7, t2);
                collection2 = collection2;
            }
        }
        this.f = A(this.f, i2, objArr2);
        this.g = u;
        this.h = collection2.size() + size();
        return true;
    }

    public final c7 d() {
        c7 gfeVar;
        Object[] objArr = this.f;
        if (objArr == this.b && this.g == this.c) {
            gfeVar = this.a;
        } else {
            this.e = new ug5();
            this.b = objArr;
            Object[] objArr2 = this.g;
            this.c = objArr2;
            if (objArr == null) {
                gfeVar = objArr2.length == 0 ? slh.b : new slh(Arrays.copyOf(this.g, size()));
            } else {
                Object[] objArr3 = this.f;
                objArr3.getClass();
                gfeVar = new gfe(objArr3, this.g, size(), this.d);
            }
        }
        this.a = gfeVar;
        return gfeVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        b0a.y(i, size());
        if (J() <= i) {
            objArr = this.g;
        } else {
            Object[] objArr2 = this.f;
            objArr2.getClass();
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[x2a.C(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.v6
    public final int getSize() {
        return this.h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        b0a.z(i, size());
        return new mfe(this, i);
    }

    public final int m() {
        return ((AbstractList) this).modCount;
    }

    public final void n(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f == null) {
            a70.r("root is null");
            return;
        }
        int i4 = i >> 5;
        v4 r = r(J() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (r.b - 1 != i4) {
            Object[] objArr4 = (Object[]) r.previous();
            mh0.d(0, 32 - i2, 32, objArr4, objArr3);
            objArr3 = t(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) r.previous();
        int J = i3 - (((J() >> 5) - 1) - i4);
        if (J < i3) {
            objArr2 = objArr[J];
            objArr2.getClass();
        }
        L(collection, i, objArr5, 32, objArr, J, objArr2);
    }

    public final Object[] o(Object[] objArr, int i, int i2, Object obj, ca caVar) {
        Object obj2;
        int C = x2a.C(i2, i);
        if (i == 0) {
            caVar.a = objArr[31];
            Object[] s = s(objArr);
            mh0.d(C + 1, C, 31, objArr, s);
            s[C] = obj;
            return s;
        }
        Object[] s2 = s(objArr);
        int i3 = i - 5;
        Object obj3 = s2[C];
        obj3.getClass();
        s2[C] = o((Object[]) obj3, i3, i2, obj, caVar);
        while (true) {
            C++;
            if (C >= 32 || (obj2 = s2[C]) == null) {
                break;
            }
            s2[C] = o((Object[]) obj2, i3, 0, caVar.a, caVar);
        }
        return s2;
    }

    public final void p(int i, Object obj, Object[] objArr) {
        int M = M();
        Object[] s = s(this.g);
        Object[] objArr2 = this.g;
        if (M >= 32) {
            Object obj2 = objArr2[31];
            mh0.d(i + 1, i, 31, objArr2, s);
            s[i] = obj;
            B(objArr, s, v(obj2));
            return;
        }
        mh0.d(i + 1, i, M, objArr2, s);
        s[i] = obj;
        this.f = objArr;
        this.g = s;
        this.h = size() + 1;
    }

    public final boolean q(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.e;
    }

    public final v4 r(int i) {
        Object[] objArr = this.f;
        if (objArr == null) {
            a70.r("Invalid root");
            return null;
        }
        int J = J() >> 5;
        b0a.z(i, J);
        int i2 = this.d;
        return i2 == 0 ? new z52(objArr, i) : new t0k(objArr, i, J, i2 / 5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return G(new a7(2, collection));
    }

    @Override // defpackage.v6
    public final Object removeAt(int i) {
        b0a.y(i, size());
        ((AbstractList) this).modCount++;
        int J = J();
        if (i >= J) {
            return I(this.f, J, this.d, i - J);
        }
        ca caVar = new ca(this.g[0]);
        Object[] objArr = this.f;
        objArr.getClass();
        I(H(objArr, this.d, i, caVar), J, this.d, 0);
        return caVar.a;
    }

    public final Object[] s(Object[] objArr) {
        if (objArr == null) {
            return u();
        }
        if (q(objArr)) {
            return objArr;
        }
        Object[] u = u();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        mh0.i(0, length, 6, objArr, u);
        return u;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b0a.y(i, size());
        if (J() > i) {
            ca caVar = new ca(null);
            Object[] objArr = this.f;
            objArr.getClass();
            this.f = K(objArr, this.d, i, obj, caVar);
            return caVar.a;
        }
        Object[] s = s(this.g);
        if (s != this.g) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = s[i2];
        s[i2] = obj;
        this.g = s;
        return obj2;
    }

    public final Object[] t(int i, Object[] objArr) {
        if (q(objArr)) {
            mh0.d(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] u = u();
        mh0.d(i, 0, 32 - i, objArr, u);
        return u;
    }

    public final Object[] u() {
        Object[] objArr = new Object[33];
        objArr[32] = this.e;
        return objArr;
    }

    public final Object[] v(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.e;
        return objArr;
    }

    public final Object[] w(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            h3f.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int C = x2a.C(i, i2);
        Object obj = objArr[C];
        obj.getClass();
        Object w = w(i, i2 - 5, (Object[]) obj);
        if (C < 31) {
            int i3 = C + 1;
            if (objArr[i3] != null) {
                if (q(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] u = u();
                mh0.d(0, 0, i3, objArr, u);
                objArr = u;
            }
        }
        if (w == objArr[C]) {
            return objArr;
        }
        Object[] s = s(objArr);
        s[C] = w;
        return s;
    }

    public final Object[] x(Object[] objArr, int i, int i2, ca caVar) {
        Object[] x;
        int C = x2a.C(i2 - 1, i);
        if (i == 5) {
            caVar.a = objArr[C];
            x = null;
        } else {
            Object obj = objArr[C];
            obj.getClass();
            x = x((Object[]) obj, i - 5, i2, caVar);
        }
        if (x == null && C == 0) {
            return null;
        }
        Object[] s = s(objArr);
        s[C] = x;
        return s;
    }

    public final void y(int i, int i2, Object[] objArr) {
        Object obj = null;
        if (i2 == 0) {
            this.f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.g = objArr;
            this.h = i;
            this.d = i2;
            return;
        }
        ca caVar = new ca(obj);
        objArr.getClass();
        Object[] x = x(objArr, i2, i, caVar);
        x.getClass();
        Object obj2 = caVar.a;
        obj2.getClass();
        this.g = (Object[]) obj2;
        this.h = i;
        if (x[1] == null) {
            this.f = (Object[]) x[0];
            this.d = i2 - 5;
        } else {
            this.f = x;
            this.d = i2;
        }
    }

    public final Object[] z(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            h3f.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            h3f.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] s = s(objArr);
        int C = x2a.C(i, i2);
        int i3 = i2 - 5;
        s[C] = z((Object[]) s[C], i, i3, it);
        while (true) {
            C++;
            if (C >= 32 || !it.hasNext()) {
                break;
            }
            s[C] = z((Object[]) s[C], 0, i3, it);
        }
        return s;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int M = M();
        if (M < 32) {
            Object[] s = s(this.g);
            s[M] = obj;
            this.g = s;
            this.h = size() + 1;
        } else {
            B(this.f, this.g, v(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int M = M();
        Iterator it = collection.iterator();
        if (32 - M >= collection.size()) {
            Object[] s = s(this.g);
            e(s, M, it);
            this.g = s;
            this.h = collection.size() + size();
            return true;
        }
        int size = ((collection.size() + M) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] s2 = s(this.g);
        e(s2, M, it);
        objArr[0] = s2;
        for (int i = 1; i < size; i++) {
            Object[] u = u();
            e(u, 0, it);
            objArr[i] = u;
        }
        this.f = A(this.f, J(), objArr);
        Object[] u2 = u();
        e(u2, 0, it);
        this.g = u2;
        this.h = collection.size() + size();
        return true;
    }
}
