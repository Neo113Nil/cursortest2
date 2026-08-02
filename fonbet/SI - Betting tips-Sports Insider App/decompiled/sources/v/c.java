package v;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {
    public static boolean q = false;

    /* renamed from: d, reason: collision with root package name */
    public final e f24351d;

    /* renamed from: m, reason: collision with root package name */
    public final kh.g f24359m;

    /* renamed from: p, reason: collision with root package name */
    public b f24362p;

    /* renamed from: a, reason: collision with root package name */
    public int f24348a = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24349b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f24350c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f24352e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f24353f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24355h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean[] f24356i = new boolean[32];
    public int j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f24357k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f24358l = 32;

    /* renamed from: n, reason: collision with root package name */
    public g[] f24360n = new g[AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT];

    /* renamed from: o, reason: collision with root package name */
    public int f24361o = 0;

    /* renamed from: g, reason: collision with root package name */
    public b[] f24354g = new b[32];

    public c() {
        s();
        kh.g gVar = new kh.g(10);
        gVar.f19115b = new p0.d();
        gVar.f19116c = new p0.d();
        gVar.f19117d = new g[32];
        this.f24359m = gVar;
        e eVar = new e(gVar);
        eVar.f24363f = new g[128];
        eVar.f24364g = new g[128];
        eVar.f24365h = 0;
        eVar.f24366i = new d7.e(15, eVar);
        this.f24351d = eVar;
        this.f24362p = new b(gVar);
    }

    public static int n(Object obj) {
        g gVar = ((x.c) obj).f25292i;
        if (gVar != null) {
            return (int) (gVar.f24372e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final g a(int i5) {
        p0.d dVar = (p0.d) this.f24359m.f19116c;
        int i10 = dVar.f21401b;
        g gVar = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            ?? r32 = dVar.f21400a;
            ?? r42 = r32[i11];
            r32[i11] = 0;
            dVar.f21401b = i11;
            gVar = r42;
        }
        g gVar2 = gVar;
        if (gVar2 == null) {
            gVar2 = new g(i5);
            gVar2.f24378l = i5;
        } else {
            gVar2.c();
            gVar2.f24378l = i5;
        }
        int i12 = this.f24361o;
        int i13 = this.f24348a;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            this.f24348a = i14;
            this.f24360n = (g[]) Arrays.copyOf(this.f24360n, i14);
        }
        g[] gVarArr = this.f24360n;
        int i15 = this.f24361o;
        this.f24361o = i15 + 1;
        gVarArr[i15] = gVar2;
        return gVar2;
    }

    public final void b(g gVar, g gVar2, int i5, float f6, g gVar3, g gVar4, int i10, int i11) {
        b l6 = l();
        if (gVar2 == gVar3) {
            l6.f24346d.g(gVar, 1.0f);
            l6.f24346d.g(gVar4, 1.0f);
            l6.f24346d.g(gVar2, -2.0f);
        } else if (f6 == 0.5f) {
            l6.f24346d.g(gVar, 1.0f);
            l6.f24346d.g(gVar2, -1.0f);
            l6.f24346d.g(gVar3, -1.0f);
            l6.f24346d.g(gVar4, 1.0f);
            if (i5 > 0 || i10 > 0) {
                l6.f24344b = (-i5) + i10;
            }
        } else if (f6 <= 0.0f) {
            l6.f24346d.g(gVar, -1.0f);
            l6.f24346d.g(gVar2, 1.0f);
            l6.f24344b = i5;
        } else if (f6 >= 1.0f) {
            l6.f24346d.g(gVar4, -1.0f);
            l6.f24346d.g(gVar3, 1.0f);
            l6.f24344b = -i10;
        } else {
            float f10 = 1.0f - f6;
            l6.f24346d.g(gVar, f10 * 1.0f);
            l6.f24346d.g(gVar2, f10 * (-1.0f));
            l6.f24346d.g(gVar3, (-1.0f) * f6);
            l6.f24346d.g(gVar4, 1.0f * f6);
            if (i5 > 0 || i10 > 0) {
                l6.f24344b = (i10 * f6) + ((-i5) * f10);
            }
        }
        if (i11 != 8) {
            l6.a(this, i11);
        }
        c(l6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        if (r4.f24377k <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e0, code lost:
    
        if (r4.f24377k <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        if (r4.f24377k <= 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0102, code lost:
    
        if (r4.f24377k <= 1) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(b bVar) {
        boolean z5;
        boolean z7;
        g gVar;
        g f6;
        if (this.f24357k + 1 >= this.f24358l || this.j + 1 >= this.f24353f) {
            o();
        }
        if (bVar.f24347e) {
            z5 = false;
        } else {
            ArrayList arrayList = bVar.f24345c;
            if (this.f24354g.length != 0) {
                boolean z10 = false;
                while (!z10) {
                    int d10 = bVar.f24346d.d();
                    for (int i5 = 0; i5 < d10; i5++) {
                        g e7 = bVar.f24346d.e(i5);
                        if (e7.f24370c != -1 || e7.f24373f) {
                            arrayList.add(e7);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i10 = 0; i10 < size; i10++) {
                            g gVar2 = (g) arrayList.get(i10);
                            if (gVar2.f24373f) {
                                bVar.h(this, gVar2, true);
                            } else {
                                bVar.i(this, this.f24354g[gVar2.f24370c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z10 = true;
                    }
                }
                if (bVar.f24343a != null && bVar.f24346d.d() == 0) {
                    bVar.f24347e = true;
                    this.f24349b = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f10 = bVar.f24344b;
            float f11 = 0.0f;
            if (f10 < 0.0f) {
                bVar.f24344b = f10 * (-1.0f);
                a aVar = bVar.f24346d;
                int i11 = aVar.f24341h;
                for (int i12 = 0; i11 != -1 && i12 < aVar.f24334a; i12++) {
                    float[] fArr = aVar.f24340g;
                    fArr[i11] = fArr[i11] * (-1.0f);
                    i11 = aVar.f24339f[i11];
                }
            }
            int d11 = bVar.f24346d.d();
            float f12 = 0.0f;
            float f13 = 0.0f;
            g gVar3 = null;
            g gVar4 = null;
            int i13 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i13 < d11) {
                float f14 = bVar.f24346d.f(i13);
                g e9 = bVar.f24346d.e(i13);
                float f15 = f11;
                if (e9.f24378l == 1) {
                    if (gVar3 != null) {
                        if (f12 <= f14) {
                            if (!z11) {
                                if (e9.f24377k > 1) {
                                }
                            }
                        }
                        z11 = true;
                    }
                    gVar3 = e9;
                    f12 = f14;
                } else if (gVar3 == null && f14 < f15) {
                    if (gVar4 != null) {
                        if (f13 <= f14) {
                            if (!z12) {
                                if (e9.f24377k > 1) {
                                }
                            }
                        }
                        z12 = true;
                    }
                    gVar4 = e9;
                    f13 = f14;
                }
                i13++;
                f11 = f15;
            }
            float f16 = f11;
            if (gVar3 == null) {
                gVar3 = gVar4;
            }
            if (gVar3 == null) {
                z7 = true;
            } else {
                bVar.g(gVar3);
                z7 = false;
            }
            if (bVar.f24346d.d() == 0) {
                bVar.f24347e = true;
            }
            if (z7) {
                if (this.j + 1 >= this.f24353f) {
                    o();
                }
                g a7 = a(3);
                int i14 = this.f24350c + 1;
                this.f24350c = i14;
                this.j++;
                a7.f24369b = i14;
                kh.g gVar5 = this.f24359m;
                ((g[]) gVar5.f19117d)[i14] = a7;
                bVar.f24343a = a7;
                int i15 = this.f24357k;
                h(bVar);
                if (this.f24357k == i15 + 1) {
                    b bVar2 = this.f24362p;
                    bVar2.f24343a = null;
                    bVar2.f24346d.b();
                    for (int i16 = 0; i16 < bVar.f24346d.d(); i16++) {
                        bVar2.f24346d.a(bVar.f24346d.e(i16), bVar.f24346d.f(i16), true);
                    }
                    r(this.f24362p);
                    if (a7.f24370c == -1) {
                        if (bVar.f24343a == a7 && (f6 = bVar.f(null, a7)) != null) {
                            bVar.g(f6);
                        }
                        if (!bVar.f24347e) {
                            bVar.f24343a.e(this, bVar);
                        }
                        ((p0.d) gVar5.f19115b).c(bVar);
                        this.f24357k--;
                    }
                    z5 = true;
                    gVar = bVar.f24343a;
                    if (gVar != null) {
                        return;
                    }
                    if (gVar.f24378l != 1 && bVar.f24344b < f16) {
                        return;
                    }
                }
            }
            z5 = false;
            gVar = bVar.f24343a;
            if (gVar != null) {
            }
        }
        if (z5) {
            return;
        }
        h(bVar);
    }

    public final void d(g gVar, int i5) {
        int i10 = gVar.f24370c;
        if (i10 == -1) {
            gVar.d(this, i5);
            for (int i11 = 0; i11 < this.f24350c + 1; i11++) {
                g gVar2 = ((g[]) this.f24359m.f19117d)[i11];
            }
            return;
        }
        if (i10 == -1) {
            b l6 = l();
            l6.f24343a = gVar;
            float f6 = i5;
            gVar.f24372e = f6;
            l6.f24344b = f6;
            l6.f24347e = true;
            c(l6);
            return;
        }
        b bVar = this.f24354g[i10];
        if (bVar.f24347e) {
            bVar.f24344b = i5;
            return;
        }
        if (bVar.f24346d.d() == 0) {
            bVar.f24347e = true;
            bVar.f24344b = i5;
            return;
        }
        b l10 = l();
        if (i5 < 0) {
            l10.f24344b = i5 * (-1);
            l10.f24346d.g(gVar, 1.0f);
        } else {
            l10.f24344b = i5;
            l10.f24346d.g(gVar, -1.0f);
        }
        c(l10);
    }

    public final void e(g gVar, g gVar2, int i5, int i10) {
        if (i10 == 8 && gVar2.f24373f && gVar.f24370c == -1) {
            gVar.d(this, gVar2.f24372e + i5);
            return;
        }
        b l6 = l();
        boolean z5 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z5 = true;
            }
            l6.f24344b = i5;
        }
        if (z5) {
            l6.f24346d.g(gVar, 1.0f);
            l6.f24346d.g(gVar2, -1.0f);
        } else {
            l6.f24346d.g(gVar, -1.0f);
            l6.f24346d.g(gVar2, 1.0f);
        }
        if (i10 != 8) {
            l6.a(this, i10);
        }
        c(l6);
    }

    public final void f(g gVar, g gVar2, int i5, int i10) {
        b l6 = l();
        g m6 = m();
        m6.f24371d = 0;
        l6.b(gVar, gVar2, m6, i5);
        if (i10 != 8) {
            l6.f24346d.g(j(i10), (int) (l6.f24346d.c(m6) * (-1.0f)));
        }
        c(l6);
    }

    public final void g(g gVar, g gVar2, int i5, int i10) {
        b l6 = l();
        g m6 = m();
        m6.f24371d = 0;
        l6.c(gVar, gVar2, m6, i5);
        if (i10 != 8) {
            l6.f24346d.g(j(i10), (int) (l6.f24346d.c(m6) * (-1.0f)));
        }
        c(l6);
    }

    public final void h(b bVar) {
        int i5;
        if (bVar.f24347e) {
            bVar.f24343a.d(this, bVar.f24344b);
        } else {
            b[] bVarArr = this.f24354g;
            int i10 = this.f24357k;
            bVarArr[i10] = bVar;
            g gVar = bVar.f24343a;
            gVar.f24370c = i10;
            this.f24357k = i10 + 1;
            gVar.e(this, bVar);
        }
        if (this.f24349b) {
            int i11 = 0;
            while (i11 < this.f24357k) {
                if (this.f24354g[i11] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f24354g[i11];
                if (bVar2 != null && bVar2.f24347e) {
                    bVar2.f24343a.d(this, bVar2.f24344b);
                    ((p0.d) this.f24359m.f19115b).c(bVar2);
                    this.f24354g[i11] = null;
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (true) {
                        i5 = this.f24357k;
                        if (i12 >= i5) {
                            break;
                        }
                        b[] bVarArr2 = this.f24354g;
                        int i14 = i12 - 1;
                        b bVar3 = bVarArr2[i12];
                        bVarArr2[i14] = bVar3;
                        g gVar2 = bVar3.f24343a;
                        if (gVar2.f24370c == i12) {
                            gVar2.f24370c = i14;
                        }
                        i13 = i12;
                        i12++;
                    }
                    if (i13 < i5) {
                        this.f24354g[i13] = null;
                    }
                    this.f24357k = i5 - 1;
                    i11--;
                }
                i11++;
            }
            this.f24349b = false;
        }
    }

    public final void i() {
        for (int i5 = 0; i5 < this.f24357k; i5++) {
            b bVar = this.f24354g[i5];
            bVar.f24343a.f24372e = bVar.f24344b;
        }
    }

    public final g j(int i5) {
        if (this.j + 1 >= this.f24353f) {
            o();
        }
        g a7 = a(4);
        float[] fArr = a7.f24375h;
        int i10 = this.f24350c + 1;
        this.f24350c = i10;
        this.j++;
        a7.f24369b = i10;
        a7.f24371d = i5;
        ((g[]) this.f24359m.f19117d)[i10] = a7;
        e eVar = this.f24351d;
        eVar.f24366i.f8268b = a7;
        Arrays.fill(fArr, 0.0f);
        fArr[a7.f24371d] = 1.0f;
        eVar.j(a7);
        return a7;
    }

    public final g k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f24353f) {
            o();
        }
        if (!(obj instanceof x.c)) {
            return null;
        }
        x.c cVar = (x.c) obj;
        g gVar = cVar.f25292i;
        if (gVar == null) {
            cVar.k();
            gVar = cVar.f25292i;
        }
        int i5 = gVar.f24369b;
        kh.g gVar2 = this.f24359m;
        if (i5 != -1 && i5 <= this.f24350c && ((g[]) gVar2.f19117d)[i5] != null) {
            return gVar;
        }
        if (i5 != -1) {
            gVar.c();
        }
        int i10 = this.f24350c + 1;
        this.f24350c = i10;
        this.j++;
        gVar.f24369b = i10;
        gVar.f24378l = 1;
        ((g[]) gVar2.f19117d)[i10] = gVar;
        return gVar;
    }

    public final b l() {
        Object obj;
        kh.g gVar = this.f24359m;
        p0.d dVar = (p0.d) gVar.f19115b;
        int i5 = dVar.f21401b;
        if (i5 > 0) {
            int i10 = i5 - 1;
            Object[] objArr = dVar.f21400a;
            obj = objArr[i10];
            objArr[i10] = null;
            dVar.f21401b = i10;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(gVar);
        }
        bVar.f24343a = null;
        bVar.f24346d.b();
        bVar.f24344b = 0.0f;
        bVar.f24347e = false;
        return bVar;
    }

    public final g m() {
        if (this.j + 1 >= this.f24353f) {
            o();
        }
        g a7 = a(3);
        int i5 = this.f24350c + 1;
        this.f24350c = i5;
        this.j++;
        a7.f24369b = i5;
        ((g[]) this.f24359m.f19117d)[i5] = a7;
        return a7;
    }

    public final void o() {
        int i5 = this.f24352e * 2;
        this.f24352e = i5;
        this.f24354g = (b[]) Arrays.copyOf(this.f24354g, i5);
        kh.g gVar = this.f24359m;
        gVar.f19117d = (g[]) Arrays.copyOf((g[]) gVar.f19117d, this.f24352e);
        int i10 = this.f24352e;
        this.f24356i = new boolean[i10];
        this.f24353f = i10;
        this.f24358l = i10;
    }

    public final void p() {
        e eVar = this.f24351d;
        if (eVar.e()) {
            i();
            return;
        }
        if (!this.f24355h) {
            q(eVar);
            return;
        }
        for (int i5 = 0; i5 < this.f24357k; i5++) {
            if (!this.f24354g[i5].f24347e) {
                q(eVar);
                return;
            }
        }
        i();
    }

    public final void q(e eVar) {
        int i5 = 0;
        while (true) {
            if (i5 >= this.f24357k) {
                break;
            }
            b bVar = this.f24354g[i5];
            int i10 = 1;
            if (bVar.f24343a.f24378l != 1) {
                float f6 = 0.0f;
                if (bVar.f24344b < 0.0f) {
                    boolean z5 = false;
                    int i11 = 0;
                    while (!z5) {
                        i11 += i10;
                        float f10 = Float.MAX_VALUE;
                        int i12 = -1;
                        int i13 = -1;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < this.f24357k) {
                            b bVar2 = this.f24354g[i14];
                            if (bVar2.f24343a.f24378l != i10 && !bVar2.f24347e && bVar2.f24344b < f6) {
                                int d10 = bVar2.f24346d.d();
                                int i16 = 0;
                                while (i16 < d10) {
                                    g e7 = bVar2.f24346d.e(i16);
                                    float c2 = bVar2.f24346d.c(e7);
                                    if (c2 > f6) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f11 = e7.f24374g[i17] / c2;
                                            if ((f11 < f10 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i13 = e7.f24369b;
                                                i12 = i14;
                                                f10 = f11;
                                            }
                                        }
                                    }
                                    i16++;
                                    f6 = 0.0f;
                                }
                            }
                            i14++;
                            f6 = 0.0f;
                            i10 = 1;
                        }
                        if (i12 != -1) {
                            b bVar3 = this.f24354g[i12];
                            bVar3.f24343a.f24370c = -1;
                            bVar3.g(((g[]) this.f24359m.f19117d)[i13]);
                            g gVar = bVar3.f24343a;
                            gVar.f24370c = i12;
                            gVar.e(this, bVar3);
                        } else {
                            z5 = true;
                        }
                        if (i11 > this.j / 2) {
                            z5 = true;
                        }
                        f6 = 0.0f;
                        i10 = 1;
                    }
                }
            }
            i5++;
        }
        r(eVar);
        i();
    }

    public final void r(b bVar) {
        boolean z5;
        int i5 = 0;
        for (int i10 = 0; i10 < this.j; i10++) {
            this.f24356i[i10] = false;
        }
        boolean z7 = false;
        int i11 = 0;
        while (!z7) {
            int i12 = 1;
            i11++;
            if (i11 >= this.j * 2) {
                return;
            }
            g gVar = bVar.f24343a;
            if (gVar != null) {
                this.f24356i[gVar.f24369b] = true;
            }
            g d10 = bVar.d(this.f24356i);
            if (d10 != null) {
                boolean[] zArr = this.f24356i;
                int i13 = d10.f24369b;
                if (zArr[i13]) {
                    return;
                } else {
                    zArr[i13] = true;
                }
            }
            if (d10 != null) {
                float f6 = Float.MAX_VALUE;
                int i14 = i5;
                int i15 = -1;
                while (i14 < this.f24357k) {
                    b bVar2 = this.f24354g[i14];
                    if (bVar2.f24343a.f24378l != i12 && !bVar2.f24347e) {
                        a aVar = bVar2.f24346d;
                        int i16 = aVar.f24341h;
                        if (i16 != -1) {
                            for (int i17 = 0; i16 != -1 && i17 < aVar.f24334a; i17++) {
                                if (aVar.f24338e[i16] == d10.f24369b) {
                                    z5 = true;
                                    break;
                                }
                                i16 = aVar.f24339f[i16];
                            }
                        }
                        z5 = false;
                        if (z5) {
                            float c2 = bVar2.f24346d.c(d10);
                            if (c2 < 0.0f) {
                                float f10 = (-bVar2.f24344b) / c2;
                                if (f10 < f6) {
                                    f6 = f10;
                                    i15 = i14;
                                }
                            }
                        }
                    }
                    i14++;
                    i12 = 1;
                }
                if (i15 > -1) {
                    b bVar3 = this.f24354g[i15];
                    bVar3.f24343a.f24370c = -1;
                    bVar3.g(d10);
                    g gVar2 = bVar3.f24343a;
                    gVar2.f24370c = i15;
                    gVar2.e(this, bVar3);
                }
            } else {
                z7 = true;
            }
            i5 = 0;
        }
    }

    public final void s() {
        for (int i5 = 0; i5 < this.f24357k; i5++) {
            b bVar = this.f24354g[i5];
            if (bVar != null) {
                ((p0.d) this.f24359m.f19115b).c(bVar);
            }
            this.f24354g[i5] = null;
        }
    }

    public final void t() {
        kh.g gVar;
        int i5 = 0;
        while (true) {
            gVar = this.f24359m;
            g[] gVarArr = (g[]) gVar.f19117d;
            if (i5 >= gVarArr.length) {
                break;
            }
            g gVar2 = gVarArr[i5];
            if (gVar2 != null) {
                gVar2.c();
            }
            i5++;
        }
        p0.d dVar = (p0.d) gVar.f19116c;
        g[] gVarArr2 = this.f24360n;
        int i10 = this.f24361o;
        dVar.getClass();
        if (i10 > gVarArr2.length) {
            i10 = gVarArr2.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            g gVar3 = gVarArr2[i11];
            int i12 = dVar.f21401b;
            Object[] objArr = dVar.f21400a;
            if (i12 < objArr.length) {
                objArr[i12] = gVar3;
                dVar.f21401b = i12 + 1;
            }
        }
        this.f24361o = 0;
        Arrays.fill((g[]) gVar.f19117d, (Object) null);
        this.f24350c = 0;
        e eVar = this.f24351d;
        eVar.f24365h = 0;
        eVar.f24344b = 0.0f;
        this.j = 1;
        for (int i13 = 0; i13 < this.f24357k; i13++) {
            b bVar = this.f24354g[i13];
        }
        s();
        this.f24357k = 0;
        this.f24362p = new b(gVar);
    }
}
