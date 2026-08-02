package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.d0;
import xsna.j0;
import yads.a30;
import yads.a33;
import yads.ae0;
import yads.an0;
import yads.an1;
import yads.b33;
import yads.bn0;
import yads.c30;
import yads.co1;
import yads.dh1;
import yads.dz2;
import yads.f30;
import yads.gd2;
import yads.gh1;
import yads.gn1;
import yads.h30;
import yads.hc0;
import yads.hh1;
import yads.i30;
import yads.in1;
import yads.io0;
import yads.ji1;
import yads.lc0;
import yads.lu;
import yads.mc3;
import yads.mi1;
import yads.mo;
import yads.mp2;
import yads.nc0;
import yads.ni;
import yads.nt2;
import yads.o30;
import yads.p30;
import yads.pk0;
import yads.qc2;
import yads.qe;
import yads.qn1;
import yads.rc2;
import yads.tk0;
import yads.v93;
import yads.vf2;
import yads.vo;
import yads.vy2;
import yads.wg1;
import yads.z23;
import yads.zb;
import yads.zf2;
import yads.zm1;
import yads.zn1;
import yads.zo;

/* loaded from: classes14.dex */
public final class i extends mo {
    public gh1 A;
    public v93 B;
    public f30 C;
    public Handler D;
    public zm1 E;
    public Uri F;
    public final Uri G;
    public boolean I;
    public long J;
    public long K;
    public int M;
    public int O;
    public final gn1 h;
    public final o30 j;
    public final a30 k;
    public final hc0 l;
    public final tk0 m;
    public final ae0 n;
    public final long p;
    public final qc2 r;
    public p30 z;
    public c30 H = null;
    public final vo o = new vo();
    public final boolean i = false;
    public final co1 q = b((zn1) null);
    public final Object t = new Object();
    public final SparseArray u = new SparseArray();
    public final c x = new c(this);
    public long N = C.TIME_UNSET;
    public long L = C.TIME_UNSET;
    public final e s = new e(this);
    public final hh1 y = new f(this);
    public final Runnable v = new d0(this, 15);
    public final Runnable w = new j0(this, 22);

    static {
        io0.a("goog.exo.dash");
    }

    public i(gn1 gn1Var, o30 o30Var, qc2 qc2Var, a30 a30Var, hc0 hc0Var, tk0 tk0Var, ae0 ae0Var, long j) {
        this.h = gn1Var;
        this.E = gn1Var.d;
        this.F = ((an1) ni.a(gn1Var.c)).a;
        this.G = gn1Var.c.a;
        this.j = o30Var;
        this.r = qc2Var;
        this.k = a30Var;
        this.m = tk0Var;
        this.n = ae0Var;
        this.p = j;
        this.l = hc0Var;
    }

    @Override // yads.mo
    public final qn1 a(zn1 zn1Var, qe qeVar, long j) {
        int intValue = ((Integer) zn1Var.a).intValue() - this.O;
        co1 co1Var = new co1(this.c.c, 0, zn1Var, ((gd2) this.H.m.get(intValue)).b);
        pk0 a = a(zn1Var);
        int i = this.O + intValue;
        c30 c30Var = this.H;
        vo voVar = this.o;
        a30 a30Var = this.k;
        v93 v93Var = this.B;
        tk0 tk0Var = this.m;
        ae0 ae0Var = this.n;
        long j2 = this.L;
        hh1 hh1Var = this.y;
        hc0 hc0Var = this.l;
        c cVar = this.x;
        zf2 zf2Var = this.g;
        if (zf2Var == null) {
            throw new IllegalStateException();
        }
        h30 h30Var = new h30(i, c30Var, voVar, intValue, a30Var, v93Var, tk0Var, a, ae0Var, co1Var, j2, hh1Var, qeVar, hc0Var, cVar, zf2Var);
        this.u.put(i, h30Var);
        return h30Var;
    }

    @Override // yads.mo
    public final gn1 c() {
        return this.h;
    }

    @Override // yads.mo
    public final void d() {
        this.y.a();
    }

