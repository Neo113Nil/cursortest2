package defpackage;

import android.os.Trace;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ux4 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public ux4(wma wmaVar) {
        this.a = 2;
        this.d = wmaVar;
        this.e = new hcc(7);
        this.f = new k1d(6);
        this.g = new i1d(new wma[16], 0);
        this.h = new i1d(new h1c[16], 0);
    }

    public static boolean g(wma wmaVar, an3 an3Var) {
        boolean y0;
        wma wmaVar2 = wmaVar.h;
        ana anaVar = wmaVar.G;
        if (wmaVar2 == null) {
            return false;
        }
        if (an3Var != null) {
            if (wmaVar2 != null) {
                zkb zkbVar = anaVar.q;
                zkbVar.getClass();
                y0 = zkbVar.y0(an3Var.a);
            }
            y0 = false;
        } else {
            zkb zkbVar2 = anaVar.q;
            an3 an3Var2 = zkbVar2 != null ? zkbVar2.n : null;
            if (an3Var2 != null && wmaVar2 != null) {
                zkbVar2.getClass();
                y0 = zkbVar2.y0(an3Var2.a);
            }
            y0 = false;
        }
        wma v = wmaVar.v();
        if (y0 && v != null) {
            if (v.h == null) {
                wma.V(v, false, 3);
                return y0;
            }
            if (wmaVar.t() == uma.a) {
                wma.T(v, false, 3);
                return y0;
            }
            if (wmaVar.t() == uma.b) {
                v.S(false);
            }
        }
        return y0;
    }

    public static boolean h(wma wmaVar, an3 an3Var) {
        boolean z;
        if (an3Var != null) {
            if (wmaVar.C == uma.c) {
                wmaVar.d();
            }
            z = wmaVar.G.p.y0(an3Var.a);
        } else {
            j1c j1cVar = wmaVar.G.p;
            an3 an3Var2 = j1cVar.j ? new an3(j1cVar.d) : null;
            if (an3Var2 != null) {
                if (wmaVar.C == uma.c) {
                    wmaVar.d();
                }
                z = wmaVar.G.p.y0(an3Var2.a);
            } else {
                wmaVar.getClass();
                z = false;
            }
        }
        wma v = wmaVar.v();
        if (z && v != null) {
            if (wmaVar.s() == uma.a) {
                wma.V(v, false, 3);
                return z;
            }
            if (wmaVar.s() == uma.b) {
                v.U(false);
            }
        }
        return z;
    }

    public static boolean n(wma wmaVar) {
        zkb zkbVar;
        xma xmaVar;
        if (wmaVar.G.e) {
            return (wmaVar.t() == uma.c && ((zkbVar = wmaVar.G.q) == null || (xmaVar = zkbVar.s) == null || !xmaVar.e())) ? false : true;
        }
        return false;
    }

    public static boolean o(wma wmaVar) {
        if (!wmaVar.r()) {
            return false;
        }
        do {
            if (wmaVar.s() == uma.c && !wmaVar.G.p.y.e()) {
                wma v = wmaVar.v();
                if ((v != null ? v.G.d : null) != sma.a) {
                    return false;
                }
            }
            wmaVar = wmaVar.v();
            if (wmaVar == null) {
                return false;
            }
        } while (!wmaVar.I());
        return true;
    }

    public static boolean p(wma wmaVar) {
        zkb zkbVar;
        xma xmaVar;
        ana anaVar = wmaVar.G;
        return wmaVar.I() || anaVar.p.u || o(wmaVar) || Intrinsics.c(wmaVar.J(), Boolean.TRUE) || n(wmaVar) || anaVar.p.y.e() || !((zkbVar = anaVar.q) == null || (xmaVar = zkbVar.s) == null || !xmaVar.e());
    }

    public void A(long j) {
        wma wmaVar = (wma) this.d;
        an3 an3Var = (an3) this.i;
        if (an3Var == null ? false : an3.b(an3Var.a, j)) {
            return;
        }
        if (this.b) {
            r3a.a("updateRootConstraints called while measuring");
        }
        this.i = new an3(j);
        wma wmaVar2 = wmaVar.h;
        ana anaVar = wmaVar.G;
        if (wmaVar2 != null) {
            anaVar.e = true;
        }
        anaVar.p.v = true;
        ((hcc) this.e).a(wmaVar, wmaVar2 != null ? paa.a : paa.c);
    }

    public void a(vx4 vx4Var, int i, ArrayList arrayList, y9g y9gVar) {
        v7l v7lVar = vx4Var.d;
        y9g y9gVar2 = v7lVar.c;
        vx4 vx4Var2 = v7lVar.i;
        vx4 vx4Var3 = v7lVar.h;
        if (y9gVar2 == null) {
            xm3 xm3Var = (xm3) this.d;
            if (v7lVar == xm3Var.d || v7lVar == xm3Var.e) {
                return;
            }
            if (y9gVar == null) {
                y9gVar = new y9g();
                y9gVar.a = null;
                y9gVar.b = new ArrayList();
                y9gVar.a = v7lVar;
                arrayList.add(y9gVar);
            }
            v7lVar.c = y9gVar;
            y9gVar.b.add(v7lVar);
            Iterator it = vx4Var3.k.iterator();
            while (it.hasNext()) {
                rx4 rx4Var = (rx4) it.next();
                if (rx4Var instanceof vx4) {
                    a((vx4) rx4Var, i, arrayList, y9gVar);
                }
            }
            Iterator it2 = vx4Var2.k.iterator();
            while (it2.hasNext()) {
                rx4 rx4Var2 = (rx4) it2.next();
                if (rx4Var2 instanceof vx4) {
                    a((vx4) rx4Var2, i, arrayList, y9gVar);
                }
            }
            if (i == 1 && (v7lVar instanceof uok)) {
                Iterator it3 = ((uok) v7lVar).k.k.iterator();
                while (it3.hasNext()) {
                    rx4 rx4Var3 = (rx4) it3.next();
                    if (rx4Var3 instanceof vx4) {
                        a((vx4) rx4Var3, i, arrayList, y9gVar);
                    }
                }
            }
            Iterator it4 = vx4Var3.l.iterator();
            while (it4.hasNext()) {
                a((vx4) it4.next(), i, arrayList, y9gVar);
            }
            Iterator it5 = vx4Var2.l.iterator();
            while (it5.hasNext()) {
                a((vx4) it5.next(), i, arrayList, y9gVar);
            }
            if (i == 1 && (v7lVar instanceof uok)) {
                Iterator it6 = ((uok) v7lVar).k.l.iterator();
                while (it6.hasNext()) {
                    a((vx4) it6.next(), i, arrayList, y9gVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x000a A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(xm3 xm3Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList = xm3Var.r0;
        int[] iArr = xm3Var.q0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wm3 wm3Var = (wm3) it.next();
            int[] iArr2 = wm3Var.q0;
            nl3[] nl3VarArr = wm3Var.R;
            nl3 nl3Var = wm3Var.M;
            nl3 nl3Var2 = wm3Var.K;
            nl3 nl3Var3 = wm3Var.L;
            nl3 nl3Var4 = wm3Var.J;
            int i13 = iArr2[0];
            int i14 = iArr2[1];
            if (wm3Var.h0 == 8) {
                wm3Var.a = true;
            } else {
                float f = wm3Var.x;
                if (f < 1.0f && i13 == 3) {
                    wm3Var.s = 2;
                }
                float f2 = wm3Var.A;
                if (f2 < 1.0f && i14 == 3) {
                    wm3Var.t = 2;
                }
                if (wm3Var.X > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (i13 == 3 && (i14 == 2 || i14 == 1)) {
                        wm3Var.s = 3;
                    } else if (i14 == 3 && (i13 == 2 || i13 == 1)) {
                        wm3Var.t = 3;
                    } else if (i13 == 3 && i14 == 3) {
                        if (wm3Var.s == 0) {
                            wm3Var.s = 3;
                        }
                        if (wm3Var.t == 0) {
                            wm3Var.t = 3;
                        }
                    }
                }
                if (i13 == 3 && wm3Var.s == 1 && (nl3Var4.f == null || nl3Var3.f == null)) {
                    i13 = 2;
                }
                if (i14 == 3 && wm3Var.t == 1 && (nl3Var2.f == null || nl3Var.f == null)) {
                    i14 = 2;
                }
                mf9 mf9Var = wm3Var.d;
                mf9Var.d = i13;
                int i15 = wm3Var.s;
                mf9Var.a = i15;
                uok uokVar = wm3Var.e;
                uokVar.d = i14;
                int i16 = wm3Var.t;
                uokVar.a = i16;
                if (i13 != 4 && i13 != 1) {
                    i4 = 2;
                    if (i13 != 2) {
                        if (i13 == 3) {
                            i5 = i14;
                            i6 = 1;
                        } else if (i14 != i4 && i14 != 1) {
                            i5 = i14;
                            i7 = 3;
                            i6 = 1;
                            if (i5 != i7) {
                            }
                            if (i13 == i11) {
                                if (i15 != i10) {
                                }
                                q(i9, 0, i9, 0, wm3Var);
                                wm3Var.d.e.m = wm3Var.r();
                                wm3Var.e.e.m = wm3Var.l();
                            }
                        } else if (i15 == 3) {
                            if (i14 == i4) {
                                q(i4, 0, i4, 0, wm3Var);
                            }
                            int l = wm3Var.l();
                            q(1, (int) ((l * wm3Var.X) + 0.5f), 1, l, wm3Var);
                            wm3Var.d.e.d(wm3Var.r());
                            wm3Var.e.e.d(wm3Var.l());
                            wm3Var.a = true;
                        } else {
                            int i17 = i4;
                            i6 = 1;
                            if (i15 == 1) {
                                q(i17, 0, i14, 0, wm3Var);
                                wm3Var.d.e.m = wm3Var.r();
                            } else {
                                i4 = i17;
                                i5 = i14;
                                if (i15 == 2) {
                                    int i18 = iArr[0];
                                    if (i18 == 1 || i18 == 4) {
                                        q(1, (int) ((f * xm3Var.r()) + 0.5f), i5, wm3Var.l(), wm3Var);
                                        wm3Var.d.e.d(wm3Var.r());
                                        wm3Var.e.e.d(wm3Var.l());
                                        wm3Var.a = true;
                                    }
                                } else if (nl3VarArr[0].f == null || nl3VarArr[1].f == null) {
                                    q(i4, 0, i5, 0, wm3Var);
                                    wm3Var.d.e.d(wm3Var.r());
                                    wm3Var.e.e.d(wm3Var.l());
                                    wm3Var.a = true;
                                }
                                if (i5 != i7) {
                                    if (i13 != i4 && i13 != i6) {
                                        i11 = i7;
                                        i8 = i5;
                                        i9 = i4;
                                    } else if (i16 == i7) {
                                        if (i13 == i4) {
                                            i12 = i6;
                                            q(i4, 0, i4, 0, wm3Var);
                                        } else {
                                            i12 = i6;
                                        }
                                        int r = wm3Var.r();
                                        float f3 = wm3Var.X;
                                        if (wm3Var.Y == -1) {
                                            f3 = 1.0f / f3;
                                        }
                                        q(i12, r, i12, (int) ((r * f3) + 0.5f), wm3Var);
                                        wm3Var.d.e.d(wm3Var.r());
                                        wm3Var.e.e.d(wm3Var.l());
                                        wm3Var.a = true;
                                    } else {
                                        i8 = i5;
                                        i9 = i4;
                                        if (i16 == 1) {
                                            q(i13, 0, i9, 0, wm3Var);
                                            wm3Var.e.e.m = wm3Var.l();
                                        } else if (i16 == 2) {
                                            int i19 = iArr[1];
                                            if (i19 == i6 || i19 == 4) {
                                                q(i13, wm3Var.r(), i6, (int) ((f2 * xm3Var.l()) + 0.5f), wm3Var);
                                                wm3Var.d.e.d(wm3Var.r());
                                                wm3Var.e.e.d(wm3Var.l());
                                                wm3Var.a = true;
                                            } else {
                                                i11 = 3;
                                            }
                                        } else if (nl3VarArr[2].f == null || nl3VarArr[3].f == null) {
                                            q(i9, 0, i8, 0, wm3Var);
                                            wm3Var.d.e.d(wm3Var.r());
                                            wm3Var.e.e.d(wm3Var.l());
                                            wm3Var.a = true;
                                        } else {
                                            i11 = 3;
                                        }
                                    }
                                    i10 = 1;
                                } else {
                                    i8 = i5;
                                    i9 = i4;
                                    i10 = 1;
                                    i11 = 3;
                                }
                                if (i13 == i11 && i8 == i11) {
                                    if (i15 != i10 || i16 == i10) {
                                        q(i9, 0, i9, 0, wm3Var);
                                        wm3Var.d.e.m = wm3Var.r();
                                        wm3Var.e.e.m = wm3Var.l();
                                    } else if (i16 == 2 && i15 == 2 && iArr[0] == i6 && iArr[i10] == i6) {
                                        q(i6, (int) ((f * xm3Var.r()) + 0.5f), i6, (int) ((f2 * xm3Var.l()) + 0.5f), wm3Var);
                                        wm3Var.d.e.d(wm3Var.r());
                                        wm3Var.e.e.d(wm3Var.l());
                                        wm3Var.a = true;
                                    }
                                }
                            }
                        }
                        i7 = 3;
                        if (i5 != i7) {
                        }
                        if (i13 == i11) {
                        }
                    }
                }
                if (i14 != 4) {
                    if (i14 != 1) {
                        i4 = 2;
                        if (i14 != 2) {
                            if (i13 == 3) {
                            }
                            i7 = 3;
                            if (i5 != i7) {
                            }
                            if (i13 == i11) {
                            }
                        }
                    } else {
                        i = 1;
                        int r2 = wm3Var.r();
                        if (i13 == 4) {
                            r2 = (xm3Var.r() - nl3Var4.g) - nl3Var3.g;
                            i13 = i;
                        }
                        int l2 = wm3Var.l();
                        if (i14 != 4) {
                            i2 = (xm3Var.l() - nl3Var2.g) - nl3Var.g;
                            i3 = i;
                        } else {
                            i2 = l2;
                            i3 = i14;
                        }
                        q(i13, r2, i3, i2, wm3Var);
                        wm3Var.d.e.d(wm3Var.r());
                        wm3Var.e.e.d(wm3Var.l());
                        wm3Var.a = true;
                    }
                }
                i = 1;
                int r22 = wm3Var.r();
                if (i13 == 4) {
                }
                int l22 = wm3Var.l();
                if (i14 != 4) {
                }
                q(i13, r22, i3, i2, wm3Var);
                wm3Var.d.e.d(wm3Var.r());
                wm3Var.e.e.d(wm3Var.l());
                wm3Var.a = true;
            }
        }
    }

    public void c() {
        xm3 xm3Var = (xm3) this.d;
        ArrayList arrayList = (ArrayList) this.g;
        ArrayList arrayList2 = (ArrayList) this.f;
        arrayList2.clear();
        xm3 xm3Var2 = (xm3) this.e;
        xm3Var2.d.f();
        xm3Var2.e.f();
        arrayList2.add(xm3Var2.d);
        arrayList2.add(xm3Var2.e);
        Iterator it = xm3Var2.r0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            wm3 wm3Var = (wm3) it.next();
            if (wm3Var instanceof s49) {
                t49 t49Var = new t49(wm3Var);
                wm3Var.d.f();
                wm3Var.e.f();
                t49Var.f = ((s49) wm3Var).v0;
                arrayList2.add(t49Var);
            } else {
                if (wm3Var.y()) {
                    if (wm3Var.b == null) {
                        wm3Var.b = new bn2(wm3Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(wm3Var.b);
                } else {
                    arrayList2.add(wm3Var.d);
                }
                if (wm3Var.z()) {
                    if (wm3Var.c == null) {
                        wm3Var.c = new bn2(wm3Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(wm3Var.c);
                } else {
                    arrayList2.add(wm3Var.e);
                }
                if (wm3Var instanceof t99) {
                    arrayList2.add(new s99(wm3Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((v7l) it2.next()).f();
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            v7l v7lVar = (v7l) it3.next();
            if (v7lVar.b != xm3Var2) {
                v7lVar.d();
            }
        }
        arrayList.clear();
        k(xm3Var.d, 0, arrayList);
        k(xm3Var.e, 1, arrayList);
        this.b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [i1d] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [i1d] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [wtc] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [wtc] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public void d() {
        i1d i1dVar = (i1d) this.g;
        Object[] objArr = i1dVar.a;
        int i = i1dVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            c40 c40Var = ((wma) objArr[i2]).F;
            z3a z3aVar = (z3a) c40Var.d;
            boolean g = xdd.g(4194304);
            wtc wtcVar = z3aVar.S;
            if (g || (wtcVar = wtcVar.e) != null) {
                f4g f4gVar = wdd.N;
                for (wtc g1 = z3aVar.g1(g); g1 != null && (g1.d & 4194304) != 0; g1 = g1.f) {
                    if ((g1.c & 4194304) != 0) {
                        bw4 bw4Var = g1;
                        ?? r10 = 0;
                        while (bw4Var != 0) {
                            if (bw4Var instanceof ula) {
                                ((ula) bw4Var).q0((z3a) c40Var.d);
                            } else if ((bw4Var.c & 4194304) != 0 && (bw4Var instanceof bw4)) {
                                wtc wtcVar2 = bw4Var.p;
                                int i3 = 0;
                                bw4Var = bw4Var;
                                r10 = r10;
                                while (wtcVar2 != null) {
                                    if ((wtcVar2.c & 4194304) != 0) {
                                        i3++;
                                        r10 = r10;
                                        if (i3 == 1) {
                                            bw4Var = wtcVar2;
                                        } else {
                                            if (r10 == 0) {
                                                r10 = new i1d(new wtc[16], 0);
                                            }
                                            if (bw4Var != 0) {
                                                r10.b(bw4Var);
                                                bw4Var = 0;
                                            }
                                            r10.b(wtcVar2);
                                        }
                                    }
                                    wtcVar2 = wtcVar2.f;
                                    bw4Var = bw4Var;
                                    r10 = r10;
                                }
                                if (i3 == 1) {
                                }
                            }
                            bw4Var = c6o.X(r10);
                        }
                    }
                    if (g1 != wtcVar) {
                    }
                }
            }
        }
        i1dVar.n();
    }

    public int e(xm3 xm3Var, int i) {
        ArrayList arrayList;
        int i2;
        long max;
        float f;
        xm3 xm3Var2 = xm3Var;
        ArrayList arrayList2 = (ArrayList) this.g;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long j2 = 0;
        while (i3 < size) {
            v7l v7lVar = ((y9g) arrayList2.get(i3)).a;
            if (!(v7lVar instanceof bn2) ? !(i != 0 ? (v7lVar instanceof uok) : (v7lVar instanceof mf9)) : ((bn2) v7lVar).f != i) {
                vx4 vx4Var = (i == 0 ? xm3Var2.d : xm3Var2.e).h;
                vx4 vx4Var2 = (i == 0 ? xm3Var2.d : xm3Var2.e).i;
                vx4 vx4Var3 = v7lVar.h;
                vx4 vx4Var4 = v7lVar.i;
                boolean contains = vx4Var3.l.contains(vx4Var);
                boolean contains2 = vx4Var4.l.contains(vx4Var2);
                long j3 = v7lVar.j();
                if (contains && contains2) {
                    long b = y9g.b(vx4Var3, j);
                    arrayList = arrayList2;
                    long a = y9g.a(vx4Var4, j);
                    long j4 = b - j3;
                    int i4 = vx4Var4.f;
                    i2 = i3;
                    if (j4 >= (-i4)) {
                        j4 += i4;
                    }
                    long j5 = vx4Var3.f;
                    long j6 = ((-a) - j3) - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    wm3 wm3Var = v7lVar.b;
                    if (i == 0) {
                        f = wm3Var.e0;
                    } else if (i == 1) {
                        f = wm3Var.f0;
                    } else {
                        wm3Var.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (long) ((j4 / (1.0f - f)) + (j6 / f)) : 0L;
                    max = (vx4Var3.f + ((((long) ((f2 * f) + 0.5f)) + j3) + ((long) me4.b(1.0f, f, f2, 0.5f)))) - vx4Var4.f;
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    max = contains ? Math.max(y9g.b(vx4Var3, vx4Var3.f), vx4Var3.f + j3) : contains2 ? Math.max(-y9g.a(vx4Var4, vx4Var4.f), (-vx4Var4.f) + j3) : (v7lVar.j() + vx4Var3.f) - vx4Var4.f;
                }
            } else {
                arrayList = arrayList2;
                max = j;
                i2 = i3;
            }
            j2 = Math.max(j2, max);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            xm3Var2 = xm3Var;
            j = 0;
        }
        return (int) j2;
    }

    public void f(boolean z) {
        k1d k1dVar = (k1d) this.f;
        i1d i1dVar = (i1d) k1dVar.b;
        if (z) {
            wma wmaVar = (wma) this.d;
            if (wmaVar.P > 0) {
                i1dVar.n();
                i1dVar.b(wmaVar);
                wmaVar.O = true;
            }
        }
        if (i1dVar.c != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                k1dVar.n();
                Unit unit = Unit.a;
            } finally {
                Trace.endSection();
            }
        }
    }

    public void i() {
        i1d i1dVar = (i1d) this.h;
        int i = i1dVar.c;
        if (i != 0) {
            Object[] objArr = i1dVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                h1c h1cVar = (h1c) objArr[i2];
                if (h1cVar.a.H()) {
                    boolean z = h1cVar.b;
                    wma wmaVar = h1cVar.a;
                    boolean z2 = h1cVar.c;
                    if (z) {
                        wma.T(wmaVar, z2, 2);
                    } else {
                        wma.V(wmaVar, z2, 2);
                    }
                }
            }
            i1dVar.n();
        }
    }

    public void j(wma wmaVar) {
        i1d z = wmaVar.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            wma wmaVar2 = (wma) objArr[i2];
            if (Intrinsics.c(wmaVar2.J(), Boolean.TRUE) && !wmaVar2.Q) {
                if (((hcc) this.e).N(wmaVar2)) {
                    wmaVar2.K();
                }
                j(wmaVar2);
            }
        }
    }

    public void k(v7l v7lVar, int i, ArrayList arrayList) {
        vx4 vx4Var = v7lVar.h;
        vx4 vx4Var2 = v7lVar.i;
        Iterator it = vx4Var.k.iterator();
        while (it.hasNext()) {
            rx4 rx4Var = (rx4) it.next();
            if (rx4Var instanceof vx4) {
                a((vx4) rx4Var, i, arrayList, null);
            } else if (rx4Var instanceof v7l) {
                a(((v7l) rx4Var).h, i, arrayList, null);
            }
        }
        Iterator it2 = vx4Var2.k.iterator();
        while (it2.hasNext()) {
            rx4 rx4Var2 = (rx4) it2.next();
            if (rx4Var2 instanceof vx4) {
                a((vx4) rx4Var2, i, arrayList, null);
            } else if (rx4Var2 instanceof v7l) {
                a(((v7l) rx4Var2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((uok) v7lVar).k.k.iterator();
            while (it3.hasNext()) {
                rx4 rx4Var3 = (rx4) it3.next();
                if (rx4Var3 instanceof vx4) {
                    a((vx4) rx4Var3, i, arrayList, null);
                }
            }
        }
    }

    public void l(wma wmaVar, boolean z) {
        if (!this.b) {
            r3a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? wmaVar.G.e : wmaVar.r()) {
            r3a.a("node not yet measured");
        }
        m(wmaVar, z);
    }

    public void m(wma wmaVar, boolean z) {
        zkb zkbVar;
        xma xmaVar;
        i1d z2 = wmaVar.z();
        Object[] objArr = z2.a;
        int i = z2.c;
        for (int i2 = 0; i2 < i; i2++) {
            wma wmaVar2 = (wma) objArr[i2];
            if ((!z && (wmaVar2.s() == uma.a || wmaVar2.G.p.y.e())) || (z && (wmaVar2.t() == uma.a || ((zkbVar = wmaVar2.G.q) != null && (xmaVar = zkbVar.s) != null && xmaVar.e())))) {
                boolean C = d7a.C(wmaVar2);
                ana anaVar = wmaVar2.G;
                if (C && !z) {
                    if (anaVar.e && ((hcc) this.e).N(wmaVar2)) {
                        w(wmaVar2, true);
                    } else {
                        l(wmaVar2, true);
                    }
                }
                if (z ? anaVar.e : wmaVar2.r()) {
                    w(wmaVar2, z);
                }
                if (!(z ? anaVar.e : wmaVar2.r())) {
                    m(wmaVar2, z);
                }
            }
        }
        if (z ? wmaVar.G.e : wmaVar.r()) {
            w(wmaVar, z);
        }
    }

    public void q(int i, int i2, int i3, int i4, wm3 wm3Var) {
        co1 co1Var = (co1) this.i;
        co1Var.a = i;
        co1Var.b = i3;
        co1Var.c = i2;
        co1Var.d = i4;
        ((do1) this.h).b(wm3Var, co1Var);
        wm3Var.S(co1Var.e);
        wm3Var.N(co1Var.f);
        wm3Var.F = co1Var.h;
        wm3Var.J(co1Var.g);
    }

    public boolean r(oy oyVar) {
        boolean z;
        boolean z2;
        wma wmaVar;
        boolean z3;
        boolean w;
        hcc hccVar = (hcc) this.e;
        dad dadVar = (dad) hccVar.b;
        wma wmaVar2 = (wma) this.d;
        if (!wmaVar2.H()) {
            r3a.a("performMeasureAndLayout called with unattached root");
        }
        if (!wmaVar2.I()) {
            r3a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            r3a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (((an3) this.i) != null) {
            this.b = true;
            this.c = true;
            try {
                if (hccVar.S()) {
                    z = false;
                    while (true) {
                        dad dadVar2 = (dad) hccVar.d;
                        yvh yvhVar = (yvh) dadVar2.b;
                        dad dadVar3 = (dad) hccVar.c;
                        yvh yvhVar2 = (yvh) dadVar3.b;
                        if (!((yvh) dadVar.b).isEmpty()) {
                            wmaVar = (wma) ((yvh) dadVar.b).first();
                            dadVar.z(wmaVar);
                            z3 = wmaVar.h != null;
                            z2 = false;
                        } else if (!yvhVar2.isEmpty()) {
                            wmaVar = (wma) yvhVar2.first();
                            dadVar3.z(wmaVar);
                            z3 = wmaVar.h != null;
                            z2 = true;
                        } else {
                            if (yvhVar.isEmpty()) {
                                break;
                            }
                            wma wmaVar3 = (wma) yvhVar.first();
                            dadVar2.z(wmaVar3);
                            z2 = true;
                            wmaVar = wmaVar3;
                            z3 = false;
                        }
                        if (z2) {
                            w = v(wmaVar, z3);
                        } else {
                            w = w(wmaVar, z3);
                            if (wmaVar.G.f) {
                                hccVar.a(wmaVar, paa.b);
                            }
                            if (wmaVar.q()) {
                                hccVar.a(wmaVar, paa.d);
                            }
                        }
                        if (wmaVar == wmaVar2 && w) {
                            z = true;
                        }
                    }
                    if (oyVar != null) {
                        oyVar.invoke();
                    }
                } else {
                    z = false;
                }
                this.b = false;
                this.c = false;
                z4 = z;
            } finally {
            }
        }
        d();
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:20:0x003e, B:22:0x0062, B:25:0x0078, B:27:0x0081, B:28:0x0084, B:31:0x0092, B:33:0x009a, B:34:0x009f, B:36:0x00a7, B:37:0x00aa, B:39:0x00b0, B:41:0x00b6, B:43:0x00c1, B:44:0x00ca, B:47:0x0069, B:49:0x0075), top: B:19:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:20:0x003e, B:22:0x0062, B:25:0x0078, B:27:0x0081, B:28:0x0084, B:31:0x0092, B:33:0x009a, B:34:0x009f, B:36:0x00a7, B:37:0x00aa, B:39:0x00b0, B:41:0x00b6, B:43:0x00c1, B:44:0x00ca, B:47:0x0069, B:49:0x0075), top: B:19:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:20:0x003e, B:22:0x0062, B:25:0x0078, B:27:0x0081, B:28:0x0084, B:31:0x0092, B:33:0x009a, B:34:0x009f, B:36:0x00a7, B:37:0x00aa, B:39:0x00b0, B:41:0x00b6, B:43:0x00c1, B:44:0x00ca, B:47:0x0069, B:49:0x0075), top: B:19:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1 A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:20:0x003e, B:22:0x0062, B:25:0x0078, B:27:0x0081, B:28:0x0084, B:31:0x0092, B:33:0x009a, B:34:0x009f, B:36:0x00a7, B:37:0x00aa, B:39:0x00b0, B:41:0x00b6, B:43:0x00c1, B:44:0x00ca, B:47:0x0069, B:49:0x0075), top: B:19:0x003e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(wma wmaVar, long j) {
        boolean y0;
        wma wmaVar2 = (wma) this.d;
        boolean z = wmaVar.Q;
        ana anaVar = wmaVar.G;
        if (z) {
            return;
        }
        if (wmaVar == wmaVar2) {
            r3a.a("measureAndLayout called on root");
        }
        if (!wmaVar2.H()) {
            r3a.a("performMeasureAndLayout called with unattached root");
        }
        if (!wmaVar2.I()) {
            r3a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            r3a.a("performMeasureAndLayout called during measure layout");
        }
        if (((an3) this.i) != null) {
            this.b = true;
            this.c = false;
            try {
                hcc hccVar = (hcc) this.e;
                ((dad) hccVar.b).z(wmaVar);
                ((dad) hccVar.c).z(wmaVar);
                ((dad) hccVar.d).z(wmaVar);
                if (!g(wmaVar, new an3(j))) {
                    if (anaVar.f) {
                    }
                    j(wmaVar);
                    if (wmaVar.C == uma.c) {
                        wmaVar.d();
                    }
                    y0 = anaVar.p.y0(j);
                    wma v = wmaVar.v();
                    if (y0 && v != null) {
                        if (wmaVar.s() != uma.a) {
                            wma.V(v, false, 3);
                        } else if (wmaVar.s() == uma.b) {
                            v.U(false);
                        }
                    }
                    if (wmaVar.q() && wmaVar.I()) {
                        wmaVar.R();
                        k1d k1dVar = (k1d) this.f;
                        if (wmaVar.P > 0) {
                            ((i1d) k1dVar.b).b(wmaVar);
                            wmaVar.O = true;
                        }
                    }
                    i();
                }
                if (Intrinsics.c(wmaVar.J(), Boolean.TRUE)) {
                    wmaVar.K();
                }
                j(wmaVar);
                if (wmaVar.C == uma.c) {
                }
                y0 = anaVar.p.y0(j);
                wma v2 = wmaVar.v();
                if (y0) {
                    if (wmaVar.s() != uma.a) {
                    }
                }
                if (wmaVar.q()) {
                    wmaVar.R();
                    k1d k1dVar2 = (k1d) this.f;
                    if (wmaVar.P > 0) {
                    }
                }
                i();
            } finally {
            }
        }
        d();
    }

    public void t() {
        wma wmaVar = (wma) this.d;
        hcc hccVar = (hcc) this.e;
        if (hccVar.S()) {
            if (!wmaVar.H()) {
                r3a.a("performMeasureAndLayout called with unattached root");
            }
            if (!wmaVar.I()) {
                r3a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.b) {
                r3a.a("performMeasureAndLayout called during measure layout");
            }
            if (((an3) this.i) != null) {
                this.b = true;
                this.c = false;
                try {
                    if ((((yvh) ((dad) hccVar.d).b).isEmpty() || ((yvh) ((dad) hccVar.b).b).isEmpty()) ? false : true) {
                        if (wmaVar.h != null) {
                            y(wmaVar, true);
                        } else {
                            x(wmaVar);
                        }
                    }
                    y(wmaVar, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.b = false;
                        this.c = false;
                    }
                }
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                Map map = (Map) this.i;
                Long l = (Long) this.h;
                Long l2 = (Long) this.g;
                Long l3 = (Long) this.f;
                Long l4 = (Long) this.e;
                ArrayList arrayList = new ArrayList();
                if (this.b) {
                    arrayList.add("isRegularFile");
                }
                if (this.c) {
                    arrayList.add("isDirectory");
                }
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4.longValue());
                }
                if (l3 != null) {
                    arrayList.add("createdAt=" + l3.longValue());
                }
                if (l2 != null) {
                    arrayList.add("lastModifiedAt=" + l2.longValue());
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l.longValue());
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return CollectionsKt.f0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public void u() {
        ux4 ux4Var;
        rn1 rn1Var;
        Iterator it = ((xm3) this.d).r0.iterator();
        while (it.hasNext()) {
            wm3 wm3Var = (wm3) it.next();
            if (!wm3Var.a) {
                int[] iArr = wm3Var.q0;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = wm3Var.s;
                int i4 = wm3Var.t;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                b35 b35Var = wm3Var.d.e;
                boolean z3 = b35Var.j;
                b35 b35Var2 = wm3Var.e.e;
                boolean z4 = b35Var2.j;
                boolean z5 = z2;
                if (z3 && z4) {
                    ux4Var = this;
                    ux4Var.q(1, b35Var.g, 1, b35Var2.g, wm3Var);
                    wm3Var.a = true;
                } else if (z3 && z) {
                    ux4Var = this;
                    ux4Var.q(1, b35Var.g, 2, b35Var2.g, wm3Var);
                    uok uokVar = wm3Var.e;
                    if (i2 == 3) {
                        uokVar.e.m = wm3Var.l();
                    } else {
                        uokVar.e.d(wm3Var.l());
                        wm3Var.a = true;
                    }
                } else {
                    ux4Var = this;
                    if (z4 && z5) {
                        ux4Var.q(2, b35Var.g, 1, b35Var2.g, wm3Var);
                        mf9 mf9Var = wm3Var.d;
                        if (i == 3) {
                            mf9Var.e.m = wm3Var.r();
                        } else {
                            mf9Var.e.d(wm3Var.r());
                            wm3Var.a = true;
                        }
                    }
                }
                if (wm3Var.a && (rn1Var = wm3Var.e.l) != null) {
                    rn1Var.d(wm3Var.b0);
                }
                this = ux4Var;
            }
        }
    }

    public boolean v(wma wmaVar, boolean z) {
        an3 an3Var;
        wma v;
        wma wmaVar2 = (wma) this.d;
        boolean z2 = wmaVar.Q;
        ana anaVar = wmaVar.G;
        if (!z2 && p(wmaVar)) {
            if (wmaVar == wmaVar2) {
                an3Var = (an3) this.i;
                an3Var.getClass();
            } else {
                an3Var = null;
            }
            if (z) {
                r3 = anaVar.e ? g(wmaVar, an3Var) : false;
                if ((r3 || anaVar.f) && Intrinsics.c(wmaVar.J(), Boolean.TRUE)) {
                    wmaVar.K();
                }
            } else {
                boolean h = wmaVar.r() ? h(wmaVar, an3Var) : false;
                if (wmaVar.q() && (wmaVar == wmaVar2 || ((v = wmaVar.v()) != null && v.I() && anaVar.p.u))) {
                    if (wmaVar == wmaVar2) {
                        if (wmaVar.C == uma.c) {
                            wmaVar.g();
                        }
                        wma v2 = wmaVar.v();
                        phe.h(v2 != null ? ((z3a) v2.F.d).l : ((xy) zma.a(wmaVar)).getPlacementScope(), anaVar.p, 0, 0);
                    } else {
                        wmaVar.R();
                    }
                    k1d k1dVar = (k1d) this.f;
                    if (wmaVar.P > 0) {
                        ((i1d) k1dVar.b).b(wmaVar);
                        wmaVar.O = true;
                    }
                }
                r3 = h;
            }
            i();
        }
        return r3;
    }

    public boolean w(wma wmaVar, boolean z) {
        an3 an3Var;
        boolean z2 = false;
        if (!wmaVar.Q && p(wmaVar)) {
            if (wmaVar == ((wma) this.d)) {
                an3Var = (an3) this.i;
                an3Var.getClass();
            } else {
                an3Var = null;
            }
            if (z) {
                if (wmaVar.G.e) {
                    z2 = g(wmaVar, an3Var);
                }
            } else if (wmaVar.r()) {
                z2 = h(wmaVar, an3Var);
            }
            i();
        }
        return z2;
    }

    public void x(wma wmaVar) {
        i1d z = wmaVar.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            wma wmaVar2 = (wma) objArr[i2];
            if (wmaVar2.s() == uma.a || wmaVar2.G.p.y.e()) {
                if (d7a.C(wmaVar2)) {
                    y(wmaVar2, true);
                } else {
                    x(wmaVar2);
                }
            }
        }
    }

    public void y(wma wmaVar, boolean z) {
        an3 an3Var;
        if (wmaVar.Q) {
            return;
        }
        if (wmaVar == ((wma) this.d)) {
            an3Var = (an3) this.i;
            an3Var.getClass();
        } else {
            an3Var = null;
        }
        if (z) {
            g(wmaVar, an3Var);
        } else {
            h(wmaVar, an3Var);
        }
    }

    public boolean z(wma wmaVar, boolean z) {
        int ordinal = wmaVar.G.d.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                ((i1d) this.h).b(new h1c(wmaVar, false, z));
            } else {
                if (ordinal != 4) {
                    zzl.b();
                    return false;
                }
                if (!wmaVar.r() || z) {
                    wmaVar.G.p.v = true;
                    if (!wmaVar.Q && (wmaVar.I() || o(wmaVar))) {
                        wma v = wmaVar.v();
                        if (v == null || !v.r()) {
                            ((hcc) this.e).a(wmaVar, paa.c);
                        }
                        if (!this.c) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ux4(boolean z, boolean z2, uae uaeVar, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, uaeVar, l, l2, l3, l4, r9);
        this.a = 1;
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
    }

    public ux4(xm3 xm3Var) {
        this.a = 0;
        this.b = true;
        this.c = true;
        this.f = new ArrayList();
        new ArrayList();
        this.h = null;
        this.i = new co1();
        this.g = new ArrayList();
        this.d = xm3Var;
        this.e = xm3Var;
    }

    public ux4(boolean z, boolean z2, uae uaeVar, Long l, Long l2, Long l3, Long l4, Map map) {
        this.a = 1;
        map.getClass();
        this.b = z;
        this.c = z2;
        this.d = uaeVar;
        this.e = l;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = tub.p(map);
    }
}
