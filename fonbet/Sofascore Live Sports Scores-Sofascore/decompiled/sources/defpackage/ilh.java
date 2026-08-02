package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ilh {
    public final jlh a;
    public final int[] b;
    public final int c;
    public Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public final e7a j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public ilh(jlh jlhVar) {
        this.a = jlhVar;
        this.b = jlhVar.a;
        int i = jlhVar.b;
        this.c = i;
        this.d = jlhVar.c;
        this.e = jlhVar.d;
        this.h = i;
        this.i = -1;
        this.j = new e7a(1, false);
    }

    public final vu8 a(int i) {
        ArrayList arrayList = this.a.i;
        int c = llh.c(arrayList, i, this.c);
        if (c >= 0) {
            return (vu8) arrayList.get(c);
        }
        vu8 vu8Var = new vu8(i);
        arrayList.add(-(c + 1), vu8Var);
        return vu8Var;
    }

    public final Object b(int i, int[] iArr) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.d[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return nf3.a;
    }

    public final void c() {
        this.f = true;
        if (this.a.e <= 0) {
            sf3.a("Unexpected reader close()");
        }
        r0.e--;
        this.d = new Object[0];
    }

    public final boolean d(int i) {
        return (this.b[(i * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.k == 0) {
            if (this.g != this.h) {
                sf3.a("endGroup() not called at the end of a group");
            }
            int i = (this.i * 5) + 2;
            int[] iArr = this.b;
            int i2 = iArr[i];
            this.i = i2;
            int i3 = this.c;
            this.h = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int d = this.j.d();
            if (d < 0) {
                this.l = 0;
                this.m = 0;
            } else {
                this.l = d;
                this.m = i2 >= i3 + (-1) ? this.e : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i = this.g;
        if (i < this.h) {
            return b(i, this.b);
        }
        return 0;
    }

    public final int g() {
        int i = this.g;
        if (i >= this.h) {
            return 0;
        }
        return this.b[i * 5];
    }

    public final Object h(int i, int i2) {
        int[] iArr = this.b;
        int d = llh.d(i, iArr);
        int i3 = i + 1;
        int i4 = d + i2;
        return i4 < (i3 < this.c ? iArr[(i3 * 5) + 4] : this.e) ? this.d[i4] : nf3.a;
    }

    public final int i(int i) {
        return this.b[i * 5];
    }

    public final boolean j(int i) {
        return (this.b[(i * 5) + 1] & 134217728) != 0;
    }

    public final boolean k(int i) {
        return (this.b[(i * 5) + 1] & 536870912) != 0;
    }

    public final boolean l(int i) {
        return (this.b[(i * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i;
        if (this.k > 0 || (i = this.l) >= this.m) {
            this.n = false;
            return nf3.a;
        }
        this.n = true;
        Object[] objArr = this.d;
        this.l = i + 1;
        return objArr[i];
    }

    public final Object n(int i) {
        int i2 = i * 5;
        int[] iArr = this.b;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.d[iArr[i2 + 4]] : nf3.a;
        }
        return null;
    }

    public final int o(int i) {
        return this.b[(i * 5) + 1] & 67108863;
    }

    public final Object p(int i, int[] iArr) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.d[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int q(int i) {
        return this.b[(i * 5) + 2];
    }

    public final void r(int i) {
        if (this.k != 0) {
            sf3.a("Cannot reposition while in an empty region");
        }
        this.g = i;
        int[] iArr = this.b;
        int i2 = this.c;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.i) {
            this.i = i3;
            if (i3 < 0) {
                this.h = i2;
            } else {
                this.h = iArr[(i3 * 5) + 3] + i3;
            }
            this.l = 0;
            this.m = 0;
        }
    }

    public final int s() {
        if (this.k != 0) {
            sf3.a("Cannot skip while in an empty region");
        }
        int i = this.g;
        int i2 = i * 5;
        int[] iArr = this.b;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.g = iArr[i2 + 3] + i;
        return i4;
    }

    public final void t() {
        if (!(this.k == 0)) {
            sf3.a("Cannot skip the enclosing group while in an empty region");
        }
        this.g = this.h;
        this.l = 0;
        this.m = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.g);
        sb.append(", key=");
        sb.append(g());
        sb.append(", parent=");
        sb.append(this.i);
        sb.append(", end=");
        return wv8.j(sb, this.h, ')');
    }

    public final void u() {
        if (this.k <= 0) {
            int i = this.i;
            int i2 = this.g;
            int i3 = i2 * 5;
            int[] iArr = this.b;
            if (iArr[i3 + 2] != i) {
                h3f.a("Invalid slot table detected");
            }
            int i4 = this.l;
            int i5 = this.m;
            e7a e7aVar = this.j;
            if (i4 == 0 && i5 == 0) {
                e7aVar.e(-1);
            } else {
                e7aVar.e(i4);
            }
            this.i = i2;
            this.h = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.g = i6;
            this.l = llh.d(i2, iArr);
            this.m = i2 >= this.c + (-1) ? this.e : iArr[(i6 * 5) + 4];
        }
    }
}
