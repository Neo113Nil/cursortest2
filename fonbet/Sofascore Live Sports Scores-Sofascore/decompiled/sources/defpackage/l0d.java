package defpackage;

import com.ironsource.U3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l0d {
    public Object[] a;
    public int b;
    public j0d c;

    public l0d(int i) {
        this.a = i == 0 ? yjd.a : new Object[i];
    }

    public final void a(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void b(l0d l0dVar) {
        l0dVar.getClass();
        if (l0dVar.h()) {
            return;
        }
        int i = this.b + l0dVar.b;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        mh0.d(this.b, 0, l0dVar.b, l0dVar.a, this.a);
        this.b += l0dVar.b;
    }

    public final void c(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            m(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void d() {
        mh0.m(0, this.b, null, this.a);
        this.b = 0;
    }

    public final Object e() {
        if (!h()) {
            return this.a[0];
        }
        ogj.m("ObjectList is empty.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l0d) {
            l0d l0dVar = (l0d) obj;
            int i = l0dVar.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = l0dVar.a;
                IntRange j = llf.j(0, i2);
                int i3 = j.a;
                int i4 = j.b;
                if (i3 > i4) {
                    return true;
                }
                while (Intrinsics.c(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object f(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        o(i);
        throw null;
    }

    public final int g(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean h() {
        return this.b == 0;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final boolean i() {
        return this.b != 0;
    }

    public final boolean j(Object obj) {
        int g = g(obj);
        if (g < 0) {
            return false;
        }
        k(g);
        return true;
    }

    public final Object k(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            o(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            mh0.d(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void l(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            pvd.m(this.b, lnb.s(i, i2, "Start (", ") and end (", ") must be in 0.."));
            return;
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                mh0.d(i, i2, i3, objArr, objArr);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            mh0.m(i5, i4, null, this.a);
            this.b = i5;
        }
    }

    public final void m(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        mh0.d(0, 0, length, objArr, objArr2);
        this.a = objArr2;
    }

    public final Object n(int i, Object obj) {
        if (i < 0 || i >= this.b) {
            o(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void o(int i) {
        StringBuilder t = lnb.t(i, "Index ", " must be in 0..");
        t.append(this.b - 1);
        throw new IndexOutOfBoundsException(t.toString());
    }

    public final void p(int i) {
        StringBuilder t = lnb.t(i, "Index ", " must be in 0..");
        t.append(this.b);
        throw new IndexOutOfBoundsException(t.toString());
    }

    public final String toString() {
        int i = 0;
        xjd xjdVar = new xjd(this, i);
        StringBuilder sb = new StringBuilder(U3.j.d);
        Object[] objArr = this.a;
        int i2 = this.b;
        while (true) {
            if (i >= i2) {
                sb.append((CharSequence) U3.j.e);
                break;
            }
            Object obj = objArr[i];
            if (i == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) xjdVar.invoke(obj));
            i++;
        }
        return sb.toString();
    }

    public /* synthetic */ l0d() {
        this(16);
    }
}
