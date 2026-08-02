package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hfe extends v6 implements Collection, fia {
    public int a;
    public b7 b;
    public rik c;
    public Object[] d;
    public Object[] e;
    public int f;

    public hfe(b7 b7Var, Object[] objArr, Object[] objArr2, int i) {
        objArr2.getClass();
        this.a = i;
        this.b = b7Var;
        this.c = new rik(28);
        this.d = objArr;
        this.e = objArr2;
        this.f = b7Var.size();
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
        int i3 = this.a;
        Object[] z = i2 < (1 << i3) ? z(objArr, i, i3, r4Var) : s(objArr);
        while (r4Var.hasNext()) {
            this.a += 5;
            z = v(z);
            int i4 = this.a;
            z(z, 1 << i4, i4, r4Var);
        }
        return z;
    }

    public final void B(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.a;
        if (size > (1 << i)) {
            K(C(v(objArr), objArr2, this.a + 5));
            L(objArr3);
            this.a += 5;
            this.f = size() + 1;
            return;
        }
        if (objArr == null) {
            K(objArr2);
            L(objArr3);
            this.f = size() + 1;
        } else {
            K(C(objArr, objArr2, i));
            L(objArr3);
            this.f = size() + 1;
        }
    }

    public final Object[] C(Object[] objArr, Object[] objArr2, int i) {
        int B = u0a.B(size() - 1, i);
        Object[] s = s(objArr);
        if (i == 5) {
            s[B] = objArr2;
            return s;
        }
        s[B] = C((Object[]) s[B], objArr2, i - 5);
        return s;
    }

    public final int D(a7 a7Var, Object[] objArr, int i, int i2, by9 by9Var, ArrayList arrayList, ArrayList arrayList2) {
        if (q(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = by9Var.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) a7Var.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : u();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        by9Var.a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int E(a7 a7Var, Object[] objArr, int i, by9 by9Var) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) a7Var.invoke(obj)).booleanValue()) {
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
        by9Var.a = objArr2;
        return i2;
    }

    public final int F(a7 a7Var, int i, by9 by9Var) {
        int E = E(a7Var, this.e, i, by9Var);
        Object obj = by9Var.a;
        if (E == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, E, i, (Object) null);
        L(objArr);
        this.f = size() - (i - E);
        return E;
    }

    public final Object[] G(Object[] objArr, int i, int i2, by9 by9Var) {
        int B = u0a.B(i2, i);
        if (i == 0) {
            Object obj = objArr[B];
            Object[] s = s(objArr);
            mh0.d(B, B + 1, 32, objArr, s);
            s[31] = by9Var.a;
            by9Var.a = obj;
            return s;
        }
        int B2 = objArr[31] == null ? u0a.B(I() - 1, i) : 31;
        Object[] s2 = s(objArr);
        int i3 = i - 5;
        int i4 = B + 1;
        if (i4 <= B2) {
            while (true) {
                Object obj2 = s2[B2];
                obj2.getClass();
                s2[B2] = G((Object[]) obj2, i3, 0, by9Var);
                if (B2 == i4) {
                    break;
                }
                B2--;
            }
        }
        Object obj3 = s2[B];
        obj3.getClass();
        s2[B] = G((Object[]) obj3, i3, i2, by9Var);
        return s2;
    }

    public final Object H(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        Object[] objArr2 = this.e;
        if (size == 1) {
            Object obj = objArr2[0];
            y(i, i2, objArr);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] s = s(objArr2);
        mh0.d(i3, i3 + 1, size, objArr2, s);
        s[size - 1] = null;
        K(objArr);
        L(s);
        this.f = (i + size) - 1;
        this.a = i2;
        return obj2;
    }

    public final int I() {
        if (size() <= 32) {
            return 0;
        }
        return (size() - 1) & (-32);
    }

    public final Object[] J(Object[] objArr, int i, int i2, Object obj, by9 by9Var) {
        int B = u0a.B(i2, i);
        Object[] s = s(objArr);
        if (i != 0) {
            Object obj2 = s[B];
            obj2.getClass();
            s[B] = J((Object[]) obj2, i - 5, i2, obj, by9Var);
            return s;
        }
        if (s != objArr) {
            ((AbstractList) this).modCount++;
        }
        by9Var.a = s[B];
        s[B] = obj;
        return s;
    }

    public final void K(Object[] objArr) {
        if (objArr != this.d) {
            this.b = null;
            this.d = objArr;
        }
    }

    public final void L(Object[] objArr) {
        if (objArr != this.e) {
            this.b = null;
            this.e = objArr;
        }
    }

    public final void M(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] u;
        if (i3 < 1) {
            a70.r("Check failed.");
            return;
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

    public final int N() {
        int size = size();
        return size <= 32 ? size : size - ((size - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        tz9.w(i, size());
        if (i == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int I = I();
        if (i >= I) {
            p(i - I, obj, this.d);
            return;
        }
        by9 by9Var = new by9((Object) null);
        Object[] objArr = this.d;
        objArr.getClass();
        p(0, by9Var.a, n(objArr, this.a, i, obj, by9Var));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] u;
        collection.getClass();
        tz9.w(i, size());
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
            I();
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.e;
            Object[] s = s(objArr);
            mh0.d(size2 + 1, i3, N(), objArr, s);
            e(s, i3, collection.iterator());
            L(s);
            this.f = collection.size() + size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int N = N();
        int size3 = collection.size() + size();
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= I()) {
            u = u();
            collection2 = collection;
            M(collection2, i, this.e, N, objArr2, size, u);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.e;
            if (size3 > N) {
                int i4 = size3 - N;
                Object[] t = t(i4, objArr3);
                o(collection2, i, i4, objArr2, size, t);
                objArr2 = objArr2;
                u = t;
            } else {
                u = u();
                int i5 = N - size3;
                mh0.d(0, i5, N, objArr3, u);
                int i6 = 32 - i5;
                Object[] t2 = t(i6, this.e);
                int i7 = size - 1;
                objArr2[i7] = t2;
                o(collection2, i, i6, objArr2, i7, t2);
                collection2 = collection2;
            }
        }
        K(A(this.d, i2, objArr2));
        L(u);
        this.f = collection2.size() + size();
        return true;
    }

    public final b7 d() {
        b7 b7Var = this.b;
        if (b7Var == null) {
            Object[] objArr = this.d;
            Object[] objArr2 = this.e;
            this.c = new rik(28);
            b7Var = objArr == null ? objArr2.length == 0 ? rlh.b : new rlh(Arrays.copyOf(objArr2, size())) : new ffe(objArr, objArr2, size(), this.a);
            this.b = b7Var;
        }
        return b7Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        tz9.v(i, size());
        if (I() <= i) {
            objArr = this.e;
        } else {
            Object[] objArr2 = this.d;
            objArr2.getClass();
            for (int i2 = this.a; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[u0a.B(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.v6
    public final int getSize() {
        return this.f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        tz9.w(i, size());
        return new lfe(this, i);
    }

    public final int m() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] n(Object[] objArr, int i, int i2, Object obj, by9 by9Var) {
        Object obj2;
        int B = u0a.B(i2, i);
        if (i == 0) {
            by9Var.a = objArr[31];
            Object[] s = s(objArr);
            mh0.d(B + 1, B, 31, objArr, s);
            s[B] = obj;
            return s;
        }
        Object[] s2 = s(objArr);
        int i3 = i - 5;
        Object obj3 = s2[B];
        obj3.getClass();
        s2[B] = n((Object[]) obj3, i3, i2, obj, by9Var);
        while (true) {
            B++;
            if (B >= 32 || (obj2 = s2[B]) == null) {
                break;
            }
            s2[B] = n((Object[]) obj2, i3, 0, by9Var.a, by9Var);
        }
        return s2;
    }

    public final void o(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.d == null) {
            a70.r("Required value was null.");
            return;
        }
        int i4 = i >> 5;
        v4 r = r(I() >> 5);
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
        int I = i3 - (((I() >> 5) - 1) - i4);
        if (I < i3) {
            objArr2 = objArr[I];
            objArr2.getClass();
        }
        M(collection, i, objArr5, 32, objArr, I, objArr2);
    }

    public final void p(int i, Object obj, Object[] objArr) {
        int N = N();
        Object[] s = s(this.e);
        Object[] objArr2 = this.e;
        if (N >= 32) {
            Object obj2 = objArr2[31];
            mh0.d(i + 1, i, 31, objArr2, s);
            s[i] = obj;
            B(objArr, s, v(obj2));
            return;
        }
        mh0.d(i + 1, i, N, objArr2, s);
        s[i] = obj;
        K(objArr);
        L(s);
        this.f = size() + 1;
    }

    public final boolean q(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.c;
    }

    public final v4 r(int i) {
        if (this.d == null) {
            a70.r("Required value was null.");
            return null;
        }
        int I = I() >> 5;
        tz9.w(i, I);
        int i2 = this.a;
        Object[] objArr = this.d;
        if (i2 == 0) {
            objArr.getClass();
            return new y52(objArr, i);
        }
        objArr.getClass();
        return new s0k(objArr, i, I, i2 / 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r2 != r15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (F(r3, r15, r7) != r15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r2 = r14;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        collection.getClass();
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        a7 a7Var = new a7(1, collection);
        int N = N();
        Object[] objArr = null;
        by9 by9Var = new by9(objArr);
        if (this.d != null) {
            v4 r = r(0);
            int i2 = 32;
            while (i2 == 32 && r.hasNext()) {
                i2 = E(a7Var, (Object[]) r.next(), 32, by9Var);
            }
            if (i2 != 32) {
                int i3 = (r.b - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (r.hasNext()) {
                    i4 = D(a7Var, (Object[]) r.next(), 32, i4, by9Var, arrayList2, arrayList);
                }
                hfe hfeVar = this;
                int D = hfeVar.D(a7Var, hfeVar.e, N, i4, by9Var, arrayList2, arrayList);
                Object obj = by9Var.a;
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, D, 32, (Object) null);
                boolean isEmpty = arrayList.isEmpty();
                Object[] objArr3 = hfeVar.d;
                if (isEmpty) {
                    objArr3.getClass();
                } else {
                    objArr3 = hfeVar.z(objArr3, i3, hfeVar.a, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    a70.r("Check failed.");
                    return false;
                }
                if (size == 0) {
                    hfeVar.a = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = hfeVar.a;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        hfeVar.a = i - 5;
                        Object[] objArr4 = objArr3[0];
                        objArr4.getClass();
                        objArr3 = objArr4;
                    }
                    objArr = hfeVar.w(i5, i, objArr3);
                }
                hfeVar.K(objArr);
                hfeVar.L(objArr2);
                hfeVar.f = size + D;
                z = true;
                if (z) {
                    ((AbstractList) hfeVar).modCount++;
                }
                return z;
            }
            int F = F(a7Var, N, by9Var);
            if (F == 0) {
                y(size(), this.a, this.d);
            }
        }
    }

    @Override // defpackage.v6
    public final Object removeAt(int i) {
        tz9.v(i, size());
        ((AbstractList) this).modCount++;
        int I = I();
        if (i >= I) {
            return H(this.d, I, this.a, i - I);
        }
        by9 by9Var = new by9(this.e[0]);
        Object[] objArr = this.d;
        objArr.getClass();
        H(G(objArr, this.a, i, by9Var), I, this.a, 0);
        return by9Var.a;
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
        tz9.v(i, size());
        if (I() > i) {
            by9 by9Var = new by9((Object) null);
            Object[] objArr = this.d;
            objArr.getClass();
            K(J(objArr, this.a, i, obj, by9Var));
            return by9Var.a;
        }
        Object[] s = s(this.e);
        if (s != this.e) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = s[i2];
        s[i2] = obj;
        L(s);
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
        objArr[32] = this.c;
        return objArr;
    }

    public final Object[] v(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.c;
        return objArr;
    }

    public final Object[] w(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            a70.r("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return objArr;
        }
        int B = u0a.B(i, i2);
        Object obj = objArr[B];
        obj.getClass();
        Object w = w(i, i2 - 5, (Object[]) obj);
        if (B < 31) {
            int i3 = B + 1;
            if (objArr[i3] != null) {
                if (q(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] u = u();
                mh0.d(0, 0, i3, objArr, u);
                objArr = u;
            }
        }
        if (w == objArr[B]) {
            return objArr;
        }
        Object[] s = s(objArr);
        s[B] = w;
        return s;
    }

    public final Object[] x(Object[] objArr, int i, int i2, by9 by9Var) {
        Object[] x;
        int B = u0a.B(i2 - 1, i);
        if (i == 5) {
            by9Var.a = objArr[B];
            x = null;
        } else {
            Object obj = objArr[B];
            obj.getClass();
            x = x((Object[]) obj, i - 5, i2, by9Var);
        }
        if (x == null && B == 0) {
            return null;
        }
        Object[] s = s(objArr);
        s[B] = x;
        return s;
    }

    public final void y(int i, int i2, Object[] objArr) {
        Object obj = null;
        if (i2 == 0) {
            K(null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            L(objArr);
            this.f = i;
            this.a = i2;
            return;
        }
        by9 by9Var = new by9(obj);
        objArr.getClass();
        Object[] x = x(objArr, i2, i, by9Var);
        x.getClass();
        Object obj2 = by9Var.a;
        obj2.getClass();
        L((Object[]) obj2);
        this.f = i;
        if (x[1] == null) {
            K((Object[]) x[0]);
            this.a = i2 - 5;
        } else {
            K(x);
            this.a = i2;
        }
    }

    public final Object[] z(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            a70.r("Check failed.");
            return null;
        }
        if (i2 < 0) {
            a70.r("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] s = s(objArr);
        int B = u0a.B(i, i2);
        int i3 = i2 - 5;
        s[B] = z((Object[]) s[B], i, i3, it);
        while (true) {
            B++;
            if (B >= 32 || !it.hasNext()) {
                break;
            }
            s[B] = z((Object[]) s[B], 0, i3, it);
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
        int N = N();
        if (N < 32) {
            Object[] s = s(this.e);
            s[N] = obj;
            L(s);
            this.f = size() + 1;
        } else {
            B(this.d, this.e, v(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int N = N();
        Iterator it = collection.iterator();
        if (32 - N >= collection.size()) {
            Object[] s = s(this.e);
            e(s, N, it);
            L(s);
            this.f = collection.size() + size();
            return true;
        }
        int size = ((collection.size() + N) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] s2 = s(this.e);
        e(s2, N, it);
        objArr[0] = s2;
        for (int i = 1; i < size; i++) {
            Object[] u = u();
            e(u, 0, it);
            objArr[i] = u;
        }
        K(A(this.d, I(), objArr));
        Object[] u2 = u();
        e(u2, 0, it);
        L(u2);
        this.f = collection.size() + size();
        return true;
    }
}
