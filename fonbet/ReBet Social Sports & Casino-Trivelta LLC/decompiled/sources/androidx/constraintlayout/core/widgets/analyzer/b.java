package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f17791a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public a f17792b = new a();

    /* renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.f f17793c;

    public static class a {

        /* renamed from: k, reason: collision with root package name */
        public static int f17794k = 0;

        /* renamed from: l, reason: collision with root package name */
        public static int f17795l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static int f17796m = 2;

        /* renamed from: a, reason: collision with root package name */
        public e.b f17797a;

        /* renamed from: b, reason: collision with root package name */
        public e.b f17798b;

        /* renamed from: c, reason: collision with root package name */
        public int f17799c;

        /* renamed from: d, reason: collision with root package name */
        public int f17800d;

        /* renamed from: e, reason: collision with root package name */
        public int f17801e;

        /* renamed from: f, reason: collision with root package name */
        public int f17802f;

        /* renamed from: g, reason: collision with root package name */
        public int f17803g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f17804h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f17805i;

        /* renamed from: j, reason: collision with root package name */
        public int f17806j;
    }

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.b$b, reason: collision with other inner class name */
    public interface InterfaceC0352b {
        void a();

        void b(androidx.constraintlayout.core.widgets.e eVar, a aVar);
    }

    public b(androidx.constraintlayout.core.widgets.f fVar) {
        this.f17793c = fVar;
    }

    public final boolean a(InterfaceC0352b interfaceC0352b, androidx.constraintlayout.core.widgets.e eVar, int i10) {
        this.f17792b.f17797a = eVar.A();
        this.f17792b.f17798b = eVar.T();
        this.f17792b.f17799c = eVar.W();
        this.f17792b.f17800d = eVar.x();
        a aVar = this.f17792b;
        aVar.f17805i = false;
        aVar.f17806j = i10;
        e.b bVar = aVar.f17797a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f17798b == bVar2;
        boolean z12 = z10 && eVar.f17943W > 0.0f;
        boolean z13 = z11 && eVar.f17943W > 0.0f;
        if (z12 && eVar.mResolvedMatchConstraintDefault[0] == 4) {
            aVar.f17797a = e.b.FIXED;
        }
        if (z13 && eVar.mResolvedMatchConstraintDefault[1] == 4) {
            aVar.f17798b = e.b.FIXED;
        }
        interfaceC0352b.b(eVar, aVar);
        eVar.l1(this.f17792b.f17801e);
        eVar.M0(this.f17792b.f17802f);
        eVar.L0(this.f17792b.f17804h);
        eVar.B0(this.f17792b.f17803g);
        a aVar2 = this.f17792b;
        aVar2.f17806j = a.f17794k;
        return aVar2.f17805i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
    
        if (r8 != r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0094, code lost:
    
        if (r5.f17943W <= 0.0f) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(androidx.constraintlayout.core.widgets.f fVar) {
        l lVar;
        n nVar;
        int size = fVar.f18092B0.size();
        boolean V12 = fVar.V1(64);
        InterfaceC0352b K12 = fVar.K1();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) fVar.f18092B0.get(i10);
            if (!(eVar instanceof androidx.constraintlayout.core.widgets.h) && !(eVar instanceof androidx.constraintlayout.core.widgets.a) && !eVar.l0() && (!V12 || (lVar = eVar.f17953d) == null || (nVar = eVar.f17955e) == null || !lVar.f17870e.f17827j || !nVar.f17870e.f17827j)) {
                e.b u10 = eVar.u(0);
                boolean z10 = true;
                e.b u11 = eVar.u(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z11 = u10 == bVar && eVar.f17987u != 1 && u11 == bVar && eVar.f17989v != 1;
                if (!z11 && fVar.V1(1) && !(eVar instanceof androidx.constraintlayout.core.widgets.l)) {
                    if (u10 == bVar && eVar.f17987u == 0 && u11 != bVar && !eVar.i0()) {
                        z11 = true;
                    }
                    if (u11 == bVar && eVar.f17989v == 0 && u10 != bVar && !eVar.i0()) {
                        z11 = true;
                    }
                    if (u10 != bVar) {
                    }
                }
                z10 = z11;
                if (!z10) {
                    a(K12, eVar, a.f17794k);
                }
            }
        }
        K12.a();
    }

    public final void c(androidx.constraintlayout.core.widgets.f fVar, String str, int i10, int i11, int i12) {
        fVar.getClass();
        int I10 = fVar.I();
        int H10 = fVar.H();
        fVar.b1(0);
        fVar.a1(0);
        fVar.l1(i11);
        fVar.M0(i12);
        fVar.b1(I10);
        fVar.a1(H10);
        this.f17793c.Z1(i10);
        this.f17793c.t1();
    }

    public long d(androidx.constraintlayout.core.widgets.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z10;
        int i19;
        int i20;
        int i21;
        boolean z11;
        int i22;
        int i23;
        boolean z12;
        b bVar = this;
        InterfaceC0352b K12 = fVar.K1();
        int size = fVar.f18092B0.size();
        int W10 = fVar.W();
        int x10 = fVar.x();
        boolean b10 = androidx.constraintlayout.core.widgets.k.b(i10, 128);
        boolean z13 = b10 || androidx.constraintlayout.core.widgets.k.b(i10, 64);
        if (z13) {
            for (int i24 = 0; i24 < size; i24++) {
                androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) fVar.f18092B0.get(i24);
                e.b A10 = eVar.A();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z14 = (A10 == bVar2) && (eVar.T() == bVar2) && eVar.v() > 0.0f;
                if ((eVar.i0() && z14) || ((eVar.k0() && z14) || (eVar instanceof androidx.constraintlayout.core.widgets.l) || eVar.i0() || eVar.k0())) {
                    z13 = false;
                    break;
                }
            }
        }
        if (z13) {
            boolean z15 = androidx.constraintlayout.core.d.f17728p;
        }
        boolean z16 = z13 & ((i13 == 1073741824 && i15 == 1073741824) || b10);
        int i25 = 2;
        if (z16) {
            int min = Math.min(fVar.G(), i14);
            int min2 = Math.min(fVar.F(), i16);
            if (i13 == 1073741824 && fVar.W() != min) {
                fVar.l1(min);
                fVar.O1();
            }
            if (i15 == 1073741824 && fVar.x() != min2) {
                fVar.M0(min2);
                fVar.O1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                z10 = fVar.G1(b10);
                i19 = 2;
            } else {
                boolean H12 = fVar.H1(b10);
                if (i13 == 1073741824) {
                    H12 &= fVar.I1(b10, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    z10 = fVar.I1(b10, 1) & H12;
                    i19++;
                } else {
                    z10 = H12;
                }
            }
            if (z10) {
                fVar.q1(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            z10 = false;
            i19 = 0;
        }
        if (z10 && i19 == 2) {
            return 0L;
        }
        int L12 = fVar.L1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f17791a.size();
        if (size > 0) {
            bVar.c(fVar, "First pass", 0, W10, x10);
            i20 = W10;
            i21 = x10;
        } else {
            i20 = W10;
            i21 = x10;
        }
        if (size2 > 0) {
            e.b A11 = fVar.A();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z17 = A11 == bVar3;
            boolean z18 = fVar.T() == bVar3;
            int max = Math.max(fVar.W(), bVar.f17793c.I());
            int max2 = Math.max(fVar.x(), bVar.f17793c.H());
            int i26 = 0;
            boolean z19 = false;
            while (i26 < size2) {
                androidx.constraintlayout.core.widgets.e eVar2 = (androidx.constraintlayout.core.widgets.e) bVar.f17791a.get(i26);
                if (eVar2 instanceof androidx.constraintlayout.core.widgets.l) {
                    int W11 = eVar2.W();
                    int x11 = eVar2.x();
                    i23 = i20;
                    boolean a10 = bVar.a(K12, eVar2, a.f17795l) | z19;
                    int W12 = eVar2.W();
                    int x12 = eVar2.x();
                    if (W12 != W11) {
                        eVar2.l1(W12);
                        if (z17 && eVar2.M() > max) {
                            max = Math.max(max, eVar2.M() + eVar2.o(d.a.RIGHT).f());
                        }
                        z12 = true;
                    } else {
                        z12 = a10;
                    }
                    if (x12 != x11) {
                        eVar2.M0(x12);
                        if (z18 && eVar2.r() > max2) {
                            max2 = Math.max(max2, eVar2.r() + eVar2.o(d.a.BOTTOM).f());
                        }
                        z12 = true;
                    }
                    z19 = z12 | ((androidx.constraintlayout.core.widgets.l) eVar2).G1();
                } else {
                    i23 = i20;
                }
                i26++;
                i20 = i23;
                i25 = 2;
            }
            int i27 = i20;
            int i28 = i25;
            int i29 = 0;
            while (i29 < i28) {
                int i30 = 0;
                while (i30 < size2) {
                    androidx.constraintlayout.core.widgets.e eVar3 = (androidx.constraintlayout.core.widgets.e) bVar.f17791a.get(i30);
                    if (((eVar3 instanceof androidx.constraintlayout.core.widgets.i) && !(eVar3 instanceof androidx.constraintlayout.core.widgets.l)) || (eVar3 instanceof androidx.constraintlayout.core.widgets.h) || eVar3.V() == 8 || ((z16 && eVar3.f17953d.f17870e.f17827j && eVar3.f17955e.f17870e.f17827j) || (eVar3 instanceof androidx.constraintlayout.core.widgets.l))) {
                        z11 = z16;
                        i22 = size2;
                    } else {
                        int W13 = eVar3.W();
                        int x13 = eVar3.x();
                        z11 = z16;
                        int p10 = eVar3.p();
                        int i31 = a.f17795l;
                        i22 = size2;
                        if (i29 == 1) {
                            i31 = a.f17796m;
                        }
                        boolean a11 = bVar.a(K12, eVar3, i31) | z19;
                        int W14 = eVar3.W();
                        int x14 = eVar3.x();
                        if (W14 != W13) {
                            eVar3.l1(W14);
                            if (z17 && eVar3.M() > max) {
                                max = Math.max(max, eVar3.M() + eVar3.o(d.a.RIGHT).f());
                            }
                            a11 = true;
                        }
                        if (x14 != x13) {
                            eVar3.M0(x14);
                            if (z18 && eVar3.r() > max2) {
                                max2 = Math.max(max2, eVar3.r() + eVar3.o(d.a.BOTTOM).f());
                            }
                            a11 = true;
                        }
                        z19 = (!eVar3.Z() || p10 == eVar3.p()) ? a11 : true;
                    }
                    i30++;
                    bVar = this;
                    size2 = i22;
                    z16 = z11;
                }
                boolean z20 = z16;
                int i32 = size2;
                if (!z19) {
                    break;
                }
                i29++;
                c(fVar, "intermediate pass", i29, i27, i21);
                bVar = this;
                size2 = i32;
                z16 = z20;
                i28 = 2;
                z19 = false;
            }
        }
        fVar.Y1(L12);
        return 0L;
    }

    public void e(androidx.constraintlayout.core.widgets.f fVar) {
        this.f17791a.clear();
        int size = fVar.f18092B0.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) fVar.f18092B0.get(i10);
            e.b A10 = eVar.A();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (A10 == bVar || eVar.T() == bVar) {
                this.f17791a.add(eVar);
            }
        }
        fVar.O1();
    }
}
