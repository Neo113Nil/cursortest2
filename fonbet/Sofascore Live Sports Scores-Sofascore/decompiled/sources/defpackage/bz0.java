package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bz0 extends wtc implements oma, ga5, p3h, pze, ztc, d9e, ula, a09, nd8, be8, ee8, syd, r62 {
    public vtc o;
    public HashSet p;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124 A[ORIG_RETURN, RETURN] */
    @Override // defpackage.pze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(fze fzeVar, gze gzeVar, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        vtc vtcVar = this.o;
        vtcVar.getClass();
        g7h g7hVar = ((tze) vtcVar).d;
        tze tzeVar = (tze) g7hVar.e;
        List list = fzeVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mze mzeVar = (mze) list.get(i);
            if (qea.l(mzeVar) || qea.n(mzeVar)) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!((mze) list.get(i2)).b()) {
                }
            }
            z2 = true;
            if (!tzeVar.c) {
                int size3 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size3) {
                        mze mzeVar2 = (mze) list.get(i3);
                        if (qea.l(mzeVar2) || qea.n(mzeVar2)) {
                            break;
                        } else {
                            i3++;
                        }
                    } else if (!z2) {
                        z3 = false;
                    }
                }
            }
            z3 = true;
            if (((rze) g7hVar.c) != rze.c) {
                if (gzeVar == gze.a && z3) {
                    g7hVar.d = fzeVar;
                    g7hVar.p(fzeVar, !z || tzeVar.c);
                }
                if (gzeVar == gze.b && z && fzeVar == ((fze) g7hVar.d) && tzeVar.c) {
                    int size4 = list.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        ((mze) list.get(i4)).a();
                    }
                }
                if (gzeVar == gze.c && !z3 && fzeVar != ((fze) g7hVar.d)) {
                    g7hVar.p(fzeVar, true);
                }
            }
            if (gzeVar != gze.c) {
                int size5 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size5) {
                        g7hVar.c = rze.a;
                        ((tze) g7hVar.e).c = false;
                        g7hVar.d = null;
                        break;
                    } else if (!qea.n((mze) list.get(i5))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (fzeVar == ((fze) g7hVar.d) && z) {
                    int size6 = list.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size6) {
                            break;
                        }
                        if (!((mze) list.get(i6)).b()) {
                            i6++;
                        } else if (!tzeVar.c) {
                            g7hVar.z(fzeVar);
                            return;
                        }
                    }
                    int size7 = list.size();
                    for (int i7 = 0; i7 < size7; i7++) {
                        ((mze) list.get(i7)).a();
                    }
                    return;
                }
                return;
            }
            return;
        }
        z2 = false;
        if (!tzeVar.c) {
        }
        z3 = true;
        if (((rze) g7hVar.c) != rze.c) {
        }
        if (gzeVar != gze.c) {
        }
    }

    @Override // defpackage.ga5
    public final void B0() {
        n9e.E(this);
    }

    @Override // defpackage.be8
    public final void I(zd8 zd8Var) {
        vtc vtcVar = this.o;
        r3a.b("applyFocusProperties called on wrong node");
        vtcVar.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.nd8
    public final void J(ie8 ie8Var) {
        vtc vtcVar = this.o;
        r3a.b("onFocusEvent called on wrong node");
        vtcVar.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.a09
    public final void K(dma dmaVar) {
        vtc vtcVar = this.o;
        vtcVar.getClass();
        ((cbj) vtcVar).K(dmaVar);
    }

    @Override // defpackage.pze
    public final boolean P0() {
        vtc vtcVar = this.o;
        vtcVar.getClass();
        ((tze) vtcVar).d.getClass();
        return true;
    }

    @Override // defpackage.pze
    public final void Q() {
        vtc vtcVar = this.o;
        vtcVar.getClass();
        ((tze) vtcVar).d.getClass();
    }

    @Override // defpackage.ztc
    public final dti V() {
        return dti.c;
    }

    @Override // defpackage.oma
    public final int b(tkb tkbVar, g1c g1cVar, int i) {
        vtc vtcVar = this.o;
        vtcVar.getClass();
        return ((mma) vtcVar).b(tkbVar, g1cVar, i);
    }

    @Override // defpackage.wtc
    public final void c1() {
        k1(true);
    }

    @Override // defpackage.d9e
    public final Object d(kx4 kx4Var, Object obj) {
        vtc vtcVar = this.o;
        vtcVar.getClass();
        return ((c9e) vtcVar).d(kx4Var, obj);
    }

    @Override // defpackage.wtc
    public final void d1() {
        if (!this.n) {
            r3a.b("unInitializeModifier called on unattached node");
        }
        if ((this.c & 8) != 0) {
            ((xy) c6o.d0(this)).G();
        }
    }

    @Override // defpackage.oma
    public final int e(tkb tkbVar, g1c g1cVar, int i) {
        vtc vtcVar = this.o;
        vtcVar.getClass();
        return ((mma) vtcVar).e(tkbVar, g1cVar, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [wtc] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [wtc] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [i1d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [i1d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.ztc
    public final Object g() {
        c40 c40Var;
        HashSet hashSet = this.p;
        hq3 hq3Var = upf.a;
        hashSet.add(hq3Var);
        if (!this.a.n) {
            r3a.b("visitAncestors called on an unattached node");
        }
        wtc wtcVar = this.a.e;
        wma c0 = c6o.c0(this);
        while (c0 != null) {
            if ((((wtc) c0.F.g).d & 32) != 0) {
                while (wtcVar != null) {
                    if ((wtcVar.c & 32) != 0) {
                        bw4 bw4Var = wtcVar;
                        ?? r4 = 0;
                        while (bw4Var != 0) {
                            if (bw4Var instanceof ztc) {
                                ztc ztcVar = (ztc) bw4Var;
                                if (ztcVar.V().i()) {
                                    ztcVar.V().p();
                                    throw null;
                                }
                            } else if ((bw4Var.c & 32) != 0 && (bw4Var instanceof bw4)) {
                                wtc wtcVar2 = bw4Var.p;
                                int i = 0;
                                bw4Var = bw4Var;
                                r4 = r4;
                                while (wtcVar2 != null) {
                                    if ((wtcVar2.c & 32) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            bw4Var = wtcVar2;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new i1d(new wtc[16], 0);
                                            }
                                            if (bw4Var != 0) {
                                                r4.b(bw4Var);
                                                bw4Var = 0;
                                            }
                                            r4.b(wtcVar2);
                                        }
                                    }
                                    wtcVar2 = wtcVar2.f;
                                    bw4Var = bw4Var;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            bw4Var = c6o.X(r4);
                        }
                    }
                    wtcVar = wtcVar.e;
                }
            }
            c0 = c0.v();
            wtcVar = (c0 == null || (c40Var = c0.F) == null) ? null : (hti) c40Var.f;
        }
        return hq3Var.a.invoke();
    }

    @Override // defpackage.r62
    public final ema getLayoutDirection() {
        return c6o.c0(this).z;
    }

    @Override // defpackage.oma
    public final int h(tkb tkbVar, g1c g1cVar, int i) {
        vtc vtcVar = this.o;
        vtcVar.getClass();
        return ((mma) vtcVar).h(tkbVar, g1cVar, i);
    }

    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        vtc vtcVar = this.o;
        vtcVar.getClass();
        l3h V0 = ((n3h) vtcVar).V0();
        b4hVar.getClass();
        l3h l3hVar = (l3h) b4hVar;
        x0d x0dVar = l3hVar.a;
        if (V0.c) {
            l3hVar.c = true;
        }
        if (V0.d) {
            l3hVar.d = true;
        }
        x0d x0dVar2 = V0.a;
        Object[] objArr = x0dVar2.b;
        Object[] objArr2 = x0dVar2.c;
        long[] jArr = x0dVar2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        a4h a4hVar = (a4h) obj;
                        if (!x0dVar.b(a4hVar)) {
                            x0dVar.m(a4hVar, obj2);
                        } else if (obj2 instanceof m9) {
                            Object g = x0dVar.g(a4hVar);
                            g.getClass();
                            m9 m9Var = (m9) g;
                            String str = m9Var.a;
                            if (str == null) {
                                str = ((m9) obj2).a;
                            }
                            dt8 dt8Var = m9Var.b;
                            if (dt8Var == null) {
                                dt8Var = ((m9) obj2).b;
                            }
                            x0dVar.m(a4hVar, new m9(str, dt8Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.r62
    public final kx4 j() {
        return c6o.c0(this).y;
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        vtc vtcVar = this.o;
        vtcVar.getClass();
        return ((mma) vtcVar).k(m1cVar, g1cVar, j);
    }

    public final void k1(boolean z) {
        if (!this.n) {
            r3a.b("initializeModifier called on unattached node");
        }
        vtc vtcVar = this.o;
        if ((this.c & 4) != 0 && !z) {
            c6o.a0(this, 2).l1();
        }
        if ((this.c & 2) != 0) {
            hti htiVar = (hti) c6o.c0(this).F.f;
            htiVar.getClass();
            if (htiVar.o) {
                wdd wddVar = this.h;
                wddVar.getClass();
                ((qma) wddVar).H1(this);
                qyd qydVar = wddVar.L;
                if (qydVar != null) {
                    ((q29) qydVar).c();
                }
            }
            if (!z) {
                c6o.a0(this, 2).l1();
                c6o.c0(this).E();
            }
        }
        if (vtcVar instanceof npa) {
            npa npaVar = (npa) vtcVar;
            wma c0 = c6o.c0(this);
            switch (npaVar.a) {
                case 0:
                    ((qpa) npaVar.b).j = c0;
                    break;
                case 1:
                    ((ksa) npaVar.b).l = c0;
                    break;
                default:
                    ((eoh) ((a6e) npaVar.b).w).setValue(c0);
                    break;
            }
        }
        if ((this.c & NotificationCompat.FLAG_LOCAL_ONLY) != 0 && (vtcVar instanceof cbj)) {
            hti htiVar2 = (hti) c6o.c0(this).F.f;
            htiVar2.getClass();
            if (htiVar2.o) {
                c6o.c0(this).E();
            }
        }
        int i = this.c;
        if ((i & 16) != 0 && (vtcVar instanceof tze)) {
            ((tze) vtcVar).d.b = this.h;
        }
        if ((i & 8) != 0) {
            ((xy) c6o.d0(this)).G();
        }
    }

    @Override // defpackage.xv4, defpackage.pze
    public final void l() {
        if (this.o instanceof tze) {
            y0();
        }
    }

    @Override // defpackage.oma
    public final int m(tkb tkbVar, g1c g1cVar, int i) {
        vtc vtcVar = this.o;
        vtcVar.getClass();
        return ((mma) vtcVar).m(tkbVar, g1cVar, i);
    }

    @Override // defpackage.r62
    public final long n() {
        return d7a.I(c6o.a0(this, 128).c);
    }

    @Override // defpackage.ga5
    public final void o(yma ymaVar) {
        vtc vtcVar = this.o;
        vtcVar.getClass();
        ((fa5) vtcVar).o(ymaVar);
    }

    public final String toString() {
        return this.o.toString();
    }

    @Override // defpackage.syd
    public final boolean u0() {
        return this.n;
    }

    @Override // defpackage.pze
    public final void y0() {
        vtc vtcVar = this.o;
        vtcVar.getClass();
        g7h g7hVar = ((tze) vtcVar).d;
        rze rzeVar = (rze) g7hVar.c;
        tze tzeVar = (tze) g7hVar.e;
        if (rzeVar == rze.b) {
            long uptimeMillis = SystemClock.uptimeMillis();
            sze szeVar = new sze(tzeVar, 0);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            obtain.setSource(0);
            szeVar.invoke(obtain);
            obtain.recycle();
            g7hVar.c = rze.a;
            tzeVar.c = false;
            g7hVar.d = null;
        }
    }

    @Override // defpackage.ula, defpackage.o1c
    public final void c(long j) {
    }

    @Override // defpackage.ula
    public final void q0(dma dmaVar) {
    }
}
