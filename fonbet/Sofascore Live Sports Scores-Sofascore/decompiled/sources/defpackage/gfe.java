package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gfe extends c7 {
    public final Object[] a;
    public final Object[] b;
    public final int c;
    public final int d;

    public gfe(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (!(size() > 32)) {
            h3f.a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        size();
        size();
        int length = objArr2.length;
    }

    public static Object[] q(Object[] objArr, int i, int i2, Object obj, ca caVar) {
        int C = x2a.C(i2, i);
        if (i == 0) {
            Object[] copyOf = C == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            mh0.d(C + 1, C, 31, objArr, copyOf);
            caVar.a = objArr[31];
            copyOf[C] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[C];
        obj2.getClass();
        copyOf2[C] = q((Object[]) obj2, i3, i2, obj, caVar);
        while (true) {
            C++;
            if (C >= 32 || copyOf2[C] == null) {
                break;
            }
            Object obj3 = objArr[C];
            obj3.getClass();
            copyOf2[C] = q((Object[]) obj3, i3, 0, caVar.a, caVar);
        }
        return copyOf2;
    }

    public static Object[] s(Object[] objArr, int i, int i2, ca caVar) {
        Object[] s;
        int C = x2a.C(i2, i);
        if (i == 5) {
            caVar.a = objArr[C];
            s = null;
        } else {
            Object obj = objArr[C];
            obj.getClass();
            s = s((Object[]) obj, i - 5, i2, caVar);
        }
        if (s == null && C == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[C] = s;
        return copyOf;
    }

    public static Object[] y(int i, int i2, Object obj, Object[] objArr) {
        int C = x2a.C(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[C] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[C];
        obj2.getClass();
        copyOf[C] = y(i - 5, i2, obj, (Object[]) obj2);
        return copyOf;
    }

    @Override // defpackage.c7
    public final c7 a(int i, Object obj) {
        b0a.z(i, size());
        if (i == size()) {
            return c(obj);
        }
        int x = x();
        Object[] objArr = this.a;
        if (i >= x) {
            return r(i - x, obj, objArr);
        }
        ca caVar = new ca(null);
        return r(0, caVar.a, q(objArr, this.d, i, obj, caVar));
    }

    @Override // defpackage.c7
    public final c7 c(Object obj) {
        int size = size() - x();
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[size] = obj;
            return new gfe(objArr, copyOf, size() + 1, this.d);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return t(objArr, objArr2, objArr3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        b0a.y(i, size());
        if (x() <= i) {
            objArr = this.b;
        } else {
            Object[] objArr2 = this.a;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[x2a.C(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.v2
    public final int getSize() {
        return this.c;
    }

    @Override // defpackage.u4, java.util.List
    public final ListIterator listIterator(int i) {
        b0a.z(i, size());
        return new kfe(i, size(), (this.d / 5) + 1, this.a, this.b);
    }

    @Override // defpackage.c7
    public final ife m() {
        return new ife(this, this.a, this.b, this.d);
    }

    @Override // defpackage.c7
    public final c7 n(a7 a7Var) {
        ife ifeVar = new ife(this, this.a, this.b, this.d);
        ifeVar.G(a7Var);
        return ifeVar.d();
    }

    @Override // defpackage.c7
    public final c7 o(int i) {
        b0a.y(i, size());
        int x = x();
        int i2 = this.d;
        Object[] objArr = this.a;
        return i >= x ? w(objArr, x, i2, i - x) : w(v(objArr, i2, i, new ca(this.b[0])), x, i2, 0);
    }

    @Override // defpackage.c7
    public final c7 p(int i, Object obj) {
        b0a.y(i, size());
        int x = x();
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        int i2 = this.d;
        if (x > i) {
            return new gfe(y(i2, i, obj, objArr), objArr2, size(), i2);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        copyOf[i & 31] = obj;
        return new gfe(objArr, copyOf, size(), i2);
    }

    public final gfe r(int i, Object obj, Object[] objArr) {
        int size = size() - x();
        Object[] objArr2 = this.b;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (size < 32) {
            mh0.d(i + 1, i, size, objArr2, copyOf);
            copyOf[i] = obj;
            return new gfe(objArr, copyOf, size() + 1, this.d);
        }
        Object obj2 = objArr2[31];
        mh0.d(i + 1, i, size - 1, objArr2, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return t(objArr, copyOf, objArr3);
    }

    public final gfe t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.d;
        if (size <= (1 << i)) {
            return new gfe(u(objArr, objArr2, i), objArr3, size() + 1, i);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i2 = i + 5;
        return new gfe(u(objArr4, objArr2, i2), objArr3, size() + 1, i2);
    }

    public final Object[] u(Object[] objArr, Object[] objArr2, int i) {
        int C = x2a.C(size() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[C] = objArr2;
            return copyOf;
        }
        copyOf[C] = u((Object[]) copyOf[C], objArr2, i - 5);
        return copyOf;
    }

    public final Object[] v(Object[] objArr, int i, int i2, ca caVar) {
        int C = x2a.C(i2, i);
        if (i == 0) {
            Object[] copyOf = C == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            mh0.d(C, C + 1, 32, objArr, copyOf);
            copyOf[31] = caVar.a;
            caVar.a = objArr[C];
            return copyOf;
        }
        int C2 = objArr[31] == null ? x2a.C(x() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = C + 1;
        if (i4 <= C2) {
            while (true) {
                Object obj = copyOf2[C2];
                obj.getClass();
                copyOf2[C2] = v((Object[]) obj, i3, 0, caVar);
                if (C2 == i4) {
                    break;
                }
                C2--;
            }
        }
        Object obj2 = copyOf2[C];
        obj2.getClass();
        copyOf2[C] = v((Object[]) obj2, i3, i2, caVar);
        return copyOf2;
    }

    public final c7 w(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size != 1) {
            Object[] objArr2 = this.b;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            int i4 = size - 1;
            if (i3 < i4) {
                mh0.d(i3, i3 + 1, size, objArr2, copyOf);
            }
            copyOf[i4] = null;
            return new gfe(objArr, copyOf, (i + size) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new slh(objArr);
        }
        ca caVar = new ca(null);
        Object[] s = s(objArr, i2, i - 1, caVar);
        s.getClass();
        Object obj = caVar.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (s[1] != null) {
            return new gfe(s, objArr3, i, i2);
        }
        Object obj2 = s[0];
        obj2.getClass();
        return new gfe((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int x() {
        return (size() - 1) & (-32);
    }
}
