package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h8b {
    public static boolean q = false;
    public final l7f d;
    public final ejg m;
    public fh0 p;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public rvh[] n = new rvh[1000];
    public int o = 0;
    public fh0[] g = new fh0[32];

    public h8b() {
        s();
        ejg ejgVar = new ejg(4, false);
        ejgVar.c = new s0f();
        ejgVar.b = new s0f();
        ejgVar.d = new rvh[32];
        this.m = ejgVar;
        l7f l7fVar = new l7f(ejgVar);
        l7fVar.f = new rvh[128];
        l7fVar.g = new rvh[128];
        l7fVar.h = 0;
        l7fVar.i = new k1d(l7fVar, 16);
        this.d = l7fVar;
        this.p = new fh0(ejgVar);
    }

    public static int n(Object obj) {
        rvh rvhVar = ((nl3) obj).i;
        if (rvhVar != null) {
            return (int) (rvhVar.e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final rvh a(int i) {
        s0f s0fVar = (s0f) this.m.b;
        int i2 = s0fVar.b;
        rvh rvhVar = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = s0fVar.a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            s0fVar.b = i3;
            rvhVar = r4;
        }
        rvh rvhVar2 = rvhVar;
        if (rvhVar2 == null) {
            rvhVar2 = new rvh(i);
            rvhVar2.l = i;
        } else {
            rvhVar2.c();
            rvhVar2.l = i;
        }
        int i4 = this.o;
        int i5 = this.a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.a = i6;
            this.n = (rvh[]) Arrays.copyOf(this.n, i6);
        }
        rvh[] rvhVarArr = this.n;
        int i7 = this.o;
        this.o = i7 + 1;
        rvhVarArr[i7] = rvhVar2;
        return rvhVar2;
    }

    public final void b(rvh rvhVar, rvh rvhVar2, int i, float f, rvh rvhVar3, rvh rvhVar4, int i2, int i3) {
        fh0 l = l();
        if (rvhVar2 == rvhVar3) {
            l.d.g(rvhVar, 1.0f);
            l.d.g(rvhVar4, 1.0f);
            l.d.g(rvhVar2, -2.0f);
        } else {
            wg0 wg0Var = l.d;
            if (f == 0.5f) {
                wg0Var.g(rvhVar, 1.0f);
                l.d.g(rvhVar2, -1.0f);
                l.d.g(rvhVar3, -1.0f);
                l.d.g(rvhVar4, 1.0f);
                if (i > 0 || i2 > 0) {
                    l.b = (-i) + i2;
                }
            } else if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                wg0Var.g(rvhVar, -1.0f);
                l.d.g(rvhVar2, 1.0f);
                l.b = i;
            } else if (f >= 1.0f) {
                wg0Var.g(rvhVar4, -1.0f);
                l.d.g(rvhVar3, 1.0f);
                l.b = -i2;
            } else {
                float f2 = 1.0f - f;
                wg0Var.g(rvhVar, f2 * 1.0f);
                l.d.g(rvhVar2, f2 * (-1.0f));
                l.d.g(rvhVar3, (-1.0f) * f);
                l.d.g(rvhVar4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    l.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            l.a(this, i3);
        }
        c(l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
    
        if (r4.k <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00dd, code lost:
    
        if (r4.k <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f2, code lost:
    
        if (r4.k <= 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ff, code lost:
    
        if (r4.k <= 1) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(fh0 fh0Var) {
        boolean z;
        boolean z2;
        rvh rvhVar;
        rvh f;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (fh0Var.e) {
            z = false;
        } else {
            ArrayList arrayList = fh0Var.c;
            if (this.g.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int d = fh0Var.d.d();
                    for (int i = 0; i < d; i++) {
                        rvh e = fh0Var.d.e(i);
                        if (e.c != -1 || e.f) {
                            arrayList.add(e);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            rvh rvhVar2 = (rvh) arrayList.get(i2);
                            if (rvhVar2.f) {
                                fh0Var.h(this, rvhVar2, true);
                            } else {
                                fh0Var.i(this, this.g[rvhVar2.c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (fh0Var.a != null && fh0Var.d.d() == 0) {
                    fh0Var.e = true;
                    this.b = true;
                }
            }
            if (fh0Var.e()) {
                return;
            }
            float f2 = fh0Var.b;
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fh0Var.b = f2 * (-1.0f);
                wg0 wg0Var = fh0Var.d;
                int i3 = wg0Var.h;
                for (int i4 = 0; i3 != -1 && i4 < wg0Var.a; i4++) {
                    float[] fArr = wg0Var.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = wg0Var.f[i3];
                }
            }
            int d2 = fh0Var.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            rvh rvhVar3 = null;
            rvh rvhVar4 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < d2) {
                float f6 = fh0Var.d.f(i5);
                rvh e2 = fh0Var.d.e(i5);
                float f7 = f3;
                if (e2.l == 1) {
                    if (rvhVar3 != null) {
                        if (f4 <= f6) {
                            if (!z4) {
                                if (e2.k > 1) {
                                }
                            }
                        }
                        z4 = true;
                    }
                    rvhVar3 = e2;
                    f4 = f6;
                } else if (rvhVar3 == null && f6 < f7) {
                    if (rvhVar4 != null) {
                        if (f5 <= f6) {
                            if (!z5) {
                                if (e2.k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    rvhVar4 = e2;
                    f5 = f6;
                }
                i5++;
                f3 = f7;
            }
            float f8 = f3;
            if (rvhVar3 == null) {
                rvhVar3 = rvhVar4;
            }
            if (rvhVar3 == null) {
                z2 = true;
            } else {
                fh0Var.g(rvhVar3);
                z2 = false;
            }
            if (fh0Var.d.d() == 0) {
                fh0Var.e = true;
            }
            if (z2) {
                if (this.j + 1 >= this.f) {
                    o();
                }
                rvh a = a(3);
                int i6 = this.c + 1;
                this.c = i6;
                this.j++;
                a.b = i6;
                ejg ejgVar = this.m;
                ((rvh[]) ejgVar.d)[i6] = a;
                fh0Var.a = a;
                int i7 = this.k;
                h(fh0Var);
                if (this.k == i7 + 1) {
                    fh0 fh0Var2 = this.p;
                    fh0Var2.a = null;
                    fh0Var2.d.b();
                    for (int i8 = 0; i8 < fh0Var.d.d(); i8++) {
                        fh0Var2.d.a(fh0Var.d.e(i8), fh0Var.d.f(i8), true);
                    }
                    r(this.p);
                    if (a.c == -1) {
                        if (fh0Var.a == a && (f = fh0Var.f(null, a)) != null) {
                            fh0Var.g(f);
                        }
                        if (!fh0Var.e) {
                            fh0Var.a.e(this, fh0Var);
                        }
                        ((s0f) ejgVar.c).a(fh0Var);
                        this.k--;
                    }
                    z = true;
                    rvhVar = fh0Var.a;
                    if (rvhVar != null) {
                        return;
                    }
                    if (rvhVar.l != 1 && fh0Var.b < f8) {
                        return;
                    }
                }
            }
            z = false;
            rvhVar = fh0Var.a;
            if (rvhVar != null) {
            }
        }
        if (z) {
            return;
        }
        h(fh0Var);
    }

    public final void d(rvh rvhVar, int i) {
        int i2 = rvhVar.c;
        if (i2 == -1) {
            rvhVar.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                rvh rvhVar2 = ((rvh[]) this.m.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            fh0 l = l();
            l.a = rvhVar;
            float f = i;
            rvhVar.e = f;
            l.b = f;
            l.e = true;
            c(l);
            return;
        }
        fh0 fh0Var = this.g[i2];
        if (fh0Var.e) {
            fh0Var.b = i;
            return;
        }
        if (fh0Var.d.d() == 0) {
            fh0Var.e = true;
            fh0Var.b = i;
            return;
        }
        fh0 l2 = l();
        if (i < 0) {
            l2.b = i * (-1);
            l2.d.g(rvhVar, 1.0f);
        } else {
            l2.b = i;
            l2.d.g(rvhVar, -1.0f);
        }
        c(l2);
    }

    public final void e(rvh rvhVar, rvh rvhVar2, int i, int i2) {
        if (i2 == 8 && rvhVar2.f && rvhVar.c == -1) {
            rvhVar.d(this, rvhVar2.e + i);
            return;
        }
        fh0 l = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.b = i;
        }
        wg0 wg0Var = l.d;
        if (z) {
            wg0Var.g(rvhVar, 1.0f);
            l.d.g(rvhVar2, -1.0f);
        } else {
            wg0Var.g(rvhVar, -1.0f);
            l.d.g(rvhVar2, 1.0f);
        }
        if (i2 != 8) {
            l.a(this, i2);
        }
        c(l);
    }

    public final void f(rvh rvhVar, rvh rvhVar2, int i, int i2) {
        fh0 l = l();
        rvh m = m();
        m.d = 0;
        l.b(rvhVar, rvhVar2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(rvh rvhVar, rvh rvhVar2, int i, int i2) {
        fh0 l = l();
        rvh m = m();
        m.d = 0;
        l.c(rvhVar, rvhVar2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(fh0 fh0Var) {
        int i;
        if (fh0Var.e) {
            fh0Var.a.d(this, fh0Var.b);
        } else {
            fh0[] fh0VarArr = this.g;
            int i2 = this.k;
            fh0VarArr[i2] = fh0Var;
            rvh rvhVar = fh0Var.a;
            rvhVar.c = i2;
            this.k = i2 + 1;
            rvhVar.e(this, fh0Var);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                fh0 fh0Var2 = this.g[i3];
                if (fh0Var2 != null && fh0Var2.e) {
                    fh0Var2.a.d(this, fh0Var2.b);
                    ((s0f) this.m.c).a(fh0Var2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        fh0[] fh0VarArr2 = this.g;
                        int i6 = i4 - 1;
                        fh0 fh0Var3 = fh0VarArr2[i4];
                        fh0VarArr2[i6] = fh0Var3;
                        rvh rvhVar2 = fh0Var3.a;
                        if (rvhVar2.c == i4) {
                            rvhVar2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            fh0 fh0Var = this.g[i];
            fh0Var.a.e = fh0Var.b;
        }
    }

    public final rvh j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        rvh a = a(4);
        float[] fArr = a.h;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        a.b = i2;
        a.d = i;
        ((rvh[]) this.m.d)[i2] = a;
        l7f l7fVar = this.d;
        l7fVar.i.b = a;
        Arrays.fill(fArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        fArr[a.d] = 1.0f;
        l7fVar.j(a);
        return a;
    }

    public final rvh k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof nl3)) {
            return null;
        }
        nl3 nl3Var = (nl3) obj;
        rvh rvhVar = nl3Var.i;
        if (rvhVar == null) {
            nl3Var.k();
            rvhVar = nl3Var.i;
        }
        int i = rvhVar.b;
        ejg ejgVar = this.m;
        if (i != -1 && i <= this.c && ((rvh[]) ejgVar.d)[i] != null) {
            return rvhVar;
        }
        if (i != -1) {
            rvhVar.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        rvhVar.b = i2;
        rvhVar.l = 1;
        ((rvh[]) ejgVar.d)[i2] = rvhVar;
        return rvhVar;
    }

    public final fh0 l() {
        Object obj;
        ejg ejgVar = this.m;
        s0f s0fVar = (s0f) ejgVar.c;
        int i = s0fVar.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = s0fVar.a;
            obj = objArr[i2];
            objArr[i2] = null;
            s0fVar.b = i2;
        } else {
            obj = null;
        }
        fh0 fh0Var = (fh0) obj;
        if (fh0Var == null) {
            return new fh0(ejgVar);
        }
        fh0Var.a = null;
        fh0Var.d.b();
        fh0Var.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        fh0Var.e = false;
        return fh0Var;
    }

    public final rvh m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        rvh a = a(3);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        a.b = i;
        ((rvh[]) this.m.d)[i] = a;
        return a;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (fh0[]) Arrays.copyOf(this.g, i);
        ejg ejgVar = this.m;
        ejgVar.d = (rvh[]) Arrays.copyOf((rvh[]) ejgVar.d, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        l7f l7fVar = this.d;
        if (l7fVar.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(l7fVar);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(l7fVar);
                return;
            }
        }
        i();
    }

    public final void q(l7f l7fVar) {
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            fh0 fh0Var = this.g[i];
            int i2 = 1;
            if (fh0Var.a.l != 1) {
                float f = fh0Var.b;
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f3 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.k) {
                            fh0 fh0Var2 = this.g[i6];
                            if (fh0Var2.a.l != i2 && !fh0Var2.e && fh0Var2.b < f2) {
                                int d = fh0Var2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    rvh e = fh0Var2.d.e(i8);
                                    float c = fh0Var2.d.c(e);
                                    if (c > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = e.g[i9] / c;
                                            if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e.b;
                                                i4 = i6;
                                                f3 = f4;
                                            }
                                        }
                                    }
                                    i8++;
                                    f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                }
                            }
                            i6++;
                            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            fh0 fh0Var3 = this.g[i4];
                            fh0Var3.a.c = -1;
                            fh0Var3.g(((rvh[]) this.m.d)[i5]);
                            rvh rvhVar = fh0Var3.a;
                            rvhVar.c = i4;
                            rvhVar.e(this, fh0Var3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.j / 2) {
                            z = true;
                        }
                        f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(l7fVar);
        i();
    }

    public final void r(fh0 fh0Var) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.j; i2++) {
            this.i[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.j * 2) {
                return;
            }
            rvh rvhVar = fh0Var.a;
            if (rvhVar != null) {
                this.i[rvhVar.b] = true;
            }
            rvh d = fh0Var.d(this.i);
            if (d != null) {
                boolean[] zArr = this.i;
                int i4 = d.b;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (d != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.k) {
                    fh0 fh0Var2 = this.g[i5];
                    if (fh0Var2.a.l != 1 && !fh0Var2.e) {
                        wg0 wg0Var = fh0Var2.d;
                        int i7 = wg0Var.h;
                        if (i7 != -1) {
                            for (int i8 = i; i7 != -1 && i8 < wg0Var.a; i8++) {
                                if (wg0Var.e[i7] == d.b) {
                                    z = true;
                                    break;
                                }
                                i7 = wg0Var.f[i7];
                            }
                        }
                        z = false;
                        if (z) {
                            float c = fh0Var2.d.c(d);
                            if (c < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                float f2 = (-fh0Var2.b) / c;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    fh0 fh0Var3 = this.g[i6];
                    fh0Var3.a.c = -1;
                    fh0Var3.g(d);
                    rvh rvhVar2 = fh0Var3.a;
                    rvhVar2.c = i6;
                    rvhVar2.e(this, fh0Var3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            fh0 fh0Var = this.g[i];
            if (fh0Var != null) {
                ((s0f) this.m.c).a(fh0Var);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        ejg ejgVar;
        int i = 0;
        while (true) {
            ejgVar = this.m;
            rvh[] rvhVarArr = (rvh[]) ejgVar.d;
            if (i >= rvhVarArr.length) {
                break;
            }
            rvh rvhVar = rvhVarArr[i];
            if (rvhVar != null) {
                rvhVar.c();
            }
            i++;
        }
        s0f s0fVar = (s0f) ejgVar.b;
        rvh[] rvhVarArr2 = this.n;
        int i2 = this.o;
        s0fVar.getClass();
        if (i2 > rvhVarArr2.length) {
            i2 = rvhVarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            rvh rvhVar2 = rvhVarArr2[i3];
            int i4 = s0fVar.b;
            Object[] objArr = s0fVar.a;
            if (i4 < objArr.length) {
                objArr[i4] = rvhVar2;
                s0fVar.b = i4 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((rvh[]) ejgVar.d, (Object) null);
        this.c = 0;
        l7f l7fVar = this.d;
        l7fVar.h = 0;
        l7fVar.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.j = 1;
        for (int i5 = 0; i5 < this.k; i5++) {
            fh0 fh0Var = this.g[i5];
        }
        s();
        this.k = 0;
        this.p = new fh0(ejgVar);
    }
}
