package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class h3p extends AbstractMap implements Serializable, Map {
    public transient Object[] a;
    public transient Object[] b;
    public transient int c;
    public transient int d;
    public transient int[] e;
    public transient int[] f;
    public transient int[] g;
    public transient int[] h;
    public transient int i;
    public transient int j;
    public transient int[] k;
    public transient int[] l;
    public transient b3p m;
    public transient b3p n;
    public transient b3p o;
    public transient d3p p;

    public static h3p k() {
        h3p h3pVar = new h3p();
        int max = Math.max(2, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
            highestOneBit = 1073741824;
        }
        h3pVar.c = 0;
        h3pVar.a = new Object[2];
        h3pVar.b = new Object[2];
        h3pVar.e = m(highestOneBit);
        h3pVar.f = m(highestOneBit);
        h3pVar.g = m(2);
        h3pVar.h = m(2);
        h3pVar.i = -2;
        h3pVar.j = -2;
        h3pVar.k = m(2);
        h3pVar.l = m(2);
        return h3pVar;
    }

    public static int[] m(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final int a(int i, Object obj) {
        int[] iArr = this.f;
        int[] iArr2 = this.h;
        Object[] objArr = this.b;
        for (int i2 = iArr[o(i)]; i2 != -1; i2 = iArr2[i2]) {
            if (Objects.equals(objArr[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    public final void c(int i, int i2) {
        if (i == -2) {
            this.i = i2;
        } else {
            this.l[i] = i2;
        }
        if (i2 == -2) {
            this.j = i;
        } else {
            this.k[i2] = i;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, (Object) null);
        Arrays.fill(this.e, -1);
        Arrays.fill(this.f, -1);
        Arrays.fill(this.g, 0, this.c, -1);
        Arrays.fill(this.h, 0, this.c, -1);
        Arrays.fill(this.k, 0, this.c, -1);
        Arrays.fill(this.l, 0, this.c, -1);
        this.c = 0;
        this.i = -2;
        this.j = -2;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return p(bea.T(obj), obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return a(bea.T(obj), obj) != -1;
    }

    public final void d(int i, int i2) {
        jca.c0(i != -1);
        int o = o(i2);
        int[] iArr = this.g;
        int[] iArr2 = this.e;
        iArr[i] = iArr2[o];
        iArr2[o] = i;
    }

    public final void e(int i, int i2) {
        jca.c0(i != -1);
        int o = o(i2);
        int[] iArr = this.h;
        int[] iArr2 = this.f;
        iArr[i] = iArr2[o];
        iArr2[o] = i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        b3p b3pVar = this.o;
        if (b3pVar != null) {
            return b3pVar;
        }
        b3p b3pVar2 = new b3p(this, 0);
        this.o = b3pVar2;
        return b3pVar2;
    }

    public final void f(int i, int i2) {
        jca.c0(i != -1);
        int o = o(i2);
        int[] iArr = this.e;
        int i3 = iArr[o];
        int[] iArr2 = this.g;
        if (i3 == i) {
            iArr[o] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = iArr2[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                a70.j("Expected to find entry with key ".concat(String.valueOf(this.a[i])));
                return;
            }
            int[] iArr3 = this.g;
            if (i3 == i) {
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = iArr3[i3];
        }
    }

    public final void g(int i, int i2) {
        jca.c0(i != -1);
        int o = o(i2);
        int[] iArr = this.f;
        int i3 = iArr[o];
        int[] iArr2 = this.h;
        if (i3 == i) {
            iArr[o] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = iArr2[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                a70.j("Expected to find entry with value ".concat(String.valueOf(this.b[i])));
                return;
            }
            int[] iArr3 = this.h;
            if (i3 == i) {
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = iArr3[i3];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int p = p(bea.T(obj), obj);
        if (p == -1) {
            return null;
        }
        return this.b[p];
    }

    public final void h(int i, Object obj) {
        jca.c0(i != -1);
        int T = bea.T(obj);
        if (a(T, obj) != -1) {
            a70.p("Value already present in map: ".concat(String.valueOf(obj)));
            return;
        }
        g(i, bea.T(this.b[i]));
        this.b[i] = obj;
        e(i, T);
    }

    public final void i(int i, Object obj) {
        jca.c0(i != -1);
        int p = p(bea.T(obj), obj);
        int i2 = this.j;
        if (p != -1) {
            a70.p("Key already present in map: ".concat(String.valueOf(obj)));
            return;
        }
        if (i2 == i) {
            i2 = this.k[i];
        } else if (i2 == this.c) {
            i2 = p;
        }
        if (i == -2) {
            p = this.l[-2];
        } else if (this.c != -2) {
            p = -2;
        }
        c(this.k[i], this.l[i]);
        f(i, bea.T(this.a[i]));
        this.a[i] = obj;
        d(i, bea.T(obj));
        c(i2, i);
        c(i, p);
    }

    public final void j(int i, int i2, int i3) {
        int i4;
        int[] iArr;
        int i5;
        int[] iArr2;
        jca.c0(i != -1);
        f(i, i2);
        g(i, i3);
        c(this.k[i], this.l[i]);
        int i6 = this.c - 1;
        if (i6 != i) {
            int i7 = this.k[i6];
            int i8 = this.l[i6];
            c(i7, i);
            c(i, i8);
            Object[] objArr = this.a;
            Object obj = objArr[i6];
            Object[] objArr2 = this.b;
            Object obj2 = objArr2[i6];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int o = o(bea.T(obj));
            int[] iArr3 = this.e;
            int i9 = iArr3[o];
            if (i9 == i6) {
                iArr3[o] = i;
            } else {
                int i10 = this.g[i9];
                while (true) {
                    i4 = i9;
                    i9 = i10;
                    iArr = this.g;
                    if (i9 == i6) {
                        break;
                    } else {
                        i10 = iArr[i9];
                    }
                }
                iArr[i4] = i;
            }
            int[] iArr4 = this.g;
            iArr4[i] = iArr4[i6];
            iArr4[i6] = -1;
            int o2 = o(bea.T(obj2));
            int[] iArr5 = this.f;
            int i11 = iArr5[o2];
            if (i11 == i6) {
                iArr5[o2] = i;
            } else {
                int i12 = this.h[i11];
                while (true) {
                    i5 = i11;
                    i11 = i12;
                    iArr2 = this.h;
                    if (i11 == i6) {
                        break;
                    } else {
                        i12 = iArr2[i11];
                    }
                }
                iArr2[i5] = i;
            }
            int[] iArr6 = this.h;
            iArr6[i] = iArr6[i6];
            iArr6[i6] = -1;
        }
        Object[] objArr3 = this.a;
        int i13 = this.c - 1;
        objArr3[i13] = null;
        this.b[i13] = null;
        this.c = i13;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        b3p b3pVar = this.m;
        if (b3pVar != null) {
            return b3pVar;
        }
        b3p b3pVar2 = new b3p(this, 1);
        this.m = b3pVar2;
        return b3pVar2;
    }

    public final Object l(Object obj, Object obj2) {
        int T = bea.T(obj);
        int a = a(T, obj);
        if (a != -1) {
            Object obj3 = this.a[a];
            if (Objects.equals(obj3, obj2)) {
                return obj2;
            }
            i(a, obj2);
            return obj3;
        }
        int i = this.j;
        int T2 = bea.T(obj2);
        if (!(p(T2, obj2) == -1)) {
            a70.p(wca.O("Key already present: %s", obj2));
            return null;
        }
        n(this.c + 1);
        Object[] objArr = this.a;
        int i2 = this.c;
        objArr[i2] = obj2;
        this.b[i2] = obj;
        d(i2, T2);
        e(this.c, T);
        int i3 = i == -2 ? this.i : this.l[i];
        c(i, this.c);
        c(this.c, i3);
        this.c++;
        this.d++;
        return null;
    }

    public final void n(int i) {
        int length = this.g.length;
        if (length < i) {
            int a = i3p.a(length, i);
            this.a = Arrays.copyOf(this.a, a);
            this.b = Arrays.copyOf(this.b, a);
            int[] iArr = this.g;
            int length2 = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, a);
            Arrays.fill(copyOf, length2, a, -1);
            this.g = copyOf;
            int[] iArr2 = this.h;
            int length3 = iArr2.length;
            int[] copyOf2 = Arrays.copyOf(iArr2, a);
            Arrays.fill(copyOf2, length3, a, -1);
            this.h = copyOf2;
            int[] iArr3 = this.k;
            int length4 = iArr3.length;
            int[] copyOf3 = Arrays.copyOf(iArr3, a);
            Arrays.fill(copyOf3, length4, a, -1);
            this.k = copyOf3;
            int[] iArr4 = this.l;
            int length5 = iArr4.length;
            int[] copyOf4 = Arrays.copyOf(iArr4, a);
            Arrays.fill(copyOf4, length5, a, -1);
            this.l = copyOf4;
        }
        if (this.e.length < i) {
            int max = Math.max(i, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            this.e = m(highestOneBit);
            this.f = m(highestOneBit);
            for (int i2 = 0; i2 < this.c; i2++) {
                int o = o(bea.T(this.a[i2]));
                int[] iArr5 = this.g;
                int[] iArr6 = this.e;
                iArr5[i2] = iArr6[o];
                iArr6[o] = i2;
                int o2 = o(bea.T(this.b[i2]));
                int[] iArr7 = this.h;
                int[] iArr8 = this.f;
                iArr7[i2] = iArr8[o2];
                iArr8[o2] = i2;
            }
        }
    }

    public final int o(int i) {
        return (this.e.length - 1) & i;
    }

    public final int p(int i, Object obj) {
        int[] iArr = this.e;
        int[] iArr2 = this.g;
        Object[] objArr = this.a;
        for (int i2 = iArr[o(i)]; i2 != -1; i2 = iArr2[i2]) {
            if (Objects.equals(objArr[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int T = bea.T(obj);
        int p = p(T, obj);
        if (p != -1) {
            Object obj3 = this.b[p];
            if (Objects.equals(obj3, obj2)) {
                return obj2;
            }
            h(p, obj2);
            return obj3;
        }
        int T2 = bea.T(obj2);
        if (!(a(T2, obj2) == -1)) {
            a70.p(wca.O("Value already present: %s", obj2));
            return null;
        }
        n(this.c + 1);
        Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = obj;
        this.b[i] = obj2;
        d(i, T);
        e(this.c, T2);
        c(this.j, this.c);
        c(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int T = bea.T(obj);
        int p = p(T, obj);
        if (p == -1) {
            return null;
        }
        Object obj2 = this.b[p];
        j(p, T, bea.T(obj2));
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        b3p b3pVar = this.n;
        if (b3pVar != null) {
            return b3pVar;
        }
        b3p b3pVar2 = new b3p(this, 2);
        this.n = b3pVar2;
        return b3pVar2;
    }
}
