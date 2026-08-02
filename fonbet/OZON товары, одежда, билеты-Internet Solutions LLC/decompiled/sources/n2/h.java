package n2;

import java.util.ArrayList;
import java.util.Iterator;
import m2.C8043a;
import m2.d;
import m2.e;
import n2.C8420b;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static C8420b.a f76329a = new C8420b.a();

    private static boolean a(m2.e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b[] bVarArr = eVar.f74115V;
        e.b bVar3 = bVarArr[0];
        e.b bVar4 = bVarArr[1];
        m2.e eVar2 = eVar.f74116W;
        m2.f fVar = eVar2 != null ? (m2.f) eVar2 : null;
        if (fVar != null) {
            e.b bVar5 = fVar.f74115V[0];
            e.b bVar6 = e.b.FIXED;
        }
        if (fVar != null) {
            e.b bVar7 = fVar.f74115V[1];
            e.b bVar8 = e.b.FIXED;
        }
        e.b bVar9 = e.b.FIXED;
        boolean z11 = bVar3 == bVar9 || eVar.d0() || bVar3 == e.b.WRAP_CONTENT || (bVar3 == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f74156s == 0 && eVar.f74119Z == 0.0f && eVar.R(0)) || (bVar3 == bVar2 && eVar.f74156s == 1 && eVar.T(0, eVar.N()));
        boolean z12 = bVar4 == bVar9 || eVar.e0() || bVar4 == e.b.WRAP_CONTENT || (bVar4 == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f74158t == 0 && eVar.f74119Z == 0.0f && eVar.R(1)) || (bVar4 == bVar && eVar.f74158t == 1 && eVar.T(1, eVar.v()));
        return (eVar.f74119Z > 0.0f && (z11 || z12)) || (z11 && z12);
    }

    private static void b(int i11, m2.e eVar, C8420b.InterfaceC1286b interfaceC1286b, boolean z11) {
        m2.d dVar;
        m2.d dVar2;
        m2.d dVar3;
        m2.d dVar4;
        if (eVar.W()) {
            return;
        }
        if (!(eVar instanceof m2.f) && eVar.c0() && a(eVar)) {
            m2.f.o1(eVar, interfaceC1286b, new C8420b.a());
        }
        m2.d n11 = eVar.n(d.a.LEFT);
        m2.d n12 = eVar.n(d.a.RIGHT);
        int e11 = n11.e();
        int e12 = n12.e();
        if (n11.d() != null && n11.k()) {
            Iterator<m2.d> it = n11.d().iterator();
            while (it.hasNext()) {
                m2.d next = it.next();
                m2.e eVar2 = next.f74088d;
                int i12 = i11 + 1;
                boolean a11 = a(eVar2);
                if (eVar2.c0() && a11) {
                    m2.f.o1(eVar2, interfaceC1286b, new C8420b.a());
                }
                m2.d dVar5 = eVar2.f74104K;
                m2.d dVar6 = eVar2.f74106M;
                boolean z12 = (next == dVar5 && (dVar4 = dVar6.f74090f) != null && dVar4.k()) || (next == dVar6 && (dVar3 = dVar5.f74090f) != null && dVar3.k());
                e.b bVar = eVar2.f74115V[0];
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar != bVar2 || a11) {
                    if (!eVar2.c0()) {
                        if (next == dVar5 && dVar6.f74090f == null) {
                            int f7 = dVar5.f() + e11;
                            eVar2.u0(f7, eVar2.N() + f7);
                            b(i12, eVar2, interfaceC1286b, z11);
                        } else if (next == dVar6 && dVar5.f74090f == null) {
                            int f11 = e11 - dVar6.f();
                            eVar2.u0(f11 - eVar2.N(), f11);
                            b(i12, eVar2, interfaceC1286b, z11);
                        } else if (z12 && !eVar2.Y()) {
                            c(i12, eVar2, interfaceC1286b, z11);
                        }
                    }
                } else if (bVar == bVar2 && eVar2.f74163w >= 0 && eVar2.f74162v >= 0 && (eVar2.M() == 8 || (eVar2.f74156s == 0 && eVar2.f74119Z == 0.0f))) {
                    if (!eVar2.Y() && !eVar2.b0() && z12 && !eVar2.Y()) {
                        d(i12, eVar, interfaceC1286b, eVar2, z11);
                    }
                }
            }
        }
        if (eVar instanceof m2.h) {
            return;
        }
        if (n12.d() != null && n12.k()) {
            Iterator<m2.d> it2 = n12.d().iterator();
            while (it2.hasNext()) {
                m2.d next2 = it2.next();
                m2.e eVar3 = next2.f74088d;
                int i13 = i11 + 1;
                boolean a12 = a(eVar3);
                if (eVar3.c0() && a12) {
                    m2.f.o1(eVar3, interfaceC1286b, new C8420b.a());
                }
                m2.d dVar7 = eVar3.f74104K;
                m2.d dVar8 = eVar3.f74106M;
                boolean z13 = (next2 == dVar7 && (dVar2 = dVar8.f74090f) != null && dVar2.k()) || (next2 == dVar8 && (dVar = dVar7.f74090f) != null && dVar.k());
                e.b bVar3 = eVar3.f74115V[0];
                e.b bVar4 = e.b.MATCH_CONSTRAINT;
                if (bVar3 != bVar4 || a12) {
                    if (!eVar3.c0()) {
                        if (next2 == dVar7 && dVar8.f74090f == null) {
                            int f12 = dVar7.f() + e12;
                            eVar3.u0(f12, eVar3.N() + f12);
                            b(i13, eVar3, interfaceC1286b, z11);
                        } else if (next2 == dVar8 && dVar7.f74090f == null) {
                            int f13 = e12 - dVar8.f();
                            eVar3.u0(f13 - eVar3.N(), f13);
                            b(i13, eVar3, interfaceC1286b, z11);
                        } else if (z13 && !eVar3.Y()) {
                            c(i13, eVar3, interfaceC1286b, z11);
                        }
                    }
                } else if (bVar3 == bVar4 && eVar3.f74163w >= 0 && eVar3.f74162v >= 0) {
                    if (eVar3.M() == 8 || (eVar3.f74156s == 0 && eVar3.f74119Z == 0.0f)) {
                        if (!eVar3.Y() && !eVar3.b0() && z13 && !eVar3.Y()) {
                            d(i13, eVar, interfaceC1286b, eVar3, z11);
                        }
                    }
                }
            }
        }
        eVar.g0();
    }

    private static void c(int i11, m2.e eVar, C8420b.InterfaceC1286b interfaceC1286b, boolean z11) {
        float w11 = eVar.w();
        m2.d dVar = eVar.f74104K;
        int e11 = dVar.f74090f.e();
        m2.d dVar2 = eVar.f74106M;
        int e12 = dVar2.f74090f.e();
        int f7 = dVar.f() + e11;
        int f11 = e12 - dVar2.f();
        if (e11 == e12) {
            w11 = 0.5f;
        } else {
            e11 = f7;
            e12 = f11;
        }
        int N11 = eVar.N();
        int i12 = (e12 - e11) - N11;
        if (e11 > e12) {
            i12 = (e11 - e12) - N11;
        }
        int i13 = ((int) (i12 > 0 ? (w11 * i12) + 0.5f : w11 * i12)) + e11;
        int i14 = i13 + N11;
        if (e11 > e12) {
            i14 = i13 - N11;
        }
        eVar.u0(i13, i14);
        b(i11 + 1, eVar, interfaceC1286b, z11);
    }

    private static void d(int i11, m2.e eVar, C8420b.InterfaceC1286b interfaceC1286b, m2.e eVar2, boolean z11) {
        float w11 = eVar2.w();
        m2.d dVar = eVar2.f74104K;
        int f7 = dVar.f() + dVar.f74090f.e();
        m2.d dVar2 = eVar2.f74106M;
        int e11 = dVar2.f74090f.e() - dVar2.f();
        if (e11 >= f7) {
            int N11 = eVar2.N();
            if (eVar2.M() != 8) {
                int i12 = eVar2.f74156s;
                if (i12 == 2) {
                    N11 = (int) (eVar2.w() * 0.5f * (eVar instanceof m2.f ? eVar.N() : eVar.f74116W.N()));
                } else if (i12 == 0) {
                    N11 = e11 - f7;
                }
                N11 = Math.max(eVar2.f74162v, N11);
                int i13 = eVar2.f74163w;
                if (i13 > 0) {
                    N11 = Math.min(i13, N11);
                }
            }
            int i14 = f7 + ((int) ((w11 * ((e11 - f7) - N11)) + 0.5f));
            eVar2.u0(i14, N11 + i14);
            b(i11 + 1, eVar2, interfaceC1286b, z11);
        }
    }

    private static void e(int i11, m2.e eVar, C8420b.InterfaceC1286b interfaceC1286b) {
        float K11 = eVar.K();
        m2.d dVar = eVar.f74105L;
        int e11 = dVar.f74090f.e();
        m2.d dVar2 = eVar.f74107N;
        int e12 = dVar2.f74090f.e();
        int f7 = dVar.f() + e11;
        int f11 = e12 - dVar2.f();
        if (e11 == e12) {
            K11 = 0.5f;
        } else {
            e11 = f7;
            e12 = f11;
        }
        int v11 = eVar.v();
        int i12 = (e12 - e11) - v11;
        if (e11 > e12) {
            i12 = (e11 - e12) - v11;
        }
        int i13 = (int) (i12 > 0 ? (K11 * i12) + 0.5f : K11 * i12);
        int i14 = e11 + i13;
        int i15 = i14 + v11;
        if (e11 > e12) {
            i14 = e11 - i13;
            i15 = i14 - v11;
        }
        eVar.x0(i14, i15);
        h(i11 + 1, eVar, interfaceC1286b);
    }

    private static void f(int i11, m2.e eVar, C8420b.InterfaceC1286b interfaceC1286b, m2.e eVar2) {
        float K11 = eVar2.K();
        m2.d dVar = eVar2.f74105L;
        int f7 = dVar.f() + dVar.f74090f.e();
        m2.d dVar2 = eVar2.f74107N;
        int e11 = dVar2.f74090f.e() - dVar2.f();
        if (e11 >= f7) {
            int v11 = eVar2.v();
            if (eVar2.M() != 8) {
                int i12 = eVar2.f74158t;
                if (i12 == 2) {
                    v11 = (int) (K11 * 0.5f * (eVar instanceof m2.f ? eVar.v() : eVar.f74116W.v()));
                } else if (i12 == 0) {
                    v11 = e11 - f7;
                }
                v11 = Math.max(eVar2.f74165y, v11);
                int i13 = eVar2.f74166z;
                if (i13 > 0) {
                    v11 = Math.min(i13, v11);
                }
            }
            int i14 = f7 + ((int) ((K11 * ((e11 - f7) - v11)) + 0.5f));
            eVar2.x0(i14, v11 + i14);
            h(i11 + 1, eVar2, interfaceC1286b);
        }
    }

    public static void g(m2.f fVar, C8420b.InterfaceC1286b interfaceC1286b) {
        e.b[] bVarArr = fVar.f74115V;
        e.b bVar = bVarArr[0];
        e.b bVar2 = bVarArr[1];
        fVar.k0();
        ArrayList<m2.e> arrayList = fVar.f74253v0;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.get(i11).k0();
        }
        boolean l12 = fVar.l1();
        if (bVar == e.b.FIXED) {
            fVar.u0(0, fVar.N());
        } else {
            fVar.v0();
        }
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            m2.e eVar = arrayList.get(i12);
            if (eVar instanceof m2.h) {
                m2.h hVar = (m2.h) eVar;
                if (hVar.a1() == 1) {
                    if (hVar.b1() != -1) {
                        hVar.e1(hVar.b1());
                    } else if (hVar.c1() != -1 && fVar.d0()) {
                        hVar.e1(fVar.N() - hVar.c1());
                    } else if (fVar.d0()) {
                        hVar.e1((int) ((hVar.d1() * fVar.N()) + 0.5f));
                    }
                    z11 = true;
                }
            } else if ((eVar instanceof C8043a) && ((C8043a) eVar).e1() == 0) {
                z12 = true;
            }
        }
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                m2.e eVar2 = arrayList.get(i13);
                if (eVar2 instanceof m2.h) {
                    m2.h hVar2 = (m2.h) eVar2;
                    if (hVar2.a1() == 1) {
                        b(0, hVar2, interfaceC1286b, l12);
                    }
                }
            }
        }
        b(0, fVar, interfaceC1286b, l12);
        if (z12) {
            for (int i14 = 0; i14 < size; i14++) {
                m2.e eVar3 = arrayList.get(i14);
                if (eVar3 instanceof C8043a) {
                    C8043a c8043a = (C8043a) eVar3;
                    if (c8043a.e1() == 0 && c8043a.a1()) {
                        b(1, c8043a, interfaceC1286b, l12);
                    }
                }
            }
        }
        if (bVar2 == e.b.FIXED) {
            fVar.x0(0, fVar.v());
        } else {
            fVar.w0();
        }
        boolean z13 = false;
        boolean z14 = false;
        for (int i15 = 0; i15 < size; i15++) {
            m2.e eVar4 = arrayList.get(i15);
            if (eVar4 instanceof m2.h) {
                m2.h hVar3 = (m2.h) eVar4;
                if (hVar3.a1() == 0) {
                    if (hVar3.b1() != -1) {
                        hVar3.e1(hVar3.b1());
                    } else if (hVar3.c1() != -1 && fVar.e0()) {
                        hVar3.e1(fVar.v() - hVar3.c1());
                    } else if (fVar.e0()) {
                        hVar3.e1((int) ((hVar3.d1() * fVar.v()) + 0.5f));
                    }
                    z13 = true;
                }
            } else if ((eVar4 instanceof C8043a) && ((C8043a) eVar4).e1() == 1) {
                z14 = true;
            }
        }
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                m2.e eVar5 = arrayList.get(i16);
                if (eVar5 instanceof m2.h) {
                    m2.h hVar4 = (m2.h) eVar5;
                    if (hVar4.a1() == 0) {
                        h(1, hVar4, interfaceC1286b);
                    }
                }
            }
        }
        h(0, fVar, interfaceC1286b);
        if (z14) {
            for (int i17 = 0; i17 < size; i17++) {
                m2.e eVar6 = arrayList.get(i17);
                if (eVar6 instanceof C8043a) {
                    C8043a c8043a2 = (C8043a) eVar6;
                    if (c8043a2.e1() == 1 && c8043a2.a1()) {
                        h(1, c8043a2, interfaceC1286b);
                    }
                }
            }
        }
        for (int i18 = 0; i18 < size; i18++) {
            m2.e eVar7 = arrayList.get(i18);
            if (eVar7.c0() && a(eVar7)) {
                m2.f.o1(eVar7, interfaceC1286b, f76329a);
                if (!(eVar7 instanceof m2.h)) {
                    b(0, eVar7, interfaceC1286b, l12);
                    h(0, eVar7, interfaceC1286b);
                } else if (((m2.h) eVar7).a1() == 0) {
                    h(0, eVar7, interfaceC1286b);
                } else {
                    b(0, eVar7, interfaceC1286b, l12);
                }
            }
        }
    }

    private static void h(int i11, m2.e eVar, C8420b.InterfaceC1286b interfaceC1286b) {
        m2.d dVar;
        m2.d dVar2;
        m2.d dVar3;
        m2.d dVar4;
        if (eVar.f0()) {
            return;
        }
        if (!(eVar instanceof m2.f) && eVar.c0() && a(eVar)) {
            m2.f.o1(eVar, interfaceC1286b, new C8420b.a());
        }
        m2.d n11 = eVar.n(d.a.TOP);
        m2.d n12 = eVar.n(d.a.BOTTOM);
        int e11 = n11.e();
        int e12 = n12.e();
        if (n11.d() != null && n11.k()) {
            Iterator<m2.d> it = n11.d().iterator();
            while (it.hasNext()) {
                m2.d next = it.next();
                m2.e eVar2 = next.f74088d;
                int i12 = i11 + 1;
                boolean a11 = a(eVar2);
                if (eVar2.c0() && a11) {
                    m2.f.o1(eVar2, interfaceC1286b, new C8420b.a());
                }
                m2.d dVar5 = eVar2.f74105L;
                m2.d dVar6 = eVar2.f74107N;
                boolean z11 = (next == dVar5 && (dVar4 = dVar6.f74090f) != null && dVar4.k()) || (next == dVar6 && (dVar3 = dVar5.f74090f) != null && dVar3.k());
                e.b bVar = eVar2.f74115V[1];
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar != bVar2 || a11) {
                    if (!eVar2.c0()) {
                        if (next == dVar5 && dVar6.f74090f == null) {
                            int f7 = dVar5.f() + e11;
                            eVar2.x0(f7, eVar2.v() + f7);
                            h(i12, eVar2, interfaceC1286b);
                        } else if (next == dVar6 && dVar5.f74090f == null) {
                            int f11 = e11 - dVar6.f();
                            eVar2.x0(f11 - eVar2.v(), f11);
                            h(i12, eVar2, interfaceC1286b);
                        } else if (z11 && !eVar2.a0()) {
                            e(i12, eVar2, interfaceC1286b);
                        }
                    }
                } else if (bVar == bVar2 && eVar2.f74166z >= 0 && eVar2.f74165y >= 0 && (eVar2.M() == 8 || (eVar2.f74158t == 0 && eVar2.f74119Z == 0.0f))) {
                    if (!eVar2.a0() && !eVar2.b0() && z11 && !eVar2.a0()) {
                        f(i12, eVar, interfaceC1286b, eVar2);
                    }
                }
            }
        }
        if (eVar instanceof m2.h) {
            return;
        }
        if (n12.d() != null && n12.k()) {
            Iterator<m2.d> it2 = n12.d().iterator();
            while (it2.hasNext()) {
                m2.d next2 = it2.next();
                m2.e eVar3 = next2.f74088d;
                int i13 = i11 + 1;
                boolean a12 = a(eVar3);
                if (eVar3.c0() && a12) {
                    m2.f.o1(eVar3, interfaceC1286b, new C8420b.a());
                }
                m2.d dVar7 = eVar3.f74105L;
                m2.d dVar8 = eVar3.f74107N;
                boolean z12 = (next2 == dVar7 && (dVar2 = dVar8.f74090f) != null && dVar2.k()) || (next2 == dVar8 && (dVar = dVar7.f74090f) != null && dVar.k());
                e.b bVar3 = eVar3.f74115V[1];
                e.b bVar4 = e.b.MATCH_CONSTRAINT;
                if (bVar3 != bVar4 || a12) {
                    if (!eVar3.c0()) {
                        if (next2 == dVar7 && dVar8.f74090f == null) {
                            int f12 = dVar7.f() + e12;
                            eVar3.x0(f12, eVar3.v() + f12);
                            h(i13, eVar3, interfaceC1286b);
                        } else if (next2 == dVar8 && dVar7.f74090f == null) {
                            int f13 = e12 - dVar8.f();
                            eVar3.x0(f13 - eVar3.v(), f13);
                            h(i13, eVar3, interfaceC1286b);
                        } else if (z12 && !eVar3.a0()) {
                            e(i13, eVar3, interfaceC1286b);
                        }
                    }
                } else if (bVar3 == bVar4 && eVar3.f74166z >= 0 && eVar3.f74165y >= 0 && (eVar3.M() == 8 || (eVar3.f74158t == 0 && eVar3.f74119Z == 0.0f))) {
                    if (!eVar3.a0() && !eVar3.b0() && z12 && !eVar3.a0()) {
                        f(i13, eVar, interfaceC1286b, eVar3);
                    }
                }
            }
        }
        m2.d n13 = eVar.n(d.a.BASELINE);
        if (n13.d() != null && n13.k()) {
            int e13 = n13.e();
            Iterator<m2.d> it3 = n13.d().iterator();
            while (it3.hasNext()) {
                m2.d next3 = it3.next();
                m2.e eVar4 = next3.f74088d;
                int i14 = i11 + 1;
                boolean a13 = a(eVar4);
                if (eVar4.c0() && a13) {
                    m2.f.o1(eVar4, interfaceC1286b, new C8420b.a());
                }
                if (eVar4.f74115V[1] != e.b.MATCH_CONSTRAINT || a13) {
                    if (!eVar4.c0() && next3 == eVar4.f74108O) {
                        eVar4.t0(next3.f() + e13);
                        h(i14, eVar4, interfaceC1286b);
                    }
                }
            }
        }
        eVar.h0();
    }
}
