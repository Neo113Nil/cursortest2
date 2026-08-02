package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o79 extends AbstractMap implements Map, Serializable {
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
    public transient j79 m;
    public transient j79 n;
    public transient j79 o;
    public transient k79 p;

    public static o79 d() {
        o79 o79Var = new o79();
        o79Var.k();
        return o79Var;
    }

    public static int[] e(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        k();
        for (int i = 0; i < readInt; i++) {
            n(objectInputStream.readObject(), objectInputStream.readObject(), false);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.c);
        m79 m79Var = new m79((n79) entrySet());
        while (m79Var.hasNext()) {
            Map.Entry entry = (Map.Entry) m79Var.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final int a(int i) {
        return (this.e.length - 1) & i;
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
        return i(tol.B(obj), obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return j(tol.B(obj), obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        j79 j79Var = this.o;
        if (j79Var != null) {
            return j79Var;
        }
        j79 j79Var2 = new j79(this, 0);
        this.o = j79Var2;
        return j79Var2;
    }

    public final void f(int i, int i2) {
        z1a.s(i != -1);
        int a = a(i2);
        int[] iArr = this.e;
        int i3 = iArr[a];
        int[] iArr2 = this.g;
        if (i3 == i) {
            iArr[a] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = iArr2[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                sw9.p(this.a[i], "Expected to find entry with key ");
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
        z1a.s(i != -1);
        int a = a(i2);
        int[] iArr = this.f;
        int i3 = iArr[a];
        int[] iArr2 = this.h;
        if (i3 == i) {
            iArr[a] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = iArr2[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                sw9.p(this.b[i], "Expected to find entry with value ");
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
        int i = i(tol.B(obj), obj);
        if (i == -1) {
            return null;
        }
        return this.b[i];
    }

    public final void h(int i) {
        int[] iArr = this.g;
        if (iArr.length < i) {
            int b = vu9.b(iArr.length, i);
            this.a = Arrays.copyOf(this.a, b);
            this.b = Arrays.copyOf(this.b, b);
            int[] iArr2 = this.g;
            int length = iArr2.length;
            int[] copyOf = Arrays.copyOf(iArr2, b);
            Arrays.fill(copyOf, length, b, -1);
            this.g = copyOf;
            int[] iArr3 = this.h;
            int length2 = iArr3.length;
            int[] copyOf2 = Arrays.copyOf(iArr3, b);
            Arrays.fill(copyOf2, length2, b, -1);
            this.h = copyOf2;
            int[] iArr4 = this.k;
            int length3 = iArr4.length;
            int[] copyOf3 = Arrays.copyOf(iArr4, b);
            Arrays.fill(copyOf3, length3, b, -1);
            this.k = copyOf3;
            int[] iArr5 = this.l;
            int length4 = iArr5.length;
            int[] copyOf4 = Arrays.copyOf(iArr5, b);
            Arrays.fill(copyOf4, length4, b, -1);
            this.l = copyOf4;
        }
        if (this.e.length < i) {
            int p = tol.p(1.0d, i);
            this.e = e(p);
            this.f = e(p);
            for (int i2 = 0; i2 < this.c; i2++) {
                int a = a(tol.B(this.a[i2]));
                int[] iArr6 = this.g;
                int[] iArr7 = this.e;
                iArr6[i2] = iArr7[a];
                iArr7[a] = i2;
                int a2 = a(tol.B(this.b[i2]));
                int[] iArr8 = this.h;
                int[] iArr9 = this.f;
                iArr8[i2] = iArr9[a2];
                iArr9[a2] = i2;
            }
        }
    }

    public final int i(int i, Object obj) {
        int[] iArr = this.e;
        int[] iArr2 = this.g;
        Object[] objArr = this.a;
        for (int i2 = iArr[a(i)]; i2 != -1; i2 = iArr2[i2]) {
            if (sha.r(objArr[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    public final int j(int i, Object obj) {
        int[] iArr = this.f;
        int[] iArr2 = this.h;
        Object[] objArr = this.b;
        for (int i2 = iArr[a(i)]; i2 != -1; i2 = iArr2[i2]) {
            if (sha.r(objArr[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    public final void k() {
        yqo.w(16, "expectedSize");
        int p = tol.p(1.0d, 16);
        this.c = 0;
        this.a = new Object[16];
        this.b = new Object[16];
        this.e = e(p);
        this.f = e(p);
        this.g = e(16);
        this.h = e(16);
        this.i = -2;
        this.j = -2;
        this.k = e(16);
        this.l = e(16);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        j79 j79Var = this.m;
        if (j79Var != null) {
            return j79Var;
        }
        j79 j79Var2 = new j79(this, 1);
        this.m = j79Var2;
        return j79Var2;
    }

    public final void l(int i, int i2) {
        z1a.s(i != -1);
        int a = a(i2);
        int[] iArr = this.g;
        int[] iArr2 = this.e;
        iArr[i] = iArr2[a];
        iArr2[a] = i;
    }

    public final void m(int i, int i2) {
        z1a.s(i != -1);
        int a = a(i2);
        int[] iArr = this.h;
        int[] iArr2 = this.f;
        iArr[i] = iArr2[a];
        iArr2[a] = i;
    }

    public final Object n(Object obj, Object obj2, boolean z) {
        int B = tol.B(obj);
        int i = i(B, obj);
        if (i != -1) {
            Object obj3 = this.b[i];
            if (sha.r(obj3, obj2)) {
                return obj2;
            }
            t(i, obj2, z);
            return obj3;
        }
        int B2 = tol.B(obj2);
        int j = j(B2, obj2);
        if (!z) {
            z1a.q(obj2, "Value already present: %s", j == -1);
        } else if (j != -1) {
            r(j, B2);
        }
        h(this.c + 1);
        Object[] objArr = this.a;
        int i2 = this.c;
        objArr[i2] = obj;
        this.b[i2] = obj2;
        l(i2, B);
        m(this.c, B2);
        u(this.j, this.c);
        u(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    public final Object o(Object obj, Object obj2, boolean z) {
        int B = tol.B(obj);
        int j = j(B, obj);
        if (j != -1) {
            Object obj3 = this.a[j];
            if (sha.r(obj3, obj2)) {
                return obj2;
            }
            s(j, obj2, z);
            return obj3;
        }
        int i = this.j;
        int B2 = tol.B(obj2);
        int i2 = i(B2, obj2);
        if (!z) {
            z1a.q(obj2, "Key already present: %s", i2 == -1);
        } else if (i2 != -1) {
            i = this.k[i2];
            q(i2, B2);
        }
        h(this.c + 1);
        Object[] objArr = this.a;
        int i3 = this.c;
        objArr[i3] = obj2;
        this.b[i3] = obj;
        l(i3, B2);
        m(this.c, B);
        int i4 = i == -2 ? this.i : this.l[i];
        u(i, this.c);
        u(this.c, i4);
        this.c++;
        this.d++;
        return null;
    }

    public final void p(int i, int i2, int i3) {
        int i4;
        int[] iArr;
        int i5;
        int[] iArr2;
        z1a.s(i != -1);
        f(i, i2);
        g(i, i3);
        u(this.k[i], this.l[i]);
        int i6 = this.c - 1;
        if (i6 != i) {
            int i7 = this.k[i6];
            int i8 = this.l[i6];
            u(i7, i);
            u(i, i8);
            Object[] objArr = this.a;
            Object obj = objArr[i6];
            Object[] objArr2 = this.b;
            Object obj2 = objArr2[i6];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int a = a(tol.B(obj));
            int[] iArr3 = this.e;
            int i9 = iArr3[a];
            if (i9 == i6) {
                iArr3[a] = i;
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
            int a2 = a(tol.B(obj2));
            int[] iArr5 = this.f;
            int i11 = iArr5[a2];
            if (i11 == i6) {
                iArr5[a2] = i;
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
        int i13 = this.c;
        objArr3[i13 - 1] = null;
        this.b[i13 - 1] = null;
        this.c = i13 - 1;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return n(obj, obj2, false);
    }

    public final void q(int i, int i2) {
        p(i, i2, tol.B(this.b[i]));
    }

    public final void r(int i, int i2) {
        p(i, tol.B(this.a[i]), i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int B = tol.B(obj);
        int i = i(B, obj);
        if (i == -1) {
            return null;
        }
        Object obj2 = this.b[i];
        q(i, B);
        return obj2;
    }

    public final void s(int i, Object obj, boolean z) {
        int i2;
        z1a.s(i != -1);
        int B = tol.B(obj);
        int i3 = i(B, obj);
        int i4 = this.j;
        if (i3 == -1) {
            i2 = -2;
        } else {
            if (!z) {
                a70.p(mz1.m(obj, "Key already present in map: "));
                return;
            }
            i4 = this.k[i3];
            i2 = this.l[i3];
            q(i3, B);
            if (i == this.c) {
                i = i3;
            }
        }
        if (i4 == i) {
            i4 = this.k[i];
        } else if (i4 == this.c) {
            i4 = i3;
        }
        if (i2 == i) {
            i3 = this.l[i];
        } else if (i2 != this.c) {
            i3 = i2;
        }
        u(this.k[i], this.l[i]);
        f(i, tol.B(this.a[i]));
        this.a[i] = obj;
        l(i, tol.B(obj));
        u(i4, i);
        u(i, i3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    public final void t(int i, Object obj, boolean z) {
        z1a.s(i != -1);
        int B = tol.B(obj);
        int j = j(B, obj);
        if (j != -1) {
            if (!z) {
                a70.p(mz1.m(obj, "Value already present in map: "));
                return;
            } else {
                r(j, B);
                if (i == this.c) {
                    i = j;
                }
            }
        }
        g(i, tol.B(this.b[i]));
        this.b[i] = obj;
        m(i, B);
    }

    public final void u(int i, int i2) {
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
    public final Collection values() {
        j79 j79Var = this.n;
        if (j79Var != null) {
            return j79Var;
        }
        j79 j79Var2 = new j79(this, 2);
        this.n = j79Var2;
        return j79Var2;
    }
}
