package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mlh {
    public final jlh a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public uzc f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final e7a p;
    public final e7a q;
    public final e7a r;
    public uzc s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public tzc x;

    public mlh(jlh jlhVar) {
        this.a = jlhVar;
        int[] iArr = jlhVar.a;
        this.b = iArr;
        Object[] objArr = jlhVar.c;
        this.c = objArr;
        this.d = jlhVar.i;
        this.e = jlhVar.j;
        this.f = jlhVar.k;
        int i = jlhVar.b;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = jlhVar.d;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new e7a(1, false);
        this.q = new e7a(1, false);
        this.r = new e7a(1, false);
        this.u = i;
        this.v = -1;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void y(mlh mlhVar) {
        int i = mlhVar.v;
        int q = mlhVar.q(i);
        int[] iArr = mlhVar.b;
        int i2 = (q * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        mlhVar.V(mlhVar.F(i, iArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r2 = r8.b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        defpackage.mh0.e(r4 + r3, r3, r2, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        defpackage.mh0.e(r5, r5 + r4, r2, r2, r3 + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(int i) {
        vu8 vu8Var;
        int i2;
        vu8 vu8Var2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int n = n() - this.h;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int b = llh.b(arrayList, i6, n); b < this.d.size() && (i3 = (vu8Var2 = (vu8) this.d.get(b)).a) < 0 && (i4 = i3 + n) < i; b++) {
                        vu8Var2.a = i4;
                    }
                } else {
                    for (int b2 = llh.b(arrayList, i, n); b2 < this.d.size() && (i2 = (vu8Var = (vu8) this.d.get(b2)).a) >= 0; b2++) {
                        vu8Var.a = -(n - i2);
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int n2 = n();
            if (i6 >= n2) {
                sf3.a("Check failed");
            }
            while (i6 < n2) {
                int i7 = (i6 * 5) + 2;
                int i8 = this.b[i7];
                int o = i8 > -2 ? i8 : (o() + i8) - (-2);
                if (o >= i) {
                    o = -((o() - o) - (-2));
                }
                if (o != i8) {
                    this.b[i7] = o;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void B(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, o());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int q = q(min);
                int q2 = q(i5);
                int i7 = this.g;
                while (q < q2) {
                    int i8 = (q * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        sf3.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    q++;
                    if (q == i7) {
                        q += this.h;
                    }
                }
            } else {
                int q3 = q(i5);
                int q4 = q(min);
                while (q3 < q4) {
                    int i10 = (q3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        sf3.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    q3++;
                    if (q3 == this.g) {
                        q3 += this.h;
                    }
                }
            }
            this.m = min;
        }
        this.k = i;
    }

    public final List C(vu8 vu8Var, mlh mlhVar) {
        if (mlhVar.n <= 0) {
            sf3.a("Check failed");
        }
        if (this.n != 0) {
            sf3.a("Check failed");
        }
        if (!vu8Var.a()) {
            sf3.a("Check failed");
        }
        int c = c(vu8Var) + 1;
        int i = this.t;
        if (i > c || c >= this.u) {
            sf3.a("Check failed");
        }
        int F = F(c, this.b);
        int t = t(c);
        int E = x(c) ? 1 : E(c);
        List C = wba.C(this, c, mlhVar, false, false, true);
        V(F);
        boolean z = E > 0;
        while (F >= i) {
            int q = q(F);
            int[] iArr = this.b;
            int i2 = q * 5;
            int i3 = i2 + 3;
            iArr[i3] = iArr[i3] - t;
            if (z) {
                int i4 = iArr[i2 + 1];
                if ((1073741824 & i4) != 0) {
                    z = false;
                } else {
                    llh.f(q, (i4 & 67108863) - E, iArr);
                }
            }
            F = F(F, this.b);
        }
        if (z) {
            if (this.o < E) {
                sf3.a("Check failed");
            }
            this.o -= E;
        }
        return C;
    }

    public final Object D(int i) {
        int q = q(i);
        int[] iArr = this.b;
        if ((iArr[(q * 5) + 1] & 1073741824) != 0) {
            return this.c[g(f(q, iArr))];
        }
        return null;
    }

    public final int E(int i) {
        return this.b[(q(i) * 5) + 1] & 67108863;
    }

    public final int F(int i, int[] iArr) {
        int i2 = iArr[(q(i) * 5) + 2];
        return i2 > -2 ? i2 : (o() + i2) - (-2);
    }

    public final Object G(Object obj) {
        if (this.n > 0) {
            w(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[g(i)];
        if (this.i > this.j) {
            sf3.a("Writing to an invalid slot");
        }
        this.c[g(this.i - 1)] = obj;
        return obj2;
    }

    public final void H() {
        int i;
        tzc tzcVar = this.x;
        if (tzcVar != null) {
            while (tzcVar.b != 0) {
                int H = d7a.H(tzcVar);
                int q = q(H);
                int i2 = H + 1;
                int t = t(H) + H;
                while (true) {
                    if (i2 >= t) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(q(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += t(i2);
                    }
                }
                int[] iArr = this.b;
                int i3 = (q * 5) + 1;
                int i4 = iArr[i3];
                if (((67108864 & i4) != 0 ? 1 : 0) != i) {
                    iArr[i3] = (i << 26) | ((-67108865) & i4);
                    int F = F(H, iArr);
                    if (F >= 0) {
                        d7a.p(tzcVar, F);
                    }
                }
            }
        }
    }

    public final boolean I() {
        if (this.n != 0) {
            sf3.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int f = f(q(i), this.b);
        int M = M();
        P(this.v);
        tzc tzcVar = this.x;
        if (tzcVar != null) {
            while (true) {
                int i3 = tzcVar.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    ogj.m("IntList is empty.");
                    return false;
                }
                if (tzcVar.a[0] < i) {
                    break;
                }
                d7a.H(tzcVar);
            }
        }
        boolean J = J(i, this.t - i);
        K(f, this.i - f, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= M;
        return J;
    }

    public final boolean J(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            A(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i3 = i + i2;
                int b = llh.b(this.d, i3, n() - this.h);
                if (b >= this.d.size()) {
                    b--;
                }
                int i4 = b + 1;
                int i5 = 0;
                while (b >= 0) {
                    vu8 vu8Var = (vu8) this.d.get(b);
                    int c = c(vu8Var);
                    if (c < i) {
                        break;
                    }
                    if (c < i3) {
                        vu8Var.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = b + 1;
                        }
                        i4 = b;
                    }
                    b--;
                }
                r0 = i4 < i5;
                if (r0) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(q(i8) * 5) + 1] & 67108864) != 0) {
                V(i8);
            }
        }
        return r0;
    }

    public final void K(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            B(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object L(int i, int i2, Object obj) {
        int O = O(q(i), this.b);
        int f = f(q(i + 1), this.b);
        int i3 = O + i2;
        if (i3 < O || i3 >= f) {
            sf3.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int g = g(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[g];
        objArr[g] = obj;
        return obj2;
    }

    public final int M() {
        int q = q(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = q * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = f(q(i3), iArr);
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void N() {
        int i = this.u;
        this.t = i;
        this.i = f(q(i), this.b);
    }

    public final int O(int i, int[] iArr) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int d = llh.d(i, iArr);
        return d < 0 ? (this.c.length - this.l) + d + 1 : d;
    }

    public final cv8 P(int i) {
        vu8 S;
        HashMap hashMap = this.e;
        if (hashMap == null || (S = S(i)) == null) {
            return null;
        }
        return (cv8) hashMap.get(S);
    }

    public final void Q() {
        if (this.n != 0) {
            sf3.a("Key must be supplied when inserting");
        }
        a99 a99Var = nf3.a;
        R(a99Var, a99Var, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(Object obj, Object obj2, boolean z, int i) {
        int i2;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.e(this.o);
        a99 a99Var = nf3.a;
        if (objArr == true) {
            int i4 = this.t;
            int f = f(q(i4), this.b);
            v(1);
            this.i = f;
            this.j = f;
            int q = q(i4);
            int i5 = obj != a99Var ? 1 : 0;
            int i6 = (z || obj2 == a99Var) ? 0 : 1;
            int h = h(f, this.k, this.l, this.c.length);
            if (h >= 0 && this.m < i4) {
                h = -(((this.c.length - this.l) - h) + 1);
            }
            int[] iArr = this.b;
            int i7 = this.v;
            int i8 = q * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = h;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                w(i9, i4);
                Object[] objArr2 = this.c;
                int i10 = this.i;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.i = i10;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0) {
                P(i3);
            }
        } else {
            this.p.e(i3);
            this.q.e((n() - this.h) - this.u);
            int i11 = this.t;
            int q2 = q(i11);
            if (!Intrinsics.c(obj2, a99Var)) {
                if (z) {
                    W(this.t, obj2);
                } else {
                    U(obj2);
                }
            }
            this.i = O(q2, this.b);
            this.j = f(q(this.t + 1), this.b);
            int[] iArr2 = this.b;
            int i12 = q2 * 5;
            this.o = iArr2[i12 + 1] & 67108863;
            this.v = i11;
            this.t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.u = i2;
    }

    public final vu8 S(int i) {
        ArrayList arrayList;
        int c;
        if (i < 0 || i >= o() || (c = llh.c((arrayList = this.d), i, o())) < 0) {
            return null;
        }
        return (vu8) arrayList.get(c);
    }

    public final void T(Object obj) {
        if (this.n <= 0 || this.i == this.k) {
            G(obj);
            return;
        }
        uzc uzcVar = this.s;
        if (uzcVar == null) {
            uzcVar = new uzc();
        }
        this.s = uzcVar;
        int i = this.v;
        Object b = uzcVar.b(i);
        if (b == null) {
            b = new l0d();
            uzcVar.i(i, b);
        }
        ((l0d) b).a(obj);
    }

    public final void U(Object obj) {
        int q = q(this.t);
        int i = (q * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            sf3.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[g(Integer.bitCount(iArr[i] >> 29) + f(q, iArr))] = obj;
    }

    public final void V(int i) {
        if (i >= 0) {
            tzc tzcVar = this.x;
            if (tzcVar == null) {
                tzcVar = new tzc();
                this.x = tzcVar;
            }
            d7a.p(tzcVar, i);
        }
    }

    public final void W(int i, Object obj) {
        int q = q(i);
        int[] iArr = this.b;
        if (q >= iArr.length || (iArr[(q * 5) + 1] & 1073741824) == 0) {
            sf3.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[g(f(q, this.b))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            sf3.a("Cannot seek backwards");
        }
        if (this.n > 0) {
            h3f.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 < this.v || i2 > this.u) {
            sf3.a("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        }
        this.t = i2;
        int f = f(q(i2), this.b);
        this.i = f;
        this.j = f;
    }

    public final vu8 b(int i) {
        ArrayList arrayList = this.d;
        int c = llh.c(arrayList, i, o());
        if (c >= 0) {
            return (vu8) arrayList.get(c);
        }
        if (i > this.g) {
            i = -(o() - i);
        }
        vu8 vu8Var = new vu8(i);
        arrayList.add(-(c + 1), vu8Var);
        return vu8Var;
    }

    public final int c(vu8 vu8Var) {
        int i = vu8Var.a;
        return i < 0 ? o() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.e((n() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            A(o());
            B(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            H();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap hashMap = this.e;
        uzc uzcVar = this.f;
        jlh jlhVar = this.a;
        if (!jlhVar.g) {
            h3f.a("Unexpected writer close()");
        }
        jlhVar.g = false;
        jlhVar.a = iArr;
        jlhVar.b = i2;
        jlhVar.c = objArr;
        jlhVar.d = i3;
        jlhVar.i = arrayList;
        jlhVar.j = hashMap;
        jlhVar.k = uzcVar;
    }

    public final int f(int i, int[] iArr) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int g(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void i() {
        l0d l0dVar;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int q = q(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = q * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        e7a e7aVar = this.r;
        if (z) {
            uzc uzcVar = this.s;
            if (uzcVar != null && (l0dVar = (l0d) uzcVar.b(i3)) != null) {
                Object[] objArr = l0dVar.a;
                int i8 = l0dVar.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    G(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            llh.f(q, i4, iArr);
            int d = e7aVar.d();
            if (z2) {
                i4 = 1;
            }
            this.o = d + i4;
            int F = F(i3, this.b);
            this.v = F;
            int o = F < 0 ? o() : q(F + 1);
            int f = o >= 0 ? f(o, this.b) : 0;
            this.i = f;
            this.j = f;
            return;
        }
        if (i != i2) {
            sf3.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        llh.f(q, i4, iArr2);
        int d2 = this.p.d();
        this.u = (n() - this.h) - this.q.d();
        this.v = d2;
        int F2 = F(i3, this.b);
        int d3 = e7aVar.d();
        this.o = d3;
        if (F2 == d2) {
            this.o = d3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (F2 != 0 && F2 != d2 && (i14 != 0 || i13 != 0)) {
                int q2 = q(F2);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (q2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    llh.f(q2, (iArr4[(q2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(q2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                F2 = F(F2, iArr5);
            }
        }
        this.o += i14;
    }

    public final void j() {
        if (this.n <= 0) {
            h3f.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                sf3.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (n() - this.h) - this.q.d();
        }
    }

    public final void k(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            sf3.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                sf3.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            Q();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((o() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(q(i3) * 5) + 2] = i;
            int i4 = this.b[(q(i3) * 5) + 3] + i3;
            l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0137, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i, Function2 function2) {
        int i2;
        int i3;
        int i4;
        Function2 function22 = function2;
        int F = F(i, this.b);
        int o = o();
        int t = t(i) + i;
        int i5 = i;
        vzc vzcVar = null;
        tzc tzcVar = null;
        loop0: while (i5 < t) {
            int f = f(q(i5), this.b);
            int i6 = i5 + 1;
            int f2 = f(q(i6), this.b);
            while (f < f2) {
                Object obj = this.c[g(f)];
                if (obj instanceof ev8) {
                    ev8 ev8Var = (ev8) obj;
                    if (!(ev8Var instanceof ev8)) {
                        ev8Var = null;
                    }
                    if (ev8Var == null) {
                        sf3.b("Inconsistent composition");
                        pvd.x();
                        return;
                    }
                    int i7 = ev8Var.b;
                    if (i7 >= 0) {
                        int t2 = t(i5) + i5;
                        int i8 = i6;
                        int i9 = 0;
                        while (i8 < t2 && i9 < i7) {
                            int q = q(i8);
                            int i10 = F;
                            int[] iArr = this.b;
                            int i11 = q * 5;
                            i8 = iArr[i11 + 3] + i8;
                            if (i8 < t2 && (iArr[i11 + 1] & 536870912) == 0) {
                                i9++;
                            }
                            F = i10;
                        }
                        i4 = F;
                        if (vzcVar == null) {
                            int[] iArr2 = b7a.a;
                            vzcVar = new vzc();
                        }
                        if (tzcVar == null) {
                            tzcVar = new tzc();
                        }
                        vzcVar.a(i8);
                        tzcVar.a(i8);
                        tzcVar.a(f);
                        f++;
                        F = i4;
                    }
                }
                i4 = F;
                function22.invoke(Integer.valueOf(f), obj);
                f++;
                F = i4;
            }
            int i12 = F;
            F = i6 < o ? F(i6, this.b) : -1;
            if (F != i5) {
                int i13 = i12;
                while (true) {
                    if (tzcVar == null || vzcVar == null || !vzcVar.f(i5)) {
                        i2 = o;
                    } else {
                        int i14 = tzcVar.b;
                        int i15 = i14 / 2;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < i15) {
                            int i18 = i16 * 2;
                            int i19 = o;
                            int c = tzcVar.c(i18);
                            if (c == i5) {
                                int c2 = tzcVar.c(i18 + 1);
                                function22.invoke(Integer.valueOf(c2), this.c[g(c2)]);
                            } else if (i18 != i17) {
                                int i20 = i17 + 1;
                                tzcVar.f(i17, c);
                                i17 += 2;
                                tzcVar.f(i20, tzcVar.c(i18 + 1));
                            } else {
                                i17 += 2;
                            }
                            i16++;
                            function22 = function2;
                            o = i19;
                        }
                        i2 = o;
                        if (i17 != i14) {
                            if (i17 < 0 || i17 > (i3 = tzcVar.b) || i14 < 0 || i14 > i3) {
                                break loop0;
                            }
                            if (i14 < i17) {
                                a70.p("The end index must be < start index");
                                return;
                            } else if (i14 != i17) {
                                if (i14 < i3) {
                                    int[] iArr3 = tzcVar.a;
                                    mh0.e(i17, i14, iArr3, iArr3, i3);
                                }
                                tzcVar.b -= i14 - i17;
                            }
                        }
                    }
                    if (i5 != i && i13 != F) {
                        i5 = i13;
                        o = i2;
                        i13 = F(i13, this.b);
                        function22 = function2;
                    }
                }
            } else {
                i2 = o;
            }
            function22 = function2;
            i5 = i6;
            o = i2;
        }
    }

    public final int n() {
        return this.b.length / 5;
    }

    public final int o() {
        return n() - this.h;
    }

    public final Object p(int i) {
        int q = q(i);
        int[] iArr = this.b;
        int i2 = (q * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return nf3.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + f(q, iArr)];
    }

    public final int q(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final int r(int i) {
        return this.b[q(i) * 5];
    }

    public final Object s(int i) {
        int q = q(i);
        int[] iArr = this.b;
        int i2 = q * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int t(int i) {
        return this.b[(q(i) * 5) + 3];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + o() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final boolean u(int i, int i2) {
        int n;
        int t;
        if (i2 == this.v) {
            n = this.u;
        } else {
            e7a e7aVar = this.p;
            if (i2 > e7aVar.c(0)) {
                t = t(i2);
            } else {
                int[] iArr = e7aVar.a;
                int min = Math.min(iArr.length, e7aVar.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    t = t(i2);
                } else {
                    n = (n() - this.h) - this.q.a[i3];
                }
            }
            n = t + i2;
        }
        return i > i2 && i < n;
    }

    public final void v(int i) {
        if (i > 0) {
            int i2 = this.t;
            A(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                mh0.e(0, 0, iArr, iArr2, i3 * 5);
                mh0.e((i3 + i6) * 5, (i4 + i3) * 5, iArr, iArr2, length * 5);
                this.b = iArr2;
                i4 = i6;
                iArr = iArr2;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int h = h(i5 > 0 ? f(q(i2 + i), iArr) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.b[(i9 * 5) + 4] = h;
            }
            int i10 = this.m;
            if (i10 >= i3) {
                this.m = i10 + i;
            }
        }
    }

    public final void w(int i, int i2) {
        if (i > 0) {
            B(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean x(int i) {
        return (this.b[(q(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void z(jlh jlhVar, int i) {
        if (this.n <= 0) {
            sf3.a("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.b == 0) {
            int[] iArr = jlhVar.a;
            int i2 = iArr[(i * 5) + 3];
            int i3 = jlhVar.b;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap hashMap = this.e;
                uzc uzcVar = this.f;
                Object[] objArr2 = jlhVar.c;
                int i4 = jlhVar.d;
                HashMap hashMap2 = jlhVar.j;
                uzc uzcVar2 = jlhVar.k;
                this.b = iArr;
                this.c = objArr2;
                this.d = jlhVar.i;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = hashMap2;
                this.f = uzcVar2;
                jlhVar.a = iArr2;
                jlhVar.b = 0;
                jlhVar.c = objArr;
                jlhVar.d = 0;
                jlhVar.i = arrayList;
                jlhVar.j = hashMap;
                jlhVar.k = uzcVar;
                return;
            }
        }
        mlh n = jlhVar.n();
        try {
            wba.C(n, i, this, true, true, false);
            n.e(true);
        } catch (Throwable th) {
            n.e(false);
            throw th;
        }
    }
}
