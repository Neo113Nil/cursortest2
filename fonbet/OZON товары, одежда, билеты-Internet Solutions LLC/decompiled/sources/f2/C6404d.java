package f2;

import f2.h;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: f2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6404d {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f62453q = false;

    /* renamed from: d, reason: collision with root package name */
    private g f62457d;

    /* renamed from: m, reason: collision with root package name */
    final C6403c f62466m;

    /* renamed from: p, reason: collision with root package name */
    private C6402b f62469p;

    /* renamed from: a, reason: collision with root package name */
    private int f62454a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f62455b = false;

    /* renamed from: c, reason: collision with root package name */
    int f62456c = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f62458e = 32;

    /* renamed from: f, reason: collision with root package name */
    private int f62459f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f62461h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean[] f62462i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    int f62463j = 1;

    /* renamed from: k, reason: collision with root package name */
    int f62464k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f62465l = 32;

    /* renamed from: n, reason: collision with root package name */
    private h[] f62467n = new h[1000];

    /* renamed from: o, reason: collision with root package name */
    private int f62468o = 0;

    /* renamed from: g, reason: collision with root package name */
    C6402b[] f62460g = new C6402b[32];

    /* renamed from: f2.d$a */
    interface a {
        h a(boolean[] zArr);
    }

    public C6404d() {
        t();
        C6403c c6403c = new C6403c();
        c6403c.f62450a = new f();
        c6403c.f62451b = new f();
        c6403c.f62452c = new h[32];
        this.f62466m = c6403c;
        this.f62457d = new g(c6403c);
        this.f62469p = new C6402b(c6403c);
    }

    private h a(h.a aVar) {
        h hVar = (h) this.f62466m.f62451b.a();
        if (hVar == null) {
            hVar = new h(aVar);
            hVar.f62486i = aVar;
        } else {
            hVar.c();
            hVar.f62486i = aVar;
        }
        int i11 = this.f62468o;
        int i12 = this.f62454a;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            this.f62454a = i13;
            this.f62467n = (h[]) Arrays.copyOf(this.f62467n, i13);
        }
        h[] hVarArr = this.f62467n;
        int i14 = this.f62468o;
        this.f62468o = i14 + 1;
        hVarArr[i14] = hVar;
        return hVar;
    }

    private void h(C6402b c6402b) {
        int i11;
        if (c6402b.f62449e) {
            c6402b.f62445a.d(this, c6402b.f62446b);
        } else {
            C6402b[] c6402bArr = this.f62460g;
            int i12 = this.f62464k;
            c6402bArr[i12] = c6402b;
            h hVar = c6402b.f62445a;
            hVar.f62480c = i12;
            this.f62464k = i12 + 1;
            hVar.e(this, c6402b);
        }
        if (this.f62455b) {
            int i13 = 0;
            while (i13 < this.f62464k) {
                if (this.f62460g[i13] == null) {
                    System.out.println("WTF");
                }
                C6402b c6402b2 = this.f62460g[i13];
                if (c6402b2 != null && c6402b2.f62449e) {
                    c6402b2.f62445a.d(this, c6402b2.f62446b);
                    this.f62466m.f62450a.b(c6402b2);
                    this.f62460g[i13] = null;
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (true) {
                        i11 = this.f62464k;
                        if (i14 >= i11) {
                            break;
                        }
                        C6402b[] c6402bArr2 = this.f62460g;
                        int i16 = i14 - 1;
                        C6402b c6402b3 = c6402bArr2[i14];
                        c6402bArr2[i16] = c6402b3;
                        h hVar2 = c6402b3.f62445a;
                        if (hVar2.f62480c == i14) {
                            hVar2.f62480c = i16;
                        }
                        i15 = i14;
                        i14++;
                    }
                    if (i15 < i11) {
                        this.f62460g[i15] = null;
                    }
                    this.f62464k = i11 - 1;
                    i13--;
                }
                i13++;
            }
            this.f62455b = false;
        }
    }

    private void i() {
        for (int i11 = 0; i11 < this.f62464k; i11++) {
            C6402b c6402b = this.f62460g[i11];
            c6402b.f62445a.f62482e = c6402b.f62446b;
        }
    }

    public static int o(Object obj) {
        h h11 = ((m2.d) obj).h();
        if (h11 != null) {
            return (int) (h11.f62482e + 0.5f);
        }
        return 0;
    }

    private void p() {
        int i11 = this.f62458e * 2;
        this.f62458e = i11;
        this.f62460g = (C6402b[]) Arrays.copyOf(this.f62460g, i11);
        C6403c c6403c = this.f62466m;
        c6403c.f62452c = (h[]) Arrays.copyOf(c6403c.f62452c, this.f62458e);
        int i12 = this.f62458e;
        this.f62462i = new boolean[i12];
        this.f62459f = i12;
        this.f62465l = i12;
    }

    private void s(C6402b c6402b) {
        for (int i11 = 0; i11 < this.f62463j; i11++) {
            this.f62462i[i11] = false;
        }
        boolean z11 = false;
        int i12 = 0;
        while (!z11) {
            i12++;
            if (i12 >= this.f62463j * 2) {
                return;
            }
            h hVar = c6402b.f62445a;
            if (hVar != null) {
                this.f62462i[hVar.f62479b] = true;
            }
            h a11 = c6402b.a(this.f62462i);
            if (a11 != null) {
                boolean[] zArr = this.f62462i;
                int i13 = a11.f62479b;
                if (zArr[i13]) {
                    return;
                } else {
                    zArr[i13] = true;
                }
            }
            if (a11 != null) {
                float f7 = Float.MAX_VALUE;
                int i14 = -1;
                for (int i15 = 0; i15 < this.f62464k; i15++) {
                    C6402b c6402b2 = this.f62460g[i15];
                    if (c6402b2.f62445a.f62486i != h.a.UNRESTRICTED && !c6402b2.f62449e && c6402b2.f62448d.c(a11)) {
                        float h11 = c6402b2.f62448d.h(a11);
                        if (h11 < 0.0f) {
                            float f11 = (-c6402b2.f62446b) / h11;
                            if (f11 < f7) {
                                i14 = i15;
                                f7 = f11;
                            }
                        }
                    }
                }
                if (i14 > -1) {
                    C6402b c6402b3 = this.f62460g[i14];
                    c6402b3.f62445a.f62480c = -1;
                    c6402b3.j(a11);
                    h hVar2 = c6402b3.f62445a;
                    hVar2.f62480c = i14;
                    hVar2.e(this, c6402b3);
                }
            } else {
                z11 = true;
            }
        }
    }

    private void t() {
        for (int i11 = 0; i11 < this.f62464k; i11++) {
            C6402b c6402b = this.f62460g[i11];
            if (c6402b != null) {
                this.f62466m.f62450a.b(c6402b);
            }
            this.f62460g[i11] = null;
        }
    }

    public final void b(h hVar, h hVar2, int i11, float f7, h hVar3, h hVar4, int i12, int i13) {
        C6402b l11 = l();
        if (hVar2 == hVar3) {
            l11.f62448d.a(hVar, 1.0f);
            l11.f62448d.a(hVar4, 1.0f);
            l11.f62448d.a(hVar2, -2.0f);
        } else if (f7 == 0.5f) {
            l11.f62448d.a(hVar, 1.0f);
            l11.f62448d.a(hVar2, -1.0f);
            l11.f62448d.a(hVar3, -1.0f);
            l11.f62448d.a(hVar4, 1.0f);
            if (i11 > 0 || i12 > 0) {
                l11.f62446b = (-i11) + i12;
            }
        } else if (f7 <= 0.0f) {
            l11.f62448d.a(hVar, -1.0f);
            l11.f62448d.a(hVar2, 1.0f);
            l11.f62446b = i11;
        } else if (f7 >= 1.0f) {
            l11.f62448d.a(hVar4, -1.0f);
            l11.f62448d.a(hVar3, 1.0f);
            l11.f62446b = -i12;
        } else {
            float f11 = 1.0f - f7;
            l11.f62448d.a(hVar, f11 * 1.0f);
            l11.f62448d.a(hVar2, f11 * (-1.0f));
            l11.f62448d.a(hVar3, (-1.0f) * f7);
            l11.f62448d.a(hVar4, 1.0f * f7);
            if (i11 > 0 || i12 > 0) {
                l11.f62446b = (i12 * f7) + ((-i11) * f11);
            }
        }
        if (i13 != 8) {
            l11.b(this, i13);
        }
        c(l11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00be, code lost:
    
        if (r4.f62489l <= 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c1, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cb, code lost:
    
        if (r4.f62489l <= 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e0, code lost:
    
        if (r4.f62489l <= 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e3, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ed, code lost:
    
        if (r4.f62489l <= 1) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C6402b c6402b) {
        boolean z11;
        boolean z12;
        h hVar;
        h h11;
        ArrayList<h> arrayList;
        boolean z13 = true;
        if (this.f62464k + 1 >= this.f62465l || this.f62463j + 1 >= this.f62459f) {
            p();
        }
        if (c6402b.f62449e) {
            z11 = false;
        } else {
            if (this.f62460g.length != 0) {
                boolean z14 = false;
                while (!z14) {
                    int j11 = c6402b.f62448d.j();
                    int i11 = 0;
                    while (true) {
                        arrayList = c6402b.f62447c;
                        if (i11 >= j11) {
                            break;
                        }
                        h b11 = c6402b.f62448d.b(i11);
                        if (b11.f62480c != -1 || b11.f62483f) {
                            arrayList.add(b11);
                        }
                        i11++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i12 = 0; i12 < size; i12++) {
                            h hVar2 = arrayList.get(i12);
                            if (hVar2.f62483f) {
                                c6402b.k(this, hVar2, true);
                            } else {
                                c6402b.l(this, this.f62460g[hVar2.f62480c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z14 = true;
                    }
                }
                if (c6402b.f62445a != null && c6402b.f62448d.j() == 0) {
                    c6402b.f62449e = true;
                    this.f62455b = true;
                }
            }
            if (c6402b.g()) {
                return;
            }
            float f7 = c6402b.f62446b;
            float f11 = 0.0f;
            if (f7 < 0.0f) {
                c6402b.f62446b = f7 * (-1.0f);
                c6402b.f62448d.g();
            }
            int j12 = c6402b.f62448d.j();
            float f12 = 0.0f;
            float f13 = 0.0f;
            h hVar3 = null;
            h hVar4 = null;
            int i13 = 0;
            boolean z15 = false;
            boolean z16 = false;
            while (i13 < j12) {
                float k11 = c6402b.f62448d.k(i13);
                h b12 = c6402b.f62448d.b(i13);
                float f14 = f11;
                if (b12.f62486i == h.a.UNRESTRICTED) {
                    if (hVar3 != null) {
                        if (f12 <= k11) {
                            if (!z15) {
                                if (b12.f62489l > 1) {
                                }
                            }
                        }
                        z15 = true;
                    }
                    hVar3 = b12;
                    f12 = k11;
                } else if (hVar3 == null && k11 < f14) {
                    if (hVar4 != null) {
                        if (f13 <= k11) {
                            if (!z16) {
                                if (b12.f62489l > 1) {
                                }
                            }
                        }
                        z16 = true;
                    }
                    hVar4 = b12;
                    f13 = k11;
                }
                i13++;
                f11 = f14;
            }
            float f15 = f11;
            if (hVar3 == null) {
                hVar3 = hVar4;
            }
            if (hVar3 == null) {
                z12 = true;
            } else {
                c6402b.j(hVar3);
                z12 = false;
            }
            if (c6402b.f62448d.j() == 0) {
                c6402b.f62449e = true;
            }
            if (z12) {
                if (this.f62463j + 1 >= this.f62459f) {
                    p();
                }
                h a11 = a(h.a.SLACK);
                int i14 = this.f62456c + 1;
                this.f62456c = i14;
                this.f62463j++;
                a11.f62479b = i14;
                C6403c c6403c = this.f62466m;
                c6403c.f62452c[i14] = a11;
                c6402b.f62445a = a11;
                int i15 = this.f62464k;
                h(c6402b);
                if (this.f62464k == i15 + 1) {
                    C6402b c6402b2 = this.f62469p;
                    c6402b2.getClass();
                    c6402b2.f62445a = null;
                    c6402b2.f62448d.clear();
                    for (int i16 = 0; i16 < c6402b.f62448d.j(); i16++) {
                        c6402b2.f62448d.i(c6402b.f62448d.b(i16), c6402b.f62448d.k(i16), true);
                    }
                    s(this.f62469p);
                    if (a11.f62480c == -1) {
                        if (c6402b.f62445a == a11 && (h11 = c6402b.h(a11)) != null) {
                            c6402b.j(h11);
                        }
                        if (!c6402b.f62449e) {
                            c6402b.f62445a.e(this, c6402b);
                        }
                        c6403c.f62450a.b(c6402b);
                        this.f62464k--;
                    }
                    hVar = c6402b.f62445a;
                    if (hVar != null) {
                        return;
                    }
                    if (hVar.f62486i != h.a.UNRESTRICTED && c6402b.f62446b < f15) {
                        return;
                    } else {
                        z11 = z13;
                    }
                }
            }
            z13 = false;
            hVar = c6402b.f62445a;
            if (hVar != null) {
            }
        }
        if (z11) {
            return;
        }
        h(c6402b);
    }

    public final void d(h hVar, int i11) {
        int i12 = hVar.f62480c;
        if (i12 == -1) {
            hVar.d(this, i11);
            for (int i13 = 0; i13 < this.f62456c + 1; i13++) {
                h hVar2 = this.f62466m.f62452c[i13];
            }
            return;
        }
        if (i12 == -1) {
            C6402b l11 = l();
            l11.f62445a = hVar;
            float f7 = i11;
            hVar.f62482e = f7;
            l11.f62446b = f7;
            l11.f62449e = true;
            c(l11);
            return;
        }
        C6402b c6402b = this.f62460g[i12];
        if (c6402b.f62449e) {
            c6402b.f62446b = i11;
            return;
        }
        if (c6402b.f62448d.j() == 0) {
            c6402b.f62449e = true;
            c6402b.f62446b = i11;
            return;
        }
        C6402b l12 = l();
        if (i11 < 0) {
            l12.f62446b = i11 * (-1);
            l12.f62448d.a(hVar, 1.0f);
        } else {
            l12.f62446b = i11;
            l12.f62448d.a(hVar, -1.0f);
        }
        c(l12);
    }

    public final void e(h hVar, h hVar2, int i11, int i12) {
        if (i12 == 8 && hVar2.f62483f && hVar.f62480c == -1) {
            hVar.d(this, hVar2.f62482e + i11);
            return;
        }
        C6402b l11 = l();
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            l11.f62446b = i11;
        }
        if (z11) {
            l11.f62448d.a(hVar, 1.0f);
            l11.f62448d.a(hVar2, -1.0f);
        } else {
            l11.f62448d.a(hVar, -1.0f);
            l11.f62448d.a(hVar2, 1.0f);
        }
        if (i12 != 8) {
            l11.b(this, i12);
        }
        c(l11);
    }

    public final void f(h hVar, h hVar2, int i11, int i12) {
        C6402b l11 = l();
        h m11 = m();
        m11.f62481d = 0;
        l11.d(hVar, hVar2, m11, i11);
        if (i12 != 8) {
            l11.f62448d.a(j(i12), (int) (l11.f62448d.h(m11) * (-1.0f)));
        }
        c(l11);
    }

    public final void g(h hVar, h hVar2, int i11, int i12) {
        C6402b l11 = l();
        h m11 = m();
        m11.f62481d = 0;
        l11.e(hVar, hVar2, m11, i11);
        if (i12 != 8) {
            l11.f62448d.a(j(i12), (int) (l11.f62448d.h(m11) * (-1.0f)));
        }
        c(l11);
    }

    public final h j(int i11) {
        if (this.f62463j + 1 >= this.f62459f) {
            p();
        }
        h a11 = a(h.a.ERROR);
        int i12 = this.f62456c + 1;
        this.f62456c = i12;
        this.f62463j++;
        a11.f62479b = i12;
        a11.f62481d = i11;
        this.f62466m.f62452c[i12] = a11;
        this.f62457d.m(a11);
        return a11;
    }

    public final h k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f62463j + 1 >= this.f62459f) {
            p();
        }
        if (!(obj instanceof m2.d)) {
            return null;
        }
        m2.d dVar = (m2.d) obj;
        h h11 = dVar.h();
        if (h11 == null) {
            dVar.p();
            h11 = dVar.h();
        }
        int i11 = h11.f62479b;
        C6403c c6403c = this.f62466m;
        if (i11 != -1 && i11 <= this.f62456c && c6403c.f62452c[i11] != null) {
            return h11;
        }
        if (i11 != -1) {
            h11.c();
        }
        int i12 = this.f62456c + 1;
        this.f62456c = i12;
        this.f62463j++;
        h11.f62479b = i12;
        h11.f62486i = h.a.UNRESTRICTED;
        c6403c.f62452c[i12] = h11;
        return h11;
    }

    public final C6402b l() {
        C6403c c6403c = this.f62466m;
        C6402b c6402b = (C6402b) c6403c.f62450a.a();
        if (c6402b == null) {
            return new C6402b(c6403c);
        }
        c6402b.f62445a = null;
        c6402b.f62448d.clear();
        c6402b.f62446b = 0.0f;
        c6402b.f62449e = false;
        return c6402b;
    }

    public final h m() {
        if (this.f62463j + 1 >= this.f62459f) {
            p();
        }
        h a11 = a(h.a.SLACK);
        int i11 = this.f62456c + 1;
        this.f62456c = i11;
        this.f62463j++;
        a11.f62479b = i11;
        this.f62466m.f62452c[i11] = a11;
        return a11;
    }

    public final C6403c n() {
        return this.f62466m;
    }

    public final void q() throws Exception {
        g gVar = this.f62457d;
        if (gVar.g()) {
            i();
            return;
        }
        if (!this.f62461h) {
            r(gVar);
            return;
        }
        for (int i11 = 0; i11 < this.f62464k; i11++) {
            if (!this.f62460g[i11].f62449e) {
                r(gVar);
                return;
            }
        }
        i();
    }

    final void r(g gVar) throws Exception {
        int i11 = 0;
        while (true) {
            if (i11 >= this.f62464k) {
                break;
            }
            C6402b c6402b = this.f62460g[i11];
            if (c6402b.f62445a.f62486i != h.a.UNRESTRICTED) {
                float f7 = 0.0f;
                if (c6402b.f62446b < 0.0f) {
                    boolean z11 = false;
                    int i12 = 0;
                    while (!z11) {
                        i12++;
                        float f11 = Float.MAX_VALUE;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < this.f62464k) {
                            C6402b c6402b2 = this.f62460g[i15];
                            if (c6402b2.f62445a.f62486i != h.a.UNRESTRICTED && !c6402b2.f62449e && c6402b2.f62446b < f7) {
                                int j11 = c6402b2.f62448d.j();
                                int i17 = 0;
                                while (i17 < j11) {
                                    h b11 = c6402b2.f62448d.b(i17);
                                    float h11 = c6402b2.f62448d.h(b11);
                                    if (h11 > f7) {
                                        for (int i18 = 0; i18 < 9; i18++) {
                                            float f12 = b11.f62484g[i18] / h11;
                                            if ((f12 < f11 && i18 == i16) || i18 > i16) {
                                                i16 = i18;
                                                i14 = b11.f62479b;
                                                i13 = i15;
                                                f11 = f12;
                                            }
                                        }
                                    }
                                    i17++;
                                    f7 = 0.0f;
                                }
                            }
                            i15++;
                            f7 = 0.0f;
                        }
                        if (i13 != -1) {
                            C6402b c6402b3 = this.f62460g[i13];
                            c6402b3.f62445a.f62480c = -1;
                            c6402b3.j(this.f62466m.f62452c[i14]);
                            h hVar = c6402b3.f62445a;
                            hVar.f62480c = i13;
                            hVar.e(this, c6402b3);
                        } else {
                            z11 = true;
                        }
                        if (i12 > this.f62463j / 2) {
                            z11 = true;
                        }
                        f7 = 0.0f;
                    }
                }
            }
            i11++;
        }
        s(gVar);
        i();
    }

    public final void u() {
        C6403c c6403c;
        int i11 = 0;
        while (true) {
            c6403c = this.f62466m;
            h[] hVarArr = c6403c.f62452c;
            if (i11 >= hVarArr.length) {
                break;
            }
            h hVar = hVarArr[i11];
            if (hVar != null) {
                hVar.c();
            }
            i11++;
        }
        c6403c.f62451b.c(this.f62468o, this.f62467n);
        this.f62468o = 0;
        Arrays.fill(c6403c.f62452c, (Object) null);
        this.f62456c = 0;
        this.f62457d.o();
        this.f62463j = 1;
        for (int i12 = 0; i12 < this.f62464k; i12++) {
            C6402b c6402b = this.f62460g[i12];
        }
        t();
        this.f62464k = 0;
        this.f62469p = new C6402b(c6403c);
    }
}
