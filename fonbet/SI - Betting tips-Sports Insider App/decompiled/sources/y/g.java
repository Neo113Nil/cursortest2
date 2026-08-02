package y;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25501a = new b();

    public static boolean a(x.d dVar) {
        int[] iArr = dVar.f25320p0;
        int i5 = iArr[0];
        int i10 = iArr[1];
        x.d dVar2 = dVar.T;
        x.e eVar = dVar2 != null ? (x.e) dVar2 : null;
        if (eVar != null) {
            int i11 = eVar.f25320p0[0];
        }
        if (eVar != null) {
            int i12 = eVar.f25320p0[1];
        }
        boolean z5 = i5 == 1 || dVar.A() || i5 == 2 || (i5 == 3 && dVar.f25321r == 0 && dVar.W == 0.0f && dVar.t(0)) || (i5 == 3 && dVar.f25321r == 1 && dVar.u(0, dVar.q()));
        boolean z7 = i10 == 1 || dVar.B() || i10 == 2 || (i10 == 3 && dVar.f25322s == 0 && dVar.W == 0.0f && dVar.t(1)) || (i10 == 3 && dVar.f25322s == 1 && dVar.u(1, dVar.k()));
        return (dVar.W > 0.0f && (z5 || z7)) || (z5 && z7);
    }

    public static m b(x.d dVar, int i5, ArrayList arrayList, m mVar) {
        int i10;
        int i11 = i5 == 0 ? dVar.f25316n0 : dVar.f25318o0;
        if (i11 != -1 && (mVar == null || i11 != mVar.f25509b)) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                m mVar2 = (m) arrayList.get(i12);
                if (mVar2.f25509b == i11) {
                    if (mVar != null) {
                        mVar.c(i5, mVar2);
                        arrayList.remove(mVar);
                    }
                    mVar = mVar2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return mVar;
        }
        if (mVar == null) {
            if (dVar instanceof x.i) {
                x.i iVar = (x.i) dVar;
                int i13 = 0;
                while (true) {
                    if (i13 >= iVar.f25369r0) {
                        i10 = -1;
                        break;
                    }
                    x.d dVar2 = iVar.f25368q0[i13];
                    if ((i5 == 0 && (i10 = dVar2.f25316n0) != -1) || (i5 == 1 && (i10 = dVar2.f25318o0) != -1)) {
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            break;
                        }
                        m mVar3 = (m) arrayList.get(i14);
                        if (mVar3.f25509b == i10) {
                            mVar = mVar3;
                            break;
                        }
                        i14++;
                    }
                }
            }
            if (mVar == null) {
                mVar = new m();
                mVar.f25508a = new ArrayList();
                mVar.f25511d = null;
                mVar.f25512e = -1;
                int i15 = m.f25507f;
                m.f25507f = i15 + 1;
                mVar.f25509b = i15;
                mVar.f25510c = i5;
            }
            arrayList.add(mVar);
        }
        int i16 = mVar.f25509b;
        ArrayList arrayList2 = mVar.f25508a;
        if (arrayList2.contains(dVar)) {
            return mVar;
        }
        arrayList2.add(dVar);
        if (dVar instanceof x.h) {
            x.h hVar = (x.h) dVar;
            hVar.f25365t0.c(hVar.f25366u0 == 0 ? 1 : 0, arrayList, mVar);
        }
        if (i5 == 0) {
            dVar.f25316n0 = i16;
            dVar.I.c(i5, arrayList, mVar);
            dVar.K.c(i5, arrayList, mVar);
        } else {
            dVar.f25318o0 = i16;
            dVar.J.c(i5, arrayList, mVar);
            dVar.M.c(i5, arrayList, mVar);
            dVar.L.c(i5, arrayList, mVar);
        }
        dVar.P.c(i5, arrayList, mVar);
        return mVar;
    }

    public static void c(int i5, androidx.constraintlayout.widget.e eVar, x.d dVar, boolean z5) {
        x.c cVar;
        x.c cVar2;
        boolean z7;
        x.c cVar3;
        x.c cVar4;
        if (dVar.f25313m) {
            return;
        }
        if (!(dVar instanceof x.e) && dVar.z() && a(dVar)) {
            x.e.V(dVar, eVar, new b());
        }
        x.c i10 = dVar.i(2);
        x.c i11 = dVar.i(4);
        int d10 = i10.d();
        int d11 = i11.d();
        HashSet hashSet = i10.f25284a;
        if (hashSet != null && i10.f25286c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                x.c cVar5 = (x.c) it.next();
                x.d dVar2 = cVar5.f25287d;
                int i12 = i5 + 1;
                boolean a7 = a(dVar2);
                x.c cVar6 = dVar2.I;
                x.c cVar7 = dVar2.K;
                if (dVar2.z() && a7) {
                    z7 = true;
                    x.e.V(dVar2, eVar, new b());
                } else {
                    z7 = true;
                }
                boolean z10 = ((cVar5 == cVar6 && (cVar4 = cVar7.f25289f) != null && cVar4.f25286c) || (cVar5 == cVar7 && (cVar3 = cVar6.f25289f) != null && cVar3.f25286c)) ? z7 : false;
                int i13 = dVar2.f25320p0[0];
                if (i13 != 3 || a7) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f25289f == null) {
                            int e7 = cVar6.e() + d10;
                            dVar2.J(e7, dVar2.q() + e7);
                            c(i12, eVar, dVar2, z5);
                        } else if (cVar5 == cVar7 && cVar6.f25289f == null) {
                            int e9 = d10 - cVar7.e();
                            dVar2.J(e9 - dVar2.q(), e9);
                            c(i12, eVar, dVar2, z5);
                        } else if (z10 && !dVar2.x()) {
                            d(i12, eVar, dVar2, z5);
                        }
                    }
                } else if (i13 == 3 && dVar2.f25325v >= 0 && dVar2.f25324u >= 0 && (dVar2.f25305g0 == 8 || (dVar2.f25321r == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.x() && !dVar2.F && z10 && !dVar2.x()) {
                        e(i12, dVar, eVar, dVar2, z5);
                    }
                }
            }
        }
        if (dVar instanceof x.h) {
            return;
        }
        HashSet hashSet2 = i11.f25284a;
        if (hashSet2 != null && i11.f25286c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                x.c cVar8 = (x.c) it2.next();
                x.d dVar3 = cVar8.f25287d;
                int i14 = i5 + 1;
                boolean a10 = a(dVar3);
                x.c cVar9 = dVar3.I;
                x.c cVar10 = dVar3.K;
                if (dVar3.z() && a10) {
                    x.e.V(dVar3, eVar, new b());
                }
                boolean z11 = (cVar8 == cVar9 && (cVar2 = cVar10.f25289f) != null && cVar2.f25286c) || (cVar8 == cVar10 && (cVar = cVar9.f25289f) != null && cVar.f25286c);
                int i15 = dVar3.f25320p0[0];
                if (i15 != 3 || a10) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f25289f == null) {
                            int e10 = cVar9.e() + d11;
                            dVar3.J(e10, dVar3.q() + e10);
                            c(i14, eVar, dVar3, z5);
                        } else if (cVar8 == cVar10 && cVar9.f25289f == null) {
                            int e11 = d11 - cVar10.e();
                            dVar3.J(e11 - dVar3.q(), e11);
                            c(i14, eVar, dVar3, z5);
                        } else if (z11 && !dVar3.x()) {
                            d(i14, eVar, dVar3, z5);
                        }
                    }
                } else if (i15 == 3 && dVar3.f25325v >= 0 && dVar3.f25324u >= 0) {
                    if (dVar3.f25305g0 == 8 || (dVar3.f25321r == 0 && dVar3.W == 0.0f)) {
                        if (!dVar3.x() && !dVar3.F && z11 && !dVar3.x()) {
                            e(i14, dVar, eVar, dVar3, z5);
                        }
                    }
                }
            }
        }
        dVar.f25313m = true;
    }

    public static void d(int i5, androidx.constraintlayout.widget.e eVar, x.d dVar, boolean z5) {
        float f6 = dVar.f25300d0;
        x.c cVar = dVar.I;
        int d10 = cVar.f25289f.d();
        x.c cVar2 = dVar.K;
        int d11 = cVar2.f25289f.d();
        int e7 = cVar.e() + d10;
        int e9 = d11 - cVar2.e();
        if (d10 == d11) {
            f6 = 0.5f;
        } else {
            d10 = e7;
            d11 = e9;
        }
        int q = dVar.q();
        int i10 = (d11 - d10) - q;
        if (d10 > d11) {
            i10 = (d10 - d11) - q;
        }
        int i11 = ((int) (i10 > 0 ? (f6 * i10) + 0.5f : f6 * i10)) + d10;
        int i12 = i11 + q;
        if (d10 > d11) {
            i12 = i11 - q;
        }
        dVar.J(i11, i12);
        c(i5 + 1, eVar, dVar, z5);
    }

    public static void e(int i5, x.d dVar, androidx.constraintlayout.widget.e eVar, x.d dVar2, boolean z5) {
        float f6 = dVar2.f25300d0;
        x.c cVar = dVar2.I;
        int e7 = cVar.e() + cVar.f25289f.d();
        x.c cVar2 = dVar2.K;
        int d10 = cVar2.f25289f.d() - cVar2.e();
        if (d10 >= e7) {
            int q = dVar2.q();
            if (dVar2.f25305g0 != 8) {
                int i10 = dVar2.f25321r;
                if (i10 == 2) {
                    q = (int) (dVar2.f25300d0 * 0.5f * (dVar instanceof x.e ? dVar.q() : dVar.T.q()));
                } else if (i10 == 0) {
                    q = d10 - e7;
                }
                q = Math.max(dVar2.f25324u, q);
                int i11 = dVar2.f25325v;
                if (i11 > 0) {
                    q = Math.min(i11, q);
                }
            }
            int i12 = e7 + ((int) ((f6 * ((d10 - e7) - q)) + 0.5f));
            dVar2.J(i12, q + i12);
            c(i5 + 1, eVar, dVar2, z5);
        }
    }

    public static void f(int i5, androidx.constraintlayout.widget.e eVar, x.d dVar) {
        float f6 = dVar.e0;
        x.c cVar = dVar.J;
        int d10 = cVar.f25289f.d();
        x.c cVar2 = dVar.L;
        int d11 = cVar2.f25289f.d();
        int e7 = cVar.e() + d10;
        int e9 = d11 - cVar2.e();
        if (d10 == d11) {
            f6 = 0.5f;
        } else {
            d10 = e7;
            d11 = e9;
        }
        int k6 = dVar.k();
        int i10 = (d11 - d10) - k6;
        if (d10 > d11) {
            i10 = (d10 - d11) - k6;
        }
        int i11 = (int) (i10 > 0 ? (f6 * i10) + 0.5f : f6 * i10);
        int i12 = d10 + i11;
        int i13 = i12 + k6;
        if (d10 > d11) {
            i12 = d10 - i11;
            i13 = i12 - k6;
        }
        dVar.K(i12, i13);
        i(i5 + 1, eVar, dVar);
    }

    public static void g(int i5, x.d dVar, androidx.constraintlayout.widget.e eVar, x.d dVar2) {
        float f6 = dVar2.e0;
        x.c cVar = dVar2.J;
        int e7 = cVar.e() + cVar.f25289f.d();
        x.c cVar2 = dVar2.L;
        int d10 = cVar2.f25289f.d() - cVar2.e();
        if (d10 >= e7) {
            int k6 = dVar2.k();
            if (dVar2.f25305g0 != 8) {
                int i10 = dVar2.f25322s;
                if (i10 == 2) {
                    k6 = (int) (f6 * 0.5f * (dVar instanceof x.e ? dVar.k() : dVar.T.k()));
                } else if (i10 == 0) {
                    k6 = d10 - e7;
                }
                k6 = Math.max(dVar2.f25327x, k6);
                int i11 = dVar2.f25328y;
                if (i11 > 0) {
                    k6 = Math.min(i11, k6);
                }
            }
            int i12 = e7 + ((int) ((f6 * ((d10 - e7) - k6)) + 0.5f));
            dVar2.K(i12, k6 + i12);
            i(i5 + 1, eVar, dVar2);
        }
    }

    public static boolean h(int i5, int i10, int i11, int i12) {
        return (i11 == 1 || i11 == 2 || (i11 == 4 && i5 != 2)) || (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2));
    }

    public static void i(int i5, androidx.constraintlayout.widget.e eVar, x.d dVar) {
        x.c cVar;
        x.c cVar2;
        x.c cVar3;
        x.c cVar4;
        if (dVar.f25315n) {
            return;
        }
        if (!(dVar instanceof x.e) && dVar.z() && a(dVar)) {
            x.e.V(dVar, eVar, new b());
        }
        x.c i10 = dVar.i(3);
        x.c i11 = dVar.i(5);
        int d10 = i10.d();
        int d11 = i11.d();
        HashSet hashSet = i10.f25284a;
        if (hashSet != null && i10.f25286c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                x.c cVar5 = (x.c) it.next();
                x.d dVar2 = cVar5.f25287d;
                int i12 = i5 + 1;
                boolean a7 = a(dVar2);
                x.c cVar6 = dVar2.J;
                x.c cVar7 = dVar2.L;
                if (dVar2.z() && a7) {
                    x.e.V(dVar2, eVar, new b());
                }
                boolean z5 = (cVar5 == cVar6 && (cVar4 = cVar7.f25289f) != null && cVar4.f25286c) || (cVar5 == cVar7 && (cVar3 = cVar6.f25289f) != null && cVar3.f25286c);
                int i13 = dVar2.f25320p0[1];
                if (i13 != 3 || a7) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f25289f == null) {
                            int e7 = cVar6.e() + d10;
                            dVar2.K(e7, dVar2.k() + e7);
                            i(i12, eVar, dVar2);
                        } else if (cVar5 == cVar7 && cVar6.f25289f == null) {
                            int e9 = d10 - cVar7.e();
                            dVar2.K(e9 - dVar2.k(), e9);
                            i(i12, eVar, dVar2);
                        } else if (z5 && !dVar2.y()) {
                            f(i12, eVar, dVar2);
                        }
                    }
                } else if (i13 == 3 && dVar2.f25328y >= 0 && dVar2.f25327x >= 0 && (dVar2.f25305g0 == 8 || (dVar2.f25322s == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.y() && !dVar2.F && z5 && !dVar2.y()) {
                        g(i12, dVar, eVar, dVar2);
                    }
                }
            }
        }
        char c2 = 1;
        if (dVar instanceof x.h) {
            return;
        }
        HashSet hashSet2 = i11.f25284a;
        if (hashSet2 != null && i11.f25286c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                x.c cVar8 = (x.c) it2.next();
                x.d dVar3 = cVar8.f25287d;
                int i14 = i5 + 1;
                boolean a10 = a(dVar3);
                x.c cVar9 = dVar3.J;
                x.c cVar10 = dVar3.L;
                if (dVar3.z() && a10) {
                    x.e.V(dVar3, eVar, new b());
                }
                boolean z7 = (cVar8 == cVar9 && (cVar2 = cVar10.f25289f) != null && cVar2.f25286c) || (cVar8 == cVar10 && (cVar = cVar9.f25289f) != null && cVar.f25286c);
                int i15 = dVar3.f25320p0[1];
                if (i15 != 3 || a10) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f25289f == null) {
                            int e10 = cVar9.e() + d11;
                            dVar3.K(e10, dVar3.k() + e10);
                            i(i14, eVar, dVar3);
                        } else if (cVar8 == cVar10 && cVar9.f25289f == null) {
                            int e11 = d11 - cVar10.e();
                            dVar3.K(e11 - dVar3.k(), e11);
                            i(i14, eVar, dVar3);
                        } else if (z7 && !dVar3.y()) {
                            f(i14, eVar, dVar3);
                        }
                    }
                } else if (i15 == 3 && dVar3.f25328y >= 0 && dVar3.f25327x >= 0 && (dVar3.f25305g0 == 8 || (dVar3.f25322s == 0 && dVar3.W == 0.0f))) {
                    if (!dVar3.y() && !dVar3.F && z7 && !dVar3.y()) {
                        g(i14, dVar, eVar, dVar3);
                    }
                }
            }
        }
        x.c i16 = dVar.i(6);
        if (i16.f25284a != null && i16.f25286c) {
            int d12 = i16.d();
            Iterator it3 = i16.f25284a.iterator();
            while (it3.hasNext()) {
                x.c cVar11 = (x.c) it3.next();
                x.d dVar4 = cVar11.f25287d;
                int i17 = i5 + 1;
                boolean a11 = a(dVar4);
                x.c cVar12 = dVar4.M;
                if (dVar4.z() && a11) {
                    x.e.V(dVar4, eVar, new b());
                }
                if (dVar4.f25320p0[c2 == true ? 1 : 0] != 3 || a11) {
                    if (dVar4.z()) {
                        continue;
                    } else if (cVar11 == cVar12) {
                        int e12 = cVar11.e() + d12;
                        if (dVar4.E) {
                            int i18 = e12 - dVar4.f25294a0;
                            int i19 = dVar4.V + i18;
                            dVar4.Z = i18;
                            dVar4.J.l(i18);
                            dVar4.L.l(i19);
                            cVar12.l(e12);
                            dVar4.f25311l = c2 == true ? 1 : 0;
                        }
                        i(i17, eVar, dVar4);
                    }
                }
                c2 = 1;
            }
        }
        dVar.f25315n = true;
    }
}
