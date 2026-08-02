package androidx.constraintlayout.core;

import androidx.constraintlayout.core.i;
import androidx.constraintlayout.core.widgets.d;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f17728p = false;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f17729q = true;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f17730r = true;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f17731s = true;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f17732t = false;

    /* renamed from: u, reason: collision with root package name */
    public static long f17733u;

    /* renamed from: v, reason: collision with root package name */
    public static long f17734v;

    /* renamed from: e, reason: collision with root package name */
    public a f17739e;

    /* renamed from: m, reason: collision with root package name */
    public final c f17747m;

    /* renamed from: o, reason: collision with root package name */
    public a f17749o;

    /* renamed from: a, reason: collision with root package name */
    public int f17735a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17736b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f17737c = 0;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f17738d = null;

    /* renamed from: f, reason: collision with root package name */
    public int f17740f = 32;

    /* renamed from: g, reason: collision with root package name */
    public int f17741g = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17742h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17743i = false;
    private boolean[] mAlreadyTestedCandidates = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    public int f17744j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f17745k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f17746l = 32;
    private i[] mPoolVariables = new i[1000];

    /* renamed from: n, reason: collision with root package name */
    public int f17748n = 0;
    androidx.constraintlayout.core.b[] mRows = new androidx.constraintlayout.core.b[32];

    public interface a {
        void a(a aVar);

        i b(d dVar, boolean[] zArr);

        void c(i iVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    public static class b extends androidx.constraintlayout.core.b {
        public b(c cVar) {
            this.f17723e = new j(this, cVar);
        }
    }

    public d() {
        D();
        c cVar = new c();
        this.f17747m = cVar;
        this.f17739e = new h(cVar);
        if (f17732t) {
            this.f17749o = new b(cVar);
        } else {
            this.f17749o = new androidx.constraintlayout.core.b(cVar);
        }
    }

    public static androidx.constraintlayout.core.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    public static e x() {
        return null;
    }

    public void A() {
        if (this.f17739e.isEmpty()) {
            n();
            return;
        }
        if (!this.f17742h && !this.f17743i) {
            B(this.f17739e);
            return;
        }
        for (int i10 = 0; i10 < this.f17745k; i10++) {
            if (!this.mRows[i10].f17724f) {
                B(this.f17739e);
                return;
            }
        }
        n();
    }

    public void B(a aVar) {
        u(aVar);
        C(aVar, false);
        n();
    }

    public final int C(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f17744j; i10++) {
            this.mAlreadyTestedCandidates[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 < this.f17744j * 2) {
                if (aVar.getKey() != null) {
                    this.mAlreadyTestedCandidates[aVar.getKey().f17762c] = true;
                }
                i b10 = aVar.b(this, this.mAlreadyTestedCandidates);
                if (b10 != null) {
                    boolean[] zArr = this.mAlreadyTestedCandidates;
                    int i12 = b10.f17762c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (b10 != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f17745k; i14++) {
                        androidx.constraintlayout.core.b bVar = this.mRows[i14];
                        if (bVar.f17719a.f17767h != i.a.UNRESTRICTED && !bVar.f17724f && bVar.t(b10)) {
                            float i15 = bVar.f17723e.i(b10);
                            if (i15 < 0.0f) {
                                float f11 = (-bVar.f17720b) / i15;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        androidx.constraintlayout.core.b bVar2 = this.mRows[i13];
                        bVar2.f17719a.f17763d = -1;
                        bVar2.x(b10);
                        i iVar = bVar2.f17719a;
                        iVar.f17763d = i13;
                        iVar.h(this, bVar2);
                    }
                } else {
                    z11 = true;
                }
            }
            return i11;
        }
        return i11;
    }

    public final void D() {
        int i10 = 0;
        if (f17732t) {
            while (i10 < this.f17745k) {
                androidx.constraintlayout.core.b bVar = this.mRows[i10];
                if (bVar != null) {
                    this.f17747m.f17725a.release(bVar);
                }
                this.mRows[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f17745k) {
            androidx.constraintlayout.core.b bVar2 = this.mRows[i10];
            if (bVar2 != null) {
                this.f17747m.f17726b.release(bVar2);
            }
            this.mRows[i10] = null;
            i10++;
        }
    }

    public void E() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f17747m;
            i[] iVarArr = cVar.mIndexedVariables;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.e();
            }
            i10++;
        }
        cVar.f17727c.a(this.mPoolVariables, this.f17748n);
        this.f17748n = 0;
        Arrays.fill(this.f17747m.mIndexedVariables, (Object) null);
        HashMap hashMap = this.f17738d;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f17737c = 0;
        this.f17739e.clear();
        this.f17744j = 1;
        for (int i11 = 0; i11 < this.f17745k; i11++) {
            androidx.constraintlayout.core.b bVar = this.mRows[i11];
            if (bVar != null) {
                bVar.f17721c = false;
            }
        }
        D();
        this.f17745k = 0;
        if (f17732t) {
            this.f17749o = new b(this.f17747m);
        } else {
            this.f17749o = new androidx.constraintlayout.core.b(this.f17747m);
        }
    }

    public final i a(i.a aVar, String str) {
        i iVar = (i) this.f17747m.f17727c.acquire();
        if (iVar == null) {
            iVar = new i(aVar, str);
            iVar.g(aVar, str);
        } else {
            iVar.e();
            iVar.g(aVar, str);
        }
        int i10 = this.f17748n;
        int i11 = this.f17735a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f17735a = i12;
            this.mPoolVariables = (i[]) Arrays.copyOf(this.mPoolVariables, i12);
        }
        i[] iVarArr = this.mPoolVariables;
        int i13 = this.f17748n;
        this.f17748n = i13 + 1;
        iVarArr[i13] = iVar;
        return iVar;
    }

    public void b(androidx.constraintlayout.core.widgets.e eVar, androidx.constraintlayout.core.widgets.e eVar2, float f10, int i10) {
        d.a aVar = d.a.LEFT;
        i q10 = q(eVar.o(aVar));
        d.a aVar2 = d.a.TOP;
        i q11 = q(eVar.o(aVar2));
        d.a aVar3 = d.a.RIGHT;
        i q12 = q(eVar.o(aVar3));
        d.a aVar4 = d.a.BOTTOM;
        i q13 = q(eVar.o(aVar4));
        i q14 = q(eVar2.o(aVar));
        i q15 = q(eVar2.o(aVar2));
        i q16 = q(eVar2.o(aVar3));
        i q17 = q(eVar2.o(aVar4));
        androidx.constraintlayout.core.b r10 = r();
        double d10 = f10;
        double d11 = i10;
        r10.q(q11, q13, q15, q17, (float) (Math.sin(d10) * d11));
        d(r10);
        androidx.constraintlayout.core.b r11 = r();
        r11.q(q10, q12, q14, q16, (float) (Math.cos(d10) * d11));
        d(r11);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        androidx.constraintlayout.core.b r10 = r();
        r10.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            r10.d(this, i12);
        }
        d(r10);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(androidx.constraintlayout.core.b bVar) {
        i v10;
        if (bVar == null) {
            return;
        }
        boolean z10 = true;
        if (this.f17745k + 1 >= this.f17746l || this.f17744j + 1 >= this.f17741g) {
            z();
        }
        boolean z11 = false;
        if (!bVar.f17724f) {
            bVar.D(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i p10 = p();
                bVar.f17719a = p10;
                int i10 = this.f17745k;
                l(bVar);
                if (this.f17745k == i10 + 1) {
                    this.f17749o.a(bVar);
                    C(this.f17749o, true);
                    if (p10.f17763d == -1) {
                        if (bVar.f17719a == p10 && (v10 = bVar.v(p10)) != null) {
                            bVar.x(v10);
                        }
                        if (!bVar.f17724f) {
                            bVar.f17719a.h(this, bVar);
                        }
                        if (f17732t) {
                            this.f17747m.f17725a.release(bVar);
                        } else {
                            this.f17747m.f17726b.release(bVar);
                        }
                        this.f17745k--;
                    }
                    if (bVar.s()) {
                        return;
                    } else {
                        z11 = z10;
                    }
                }
            }
            z10 = false;
            if (bVar.s()) {
            }
        }
        if (z11) {
            return;
        }
        l(bVar);
    }

    public androidx.constraintlayout.core.b e(i iVar, i iVar2, int i10, int i11) {
        if (f17729q && i11 == 8 && iVar2.f17766g && iVar.f17763d == -1) {
            iVar.f(this, iVar2.f17765f + i10);
            return null;
        }
        androidx.constraintlayout.core.b r10 = r();
        r10.n(iVar, iVar2, i10);
        if (i11 != 8) {
            r10.d(this, i11);
        }
        d(r10);
        return r10;
    }

    public void f(i iVar, int i10) {
        if (f17729q && iVar.f17763d == -1) {
            float f10 = i10;
            iVar.f(this, f10);
            for (int i11 = 0; i11 < this.f17737c + 1; i11++) {
                i iVar2 = this.f17747m.mIndexedVariables[i11];
                if (iVar2 != null && iVar2.f17770k && iVar2.f17771l == iVar.f17762c) {
                    iVar2.f(this, iVar2.f17772m + f10);
                }
            }
            return;
        }
        int i12 = iVar.f17763d;
        if (i12 == -1) {
            androidx.constraintlayout.core.b r10 = r();
            r10.i(iVar, i10);
            d(r10);
            return;
        }
        androidx.constraintlayout.core.b bVar = this.mRows[i12];
        if (bVar.f17724f) {
            bVar.f17720b = i10;
            return;
        }
        if (bVar.f17723e.e() == 0) {
            bVar.f17724f = true;
            bVar.f17720b = i10;
        } else {
            androidx.constraintlayout.core.b r11 = r();
            r11.m(iVar, i10);
            d(r11);
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        androidx.constraintlayout.core.b r10 = r();
        i t10 = t();
        t10.f17764e = 0;
        r10.o(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        androidx.constraintlayout.core.b r10 = r();
        i t10 = t();
        t10.f17764e = 0;
        r10.o(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f17723e.i(t10) * (-1.0f)), i11);
        }
        d(r10);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        androidx.constraintlayout.core.b r10 = r();
        i t10 = t();
        t10.f17764e = 0;
        r10.p(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        androidx.constraintlayout.core.b r10 = r();
        i t10 = t();
        t10.f17764e = 0;
        r10.p(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f17723e.i(t10) * (-1.0f)), i11);
        }
        d(r10);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        androidx.constraintlayout.core.b r10 = r();
        r10.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            r10.d(this, i10);
        }
        d(r10);
    }

    public final void l(androidx.constraintlayout.core.b bVar) {
        int i10;
        if (f17730r && bVar.f17724f) {
            bVar.f17719a.f(this, bVar.f17720b);
        } else {
            androidx.constraintlayout.core.b[] bVarArr = this.mRows;
            int i11 = this.f17745k;
            bVarArr[i11] = bVar;
            i iVar = bVar.f17719a;
            iVar.f17763d = i11;
            this.f17745k = i11 + 1;
            iVar.h(this, bVar);
        }
        if (f17730r && this.f17736b) {
            int i12 = 0;
            while (i12 < this.f17745k) {
                if (this.mRows[i12] == null) {
                    System.out.println("WTF");
                }
                androidx.constraintlayout.core.b bVar2 = this.mRows[i12];
                if (bVar2 != null && bVar2.f17724f) {
                    bVar2.f17719a.f(this, bVar2.f17720b);
                    if (f17732t) {
                        this.f17747m.f17725a.release(bVar2);
                    } else {
                        this.f17747m.f17726b.release(bVar2);
                    }
                    this.mRows[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f17745k;
                        if (i13 >= i10) {
                            break;
                        }
                        androidx.constraintlayout.core.b[] bVarArr2 = this.mRows;
                        int i15 = i13 - 1;
                        androidx.constraintlayout.core.b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        i iVar2 = bVar3.f17719a;
                        if (iVar2.f17763d == i13) {
                            iVar2.f17763d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.mRows[i14] = null;
                    }
                    this.f17745k = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f17736b = false;
        }
    }

    public void m(androidx.constraintlayout.core.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public final void n() {
        for (int i10 = 0; i10 < this.f17745k; i10++) {
            androidx.constraintlayout.core.b bVar = this.mRows[i10];
            bVar.f17719a.f17765f = bVar.f17720b;
        }
    }

    public i o(int i10, String str) {
        if (this.f17744j + 1 >= this.f17741g) {
            z();
        }
        i a10 = a(i.a.ERROR, str);
        int i11 = this.f17737c + 1;
        this.f17737c = i11;
        this.f17744j++;
        a10.f17762c = i11;
        a10.f17764e = i10;
        this.f17747m.mIndexedVariables[i11] = a10;
        this.f17739e.c(a10);
        return a10;
    }

    public i p() {
        if (this.f17744j + 1 >= this.f17741g) {
            z();
        }
        i a10 = a(i.a.SLACK, null);
        int i10 = this.f17737c + 1;
        this.f17737c = i10;
        this.f17744j++;
        a10.f17762c = i10;
        this.f17747m.mIndexedVariables[i10] = a10;
        return a10;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f17744j + 1 >= this.f17741g) {
            z();
        }
        if (obj instanceof androidx.constraintlayout.core.widgets.d) {
            androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) obj;
            iVar = dVar.i();
            if (iVar == null) {
                dVar.s(this.f17747m);
                iVar = dVar.i();
            }
            int i10 = iVar.f17762c;
            if (i10 != -1 && i10 <= this.f17737c && this.f17747m.mIndexedVariables[i10] != null) {
                return iVar;
            }
            if (i10 != -1) {
                iVar.e();
            }
            int i11 = this.f17737c + 1;
            this.f17737c = i11;
            this.f17744j++;
            iVar.f17762c = i11;
            iVar.f17767h = i.a.UNRESTRICTED;
            this.f17747m.mIndexedVariables[i11] = iVar;
        }
        return iVar;
    }

    public androidx.constraintlayout.core.b r() {
        androidx.constraintlayout.core.b bVar;
        if (f17732t) {
            bVar = (androidx.constraintlayout.core.b) this.f17747m.f17725a.acquire();
            if (bVar == null) {
                bVar = new b(this.f17747m);
                f17734v++;
            } else {
                bVar.y();
            }
        } else {
            bVar = (androidx.constraintlayout.core.b) this.f17747m.f17726b.acquire();
            if (bVar == null) {
                bVar = new androidx.constraintlayout.core.b(this.f17747m);
                f17733u++;
            } else {
                bVar.y();
            }
        }
        i.c();
        return bVar;
    }

    public i t() {
        if (this.f17744j + 1 >= this.f17741g) {
            z();
        }
        i a10 = a(i.a.SLACK, null);
        int i10 = this.f17737c + 1;
        this.f17737c = i10;
        this.f17744j++;
        a10.f17762c = i10;
        this.f17747m.mIndexedVariables[i10] = a10;
        return a10;
    }

    public final int u(a aVar) {
        float f10;
        float f11;
        for (int i10 = 0; i10 < this.f17745k; i10++) {
            androidx.constraintlayout.core.b bVar = this.mRows[i10];
            if (bVar.f17719a.f17767h != i.a.UNRESTRICTED) {
                float f12 = 0.0f;
                if (bVar.f17720b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        i11++;
                        float f13 = Float.MAX_VALUE;
                        int i12 = 0;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i12 >= this.f17745k) {
                                break;
                            }
                            androidx.constraintlayout.core.b bVar2 = this.mRows[i12];
                            if (bVar2.f17719a.f17767h != i.a.UNRESTRICTED && !bVar2.f17724f && bVar2.f17720b < f12) {
                                if (f17731s) {
                                    int e10 = bVar2.f17723e.e();
                                    int i16 = 0;
                                    while (i16 < e10) {
                                        i b10 = bVar2.f17723e.b(i16);
                                        float i17 = bVar2.f17723e.i(b10);
                                        if (i17 <= f12) {
                                            f11 = f12;
                                        } else {
                                            f11 = f12;
                                            for (int i18 = 0; i18 < 9; i18++) {
                                                float f14 = b10.mStrengthVector[i18] / i17;
                                                if ((f14 < f13 && i18 == i15) || i18 > i15) {
                                                    i15 = i18;
                                                    i14 = b10.f17762c;
                                                    i13 = i12;
                                                    f13 = f14;
                                                }
                                            }
                                        }
                                        i16++;
                                        f12 = f11;
                                    }
                                } else {
                                    f10 = f12;
                                    for (int i19 = 1; i19 < this.f17744j; i19++) {
                                        i iVar = this.f17747m.mIndexedVariables[i19];
                                        float i20 = bVar2.f17723e.i(iVar);
                                        if (i20 > f10) {
                                            for (int i21 = 0; i21 < 9; i21++) {
                                                float f15 = iVar.mStrengthVector[i21] / i20;
                                                if ((f15 < f13 && i21 == i15) || i21 > i15) {
                                                    i15 = i21;
                                                    i13 = i12;
                                                    i14 = i19;
                                                    f13 = f15;
                                                }
                                            }
                                        }
                                    }
                                    i12++;
                                    f12 = f10;
                                }
                            }
                            f10 = f12;
                            i12++;
                            f12 = f10;
                        }
                        float f16 = f12;
                        if (i13 != -1) {
                            androidx.constraintlayout.core.b bVar3 = this.mRows[i13];
                            bVar3.f17719a.f17763d = -1;
                            bVar3.x(this.f17747m.mIndexedVariables[i14]);
                            i iVar2 = bVar3.f17719a;
                            iVar2.f17763d = i13;
                            iVar2.h(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f17744j / 2) {
                            z10 = true;
                        }
                        f12 = f16;
                    }
                    return i11;
                }
            }
        }
        return 0;
    }

    public void v(e eVar) {
    }

    public c w() {
        return this.f17747m;
    }

    public int y(Object obj) {
        i i10 = ((androidx.constraintlayout.core.widgets.d) obj).i();
        if (i10 != null) {
            return (int) (i10.f17765f + 0.5f);
        }
        return 0;
    }

    public final void z() {
        int i10 = this.f17740f * 2;
        this.f17740f = i10;
        this.mRows = (androidx.constraintlayout.core.b[]) Arrays.copyOf(this.mRows, i10);
        c cVar = this.f17747m;
        cVar.mIndexedVariables = (i[]) Arrays.copyOf(cVar.mIndexedVariables, this.f17740f);
        int i11 = this.f17740f;
        this.mAlreadyTestedCandidates = new boolean[i11];
        this.f17741g = i11;
        this.f17746l = i11;
    }
}
