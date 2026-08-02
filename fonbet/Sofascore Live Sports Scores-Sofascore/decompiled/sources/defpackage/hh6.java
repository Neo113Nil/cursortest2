package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hh6 implements Handler.Callback, t6c, hte {
    public boolean A;
    public boolean B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public fh6 I;
    public long J;
    public int K;
    public boolean L;
    public sf6 M;
    public long N = C.TIME_UNSET;
    public final m51[] a;
    public final Set b;
    public final m51[] c;
    public final hu4 d;
    public final gtj e;
    public final xq4 f;
    public final sn4 g;
    public final yqi h;
    public final HandlerThread i;
    public final Looper j;
    public final jij k;
    public final hij l;
    public final long m;
    public final ar4 n;
    public final ArrayList o;
    public final sqi p;
    public final dg6 q;
    public final c7c r;
    public final tdc s;
    public final uq4 t;
    public c0h u;
    public eke v;
    public ch6 w;
    public boolean x;
    public boolean y;
    public boolean z;

    public hh6(m51[] m51VarArr, hu4 hu4Var, gtj gtjVar, xq4 xq4Var, sn4 sn4Var, int i, boolean z, bn4 bn4Var, c0h c0hVar, uq4 uq4Var, boolean z2, Looper looper, sqi sqiVar, dg6 dg6Var, bse bseVar) {
        this.q = dg6Var;
        this.a = m51VarArr;
        this.d = hu4Var;
        this.e = gtjVar;
        this.f = xq4Var;
        this.g = sn4Var;
        this.C = i;
        this.D = z;
        this.u = c0hVar;
        this.t = uq4Var;
        this.y = z2;
        this.p = sqiVar;
        this.m = xq4Var.f;
        eke h = eke.h(gtjVar);
        this.v = h;
        this.w = new ch6(h);
        this.c = new m51[m51VarArr.length];
        for (int i2 = 0; i2 < m51VarArr.length; i2++) {
            m51 m51Var = m51VarArr[i2];
            m51Var.d = i2;
            m51Var.e = bseVar;
            this.c[i2] = m51Var;
        }
        this.n = new ar4(this, sqiVar);
        this.o = new ArrayList();
        this.b = Collections.newSetFromMap(new IdentityHashMap());
        this.k = new jij();
        this.l = new hij();
        hu4Var.a = this;
        hu4Var.b = sn4Var;
        this.L = true;
        Handler handler = new Handler(looper);
        this.r = new c7c(bn4Var, handler);
        this.s = new tdc(this, bn4Var, handler, bseVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.j = looper2;
        this.h = sqiVar.a(looper2, this);
    }

    public static Pair E(lij lijVar, fh6 fh6Var, boolean z, int i, boolean z2, jij jijVar, hij hijVar) {
        Object F;
        lij lijVar2 = fh6Var.a;
        if (lijVar.p()) {
            return null;
        }
        lij lijVar3 = lijVar2.p() ? lijVar : lijVar2;
        try {
            Pair i2 = lijVar3.i(jijVar, hijVar, fh6Var.b, fh6Var.c);
            if (!lijVar.equals(lijVar3)) {
                if (lijVar.b(i2.first) == -1) {
                    if (!z || (F = F(jijVar, hijVar, i, z2, i2.first, lijVar3, lijVar)) == null) {
                        return null;
                    }
                    return lijVar.i(jijVar, hijVar, lijVar.g(F, hijVar).c, C.TIME_UNSET);
                }
                if (lijVar3.g(i2.first, hijVar).f && lijVar3.m(hijVar.c, jijVar, 0L).m == lijVar3.b(i2.first)) {
                    return lijVar.i(jijVar, hijVar, lijVar.g(i2.first, hijVar).c, fh6Var.c);
                }
            }
            return i2;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static Object F(jij jijVar, hij hijVar, int i, boolean z, Object obj, lij lijVar, lij lijVar2) {
        int b = lijVar.b(obj);
        int h = lijVar.h();
        int i2 = 0;
        int i3 = b;
        int i4 = -1;
        while (i2 < h && i4 == -1) {
            jij jijVar2 = jijVar;
            hij hijVar2 = hijVar;
            int i5 = i;
            boolean z2 = z;
            lij lijVar3 = lijVar;
            i3 = lijVar3.d(i3, hijVar2, jijVar2, i5, z2);
            if (i3 == -1) {
                break;
            }
            i4 = lijVar2.b(lijVar3.l(i3));
            i2++;
            lijVar = lijVar3;
            hijVar = hijVar2;
            jijVar = jijVar2;
            i = i5;
            z = z2;
        }
        if (i4 == -1) {
            return null;
        }
        return lijVar2.l(i4);
    }

    public static void L(m51 m51Var, long j) {
        m51Var.k = true;
        if (m51Var instanceof rej) {
            rej rejVar = (rej) m51Var;
            qx9.t(rejVar.k);
            rejVar.A = j;
        }
    }

    public static boolean q(m51 m51Var) {
        return m51Var.f != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        boolean z5;
        List list;
        this.h.a.removeMessages(2);
        this.M = null;
        this.A = false;
        ar4 ar4Var = this.n;
        ar4Var.c = false;
        qbc qbcVar = (qbc) ar4Var.d;
        if (qbcVar.a) {
            qbcVar.b(qbcVar.getPositionUs());
            qbcVar.a = false;
        }
        this.J = 1000000000000L;
        for (m51 m51Var : this.a) {
            try {
                c(m51Var);
            } catch (RuntimeException | sf6 e) {
                m6k.C("Disable failed.", e);
            }
        }
        if (z) {
            for (m51 m51Var2 : this.a) {
                if (this.b.remove(m51Var2)) {
                    try {
                        m51Var2.s();
                    } catch (RuntimeException e2) {
                        m6k.C("Reset failed.", e2);
                    }
                }
            }
        }
        this.H = 0;
        eke ekeVar = this.v;
        rcc rccVar = ekeVar.b;
        long j2 = ekeVar.r;
        if (!this.v.b.a()) {
            eke ekeVar2 = this.v;
            hij hijVar = this.l;
            rcc rccVar2 = ekeVar2.b;
            lij lijVar = ekeVar2.a;
            if (!lijVar.p() && !lijVar.g(rccVar2.a, hijVar).f) {
                j = this.v.r;
                if (z2) {
                    this.I = null;
                    Pair h = h(this.v.a);
                    rccVar = (rcc) h.first;
                    j2 = ((Long) h.second).longValue();
                    boolean equals = rccVar.equals(this.v.b);
                    j = C.TIME_UNSET;
                    if (!equals) {
                        z5 = true;
                        long j3 = j2;
                        rcc rccVar3 = rccVar;
                        this.r.b();
                        this.B = false;
                        eke ekeVar3 = this.v;
                        lij lijVar2 = ekeVar3.a;
                        int i = ekeVar3.e;
                        sf6 sf6Var = z4 ? null : ekeVar3.f;
                        psj psjVar = z5 ? psj.d : ekeVar3.h;
                        gtj gtjVar = z5 ? this.e : ekeVar3.i;
                        if (z5) {
                            av9 av9Var = hv9.b;
                            list = vvf.e;
                        } else {
                            list = ekeVar3.j;
                        }
                        this.v = new eke(lijVar2, rccVar3, j, j3, i, sf6Var, false, psjVar, gtjVar, list, rccVar3, ekeVar3.l, ekeVar3.m, ekeVar3.n, j3, 0L, j3, false);
                        if (z3) {
                            tdc tdcVar = this.s;
                            HashMap hashMap = (HashMap) tdcVar.e;
                            for (pdc pdcVar : hashMap.values()) {
                                try {
                                    pdcVar.a.n(pdcVar.b);
                                } catch (RuntimeException e3) {
                                    m6k.C("Failed to release child source.", e3);
                                }
                                a51 a51Var = pdcVar.a;
                                ujg ujgVar = pdcVar.c;
                                a51Var.q(ujgVar);
                                pdcVar.a.p(ujgVar);
                            }
                            hashMap.clear();
                            ((HashSet) tdcVar.f).clear();
                            tdcVar.g = false;
                            return;
                        }
                        return;
                    }
                }
                z5 = false;
                long j32 = j2;
                rcc rccVar32 = rccVar;
                this.r.b();
                this.B = false;
                eke ekeVar32 = this.v;
                lij lijVar22 = ekeVar32.a;
                int i2 = ekeVar32.e;
                if (z4) {
                }
                psj psjVar2 = z5 ? psj.d : ekeVar32.h;
                gtj gtjVar2 = z5 ? this.e : ekeVar32.i;
                if (z5) {
                }
                this.v = new eke(lijVar22, rccVar32, j, j32, i2, sf6Var, false, psjVar2, gtjVar2, list, rccVar32, ekeVar32.l, ekeVar32.m, ekeVar32.n, j32, 0L, j32, false);
                if (z3) {
                }
            }
        }
        j = this.v.c;
        if (z2) {
        }
        z5 = false;
        long j322 = j2;
        rcc rccVar322 = rccVar;
        this.r.b();
        this.B = false;
        eke ekeVar322 = this.v;
        lij lijVar222 = ekeVar322.a;
        int i22 = ekeVar322.e;
        if (z4) {
        }
        psj psjVar22 = z5 ? psj.d : ekeVar322.h;
        gtj gtjVar22 = z5 ? this.e : ekeVar322.i;
        if (z5) {
        }
        this.v = new eke(lijVar222, rccVar322, j, j322, i22, sf6Var, false, psjVar22, gtjVar22, list, rccVar322, ekeVar322.l, ekeVar322.m, ekeVar322.n, j322, 0L, j322, false);
        if (z3) {
        }
    }

    public final void B() {
        x6c x6cVar = this.r.h;
        this.z = x6cVar != null && x6cVar.f.h && this.y;
    }

    public final void C(long j) {
        x6c x6cVar = this.r.h;
        long j2 = j + (x6cVar == null ? 1000000000000L : x6cVar.o);
        this.J = j2;
        ((qbc) this.n.d).b(j2);
        for (m51 m51Var : this.a) {
            if (q(m51Var)) {
                long j3 = this.J;
                m51Var.k = false;
                m51Var.j = j3;
                m51Var.k(j3, false);
            }
        }
        for (x6c x6cVar2 = r0.h; x6cVar2 != null; x6cVar2 = x6cVar2.l) {
            for (mh6 mh6Var : (mh6[]) x6cVar2.n.e) {
                if (mh6Var != null) {
                    mh6Var.a();
                }
            }
        }
    }

    public final void D(lij lijVar, lij lijVar2) {
        if (lijVar.p() && lijVar2.p()) {
            return;
        }
        ArrayList arrayList = this.o;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            wt3.z(arrayList.get(size));
            throw null;
        }
    }

    public final void G(boolean z) {
        rcc rccVar = this.r.h.f.a;
        long I = I(rccVar, this.v.r, true, false);
        if (I != this.v.r) {
            eke ekeVar = this.v;
            this.v = o(rccVar, I, ekeVar.c, ekeVar.d, z, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:20|(7:(9:64|65|(1:83)(1:71)|72|(1:82)|79|80|11|12)(1:22)|42|43|44|10|11|12)|23|24|(1:26)(1:60)|27|(1:29)(1:59)|30|31|32|(1:34)(1:57)|35|36|37|38|39|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0152, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0153, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0154, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0156, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0158, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a1 A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:6:0x0097, B:8:0x00a1, B:16:0x00af, B:18:0x00b3, B:19:0x00b6, B:20:0x00be, B:67:0x00cc, B:71:0x00d4), top: B:5:0x0097 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(fh6 fh6Var) {
        long longValue;
        rcc m;
        long j;
        boolean z;
        long j2;
        boolean z2;
        rcc rccVar;
        long j3;
        long a;
        long j4;
        eke ekeVar;
        int i;
        long j5;
        boolean z3;
        rcc rccVar2;
        int i2;
        long j6;
        long I;
        boolean z4;
        eke ekeVar2;
        rcc rccVar3;
        lij lijVar;
        long j7;
        hh6 hh6Var = this;
        hh6Var.w.a(1);
        Pair E = E(hh6Var.v.a, fh6Var, true, hh6Var.C, hh6Var.D, hh6Var.k, hh6Var.l);
        try {
            if (E == null) {
                Pair h = hh6Var.h(hh6Var.v.a);
                m = (rcc) h.first;
                longValue = ((Long) h.second).longValue();
                z = !hh6Var.v.a.p();
                j2 = -9223372036854775807L;
            } else {
                Object obj = E.first;
                longValue = ((Long) E.second).longValue();
                long j8 = fh6Var.c == C.TIME_UNSET ? -9223372036854775807L : longValue;
                m = hh6Var.r.m(hh6Var.v.a, obj, longValue);
                if (!m.a()) {
                    j = 0;
                    z = fh6Var.c == C.TIME_UNSET;
                    j2 = j8;
                    if (hh6Var.v.a.p()) {
                        eke ekeVar3 = hh6Var.v;
                        if (E == null) {
                            if (ekeVar3.e != 1) {
                                hh6Var.V(4);
                            }
                            hh6Var.A(false, true, false, true);
                        } else {
                            try {
                                if (m.equals(ekeVar3.b)) {
                                    try {
                                        x6c x6cVar = hh6Var.r.h;
                                        a = (x6cVar == null || !x6cVar.d || longValue == j) ? longValue : x6cVar.a.a(longValue, hh6Var.u);
                                        if (lik.F(a) != lik.F(hh6Var.v.r) || ((i = (ekeVar = hh6Var.v).e) != 2 && i != 3)) {
                                            z2 = z;
                                            j4 = j2;
                                            rccVar = m;
                                        }
                                        j5 = ekeVar.r;
                                        z3 = z;
                                        rccVar2 = m;
                                        i2 = 2;
                                        j6 = j5;
                                        hh6Var.v = hh6Var.o(rccVar2, j5, j2, j6, z3, i2);
                                        return;
                                    } catch (Throwable th) {
                                        th = th;
                                        z2 = z;
                                        rccVar = m;
                                        j3 = longValue;
                                        hh6Var.v = hh6Var.o(rccVar, j3, j2, j3, z2, 2);
                                        throw th;
                                    }
                                }
                                z2 = z;
                                j4 = j2;
                                rccVar = m;
                                a = longValue;
                                hh6Var.e0(lijVar, rccVar3, lijVar, ekeVar2.b, j7);
                                rccVar2 = rccVar3;
                                j2 = j7;
                                z3 = z4;
                                j5 = I;
                                i2 = 2;
                                j6 = j5;
                                hh6Var = this;
                                hh6Var.v = hh6Var.o(rccVar2, j5, j2, j6, z3, i2);
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                rccVar = rccVar3;
                                j2 = j7;
                                z2 = z4;
                                j3 = I;
                                hh6Var.v = hh6Var.o(rccVar, j3, j2, j3, z2, 2);
                                throw th;
                            }
                            boolean z5 = hh6Var.v.e == 4;
                            c7c c7cVar = hh6Var.r;
                            I = hh6Var.I(rccVar, a, c7cVar.h != c7cVar.i, z5);
                            z4 = z2 | (longValue != I);
                            ekeVar2 = hh6Var.v;
                            rccVar3 = rccVar;
                            lijVar = ekeVar2.a;
                            j7 = j4;
                        }
                    } else {
                        hh6Var.I = fh6Var;
                    }
                    z3 = z;
                    rccVar2 = m;
                    j5 = longValue;
                    i2 = 2;
                    j6 = j5;
                    hh6Var = this;
                    hh6Var.v = hh6Var.o(rccVar2, j5, j2, j6, z3, i2);
                    return;
                }
                hh6Var.v.a.g(m.a, hh6Var.l);
                longValue = hh6Var.l.f(m.b) == m.c ? hh6Var.l.g.b : 0L;
                z = true;
                j2 = j8;
            }
            if (hh6Var.v.a.p()) {
            }
            z3 = z;
            rccVar2 = m;
            j5 = longValue;
            i2 = 2;
            j6 = j5;
            hh6Var = this;
            hh6Var.v = hh6Var.o(rccVar2, j5, j2, j6, z3, i2);
            return;
        } catch (Throwable th3) {
            th = th3;
            z2 = z;
        }
        j = 0;
    }

    public final long I(rcc rccVar, long j, boolean z, boolean z2) {
        a0();
        this.A = false;
        if (z2 || this.v.e == 3) {
            V(2);
        }
        c7c c7cVar = this.r;
        x6c x6cVar = c7cVar.h;
        x6c x6cVar2 = x6cVar;
        while (x6cVar2 != null && !rccVar.equals(x6cVar2.f.a)) {
            x6cVar2 = x6cVar2.l;
        }
        if (z || x6cVar != x6cVar2 || (x6cVar2 != null && x6cVar2.o + j < 0)) {
            m51[] m51VarArr = this.a;
            for (m51 m51Var : m51VarArr) {
                c(m51Var);
            }
            if (x6cVar2 != null) {
                while (c7cVar.h != x6cVar2) {
                    c7cVar.a();
                }
                c7cVar.k(x6cVar2);
                x6cVar2.o = 1000000000000L;
                f(new boolean[m51VarArr.length]);
            }
        }
        if (x6cVar2 != null) {
            v6c v6cVar = x6cVar2.a;
            c7cVar.k(x6cVar2);
            if (!x6cVar2.d) {
                x6cVar2.f = x6cVar2.f.b(j);
            } else if (x6cVar2.e) {
                j = v6cVar.seekToUs(j);
                v6cVar.e(j - this.m);
            }
            C(j);
            s();
        } else {
            c7cVar.b();
            C(j);
        }
        k(false);
        this.h.c(2);
        return j;
    }

    public final void J(kte kteVar) {
        yqi yqiVar = this.h;
        if (kteVar.f != this.j) {
            yqiVar.a(15, kteVar).b();
            return;
        }
        synchronized (kteVar) {
        }
        try {
            kteVar.a.handleMessage(kteVar.d, kteVar.e);
            kteVar.b(true);
            int i = this.v.e;
            if (i == 3 || i == 2) {
                yqiVar.c(2);
            }
        } catch (Throwable th) {
            kteVar.b(true);
            throw th;
        }
    }

    public final void K(kte kteVar) {
        Looper looper = kteVar.f;
        if (!looper.getThread().isAlive()) {
            m6k.f0();
            kteVar.b(false);
        } else {
            yqi a = this.p.a(looper, null);
            a.a.post(new wb3(this, kteVar, 22));
        }
    }

    public final void M(boolean z, AtomicBoolean atomicBoolean) {
        if (this.E != z) {
            this.E = z;
            if (!z) {
                for (m51 m51Var : this.a) {
                    if (!q(m51Var) && this.b.remove(m51Var)) {
                        m51Var.s();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void N(ah6 ah6Var) {
        this.w.a(1);
        int i = ah6Var.c;
        xfh xfhVar = ah6Var.b;
        ArrayList arrayList = ah6Var.a;
        if (i != -1) {
            this.I = new fh6(new rye(arrayList, xfhVar), ah6Var.c, ah6Var.d);
        }
        tdc tdcVar = this.s;
        ArrayList arrayList2 = (ArrayList) tdcVar.b;
        tdcVar.m(0, arrayList2.size());
        l(tdcVar.a(arrayList2.size(), arrayList, xfhVar), false);
    }

    public final void O(boolean z) {
        if (z == this.G) {
            return;
        }
        this.G = z;
        if (z || !this.v.o) {
            return;
        }
        this.h.c(2);
    }

    public final void P(boolean z) {
        this.y = z;
        B();
        if (this.z) {
            c7c c7cVar = this.r;
            if (c7cVar.i != c7cVar.h) {
                G(true);
                k(false);
            }
        }
    }

    public final void Q(int i, int i2, boolean z, boolean z2) {
        this.w.a(z2 ? 1 : 0);
        ch6 ch6Var = this.w;
        ch6Var.a = true;
        ch6Var.f = true;
        ch6Var.g = i2;
        this.v = this.v.c(i, z);
        this.A = false;
        for (x6c x6cVar = this.r.h; x6cVar != null; x6cVar = x6cVar.l) {
            for (mh6 mh6Var : (mh6[]) x6cVar.n.e) {
                if (mh6Var != null) {
                    mh6Var.b(z);
                }
            }
        }
        if (!W()) {
            a0();
            d0();
            return;
        }
        int i3 = this.v.e;
        yqi yqiVar = this.h;
        if (i3 == 3) {
            Y();
            yqiVar.c(2);
        } else if (i3 == 2) {
            yqiVar.c(2);
        }
    }

    public final void R(gke gkeVar) {
        ar4 ar4Var = this.n;
        ar4Var.a(gkeVar);
        gke playbackParameters = ar4Var.getPlaybackParameters();
        n(playbackParameters, playbackParameters.a, true, true);
    }

    public final void S(int i) {
        this.C = i;
        lij lijVar = this.v.a;
        c7c c7cVar = this.r;
        c7cVar.f = i;
        if (!c7cVar.n(lijVar)) {
            G(true);
        }
        k(false);
    }

    public final void T(boolean z) {
        this.D = z;
        lij lijVar = this.v.a;
        c7c c7cVar = this.r;
        c7cVar.g = z;
        if (!c7cVar.n(lijVar)) {
            G(true);
        }
        k(false);
    }

    public final void U(xfh xfhVar) {
        this.w.a(1);
        tdc tdcVar = this.s;
        int size = ((ArrayList) tdcVar.b).size();
        if (xfhVar.b.length != size) {
            xfhVar = new xfh(new Random(xfhVar.a.nextLong())).a(size);
        }
        tdcVar.l = xfhVar;
        l(tdcVar.d(), false);
    }

    public final void V(int i) {
        eke ekeVar = this.v;
        if (ekeVar.e != i) {
            if (i != 2) {
                this.N = C.TIME_UNSET;
            }
            this.v = ekeVar.f(i);
        }
    }

    public final boolean W() {
        eke ekeVar = this.v;
        return ekeVar.l && ekeVar.m == 0;
    }

    public final boolean X(lij lijVar, rcc rccVar) {
        if (rccVar.a() || lijVar.p()) {
            return false;
        }
        int i = lijVar.g(rccVar.a, this.l).c;
        jij jijVar = this.k;
        lijVar.n(i, jijVar);
        return jijVar.a() && jijVar.g && jijVar.d != C.TIME_UNSET;
    }

    public final void Y() {
        this.A = false;
        ar4 ar4Var = this.n;
        ar4Var.c = true;
        ((qbc) ar4Var.d).c();
        for (m51 m51Var : this.a) {
            if (q(m51Var)) {
                qx9.t(m51Var.f == 1);
                m51Var.f = 2;
                m51Var.m();
            }
        }
    }

    public final void Z(boolean z, boolean z2) {
        A(z || !this.E, false, true, false);
        this.w.a(z2 ? 1 : 0);
        this.f.b(true);
        V(1);
    }

    public final void a(ah6 ah6Var, int i) {
        this.w.a(1);
        tdc tdcVar = this.s;
        if (i == -1) {
            i = ((ArrayList) tdcVar.b).size();
        }
        l(tdcVar.a(i, ah6Var.a, ah6Var.b), false);
    }

    public final void a0() {
        int i;
        ar4 ar4Var = this.n;
        ar4Var.c = false;
        qbc qbcVar = (qbc) ar4Var.d;
        if (qbcVar.a) {
            qbcVar.b(qbcVar.getPositionUs());
            qbcVar.a = false;
        }
        for (m51 m51Var : this.a) {
            if (q(m51Var) && (i = m51Var.f) == 2) {
                qx9.t(i == 2);
                m51Var.f = 1;
                m51Var.n();
            }
        }
    }

    @Override // defpackage.t6c
    public final void b(z4h z4hVar) {
        this.h.a(9, (v6c) z4hVar).b();
    }

    public final void b0() {
        x6c x6cVar = this.r.j;
        boolean z = this.B || (x6cVar != null && x6cVar.a.isLoading());
        eke ekeVar = this.v;
        if (z != ekeVar.g) {
            this.v = new eke(ekeVar.a, ekeVar.b, ekeVar.c, ekeVar.d, ekeVar.e, ekeVar.f, z, ekeVar.h, ekeVar.i, ekeVar.j, ekeVar.k, ekeVar.l, ekeVar.m, ekeVar.n, ekeVar.p, ekeVar.q, ekeVar.r, ekeVar.o);
        }
    }

    public final void c(m51 m51Var) {
        if (q(m51Var)) {
            ar4 ar4Var = this.n;
            if (m51Var == ((m51) ar4Var.f)) {
                ar4Var.g = null;
                ar4Var.f = null;
                ar4Var.b = true;
            }
            int i = m51Var.f;
            if (i == 2) {
                qx9.t(i == 2);
                m51Var.f = 1;
                m51Var.n();
            }
            qx9.t(m51Var.f == 1);
            m51Var.b.j();
            m51Var.f = 0;
            m51Var.g = null;
            m51Var.h = null;
            m51Var.k = false;
            m51Var.i();
            this.H--;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void c0(gtj gtjVar) {
        mh6[] mh6VarArr = (mh6[]) gtjVar.e;
        xq4 xq4Var = this.f;
        xq4Var.getClass();
        int i = 0;
        int i2 = 0;
        while (true) {
            m51[] m51VarArr = this.a;
            int length = m51VarArr.length;
            int i3 = C.DEFAULT_VIDEO_BUFFER_SIZE;
            if (i >= length) {
                int max = Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, i2);
                xq4Var.g = max;
                xq4Var.a.a0(max);
                return;
            }
            if (mh6VarArr[i] != null) {
                switch (m51VarArr[i].a) {
                    case 0:
                        i3 = 144310272;
                        i2 += i3;
                        break;
                    case 1:
                        i2 += i3;
                        break;
                    case 2:
                        i3 = 131072000;
                        i2 += i3;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        i3 = 131072;
                        i2 += i3;
                        break;
                    default:
                        ilg.c();
                        break;
                }
                return;
            }
            i++;
        }
    }

    @Override // defpackage.t6c
    public final void d(v6c v6cVar) {
        this.h.a(8, v6cVar).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    public final void d0() {
        long j;
        char c;
        ?? r18;
        long max;
        long i;
        x6c x6cVar = this.r.h;
        if (x6cVar == null) {
            return;
        }
        long readDiscontinuity = x6cVar.d ? x6cVar.a.readDiscontinuity() : -9223372036854775807L;
        if (readDiscontinuity != C.TIME_UNSET) {
            C(readDiscontinuity);
            if (readDiscontinuity != this.v.r) {
                eke ekeVar = this.v;
                this.v = o(ekeVar.b, readDiscontinuity, ekeVar.c, readDiscontinuity, true, 5);
            }
        } else {
            ar4 ar4Var = this.n;
            boolean z = x6cVar != this.r.i;
            qbc qbcVar = (qbc) ar4Var.d;
            m51 m51Var = (m51) ar4Var.f;
            if (m51Var == null || m51Var.g() || (!((m51) ar4Var.f).h() && (z || ((m51) ar4Var.f).f()))) {
                ar4Var.b = true;
                if (ar4Var.c) {
                    qbcVar.c();
                }
            } else {
                l2c l2cVar = (l2c) ar4Var.g;
                l2cVar.getClass();
                long positionUs = l2cVar.getPositionUs();
                if (ar4Var.b) {
                    if (positionUs >= qbcVar.getPositionUs()) {
                        ar4Var.b = false;
                        if (ar4Var.c) {
                            qbcVar.c();
                        }
                    } else if (qbcVar.a) {
                        qbcVar.b(qbcVar.getPositionUs());
                        qbcVar.a = false;
                    }
                }
                qbcVar.b(positionUs);
                gke playbackParameters = l2cVar.getPlaybackParameters();
                if (!playbackParameters.equals((gke) qbcVar.e)) {
                    qbcVar.a(playbackParameters);
                    ((hh6) ar4Var.e).h.a(16, playbackParameters).b();
                }
            }
            long positionUs2 = ar4Var.getPositionUs();
            this.J = positionUs2;
            long j2 = positionUs2 - x6cVar.o;
            long j3 = this.v.r;
            if (!this.o.isEmpty() && !this.v.b.a()) {
                if (this.L) {
                    this.L = false;
                }
                eke ekeVar2 = this.v;
                ekeVar2.a.b(ekeVar2.b.a);
                int min = Math.min(this.K, this.o.size());
                if (min > 0 && this.o.get(min - 1) != null) {
                    pvd.j();
                    return;
                } else {
                    if (min < this.o.size() && this.o.get(min) != null) {
                        pvd.j();
                        return;
                    }
                    this.K = min;
                }
            }
            this.v.r = j2;
        }
        this.v.p = this.r.j.d();
        eke ekeVar3 = this.v;
        long j4 = ekeVar3.p;
        x6c x6cVar2 = this.r.j;
        ekeVar3.q = x6cVar2 == null ? 0L : Math.max(0L, j4 - (this.J - x6cVar2.o));
        eke ekeVar4 = this.v;
        if (ekeVar4.l && ekeVar4.e == 3 && X(ekeVar4.a, ekeVar4.b)) {
            eke ekeVar5 = this.v;
            float f = 1.0f;
            if (ekeVar5.n.a == 1.0f) {
                uq4 uq4Var = this.t;
                long g = g(ekeVar5.a, ekeVar5.b.a, ekeVar5.r);
                long j5 = this.v.p;
                x6c x6cVar3 = this.r.j;
                if (x6cVar3 == null) {
                    j = -9223372036854775807L;
                    c = 1;
                    r18 = 0;
                    max = 0;
                } else {
                    j = -9223372036854775807L;
                    c = 1;
                    r18 = 0;
                    max = Math.max(0L, j5 - (this.J - x6cVar3.o));
                }
                if (uq4Var.d != j) {
                    long j6 = g - max;
                    long j7 = uq4Var.n;
                    if (j7 == j) {
                        uq4Var.n = j6;
                        uq4Var.o = 0L;
                    } else {
                        uq4Var.n = Math.max(j6, (long) ((j6 * 9.999871E-4f) + (j7 * 0.999f)));
                        uq4Var.o = (long) ((9.999871E-4f * Math.abs(j6 - r13)) + (0.999f * uq4Var.o));
                    }
                    if (uq4Var.m == j || SystemClock.elapsedRealtime() - uq4Var.m >= 1000) {
                        uq4Var.m = SystemClock.elapsedRealtime();
                        long j8 = (uq4Var.o * 3) + uq4Var.n;
                        if (uq4Var.i > j8) {
                            float y = lik.y(1000L);
                            long j9 = ((long) ((uq4Var.l - 1.0f) * y)) + ((long) ((uq4Var.j - 1.0f) * y));
                            long j10 = uq4Var.f;
                            long j11 = uq4Var.i - j9;
                            long[] jArr = new long[3];
                            jArr[r18] = j8;
                            jArr[c] = j10;
                            jArr[2] = j11;
                            i = jaa.H(jArr);
                            uq4Var.i = i;
                        } else {
                            i = lik.i(g - ((long) (Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, uq4Var.l - 1.0f) / 1.0E-7f)), uq4Var.i, j8);
                            uq4Var.i = i;
                            long j12 = uq4Var.h;
                            if (j12 != j && i > j12) {
                                uq4Var.i = j12;
                                i = j12;
                            }
                        }
                        long j13 = g - i;
                        if (Math.abs(j13) < uq4Var.b) {
                            uq4Var.l = 1.0f;
                        } else {
                            f = lik.g((1.0E-7f * j13) + 1.0f, uq4Var.k, uq4Var.j);
                            uq4Var.l = f;
                        }
                    } else {
                        f = uq4Var.l;
                    }
                }
                if (this.n.getPlaybackParameters().a != f) {
                    this.n.a(new gke(f, this.v.n.b));
                    boolean z2 = r18;
                    n(this.v.n, this.n.getPlaybackParameters().a, z2, z2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:292:0x0542, code lost:
    
        if (r3 >= r5.g) goto L293;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0304 A[EDGE_INSN: B:74:0x0304->B:75:0x0304 BREAK  A[LOOP:0: B:42:0x02a4->B:53:0x0301], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0354  */
    /* JADX WARN: Type inference failed for: r11v3, types: [gtj] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51, types: [int] */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58, types: [int] */
    /* JADX WARN: Type inference failed for: r1v77, types: [gtj] */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52, types: [int] */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [int] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [int] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44, types: [int] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r7v39, types: [mh6[]] */
    /* JADX WARN: Type inference failed for: r7v40, types: [mh6] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v34, types: [gtj] */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41, types: [int] */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        long j;
        long j2;
        boolean z;
        boolean z2;
        long j3;
        long j4;
        long j5;
        long j6;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        eke ekeVar;
        boolean z8;
        boolean z9;
        int i;
        ipg ipgVar;
        long j7;
        boolean z10;
        x6c x6cVar;
        x6c x6cVar2;
        long j8;
        boolean z11;
        a7c c;
        boolean z12;
        long j9;
        boolean z13;
        x6c x6cVar3;
        x6c x6cVar4;
        c7c c7cVar;
        boolean z14;
        x6c x6cVar5;
        x6c x6cVar6;
        x6c a;
        boolean z15;
        boolean z16;
        ?? r5;
        m51[] m51VarArr;
        this.p.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.h.a.removeMessages(2);
        if (this.v.a.p() || !this.s.g) {
            j = uptimeMillis;
            j2 = Long.MIN_VALUE;
            z = false;
            z2 = true;
            j3 = -9223372036854775807L;
        } else {
            c7c c7cVar2 = this.r;
            long j10 = this.J;
            x6c x6cVar7 = c7cVar2.j;
            if (x6cVar7 != null) {
                qx9.t(x6cVar7.l == null);
                if (x6cVar7.d) {
                    z10 = true;
                    x6cVar7.a.reevaluateBuffer(j10 - x6cVar7.o);
                    c7c c7cVar3 = this.r;
                    x6cVar = c7cVar3.j;
                    if (x6cVar != null || (!x6cVar.f.i && x6cVar.d && ((!x6cVar.e || x6cVar.a.getBufferedPositionUs() == Long.MIN_VALUE) && c7cVar3.j.f.e != C.TIME_UNSET && c7cVar3.k < 100))) {
                        c7c c7cVar4 = this.r;
                        long j11 = this.J;
                        eke ekeVar2 = this.v;
                        x6cVar2 = c7cVar4.j;
                        if (x6cVar2 != null) {
                            j8 = -9223372036854775807L;
                            z11 = z10;
                            c = c7cVar4.d(ekeVar2.a, ekeVar2.b, ekeVar2.c, ekeVar2.r);
                        } else {
                            j8 = -9223372036854775807L;
                            z11 = z10;
                            c = c7cVar4.c(ekeVar2.a, x6cVar2, j11);
                        }
                        if (c == null) {
                            c7c c7cVar5 = this.r;
                            m51[] m51VarArr2 = this.c;
                            hu4 hu4Var = this.d;
                            zz0 zz0Var = this.f.a;
                            tdc tdcVar = this.s;
                            gtj gtjVar = this.e;
                            z12 = z11;
                            x6c x6cVar8 = c7cVar5.j;
                            if (x6cVar8 == null) {
                                j = uptimeMillis;
                                j9 = 1000000000000L;
                                j2 = Long.MIN_VALUE;
                            } else {
                                j2 = Long.MIN_VALUE;
                                j = uptimeMillis;
                                j9 = (x6cVar8.o + x6cVar8.f.e) - c.b;
                            }
                            x6c x6cVar9 = new x6c(m51VarArr2, j9, hu4Var, zz0Var, tdcVar, c, gtjVar);
                            x6c x6cVar10 = c7cVar5.j;
                            if (x6cVar10 == null) {
                                c7cVar5.h = x6cVar9;
                                c7cVar5.i = x6cVar9;
                            } else if (x6cVar9 != x6cVar10.l) {
                                x6cVar10.b();
                                x6cVar10.l = x6cVar9;
                                x6cVar10.c();
                            }
                            c7cVar5.l = null;
                            c7cVar5.j = x6cVar9;
                            c7cVar5.k++;
                            c7cVar5.j();
                            x6cVar9.a.g(this, c.b);
                            if (this.r.h == x6cVar9) {
                                C(c.b);
                            }
                            z13 = false;
                            k(false);
                            if (this.B) {
                                s();
                            } else {
                                this.B = p();
                                b0();
                            }
                            m51[] m51VarArr3 = this.a;
                            c7c c7cVar6 = this.r;
                            x6cVar3 = c7cVar6.i;
                            if (x6cVar3 != null) {
                                if (x6cVar3.l == null || this.z) {
                                    z2 = z12;
                                    if (x6cVar3.f.i || this.z) {
                                        for (?? r1 = z13; r1 < m51VarArr3.length; r1++) {
                                            m51 m51Var = m51VarArr3[r1];
                                            ipg ipgVar2 = x6cVar3.c[r1];
                                            if (ipgVar2 != null && m51Var.g == ipgVar2 && m51Var.f()) {
                                                long j12 = x6cVar3.f.e;
                                                L(m51Var, (j12 == j8 || j12 == j2) ? j8 : x6cVar3.o + j12);
                                            }
                                        }
                                    }
                                } else if (x6cVar3.d) {
                                    ?? r3 = z13;
                                    while (true) {
                                        if (r3 < m51VarArr3.length) {
                                            m51 m51Var2 = m51VarArr3[r3];
                                            ipg ipgVar3 = x6cVar3.c[r3];
                                            if (m51Var2.g != ipgVar3) {
                                                break;
                                            }
                                            if (ipgVar3 != null && !m51Var2.f()) {
                                                x6c x6cVar11 = x6cVar3.l;
                                                if (!x6cVar3.f.f) {
                                                    break;
                                                }
                                                if (!x6cVar11.d) {
                                                    break;
                                                }
                                                if (!(m51Var2 instanceof rej) && !(m51Var2 instanceof a) && m51Var2.j < x6cVar11.e()) {
                                                    break;
                                                }
                                            }
                                            r3++;
                                        } else {
                                            x6c x6cVar12 = x6cVar3.l;
                                            if (x6cVar12.d || this.J >= x6cVar12.e()) {
                                                ?? r9 = x6cVar3.n;
                                                x6c x6cVar13 = c7cVar6.i;
                                                qx9.t((x6cVar13 == null || x6cVar13.l == null) ? z13 : z12);
                                                c7cVar6.i = c7cVar6.i.l;
                                                c7cVar6.j();
                                                x6c x6cVar14 = c7cVar6.i;
                                                ?? r11 = x6cVar14.n;
                                                lij lijVar = this.v.a;
                                                z2 = z12;
                                                e0(lijVar, x6cVar14.f.a, lijVar, x6cVar3.f.a, C.TIME_UNSET);
                                                if (!x6cVar14.d || x6cVar14.a.readDiscontinuity() == j8) {
                                                    for (?? r12 = z13; r12 < m51VarArr3.length; r12++) {
                                                        boolean r = r9.r(r12);
                                                        boolean r2 = r11.r(r12);
                                                        if (r && !m51VarArr3[r12].k) {
                                                            boolean z17 = this.c[r12].a == -2 ? z2 : z13;
                                                            ryf ryfVar = ((ryf[]) r9.d)[r12];
                                                            ryf ryfVar2 = ((ryf[]) r11.d)[r12];
                                                            if (!r2 || !ryfVar2.equals(ryfVar) || z17) {
                                                                L(m51VarArr3[r12], x6cVar14.e());
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    long e = x6cVar14.e();
                                                    int length = m51VarArr3.length;
                                                    for (?? r4 = z13; r4 < length; r4++) {
                                                        m51 m51Var3 = m51VarArr3[r4];
                                                        if (m51Var3.g != null) {
                                                            L(m51Var3, e);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                c7c c7cVar7 = this.r;
                                x6cVar4 = c7cVar7.i;
                                if (x6cVar4 != null && c7cVar7.h != x6cVar4 && !x6cVar4.g) {
                                    ?? r13 = x6cVar4.n;
                                    ipg[] ipgVarArr = x6cVar4.c;
                                    z16 = z13;
                                    r5 = z16;
                                    while (true) {
                                        m51VarArr = this.a;
                                        if (r5 < m51VarArr.length) {
                                            break;
                                        }
                                        m51 m51Var4 = m51VarArr[r5];
                                        if (q(m51Var4)) {
                                            boolean z18 = m51Var4.g != ipgVarArr[r5] ? z2 : z13;
                                            if (!r13.r(r5) || z18) {
                                                if (!m51Var4.k) {
                                                    ?? r7 = ((mh6[]) r13.e)[r5];
                                                    int length2 = r7 != 0 ? r7.length() : z13;
                                                    sm8[] sm8VarArr = new sm8[length2];
                                                    for (?? r112 = z13; r112 < length2; r112++) {
                                                        sm8VarArr[r112] = r7.getFormat(r112);
                                                    }
                                                    m51Var4.r(sm8VarArr, ipgVarArr[r5], x6cVar4.e(), x6cVar4.o);
                                                } else if (m51Var4.g()) {
                                                    c(m51Var4);
                                                } else {
                                                    z16 = z2;
                                                }
                                            }
                                        }
                                        r5++;
                                    }
                                    if (!z16) {
                                        f(new boolean[m51VarArr.length]);
                                    }
                                }
                                c7cVar = this.r;
                                z14 = z13;
                                while (W() && !this.z && (x6cVar5 = c7cVar.h) != null && (x6cVar6 = x6cVar5.l) != null && this.J >= x6cVar6.e() && x6cVar6.g) {
                                    if (z14) {
                                        t();
                                    }
                                    a = c7cVar.a();
                                    a.getClass();
                                    if (this.v.b.a.equals(a.f.a.a)) {
                                        rcc rccVar = this.v.b;
                                        if (rccVar.b == -1) {
                                            rcc rccVar2 = a.f.a;
                                            if (rccVar2.b == -1 && rccVar.e != rccVar2.e) {
                                                z15 = z2;
                                                a7c a7cVar = a.f;
                                                rcc rccVar3 = a7cVar.a;
                                                boolean z19 = z15;
                                                long j13 = a7cVar.b;
                                                this.v = o(rccVar3, j13, a7cVar.c, j13, !z19, 0);
                                                B();
                                                d0();
                                                z13 = z13;
                                                z14 = z2;
                                            }
                                        }
                                    }
                                    z15 = z13;
                                    a7c a7cVar2 = a.f;
                                    rcc rccVar32 = a7cVar2.a;
                                    boolean z192 = z15;
                                    long j132 = a7cVar2.b;
                                    this.v = o(rccVar32, j132, a7cVar2.c, j132, !z192, 0);
                                    B();
                                    d0();
                                    z13 = z13;
                                    z14 = z2;
                                }
                                z = z13;
                                j3 = j8;
                            }
                            z2 = z12;
                            c7c c7cVar72 = this.r;
                            x6cVar4 = c7cVar72.i;
                            if (x6cVar4 != null) {
                                ?? r132 = x6cVar4.n;
                                ipg[] ipgVarArr2 = x6cVar4.c;
                                z16 = z13;
                                r5 = z16;
                                while (true) {
                                    m51VarArr = this.a;
                                    if (r5 < m51VarArr.length) {
                                    }
                                    r5++;
                                }
                                if (!z16) {
                                }
                            }
                            c7cVar = this.r;
                            z14 = z13;
                            while (W()) {
                                if (z14) {
                                }
                                a = c7cVar.a();
                                a.getClass();
                                if (this.v.b.a.equals(a.f.a.a)) {
                                }
                                z15 = z13;
                                a7c a7cVar22 = a.f;
                                rcc rccVar322 = a7cVar22.a;
                                boolean z1922 = z15;
                                long j1322 = a7cVar22.b;
                                this.v = o(rccVar322, j1322, a7cVar22.c, j1322, !z1922, 0);
                                B();
                                d0();
                                z13 = z13;
                                z14 = z2;
                            }
                            z = z13;
                            j3 = j8;
                        } else {
                            z12 = z11;
                        }
                    } else {
                        z12 = z10;
                        j8 = -9223372036854775807L;
                    }
                    j = uptimeMillis;
                    j2 = Long.MIN_VALUE;
                    z13 = false;
                    if (this.B) {
                    }
                    m51[] m51VarArr32 = this.a;
                    c7c c7cVar62 = this.r;
                    x6cVar3 = c7cVar62.i;
                    if (x6cVar3 != null) {
                    }
                    z2 = z12;
                    c7c c7cVar722 = this.r;
                    x6cVar4 = c7cVar722.i;
                    if (x6cVar4 != null) {
                    }
                    c7cVar = this.r;
                    z14 = z13;
                    while (W()) {
                    }
                    z = z13;
                    j3 = j8;
                }
            }
            z10 = true;
            c7c c7cVar32 = this.r;
            x6cVar = c7cVar32.j;
            if (x6cVar != null) {
            }
            c7c c7cVar42 = this.r;
            long j112 = this.J;
            eke ekeVar22 = this.v;
            x6cVar2 = c7cVar42.j;
            if (x6cVar2 != null) {
            }
            if (c == null) {
            }
        }
        int i2 = this.v.e;
        if (i2 == z2 || i2 == 4) {
            return;
        }
        x6c x6cVar15 = this.r.h;
        if (x6cVar15 == null) {
            this.h.a.sendEmptyMessageAtTime(2, j + 10);
            return;
        }
        q5a.y("doSomeWork");
        d0();
        if (x6cVar15.d) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            j4 = 10;
            j5 = 1000;
            x6cVar15.a.e(this.v.r - this.m);
            ?? r52 = z;
            z3 = z2;
            z4 = z3;
            while (true) {
                m51[] m51VarArr4 = this.a;
                if (r52 >= m51VarArr4.length) {
                    break;
                }
                m51 m51Var5 = m51VarArr4[r52];
                if (q(m51Var5)) {
                    j7 = j3;
                    m51Var5.q(this.J, elapsedRealtime);
                    z3 = (z3 && m51Var5.g()) ? true : z;
                    boolean z20 = x6cVar15.c[r52] != m51Var5.g ? true : z;
                    boolean z21 = (z20 || ((z20 || !m51Var5.f()) ? z : true) || m51Var5.h() || m51Var5.g()) ? true : z;
                    z4 = (z4 && z21) ? true : z;
                    if (!z21) {
                        ipg ipgVar4 = m51Var5.g;
                        ipgVar4.getClass();
                        ipgVar4.maybeThrowError();
                    }
                } else {
                    j7 = j3;
                }
                j3 = j7;
                r52++;
            }
            j6 = j3;
        } else {
            j4 = 10;
            j5 = 1000;
            j6 = j3;
            x6cVar15.a.maybeThrowPrepareError();
            z3 = true;
            z4 = true;
        }
        long j14 = x6cVar15.f.e;
        boolean z22 = (z3 && x6cVar15.d && (j14 == j6 || j14 <= this.v.r)) ? true : z;
        if (z22 && this.z) {
            this.z = z;
            Q(this.v.m, 5, z, z);
        }
        if (z22 && x6cVar15.f.i) {
            V(4);
            a0();
        } else {
            eke ekeVar3 = this.v;
            if (ekeVar3.e == 2) {
                c7c c7cVar8 = this.r;
                if (this.H == 0) {
                    z5 = r();
                } else {
                    if (z4) {
                        if (ekeVar3.g) {
                            long j15 = X(ekeVar3.a, c7cVar8.h.f.a) ? this.t.i : j6;
                            x6c x6cVar16 = c7cVar8.j;
                            boolean z23 = (!x6cVar16.d || (x6cVar16.e && x6cVar16.a.getBufferedPositionUs() != j2) || !x6cVar16.f.i) ? z : true;
                            boolean z24 = (!x6cVar16.f.a.a() || x6cVar16.d) ? z : true;
                            if (!z23 && !z24) {
                                xq4 xq4Var = this.f;
                                long j16 = this.v.p;
                                x6c x6cVar17 = this.r.j;
                                long max = x6cVar17 == null ? 0L : Math.max(0L, j16 - (this.J - x6cVar17.o));
                                float f = this.n.getPlaybackParameters().a;
                                boolean z25 = this.A;
                                xq4Var.getClass();
                                if (f != 1.0f) {
                                    max = Math.round(max / f);
                                }
                                long j17 = z25 ? xq4Var.e : xq4Var.d;
                                if (j15 != j6) {
                                    j17 = Math.min(j15 / 2, j17);
                                }
                                if (j17 > 0 && max < j17) {
                                    zz0 zz0Var2 = xq4Var.a;
                                    synchronized (zz0Var2) {
                                        int i3 = zz0Var2.c * C.DEFAULT_BUFFER_SEGMENT_SIZE;
                                    }
                                }
                            }
                        }
                        z5 = true;
                    }
                    z5 = z;
                }
                if (z5) {
                    V(3);
                    this.M = null;
                    if (W()) {
                        Y();
                    }
                }
            }
            if (this.v.e == 3 && (this.H != 0 ? !z4 : !r())) {
                this.A = W();
                V(2);
                if (this.A) {
                    for (x6c x6cVar18 = this.r.h; x6cVar18 != null; x6cVar18 = x6cVar18.l) {
                        mh6[] mh6VarArr = (mh6[]) x6cVar18.n.e;
                        int length3 = mh6VarArr.length;
                        for (?? r92 = z; r92 < length3; r92++) {
                            mh6 mh6Var = mh6VarArr[r92];
                            if (mh6Var != null) {
                                mh6Var.c();
                            }
                        }
                    }
                    uq4 uq4Var = this.t;
                    long j18 = uq4Var.i;
                    if (j18 != j6) {
                        long j19 = j18 + uq4Var.c;
                        uq4Var.i = j19;
                        long j20 = uq4Var.h;
                        if (j20 != j6 && j19 > j20) {
                            uq4Var.i = j20;
                        }
                        uq4Var.m = j6;
                    }
                }
                a0();
            }
        }
        if (this.v.e == 2) {
            ?? r93 = z;
            while (true) {
                m51[] m51VarArr5 = this.a;
                if (r93 >= m51VarArr5.length) {
                    break;
                }
                if (q(m51VarArr5[r93]) && (ipgVar = this.a[r93].g) == x6cVar15.c[r93]) {
                    ipgVar.getClass();
                    ipgVar.maybeThrowError();
                }
                r93++;
            }
            eke ekeVar4 = this.v;
            if (!ekeVar4.g && ekeVar4.q < 500000 && p()) {
                long j21 = this.N;
                sqi sqiVar = this.p;
                if (j21 == C.TIME_UNSET) {
                    sqiVar.getClass();
                    this.N = SystemClock.elapsedRealtime();
                } else {
                    sqiVar.getClass();
                    if (SystemClock.elapsedRealtime() - this.N >= 4000) {
                        a70.r("Playback stuck buffering and not loading");
                        return;
                    }
                }
                z6 = (W() || this.v.e != 3) ? z : true;
                z7 = (!this.G && this.F && z6) ? true : z;
                ekeVar = this.v;
                if (ekeVar.o == z7) {
                    z8 = z7;
                    ekeVar = new eke(ekeVar.a, ekeVar.b, ekeVar.c, ekeVar.d, ekeVar.e, ekeVar.f, ekeVar.g, ekeVar.h, ekeVar.i, ekeVar.j, ekeVar.k, ekeVar.l, ekeVar.m, ekeVar.n, ekeVar.p, ekeVar.q, ekeVar.r, z8);
                    this.v = ekeVar;
                    z9 = false;
                } else {
                    z8 = z7;
                    z9 = z;
                }
                this.F = z9;
                if (!z8 && (i = ekeVar.e) != 4) {
                    if (!z6 || i == 2) {
                        this.h.a.sendEmptyMessageAtTime(2, j + j4);
                    } else if (i == 3 && this.H != 0) {
                        this.h.a.sendEmptyMessageAtTime(2, j + j5);
                    }
                }
                q5a.B();
            }
        }
        this.N = C.TIME_UNSET;
        if (W()) {
        }
        if (!this.G) {
        }
        ekeVar = this.v;
        if (ekeVar.o == z7) {
        }
        this.F = z9;
        if (!z8) {
            if (z6) {
            }
            this.h.a.sendEmptyMessageAtTime(2, j + j4);
        }
        q5a.B();
    }

    public final void e0(lij lijVar, rcc rccVar, lij lijVar2, rcc rccVar2, long j) {
        boolean X = X(lijVar, rccVar);
        Object obj = rccVar.a;
        if (!X) {
            gke gkeVar = rccVar.a() ? gke.d : this.v.n;
            ar4 ar4Var = this.n;
            if (ar4Var.getPlaybackParameters().equals(gkeVar)) {
                return;
            }
            ar4Var.a(gkeVar);
            return;
        }
        hij hijVar = this.l;
        int i = lijVar.g(obj, hijVar).c;
        jij jijVar = this.k;
        lijVar.n(i, jijVar);
        t5c t5cVar = jijVar.i;
        int i2 = lik.a;
        long y = lik.y(t5cVar.a);
        uq4 uq4Var = this.t;
        uq4Var.d = y;
        uq4Var.g = lik.y(t5cVar.b);
        uq4Var.h = lik.y(t5cVar.c);
        float f = t5cVar.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        uq4Var.k = f;
        float f2 = t5cVar.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        uq4Var.j = f2;
        if (f == 1.0f && f2 == 1.0f) {
            uq4Var.d = C.TIME_UNSET;
        }
        uq4Var.a();
        if (j != C.TIME_UNSET) {
            uq4Var.e = g(lijVar, obj, j);
            uq4Var.a();
            return;
        }
        if (lik.a(!lijVar2.p() ? lijVar2.m(lijVar2.g(rccVar2.a, hijVar).c, jijVar, 0L).a : null, jijVar.a)) {
            return;
        }
        uq4Var.e = C.TIME_UNSET;
        uq4Var.a();
    }

    public final void f(boolean[] zArr) {
        m51[] m51VarArr;
        Set set;
        gtj gtjVar;
        int i;
        m51[] m51VarArr2;
        l2c l2cVar;
        c7c c7cVar = this.r;
        x6c x6cVar = c7cVar.i;
        gtj gtjVar2 = x6cVar.n;
        int i2 = 0;
        while (true) {
            m51VarArr = this.a;
            int length = m51VarArr.length;
            set = this.b;
            if (i2 >= length) {
                break;
            }
            if (!gtjVar2.r(i2) && set.remove(m51VarArr[i2])) {
                m51VarArr[i2].s();
            }
            i2++;
        }
        int i3 = 0;
        while (i3 < m51VarArr.length) {
            if (gtjVar2.r(i3)) {
                boolean z = zArr[i3];
                m51 m51Var = m51VarArr[i3];
                if (!q(m51Var)) {
                    x6c x6cVar2 = c7cVar.i;
                    boolean z2 = x6cVar2 == c7cVar.h;
                    gtj gtjVar3 = x6cVar2.n;
                    ryf ryfVar = ((ryf[]) gtjVar3.d)[i3];
                    mh6 mh6Var = ((mh6[]) gtjVar3.e)[i3];
                    int length2 = mh6Var != null ? mh6Var.length() : 0;
                    sm8[] sm8VarArr = new sm8[length2];
                    for (int i4 = 0; i4 < length2; i4++) {
                        sm8VarArr[i4] = mh6Var.getFormat(i4);
                    }
                    boolean z3 = W() && this.v.e == 3;
                    boolean z4 = !z && z3;
                    this.H++;
                    set.add(m51Var);
                    ipg ipgVar = x6cVar2.c[i3];
                    gtjVar = gtjVar2;
                    long j = this.J;
                    long e = x6cVar2.e();
                    i = i3;
                    m51VarArr2 = m51VarArr;
                    long j2 = x6cVar2.o;
                    qx9.t(m51Var.f == 0);
                    m51Var.c = ryfVar;
                    m51Var.f = 1;
                    m51Var.j(z4, z2);
                    m51Var.r(sm8VarArr, ipgVar, e, j2);
                    m51Var.k = false;
                    m51Var.j = j;
                    m51Var.k(j, z4);
                    m51Var.handleMessage(11, new yg6(this));
                    ar4 ar4Var = this.n;
                    ar4Var.getClass();
                    l2c d = m51Var.d();
                    if (d != null && d != (l2cVar = (l2c) ar4Var.g)) {
                        if (l2cVar != null) {
                            throw new sf6(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        ar4Var.g = d;
                        ar4Var.f = m51Var;
                        ((t2c) d).a((gke) ((qbc) ar4Var.d).e);
                    }
                    if (z3) {
                        qx9.t(m51Var.f == 1);
                        m51Var.f = 2;
                        m51Var.m();
                    }
                    i3 = i + 1;
                    gtjVar2 = gtjVar;
                    m51VarArr = m51VarArr2;
                }
            }
            gtjVar = gtjVar2;
            i = i3;
            m51VarArr2 = m51VarArr;
            i3 = i + 1;
            gtjVar2 = gtjVar;
            m51VarArr = m51VarArr2;
        }
        x6cVar.g = true;
    }

    public final synchronized void f0(uf6 uf6Var) {
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
        boolean z = false;
        for (long j = 500; !((Boolean) uf6Var.get()).booleanValue() && j > 0; j = elapsedRealtime - SystemClock.elapsedRealtime()) {
            try {
                this.p.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            this.p.getClass();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final long g(lij lijVar, Object obj, long j) {
        hij hijVar = this.l;
        int i = lijVar.g(obj, hijVar).c;
        jij jijVar = this.k;
        lijVar.n(i, jijVar);
        if (jijVar.d == C.TIME_UNSET || !jijVar.a() || !jijVar.g) {
            return C.TIME_UNSET;
        }
        long j2 = jijVar.e;
        int i2 = lik.a;
        return lik.y((j2 == C.TIME_UNSET ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - jijVar.d) - (j + hijVar.e);
    }

    public final Pair h(lij lijVar) {
        if (lijVar.p()) {
            return Pair.create(eke.s, 0L);
        }
        Pair i = lijVar.i(this.k, this.l, lijVar.a(this.D), C.TIME_UNSET);
        rcc m = this.r.m(lijVar, i.first, 0L);
        long longValue = ((Long) i.second).longValue();
        if (m.a()) {
            Object obj = m.a;
            hij hijVar = this.l;
            lijVar.g(obj, hijVar);
            longValue = m.c == hijVar.f(m.b) ? hijVar.g.b : 0L;
        }
        return Pair.create(m, Long.valueOf(longValue));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        x6c x6cVar;
        int i;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    Q(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    H((fh6) message.obj);
                    break;
                case 4:
                    R((gke) message.obj);
                    break;
                case 5:
                    this.u = (c0h) message.obj;
                    break;
                case 6:
                    Z(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    m((v6c) message.obj);
                    break;
                case 9:
                    i((v6c) message.obj);
                    break;
                case 10:
                    z();
                    break;
                case 11:
                    S(message.arg1);
                    break;
                case 12:
                    T(message.arg1 != 0);
                    break;
                case 13:
                    M(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    kte kteVar = (kte) message.obj;
                    kteVar.getClass();
                    J(kteVar);
                    break;
                case 15:
                    K((kte) message.obj);
                    break;
                case 16:
                    gke gkeVar = (gke) message.obj;
                    n(gkeVar, gkeVar.a, true, false);
                    break;
                case 17:
                    N((ah6) message.obj);
                    break;
                case 18:
                    a((ah6) message.obj, message.arg1);
                    break;
                case 19:
                    wt3.z(message.obj);
                    v();
                    throw null;
                case 20:
                    y(message.arg1, message.arg2, (xfh) message.obj);
                    break;
                case 21:
                    U((xfh) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    P(message.arg1 != 0);
                    break;
                case 24:
                    O(message.arg1 == 1);
                    break;
                case 25:
                    G(true);
                    break;
                default:
                    return false;
            }
        } catch (RuntimeException e) {
            sf6 sf6Var = new sf6(2, e, ((e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
            m6k.C("Playback error", sf6Var);
            Z(true, false);
            this.v = this.v.d(sf6Var);
        } catch (r9e e2) {
            boolean z = e2.a;
            int i2 = e2.b;
            if (i2 == 1) {
                i = z ? 3001 : Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE;
            } else {
                if (i2 == 4) {
                    i = z ? 3002 : 3004;
                }
                j(r1, e2);
            }
            r1 = i;
            j(r1, e2);
        } catch (se4 e3) {
            j(e3.a, e3);
        } catch (sf6 e4) {
            e = e4;
            if (e.c == 1 && (x6cVar = this.r.i) != null) {
                e = e.a(x6cVar.f.a);
            }
            if (e.i && this.M == null) {
                m6k.g0("Recoverable renderer error", e);
                this.M = e;
                yqi yqiVar = this.h;
                wqi a = yqiVar.a(25, e);
                Handler handler = yqiVar.a;
                Message message2 = a.a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                a.a();
            } else {
                sf6 sf6Var2 = this.M;
                if (sf6Var2 != null) {
                    sf6Var2.addSuppressed(e);
                    e = this.M;
                }
                m6k.C("Playback error", e);
                Z(true, false);
                this.v = this.v.d(e);
            }
        } catch (vb5 e5) {
            j(e5.a, e5);
        } catch (IOException e6) {
            j(2000, e6);
        }
        t();
        return true;
    }

    public final void i(v6c v6cVar) {
        x6c x6cVar = this.r.j;
        if (x6cVar == null || x6cVar.a != v6cVar) {
            return;
        }
        long j = this.J;
        if (x6cVar != null) {
            qx9.t(x6cVar.l == null);
            if (x6cVar.d) {
                x6cVar.a.reevaluateBuffer(j - x6cVar.o);
            }
        }
        s();
    }

    public final void j(int i, IOException iOException) {
        sf6 sf6Var = new sf6(0, iOException, i);
        x6c x6cVar = this.r.h;
        if (x6cVar != null) {
            sf6Var = sf6Var.a(x6cVar.f.a);
        }
        m6k.C("Playback error", sf6Var);
        Z(false, false);
        this.v = this.v.d(sf6Var);
    }

    public final void k(boolean z) {
        x6c x6cVar = this.r.j;
        rcc rccVar = x6cVar == null ? this.v.b : x6cVar.f.a;
        boolean equals = this.v.k.equals(rccVar);
        if (!equals) {
            this.v = this.v.a(rccVar);
        }
        eke ekeVar = this.v;
        ekeVar.p = x6cVar == null ? ekeVar.r : x6cVar.d();
        eke ekeVar2 = this.v;
        long j = ekeVar2.p;
        x6c x6cVar2 = this.r.j;
        ekeVar2.q = x6cVar2 != null ? Math.max(0L, j - (this.J - x6cVar2.o)) : 0L;
        if ((!equals || z) && x6cVar != null && x6cVar.d) {
            c0(x6cVar.n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02fe A[Catch: all -> 0x0304, TRY_ENTER, TryCatch #1 {all -> 0x0304, blocks: (B:115:0x02fe, B:16:0x031c, B:49:0x0326, B:51:0x032c, B:53:0x0336, B:55:0x0343), top: B:14:0x0289 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x040f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03f3  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r19v13, types: [rcc] */
    /* JADX WARN: Type inference failed for: r2v53, types: [c7c] */
    /* JADX WARN: Type inference failed for: r39v0, types: [hh6] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v40, types: [lij] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(lij lijVar, boolean z) {
        jij jijVar;
        long j;
        long j2;
        Object obj;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        lij lijVar2;
        long j3;
        ?? r7;
        boolean z6;
        long j4;
        dh6 dh6Var;
        int i4;
        long longValue;
        boolean z7;
        int i5;
        boolean z8;
        boolean z9;
        long j5;
        int i6;
        boolean z10;
        boolean z11;
        lij lijVar3;
        rcc rccVar;
        long j6;
        boolean z12;
        boolean z13;
        lij lijVar4;
        Object obj2;
        long j7;
        int i7;
        boolean z14;
        ?? r5;
        boolean z15;
        boolean z16;
        lij lijVar5;
        lij lijVar6;
        long j8;
        m51[] m51VarArr;
        int i8;
        c7c c7cVar;
        boolean z17;
        boolean z18;
        lij lijVar7;
        rcc rccVar2;
        lij lijVar8;
        long j9;
        Object obj3;
        long j10;
        int i9;
        lij lijVar9;
        boolean z19;
        boolean z20;
        lij lijVar10;
        eke ekeVar = this.v;
        fh6 fh6Var = this.I;
        c7c c7cVar2 = this.r;
        int i10 = this.C;
        boolean z21 = this.D;
        jij jijVar2 = this.k;
        hij hijVar = this.l;
        ?? r12 = 4;
        if (lijVar.p()) {
            ?? r19 = eke.s;
            lijVar2 = lijVar;
            dh6Var = new dh6(r19, 0L, C.TIME_UNSET, false, true, false);
            j = 0;
            z11 = r19;
        } else {
            rcc rccVar3 = ekeVar.b;
            Object obj4 = rccVar3.a;
            lij lijVar11 = ekeVar.a;
            boolean p = lijVar11.p();
            boolean z22 = p || lijVar11.g(rccVar3.a, hijVar).f;
            long j11 = (ekeVar.b.a() || z22) ? ekeVar.c : ekeVar.r;
            if (fh6Var != null) {
                Pair E = E(lijVar, fh6Var, true, i10, z21, jijVar2, hijVar);
                if (E == null) {
                    i6 = lijVar.a(z21);
                    j5 = j11;
                    obj = obj4;
                    z9 = false;
                    z10 = true;
                    z8 = false;
                } else {
                    long j12 = fh6Var.c;
                    obj = E.first;
                    if (j12 == C.TIME_UNSET) {
                        int i11 = lijVar.g(obj, hijVar).c;
                        longValue = j11;
                        obj = obj4;
                        z7 = false;
                        i5 = i11;
                    } else {
                        longValue = ((Long) E.second).longValue();
                        z7 = true;
                        i5 = -1;
                    }
                    z8 = z7;
                    z9 = ekeVar.e == 4;
                    j5 = longValue;
                    i6 = i5;
                    z10 = false;
                }
                z2 = z9;
                z3 = z10;
                z4 = z8;
                i = i6;
                i2 = -1;
                j = 0;
                j2 = j5;
                jijVar = jijVar2;
            } else {
                if (ekeVar.a.p()) {
                    i = lijVar.a(z21);
                    jijVar = jijVar2;
                } else if (lijVar.b(obj4) == -1) {
                    Object F = F(jijVar2, hijVar, i10, z21, obj4, ekeVar.a, lijVar);
                    jijVar = jijVar2;
                    hijVar = hijVar;
                    if (F == null) {
                        i3 = lijVar.a(z21);
                        z5 = true;
                    } else {
                        i3 = lijVar.g(F, hijVar).c;
                        z5 = false;
                    }
                    i = i3;
                    z3 = z5;
                    j2 = j11;
                    obj = obj4;
                    i2 = -1;
                    j = 0;
                    z2 = false;
                    z4 = false;
                } else {
                    jijVar = jijVar2;
                    if (j11 == C.TIME_UNSET) {
                        i = lijVar.g(obj4, hijVar).c;
                    } else if (z22) {
                        ekeVar.a.g(rccVar3.a, hijVar);
                        if (ekeVar.a.m(hijVar.c, jijVar, 0L).m == ekeVar.a.b(rccVar3.a)) {
                            j = 0;
                            Pair i12 = lijVar.i(jijVar, hijVar, lijVar.g(obj4, hijVar).c, j11 + hijVar.e);
                            obj = i12.first;
                            j2 = ((Long) i12.second).longValue();
                        } else {
                            j = 0;
                            j2 = j11;
                            obj = obj4;
                        }
                        i = -1;
                        i2 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        j = 0;
                        j2 = j11;
                        obj = obj4;
                        i = -1;
                        i2 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                }
                j2 = j11;
                obj = obj4;
                i2 = -1;
                j = 0;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            if (i != i2) {
                int i13 = i;
                lijVar2 = lijVar;
                Pair i14 = lijVar2.i(jijVar, hijVar, i13, C.TIME_UNSET);
                obj = i14.first;
                j2 = ((Long) i14.second).longValue();
                j3 = -9223372036854775807L;
            } else {
                lijVar2 = lijVar;
                j3 = j2;
            }
            rcc m = c7cVar2.m(lijVar2, obj, j2);
            int i15 = m.e;
            r7 = (!rccVar3.a.equals(obj) || rccVar3.a() || m.a() || !(i15 == i2 || ((i4 = rccVar3.e) != i2 && i15 >= i4))) ? 0 : 1;
            hij g = lijVar2.g(obj, hijVar);
            if (!z22 && j11 == j3) {
                Object obj5 = rccVar3.a;
                int i16 = rccVar3.c;
                int i17 = rccVar3.b;
                if (obj5.equals(m.a) && (!rccVar3.a() || !g.g(i17) ? !(!m.a() || !g.g(m.b)) : !(g.e(i17, i16) == 4 || g.e(i17, i16) == 2))) {
                    z6 = true;
                    if (r7 == 0 || z6) {
                        m = rccVar3;
                    }
                    if (m.a()) {
                        if (m.equals(rccVar3)) {
                            j2 = ekeVar.r;
                        } else {
                            lijVar2.g(m.a, hijVar);
                            j4 = m.c == hijVar.f(m.b) ? hijVar.g.b : j;
                            dh6Var = new dh6(m, j4, j3, z2, z3, z4);
                            z11 = p;
                        }
                    }
                    j4 = j2;
                    dh6Var = new dh6(m, j4, j3, z2, z3, z4);
                    z11 = p;
                }
            }
            z6 = false;
            if (r7 == 0) {
            }
            m = rccVar3;
            if (m.a()) {
            }
            j4 = j2;
            dh6Var = new dh6(m, j4, j3, z2, z3, z4);
            z11 = p;
        }
        rcc rccVar4 = dh6Var.a;
        long j13 = dh6Var.c;
        boolean z23 = dh6Var.d;
        long j14 = dh6Var.b;
        boolean z24 = (this.v.b.equals(rccVar4) && j14 == this.v.r) ? false : true;
        try {
            if (dh6Var.e) {
                try {
                    z14 = true;
                    if (this.v.e != 1) {
                        try {
                            V(4);
                        } catch (Throwable th) {
                            th = th;
                            lijVar3 = lijVar2;
                            rccVar = rccVar4;
                            j6 = j13;
                            z13 = true;
                            z12 = false;
                            eke ekeVar2 = this.v;
                            lij lijVar12 = ekeVar2.a;
                            rcc rccVar5 = ekeVar2.b;
                            rcc rccVar6 = rccVar;
                            lijVar4 = lijVar3;
                            e0(lijVar4, rccVar6, lijVar12, rccVar5, !dh6Var.f ? j14 : -9223372036854775807L);
                            if (!z24) {
                            }
                            eke ekeVar3 = this.v;
                            obj2 = ekeVar3.b.a;
                            lij lijVar13 = ekeVar3.a;
                            if (z24) {
                            }
                            long j15 = this.v.d;
                            if (lijVar4.b(obj2) != -1) {
                            }
                            this.v = o(rccVar6, j14, j7, j15, r7, i7);
                            B();
                            D(lijVar4, this.v.a);
                            this.v = this.v.g(lijVar4);
                            if (!lijVar4.p()) {
                            }
                            k(z12);
                            throw th;
                        }
                    }
                    r5 = 0;
                } catch (Throwable th2) {
                    th = th2;
                    z14 = true;
                    r5 = 0;
                }
                try {
                    A(false, false, false, true);
                } catch (Throwable th3) {
                    th = th3;
                    lijVar3 = lijVar2;
                    rccVar = rccVar4;
                    j6 = j13;
                    z13 = z14;
                    z12 = r5;
                    eke ekeVar22 = this.v;
                    lij lijVar122 = ekeVar22.a;
                    rcc rccVar52 = ekeVar22.b;
                    rcc rccVar62 = rccVar;
                    lijVar4 = lijVar3;
                    e0(lijVar4, rccVar62, lijVar122, rccVar52, !dh6Var.f ? j14 : -9223372036854775807L);
                    if (!z24 || j6 != this.v.c) {
                        eke ekeVar32 = this.v;
                        obj2 = ekeVar32.b.a;
                        lij lijVar132 = ekeVar32.a;
                        boolean z25 = (z24 || !z || lijVar132.p() || lijVar132.g(obj2, this.l).f) ? z12 : z13;
                        long j152 = this.v.d;
                        if (lijVar4.b(obj2) != -1) {
                            j7 = j6;
                            i7 = 4;
                        } else {
                            j7 = j6;
                            i7 = 3;
                        }
                        this.v = o(rccVar62, j14, j7, j152, z25, i7);
                    }
                    B();
                    D(lijVar4, this.v.a);
                    this.v = this.v.g(lijVar4);
                    if (!lijVar4.p()) {
                        this.I = null;
                    }
                    k(z12);
                    throw th;
                }
            } else {
                z14 = true;
                r5 = 0;
            }
            try {
                if (z24) {
                    r7 = lijVar2;
                    z11 = z14;
                    r12 = r5;
                    boolean p2 = r7.p();
                    lijVar10 = r7;
                    z20 = r12;
                    z19 = z11;
                    if (!p2) {
                        for (x6c x6cVar = this.r.h; x6cVar != null; x6cVar = x6cVar.l) {
                            if (x6cVar.f.a.equals(rccVar4)) {
                                x6cVar.f = this.r.g(r7, x6cVar.f);
                                x6cVar.h();
                            }
                        }
                        try {
                            c7c c7cVar3 = this.r;
                            rccVar = rccVar4;
                            try {
                                j14 = I(rccVar, j14, c7cVar3.h != c7cVar3.i ? z11 ? 1 : 0 : r12, z23);
                                lijVar7 = r7;
                                z18 = r12;
                                z17 = z11;
                                eke ekeVar4 = this.v;
                                lij lijVar14 = ekeVar4.a;
                                rcc rccVar7 = ekeVar4.b;
                                if (dh6Var.f) {
                                    rccVar2 = rccVar;
                                    lijVar8 = lijVar7;
                                    j9 = -9223372036854775807L;
                                } else {
                                    rccVar2 = rccVar;
                                    lijVar8 = lijVar7;
                                    j9 = j14;
                                }
                                e0(lijVar8, rccVar2, lijVar14, rccVar7, j9);
                                if (z24 && j13 == this.v.c) {
                                    lijVar9 = lijVar8;
                                } else {
                                    eke ekeVar5 = this.v;
                                    obj3 = ekeVar5.b.a;
                                    lij lijVar15 = ekeVar5.a;
                                    boolean z26 = (z24 || !z || lijVar15.p() || lijVar15.g(obj3, this.l).f) ? z18 : z17;
                                    long j16 = this.v.d;
                                    if (lijVar8.b(obj3) != -1) {
                                        j10 = j13;
                                        i9 = 4;
                                    } else {
                                        j10 = j13;
                                        i9 = 3;
                                    }
                                    lijVar9 = lijVar8;
                                    this.v = o(rccVar2, j14, j10, j16, z26, i9);
                                }
                                B();
                                D(lijVar9, this.v.a);
                                this.v = this.v.g(lijVar9);
                                if (!lijVar9.p()) {
                                    this.I = null;
                                }
                                k(z18);
                            } catch (Throwable th4) {
                                th = th4;
                                j14 = j14;
                                lijVar5 = r7;
                                z16 = r12;
                                z15 = z11;
                                j6 = j13;
                                lijVar3 = lijVar5;
                                z12 = z16;
                                z13 = z15;
                                eke ekeVar222 = this.v;
                                lij lijVar1222 = ekeVar222.a;
                                rcc rccVar522 = ekeVar222.b;
                                rcc rccVar622 = rccVar;
                                lijVar4 = lijVar3;
                                e0(lijVar4, rccVar622, lijVar1222, rccVar522, !dh6Var.f ? j14 : -9223372036854775807L);
                                if (!z24) {
                                }
                                eke ekeVar322 = this.v;
                                obj2 = ekeVar322.b.a;
                                lij lijVar1322 = ekeVar322.a;
                                if (z24) {
                                }
                                long j1522 = this.v.d;
                                if (lijVar4.b(obj2) != -1) {
                                }
                                this.v = o(rccVar622, j14, j7, j1522, z25, i7);
                                B();
                                D(lijVar4, this.v.a);
                                this.v = this.v.g(lijVar4);
                                if (!lijVar4.p()) {
                                }
                                k(z12);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            rccVar = rccVar4;
                            lijVar5 = r7;
                            z16 = r12;
                            z15 = z11;
                            j6 = j13;
                            lijVar3 = lijVar5;
                            z12 = z16;
                            z13 = z15;
                            eke ekeVar2222 = this.v;
                            lij lijVar12222 = ekeVar2222.a;
                            rcc rccVar5222 = ekeVar2222.b;
                            rcc rccVar6222 = rccVar;
                            lijVar4 = lijVar3;
                            e0(lijVar4, rccVar6222, lijVar12222, rccVar5222, !dh6Var.f ? j14 : -9223372036854775807L);
                            if (!z24) {
                            }
                            eke ekeVar3222 = this.v;
                            obj2 = ekeVar3222.b.a;
                            lij lijVar13222 = ekeVar3222.a;
                            if (z24) {
                            }
                            long j15222 = this.v.d;
                            if (lijVar4.b(obj2) != -1) {
                            }
                            this.v = o(rccVar6222, j14, j7, j15222, z25, i7);
                            B();
                            D(lijVar4, this.v.a);
                            this.v = this.v.g(lijVar4);
                            if (!lijVar4.p()) {
                            }
                            k(z12);
                            throw th;
                        }
                    }
                } else {
                    try {
                        c7c c7cVar4 = this.r;
                        z11 = z14;
                        int i18 = r5;
                        try {
                            long j17 = this.J;
                            try {
                                m51[] m51VarArr2 = this.a;
                                x6c x6cVar2 = c7cVar4.i;
                                try {
                                    if (x6cVar2 == null) {
                                        lijVar6 = lijVar;
                                        j8 = j;
                                    } else {
                                        long j18 = x6cVar2.o;
                                        if (x6cVar2.d) {
                                            long j19 = j18;
                                            int i19 = i18;
                                            while (i19 < m51VarArr2.length) {
                                                if (q(m51VarArr2[i19])) {
                                                    m51 m51Var = m51VarArr2[i19];
                                                    m51VarArr = m51VarArr2;
                                                    if (m51Var.g == x6cVar2.c[i19]) {
                                                        c7cVar = c7cVar4;
                                                        i8 = i19;
                                                        long j20 = m51Var.j;
                                                        if (j20 == Long.MIN_VALUE) {
                                                            lijVar6 = lijVar;
                                                            c7cVar4 = c7cVar;
                                                            j17 = j17;
                                                            r12 = i18;
                                                            j8 = Long.MIN_VALUE;
                                                            break;
                                                        }
                                                        j19 = Math.max(j20, j19);
                                                        i19 = i8 + 1;
                                                        c7cVar4 = c7cVar;
                                                        m51VarArr2 = m51VarArr;
                                                    }
                                                } else {
                                                    m51VarArr = m51VarArr2;
                                                }
                                                c7cVar = c7cVar4;
                                                i8 = i19;
                                                i19 = i8 + 1;
                                                c7cVar4 = c7cVar;
                                                m51VarArr2 = m51VarArr;
                                            }
                                            lijVar6 = lijVar;
                                            j8 = j19;
                                            j17 = j17;
                                        } else {
                                            j8 = j18;
                                            j17 = j17;
                                            r12 = i18;
                                            lijVar6 = lijVar;
                                        }
                                        lij lijVar16 = lijVar6;
                                        lijVar10 = lijVar16;
                                        z20 = r12;
                                        z19 = z11;
                                        if (!c7cVar4.o(lijVar6, j17, j8)) {
                                            G(r12);
                                            lijVar10 = lijVar16;
                                            z20 = r12;
                                            z19 = z11;
                                        }
                                    }
                                    lij lijVar162 = lijVar6;
                                    lijVar10 = lijVar162;
                                    z20 = r12;
                                    z19 = z11;
                                    if (!c7cVar4.o(lijVar6, j17, j8)) {
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    r7 = lijVar6;
                                    rccVar = rccVar4;
                                    lijVar5 = r7;
                                    z16 = r12;
                                    z15 = z11;
                                    j6 = j13;
                                    lijVar3 = lijVar5;
                                    z12 = z16;
                                    z13 = z15;
                                    eke ekeVar22222 = this.v;
                                    lij lijVar122222 = ekeVar22222.a;
                                    rcc rccVar52222 = ekeVar22222.b;
                                    rcc rccVar62222 = rccVar;
                                    lijVar4 = lijVar3;
                                    e0(lijVar4, rccVar62222, lijVar122222, rccVar52222, !dh6Var.f ? j14 : -9223372036854775807L);
                                    if (!z24) {
                                    }
                                    eke ekeVar32222 = this.v;
                                    obj2 = ekeVar32222.b.a;
                                    lij lijVar132222 = ekeVar32222.a;
                                    if (z24) {
                                    }
                                    long j152222 = this.v.d;
                                    if (lijVar4.b(obj2) != -1) {
                                    }
                                    this.v = o(rccVar62222, j14, j7, j152222, z25, i7);
                                    B();
                                    D(lijVar4, this.v.a);
                                    this.v = this.v.g(lijVar4);
                                    if (!lijVar4.p()) {
                                    }
                                    k(z12);
                                    throw th;
                                }
                                r12 = i18;
                            } catch (Throwable th7) {
                                th = th7;
                                r7 = lijVar;
                                r12 = i18;
                                rccVar = rccVar4;
                                lijVar5 = r7;
                                z16 = r12;
                                z15 = z11;
                                j6 = j13;
                                lijVar3 = lijVar5;
                                z12 = z16;
                                z13 = z15;
                                eke ekeVar222222 = this.v;
                                lij lijVar1222222 = ekeVar222222.a;
                                rcc rccVar522222 = ekeVar222222.b;
                                rcc rccVar622222 = rccVar;
                                lijVar4 = lijVar3;
                                e0(lijVar4, rccVar622222, lijVar1222222, rccVar522222, !dh6Var.f ? j14 : -9223372036854775807L);
                                if (!z24) {
                                }
                                eke ekeVar322222 = this.v;
                                obj2 = ekeVar322222.b.a;
                                lij lijVar1322222 = ekeVar322222.a;
                                if (z24) {
                                }
                                long j1522222 = this.v.d;
                                if (lijVar4.b(obj2) != -1) {
                                }
                                this.v = o(rccVar622222, j14, j7, j1522222, z25, i7);
                                B();
                                D(lijVar4, this.v.a);
                                this.v = this.v.g(lijVar4);
                                if (!lijVar4.p()) {
                                }
                                k(z12);
                                throw th;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        r7 = lijVar;
                        z11 = z14;
                        r12 = r5;
                    }
                }
                rccVar = rccVar4;
                lijVar7 = lijVar10;
                z18 = z20;
                z17 = z19;
                eke ekeVar42 = this.v;
                lij lijVar142 = ekeVar42.a;
                rcc rccVar72 = ekeVar42.b;
                if (dh6Var.f) {
                }
                e0(lijVar8, rccVar2, lijVar142, rccVar72, j9);
                if (z24) {
                }
                eke ekeVar52 = this.v;
                obj3 = ekeVar52.b.a;
                lij lijVar152 = ekeVar52.a;
                if (z24) {
                }
                long j162 = this.v.d;
                if (lijVar8.b(obj3) != -1) {
                }
                lijVar9 = lijVar8;
                this.v = o(rccVar2, j14, j10, j162, z26, i9);
                B();
                D(lijVar9, this.v.a);
                this.v = this.v.g(lijVar9);
                if (!lijVar9.p()) {
                }
                k(z18);
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Throwable th11) {
            th = th11;
            lijVar3 = lijVar2;
            rccVar = rccVar4;
            j6 = j13;
            z12 = false;
            z13 = true;
        }
    }

    public final void m(v6c v6cVar) {
        hh6 hh6Var;
        c7c c7cVar = this.r;
        x6c x6cVar = c7cVar.j;
        if (x6cVar == null || x6cVar.a != v6cVar) {
            return;
        }
        float f = this.n.getPlaybackParameters().a;
        lij lijVar = this.v.a;
        x6cVar.d = true;
        x6cVar.m = x6cVar.a.getTrackGroups();
        gtj g = x6cVar.g(f, lijVar);
        a7c a7cVar = x6cVar.f;
        long j = a7cVar.b;
        long j2 = a7cVar.e;
        if (j2 != C.TIME_UNSET && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long a = x6cVar.a(g, j, false, new boolean[x6cVar.i.length]);
        long j3 = x6cVar.o;
        a7c a7cVar2 = x6cVar.f;
        x6cVar.o = (a7cVar2.b - a) + j3;
        x6cVar.f = a7cVar2.b(a);
        c0(x6cVar.n);
        if (x6cVar == c7cVar.h) {
            C(x6cVar.f.b);
            f(new boolean[this.a.length]);
            eke ekeVar = this.v;
            rcc rccVar = ekeVar.b;
            long j4 = x6cVar.f.b;
            hh6Var = this;
            hh6Var.v = hh6Var.o(rccVar, j4, ekeVar.c, j4, false, 5);
        } else {
            hh6Var = this;
        }
        hh6Var.s();
    }

    public final void n(gke gkeVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.w.a(1);
            }
            this.v = this.v.e(gkeVar);
        }
        float f2 = gkeVar.a;
        x6c x6cVar = this.r.h;
        while (true) {
            i = 0;
            if (x6cVar == null) {
                break;
            }
            mh6[] mh6VarArr = (mh6[]) x6cVar.n.e;
            int length = mh6VarArr.length;
            while (i < length) {
                mh6 mh6Var = mh6VarArr[i];
                if (mh6Var != null) {
                    mh6Var.onPlaybackSpeed(f2);
                }
                i++;
            }
            x6cVar = x6cVar.l;
        }
        m51[] m51VarArr = this.a;
        int length2 = m51VarArr.length;
        while (i < length2) {
            m51 m51Var = m51VarArr[i];
            if (m51Var != null) {
                m51Var.t(f, gkeVar.a);
            }
            i++;
        }
    }

    public final eke o(rcc rccVar, long j, long j2, long j3, boolean z, int i) {
        vvf vvfVar;
        this.L = (!this.L && j == this.v.r && rccVar.equals(this.v.b)) ? false : true;
        B();
        eke ekeVar = this.v;
        psj psjVar = ekeVar.h;
        gtj gtjVar = ekeVar.i;
        List list = ekeVar.j;
        if (this.s.g) {
            x6c x6cVar = this.r.h;
            psjVar = x6cVar == null ? psj.d : x6cVar.m;
            gtjVar = x6cVar == null ? this.e : x6cVar.n;
            mh6[] mh6VarArr = (mh6[]) gtjVar.e;
            zu9 zu9Var = new zu9(4);
            boolean z2 = false;
            for (mh6 mh6Var : mh6VarArr) {
                if (mh6Var != null) {
                    Metadata metadata = mh6Var.getFormat(0).j;
                    if (metadata == null) {
                        zu9Var.c(new Metadata(new Metadata.Entry[0]));
                    } else {
                        zu9Var.c(metadata);
                        z2 = true;
                    }
                }
            }
            if (z2) {
                vvfVar = zu9Var.g();
            } else {
                av9 av9Var = hv9.b;
                vvfVar = vvf.e;
            }
            list = vvfVar;
            if (x6cVar != null) {
                a7c a7cVar = x6cVar.f;
                if (a7cVar.c != j2) {
                    x6cVar.f = a7cVar.a(j2);
                }
            }
        } else if (!rccVar.equals(ekeVar.b)) {
            psjVar = psj.d;
            gtjVar = this.e;
            av9 av9Var2 = hv9.b;
            list = vvf.e;
        }
        gtj gtjVar2 = gtjVar;
        List list2 = list;
        psj psjVar2 = psjVar;
        if (z) {
            ch6 ch6Var = this.w;
            if (!ch6Var.d || ch6Var.e == 5) {
                ch6Var.a = true;
                ch6Var.d = true;
                ch6Var.e = i;
            } else {
                qx9.r(i == 5);
            }
        }
        eke ekeVar2 = this.v;
        long j4 = ekeVar2.p;
        x6c x6cVar2 = this.r.j;
        return ekeVar2.b(rccVar, j, j2, j3, x6cVar2 == null ? 0L : Math.max(0L, j4 - (this.J - x6cVar2.o)), psjVar2, gtjVar2, list2);
    }

    public final boolean p() {
        x6c x6cVar = this.r.j;
        if (x6cVar == null) {
            return false;
        }
        return (!x6cVar.d ? 0L : x6cVar.a.getNextLoadPositionUs()) != Long.MIN_VALUE;
    }

    public final boolean r() {
        x6c x6cVar = this.r.h;
        long j = x6cVar.f.e;
        if (x6cVar.d) {
            return j == C.TIME_UNSET || this.v.r < j || !W();
        }
        return false;
    }

    public final void s() {
        boolean c;
        if (p()) {
            x6c x6cVar = this.r.j;
            long nextLoadPositionUs = !x6cVar.d ? 0L : x6cVar.a.getNextLoadPositionUs();
            x6c x6cVar2 = this.r.j;
            long max = x6cVar2 == null ? 0L : Math.max(0L, nextLoadPositionUs - (this.J - x6cVar2.o));
            x6c x6cVar3 = this.r.h;
            c = this.f.c(max, this.n.getPlaybackParameters().a);
            if (!c && max < 500000 && this.m > 0) {
                this.r.h.a.e(this.v.r);
                c = this.f.c(max, this.n.getPlaybackParameters().a);
            }
        } else {
            c = false;
        }
        this.B = c;
        if (c) {
            x6c x6cVar4 = this.r.j;
            long j = this.J;
            qx9.t(x6cVar4.l == null);
            x6cVar4.a.continueLoading(j - x6cVar4.o);
        }
        b0();
    }

    public final void t() {
        ch6 ch6Var = this.w;
        eke ekeVar = this.v;
        boolean z = ch6Var.a | (ch6Var.b != ekeVar);
        ch6Var.a = z;
        ch6Var.b = ekeVar;
        if (z) {
            ug6 ug6Var = this.q.a;
            ug6Var.i.a.post(new yq5(2, ug6Var, ch6Var));
            this.w = new ch6(this.v);
        }
    }

    public final void u() {
        l(this.s.d(), true);
    }

    public final void v() {
        this.w.a(1);
        throw null;
    }

    public final void w() {
        this.w.a(1);
        A(false, false, false, true);
        this.f.b(false);
        V(this.v.a.p() ? 4 : 2);
        sn4 sn4Var = this.g;
        sn4Var.getClass();
        tdc tdcVar = this.s;
        ArrayList arrayList = (ArrayList) tdcVar.b;
        qx9.t(!tdcVar.g);
        tdcVar.m = sn4Var;
        for (int i = 0; i < arrayList.size(); i++) {
            rdc rdcVar = (rdc) arrayList.get(i);
            tdcVar.i(rdcVar);
            ((HashSet) tdcVar.f).add(rdcVar);
        }
        tdcVar.g = true;
        this.h.c(2);
    }

    public final void x() {
        A(true, false, true, false);
        this.f.b(true);
        V(1);
        this.i.quit();
        synchronized (this) {
            this.x = true;
            notifyAll();
        }
    }

    public final void y(int i, int i2, xfh xfhVar) {
        this.w.a(1);
        tdc tdcVar = this.s;
        tdcVar.getClass();
        qx9.r(i >= 0 && i <= i2 && i2 <= ((ArrayList) tdcVar.b).size());
        tdcVar.l = xfhVar;
        tdcVar.m(i, i2);
        l(tdcVar.d(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final void z() {
        int i;
        boolean z;
        float f = this.n.getPlaybackParameters().a;
        c7c c7cVar = this.r;
        x6c x6cVar = c7cVar.h;
        x6c x6cVar2 = c7cVar.i;
        boolean z2 = true;
        for (x6c x6cVar3 = x6cVar; x6cVar3 != null && x6cVar3.d; x6cVar3 = x6cVar3.l) {
            gtj g = x6cVar3.g(f, this.v.a);
            gtj gtjVar = x6cVar3.n;
            mh6[] mh6VarArr = (mh6[]) g.e;
            boolean z3 = false;
            if (gtjVar != null && ((mh6[]) gtjVar.e).length == mh6VarArr.length) {
                for (int i2 = 0; i2 < mh6VarArr.length; i2++) {
                    if (g.p(gtjVar, i2)) {
                    }
                }
                if (x6cVar3 == x6cVar2) {
                    z2 = false;
                }
            }
            c7c c7cVar2 = this.r;
            if (z2) {
                x6c x6cVar4 = c7cVar2.h;
                boolean k = c7cVar2.k(x6cVar4);
                boolean[] zArr = new boolean[this.a.length];
                long a = x6cVar4.a(g, this.v.r, k, zArr);
                eke ekeVar = this.v;
                if (ekeVar.e == 4 || a == ekeVar.r) {
                    z = false;
                } else {
                    z = false;
                    z3 = true;
                }
                eke ekeVar2 = this.v;
                boolean z4 = z;
                i = 4;
                this.v = o(ekeVar2.b, a, ekeVar2.c, ekeVar2.d, z3, 5);
                if (z3) {
                    C(a);
                }
                boolean[] zArr2 = new boolean[this.a.length];
                ?? r8 = z4;
                while (true) {
                    m51[] m51VarArr = this.a;
                    if (r8 >= m51VarArr.length) {
                        break;
                    }
                    m51 m51Var = m51VarArr[r8];
                    boolean q = q(m51Var);
                    zArr2[r8] = q;
                    ipg ipgVar = x6cVar4.c[r8];
                    if (q) {
                        if (ipgVar != m51Var.g) {
                            c(m51Var);
                        } else if (zArr[r8]) {
                            long j = this.J;
                            m51Var.k = z4;
                            m51Var.j = j;
                            m51Var.k(j, z4);
                        }
                    }
                    r8++;
                }
                f(zArr2);
            } else {
                i = 4;
                c7cVar2.k(x6cVar3);
                if (x6cVar3.d) {
                    x6cVar3.a(g, Math.max(x6cVar3.f.b, this.J - x6cVar3.o), false, new boolean[x6cVar3.i.length]);
                }
            }
            k(true);
            if (this.v.e != i) {
                s();
                d0();
                this.h.c(2);
                return;
            }
            return;
        }
    }
}