    @Override // yads.mo
    public final void e() {
        this.I = false;
        this.z = null;
        gh1 gh1Var = this.A;
        if (gh1Var != null) {
            gh1Var.a((dh1) null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.H = this.i ? this.H : null;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = C.TIME_UNSET;
        this.M = 0;
        this.N = C.TIME_UNSET;
        this.O = 0;
        this.u.clear();
        vo voVar = this.o;
        voVar.a.clear();
        voVar.b.clear();
        voVar.c.clear();
        this.m.release();
    }

    public final /* synthetic */ void f() {
        a(false);
    }

    public final void g() {
        boolean z;
        gh1 gh1Var = this.A;
        a aVar = new a(this);
        synchronized (b33.b) {
            z = b33.c;
        }
        if (z) {
            aVar.a();
            return;
        }
        if (gh1Var == null) {
            gh1Var = new gh1("SntpClient");
        }
        gh1Var.a(new a33(), new z23(aVar), 1);
    }

    public final void h() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        gh1 gh1Var = this.A;
        if (gh1Var.c != null) {
            return;
        }
        if (gh1Var.b()) {
            this.I = true;
            return;
        }
        synchronized (this.t) {
            uri = this.F;
        }
        this.I = false;
        rc2 rc2Var = new rc2(this.z, uri, 4, this.r);
        this.A.a(rc2Var, this.s, this.n.a(4));
        co1 co1Var = this.q;
        Uri uri2 = rc2Var.b.a;
        co1Var.c(new wg1(), new in1(rc2Var.c, -1, null, 0, null, co1Var.a(C.TIME_UNSET), co1Var.a(C.TIME_UNSET)));
    }

    @Override // yads.mo
    public final void a(v93 v93Var) {
        this.B = v93Var;
        this.m.prepare();
        tk0 tk0Var = this.m;
        Looper myLooper = Looper.myLooper();
        zf2 zf2Var = this.g;
        if (zf2Var != null) {
            tk0Var.a(myLooper, zf2Var);
            if (this.i) {
                a(false);
                return;
            }
            this.z = this.j.createDataSource();
            this.A = new gh1("DashMediaSource");
            this.D = mc3.a((Handler.Callback) null);
            h();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // yads.mo
    public final void a(qn1 qn1Var) {
        h30 h30Var = (h30) qn1Var;
        vf2 vf2Var = h30Var.n;
        vf2Var.j = true;
        vf2Var.e.removeCallbacksAndMessages(null);
        for (lu luVar : h30Var.t) {
            luVar.s = h30Var;
            nt2 nt2Var = luVar.n;
            nt2Var.a();
            nt2Var.d();
            for (nt2 nt2Var2 : luVar.o) {
                nt2Var2.a();
                nt2Var2.d();
            }
            luVar.j.a(luVar);
        }
        h30Var.s = null;
        this.u.remove(h30Var.b);
    }

    public final void a(IOException iOException) {
        ji1.b("DashMediaSource", ji1.a("Failed to resolve time offset.", iOException));
        a(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0535, code lost:
    
        if (r8 > r22) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0538, code lost:
    
        if (r11 > 0) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x053b, code lost:
    
        if (r11 < 0) goto L257;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0421  */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32, types: [int] */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27, types: [int] */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r15v12, types: [yads.pp0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        long elapsedRealtime;
        long j;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        boolean z4;
        c30 c30Var;
        long j4;
        long j5;
        long elapsedRealtime2;
        i30 d;
        long j6;
        float f;
        float f2;
        dz2 dz2Var;
        long j7;
        boolean z5;
        boolean z6 = false;
        int i = 0;
        while (i < this.u.size()) {
            int keyAt = this.u.keyAt(i);
            if (keyAt >= this.O) {
                h30 h30Var = (h30) this.u.valueAt(i);
                c30 c30Var2 = this.H;
                int i2 = keyAt - this.O;
                h30Var.w = c30Var2;
                h30Var.x = i2;
                vf2 vf2Var = h30Var.n;
                vf2Var.i = z6;
                vf2Var.g = c30Var2;
                Iterator it = vf2Var.f.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < vf2Var.g.h) {
                        it.remove();
                    }
                }
                lu[] luVarArr = h30Var.t;
                if (luVarArr != null) {
                    int length = luVarArr.length;
                    for (?? r10 = z6; r10 < length; r10++) {
                        nc0 nc0Var = (nc0) luVarArr[r10].f;
                        nc0Var.getClass();
                        try {
                            nc0Var.j = c30Var2;
                            nc0Var.k = i2;
                            long a = mc3.a(c30Var2.b(i2));
                            ArrayList a2 = nc0Var.a();
                            for (?? r14 = z6; r14 < nc0Var.h.length; r14++) {
                                mp2 mp2Var = (mp2) a2.get(nc0Var.i.b(r14));
                                try {
                                    lc0[] lc0VarArr = nc0Var.h;
                                    lc0VarArr[r14] = lc0VarArr[r14].a(a, mp2Var);
                                } catch (zo e) {
                                    e = e;
                                    nc0Var.l = e;
                                    z6 = false;
                                }
                            }
                        } catch (zo e2) {
                            e = e2;
                        }
                        z6 = false;
                    }
                    z5 = true;
                    h30Var.s.a((vy2) h30Var);
                } else {
                    z5 = true;
                }
                h30Var.y = ((gd2) c30Var2.m.get(i2)).d;
                for (an0 an0Var : h30Var.u) {
                    Iterator it2 = h30Var.y.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            bn0 bn0Var = (bn0) it2.next();
                            String str = bn0Var.c + DomExceptionUtils.SEPARATOR + bn0Var.d;
                            bn0 bn0Var2 = an0Var.f;
                            if (str.equals(bn0Var2.c + DomExceptionUtils.SEPARATOR + bn0Var2.d)) {
                                an0Var.a(bn0Var, (c30Var2.d && i2 == c30Var2.m.size() + (-1)) ? z5 : false);
                            }
                        }
                    }
                }
            }
            i++;
            z6 = false;
        }
        int i3 = 1;
        gd2 gd2Var = (gd2) this.H.m.get(0);
        int size = this.H.m.size() - 1;
        gd2 gd2Var2 = (gd2) this.H.m.get(size);
        long a3 = mc3.a(this.H.b(size));
        long j8 = this.L;
        long j9 = C.TIME_UNSET;
        if (j8 == C.TIME_UNSET) {
            elapsedRealtime = System.currentTimeMillis();
        } else {
            elapsedRealtime = j8 + SystemClock.elapsedRealtime();
        }
        long a4 = mc3.a(elapsedRealtime);
        long a5 = mc3.a(this.H.b(0));
        long a6 = mc3.a(gd2Var.b);
        int i4 = 0;
        while (i4 < gd2Var.c.size()) {
            int i5 = ((zb) gd2Var.c.get(i4)).b;
            j = j9;
            if (i5 == i3 || i5 == 2) {
                z2 = true;
                break;
            } else {
                i4++;
                j9 = j;
                i3 = 1;
            }
        }
        j = j9;
        z2 = false;
        for (int i6 = 0; i6 < gd2Var.c.size(); i6++) {
            zb zbVar = (zb) gd2Var.c.get(i6);
            j2 = 0;
            List list = zbVar.c;
            if ((!z2 || zbVar.b != 3) && !list.isEmpty()) {
                i30 d2 = ((mp2) list.get(0)).d();
                if (d2 == null || d2.e(a5, a4) == 0) {
                    a6 = a6;
                    break;
                }
                a6 = Math.max(a6, d2.a(d2.c(a5, a4)) + a6);
            }
        }
        j2 = 0;
        long a7 = mc3.a(gd2Var2.b);
        for (int i7 = 0; i7 < gd2Var2.c.size(); i7++) {
            int i8 = ((zb) gd2Var2.c.get(i7)).b;
            if (i8 == 1 || i8 == 2) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        long j10 = Long.MAX_VALUE;
        int i9 = 0;
        while (true) {
            if (i9 >= gd2Var2.c.size()) {
                j3 = j10;
                break;
            }
            zb zbVar2 = (zb) gd2Var2.c.get(i9);
            boolean z7 = z3;
            List list2 = zbVar2.c;
            if (z7) {
                j7 = a7;
                if (zbVar2.b == 3) {
                    continue;
                    i9++;
                    z3 = z7;
                    a7 = j7;
                }
            } else {
                j7 = a7;
            }
            if (list2.isEmpty()) {
                continue;
            } else {
                i30 d3 = ((mp2) list2.get(0)).d();
                if (d3 == null) {
                    j3 = j7 + a3;
                    break;
                }
                long e3 = d3.e(a3, a4);
                if (e3 == j2) {
                    j3 = j7;
                    break;
                } else {
                    long c = (d3.c(a3, a4) + e3) - 1;
                    j10 = Math.min(j10, d3.b(c, a3) + d3.a(c) + j7);
                }
            }
            i9++;
            z3 = z7;
            a7 = j7;
        }
        if (this.H.d) {
            for (int i10 = 0; i10 < gd2Var2.c.size(); i10++) {
                i30 d4 = ((mp2) ((zb) gd2Var2.c.get(i10)).c.get(0)).d();
                if (d4 != null && !d4.a()) {
                }
            }
            z4 = true;
            if (z4) {
                long j11 = this.H.f;
                if (j11 != j) {
                    a6 = Math.max(a6, j3 - mc3.a(j11));
                }
            }
            long j12 = j3 - a6;
            c30Var = this.H;
            if (c30Var.d) {
                j4 = j;
                j5 = j2;
            } else {
                long j13 = c30Var.a;
                if (j13 != j) {
                    long a8 = (a4 - mc3.a(j13)) - a6;
                    long b = mc3.b(a8);
                    long j14 = this.h.d.d;
                    if (j14 != j) {
                        j6 = Math.min(b, j14);
                    } else {
                        dz2 dz2Var2 = this.H.j;
                        if (dz2Var2 != null) {
                            long j15 = dz2Var2.c;
                            if (j15 != j) {
                                j6 = Math.min(b, j15);
                            }
                        }
                        j6 = b;
                    }
                    long b2 = mc3.b(a8 - j12);
                    if (b2 < j2 && j6 > j2) {
                        b2 = j2;
                    }
                    long j16 = this.H.c;
                    if (j16 != j) {
                        b2 = Math.min(b2 + j16, b);
                    }
                    long j17 = this.h.d.c;
                    if (j17 != j) {
                        b2 = Math.max(b2, Math.min(j17, b));
                    } else {
                        dz2 dz2Var3 = this.H.j;
                        if (dz2Var3 != null) {
                            long j18 = dz2Var3.b;
                            if (j18 != j) {
                                b2 = Math.max(b2, Math.min(j18, b));
                            }
                        }
                    }
                    if (b2 > j6) {
                        j6 = b2;
                    }
                    long j19 = this.E.b;
                    if (j19 == j) {
                        c30 c30Var3 = this.H;
                        dz2 dz2Var4 = c30Var3.j;
                        if (dz2Var4 != null) {
                            long j20 = dz2Var4.a;
                            if (j20 != j) {
                                j19 = j20;
                            }
                        }
                        j19 = c30Var3.g;
                        if (j19 == j) {
                            j19 = this.p;
                        }
                    }
                    if (j19 < b2) {
                        j19 = b2;
                    }
                    if (j19 > j6) {
                        j19 = Math.max(b2, Math.min(mc3.b(a8 - Math.min(5000000L, j12 / 2)), j6));
                    }
                    long j21 = j19;
                    zm1 zm1Var = this.h.d;
                    float f3 = zm1Var.e;
                    if (f3 == -3.4028235E38f) {
                        dz2 dz2Var5 = this.H.j;
                        f3 = dz2Var5 != null ? dz2Var5.d : -3.4028235E38f;
                    }
                    float f4 = zm1Var.f;
                    if (f4 == -3.4028235E38f) {
                        dz2 dz2Var6 = this.H.j;
                        f4 = dz2Var6 != null ? dz2Var6.e : -3.4028235E38f;
                    }
                    if (f3 == -3.4028235E38f && f4 == -3.4028235E38f && ((dz2Var = this.H.j) == null || dz2Var.a == j)) {
                        f2 = 1.0f;
                        f = 1.0f;
                    } else {
                        f = f4;
                        f2 = f3;
                    }
                    this.E = new zm1(j21, b2, j6, f2, f);
                    long b3 = mc3.b(a6) + this.H.a;
                    long a9 = a8 - mc3.a(this.E.b);
                    long min = Math.min(5000000L, j12 / 2);
                    j5 = a9 < min ? min : a9;
                    j4 = b3;
                } else {
                    throw new IllegalStateException();
                }
            }
            long a10 = a6 - mc3.a(gd2Var.b);
            c30 c30Var4 = this.H;
            a(new b(c30Var4.a, j4, this.L, this.O, a10, j12, j5, c30Var4, this.h, !c30Var4.d ? this.E : null));
            if (this.i) {
                this.D.removeCallbacks(this.w);
                if (z4) {
                    Handler handler = this.D;
                    Runnable runnable = this.w;
                    c30 c30Var5 = this.H;
                    long j22 = this.L;
                    if (j22 == j) {
                        elapsedRealtime2 = System.currentTimeMillis();
                    } else {
                        elapsedRealtime2 = j22 + SystemClock.elapsedRealtime();
                    }
                    int size2 = c30Var5.m.size() - 1;
                    gd2 gd2Var3 = (gd2) c30Var5.m.get(size2);
                    long a11 = mc3.a(gd2Var3.b);
                    long a12 = mc3.a(c30Var5.b(size2));
                    long a13 = mc3.a(elapsedRealtime2);
                    long a14 = mc3.a(c30Var5.a);
                    long a15 = mc3.a(5000L);
                    for (int i11 = 0; i11 < gd2Var3.c.size(); i11++) {
                        List list3 = ((zb) gd2Var3.c.get(i11)).c;
                        if (!list3.isEmpty() && (d = ((mp2) list3.get(0)).d()) != null) {
                            long d5 = (d.d(a12, a13) + (a14 + a11)) - a13;
                            if (d5 < a15 - 100000 || (d5 > a15 && d5 < a15 + 100000)) {
                                a15 = d5;
                            }
                        }
                    }
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    roundingMode.getClass();
                    long j23 = a15 / 1000;
                    long j24 = a15 - (j23 * 1000);
                    if (j24 != j2) {
                        int i12 = ((int) ((a15 ^ 1000) >> 63)) | 1;
                        switch (mi1.a[roundingMode.ordinal()]) {
                            case 1:
                                if (j24 != j2) {
                                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                j23 += i12;
                                break;
                            case 5:
                                break;
                            case 6:
                            case 7:
                            case 8:
                                long abs = Math.abs(j24);
                                long abs2 = abs - (Math.abs(1000L) - abs);
                                if (abs2 == j2) {
                                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                                    break;
                                }
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                    handler.postDelayed(runnable, j23);
                }
                if (this.I) {
                    h();
                    return;
                }
                if (z) {
                    c30 c30Var6 = this.H;
                    if (c30Var6.d) {
                        long j25 = c30Var6.e;
                        if (j25 != j) {
                            this.D.postDelayed(this.v, Math.max(j2, (this.J + (j25 == j2 ? 5000L : j25)) - SystemClock.elapsedRealtime()));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        z4 = false;
        if (z4) {
        }
        long j122 = j3 - a6;
        c30Var = this.H;
        if (c30Var.d) {
        }
        long a102 = a6 - mc3.a(gd2Var.b);
        c30 c30Var42 = this.H;
        a(new b(c30Var42.a, j4, this.L, this.O, a102, j122, j5, c30Var42, this.h, !c30Var42.d ? this.E : null));
        if (this.i) {
        }
    }
}
