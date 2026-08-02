package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class id4 extends b51 {
    public x6k A;
    public tn4 B;
    public IOException C;
    public Handler D;
    public Uri E;
    public final Uri F;
    public zc4 G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public int L;
    public long M;
    public int N;
    public h6c O;
    public u5c P;
    public final boolean h;
    public final oe4 i;
    public final z41 j;
    public final tnf k;
    public final kc5 l;
    public final it7 m;
    public final ujg n;
    public final long o;
    public final long p;
    public final b10 q;
    public final w9e r;
    public final dad s;
    public final Object t;
    public final SparseArray u;
    public final ed4 v;
    public final ed4 w;
    public final t9d x;
    public final dgb y;
    public re4 z;

    static {
        i6c.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [ed4] */
    /* JADX WARN: Type inference failed for: r2v11, types: [ed4] */
    public id4(h6c h6cVar, oe4 oe4Var, w9e w9eVar, z41 z41Var, tnf tnfVar, kc5 kc5Var, it7 it7Var, long j, long j2) {
        this.O = h6cVar;
        this.P = h6cVar.c;
        v5c v5cVar = h6cVar.b;
        v5cVar.getClass();
        Uri uri = v5cVar.a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.i = oe4Var;
        this.r = w9eVar;
        this.j = z41Var;
        this.l = kc5Var;
        this.m = it7Var;
        this.o = j;
        this.p = j2;
        this.k = tnfVar;
        this.n = new ujg(6);
        final int i = 0;
        this.h = false;
        this.q = g(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new t9d(this);
        this.M = C.TIME_UNSET;
        this.K = C.TIME_UNSET;
        this.s = new dad(this, 17);
        this.y = new j0l(this, 18);
        this.v = new Runnable(this) { // from class: ed4
            public final /* synthetic */ id4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                id4 id4Var = this.b;
                switch (i2) {
                    case 0:
                        id4Var.y();
                        break;
                    default:
                        try {
                            id4Var.w(false);
                            break;
                        } catch (Exception e) {
                            id4Var.C = new IOException(e);
                        }
                }
            }
        };
        final int i2 = 1;
        this.w = new Runnable(this) { // from class: ed4
            public final /* synthetic */ id4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                id4 id4Var = this.b;
                switch (i22) {
                    case 0:
                        id4Var.y();
                        break;
                    default:
                        try {
                            id4Var.w(false);
                            break;
                        } catch (Exception e) {
                            id4Var.C = new IOException(e);
                        }
                }
            }
        };
    }

    public static boolean s(ude udeVar) {
        List list = udeVar.c;
        for (int i = 0; i < list.size(); i++) {
            int i2 = ((ch) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vcc
    public final synchronized h6c a() {
        return this.O;
    }

    @Override // defpackage.vcc
    public final synchronized void b(h6c h6cVar) {
        this.O = h6cVar;
        this.P = h6cVar.c;
    }

    @Override // defpackage.vcc
    public final w6c c(scc sccVar, l2a l2aVar, long j) {
        int intValue = ((Integer) sccVar.a).intValue() - this.N;
        b10 g = g(sccVar);
        cc5 cc5Var = new cc5(this.d.c, 0, sccVar);
        int i = this.N + intValue;
        zc4 zc4Var = this.G;
        tn4 tn4Var = this.B;
        long j2 = this.K;
        cse cseVar = this.g;
        cseVar.getClass();
        dd4 dd4Var = new dd4(i, zc4Var, this.n, intValue, this.j, tn4Var, this.l, cc5Var, this.m, g, j2, this.y, l2aVar, this.k, this.x, cseVar);
        this.u.put(i, dd4Var);
        return dd4Var;
    }

    @Override // defpackage.vcc
    public final void f(w6c w6cVar) {
        dd4 dd4Var = (dd4) w6cVar;
        voe voeVar = dd4Var.m;
        voeVar.i = true;
        voeVar.d.removeCallbacksAndMessages(null);
        for (su2 su2Var : dd4Var.r) {
            su2Var.p(dd4Var);
        }
        dd4Var.q = null;
        this.u.remove(dd4Var.a);
    }

    @Override // defpackage.b51
    public final void m(tn4 tn4Var) {
        this.B = tn4Var;
        Looper myLooper = Looper.myLooper();
        cse cseVar = this.g;
        cseVar.getClass();
        kc5 kc5Var = this.l;
        kc5Var.c(myLooper, cseVar);
        kc5Var.a();
        if (this.h) {
            w(false);
            return;
        }
        this.z = this.i.createDataSource();
        this.A = new x6k("DashMediaSource");
        this.D = nik.q(null);
        y();
    }

    @Override // defpackage.vcc
    public final void maybeThrowSourceInfoRefreshError() {
        this.y.maybeThrowError();
    }

    @Override // defpackage.b51
    public final void p() {
        this.H = false;
        this.z = null;
        x6k x6kVar = this.A;
        if (x6kVar != null) {
            x6kVar.x(null);
            this.A = null;
        }
        u5c u5cVar = a().c;
        synchronized (this) {
            this.P = u5cVar;
        }
        this.I = 0L;
        this.J = 0L;
        this.E = this.F;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.K = C.TIME_UNSET;
        this.L = 0;
        this.M = C.TIME_UNSET;
        this.u.clear();
        ujg ujgVar = this.n;
        ((HashMap) ujgVar.b).clear();
        ((HashMap) ujgVar.c).clear();
        ((HashMap) ujgVar.d).clear();
        this.l.release();
    }

    public final void t() {
        boolean z;
        x6k x6kVar = this.A;
        sz8 sz8Var = new sz8(this, 18);
        synchronized (td4.g) {
            z = td4.h;
        }
        if (z) {
            sz8Var.w();
            return;
        }
        if (x6kVar == null) {
            x6kVar = new x6k("SntpClient");
        }
        x6kVar.y(new u8f(2), new hd4(sz8Var, 1), 1);
    }

    public final void u(x9e x9eVar, long j, long j2) {
        long j3 = x9eVar.a;
        xe4 xe4Var = x9eVar.b;
        tei teiVar = x9eVar.d;
        lfb lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
        this.m.getClass();
        this.q.u(lfbVar, x9eVar.c, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    public final void v(IOException iOException) {
        tgj.A("Failed to resolve time offset.", iOException);
        this.K = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        w(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0201 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(boolean z) {
        ude udeVar;
        long j;
        long j2;
        id4 id4Var;
        long j3;
        boolean z2;
        long j4;
        zc4 zc4Var;
        boolean z3;
        long j5;
        long j6;
        ude udeVar2;
        long j7;
        u5c u5cVar;
        int i;
        long j8;
        u5c u5cVar2;
        float f;
        long j9;
        float f2;
        u5c u5cVar3;
        boolean z4;
        jd4 b;
        long j10;
        SparseArray sparseArray;
        int i2;
        boolean z5;
        SparseArray sparseArray2;
        su2[] su2VarArr;
        ed4 ed4Var = this.w;
        long j11 = this.p;
        SparseArray sparseArray3 = this.u;
        boolean z6 = false;
        int i3 = 0;
        while (i3 < sparseArray3.size()) {
            int keyAt = sparseArray3.keyAt(i3);
            if (keyAt >= this.N) {
                dd4 dd4Var = (dd4) sparseArray3.valueAt(i3);
                zc4 zc4Var2 = this.G;
                int i4 = keyAt - this.N;
                dd4Var.u = zc4Var2;
                dd4Var.v = i4;
                voe voeVar = dd4Var.m;
                voeVar.h = z6;
                voeVar.f = zc4Var2;
                Iterator it = voeVar.e.entrySet().iterator();
                while (it.hasNext()) {
                    int i5 = i3;
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < voeVar.f.h) {
                        it.remove();
                    }
                    i3 = i5;
                }
                i2 = i3;
                su2[] su2VarArr2 = dd4Var.r;
                if (su2VarArr2 != null) {
                    int length = su2VarArr2.length;
                    int i6 = 0;
                    while (i6 < length) {
                        do4 do4Var = su2VarArr2[i6].e;
                        bo4[] bo4VarArr = do4Var.h;
                        try {
                            do4Var.j = zc4Var2;
                            do4Var.k = i4;
                            long c = zc4Var2.c(i4);
                            try {
                                ArrayList a = do4Var.a();
                                sparseArray2 = sparseArray3;
                                su2VarArr = su2VarArr2;
                                int i7 = 0;
                                while (i7 < bo4VarArr.length) {
                                    try {
                                        bo4[] bo4VarArr2 = bo4VarArr;
                                        bo4VarArr2[i7] = bo4VarArr2[i7].a(c, (ozf) a.get(do4Var.i.getIndexInTrackGroup(i7)));
                                        i7++;
                                        bo4VarArr = bo4VarArr2;
                                    } catch (xt1 e) {
                                        e = e;
                                        do4Var.l = e;
                                        i6++;
                                        sparseArray3 = sparseArray2;
                                        su2VarArr2 = su2VarArr;
                                    }
                                }
                            } catch (xt1 e2) {
                                e = e2;
                                sparseArray2 = sparseArray3;
                                su2VarArr = su2VarArr2;
                            }
                        } catch (xt1 e3) {
                            e = e3;
                            sparseArray2 = sparseArray3;
                            su2VarArr = su2VarArr2;
                        }
                        i6++;
                        sparseArray3 = sparseArray2;
                        su2VarArr2 = su2VarArr;
                    }
                    sparseArray = sparseArray3;
                    z5 = true;
                    dd4Var.q.b(dd4Var);
                } else {
                    sparseArray = sparseArray3;
                    z5 = true;
                }
                dd4Var.w = zc4Var2.a(i4).d;
                for (n66 n66Var : dd4Var.s) {
                    Iterator it2 = dd4Var.w.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            dc6 dc6Var = (dc6) it2.next();
                            if (dc6Var.a().equals(n66Var.e.a())) {
                                n66Var.a(dc6Var, (zc4Var2.d && i4 == zc4Var2.m.size() + (-1)) ? z5 : false);
                            }
                        }
                    }
                }
            } else {
                sparseArray = sparseArray3;
                i2 = i3;
            }
            i3 = i2 + 1;
            sparseArray3 = sparseArray;
            z6 = false;
        }
        int i8 = 1;
        ude a2 = this.G.a(0);
        int size = this.G.m.size() - 1;
        ude a3 = this.G.a(size);
        long c2 = this.G.c(size);
        long T = nik.T(nik.D(this.K));
        long c3 = this.G.c(0);
        long j12 = a2.b;
        List list = a2.c;
        long T2 = nik.T(j12);
        boolean s = s(a2);
        int i9 = 0;
        while (true) {
            udeVar = a2;
            if (i9 >= list.size()) {
                j = 0;
                break;
            }
            ch chVar = (ch) list.get(i9);
            j = 0;
            List list2 = chVar.c;
            int i10 = chVar.b;
            boolean z7 = (i10 == i8 || i10 == 2) ? false : true;
            if ((!s || !z7) && !list2.isEmpty()) {
                jd4 b2 = ((ozf) list2.get(0)).b();
                if (b2 != null && b2.q(c3, T) != 0) {
                    T2 = Math.max(T2, b2.getTimeUs(b2.g(c3, T)) + T2);
                }
            }
            i9++;
            i8 = 1;
            a2 = udeVar;
        }
        T2 = T2;
        long j13 = a3.b;
        List list3 = a3.c;
        long T3 = nik.T(j13);
        boolean s2 = s(a3);
        long j14 = Long.MAX_VALUE;
        int i11 = 0;
        while (true) {
            if (i11 >= list3.size()) {
                j2 = T2;
                id4Var = this;
                j3 = j14;
                break;
            }
            ch chVar2 = (ch) list3.get(i11);
            long j15 = T3;
            List list4 = chVar2.c;
            int i12 = chVar2.b;
            if (i12 != 1 && i12 != 2) {
                z4 = true;
                if ((s2 || !z4) && !list4.isEmpty()) {
                    b = ((ozf) list4.get(0)).b();
                    if (b != null) {
                        j3 = j15 + c2;
                        id4Var = this;
                        j2 = T2;
                        break;
                    }
                    long q = b.q(c2, T);
                    if (q == j) {
                        id4Var = this;
                        j2 = T2;
                        j3 = j15;
                        break;
                    } else {
                        j10 = T2;
                        long g = (b.g(c2, T) + q) - 1;
                        j14 = Math.min(j14, b.e(g, c2) + b.getTimeUs(g) + j15);
                    }
                } else {
                    j10 = T2;
                }
                i11++;
                T3 = j15;
                T2 = j10;
            }
            z4 = false;
            if (s2) {
            }
            b = ((ozf) list4.get(0)).b();
            if (b != null) {
            }
        }
        if (id4Var.G.d) {
            for (int i13 = 0; i13 < list3.size(); i13++) {
                jd4 b3 = ((ozf) ((ch) list3.get(i13)).c.get(0)).b();
                if (b3 != null && !b3.n()) {
                }
            }
            z2 = true;
            if (z2) {
                long j16 = id4Var.G.f;
                if (j16 != C.TIME_UNSET) {
                    j4 = Math.max(j2, j3 - nik.T(j16));
                    long j17 = j3 - j4;
                    zc4Var = id4Var.G;
                    if (zc4Var.d) {
                        z1a.E(zc4Var.a != C.TIME_UNSET);
                        long T4 = (T - nik.T(id4Var.G.a)) - j4;
                        u5c u5cVar4 = id4Var.a().c;
                        long h0 = nik.h0(T4);
                        j5 = -9223372036854775807L;
                        long j18 = u5cVar4.c;
                        if (j18 != C.TIME_UNSET) {
                            j8 = Math.min(h0, j18);
                        } else {
                            s5c s5cVar = id4Var.G.j;
                            if (s5cVar != null) {
                                long j19 = s5cVar.c;
                                if (j19 != C.TIME_UNSET) {
                                    j8 = Math.min(h0, j19);
                                }
                            }
                            j8 = h0;
                        }
                        long h02 = nik.h0(T4 - j17);
                        if (h02 < j && j8 > j) {
                            h02 = j;
                        }
                        boolean z8 = z2;
                        long j20 = id4Var.G.c;
                        if (j20 != C.TIME_UNSET) {
                            h02 = Math.min(h02 + j20, h0);
                        }
                        long j21 = h02;
                        long j22 = u5cVar4.b;
                        if (j22 != C.TIME_UNSET) {
                            j21 = nik.k(j22, j21, h0);
                        } else {
                            s5c s5cVar2 = id4Var.G.j;
                            if (s5cVar2 != null) {
                                long j23 = s5cVar2.b;
                                if (j23 != C.TIME_UNSET) {
                                    j21 = nik.k(j23, j21, h0);
                                }
                            }
                        }
                        long j24 = j21;
                        long j25 = j24 > j8 ? j24 : j8;
                        synchronized (this) {
                            u5cVar2 = id4Var.P;
                        }
                        long j26 = u5cVar2.a;
                        if (j26 == C.TIME_UNSET) {
                            zc4 zc4Var3 = id4Var.G;
                            s5c s5cVar3 = zc4Var3.j;
                            if (s5cVar3 != null) {
                                long j27 = s5cVar3.a;
                                if (j27 != C.TIME_UNSET) {
                                    j26 = j27;
                                }
                            }
                            j26 = zc4Var3.g;
                            if (j26 == C.TIME_UNSET) {
                                j26 = id4Var.o;
                            }
                        }
                        if (j26 < j24) {
                            j26 = j24;
                        }
                        if (j26 > j25) {
                            j26 = nik.k(nik.h0(T4 - Math.min(j11, j17 / 2)), j24, j25);
                        }
                        long j28 = j25;
                        float f3 = u5cVar4.d;
                        if (f3 == -3.4028235E38f) {
                            s5c s5cVar4 = id4Var.G.j;
                            f3 = s5cVar4 != null ? s5cVar4.d : -3.4028235E38f;
                        }
                        float f4 = u5cVar4.e;
                        if (f4 == -3.4028235E38f) {
                            s5c s5cVar5 = id4Var.G.j;
                            f4 = s5cVar5 != null ? s5cVar5.e : -3.4028235E38f;
                        }
                        if (f3 == -3.4028235E38f && f4 == -3.4028235E38f) {
                            f = f4;
                            s5c s5cVar6 = id4Var.G.j;
                            j9 = T4;
                            z3 = z8;
                            if (s5cVar6 == null || s5cVar6.a == C.TIME_UNSET) {
                                f3 = 1.0f;
                                f2 = 1.0f;
                                s5c s5cVar7 = new s5c();
                                s5cVar7.a = j26;
                                s5cVar7.b = j24;
                                s5cVar7.c = j28;
                                s5cVar7.d = f3;
                                s5cVar7.e = f2;
                                u5c u5cVar5 = new u5c(s5cVar7);
                                synchronized (this) {
                                    id4Var.P = u5cVar5;
                                }
                                long h03 = nik.h0(j4) + id4Var.G.a;
                                synchronized (this) {
                                    u5cVar3 = id4Var.P;
                                }
                                long T5 = j9 - nik.T(u5cVar3.a);
                                long min = Math.min(j11, j17 / 2);
                                j7 = T5 < min ? min : T5;
                                j6 = h03;
                                udeVar2 = udeVar;
                            }
                        } else {
                            f = f4;
                            j9 = T4;
                            z3 = z8;
                        }
                        f2 = f;
                        s5c s5cVar72 = new s5c();
                        s5cVar72.a = j26;
                        s5cVar72.b = j24;
                        s5cVar72.c = j28;
                        s5cVar72.d = f3;
                        s5cVar72.e = f2;
                        u5c u5cVar52 = new u5c(s5cVar72);
                        synchronized (this) {
                        }
                        id4Var.n(new fd4(r1, j6, r3, r6, r33, j17, j7, r0, r40, u5cVar));
                        if (id4Var.h) {
                            id4Var.D.removeCallbacks(ed4Var);
                            if (z3) {
                                Handler handler = id4Var.D;
                                zc4 zc4Var4 = id4Var.G;
                                long D = nik.D(id4Var.K);
                                int size2 = zc4Var4.m.size() - 1;
                                ude a4 = zc4Var4.a(size2);
                                long j29 = a4.b;
                                List list5 = a4.c;
                                long T6 = nik.T(j29);
                                long c4 = zc4Var4.c(size2);
                                long T7 = nik.T(D);
                                long T8 = nik.T(zc4Var4.a);
                                long T9 = nik.T(zc4Var4.e);
                                if (T9 == j5 || T9 >= 5000000) {
                                    T9 = 5000000;
                                }
                                int i14 = 0;
                                while (i14 < list5.size()) {
                                    List list6 = ((ch) list5.get(i14)).c;
                                    if (list6.isEmpty()) {
                                        i = i14;
                                    } else {
                                        i = i14;
                                        jd4 b4 = ((ozf) list6.get(0)).b();
                                        if (b4 != null) {
                                            long h = (b4.h(c4, T7) + (T8 + T6)) - T7;
                                            if (h > j && (h < T9 - 100000 || (h > T9 && h < T9 + 100000))) {
                                                T9 = h;
                                            }
                                        }
                                    }
                                    i14 = i + 1;
                                }
                                handler.postDelayed(ed4Var, i9a.x(T9, 1000L, RoundingMode.CEILING));
                            }
                            if (id4Var.H) {
                                id4Var.y();
                                return;
                            }
                            if (z) {
                                zc4 zc4Var5 = id4Var.G;
                                if (zc4Var5.d) {
                                    long j30 = zc4Var5.e;
                                    if (j30 != j5) {
                                        if (j30 == j) {
                                            j30 = 5000;
                                        }
                                        id4Var.D.postDelayed(id4Var.v, Math.max(j, (id4Var.I + j30) - SystemClock.elapsedRealtime()));
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
                    z3 = z2;
                    j5 = -9223372036854775807L;
                    j6 = -9223372036854775807L;
                    udeVar2 = udeVar;
                    j7 = j;
                    long T10 = j4 - nik.T(udeVar2.b);
                    zc4 zc4Var6 = id4Var.G;
                    long j31 = zc4Var6.a;
                    long j32 = id4Var.K;
                    int i15 = id4Var.N;
                    h6c a5 = id4Var.a();
                    if (id4Var.G.d) {
                        synchronized (this) {
                            u5cVar = id4Var.P;
                        }
                    } else {
                        u5cVar = null;
                    }
                    id4Var.n(new fd4(j31, j6, j32, i15, T10, j17, j7, zc4Var6, a5, u5cVar));
                    if (id4Var.h) {
                    }
                }
            }
            j4 = j2;
            long j172 = j3 - j4;
            zc4Var = id4Var.G;
            if (zc4Var.d) {
            }
            long T102 = j4 - nik.T(udeVar2.b);
            zc4 zc4Var62 = id4Var.G;
            long j312 = zc4Var62.a;
            long j322 = id4Var.K;
            int i152 = id4Var.N;
            h6c a52 = id4Var.a();
            if (id4Var.G.d) {
            }
            id4Var.n(new fd4(j312, j6, j322, i152, T102, j172, j7, zc4Var62, a52, u5cVar));
            if (id4Var.h) {
            }
        }
        z2 = false;
        if (z2) {
        }
        j4 = j2;
        long j1722 = j3 - j4;
        zc4Var = id4Var.G;
        if (zc4Var.d) {
        }
        long T1022 = j4 - nik.T(udeVar2.b);
        zc4 zc4Var622 = id4Var.G;
        long j3122 = zc4Var622.a;
        long j3222 = id4Var.K;
        int i1522 = id4Var.N;
        h6c a522 = id4Var.a();
        if (id4Var.G.d) {
        }
        id4Var.n(new fd4(j3122, j6, j3222, i1522, T1022, j1722, j7, zc4Var622, a522, u5cVar));
        if (id4Var.h) {
        }
    }

    public final void x(tm0 tm0Var, w9e w9eVar) {
        re4 re4Var = this.z;
        Uri parse = Uri.parse(tm0Var.c);
        Map map = Collections.EMPTY_MAP;
        z1a.y(parse, "The uri must be set.");
        this.A.y(new x9e(re4Var, new xe4(parse, 0L, 1, null, map, 0L, -1L, null, 1), 5, w9eVar), new hd4(this, 0), 1);
    }

    public final void y() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.c()) {
            return;
        }
        if (this.A.l()) {
            this.H = true;
            return;
        }
        synchronized (this.t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        z1a.y(uri, "The uri must be set.");
        x9e x9eVar = new x9e(this.z, new xe4(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, this.r);
        dad dadVar = this.s;
        this.m.getClass();
        this.A.y(x9eVar, dadVar, 3);
    }
}
