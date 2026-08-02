package n2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import m2.C8043a;
import m2.d;
import m2.e;

/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8420b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<m2.e> f76293a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private a f76294b = new a();

    /* renamed from: c, reason: collision with root package name */
    private m2.f f76295c;

    /* renamed from: n2.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public e.b f76296a;

        /* renamed from: b, reason: collision with root package name */
        public e.b f76297b;

        /* renamed from: c, reason: collision with root package name */
        public int f76298c;

        /* renamed from: d, reason: collision with root package name */
        public int f76299d;

        /* renamed from: e, reason: collision with root package name */
        public int f76300e;

        /* renamed from: f, reason: collision with root package name */
        public int f76301f;

        /* renamed from: g, reason: collision with root package name */
        public int f76302g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f76303h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f76304i;

        /* renamed from: j, reason: collision with root package name */
        public int f76305j;
    }

    /* renamed from: n2.b$b, reason: collision with other inner class name */
    public interface InterfaceC1286b {
        void a();

        void b(m2.e eVar, a aVar);
    }

    public C8420b(m2.f fVar) {
        this.f76295c = fVar;
    }

    private boolean a(int i11, m2.e eVar, InterfaceC1286b interfaceC1286b) {
        e.b[] bVarArr = eVar.f74115V;
        e.b bVar = bVarArr[0];
        a aVar = this.f76294b;
        aVar.f76296a = bVar;
        aVar.f76297b = bVarArr[1];
        aVar.f76298c = eVar.N();
        aVar.f76299d = eVar.v();
        aVar.f76304i = false;
        aVar.f76305j = i11;
        e.b bVar2 = aVar.f76296a;
        e.b bVar3 = e.b.MATCH_CONSTRAINT;
        boolean z11 = bVar2 == bVar3;
        boolean z12 = aVar.f76297b == bVar3;
        boolean z13 = z11 && eVar.f74119Z > 0.0f;
        boolean z14 = z12 && eVar.f74119Z > 0.0f;
        int[] iArr = eVar.f74160u;
        if (z13 && iArr[0] == 4) {
            aVar.f76296a = e.b.FIXED;
        }
        if (z14 && iArr[1] == 4) {
            aVar.f76297b = e.b.FIXED;
        }
        interfaceC1286b.b(eVar, aVar);
        eVar.T0(aVar.f76300e);
        eVar.z0(aVar.f76301f);
        eVar.y0(aVar.f76303h);
        eVar.p0(aVar.f76302g);
        aVar.f76305j = 0;
        return aVar.f76304i;
    }

    private void b(m2.f fVar, int i11, int i12, int i13) {
        fVar.getClass();
        int D11 = fVar.D();
        int C11 = fVar.C();
        fVar.M0(0);
        fVar.L0(0);
        fVar.T0(i12);
        fVar.z0(i13);
        fVar.M0(D11);
        fVar.L0(C11);
        m2.f fVar2 = this.f76295c;
        fVar2.s1(i11);
        fVar2.Z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v28, types: [int] */
    /* JADX WARN: Type inference failed for: r13v19, types: [n2.e] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14, types: [int] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(m2.f fVar, int i11, int i12, int i13, int i14, int i15) {
        float f7;
        boolean z11;
        boolean z12;
        int i16;
        boolean z13;
        ArrayList<m2.e> arrayList;
        int i17;
        InterfaceC1286b interfaceC1286b;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i18;
        int i19;
        boolean z19;
        l lVar;
        n nVar;
        ?? r15;
        boolean z21;
        InterfaceC1286b h12 = fVar.h1();
        int size = fVar.f74253v0.size();
        int N11 = fVar.N();
        int v11 = fVar.v();
        boolean b11 = m2.k.b(i11, UserVerificationMethods.USER_VERIFY_PATTERN);
        boolean z22 = b11 || m2.k.b(i11, 64);
        if (z22) {
            for (int i21 = 0; i21 < size; i21++) {
                m2.e eVar = fVar.f74253v0.get(i21);
                f7 = 0.0f;
                e.b[] bVarArr = eVar.f74115V;
                e.b bVar = bVarArr[0];
                z11 = true;
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z23 = (bVar == bVar2) && (bVarArr[1] == bVar2) && eVar.f74119Z > 0.0f;
                if ((eVar.Y() && z23) || ((eVar.a0() && z23) || (eVar instanceof m2.m) || eVar.Y() || eVar.a0())) {
                    z22 = false;
                    break;
                }
            }
        }
        f7 = 0.0f;
        z11 = true;
        boolean z24 = z22 & (((i12 == 1073741824 && i14 == 1073741824) || b11) ? z11 : false);
        if (z24) {
            int min = Math.min(fVar.B(), i13);
            int min2 = Math.min(fVar.A(), i15);
            if (i12 == 1073741824 && fVar.N() != min) {
                fVar.T0(min);
                fVar.f74186x0.i();
            }
            if (i14 == 1073741824 && fVar.v() != min2) {
                fVar.z0(min2);
                fVar.f74186x0.i();
            }
            ?? r13 = fVar.f74186x0;
            if (i12 == 1073741824 && i14 == 1073741824) {
                z12 = r13.e(b11);
                i16 = 2;
            } else {
                r13.f();
                if (i12 == 1073741824) {
                    z21 = r13.g(0, b11);
                    r15 = z11;
                } else {
                    r15 = 0;
                    z21 = z11;
                }
                if (i14 == 1073741824) {
                    z12 = r13.g(z11, b11) & z21;
                    i16 = r15 + 1;
                } else {
                    z12 = z21;
                    i16 = r15;
                }
            }
            if (z12) {
                fVar.X0(i12 == 1073741824, i14 == 1073741824);
            }
        } else {
            z12 = false;
            i16 = 0;
        }
        if (z12 && i16 == 2) {
            return;
        }
        int i110 = fVar.i1();
        if (size > 0) {
            int size2 = fVar.f74253v0.size();
            boolean p12 = fVar.p1(64);
            InterfaceC1286b h13 = fVar.h1();
            int i22 = 0;
            while (i22 < size2) {
                m2.e eVar2 = fVar.f74253v0.get(i22);
                if ((eVar2 instanceof m2.h) || (eVar2 instanceof C8043a) || eVar2.b0() || (p12 && (lVar = eVar2.f74126d) != null && (nVar = eVar2.f74128e) != null && lVar.f76347e.f76325j && nVar.f76347e.f76325j)) {
                    z18 = z24;
                    i18 = size2;
                } else {
                    e.b t2 = eVar2.t(0);
                    e.b t11 = eVar2.t(1);
                    e.b bVar3 = e.b.MATCH_CONSTRAINT;
                    z18 = z24;
                    if (t2 == bVar3) {
                        i18 = size2;
                        i19 = 1;
                        if (eVar2.f74156s != 1 && t11 == bVar3 && eVar2.f74158t != 1) {
                            z19 = true;
                            if (!z19 && fVar.p1(i19) && !(eVar2 instanceof m2.m)) {
                                if (t2 == bVar3 && eVar2.f74156s == 0 && t11 != bVar3 && !eVar2.Y()) {
                                    z19 = true;
                                }
                                if (t11 == bVar3 && eVar2.f74158t == 0 && t2 != bVar3 && !eVar2.Y()) {
                                    z19 = true;
                                }
                                if ((t2 != bVar3 || t11 == bVar3) && eVar2.f74119Z > f7) {
                                    z19 = true;
                                }
                            }
                            if (z19) {
                                a(0, eVar2, h13);
                            }
                        }
                    } else {
                        i18 = size2;
                        i19 = 1;
                    }
                    z19 = false;
                    if (!z19) {
                        if (t2 == bVar3) {
                            z19 = true;
                        }
                        if (t11 == bVar3) {
                            z19 = true;
                        }
                        if (t2 != bVar3) {
                        }
                        z19 = true;
                    }
                    if (z19) {
                    }
                }
                i22++;
                size2 = i18;
                z24 = z18;
            }
            z13 = z24;
            h13.a();
        } else {
            z13 = z24;
        }
        d(fVar);
        ArrayList<m2.e> arrayList2 = this.f76293a;
        int size3 = arrayList2.size();
        if (size > 0) {
            b(fVar, 0, N11, v11);
        }
        if (size3 > 0) {
            e.b[] bVarArr2 = fVar.f74115V;
            e.b bVar4 = bVarArr2[0];
            e.b bVar5 = e.b.WRAP_CONTENT;
            boolean z25 = bVar4 == bVar5;
            boolean z26 = bVarArr2[1] == bVar5;
            int N12 = fVar.N();
            m2.f fVar2 = this.f76295c;
            int max = Math.max(N12, fVar2.D());
            int max2 = Math.max(fVar.v(), fVar2.C());
            int i23 = 0;
            boolean z27 = false;
            while (i23 < size3) {
                m2.e eVar3 = arrayList2.get(i23);
                if (eVar3 instanceof m2.m) {
                    int N13 = eVar3.N();
                    z14 = z26;
                    int v12 = eVar3.v();
                    z15 = z25;
                    boolean a11 = z27 | a(1, eVar3, h12);
                    int N14 = eVar3.N();
                    int v13 = eVar3.v();
                    if (N14 != N13) {
                        eVar3.T0(N14);
                        if (z15 && eVar3.G() > max) {
                            max = Math.max(max, eVar3.n(d.a.RIGHT).f() + eVar3.G());
                        }
                        z16 = true;
                    } else {
                        z16 = a11;
                    }
                    if (v13 != v12) {
                        eVar3.z0(v13);
                        if (z14 && eVar3.q() > max2) {
                            max2 = Math.max(max2, eVar3.n(d.a.BOTTOM).f() + eVar3.q());
                        }
                        z17 = true;
                    } else {
                        z17 = z16;
                    }
                    z27 = ((m2.m) eVar3).j1() | z17;
                } else {
                    z14 = z26;
                    z15 = z25;
                }
                i23++;
                z26 = z14;
                z25 = z15;
            }
            boolean z28 = z26;
            boolean z29 = z25;
            int i24 = 0;
            while (i24 < 2) {
                boolean z31 = z27;
                int i25 = 0;
                while (i25 < size3) {
                    m2.e eVar4 = arrayList2.get(i25);
                    if (((eVar4 instanceof m2.i) && !(eVar4 instanceof m2.m)) || (eVar4 instanceof m2.h) || eVar4.M() == 8 || ((z13 && eVar4.f74126d.f76347e.f76325j && eVar4.f74128e.f76347e.f76325j) || (eVar4 instanceof m2.m))) {
                        arrayList = arrayList2;
                        i17 = size3;
                        interfaceC1286b = h12;
                    } else {
                        int N15 = eVar4.N();
                        int v14 = eVar4.v();
                        arrayList = arrayList2;
                        int o11 = eVar4.o();
                        i17 = size3;
                        z31 |= a(i24 == 1 ? 2 : 1, eVar4, h12);
                        int N16 = eVar4.N();
                        interfaceC1286b = h12;
                        int v15 = eVar4.v();
                        if (N16 != N15) {
                            eVar4.T0(N16);
                            if (z29 && eVar4.G() > max) {
                                max = Math.max(max, eVar4.n(d.a.RIGHT).f() + eVar4.G());
                            }
                            z31 = true;
                        }
                        if (v15 != v14) {
                            eVar4.z0(v15);
                            if (z28 && eVar4.q() > max2) {
                                max2 = Math.max(max2, eVar4.n(d.a.BOTTOM).f() + eVar4.q());
                            }
                            z31 = true;
                        }
                        if (eVar4.Q() && o11 != eVar4.o()) {
                            z31 = true;
                        }
                    }
                    i25++;
                    size3 = i17;
                    arrayList2 = arrayList;
                    h12 = interfaceC1286b;
                }
                ArrayList<m2.e> arrayList3 = arrayList2;
                int i26 = size3;
                InterfaceC1286b interfaceC1286b2 = h12;
                if (!z31) {
                    break;
                }
                i24++;
                b(fVar, i24, N11, v11);
                size3 = i26;
                arrayList2 = arrayList3;
                h12 = interfaceC1286b2;
                z27 = false;
            }
        }
        fVar.r1(i110);
    }

    public final void d(m2.f fVar) {
        ArrayList<m2.e> arrayList = this.f76293a;
        arrayList.clear();
        int size = fVar.f74253v0.size();
        for (int i11 = 0; i11 < size; i11++) {
            m2.e eVar = fVar.f74253v0.get(i11);
            e.b[] bVarArr = eVar.f74115V;
            e.b bVar = bVarArr[0];
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 || bVarArr[1] == bVar2) {
                arrayList.add(eVar);
            }
        }
        fVar.f74186x0.i();
    }
}
