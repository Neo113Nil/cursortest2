package r1;

import java.util.List;
import l1.s0;
import org.jetbrains.annotations.NotNull;
import r1.g;

/* loaded from: classes.dex */
public final class i {
    private static final void a(s0 s0Var, double d11, double d12, double d13, double d14, double d15, double d16, double d17, boolean z11, boolean z12) {
        double d18;
        double d19;
        double d21 = d15;
        double d22 = (d17 / 180) * 3.141592653589793d;
        double cos = Math.cos(d22);
        double sin = Math.sin(d22);
        double d23 = ((d12 * sin) + (d11 * cos)) / d21;
        double d24 = ((d12 * cos) + ((-d11) * sin)) / d16;
        double d25 = ((d14 * sin) + (d13 * cos)) / d21;
        double d26 = ((d14 * cos) + ((-d13) * sin)) / d16;
        double d27 = d23 - d25;
        double d28 = d24 - d26;
        double d29 = 2;
        double d31 = (d23 + d25) / d29;
        double d32 = (d24 + d26) / d29;
        double d33 = (d28 * d28) + (d27 * d27);
        if (d33 == 0.0d) {
            return;
        }
        double d34 = (1.0d / d33) - 0.25d;
        if (d34 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d33) / 1.99999d);
            a(s0Var, d11, d12, d13, d14, d21 * sqrt, d16 * sqrt, d17, z11, z12);
            return;
        }
        double sqrt2 = Math.sqrt(d34);
        double d35 = d27 * sqrt2;
        double d36 = sqrt2 * d28;
        if (z11 == z12) {
            d18 = d31 - d36;
            d19 = d32 + d35;
        } else {
            d18 = d31 + d36;
            d19 = d32 - d35;
        }
        double atan2 = Math.atan2(d24 - d19, d23 - d18);
        double atan22 = Math.atan2(d26 - d19, d25 - d18) - atan2;
        if (z12 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d37 = d18 * d21;
        double d38 = d19 * d16;
        double d39 = (d37 * cos) - (d38 * sin);
        double d41 = (d38 * cos) + (d37 * sin);
        double d42 = 4;
        int ceil = (int) Math.ceil(Math.abs((atan22 * d42) / 3.141592653589793d));
        double cos2 = Math.cos(d22);
        double sin2 = Math.sin(d22);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d43 = atan22;
        double d44 = -d21;
        double d45 = d44 * cos2;
        double d46 = d16 * sin2;
        double d47 = (d45 * sin3) - (d46 * cos3);
        double d48 = d44 * sin2;
        double d49 = d16 * cos2;
        double d51 = (cos3 * d49) + (sin3 * d48);
        double d52 = d43 / ceil;
        double d53 = atan2;
        double d54 = d47;
        int i11 = 0;
        double d55 = d11;
        double d56 = d51;
        double d57 = d12;
        while (i11 < ceil) {
            double d58 = d53 + d52;
            double sin4 = Math.sin(d58);
            double cos4 = Math.cos(d58);
            int i12 = i11;
            double d59 = (((d21 * cos2) * cos4) + d39) - (d46 * sin4);
            int i13 = ceil;
            double d61 = (d49 * sin4) + (d21 * sin2 * cos4) + d41;
            double d62 = (d45 * sin4) - (d46 * cos4);
            double d63 = (cos4 * d49) + (sin4 * d48);
            double d64 = d58 - d53;
            double tan = Math.tan(d64 / d29);
            double sqrt3 = ((Math.sqrt(((3.0d * tan) * tan) + d42) - 1) * Math.sin(d64)) / 3;
            s0Var.c((float) ((d54 * sqrt3) + d55), (float) ((d56 * sqrt3) + d57), (float) (d59 - (sqrt3 * d62)), (float) (d61 - (sqrt3 * d63)), (float) d59, (float) d61);
            d55 = d59;
            i11 = i12 + 1;
            d39 = d39;
            sin2 = sin2;
            d42 = d42;
            d53 = d58;
            d56 = d63;
            d54 = d62;
            d57 = d61;
            d21 = d15;
            ceil = i13;
        }
    }

    @NotNull
    public static final void b(@NotNull List list, @NotNull s0 s0Var) {
        int i11;
        float f7;
        int i12;
        g gVar;
        float f11;
        float f12;
        float f13;
        float f14;
        float d11;
        float f15;
        float f16;
        float f17;
        float f18;
        float c11;
        float e11;
        float d12;
        float f19;
        float h11;
        float c12;
        float c13;
        float c14;
        float d13;
        List list2 = list;
        s0 s0Var2 = s0Var;
        int m11 = s0Var2.m();
        s0Var2.h();
        s0Var2.q(m11);
        g gVar2 = list2.isEmpty() ? g.b.f82746c : (g) list2.get(0);
        int size = list2.size();
        float f21 = 0.0f;
        int i13 = 0;
        float f22 = 0.0f;
        float f23 = 0.0f;
        float f24 = 0.0f;
        float f25 = 0.0f;
        float f26 = 0.0f;
        float f27 = 0.0f;
        while (i13 < size) {
            g gVar3 = (g) list2.get(i13);
            if (gVar3 instanceof g.b) {
                s0Var2.close();
                i11 = size;
                f7 = f21;
                i12 = i13;
                gVar = gVar3;
                f22 = f26;
                f24 = f22;
                f23 = f27;
            } else {
                if (gVar3 instanceof g.n) {
                    g.n nVar = (g.n) gVar3;
                    c14 = nVar.c() + f24;
                    d13 = nVar.d() + f25;
                    s0Var2.e(nVar.c(), nVar.d());
                } else if (gVar3 instanceof g.f) {
                    g.f fVar = (g.f) gVar3;
                    c14 = fVar.c();
                    d13 = fVar.d();
                    s0Var2.a(fVar.c(), fVar.d());
                } else {
                    if (gVar3 instanceof g.m) {
                        g.m mVar = (g.m) gVar3;
                        s0Var2.t(mVar.c(), mVar.d());
                        d11 = mVar.c() + f24;
                        f16 = mVar.d();
                    } else {
                        if (gVar3 instanceof g.e) {
                            g.e eVar = (g.e) gVar3;
                            s0Var2.b(eVar.c(), eVar.d());
                            d11 = eVar.c();
                            f15 = eVar.d();
                        } else {
                            if (gVar3 instanceof g.l) {
                                g.l lVar = (g.l) gVar3;
                                s0Var2.t(lVar.c(), f21);
                                c13 = lVar.c() + f24;
                            } else if (gVar3 instanceof g.d) {
                                g.d dVar = (g.d) gVar3;
                                s0Var2.b(dVar.c(), f25);
                                c13 = dVar.c();
                            } else {
                                if (gVar3 instanceof g.r) {
                                    g.r rVar = (g.r) gVar3;
                                    s0Var2.t(f21, rVar.c());
                                    c12 = rVar.c() + f25;
                                } else if (gVar3 instanceof g.s) {
                                    g.s sVar = (g.s) gVar3;
                                    s0Var2.b(f24, sVar.c());
                                    c12 = sVar.c();
                                } else {
                                    if (gVar3 instanceof g.k) {
                                        g.k kVar = (g.k) gVar3;
                                        s0Var2.f(kVar.c(), kVar.f(), kVar.d(), kVar.g(), kVar.e(), kVar.h());
                                        c11 = kVar.d() + f24;
                                        e11 = kVar.g() + f25;
                                        d12 = kVar.e() + f24;
                                        f19 = kVar.h();
                                    } else if (gVar3 instanceof g.c) {
                                        g.c cVar = (g.c) gVar3;
                                        s0Var.c(cVar.c(), cVar.f(), cVar.d(), cVar.g(), cVar.e(), cVar.h());
                                        c11 = cVar.d();
                                        e11 = cVar.g();
                                        d12 = cVar.e();
                                        h11 = cVar.h();
                                        f24 = d12;
                                        f25 = h11;
                                        i11 = size;
                                        f7 = f21;
                                        i12 = i13;
                                        gVar = gVar3;
                                        f22 = c11;
                                        f23 = e11;
                                        i13 = i12 + 1;
                                        s0Var2 = s0Var;
                                        gVar2 = gVar;
                                        f21 = f7;
                                        size = i11;
                                        list2 = list;
                                    } else if (gVar3 instanceof g.p) {
                                        if (gVar2.a()) {
                                            float f28 = f24 - f22;
                                            f18 = f25 - f23;
                                            f17 = f28;
                                        } else {
                                            f17 = f21;
                                            f18 = f17;
                                        }
                                        g.p pVar = (g.p) gVar3;
                                        s0Var.f(f17, f18, pVar.c(), pVar.e(), pVar.d(), pVar.f());
                                        c11 = pVar.c() + f24;
                                        e11 = pVar.e() + f25;
                                        d12 = pVar.d() + f24;
                                        f19 = pVar.f();
                                    } else {
                                        if (gVar3 instanceof g.h) {
                                            if (gVar2.a()) {
                                                float f29 = 2;
                                                f24 = (f24 * f29) - f22;
                                                f25 = (f29 * f25) - f23;
                                            }
                                            g.h hVar = (g.h) gVar3;
                                            s0Var.c(f24, f25, hVar.c(), hVar.e(), hVar.d(), hVar.f());
                                            f13 = hVar.c();
                                            f14 = hVar.e();
                                            float d14 = hVar.d();
                                            float f31 = hVar.f();
                                            f24 = d14;
                                            f25 = f31;
                                        } else if (gVar3 instanceof g.o) {
                                            g.o oVar = (g.o) gVar3;
                                            s0Var.j(oVar.c(), oVar.e(), oVar.d(), oVar.f());
                                            f22 = oVar.c() + f24;
                                            f23 = oVar.e() + f25;
                                            d11 = oVar.d() + f24;
                                            f16 = oVar.f();
                                        } else if (gVar3 instanceof g.C1408g) {
                                            g.C1408g c1408g = (g.C1408g) gVar3;
                                            s0Var.r(c1408g.c(), c1408g.e(), c1408g.d(), c1408g.f());
                                            f22 = c1408g.c();
                                            f23 = c1408g.e();
                                            d11 = c1408g.d();
                                            f15 = c1408g.f();
                                        } else if (gVar3 instanceof g.q) {
                                            if (gVar2.b()) {
                                                f11 = f24 - f22;
                                                f12 = f25 - f23;
                                            } else {
                                                f11 = f21;
                                                f12 = f11;
                                            }
                                            g.q qVar = (g.q) gVar3;
                                            s0Var.j(f11, f12, qVar.c(), qVar.d());
                                            f13 = f11 + f24;
                                            f14 = f12 + f25;
                                            float c15 = qVar.c() + f24;
                                            f25 = qVar.d() + f25;
                                            f24 = c15;
                                        } else {
                                            if (gVar3 instanceof g.i) {
                                                if (gVar2.b()) {
                                                    float f32 = 2;
                                                    f24 = (f24 * f32) - f22;
                                                    f25 = (f32 * f25) - f23;
                                                }
                                                g.i iVar = (g.i) gVar3;
                                                s0Var.r(f24, f25, iVar.c(), iVar.d());
                                                float f33 = f24;
                                                f24 = iVar.c();
                                                f22 = f33;
                                                i11 = size;
                                                f7 = f21;
                                                i12 = i13;
                                                f23 = f25;
                                                gVar = gVar3;
                                                f25 = iVar.d();
                                            } else if (gVar3 instanceof g.j) {
                                                g.j jVar = (g.j) gVar3;
                                                float c16 = jVar.c() + f24;
                                                float d15 = jVar.d() + f25;
                                                gVar = gVar3;
                                                i11 = size;
                                                i12 = i13;
                                                f7 = f21;
                                                a(s0Var, f24, f25, c16, d15, jVar.e(), jVar.g(), jVar.f(), jVar.h(), jVar.i());
                                                f22 = c16;
                                                f24 = f22;
                                                f23 = d15;
                                            } else {
                                                i11 = size;
                                                f7 = f21;
                                                i12 = i13;
                                                gVar = gVar3;
                                                if (gVar instanceof g.a) {
                                                    g.a aVar = (g.a) gVar;
                                                    a(s0Var, f24, f25, aVar.c(), aVar.d(), aVar.e(), aVar.g(), aVar.f(), aVar.h(), aVar.i());
                                                    f22 = aVar.c();
                                                    f24 = f22;
                                                    f23 = aVar.d();
                                                }
                                            }
                                            i13 = i12 + 1;
                                            s0Var2 = s0Var;
                                            gVar2 = gVar;
                                            f21 = f7;
                                            size = i11;
                                            list2 = list;
                                        }
                                        i11 = size;
                                        f7 = f21;
                                        i12 = i13;
                                        gVar = gVar3;
                                        f23 = f14;
                                        f22 = f13;
                                        i13 = i12 + 1;
                                        s0Var2 = s0Var;
                                        gVar2 = gVar;
                                        f21 = f7;
                                        size = i11;
                                        list2 = list;
                                    }
                                    h11 = f19 + f25;
                                    f24 = d12;
                                    f25 = h11;
                                    i11 = size;
                                    f7 = f21;
                                    i12 = i13;
                                    gVar = gVar3;
                                    f22 = c11;
                                    f23 = e11;
                                    i13 = i12 + 1;
                                    s0Var2 = s0Var;
                                    gVar2 = gVar;
                                    f21 = f7;
                                    size = i11;
                                    list2 = list;
                                }
                                f25 = c12;
                                i11 = size;
                                f7 = f21;
                                i12 = i13;
                                gVar = gVar3;
                                i13 = i12 + 1;
                                s0Var2 = s0Var;
                                gVar2 = gVar;
                                f21 = f7;
                                size = i11;
                                list2 = list;
                            }
                            f24 = c13;
                            i11 = size;
                            f7 = f21;
                            i12 = i13;
                            gVar = gVar3;
                            i13 = i12 + 1;
                            s0Var2 = s0Var;
                            gVar2 = gVar;
                            f21 = f7;
                            size = i11;
                            list2 = list;
                        }
                        f25 = f15;
                        f24 = d11;
                        i11 = size;
                        f7 = f21;
                        i12 = i13;
                        gVar = gVar3;
                        i13 = i12 + 1;
                        s0Var2 = s0Var;
                        gVar2 = gVar;
                        f21 = f7;
                        size = i11;
                        list2 = list;
                    }
                    f15 = f16 + f25;
                    f25 = f15;
                    f24 = d11;
                    i11 = size;
                    f7 = f21;
                    i12 = i13;
                    gVar = gVar3;
                    i13 = i12 + 1;
                    s0Var2 = s0Var;
                    gVar2 = gVar;
                    f21 = f7;
                    size = i11;
                    list2 = list;
                }
                f24 = c14;
                f26 = f24;
                f25 = d13;
                f27 = f25;
                i11 = size;
                f7 = f21;
                i12 = i13;
                gVar = gVar3;
                i13 = i12 + 1;
                s0Var2 = s0Var;
                gVar2 = gVar;
                f21 = f7;
                size = i11;
                list2 = list;
            }
            f25 = f23;
            i13 = i12 + 1;
            s0Var2 = s0Var;
            gVar2 = gVar;
            f21 = f7;
            size = i11;
            list2 = list;
        }
    }
}
