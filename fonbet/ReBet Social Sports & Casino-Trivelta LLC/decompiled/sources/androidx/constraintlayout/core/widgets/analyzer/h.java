package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static b.a f17839a = new b.a();

    /* renamed from: b, reason: collision with root package name */
    public static int f17840b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f17841c = 0;

    public static boolean a(int i10, androidx.constraintlayout.core.widgets.e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b A10 = eVar.A();
        e.b T10 = eVar.T();
        androidx.constraintlayout.core.widgets.f fVar = eVar.K() != null ? (androidx.constraintlayout.core.widgets.f) eVar.K() : null;
        if (fVar != null) {
            fVar.A();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.T();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z10 = A10 == bVar5 || eVar.n0() || A10 == e.b.WRAP_CONTENT || (A10 == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f17987u == 0 && eVar.f17943W == 0.0f && eVar.a0(0)) || (A10 == bVar2 && eVar.f17987u == 1 && eVar.d0(0, eVar.W()));
        boolean z11 = T10 == bVar5 || eVar.o0() || T10 == e.b.WRAP_CONTENT || (T10 == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f17989v == 0 && eVar.f17943W == 0.0f && eVar.a0(1)) || (T10 == bVar && eVar.f17989v == 1 && eVar.d0(1, eVar.x()));
        if (eVar.f17943W <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    public static void b(int i10, androidx.constraintlayout.core.widgets.e eVar, b.InterfaceC0352b interfaceC0352b, boolean z10) {
        androidx.constraintlayout.core.widgets.d dVar;
        androidx.constraintlayout.core.widgets.d dVar2;
        boolean z11;
        androidx.constraintlayout.core.widgets.d dVar3;
        androidx.constraintlayout.core.widgets.d dVar4;
        if (eVar.g0()) {
            return;
        }
        boolean z12 = true;
        f17840b++;
        if (!(eVar instanceof androidx.constraintlayout.core.widgets.f) && eVar.m0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                androidx.constraintlayout.core.widgets.f.U1(i11, eVar, interfaceC0352b, new b.a(), b.a.f17794k);
            }
        }
        androidx.constraintlayout.core.widgets.d o10 = eVar.o(d.a.LEFT);
        androidx.constraintlayout.core.widgets.d o11 = eVar.o(d.a.RIGHT);
        int e10 = o10.e();
        int e11 = o11.e();
        if (o10.d() != null && o10.n()) {
            Iterator it = o10.d().iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.d dVar5 = (androidx.constraintlayout.core.widgets.d) it.next();
                androidx.constraintlayout.core.widgets.e eVar2 = dVar5.f17905d;
                int i12 = i10 + 1;
                boolean a10 = a(i12, eVar2);
                if (eVar2.m0() && a10) {
                    z11 = z12;
                    androidx.constraintlayout.core.widgets.f.U1(i12, eVar2, interfaceC0352b, new b.a(), b.a.f17794k);
                } else {
                    z11 = z12;
                }
                boolean z13 = ((dVar5 == eVar2.f17931K && (dVar4 = eVar2.f17933M.f17907f) != null && dVar4.n()) || (dVar5 == eVar2.f17933M && (dVar3 = eVar2.f17931K.f17907f) != null && dVar3.n())) ? z11 : false;
                e.b A10 = eVar2.A();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (A10 != bVar || a10) {
                    if (!eVar2.m0()) {
                        androidx.constraintlayout.core.widgets.d dVar6 = eVar2.f17931K;
                        if (dVar5 == dVar6 && eVar2.f17933M.f17907f == null) {
                            int f10 = dVar6.f() + e10;
                            eVar2.G0(f10, eVar2.W() + f10);
                            b(i12, eVar2, interfaceC0352b, z10);
                        } else {
                            androidx.constraintlayout.core.widgets.d dVar7 = eVar2.f17933M;
                            if (dVar5 == dVar7 && dVar6.f17907f == null) {
                                int f11 = e10 - dVar7.f();
                                eVar2.G0(f11 - eVar2.W(), f11);
                                b(i12, eVar2, interfaceC0352b, z10);
                            } else if (z13 && !eVar2.i0()) {
                                d(i12, interfaceC0352b, eVar2, z10);
                            }
                        }
                    }
                } else if (eVar2.A() == bVar && eVar2.f17993x >= 0 && eVar2.f17991w >= 0 && ((eVar2.V() == 8 || (eVar2.f17987u == 0 && eVar2.v() == 0.0f)) && !eVar2.i0() && !eVar2.l0() && z13 && !eVar2.i0())) {
                    e(i12, eVar, interfaceC0352b, eVar2, z10);
                }
                z12 = z11;
            }
        }
        boolean z14 = z12;
        if (eVar instanceof androidx.constraintlayout.core.widgets.h) {
            return;
        }
        if (o11.d() != null && o11.n()) {
            Iterator it2 = o11.d().iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.core.widgets.d dVar8 = (androidx.constraintlayout.core.widgets.d) it2.next();
                androidx.constraintlayout.core.widgets.e eVar3 = dVar8.f17905d;
                int i13 = i10 + 1;
                boolean a11 = a(i13, eVar3);
                if (eVar3.m0() && a11) {
                    androidx.constraintlayout.core.widgets.f.U1(i13, eVar3, interfaceC0352b, new b.a(), b.a.f17794k);
                }
                boolean z15 = ((dVar8 == eVar3.f17931K && (dVar2 = eVar3.f17933M.f17907f) != null && dVar2.n()) || (dVar8 == eVar3.f17933M && (dVar = eVar3.f17931K.f17907f) != null && dVar.n())) ? z14 : false;
                e.b A11 = eVar3.A();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (A11 != bVar2 || a11) {
                    if (!eVar3.m0()) {
                        androidx.constraintlayout.core.widgets.d dVar9 = eVar3.f17931K;
                        if (dVar8 == dVar9 && eVar3.f17933M.f17907f == null) {
                            int f12 = dVar9.f() + e11;
                            eVar3.G0(f12, eVar3.W() + f12);
                            b(i13, eVar3, interfaceC0352b, z10);
                        } else {
                            androidx.constraintlayout.core.widgets.d dVar10 = eVar3.f17933M;
                            if (dVar8 == dVar10 && dVar9.f17907f == null) {
                                int f13 = e11 - dVar10.f();
                                eVar3.G0(f13 - eVar3.W(), f13);
                                b(i13, eVar3, interfaceC0352b, z10);
                            } else if (z15 && !eVar3.i0()) {
                                d(i13, interfaceC0352b, eVar3, z10);
                            }
                        }
                    }
                } else if (eVar3.A() == bVar2 && eVar3.f17993x >= 0 && eVar3.f17991w >= 0 && (eVar3.V() == 8 || (eVar3.f17987u == 0 && eVar3.v() == 0.0f))) {
                    if (!eVar3.i0() && !eVar3.l0() && z15 && !eVar3.i0()) {
                        e(i13, eVar, interfaceC0352b, eVar3, z10);
                    }
                }
            }
        }
        eVar.q0();
    }

    public static void c(int i10, androidx.constraintlayout.core.widgets.a aVar, b.InterfaceC0352b interfaceC0352b, int i11, boolean z10) {
        if (aVar.u1()) {
            if (i11 == 0) {
                b(i10 + 1, aVar, interfaceC0352b, z10);
            } else {
                i(i10 + 1, aVar, interfaceC0352b);
            }
        }
    }

    public static void d(int i10, b.InterfaceC0352b interfaceC0352b, androidx.constraintlayout.core.widgets.e eVar, boolean z10) {
        float y10 = eVar.y();
        int e10 = eVar.f17931K.f17907f.e();
        int e11 = eVar.f17933M.f17907f.e();
        int f10 = eVar.f17931K.f() + e10;
        int f11 = e11 - eVar.f17933M.f();
        if (e10 == e11) {
            y10 = 0.5f;
        } else {
            e10 = f10;
            e11 = f11;
        }
        int W10 = eVar.W();
        int i11 = (e11 - e10) - W10;
        if (e10 > e11) {
            i11 = (e10 - e11) - W10;
        }
        int i12 = ((int) (i11 > 0 ? (y10 * i11) + 0.5f : y10 * i11)) + e10;
        int i13 = i12 + W10;
        if (e10 > e11) {
            i13 = i12 - W10;
        }
        eVar.G0(i12, i13);
        b(i10 + 1, eVar, interfaceC0352b, z10);
    }

    public static void e(int i10, androidx.constraintlayout.core.widgets.e eVar, b.InterfaceC0352b interfaceC0352b, androidx.constraintlayout.core.widgets.e eVar2, boolean z10) {
        float y10 = eVar2.y();
        int e10 = eVar2.f17931K.f17907f.e() + eVar2.f17931K.f();
        int e11 = eVar2.f17933M.f17907f.e() - eVar2.f17933M.f();
        if (e11 >= e10) {
            int W10 = eVar2.W();
            if (eVar2.V() != 8) {
                int i11 = eVar2.f17987u;
                if (i11 == 2) {
                    W10 = (int) (eVar2.y() * 0.5f * (eVar instanceof androidx.constraintlayout.core.widgets.f ? eVar.W() : eVar.K().W()));
                } else if (i11 == 0) {
                    W10 = e11 - e10;
                }
                W10 = Math.max(eVar2.f17991w, W10);
                int i12 = eVar2.f17993x;
                if (i12 > 0) {
                    W10 = Math.min(i12, W10);
                }
            }
            int i13 = e10 + ((int) ((y10 * ((e11 - e10) - W10)) + 0.5f));
            eVar2.G0(i13, W10 + i13);
            b(i10 + 1, eVar2, interfaceC0352b, z10);
        }
    }

    public static void f(int i10, b.InterfaceC0352b interfaceC0352b, androidx.constraintlayout.core.widgets.e eVar) {
        float R10 = eVar.R();
        int e10 = eVar.f17932L.f17907f.e();
        int e11 = eVar.f17934N.f17907f.e();
        int f10 = eVar.f17932L.f() + e10;
        int f11 = e11 - eVar.f17934N.f();
        if (e10 == e11) {
            R10 = 0.5f;
        } else {
            e10 = f10;
            e11 = f11;
        }
        int x10 = eVar.x();
        int i11 = (e11 - e10) - x10;
        if (e10 > e11) {
            i11 = (e10 - e11) - x10;
        }
        int i12 = (int) (i11 > 0 ? (R10 * i11) + 0.5f : R10 * i11);
        int i13 = e10 + i12;
        int i14 = i13 + x10;
        if (e10 > e11) {
            i13 = e10 - i12;
            i14 = i13 - x10;
        }
        eVar.J0(i13, i14);
        i(i10 + 1, eVar, interfaceC0352b);
    }

    public static void g(int i10, androidx.constraintlayout.core.widgets.e eVar, b.InterfaceC0352b interfaceC0352b, androidx.constraintlayout.core.widgets.e eVar2) {
        float R10 = eVar2.R();
        int e10 = eVar2.f17932L.f17907f.e() + eVar2.f17932L.f();
        int e11 = eVar2.f17934N.f17907f.e() - eVar2.f17934N.f();
        if (e11 >= e10) {
            int x10 = eVar2.x();
            if (eVar2.V() != 8) {
                int i11 = eVar2.f17989v;
                if (i11 == 2) {
                    x10 = (int) (R10 * 0.5f * (eVar instanceof androidx.constraintlayout.core.widgets.f ? eVar.x() : eVar.K().x()));
                } else if (i11 == 0) {
                    x10 = e11 - e10;
                }
                x10 = Math.max(eVar2.f17997z, x10);
                int i12 = eVar2.f17921A;
                if (i12 > 0) {
                    x10 = Math.min(i12, x10);
                }
            }
            int i13 = e10 + ((int) ((R10 * ((e11 - e10) - x10)) + 0.5f));
            eVar2.J0(i13, x10 + i13);
            i(i10 + 1, eVar2, interfaceC0352b);
        }
    }

    public static void h(androidx.constraintlayout.core.widgets.f fVar, b.InterfaceC0352b interfaceC0352b) {
        e.b A10 = fVar.A();
        e.b T10 = fVar.T();
        f17840b = 0;
        f17841c = 0;
        fVar.v0();
        ArrayList s12 = fVar.s1();
        int size = s12.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((androidx.constraintlayout.core.widgets.e) s12.get(i10)).v0();
        }
        boolean R12 = fVar.R1();
        if (A10 == e.b.FIXED) {
            fVar.G0(0, fVar.W());
        } else {
            fVar.H0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) s12.get(i11);
            if (eVar instanceof androidx.constraintlayout.core.widgets.h) {
                androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) eVar;
                if (hVar.t1() == 1) {
                    if (hVar.u1() != -1) {
                        hVar.x1(hVar.u1());
                    } else if (hVar.v1() != -1 && fVar.n0()) {
                        hVar.x1(fVar.W() - hVar.v1());
                    } else if (fVar.n0()) {
                        hVar.x1((int) ((hVar.w1() * fVar.W()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((eVar instanceof androidx.constraintlayout.core.widgets.a) && ((androidx.constraintlayout.core.widgets.a) eVar).y1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                androidx.constraintlayout.core.widgets.e eVar2 = (androidx.constraintlayout.core.widgets.e) s12.get(i12);
                if (eVar2 instanceof androidx.constraintlayout.core.widgets.h) {
                    androidx.constraintlayout.core.widgets.h hVar2 = (androidx.constraintlayout.core.widgets.h) eVar2;
                    if (hVar2.t1() == 1) {
                        b(0, hVar2, interfaceC0352b, R12);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0352b, R12);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                androidx.constraintlayout.core.widgets.e eVar3 = (androidx.constraintlayout.core.widgets.e) s12.get(i13);
                if (eVar3 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) eVar3;
                    if (aVar.y1() == 0) {
                        c(0, aVar, interfaceC0352b, 0, R12);
                    }
                }
            }
        }
        if (T10 == e.b.FIXED) {
            fVar.J0(0, fVar.x());
        } else {
            fVar.I0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            androidx.constraintlayout.core.widgets.e eVar4 = (androidx.constraintlayout.core.widgets.e) s12.get(i14);
            if (eVar4 instanceof androidx.constraintlayout.core.widgets.h) {
                androidx.constraintlayout.core.widgets.h hVar3 = (androidx.constraintlayout.core.widgets.h) eVar4;
                if (hVar3.t1() == 0) {
                    if (hVar3.u1() != -1) {
                        hVar3.x1(hVar3.u1());
                    } else if (hVar3.v1() != -1 && fVar.o0()) {
                        hVar3.x1(fVar.x() - hVar3.v1());
                    } else if (fVar.o0()) {
                        hVar3.x1((int) ((hVar3.w1() * fVar.x()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((eVar4 instanceof androidx.constraintlayout.core.widgets.a) && ((androidx.constraintlayout.core.widgets.a) eVar4).y1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                androidx.constraintlayout.core.widgets.e eVar5 = (androidx.constraintlayout.core.widgets.e) s12.get(i15);
                if (eVar5 instanceof androidx.constraintlayout.core.widgets.h) {
                    androidx.constraintlayout.core.widgets.h hVar4 = (androidx.constraintlayout.core.widgets.h) eVar5;
                    if (hVar4.t1() == 0) {
                        i(1, hVar4, interfaceC0352b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC0352b);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                androidx.constraintlayout.core.widgets.e eVar6 = (androidx.constraintlayout.core.widgets.e) s12.get(i16);
                if (eVar6 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) eVar6;
                    if (aVar2.y1() == 1) {
                        c(0, aVar2, interfaceC0352b, 1, R12);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            androidx.constraintlayout.core.widgets.e eVar7 = (androidx.constraintlayout.core.widgets.e) s12.get(i17);
            if (eVar7.m0() && a(0, eVar7)) {
                androidx.constraintlayout.core.widgets.f.U1(0, eVar7, interfaceC0352b, f17839a, b.a.f17794k);
                if (!(eVar7 instanceof androidx.constraintlayout.core.widgets.h)) {
                    b(0, eVar7, interfaceC0352b, R12);
                    i(0, eVar7, interfaceC0352b);
                } else if (((androidx.constraintlayout.core.widgets.h) eVar7).t1() == 0) {
                    i(0, eVar7, interfaceC0352b);
                } else {
                    b(0, eVar7, interfaceC0352b, R12);
                }
            }
        }
    }

    public static void i(int i10, androidx.constraintlayout.core.widgets.e eVar, b.InterfaceC0352b interfaceC0352b) {
        androidx.constraintlayout.core.widgets.d dVar;
        androidx.constraintlayout.core.widgets.d dVar2;
        androidx.constraintlayout.core.widgets.d dVar3;
        androidx.constraintlayout.core.widgets.d dVar4;
        if (eVar.p0()) {
            return;
        }
        boolean z10 = true;
        f17841c++;
        if (!(eVar instanceof androidx.constraintlayout.core.widgets.f) && eVar.m0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                androidx.constraintlayout.core.widgets.f.U1(i11, eVar, interfaceC0352b, new b.a(), b.a.f17794k);
            }
        }
        androidx.constraintlayout.core.widgets.d o10 = eVar.o(d.a.TOP);
        androidx.constraintlayout.core.widgets.d o11 = eVar.o(d.a.BOTTOM);
        int e10 = o10.e();
        int e11 = o11.e();
        if (o10.d() != null && o10.n()) {
            Iterator it = o10.d().iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.d dVar5 = (androidx.constraintlayout.core.widgets.d) it.next();
                androidx.constraintlayout.core.widgets.e eVar2 = dVar5.f17905d;
                int i12 = i10 + 1;
                boolean a10 = a(i12, eVar2);
                if (eVar2.m0() && a10) {
                    androidx.constraintlayout.core.widgets.f.U1(i12, eVar2, interfaceC0352b, new b.a(), b.a.f17794k);
                }
                boolean z11 = ((dVar5 == eVar2.f17932L && (dVar4 = eVar2.f17934N.f17907f) != null && dVar4.n()) || (dVar5 == eVar2.f17934N && (dVar3 = eVar2.f17932L.f17907f) != null && dVar3.n())) ? z10 : false;
                e.b T10 = eVar2.T();
                boolean z12 = z10;
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (T10 != bVar || a10) {
                    if (!eVar2.m0()) {
                        androidx.constraintlayout.core.widgets.d dVar6 = eVar2.f17932L;
                        if (dVar5 == dVar6 && eVar2.f17934N.f17907f == null) {
                            int f10 = dVar6.f() + e10;
                            eVar2.J0(f10, eVar2.x() + f10);
                            i(i12, eVar2, interfaceC0352b);
                        } else {
                            androidx.constraintlayout.core.widgets.d dVar7 = eVar2.f17934N;
                            if (dVar5 == dVar7 && dVar6.f17907f == null) {
                                int f11 = e10 - dVar7.f();
                                eVar2.J0(f11 - eVar2.x(), f11);
                                i(i12, eVar2, interfaceC0352b);
                            } else if (z11 && !eVar2.k0()) {
                                f(i12, interfaceC0352b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.T() == bVar && eVar2.f17921A >= 0 && eVar2.f17997z >= 0 && ((eVar2.V() == 8 || (eVar2.f17989v == 0 && eVar2.v() == 0.0f)) && !eVar2.k0() && !eVar2.l0() && z11 && !eVar2.k0())) {
                    g(i12, eVar, interfaceC0352b, eVar2);
                }
                z10 = z12;
            }
        }
        boolean z13 = z10;
        if (eVar instanceof androidx.constraintlayout.core.widgets.h) {
            return;
        }
        if (o11.d() != null && o11.n()) {
            Iterator it2 = o11.d().iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.core.widgets.d dVar8 = (androidx.constraintlayout.core.widgets.d) it2.next();
                androidx.constraintlayout.core.widgets.e eVar3 = dVar8.f17905d;
                int i13 = i10 + 1;
                boolean a11 = a(i13, eVar3);
                if (eVar3.m0() && a11) {
                    androidx.constraintlayout.core.widgets.f.U1(i13, eVar3, interfaceC0352b, new b.a(), b.a.f17794k);
                }
                boolean z14 = ((dVar8 == eVar3.f17932L && (dVar2 = eVar3.f17934N.f17907f) != null && dVar2.n()) || (dVar8 == eVar3.f17934N && (dVar = eVar3.f17932L.f17907f) != null && dVar.n())) ? z13 : false;
                e.b T11 = eVar3.T();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (T11 != bVar2 || a11) {
                    if (!eVar3.m0()) {
                        androidx.constraintlayout.core.widgets.d dVar9 = eVar3.f17932L;
                        if (dVar8 == dVar9 && eVar3.f17934N.f17907f == null) {
                            int f12 = dVar9.f() + e11;
                            eVar3.J0(f12, eVar3.x() + f12);
                            i(i13, eVar3, interfaceC0352b);
                        } else {
                            androidx.constraintlayout.core.widgets.d dVar10 = eVar3.f17934N;
                            if (dVar8 == dVar10 && dVar9.f17907f == null) {
                                int f13 = e11 - dVar10.f();
                                eVar3.J0(f13 - eVar3.x(), f13);
                                i(i13, eVar3, interfaceC0352b);
                            } else if (z14 && !eVar3.k0()) {
                                f(i13, interfaceC0352b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.T() == bVar2 && eVar3.f17921A >= 0 && eVar3.f17997z >= 0 && (eVar3.V() == 8 || (eVar3.f17989v == 0 && eVar3.v() == 0.0f))) {
                    if (!eVar3.k0() && !eVar3.l0() && z14 && !eVar3.k0()) {
                        g(i13, eVar, interfaceC0352b, eVar3);
                    }
                }
            }
        }
        androidx.constraintlayout.core.widgets.d o12 = eVar.o(d.a.BASELINE);
        if (o12.d() != null && o12.n()) {
            int e12 = o12.e();
            Iterator it3 = o12.d().iterator();
            while (it3.hasNext()) {
                androidx.constraintlayout.core.widgets.d dVar11 = (androidx.constraintlayout.core.widgets.d) it3.next();
                androidx.constraintlayout.core.widgets.e eVar4 = dVar11.f17905d;
                int i14 = i10 + 1;
                boolean a12 = a(i14, eVar4);
                if (eVar4.m0() && a12) {
                    androidx.constraintlayout.core.widgets.f.U1(i14, eVar4, interfaceC0352b, new b.a(), b.a.f17794k);
                }
                if (eVar4.T() != e.b.MATCH_CONSTRAINT || a12) {
                    if (!eVar4.m0() && dVar11 == eVar4.f17935O) {
                        eVar4.F0(dVar11.f() + e12);
                        i(i14, eVar4, interfaceC0352b);
                    }
                }
            }
        }
        eVar.r0();
    }
}
