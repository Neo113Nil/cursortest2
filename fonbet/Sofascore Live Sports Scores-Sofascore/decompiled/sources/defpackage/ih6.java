package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.b;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ih6 implements Handler.Callback, u6c, npk {
    public static final long f0 = nik.h0(Ua.s);
    public d0h A;
    public vvg B;
    public boolean C;
    public boolean D;
    public gh6 E;
    public int F;
    public fke G;
    public w2d H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public long M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public gh6 U;
    public long V;
    public long W;
    public int X;
    public boolean Y;
    public tf6 Z;
    public final tyf[] a;
    public long a0;
    public final n51[] b;
    public xf6 b0;
    public final boolean[] c;
    public long c0;
    public final iu4 d;
    public boolean d0;
    public final gtj e;
    public float e0;
    public final yq4 f;
    public final tn4 g;
    public final zqi h;
    public final fig i;
    public final Looper j;
    public final kij k;
    public final iij l;
    public final long m;
    public final boolean n;
    public final ar4 o;
    public final ArrayList p;
    public final eg6 q;
    public final d7c r;
    public final tdc s;
    public final uq4 t;
    public final cse u;
    public final cn4 v;
    public final zqi w;
    public final boolean x;
    public final sn0 y;
    public final boolean z;

    public ih6(Context context, n51[] n51VarArr, n51[] n51VarArr2, iu4 iu4Var, gtj gtjVar, yq4 yq4Var, tn4 tn4Var, int i, boolean z, cn4 cn4Var, d0h d0hVar, uq4 uq4Var, boolean z2, Looper looper, eg6 eg6Var, cse cseVar, final npk npkVar) {
        Looper looper2;
        xf6 xf6Var = xf6.a;
        this.c0 = C.TIME_UNSET;
        this.q = eg6Var;
        this.d = iu4Var;
        this.e = gtjVar;
        this.f = yq4Var;
        this.g = tn4Var;
        this.O = i;
        this.P = z;
        this.A = d0hVar;
        this.t = uq4Var;
        this.J = z2;
        this.u = cseVar;
        this.b0 = xf6Var;
        this.v = cn4Var;
        this.e0 = 1.0f;
        this.B = vvg.b;
        this.z = true;
        this.a0 = C.TIME_UNSET;
        this.M = C.TIME_UNSET;
        this.m = yq4Var.n;
        this.n = yq4Var.o;
        gij gijVar = mij.a;
        fke k = fke.k(gtjVar);
        this.G = k;
        this.H = new w2d(k);
        this.b = new n51[n51VarArr.length];
        this.c = new boolean[n51VarArr.length];
        iu4Var.getClass();
        this.a = new tyf[n51VarArr.length];
        boolean z3 = false;
        boolean z4 = false;
        for (int i2 = 0; i2 < n51VarArr.length; i2++) {
            n51 n51Var = n51VarArr[i2];
            tqi tqiVar = tqi.a;
            n51Var.e = i2;
            n51Var.f = cseVar;
            n51Var.g = tqiVar;
            this.b[i2] = n51Var;
            n51 n51Var2 = this.b[i2];
            synchronized (n51Var2.a) {
                n51Var2.r = iu4Var;
            }
            n51 n51Var3 = n51VarArr2[i2];
            if (n51Var3 != null) {
                n51Var3.e = i2;
                n51Var3.f = cseVar;
                n51Var3.g = tqiVar;
                z4 = true;
            }
            this.a[i2] = new tyf(i2, n51VarArr[i2], n51Var3);
        }
        this.x = z4;
        this.o = new ar4(this);
        this.p = new ArrayList();
        this.k = new kij();
        this.l = new iij();
        z1a.E(iu4Var.a == null);
        iu4Var.a = this;
        iu4Var.b = tn4Var;
        this.Y = true;
        zqi zqiVar = new zqi(new Handler(looper, null));
        this.w = zqiVar;
        this.r = new d7c(cn4Var, zqiVar, new kt4(this, 14));
        this.s = new tdc(this, cn4Var, zqiVar, cseVar);
        fig figVar = new fig();
        this.i = figVar;
        synchronized (figVar.b) {
            try {
                looper2 = (Looper) figVar.c;
                if (looper2 == null) {
                    if (figVar.a == 0 && ((HandlerThread) figVar.d) == null) {
                        z3 = true;
                    }
                    z1a.E(z3);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    figVar.d = handlerThread;
                    handlerThread.start();
                    looper2 = ((HandlerThread) figVar.d).getLooper();
                    figVar.c = looper2;
                }
                figVar.a++;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.j = looper2;
        zqi zqiVar2 = new zqi(new Handler(looper2, this));
        this.h = zqiVar2;
        this.y = new sn0(context, looper2, this);
        zqiVar2.c(35, new npk() { // from class: wg6
            @Override // defpackage.npk
            public final void c(long j, long j2, b bVar, MediaFormat mediaFormat) {
                npkVar.c(j, j2, bVar, mediaFormat);
                ih6.this.c(j, j2, bVar, mediaFormat);
            }
        }).b();
        zqiVar2.c(39, new xg6(this)).b();
    }

    public static Pair R(mij mijVar, gh6 gh6Var, boolean z, int i, boolean z2, kij kijVar, iij iijVar) {
        int S;
        mij mijVar2 = gh6Var.a;
        if (mijVar.p()) {
            return null;
        }
        mij mijVar3 = mijVar2.p() ? mijVar : mijVar2;
        try {
            Pair i2 = mijVar3.i(kijVar, iijVar, gh6Var.b, gh6Var.c);
            if (!mijVar.equals(mijVar3)) {
                if (mijVar.b(i2.first) == -1) {
                    if (!z || (S = S(kijVar, iijVar, i, z2, i2.first, mijVar3, mijVar)) == -1) {
                        return null;
                    }
                    return mijVar.i(kijVar, iijVar, S, C.TIME_UNSET);
                }
                if (mijVar3.g(i2.first, iijVar).f && mijVar3.m(iijVar.c, kijVar, 0L).m == mijVar3.b(i2.first)) {
                    return mijVar.i(kijVar, iijVar, mijVar.g(i2.first, iijVar).c, gh6Var.c);
                }
            }
            return i2;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int S(kij kijVar, iij iijVar, int i, boolean z, Object obj, mij mijVar, mij mijVar2) {
        kij kijVar2 = kijVar;
        mij mijVar3 = mijVar;
        Object obj2 = mijVar3.m(mijVar3.g(obj, iijVar).c, kijVar, 0L).a;
        for (int i2 = 0; i2 < mijVar2.o(); i2++) {
            if (mijVar2.m(i2, kijVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int b = mijVar3.b(obj);
        int h = mijVar3.h();
        int i3 = -1;
        int i4 = 0;
        while (i4 < h && i3 == -1) {
            mij mijVar4 = mijVar3;
            int d = mijVar4.d(b, iijVar, kijVar2, i, z);
            if (d == -1) {
                break;
            }
            i3 = mijVar2.b(mijVar4.l(d));
            i4++;
            mijVar3 = mijVar4;
            b = d;
            kijVar2 = kijVar;
        }
        if (i3 == -1) {
            return -1;
        }
        return mijVar2.f(i3, iijVar, false).c;
    }

    public static boolean y(y6c y6cVar) {
        if (y6cVar != null) {
            try {
                w6c w6cVar = y6cVar.a;
                if (y6cVar.e) {
                    for (jpg jpgVar : y6cVar.c) {
                        if (jpgVar != null) {
                            jpgVar.maybeThrowError();
                        }
                    }
                } else {
                    w6cVar.maybeThrowPrepareError();
                }
                if ((!y6cVar.e ? 0L : w6cVar.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A() {
        y6c y6cVar = (y6c) this.r.m;
        long j = y6cVar.g.f;
        if (y6cVar.e) {
            return j == C.TIME_UNSET || this.G.s < j || !p0();
        }
        return false;
    }

    public final void A0(mij mijVar, scc sccVar, mij mijVar2, scc sccVar2, long j, boolean z) {
        boolean q0 = q0(mijVar, sccVar);
        Object obj = sccVar.a;
        if (!q0) {
            hke hkeVar = sccVar.b() ? hke.d : this.G.o;
            ar4 ar4Var = this.o;
            if (ar4Var.mo9getPlaybackParameters().equals(hkeVar)) {
                return;
            }
            this.h.f(16);
            ar4Var.b(hkeVar);
            w(this.G.o, hkeVar.a, false, false);
            return;
        }
        iij iijVar = this.l;
        int i = mijVar.g(obj, iijVar).c;
        kij kijVar = this.k;
        mijVar.n(i, kijVar);
        u5c u5cVar = kijVar.i;
        String str = nik.a;
        long T = nik.T(u5cVar.a);
        uq4 uq4Var = this.t;
        uq4Var.d = T;
        uq4Var.g = nik.T(u5cVar.b);
        uq4Var.h = nik.T(u5cVar.c);
        float f = u5cVar.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        uq4Var.k = f;
        float f2 = u5cVar.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        uq4Var.j = f2;
        if (f == 1.0f && f2 == 1.0f) {
            uq4Var.d = C.TIME_UNSET;
        }
        uq4Var.a();
        if (j != C.TIME_UNSET) {
            uq4Var.e = l(mijVar, obj, j);
            uq4Var.a();
            return;
        }
        if (!Objects.equals(!mijVar2.p() ? mijVar2.m(mijVar2.g(sccVar2.a, iijVar).c, kijVar, 0L).a : null, kijVar.a) || z) {
            uq4Var.e = C.TIME_UNSET;
            uq4Var.a();
        }
    }

    public final void B() {
        boolean b;
        if (y((y6c) this.r.p)) {
            y6c y6cVar = (y6c) this.r.p;
            long o = o(!y6cVar.e ? 0L : y6cVar.a.getNextLoadPositionUs());
            Object obj = this.r.m;
            long j = q0(this.G.a, y6cVar.g.a) ? this.t.i : -9223372036854775807L;
            cse cseVar = this.u;
            mij mijVar = this.G.a;
            scc sccVar = y6cVar.g.a;
            float f = this.o.mo9getPlaybackParameters().a;
            boolean z = this.G.l;
            ifb ifbVar = new ifb(cseVar, mijVar, sccVar, o, f, this.L, j);
            b = this.f.b(ifbVar);
            y6c y6cVar2 = (y6c) this.r.m;
            if (!b && y6cVar2.e && o < 500000 && (this.m > 0 || this.n)) {
                y6cVar2.a.discardBuffer(this.G.s, false);
                b = this.f.b(ifbVar);
            }
        } else {
            b = false;
        }
        this.N = b;
        if (b) {
            y6c y6cVar3 = (y6c) this.r.p;
            y6cVar3.getClass();
            lgb lgbVar = new lgb();
            lgbVar.a = this.V - y6cVar3.p;
            float f2 = this.o.mo9getPlaybackParameters().a;
            z1a.s(f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 == -3.4028235E38f);
            lgbVar.b = f2;
            long j2 = this.M;
            z1a.s(j2 >= 0 || j2 == C.TIME_UNSET);
            lgbVar.c = j2;
            mgb mgbVar = new mgb(lgbVar);
            z1a.E(y6cVar3.m == null);
            y6cVar3.a.g(mgbVar);
        }
        u0();
    }

    public final void B0(boolean z, boolean z2) {
        this.L = z;
        this.M = (!z || z2) ? C.TIME_UNSET : SystemClock.elapsedRealtime();
    }

    public final void C() {
        d7c d7cVar = this.r;
        d7cVar.j();
        y6c y6cVar = (y6c) d7cVar.q;
        if (y6cVar != null) {
            w6c w6cVar = y6cVar.a;
            if ((!y6cVar.d || y6cVar.e) && !w6cVar.isLoading()) {
                mij mijVar = this.G.a;
                if (y6cVar.e) {
                    w6cVar.getBufferedPositionUs();
                }
                Iterator it = this.f.q.values().iterator();
                while (it.hasNext()) {
                    if (((wq4) it.next()).b) {
                        return;
                    }
                }
                if (!y6cVar.d) {
                    long j = y6cVar.g.b;
                    y6cVar.d = true;
                    w6cVar.f(this, j);
                    return;
                }
                lgb lgbVar = new lgb();
                lgbVar.a = this.V - y6cVar.p;
                float f = this.o.mo9getPlaybackParameters().a;
                z1a.s(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f == -3.4028235E38f);
                lgbVar.b = f;
                long j2 = this.M;
                z1a.s(j2 >= 0 || j2 == C.TIME_UNSET);
                lgbVar.c = j2;
                mgb mgbVar = new mgb(lgbVar);
                z1a.E(y6cVar.m == null);
                w6cVar.g(mgbVar);
            }
        }
    }

    public final void D() {
        w2d w2dVar = this.H;
        fke fkeVar = this.G;
        boolean z = w2dVar.c | (((fke) w2dVar.e) != fkeVar);
        w2dVar.c = z;
        w2dVar.e = fkeVar;
        if (z) {
            vg6 vg6Var = this.q.a;
            int i = vg6.r0;
            vg6Var.j.e(new yq5(3, vg6Var, w2dVar));
            this.H = new w2d(this.G);
        }
    }

    public final void E(int i) {
        tyf tyfVar = this.a[i];
        try {
            y6c y6cVar = (y6c) this.r.m;
            y6cVar.getClass();
            n51 d = tyfVar.d(y6cVar);
            d.getClass();
            jpg jpgVar = d.i;
            jpgVar.getClass();
            jpgVar.maybeThrowError();
        } catch (IOException | RuntimeException e) {
            int i2 = ((n51) tyfVar.e).b;
            if (i2 != 3 && i2 != 5) {
                throw e;
            }
            gtj gtjVar = ((y6c) this.r.m).o;
            tgj.A("Disabling track due to error: ".concat(b.c(((nh6[]) gtjVar.e)[i].getSelectedFormat())), e);
            gtj gtjVar2 = new gtj((syf[]) ((syf[]) gtjVar.d).clone(), (nh6[]) ((nh6[]) gtjVar.e).clone(), (uuj) gtjVar.f, gtjVar.c);
            ((syf[]) gtjVar2.d)[i] = null;
            ((nh6[]) gtjVar2.e)[i] = null;
            h(i);
            y6c y6cVar2 = (y6c) this.r.m;
            y6cVar2.a(gtjVar2, this.G.s, false, new boolean[y6cVar2.j.length]);
        }
    }

    public final void F(int i, boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.w.e(new pn0(this, i, z));
        }
    }

    public final void G() {
        u(this.s.e(), true);
    }

    public final void H() {
        this.H.c(1);
        throw null;
    }

    public final void I() {
        this.H.c(1);
        N(false, false, false, true);
        yq4 yq4Var = this.f;
        ConcurrentHashMap concurrentHashMap = yq4Var.q;
        long id = Thread.currentThread().getId();
        long j = yq4Var.r;
        z1a.D("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        yq4Var.r = id;
        cse cseVar = this.u;
        wq4 wq4Var = (wq4) concurrentHashMap.get(cseVar);
        if (wq4Var == null) {
            wq4 wq4Var2 = new wq4();
            wq4Var2.a = 1;
            concurrentHashMap.put(cseVar, wq4Var2);
        } else {
            wq4Var.a++;
        }
        wq4 wq4Var3 = (wq4) concurrentHashMap.get(cseVar);
        wq4Var3.getClass();
        Integer num = (Integer) yq4Var.p.get(cseVar.a);
        int intValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (intValue == -1) {
            intValue = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        wq4Var3.c = intValue;
        wq4Var3.b = false;
        l0(this.G.a.p() ? 4 : 2);
        fke fkeVar = this.G;
        boolean z = fkeVar.l;
        y0(this.y.c(fkeVar.e, z), fkeVar.n, fkeVar.m, z);
        tn4 tn4Var = this.g;
        tn4Var.getClass();
        tdc tdcVar = this.s;
        ArrayList arrayList = (ArrayList) tdcVar.b;
        z1a.E(!tdcVar.g);
        tdcVar.m = tn4Var;
        for (int i = 0; i < arrayList.size(); i++) {
            sdc sdcVar = (sdc) arrayList.get(i);
            tdcVar.j(sdcVar);
            ((HashSet) tdcVar.f).add(sdcVar);
        }
        tdcVar.g = true;
        this.h.g(2);
    }

    public final void J(yh3 yh3Var) {
        fig figVar = this.i;
        zqi zqiVar = this.h;
        try {
            N(true, false, true, false);
            K();
            yq4 yq4Var = this.f;
            cse cseVar = this.u;
            ConcurrentHashMap concurrentHashMap = yq4Var.q;
            wq4 wq4Var = (wq4) concurrentHashMap.get(cseVar);
            if (wq4Var != null) {
                int i = wq4Var.a - 1;
                wq4Var.a = i;
                if (i == 0) {
                    concurrentHashMap.remove(cseVar);
                    yq4Var.c();
                }
            }
            if (yq4Var.q.isEmpty()) {
                yq4Var.r = -1L;
            }
            sn0 sn0Var = this.y;
            sn0Var.c = null;
            sn0Var.a();
            sn0Var.b(0);
            this.d.k();
            l0(1);
        } finally {
            zqiVar.a.removeCallbacksAndMessages(null);
            figVar.d();
            yh3Var.c();
        }
    }

    public final void K() {
        for (int i = 0; i < this.a.length; i++) {
            n51 n51Var = this.b[i];
            synchronized (n51Var.a) {
                n51Var.r = null;
            }
            tyf tyfVar = this.a[i];
            n51 n51Var2 = (n51) tyfVar.e;
            z1a.E(n51Var2.h == 0);
            n51Var2.p();
            tyfVar.a = false;
            n51 n51Var3 = (n51) tyfVar.f;
            if (n51Var3 != null) {
                z1a.E(n51Var3.h == 0);
                n51Var3.p();
                tyfVar.b = false;
            }
        }
    }

    public final void L(int i, int i2, yfh yfhVar) {
        this.H.c(1);
        tdc tdcVar = this.s;
        tdcVar.getClass();
        z1a.s(i >= 0 && i <= i2 && i2 <= ((ArrayList) tdcVar.b).size());
        tdcVar.l = yfhVar;
        tdcVar.m(i, i2);
        u(tdcVar.e(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        int i;
        int i2;
        boolean z;
        float f = this.o.mo9getPlaybackParameters().a;
        d7c d7cVar = this.r;
        y6c y6cVar = (y6c) d7cVar.m;
        y6c y6cVar2 = (y6c) d7cVar.n;
        gtj gtjVar = null;
        y6c y6cVar3 = y6cVar;
        boolean z2 = true;
        while (y6cVar3 != null && y6cVar3.e) {
            fke fkeVar = this.G;
            gtj j = y6cVar3.j(f, fkeVar.a, fkeVar.l);
            gtj gtjVar2 = y6cVar3 == ((y6c) this.r.m) ? j : gtjVar;
            gtj gtjVar3 = y6cVar3.o;
            nh6[] nh6VarArr = (nh6[]) j.e;
            boolean z3 = false;
            if (((nh6[]) gtjVar3.e).length == nh6VarArr.length) {
                int i3 = 0;
                while (i3 < nh6VarArr.length) {
                    if (j.q(gtjVar3, i3)) {
                        i3++;
                        y6cVar3 = y6cVar3;
                    }
                }
                y6c y6cVar4 = y6cVar3;
                if (y6cVar4 == y6cVar2) {
                    z2 = false;
                }
                y6cVar3 = y6cVar4.m;
                gtjVar = gtjVar2;
            }
            d7c d7cVar2 = this.r;
            if (z2) {
                y6c y6cVar5 = (y6c) d7cVar2.m;
                boolean z4 = (d7cVar2.m(y6cVar5) & 1) != 0;
                boolean[] zArr = new boolean[this.a.length];
                gtjVar2.getClass();
                long a = y6cVar5.a(gtjVar2, this.G.s, z4, zArr);
                fke fkeVar2 = this.G;
                if (fkeVar2.e == 4 || a == fkeVar2.s) {
                    z = false;
                } else {
                    z = false;
                    z3 = true;
                }
                fke fkeVar3 = this.G;
                boolean z5 = z;
                i = 4;
                this.G = x(fkeVar3.b, a, fkeVar3.c, fkeVar3.d, z3, 5);
                if (z3) {
                    P(a, true);
                }
                g();
                boolean[] zArr2 = new boolean[this.a.length];
                int i4 = z5;
                while (true) {
                    tyf[] tyfVarArr = this.a;
                    if (i4 >= tyfVarArr.length) {
                        break;
                    }
                    int c = tyfVarArr[i4].c();
                    zArr2[i4] = this.a[i4].g();
                    tyf tyfVar = this.a[i4];
                    jpg jpgVar = y6cVar5.c[i4];
                    ar4 ar4Var = this.o;
                    long j2 = this.V;
                    boolean z6 = zArr[i4];
                    n51 n51Var = (n51) tyfVar.e;
                    if (tyf.h(n51Var)) {
                        if (jpgVar != n51Var.i) {
                            tyfVar.a(n51Var, ar4Var);
                        } else if (z6) {
                            n51Var.y(j2, z5, true);
                        }
                    }
                    n51 n51Var2 = (n51) tyfVar.f;
                    if (n51Var2 != null && tyf.h(n51Var2)) {
                        if (jpgVar != n51Var2.i) {
                            tyfVar.a(n51Var2, ar4Var);
                        } else if (z6) {
                            n51Var2.y(j2, z5, true);
                        }
                    }
                    if (c - this.a[i4].c() > 0) {
                        F(i4, z5);
                    }
                    this.T -= c - this.a[i4].c();
                    i4++;
                }
                k(zArr2, this.V);
                y6cVar5.h = true;
            } else {
                i = 4;
                d7cVar2.m(y6cVar3);
                if (y6cVar3.e) {
                    long max = Math.max(y6cVar3.g.b, this.V - y6cVar3.p);
                    if (this.x && f() && ((y6c) this.r.o) == y6cVar3) {
                        g();
                    }
                    i2 = 4;
                    y6cVar3.a(j, max, false, new boolean[y6cVar3.j.length]);
                    t(true);
                    if (this.G.e == i2) {
                        B();
                        z0();
                        this.h.g(2);
                        return;
                    }
                    return;
                }
            }
            i2 = i;
            t(true);
            if (this.G.e == i2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        mij mijVar;
        mij mijVar2;
        List list;
        this.h.f(2);
        this.D = false;
        if (this.E != null) {
            this.H.c(1);
            this.E = null;
        }
        this.Z = null;
        B0(false, true);
        ar4 ar4Var = this.o;
        ar4Var.c = false;
        i9i i9iVar = (i9i) ar4Var.d;
        if (i9iVar.a) {
            i9iVar.a(i9iVar.getPositionUs());
            i9iVar.a = false;
        }
        this.V = 1000000000000L;
        for (int i = 0; i < this.a.length; i++) {
            try {
                h(i);
            } catch (RuntimeException e) {
                e = e;
                tgj.A("Disable failed.", e);
                if (z) {
                }
                this.T = 0;
                fke fkeVar = this.G;
                scc sccVar = fkeVar.b;
                long j4 = fkeVar.s;
                if (!this.G.b.b()) {
                }
                j = this.G.c;
                if (z2) {
                }
                this.r.b();
                this.N = false;
                mijVar = this.G.a;
                if (z3) {
                }
                mijVar2 = mijVar;
                fke fkeVar2 = this.G;
                int i2 = fkeVar2.e;
                if (!z4) {
                }
                qsj qsjVar = !z5 ? qsj.d : fkeVar2.h;
                gtj gtjVar = !z5 ? this.e : fkeVar2.i;
                if (z5) {
                }
                this.G = new fke(mijVar2, sccVar, j3, j2, i2, r13, false, qsjVar, gtjVar, list, sccVar, fkeVar2.l, fkeVar2.m, fkeVar2.n, fkeVar2.o, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            } catch (tf6 e2) {
                e = e2;
                tgj.A("Disable failed.", e);
                if (z) {
                }
                this.T = 0;
                fke fkeVar3 = this.G;
                scc sccVar2 = fkeVar3.b;
                long j42 = fkeVar3.s;
                if (!this.G.b.b()) {
                }
                j = this.G.c;
                if (z2) {
                }
                this.r.b();
                this.N = false;
                mijVar = this.G.a;
                if (z3) {
                }
                mijVar2 = mijVar;
                fke fkeVar22 = this.G;
                int i22 = fkeVar22.e;
                if (!z4) {
                }
                qsj qsjVar2 = !z5 ? qsj.d : fkeVar22.h;
                gtj gtjVar2 = !z5 ? this.e : fkeVar22.i;
                if (z5) {
                }
                this.G = new fke(mijVar2, sccVar2, j3, j2, i22, r13, false, qsjVar2, gtjVar2, list, sccVar2, fkeVar22.l, fkeVar22.m, fkeVar22.n, fkeVar22.o, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            }
        }
        this.c0 = C.TIME_UNSET;
        if (z) {
            for (tyf tyfVar : this.a) {
                try {
                    tyfVar.k();
                } catch (RuntimeException e3) {
                    tgj.A("Reset failed.", e3);
                }
            }
        }
        this.T = 0;
        fke fkeVar32 = this.G;
        scc sccVar22 = fkeVar32.b;
        long j422 = fkeVar32.s;
        if (!this.G.b.b()) {
            fke fkeVar4 = this.G;
            iij iijVar = this.l;
            scc sccVar3 = fkeVar4.b;
            mij mijVar3 = fkeVar4.a;
            if (!mijVar3.p() && !mijVar3.g(sccVar3.a, iijVar).f) {
                j = this.G.s;
                if (z2) {
                    long j5 = j;
                    j2 = j422;
                    j3 = j5;
                    z5 = false;
                } else {
                    this.U = null;
                    Pair n = n(this.G.a);
                    sccVar22 = (scc) n.first;
                    long longValue = ((Long) n.second).longValue();
                    z5 = sccVar22.equals(this.G.b) ? false : true;
                    j2 = longValue;
                    j3 = -9223372036854775807L;
                }
                this.r.b();
                this.N = false;
                mijVar = this.G.a;
                if (z3 || !(mijVar instanceof sye)) {
                    mijVar2 = mijVar;
                } else {
                    sye syeVar = (sye) mijVar;
                    yfh yfhVar = (yfh) this.s.l;
                    mij[] mijVarArr = syeVar.h;
                    mij[] mijVarArr2 = new mij[mijVarArr.length];
                    for (int i3 = 0; i3 < mijVarArr.length; i3++) {
                        mijVarArr2[i3] = new qye(mijVarArr[i3]);
                    }
                    mijVar2 = new sye(mijVarArr2, syeVar.i, yfhVar);
                    if (sccVar22.b != -1) {
                        mijVar2.g(sccVar22.a, this.l);
                        int i4 = this.l.c;
                        kij kijVar = this.k;
                        mijVar2.m(i4, kijVar, 0L);
                        if (kijVar.a()) {
                            sccVar22 = new scc(sccVar22.a, sccVar22.d);
                        }
                    }
                }
                fke fkeVar222 = this.G;
                int i222 = fkeVar222.e;
                tf6 tf6Var = !z4 ? null : fkeVar222.f;
                qsj qsjVar22 = !z5 ? qsj.d : fkeVar222.h;
                gtj gtjVar22 = !z5 ? this.e : fkeVar222.i;
                if (z5) {
                    list = fkeVar222.j;
                } else {
                    av9 av9Var = hv9.b;
                    list = vvf.e;
                }
                this.G = new fke(mijVar2, sccVar22, j3, j2, i222, tf6Var, false, qsjVar22, gtjVar22, list, sccVar22, fkeVar222.l, fkeVar222.m, fkeVar222.n, fkeVar222.o, j2, 0L, j2, 0L, false);
                if (z3) {
                    return;
                }
                d7c d7cVar = this.r;
                if (!d7cVar.g.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i5 = 0; i5 < d7cVar.g.size(); i5++) {
                        ((y6c) d7cVar.g.get(i5)).i();
                    }
                    d7cVar.g = arrayList;
                    d7cVar.q = null;
                    d7cVar.j();
                }
                tdc tdcVar = this.s;
                HashMap hashMap = (HashMap) tdcVar.e;
                for (qdc qdcVar : hashMap.values()) {
                    try {
                        ((b51) qdcVar.a).o(qdcVar.b);
                    } catch (RuntimeException e4) {
                        tgj.A("Failed to release child source.", e4);
                    }
                    vcc vccVar = qdcVar.a;
                    odc odcVar = qdcVar.c;
                    ((b51) vccVar).r(odcVar);
                    ((b51) qdcVar.a).q(odcVar);
                }
                hashMap.clear();
                ((HashSet) tdcVar.f).clear();
                tdcVar.g = false;
                return;
            }
        }
        j = this.G.c;
        if (z2) {
        }
        this.r.b();
        this.N = false;
        mijVar = this.G.a;
        if (z3) {
        }
        mijVar2 = mijVar;
        fke fkeVar2222 = this.G;
        int i2222 = fkeVar2222.e;
        if (!z4) {
        }
        qsj qsjVar222 = !z5 ? qsj.d : fkeVar2222.h;
        gtj gtjVar222 = !z5 ? this.e : fkeVar2222.i;
        if (z5) {
        }
        this.G = new fke(mijVar2, sccVar22, j3, j2, i2222, tf6Var, false, qsjVar222, gtjVar222, list, sccVar22, fkeVar2222.l, fkeVar2222.m, fkeVar2222.n, fkeVar2222.o, j2, 0L, j2, 0L, false);
        if (z3) {
        }
    }

    public final void O() {
        y6c y6cVar = (y6c) this.r.m;
        this.K = y6cVar != null && y6cVar.g.j && this.J;
    }

    public final void P(long j, boolean z) {
        d7c d7cVar = this.r;
        y6c y6cVar = (y6c) d7cVar.m;
        long j2 = j + (y6cVar == null ? 1000000000000L : y6cVar.p);
        this.V = j2;
        ((i9i) this.o.d).a(j2);
        for (tyf tyfVar : this.a) {
            long j3 = this.V;
            n51 d = tyfVar.d(y6cVar);
            if (d != null) {
                d.y(j3, false, z);
            }
        }
        for (y6c y6cVar2 = (y6c) d7cVar.m; y6cVar2 != null; y6cVar2 = y6cVar2.m) {
            for (nh6 nh6Var : (nh6[]) y6cVar2.o.e) {
                if (nh6Var != null) {
                    nh6Var.a();
                }
            }
        }
    }

    public final void Q(mij mijVar, mij mijVar2) {
        if (mijVar.p() && mijVar2.p()) {
            return;
        }
        ArrayList arrayList = this.p;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            wt3.z(arrayList.get(size));
            throw null;
        }
    }

    public final void T(long j) {
        boolean z;
        if (this.C) {
            this.B.getClass();
            z = true;
        } else {
            z = false;
        }
        fke fkeVar = this.G;
        long j2 = f0;
        if (z) {
            r4 = fkeVar.e != 3 ? j2 : 1000L;
            for (tyf tyfVar : this.a) {
                long j3 = this.V;
                long j4 = this.W;
                n51 n51Var = (n51) tyfVar.f;
                n51 n51Var2 = (n51) tyfVar.e;
                long f = tyf.h(n51Var2) ? n51Var2.f(j3, j4) : Long.MAX_VALUE;
                if (n51Var != null && n51Var.h != 0) {
                    f = Math.min(f, n51Var.f(j3, j4));
                }
                r4 = Math.min(r4, nik.h0(f));
            }
            if (this.G.m()) {
                y6c y6cVar = (y6c) this.r.m;
                if ((y6cVar != null ? y6cVar.m : null) != null) {
                    if ((nik.T(r4) * this.G.o.a) + this.V >= r1.e()) {
                        r4 = Math.min(r4, j2);
                    }
                }
            }
        } else if (fkeVar.e != 3 || p0()) {
            r4 = j2;
        }
        this.h.a.sendEmptyMessageAtTime(2, j + r4);
    }

    public final void U(boolean z) {
        scc sccVar = ((y6c) this.r.m).g.a;
        long W = W(sccVar, this.G.s, true, false);
        if (W != this.G.s) {
            fke fkeVar = this.G;
            this.G = x(sccVar, W, fkeVar.c, fkeVar.d, z, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:27|(10:(10:29|30|31|(1:97)(3:37|(1:41)|42)|43|(1:52)|50|51|19|20)(1:101)|70|71|72|73|74|75|18|19|20)|53|54|(1:56)(1:94)|57|58|(1:60)(1:90)|61|62|63|(1:65)(1:88)|66|67|68|69) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0190, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0192, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0197, code lost:
    
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0194, code lost:
    
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0196, code lost:
    
        r0 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(gh6 gh6Var) {
        long longValue;
        long j;
        scc o;
        long j2;
        boolean z;
        boolean z2;
        scc sccVar;
        long j3;
        long j4;
        long j5;
        long W;
        fke fkeVar;
        scc sccVar2;
        mij mijVar;
        long j6;
        scc sccVar3;
        long j7;
        long j8;
        fke fkeVar2;
        int i;
        int i2;
        long j9;
        ih6 ih6Var = this;
        if (ih6Var.D) {
            if (ih6Var.E != null) {
                ih6Var.F++;
                ih6Var.H.c(1);
            }
            ih6Var.E = gh6Var;
            return;
        }
        ih6Var.H.c(1);
        Pair R = R(ih6Var.G.a, gh6Var, true, ih6Var.O, ih6Var.P, ih6Var.k, ih6Var.l);
        if (R == null) {
            Pair n = ih6Var.n(ih6Var.G.a);
            o = (scc) n.first;
            longValue = ((Long) n.second).longValue();
            z = !ih6Var.G.a.p();
            j = -9223372036854775807L;
            j2 = 0;
        } else {
            Object obj = R.first;
            longValue = ((Long) R.second).longValue();
            j = gh6Var.c == C.TIME_UNSET ? -9223372036854775807L : longValue;
            o = ih6Var.r.o(ih6Var.G.a, obj, longValue);
            if (o.b()) {
                ih6Var.G.a.g(o.a, ih6Var.l);
                longValue = ih6Var.l.c(o.b) == o.c ? ih6Var.l.g.c : 0L;
                j2 = 0;
                j = Math.max(j, ih6Var.l.g.b(o.b).a);
            } else {
                j2 = 0;
                if (gh6Var.c != C.TIME_UNSET) {
                    z = false;
                }
            }
            z = true;
        }
        try {
            try {
                if (ih6Var.G.a.p()) {
                    ih6Var.U = gh6Var;
                } else {
                    fke fkeVar3 = ih6Var.G;
                    if (R == null) {
                        if (fkeVar3.e != 1) {
                            ih6Var.l0(4);
                        }
                        ih6Var.N(false, true, false, true);
                    } else {
                        try {
                            try {
                                if (o.equals(fkeVar3.b)) {
                                    try {
                                        y6c y6cVar = (y6c) ih6Var.r.m;
                                        if (y6cVar == null || !y6cVar.e || longValue == j2) {
                                            j5 = longValue;
                                        } else {
                                            w6c w6cVar = y6cVar.a;
                                            long j10 = ih6Var.k.l;
                                            if (ih6Var.C && j10 != C.TIME_UNSET) {
                                                ih6Var.B.getClass();
                                            }
                                            j5 = w6cVar.c(longValue, ih6Var.A);
                                        }
                                        if (nik.h0(j5) != nik.h0(ih6Var.G.s) || ((i = (fkeVar2 = ih6Var.G).e) != 2 && i != 3)) {
                                            z2 = z;
                                            sccVar = o;
                                        }
                                        j8 = fkeVar2.s;
                                        i2 = 2;
                                        j9 = j8;
                                        z2 = z;
                                        sccVar3 = o;
                                        j7 = j;
                                        ih6Var.G = ih6Var.x(sccVar3, j8, j7, j9, z2, i2);
                                    } catch (Throwable th) {
                                        th = th;
                                        z2 = z;
                                        sccVar = o;
                                        j4 = longValue;
                                        j3 = j;
                                        ih6Var.G = ih6Var.x(sccVar, j4, j3, j4, z2, 2);
                                        throw th;
                                    }
                                }
                                z2 = z;
                                sccVar = o;
                                j5 = longValue;
                                ih6Var.A0(mijVar, sccVar2, mijVar, fkeVar.b, j6, true);
                                sccVar3 = sccVar2;
                                j7 = j6;
                                j8 = W;
                                i2 = 2;
                                j9 = j8;
                                ih6Var = this;
                                ih6Var.G = ih6Var.x(sccVar3, j8, j7, j9, z2, i2);
                            } catch (Throwable th2) {
                                th = th2;
                                sccVar = sccVar2;
                                j3 = j6;
                                j4 = W;
                                ih6Var.G = ih6Var.x(sccVar, j4, j3, j4, z2, 2);
                                throw th;
                            }
                            mijVar = fkeVar.a;
                            j6 = j;
                        } catch (Throwable th3) {
                            th = th3;
                            sccVar = sccVar2;
                            j3 = j;
                            j4 = W;
                            ih6Var.G = ih6Var.x(sccVar, j4, j3, j4, z2, 2);
                            throw th;
                        }
                        boolean z3 = ih6Var.G.e == 4;
                        d7c d7cVar = ih6Var.r;
                        W = ih6Var.W(sccVar, j5, ((y6c) d7cVar.m) != ((y6c) d7cVar.n), z3);
                        z2 |= longValue != W;
                        fkeVar = ih6Var.G;
                        sccVar2 = sccVar;
                    }
                }
                z2 = z;
                sccVar3 = o;
                j8 = longValue;
                j7 = j;
                i2 = 2;
                j9 = j8;
                ih6Var = this;
                ih6Var.G = ih6Var.x(sccVar3, j8, j7, j9, z2, i2);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            z2 = z;
            sccVar = o;
        }
    }

    public final long W(scc sccVar, long j, boolean z, boolean z2) {
        d7c d7cVar;
        int i;
        t0();
        boolean z3 = true;
        B0(false, true);
        if (z2 || this.G.e == 3) {
            l0(2);
        }
        y6c y6cVar = (y6c) this.r.m;
        y6c y6cVar2 = y6cVar;
        while (y6cVar2 != null && !sccVar.equals(y6cVar2.g.a)) {
            y6cVar2 = y6cVar2.m;
        }
        if (z || y6cVar != y6cVar2 || (y6cVar2 != null && y6cVar2.p + j < 0)) {
            for (int i2 = 0; i2 < this.a.length; i2++) {
                h(i2);
            }
            this.c0 = C.TIME_UNSET;
            if (y6cVar2 != null) {
                while (true) {
                    d7cVar = this.r;
                    if (((y6c) d7cVar.m) == y6cVar2) {
                        break;
                    }
                    d7cVar.a();
                }
                d7cVar.m(y6cVar2);
                y6cVar2.p = 1000000000000L;
                k(new boolean[this.a.length], ((y6c) this.r.n).e());
                y6cVar2.h = true;
            }
        }
        g();
        if (this.C) {
            for (tyf tyfVar : this.a) {
                if (tyfVar.g() && ((i = ((n51) tyfVar.e).b) == 2 || i == 4)) {
                    this.D = true;
                    break;
                }
            }
        }
        d7c d7cVar2 = this.r;
        if (y6cVar2 != null) {
            d7cVar2.m(y6cVar2);
            if (!y6cVar2.e) {
                y6cVar2.g = y6cVar2.g.b(j, C.TIME_UNSET);
            } else if (y6cVar2.f) {
                if (this.C) {
                    this.B.getClass();
                    if (!this.G.a.p() && y6cVar2.g.a.equals(this.G.b)) {
                        long j2 = y6cVar2.p + j;
                        boolean z4 = true;
                        for (tyf tyfVar2 : this.a) {
                            if (tyfVar2.g()) {
                                n51 d = tyfVar2.d(y6cVar2);
                                z4 &= d != null && d.C(j2);
                            }
                        }
                        if (z4) {
                            w6c w6cVar = y6cVar2.a;
                            long j3 = this.G.s;
                            d0h d0hVar = d0h.e;
                            if (w6cVar.c(j3, d0hVar) == y6cVar2.a.c(j, d0hVar)) {
                                z3 = false;
                            }
                        }
                    }
                }
                j = y6cVar2.a.seekToUs(j);
                y6cVar2.a.discardBuffer(j - this.m, this.n);
            }
            P(j, z3);
            B();
        } else {
            d7cVar2.b();
            P(j, true);
        }
        t(false);
        this.h.g(2);
        return j;
    }

    public final void X(lte lteVar) {
        lteVar.getClass();
        zqi zqiVar = this.h;
        if (lteVar.e != this.j) {
            zqiVar.c(15, lteVar).b();
            return;
        }
        synchronized (lteVar) {
        }
        try {
            lteVar.a.handleMessage(lteVar.c, lteVar.d);
            lteVar.a(true);
            int i = this.G.e;
            if (i == 3 || i == 2) {
                zqiVar.g(2);
            }
        } catch (Throwable th) {
            lteVar.a(true);
            throw th;
        }
    }

    public final void Y(lte lteVar) {
        Looper looper = lteVar.e;
        if (looper.getThread().isAlive()) {
            new zqi(new Handler(looper, null)).e(new wb3(this, lteVar, 23));
        } else {
            tgj.d0("Trying to send message on a dead thread.");
            lteVar.a(false);
        }
    }

    public final void Z(an0 an0Var, boolean z) {
        iu4 iu4Var = this.d;
        if (!iu4Var.i.equals(an0Var)) {
            iu4Var.i = an0Var;
            iu4Var.i();
        }
        if (!z) {
            an0Var = null;
        }
        sn0 sn0Var = this.y;
        if (!Objects.equals(sn0Var.d, an0Var)) {
            sn0Var.d = an0Var;
            int i = an0Var == null ? 0 : 1;
            sn0Var.f = i;
            z1a.r("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
        }
        fke fkeVar = this.G;
        boolean z2 = fkeVar.l;
        y0(sn0Var.c(fkeVar.e, z2), fkeVar.n, fkeVar.m, z2);
    }

    public final void a(bh6 bh6Var, int i) {
        this.H.c(1);
        tdc tdcVar = this.s;
        if (i == -1) {
            i = ((ArrayList) tdcVar.b).size();
        }
        u(tdcVar.c(i, bh6Var.a, bh6Var.b), false);
    }

    public final void a0(boolean z, yh3 yh3Var) {
        if (this.Q != z) {
            this.Q = z;
            if (!z) {
                for (tyf tyfVar : this.a) {
                    tyfVar.k();
                }
            }
        }
        if (yh3Var != null) {
            yh3Var.c();
        }
    }

    @Override // defpackage.y4h
    public final void b(a5h a5hVar) {
        this.h.c(9, (w6c) a5hVar).b();
    }

    public final void b0(xg6 xg6Var) {
        for (tyf tyfVar : this.a) {
            n51 n51Var = (n51) tyfVar.e;
            if (n51Var.b == 4) {
                n51Var.handleMessage(23, xg6Var);
                n51 n51Var2 = (n51) tyfVar.f;
                if (n51Var2 != null) {
                    n51Var2.handleMessage(23, xg6Var);
                }
            }
        }
    }

    @Override // defpackage.npk
    public final void c(long j, long j2, b bVar, MediaFormat mediaFormat) {
        if (this.D) {
            this.h.a(37).b();
        }
    }

    public final void c0(bh6 bh6Var) {
        this.H.c(1);
        int i = bh6Var.c;
        yfh yfhVar = bh6Var.b;
        ArrayList arrayList = bh6Var.a;
        if (i != -1) {
            this.U = new gh6(new sye(arrayList, yfhVar), bh6Var.c, bh6Var.d);
        }
        tdc tdcVar = this.s;
        ArrayList arrayList2 = (ArrayList) tdcVar.b;
        tdcVar.m(0, arrayList2.size());
        u(tdcVar.c(arrayList2.size(), arrayList, yfhVar), false);
    }

    @Override // defpackage.u6c
    public final void d(w6c w6cVar) {
        this.h.c(8, w6cVar).b();
    }

    public final void d0(boolean z) {
        this.J = z;
        O();
        if (this.K) {
            d7c d7cVar = this.r;
            if (((y6c) d7cVar.n) != ((y6c) d7cVar.m)) {
                U(true);
                t(false);
            }
        }
    }

    public final void e() {
        for (tyf tyfVar : this.a) {
            vvg vvgVar = this.C ? this.B : null;
            ((n51) tyfVar.e).handleMessage(18, vvgVar);
            n51 n51Var = (n51) tyfVar.f;
            if (n51Var != null) {
                n51Var.handleMessage(18, vvgVar);
            }
        }
    }

    public final void e0(hke hkeVar) {
        this.h.f(16);
        ar4 ar4Var = this.o;
        ar4Var.b(hkeVar);
        hke mo9getPlaybackParameters = ar4Var.mo9getPlaybackParameters();
        w(mo9getPlaybackParameters, mo9getPlaybackParameters.a, true, true);
    }

    public final boolean f() {
        if (!this.x) {
            return false;
        }
        for (tyf tyfVar : this.a) {
            if (tyfVar.f()) {
                return true;
            }
        }
        return false;
    }

    public final void f0(xf6 xf6Var) {
        this.b0 = xf6Var;
        mij mijVar = this.G.a;
        d7c d7cVar = this.r;
        d7cVar.getClass();
        xf6Var.getClass();
        if (d7cVar.g.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < d7cVar.g.size(); i++) {
            ((y6c) d7cVar.g.get(i)).i();
        }
        d7cVar.g = arrayList;
        d7cVar.q = null;
        d7cVar.j();
    }

    public final void g() {
        n51 n51Var;
        if (this.x && f()) {
            for (tyf tyfVar : this.a) {
                int c = tyfVar.c();
                ar4 ar4Var = this.o;
                if (tyfVar.f()) {
                    int i = tyfVar.d;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        try {
                            n51Var = (n51) tyfVar.e;
                        } catch (RuntimeException e) {
                            tgj.A("Disable prewarming failed.", e);
                        }
                    } else {
                        n51Var = (n51) tyfVar.f;
                        n51Var.getClass();
                    }
                    tyfVar.a(n51Var, ar4Var);
                    try {
                        tyfVar.i(z);
                    } catch (RuntimeException e2) {
                        tgj.A("Reset prewarming failed.", e2);
                    }
                    tyfVar.d = i2;
                }
                this.T -= c - tyfVar.c();
            }
            this.c0 = C.TIME_UNSET;
        }
    }

    public final void g0(int i) {
        this.O = i;
        mij mijVar = this.G.a;
        d7c d7cVar = this.r;
        d7cVar.b = i;
        int q = d7cVar.q(mijVar);
        if ((q & 1) != 0) {
            U(true);
        } else if ((q & 2) != 0) {
            g();
        }
        t(false);
    }

    public final void h(int i) {
        tyf[] tyfVarArr = this.a;
        int c = tyfVarArr[i].c();
        tyf tyfVar = tyfVarArr[i];
        n51 n51Var = (n51) tyfVar.e;
        ar4 ar4Var = this.o;
        tyfVar.a(n51Var, ar4Var);
        n51 n51Var2 = (n51) tyfVar.f;
        if (n51Var2 != null) {
            boolean z = (n51Var2.h == 0 || tyfVar.d == 3) ? false : true;
            tyfVar.a(n51Var2, ar4Var);
            tyfVar.i(false);
            if (z) {
                n51 n51Var3 = (n51) tyfVar.e;
                n51Var2.getClass();
                n51Var2.handleMessage(17, n51Var3);
            }
        }
        tyfVar.d = 0;
        F(i, false);
        this.T -= c;
    }

    public final void h0(boolean z) {
        if (!z) {
            gh6 gh6Var = this.E;
            zqi zqiVar = this.h;
            if (gh6Var != null && this.D && !zqiVar.a.hasMessages(37)) {
                this.F++;
            }
            int i = this.F;
            if (i > 0) {
                this.w.e(new wb3(this, i));
            }
            this.F = 0;
            this.D = false;
            zqiVar.f(37);
            gh6 gh6Var2 = this.E;
            if (gh6Var2 != null) {
                V(gh6Var2);
                this.E = null;
                this.D = false;
            }
        }
        this.C = z;
        e();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        y6c y6cVar;
        scc sccVar;
        y6c y6cVar2;
        int i2;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    this.H.c(1);
                    y0(this.y.c(this.G.e, z), i3 >> 4, i3 & 15, z);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    V((gh6) message.obj);
                    break;
                case 4:
                    e0((hke) message.obj);
                    break;
                case 5:
                    this.A = (d0h) message.obj;
                    break;
                case 6:
                    s0(false, true);
                    break;
                case 7:
                    J((yh3) message.obj);
                    return true;
                case 8:
                    v((w6c) message.obj);
                    break;
                case 9:
                    r((w6c) message.obj);
                    break;
                case 10:
                    M();
                    break;
                case 11:
                    g0(message.arg1);
                    break;
                case 12:
                    j0(message.arg1 != 0);
                    break;
                case 13:
                    a0(message.arg1 != 0, (yh3) message.obj);
                    break;
                case 14:
                    X((lte) message.obj);
                    break;
                case 15:
                    Y((lte) message.obj);
                    break;
                case 16:
                    hke hkeVar = (hke) message.obj;
                    w(hkeVar, hkeVar.a, true, false);
                    break;
                case 17:
                    c0((bh6) message.obj);
                    break;
                case 18:
                    a((bh6) message.obj, message.arg1);
                    break;
                case 19:
                    wt3.z(message.obj);
                    H();
                    throw null;
                case 20:
                    L(message.arg1, message.arg2, (yfh) message.obj);
                    break;
                case 21:
                    k0((yfh) message.obj);
                    break;
                case 22:
                    G();
                    break;
                case 23:
                    d0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    M();
                    U(true);
                    break;
                case 26:
                    M();
                    U(true);
                    break;
                case 27:
                    w0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    f0((xf6) message.obj);
                    break;
                case 29:
                    I();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    n0(pair.first, (yh3) pair.second);
                    break;
                case 31:
                    Z((an0) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    o0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    p(message.arg1);
                    break;
                case 34:
                    q();
                    break;
                case 35:
                    m0((npk) message.obj);
                    break;
                case 36:
                    h0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.D = false;
                    gh6 gh6Var = this.E;
                    if (gh6Var != null) {
                        V(gh6Var);
                        this.E = null;
                        break;
                    }
                    break;
                case 38:
                    i0((vvg) message.obj);
                    break;
                case 39:
                    b0((xg6) message.obj);
                    break;
            }
        } catch (RuntimeException e) {
            tf6 tf6Var = new tf6(2, e, ((e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
            tgj.A("Playback error", tf6Var);
            s0(true, false);
            this.G = this.G.f(tf6Var);
        } catch (s9e e2) {
            boolean z2 = e2.a;
            int i4 = e2.b;
            if (i4 == 1) {
                i2 = z2 ? 3001 : Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE;
            } else {
                if (i4 == 4) {
                    i2 = z2 ? 3002 : 3004;
                }
                s(r3, e2);
            }
            r3 = i2;
            s(r3, e2);
        } catch (te4 e3) {
            s(e3.a, e3);
        } catch (IOException e4) {
            s(2000, e4);
        } catch (tf6 e5) {
            e = e5;
            int i5 = e.c;
            d7c d7cVar = this.r;
            if (i5 == 1 && (y6cVar2 = (y6c) d7cVar.n) != null && e.h == null) {
                e = e.e(y6cVar2.g.a);
            }
            int i6 = e.c;
            zqi zqiVar = this.h;
            if (i6 == 1 && (sccVar = e.h) != null && z(e.e, sccVar)) {
                this.d0 = true;
                g();
                y6c y6cVar3 = (y6c) d7cVar.o;
                y6c y6cVar4 = (y6c) d7cVar.m;
                if (y6cVar4 != y6cVar3) {
                    while (y6cVar4 != null) {
                        y6c y6cVar5 = y6cVar4.m;
                        if (y6cVar5 == y6cVar3) {
                            break;
                        }
                        y6cVar4 = y6cVar5;
                    }
                }
                d7cVar.m(y6cVar4);
                if (this.G.e != 4) {
                    B();
                    zqiVar.g(2);
                }
            } else {
                tf6 tf6Var2 = this.Z;
                if (tf6Var2 != null) {
                    tf6Var2.addSuppressed(e);
                    e = this.Z;
                }
                if (e.c == 1 && ((y6c) d7cVar.m) != ((y6c) d7cVar.n)) {
                    while (true) {
                        y6cVar = (y6c) d7cVar.m;
                        if (y6cVar == ((y6c) d7cVar.n)) {
                            break;
                        }
                        d7cVar.a();
                    }
                    z1a.w(y6cVar);
                    D();
                    b7c b7cVar = y6cVar.g;
                    scc sccVar2 = b7cVar.a;
                    long j = b7cVar.b;
                    this.G = x(sccVar2, j, b7cVar.d, j, true, 0);
                }
                if (e.i && (this.Z == null || (i = e.a) == 5004 || i == 5003)) {
                    tgj.e0("Recoverable renderer error", e);
                    if (this.Z == null) {
                        this.Z = e;
                    }
                    xqi c = zqiVar.c(25, e);
                    Handler handler = zqiVar.a;
                    Message message2 = c.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    c.a();
                } else {
                    tgj.A("Playback error", e);
                    s0(true, false);
                    this.G = this.G.f(e);
                }
            }
        } catch (wb5 e6) {
            s(e6.a, e6);
        } catch (xt1 e7) {
            s(1002, e7);
        }
        D();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x0245, code lost:
    
        if (r6 >= r4.c) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        boolean z4;
        long j2;
        boolean z5;
        int i;
        fke fkeVar;
        int i2;
        boolean z6;
        long uptimeMillis = SystemClock.uptimeMillis();
        this.h.f(2);
        if (!this.z) {
            x0();
        }
        int i3 = this.G.e;
        if (i3 == 1 || i3 == 4) {
            return;
        }
        if (this.z) {
            x0();
        }
        y6c y6cVar = (y6c) this.r.m;
        if (y6cVar == null) {
            T(uptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        z0();
        if (y6cVar.e) {
            this.W = nik.T(SystemClock.elapsedRealtime());
            y6cVar.a.discardBuffer(this.G.s - this.m, this.n);
            z = true;
            z2 = true;
            int i4 = 0;
            while (true) {
                tyf[] tyfVarArr = this.a;
                if (i4 >= tyfVarArr.length) {
                    break;
                }
                tyf tyfVar = tyfVarArr[i4];
                if (tyfVar.c() == 0) {
                    F(i4, false);
                } else {
                    long j3 = this.V;
                    long j4 = this.W;
                    n51 n51Var = (n51) tyfVar.f;
                    n51 n51Var2 = (n51) tyfVar.e;
                    if (tyf.h(n51Var2)) {
                        n51Var2.w(j3, j4);
                    }
                    if (n51Var != null && n51Var.h != 0) {
                        n51Var.w(j3, j4);
                    }
                    if (z) {
                        n51 n51Var3 = (n51) tyfVar.f;
                        n51 n51Var4 = (n51) tyfVar.e;
                        boolean j5 = tyf.h(n51Var4) ? n51Var4.j() : true;
                        if (n51Var3 != null && n51Var3.h != 0) {
                            j5 &= n51Var3.j();
                        }
                        if (j5) {
                            z = true;
                            n51 d = tyfVar.d(y6cVar);
                            z6 = d != null || d.i() || d.l() || d.j();
                            F(i4, z6);
                            z2 = !z2 && z6;
                            if (z6) {
                                E(i4);
                            }
                        }
                    }
                    z = false;
                    n51 d2 = tyfVar.d(y6cVar);
                    if (d2 != null) {
                    }
                    F(i4, z6);
                    if (z2) {
                    }
                    if (z6) {
                    }
                }
                i4++;
            }
        } else {
            y6cVar.a.maybeThrowPrepareError();
            z = true;
            z2 = true;
        }
        long j6 = y6cVar.g.f;
        boolean z7 = z && y6cVar.e && (j6 == C.TIME_UNSET || j6 <= this.G.s);
        if (z7 && this.K) {
            this.K = false;
            int i5 = this.G.n;
            this.H.c(0);
            y0(this.y.c(this.G.e, false), i5, 5, false);
        }
        if (!z7 || !y6cVar.g.k) {
            fke fkeVar2 = this.G;
            if (fkeVar2.e == 2) {
                d7c d7cVar = this.r;
                if (this.T == 0) {
                    z5 = A();
                } else if (z2) {
                    if (fkeVar2.g) {
                        y6c y6cVar2 = (y6c) d7cVar.m;
                        long j7 = q0(fkeVar2.a, y6cVar2.g.a) ? this.t.i : -9223372036854775807L;
                        y6c y6cVar3 = (y6c) d7cVar.p;
                        boolean z8 = y6cVar3.g() && y6cVar3.g.k;
                        boolean z9 = y6cVar3.g.a.b() && !y6cVar3.e;
                        if (!z8 && !z9) {
                            long o = o(y6cVar3.d());
                            yq4 yq4Var = this.f;
                            cse cseVar = this.u;
                            j = -9223372036854775807L;
                            mij mijVar = this.G.a;
                            scc sccVar = y6cVar2.g.a;
                            float f = this.o.mo9getPlaybackParameters().a;
                            boolean z10 = this.G.l;
                            boolean z11 = this.L;
                            yq4Var.getClass();
                            long j8 = j7;
                            v5c v5cVar = mijVar.m(mijVar.g(sccVar.a, yq4Var.b).c, yq4Var.a, 0L).b.b;
                            if (v5cVar != null) {
                                String scheme = v5cVar.a.getScheme();
                                if (TextUtils.isEmpty(scheme) || yq4.s.contains(scheme)) {
                                    z4 = true;
                                    long F = nik.F(o, f);
                                    j2 = !z11 ? z4 ? yq4Var.k : yq4Var.j : z4 ? yq4Var.i : yq4Var.h;
                                    if (j8 != C.TIME_UNSET) {
                                        j2 = Math.min(j8 / 2, j2);
                                    }
                                    if (j2 > 0 && F < j2) {
                                        if (!(!z4 ? yq4Var.m : yq4Var.l)) {
                                            wq4 wq4Var = (wq4) yq4Var.q.get(cseVar);
                                            wq4Var.getClass();
                                            synchronized (wq4Var) {
                                                i = wq4Var.d;
                                            }
                                            yq4Var.c.getClass();
                                            int i6 = i * C.DEFAULT_BUFFER_SEGMENT_SIZE;
                                            wq4 wq4Var2 = (wq4) yq4Var.q.get(cseVar);
                                            wq4Var2.getClass();
                                        }
                                        z5 = false;
                                        if (z5) {
                                            l0(3);
                                            this.Z = null;
                                            if (p0()) {
                                                B0(false, false);
                                                ar4 ar4Var = this.o;
                                                z3 = true;
                                                ar4Var.c = true;
                                                ((i9i) ar4Var.d).d();
                                                r0();
                                                if (this.G.e == 2) {
                                                    int i7 = 0;
                                                    while (true) {
                                                        tyf[] tyfVarArr2 = this.a;
                                                        if (i7 >= tyfVarArr2.length) {
                                                            break;
                                                        }
                                                        if (tyfVarArr2[i7].d(y6cVar) != null) {
                                                            E(i7);
                                                        }
                                                        i7++;
                                                    }
                                                    fke fkeVar3 = this.G;
                                                    if (!fkeVar3.g && fkeVar3.r < 500000 && y((y6c) this.r.p) && p0()) {
                                                        if (this.a0 == C.TIME_UNSET) {
                                                            this.a0 = SystemClock.elapsedRealtime();
                                                        } else if (SystemClock.elapsedRealtime() - this.a0 >= 4000) {
                                                            throw new sii(0, 4000);
                                                        }
                                                        boolean z12 = (p0() || this.G.e != 3) ? false : z3;
                                                        if (this.S || !this.R || !z12) {
                                                            z3 = false;
                                                        }
                                                        fkeVar = this.G;
                                                        if (fkeVar.p != z3) {
                                                            fkeVar = fkeVar.i(z3);
                                                            this.G = fkeVar;
                                                        }
                                                        this.R = false;
                                                        if (!z3 && (i2 = fkeVar.e) != 4 && (z12 || i2 == 2 || (i2 == 3 && this.T != 0))) {
                                                            T(uptimeMillis);
                                                        }
                                                        Trace.endSection();
                                                    }
                                                }
                                                this.a0 = C.TIME_UNSET;
                                                if (p0()) {
                                                }
                                                if (this.S) {
                                                }
                                                z3 = false;
                                                fkeVar = this.G;
                                                if (fkeVar.p != z3) {
                                                }
                                                this.R = false;
                                                if (!z3) {
                                                    T(uptimeMillis);
                                                }
                                                Trace.endSection();
                                            }
                                        }
                                    }
                                    z5 = true;
                                    if (z5) {
                                    }
                                }
                            }
                            z4 = false;
                            long F2 = nik.F(o, f);
                            if (!z11) {
                            }
                            if (j8 != C.TIME_UNSET) {
                            }
                            if (j2 > 0) {
                                if (!(!z4 ? yq4Var.m : yq4Var.l)) {
                                }
                                z5 = false;
                                if (z5) {
                                }
                            }
                            z5 = true;
                            if (z5) {
                            }
                        }
                    }
                    j = -9223372036854775807L;
                    z5 = true;
                    if (z5) {
                    }
                } else {
                    z5 = false;
                }
                j = -9223372036854775807L;
                if (z5) {
                }
            } else {
                j = -9223372036854775807L;
            }
            z3 = true;
            if (this.G.e == 3 && (this.T != 0 ? !z2 : !A())) {
                B0(p0(), false);
                l0(2);
                if (this.L) {
                    for (y6c y6cVar4 = (y6c) this.r.m; y6cVar4 != null; y6cVar4 = y6cVar4.m) {
                        for (nh6 nh6Var : (nh6[]) y6cVar4.o.e) {
                            if (nh6Var != null) {
                                nh6Var.c();
                            }
                        }
                    }
                    uq4 uq4Var = this.t;
                    long j9 = uq4Var.i;
                    if (j9 != j) {
                        long j10 = j9 + uq4Var.c;
                        uq4Var.i = j10;
                        long j11 = uq4Var.h;
                        if (j11 != j && j10 > j11) {
                            uq4Var.i = j11;
                        }
                        uq4Var.m = j;
                    }
                }
                t0();
            }
            if (this.G.e == 2) {
            }
            this.a0 = C.TIME_UNSET;
            if (p0()) {
            }
            if (this.S) {
            }
            z3 = false;
            fkeVar = this.G;
            if (fkeVar.p != z3) {
            }
            this.R = false;
            if (!z3) {
            }
            Trace.endSection();
        }
        l0(4);
        t0();
        z3 = true;
        if (this.G.e == 2) {
        }
        this.a0 = C.TIME_UNSET;
        if (p0()) {
        }
        if (this.S) {
        }
        z3 = false;
        fkeVar = this.G;
        if (fkeVar.p != z3) {
        }
        this.R = false;
        if (!z3) {
        }
        Trace.endSection();
    }

    public final void i0(vvg vvgVar) {
        this.B = vvgVar;
        e();
    }

    public final void j(y6c y6cVar, int i, boolean z, long j) {
        tyf tyfVar = this.a[i];
        boolean g = tyfVar.g();
        n51 n51Var = (n51) tyfVar.e;
        if (g) {
            return;
        }
        boolean z2 = y6cVar == ((y6c) this.r.m);
        gtj gtjVar = y6cVar.o;
        syf syfVar = ((syf[]) gtjVar.d)[i];
        nh6 nh6Var = ((nh6[]) gtjVar.e)[i];
        boolean z3 = p0() && this.G.e == 3;
        boolean z4 = !z && z3;
        this.T++;
        jpg jpgVar = y6cVar.c[i];
        long j2 = y6cVar.p;
        scc sccVar = y6cVar.g.a;
        n51 n51Var2 = (n51) tyfVar.f;
        int length = nh6Var != null ? nh6Var.length() : 0;
        b[] bVarArr = new b[length];
        for (int i2 = 0; i2 < length; i2++) {
            nh6Var.getClass();
            bVarArr[i2] = nh6Var.getFormat(i2);
        }
        int i3 = tyfVar.d;
        ar4 ar4Var = this.o;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            tyfVar.a = true;
            z1a.E(n51Var.h == 0);
            n51Var.d = syfVar;
            n51Var.q = sccVar;
            n51Var.h = 1;
            n51Var.n(z4, z2);
            n51Var.x(bVarArr, jpgVar, j, j2, sccVar);
            n51Var.y(j, z4, true);
            ar4Var.d(n51Var);
        } else {
            tyfVar.b = true;
            n51Var2.getClass();
            z1a.E(n51Var2.h == 0);
            n51Var2.d = syfVar;
            n51Var2.q = sccVar;
            n51Var2.h = 1;
            n51Var2.n(z4, z2);
            n51Var2.x(bVarArr, jpgVar, j, j2, sccVar);
            n51Var2.y(j, z4, true);
            ar4Var.d(n51Var2);
        }
        zg6 zg6Var = new zg6(this);
        n51 d = tyfVar.d(y6cVar);
        d.getClass();
        d.handleMessage(11, zg6Var);
        if (z3 && z2) {
            tyfVar.m();
        }
    }

    public final void j0(boolean z) {
        this.P = z;
        mij mijVar = this.G.a;
        d7c d7cVar = this.r;
        d7cVar.c = z;
        int q = d7cVar.q(mijVar);
        if ((q & 1) != 0) {
            U(true);
        } else if ((q & 2) != 0) {
            g();
        }
        t(false);
    }

    public final void k(boolean[] zArr, long j) {
        tyf[] tyfVarArr;
        ih6 ih6Var;
        long j2;
        y6c y6cVar = (y6c) this.r.n;
        gtj gtjVar = y6cVar.o;
        int i = 0;
        while (true) {
            tyfVarArr = this.a;
            if (i >= tyfVarArr.length) {
                break;
            }
            if (!gtjVar.r(i)) {
                tyfVarArr[i].k();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < tyfVarArr.length) {
            if (gtjVar.r(i2) && tyfVarArr[i2].d(y6cVar) == null) {
                ih6Var = this;
                j2 = j;
                ih6Var.j(y6cVar, i2, zArr[i2], j2);
            } else {
                ih6Var = this;
                j2 = j;
            }
            i2++;
            this = ih6Var;
            j = j2;
        }
    }

    public final void k0(yfh yfhVar) {
        this.H.c(1);
        tdc tdcVar = this.s;
        int size = ((ArrayList) tdcVar.b).size();
        if (yfhVar.b.length != size) {
            yfhVar = new yfh(new Random(yfhVar.a.nextLong())).a(size);
        }
        tdcVar.l = yfhVar;
        u(tdcVar.e(), false);
    }

    public final long l(mij mijVar, Object obj, long j) {
        iij iijVar = this.l;
        int i = mijVar.g(obj, iijVar).c;
        kij kijVar = this.k;
        mijVar.n(i, kijVar);
        return (kijVar.e != C.TIME_UNSET && kijVar.a() && kijVar.h) ? nik.T(nik.D(kijVar.f) - kijVar.e) - (j + iijVar.e) : C.TIME_UNSET;
    }

    public final void l0(int i) {
        fke fkeVar = this.G;
        if (fkeVar.e != i) {
            if (i != 2) {
                this.a0 = C.TIME_UNSET;
            }
            if (i != 3 && fkeVar.p) {
                fkeVar = fkeVar.i(false);
                this.G = fkeVar;
            }
            this.G = fkeVar.h(i);
        }
    }

    public final long m(y6c y6cVar) {
        if (y6cVar == null) {
            return 0L;
        }
        long j = y6cVar.p;
        if (!y6cVar.e) {
            return j;
        }
        int i = 0;
        while (true) {
            tyf[] tyfVarArr = this.a;
            if (i >= tyfVarArr.length) {
                return j;
            }
            if (tyfVarArr[i].d(y6cVar) != null) {
                n51 d = tyfVarArr[i].d(y6cVar);
                Objects.requireNonNull(d);
                long j2 = d.m;
                if (j2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j = Math.max(j2, j);
            }
            i++;
        }
    }

    public final void m0(npk npkVar) {
        for (tyf tyfVar : this.a) {
            n51 n51Var = (n51) tyfVar.e;
            if (n51Var.b == 2) {
                n51Var.handleMessage(7, npkVar);
                n51 n51Var2 = (n51) tyfVar.f;
                if (n51Var2 != null) {
                    n51Var2.handleMessage(7, npkVar);
                }
            }
        }
    }

    public final Pair n(mij mijVar) {
        if (mijVar.p()) {
            return Pair.create(fke.u, 0L);
        }
        Pair i = mijVar.i(this.k, this.l, mijVar.a(this.P), C.TIME_UNSET);
        scc o = this.r.o(mijVar, i.first, 0L);
        long longValue = ((Long) i.second).longValue();
        if (o.b()) {
            Object obj = o.a;
            iij iijVar = this.l;
            mijVar.g(obj, iijVar);
            longValue = o.c == iijVar.c(o.b) ? iijVar.g.c : 0L;
        }
        return Pair.create(o, Long.valueOf(longValue));
    }

    public final void n0(Object obj, yh3 yh3Var) {
        for (tyf tyfVar : this.a) {
            n51 n51Var = (n51) tyfVar.e;
            if (n51Var.b == 2) {
                int i = tyfVar.d;
                if (i == 4 || i == 1) {
                    n51 n51Var2 = (n51) tyfVar.f;
                    n51Var2.getClass();
                    n51Var2.handleMessage(1, obj);
                } else {
                    n51Var.handleMessage(1, obj);
                }
            }
        }
        int i2 = this.G.e;
        if (i2 == 3 || i2 == 2) {
            this.h.g(2);
        }
        if (yh3Var != null) {
            yh3Var.c();
        }
    }

    public final long o(long j) {
        y6c y6cVar = (y6c) this.r.p;
        if (y6cVar == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.V - y6cVar.p));
    }

    public final void o0(float f) {
        this.e0 = f;
        float f2 = f * this.y.g;
        for (tyf tyfVar : this.a) {
            n51 n51Var = (n51) tyfVar.e;
            if (n51Var.b == 1) {
                n51Var.handleMessage(2, Float.valueOf(f2));
                n51 n51Var2 = (n51) tyfVar.f;
                if (n51Var2 != null) {
                    n51Var2.handleMessage(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void p(int i) {
        fke fkeVar = this.G;
        y0(i, fkeVar.n, fkeVar.m, fkeVar.l);
    }

    public final boolean p0() {
        fke fkeVar = this.G;
        return fkeVar.l && fkeVar.n == 0;
    }

    public final void q() {
        o0(this.e0);
    }

    public final boolean q0(mij mijVar, scc sccVar) {
        if (sccVar.b() || mijVar.p()) {
            return false;
        }
        int i = mijVar.g(sccVar.a, this.l).c;
        kij kijVar = this.k;
        mijVar.n(i, kijVar);
        return kijVar.a() && kijVar.h && kijVar.e != C.TIME_UNSET;
    }

    public final void r(w6c w6cVar) {
        d7c d7cVar = this.r;
        y6c y6cVar = (y6c) d7cVar.p;
        if (y6cVar != null && y6cVar.a == w6cVar) {
            d7cVar.l(this.V);
            B();
            return;
        }
        y6c y6cVar2 = (y6c) d7cVar.q;
        if (y6cVar2 == null || y6cVar2.a != w6cVar) {
            return;
        }
        C();
    }

    public final void r0() {
        y6c y6cVar = (y6c) this.r.m;
        if (y6cVar == null) {
            return;
        }
        gtj gtjVar = y6cVar.o;
        int i = 0;
        while (true) {
            tyf[] tyfVarArr = this.a;
            if (i >= tyfVarArr.length) {
                return;
            }
            if (gtjVar.r(i)) {
                tyfVarArr[i].m();
            }
            i++;
        }
    }

    public final void s(int i, IOException iOException) {
        tf6 tf6Var = new tf6(0, iOException, i);
        y6c y6cVar = (y6c) this.r.m;
        if (y6cVar != null) {
            tf6Var = tf6Var.e(y6cVar.g.a);
        }
        tgj.A("Playback error", tf6Var);
        s0(false, false);
        this.G = this.G.f(tf6Var);
    }

    public final void s0(boolean z, boolean z2) {
        N(z || !this.Q, false, true, false);
        this.H.c(z2 ? 1 : 0);
        yq4 yq4Var = this.f;
        ConcurrentHashMap concurrentHashMap = yq4Var.q;
        cse cseVar = this.u;
        wq4 wq4Var = (wq4) concurrentHashMap.get(cseVar);
        if (wq4Var != null) {
            int i = wq4Var.a - 1;
            wq4Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(cseVar);
                yq4Var.c();
            }
        }
        this.y.c(1, this.G.l);
        l0(1);
    }

    public final void t(boolean z) {
        y6c y6cVar = (y6c) this.r.p;
        scc sccVar = y6cVar == null ? this.G.b : y6cVar.g.a;
        boolean equals = this.G.k.equals(sccVar);
        if (!equals) {
            this.G = this.G.c(sccVar);
        }
        fke fkeVar = this.G;
        fkeVar.q = y6cVar == null ? fkeVar.s : y6cVar.d();
        fke fkeVar2 = this.G;
        fkeVar2.r = o(fkeVar2.q);
        if ((!equals || z) && y6cVar != null && y6cVar.e) {
            v0(y6cVar.g.a, y6cVar.o);
        }
    }

    public final void t0() {
        ar4 ar4Var = this.o;
        ar4Var.c = false;
        i9i i9iVar = (i9i) ar4Var.d;
        if (i9iVar.a) {
            i9iVar.a(i9iVar.getPositionUs());
            i9iVar.a = false;
        }
        for (tyf tyfVar : this.a) {
            n51 n51Var = (n51) tyfVar.f;
            n51 n51Var2 = (n51) tyfVar.e;
            if (tyf.h(n51Var2)) {
                tyf.b(n51Var2);
            }
            if (n51Var != null && n51Var.h != 0) {
                tyf.b(n51Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x027d, code lost:
    
        if (r11 <= r9) goto L116;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03af A[Catch: all -> 0x03aa, TryCatch #3 {all -> 0x03aa, blocks: (B:128:0x03a6, B:129:0x03af, B:131:0x03b5, B:43:0x03c4, B:65:0x03cb, B:69:0x03d3, B:71:0x03dd, B:73:0x03ea, B:76:0x03ed), top: B:41:0x036d }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(mij mijVar, boolean z) {
        long j;
        kij kijVar;
        Object obj;
        int i;
        long j2;
        long k;
        boolean z2;
        boolean z3;
        boolean z4;
        iij iijVar;
        boolean z5;
        mij mijVar2;
        iij iijVar2;
        mij mijVar3;
        long j3;
        long j4;
        long j5;
        int i2;
        eh6 eh6Var;
        int i3;
        int[] iArr;
        int i4;
        long longValue;
        boolean z6;
        int i5;
        boolean z7;
        iij iijVar3;
        mij mijVar4;
        mij mijVar5;
        scc sccVar;
        boolean z8;
        mij mijVar6;
        long j6;
        int r;
        y6c y6cVar;
        fke fkeVar = this.G;
        gh6 gh6Var = this.U;
        d7c d7cVar = this.r;
        int i6 = this.O;
        boolean z9 = this.P;
        kij kijVar2 = this.k;
        iij iijVar4 = this.l;
        if (mijVar.p()) {
            scc sccVar2 = fke.u;
            boolean z10 = (sccVar2.equals(fkeVar.b) && fkeVar.s == 0) ? false : true;
            eh6 eh6Var2 = new eh6(sccVar2, 0L, C.TIME_UNSET, false, true, false, z10, z10 && z && !fkeVar.a.p() && !fkeVar.a.g(fkeVar.b.a, iijVar4).f, 4);
            mijVar4 = mijVar;
            eh6Var = eh6Var2;
            iijVar3 = iijVar4;
        } else {
            scc sccVar3 = fkeVar.b;
            Object obj2 = sccVar3.a;
            mij mijVar7 = fkeVar.a;
            boolean z11 = mijVar7.p() || mijVar7.g(sccVar3.a, iijVar4).f;
            long j7 = (fkeVar.b.b() || z11) ? fkeVar.c : fkeVar.s;
            if (gh6Var != null) {
                boolean z12 = true;
                j = 1;
                mij mijVar8 = mijVar;
                Pair R = R(mijVar8, gh6Var, true, i6, z9, kijVar2, iijVar4);
                if (R == null) {
                    i5 = mijVar8.a(z9);
                    obj = obj2;
                    longValue = j7;
                    z6 = false;
                    z7 = false;
                } else {
                    long j8 = gh6Var.c;
                    obj = R.first;
                    if (j8 == C.TIME_UNSET) {
                        i5 = mijVar8.g(obj, iijVar4).c;
                        obj = obj2;
                        longValue = j7;
                        z6 = false;
                    } else {
                        longValue = ((Long) R.second).longValue();
                        z6 = true;
                        i5 = -1;
                    }
                    z7 = fkeVar.e == 4;
                    z12 = false;
                }
                j2 = longValue;
                z4 = z6;
                z3 = z12;
                z2 = z7;
                i = i5;
                kijVar = kijVar2;
                mijVar3 = mijVar8;
                iijVar2 = iijVar4;
            } else {
                j = 1;
                mij mijVar9 = mijVar;
                if (fkeVar.a.p()) {
                    i = mijVar9.a(z9);
                    kijVar = kijVar2;
                    obj = obj2;
                } else if (mijVar9.b(obj2) == -1) {
                    obj = obj2;
                    int S = S(kijVar2, iijVar4, i6, z9, obj, fkeVar.a, mijVar9);
                    kijVar = kijVar2;
                    mij mijVar10 = mijVar9;
                    iijVar = iijVar4;
                    if (S == -1) {
                        S = mijVar10.a(z9);
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    i = S;
                    z3 = z5;
                    j2 = j7;
                    z2 = false;
                    mijVar2 = mijVar10;
                    z4 = false;
                    mijVar3 = mijVar2;
                    iijVar2 = iijVar;
                } else {
                    kijVar = kijVar2;
                    obj = obj2;
                    if (j7 == C.TIME_UNSET) {
                        i = mijVar9.g(obj, iijVar4).c;
                    } else if (z11) {
                        fkeVar.a.g(sccVar3.a, iijVar4);
                        if (fkeVar.a.m(iijVar4.c, kijVar, 0L).m == fkeVar.a.b(sccVar3.a)) {
                            Pair i7 = mijVar9.i(kijVar, iijVar4, mijVar9.g(obj, iijVar4).c, j7 + iijVar4.e);
                            obj = i7.first;
                            k = ((Long) i7.second).longValue();
                        } else {
                            k = mijVar9.g(obj, iijVar4).d != C.TIME_UNSET ? nik.k(j7, 0L, iijVar4.d - 1) : j7;
                        }
                        j2 = k;
                        i = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                        mijVar3 = mijVar9;
                        iijVar2 = iijVar4;
                    } else {
                        i = -1;
                        j2 = j7;
                        z2 = false;
                        z3 = false;
                        mijVar2 = mijVar9;
                        iijVar = iijVar4;
                        z4 = false;
                        mijVar3 = mijVar2;
                        iijVar2 = iijVar;
                    }
                }
                j2 = j7;
                z2 = false;
                z3 = false;
                mijVar2 = mijVar9;
                iijVar = iijVar4;
                z4 = false;
                mijVar3 = mijVar2;
                iijVar2 = iijVar;
            }
            if (i != -1) {
                Pair i8 = mijVar3.i(kijVar, iijVar2, i, C.TIME_UNSET);
                obj = i8.first;
                j3 = ((Long) i8.second).longValue();
                j2 = -9223372036854775807L;
            } else {
                j3 = j2;
            }
            scc o = d7cVar.o(mijVar3, obj, j3);
            int i9 = o.e;
            boolean z13 = i9 == -1 || ((i4 = sccVar3.e) != -1 && i9 >= i4);
            boolean equals = sccVar3.a.equals(obj);
            boolean z14 = equals && !sccVar3.b() && !o.b() && z13;
            iij g = mijVar3.g(obj, iijVar2);
            if (!z11 && j7 == j2) {
                Object obj3 = sccVar3.a;
                int i10 = sccVar3.b;
                if (obj3.equals(o.a)) {
                    if (sccVar3.b()) {
                        g.e(i10);
                    }
                    if (o.b()) {
                        g.e(o.b);
                    }
                }
            }
            if (z14) {
                o = sccVar3;
            }
            if (o.b()) {
                if (o.equals(sccVar3)) {
                    j3 = fkeVar.s;
                } else {
                    mijVar3.g(o.a, iijVar2);
                    j3 = o.c == iijVar2.c(o.b) ? iijVar2.g.c : 0L;
                }
            } else if (equals && sccVar3.b()) {
                hg b = mijVar3.g(obj, iijVar2).g.b(sccVar3.b);
                b.getClass();
                long j9 = fkeVar.c;
                if (j9 != C.TIME_UNSET) {
                    long j10 = b.a;
                    if (j10 != Long.MIN_VALUE) {
                    }
                }
                int i11 = b.b;
                int i12 = sccVar3.c;
                if (i11 > i12 && b.f[i12] == 2) {
                    long j11 = mijVar3.g(obj, iijVar2).d;
                    if (j11 != C.TIME_UNSET) {
                        j3 = Math.min(j11 - j, j3);
                    }
                    j4 = j3;
                    j5 = j4;
                    boolean z15 = o.equals(fkeVar.b) || j4 != fkeVar.s;
                    int i13 = mijVar3.b(fkeVar.b.a) != -1 ? 4 : 3;
                    if (o.a.equals(fkeVar.b.a) && o.b != -1) {
                        hg b2 = mijVar3.g(o.a, iijVar2).g.b(o.b);
                        i3 = o.c;
                        iArr = b2.f;
                        if (i3 < iArr.length || iArr[i3] != 2) {
                            i2 = 0;
                            eh6Var = new eh6(o, j4, j5, z2, z3, z4, z15, (z15 || !z || fkeVar.a.p() || fkeVar.a.g(fkeVar.b.a, iijVar2).f) ? false : true, i2);
                            mijVar4 = mijVar3;
                            iijVar3 = iijVar2;
                        }
                    }
                    i2 = i13;
                    eh6Var = new eh6(o, j4, j5, z2, z3, z4, z15, (z15 || !z || fkeVar.a.p() || fkeVar.a.g(fkeVar.b.a, iijVar2).f) ? false : true, i2);
                    mijVar4 = mijVar3;
                    iijVar3 = iijVar2;
                }
            }
            j4 = j3;
            j5 = j2;
            if (o.equals(fkeVar.b)) {
            }
            if (mijVar3.b(fkeVar.b.a) != -1) {
            }
            if (o.a.equals(fkeVar.b.a)) {
                hg b22 = mijVar3.g(o.a, iijVar2).g.b(o.b);
                i3 = o.c;
                iArr = b22.f;
                if (i3 < iArr.length) {
                }
                i2 = 0;
                eh6Var = new eh6(o, j4, j5, z2, z3, z4, z15, (z15 || !z || fkeVar.a.p() || fkeVar.a.g(fkeVar.b.a, iijVar2).f) ? false : true, i2);
                mijVar4 = mijVar3;
                iijVar3 = iijVar2;
            }
            i2 = i13;
            eh6Var = new eh6(o, j4, j5, z2, z3, z4, z15, (z15 || !z || fkeVar.a.p() || fkeVar.a.g(fkeVar.b.a, iijVar2).f) ? false : true, i2);
            mijVar4 = mijVar3;
            iijVar3 = iijVar2;
        }
        scc sccVar4 = eh6Var.a;
        long j12 = eh6Var.b;
        try {
            if (eh6Var.e) {
                z8 = true;
                if (this.G.e != 1) {
                    l0(4);
                }
                N(false, false, false, true);
            } else {
                z8 = true;
            }
            tyf[] tyfVarArr = this.a;
            int length = tyfVarArr.length;
            int i14 = 0;
            mij mijVar11 = iijVar3;
            while (i14 < length) {
                tyf tyfVar = tyfVarArr[i14];
                n51 n51Var = (n51) tyfVar.e;
                boolean equals2 = n51Var.p.equals(mijVar4);
                if (equals2 == 0) {
                    n51Var.p = mijVar4;
                    n51Var.u();
                }
                n51 n51Var2 = (n51) tyfVar.f;
                if (n51Var2 != null && !n51Var2.p.equals(mijVar4)) {
                    n51Var2.p = mijVar4;
                    n51Var2.u();
                }
                i14++;
                mijVar11 = equals2;
            }
            try {
                if (eh6Var.g) {
                    mijVar11 = mijVar4;
                    if (!mijVar11.p()) {
                        try {
                            for (y6c y6cVar2 = (y6c) this.r.m; y6cVar2 != null; y6cVar2 = y6cVar2.m) {
                                if (y6cVar2.g.a.equals(sccVar4)) {
                                    y6cVar2.g = this.r.g(mijVar11, y6cVar2.g);
                                    y6cVar2.k();
                                }
                            }
                            boolean z16 = eh6Var.d;
                            d7c d7cVar2 = this.r;
                            sccVar = sccVar4;
                            try {
                                j12 = W(sccVar, j12, ((y6c) d7cVar2.m) != ((y6c) d7cVar2.n) ? z8 : false, z16);
                                fke fkeVar2 = this.G;
                                scc sccVar5 = sccVar;
                                A0(mijVar, sccVar5, fkeVar2.a, fkeVar2.b, !eh6Var.f ? j12 : -9223372036854775807L, false);
                                if (!eh6Var.g || eh6Var.c != this.G.c) {
                                    long j13 = eh6Var.c;
                                    boolean z17 = eh6Var.h;
                                    this.G = x(sccVar5, j12, j13, !z17 ? j12 : this.G.d, z17, eh6Var.i);
                                }
                                O();
                                Q(mijVar, this.G.a);
                                this.G = this.G.j(mijVar);
                                if (!mijVar.p()) {
                                    this.U = null;
                                }
                                t(false);
                                this.h.g(2);
                            } catch (Throwable th) {
                                th = th;
                                j12 = j12;
                                mijVar6 = mijVar11;
                                mijVar5 = mijVar6;
                                fke fkeVar3 = this.G;
                                mij mijVar12 = fkeVar3.a;
                                scc sccVar6 = fkeVar3.b;
                                scc sccVar7 = sccVar;
                                A0(mijVar5, sccVar7, mijVar12, sccVar6, eh6Var.f ? j12 : -9223372036854775807L, false);
                                if (!eh6Var.g || eh6Var.c != this.G.c) {
                                    long j14 = eh6Var.c;
                                    boolean z18 = eh6Var.h;
                                    this.G = x(sccVar7, j12, j14, z18 ? j12 : this.G.d, z18, eh6Var.i);
                                }
                                O();
                                Q(mijVar5, this.G.a);
                                this.G = this.G.j(mijVar5);
                                if (!mijVar5.p()) {
                                    this.U = null;
                                }
                                t(false);
                                this.h.g(2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sccVar = sccVar4;
                            mijVar6 = mijVar11;
                            mijVar5 = mijVar6;
                            fke fkeVar32 = this.G;
                            mij mijVar122 = fkeVar32.a;
                            scc sccVar62 = fkeVar32.b;
                            scc sccVar72 = sccVar;
                            A0(mijVar5, sccVar72, mijVar122, sccVar62, eh6Var.f ? j12 : -9223372036854775807L, false);
                            if (!eh6Var.g) {
                            }
                            long j142 = eh6Var.c;
                            boolean z182 = eh6Var.h;
                            this.G = x(sccVar72, j12, j142, z182 ? j12 : this.G.d, z182, eh6Var.i);
                            O();
                            Q(mijVar5, this.G.a);
                            this.G = this.G.j(mijVar5);
                            if (!mijVar5.p()) {
                            }
                            t(false);
                            this.h.g(2);
                            throw th;
                        }
                    }
                } else {
                    try {
                        y6c y6cVar3 = (y6c) this.r.n;
                        long m = y6cVar3 == null ? 0L : m(y6cVar3);
                        try {
                            try {
                                if (f() && (y6cVar = (y6c) this.r.o) != null) {
                                    j6 = m(y6cVar);
                                    r = this.r.r(mijVar, this.V, m, j6);
                                    if ((r & 1) == 0) {
                                        U(false);
                                    } else if ((r & 2) != 0) {
                                        g();
                                    }
                                }
                                r = this.r.r(mijVar, this.V, m, j6);
                                if ((r & 1) == 0) {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                mijVar11 = mijVar;
                                sccVar = sccVar4;
                                mijVar6 = mijVar11;
                                mijVar5 = mijVar6;
                                fke fkeVar322 = this.G;
                                mij mijVar1222 = fkeVar322.a;
                                scc sccVar622 = fkeVar322.b;
                                scc sccVar722 = sccVar;
                                A0(mijVar5, sccVar722, mijVar1222, sccVar622, eh6Var.f ? j12 : -9223372036854775807L, false);
                                if (!eh6Var.g) {
                                }
                                long j1422 = eh6Var.c;
                                boolean z1822 = eh6Var.h;
                                this.G = x(sccVar722, j12, j1422, z1822 ? j12 : this.G.d, z1822, eh6Var.i);
                                O();
                                Q(mijVar5, this.G.a);
                                this.G = this.G.j(mijVar5);
                                if (!mijVar5.p()) {
                                }
                                t(false);
                                this.h.g(2);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            mijVar11 = mijVar;
                        }
                        j6 = 0;
                    } catch (Throwable th5) {
                        th = th5;
                        mijVar11 = mijVar4;
                    }
                }
                sccVar = sccVar4;
                fke fkeVar22 = this.G;
                scc sccVar52 = sccVar;
                A0(mijVar, sccVar52, fkeVar22.a, fkeVar22.b, !eh6Var.f ? j12 : -9223372036854775807L, false);
                if (!eh6Var.g) {
                }
                long j132 = eh6Var.c;
                boolean z172 = eh6Var.h;
                this.G = x(sccVar52, j12, j132, !z172 ? j12 : this.G.d, z172, eh6Var.i);
                O();
                Q(mijVar, this.G.a);
                this.G = this.G.j(mijVar);
                if (!mijVar.p()) {
                }
                t(false);
                this.h.g(2);
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            mijVar5 = mijVar4;
            sccVar = sccVar4;
        }
    }

    public final void u0() {
        y6c y6cVar = (y6c) this.r.p;
        boolean z = this.N || (y6cVar != null && y6cVar.a.isLoading());
        fke fkeVar = this.G;
        if (z != fkeVar.g) {
            this.G = fkeVar.b(z);
        }
    }

    public final void v(w6c w6cVar) {
        y6c y6cVar;
        ih6 ih6Var;
        d7c d7cVar = this.r;
        y6c y6cVar2 = (y6c) d7cVar.p;
        ar4 ar4Var = this.o;
        if (y6cVar2 != null && y6cVar2.a == w6cVar) {
            y6cVar2.getClass();
            if (!y6cVar2.e) {
                float f = ar4Var.mo9getPlaybackParameters().a;
                fke fkeVar = this.G;
                y6cVar2.f(f, fkeVar.a, fkeVar.l);
            }
            v0(y6cVar2.g.a, y6cVar2.o);
            if (y6cVar2 == ((y6c) d7cVar.m)) {
                P(y6cVar2.g.b, true);
                k(new boolean[this.a.length], ((y6c) d7cVar.n).e());
                y6cVar2.h = true;
                fke fkeVar2 = this.G;
                scc sccVar = fkeVar2.b;
                long j = y6cVar2.g.b;
                ih6Var = this;
                ih6Var.G = x(sccVar, j, fkeVar2.c, j, false, 5);
            } else {
                ih6Var = this;
            }
            ih6Var.B();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= d7cVar.g.size()) {
                y6cVar = null;
                break;
            }
            y6cVar = (y6c) d7cVar.g.get(i);
            if (y6cVar.a == w6cVar) {
                break;
            } else {
                i++;
            }
        }
        if (y6cVar != null) {
            z1a.E(!y6cVar.e);
            float f2 = ar4Var.mo9getPlaybackParameters().a;
            fke fkeVar3 = this.G;
            y6cVar.f(f2, fkeVar3.a, fkeVar3.l);
            y6c y6cVar3 = (y6c) d7cVar.q;
            if (y6cVar3 == null || y6cVar3.a != w6cVar) {
                return;
            }
            C();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(scc sccVar, gtj gtjVar) {
        boolean z;
        int length;
        int i;
        y6c y6cVar = (y6c) this.r.p;
        y6cVar.getClass();
        o(y6cVar.d());
        q0(this.G.a, y6cVar.g.a);
        mij mijVar = this.G.a;
        float f = this.o.mo9getPlaybackParameters().a;
        boolean z2 = this.G.l;
        nh6[] nh6VarArr = (nh6[]) gtjVar.e;
        yq4 yq4Var = this.f;
        yq4Var.getClass();
        lv9 lv9Var = yq4Var.p;
        cse cseVar = this.u;
        Integer num = (Integer) lv9Var.get(cseVar.a);
        int intValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        wq4 wq4Var = (wq4) yq4Var.q.get(cseVar);
        wq4Var.getClass();
        if (intValue == -1) {
            v5c v5cVar = mijVar.m(mijVar.g(sccVar.a, yq4Var.b).c, yq4Var.a, 0L).b.b;
            if (v5cVar != null) {
                String scheme = v5cVar.a.getScheme();
                if (TextUtils.isEmpty(scheme) || yq4.s.contains(scheme)) {
                    z = true;
                    length = nh6VarArr.length;
                    i = 0;
                    int i2 = 0;
                    while (true) {
                        int i3 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                        if (i >= length) {
                            nh6 nh6Var = nh6VarArr[i];
                            if (nh6Var != null) {
                                switch (nh6Var.getTrackGroup().c) {
                                    case -2:
                                        i3 = 0;
                                        i2 += i3;
                                        break;
                                    case -1:
                                    case 1:
                                        i2 += i3;
                                        break;
                                    case 0:
                                        i3 = 144310272;
                                        i2 += i3;
                                        break;
                                    case 2:
                                        i3 = z ? 19660800 : 131072000;
                                        i2 += i3;
                                        break;
                                    case 3:
                                    case 5:
                                    case 6:
                                        i3 = 131072;
                                        i2 += i3;
                                        break;
                                    case 4:
                                        i3 = 26214400;
                                        i2 += i3;
                                        break;
                                    default:
                                        ilg.c();
                                        break;
                                }
                                return;
                            }
                            i++;
                        } else {
                            intValue = nik.j(i2, C.DEFAULT_VIDEO_BUFFER_SIZE, 210239488);
                        }
                    }
                }
            }
            z = false;
            length = nh6VarArr.length;
            i = 0;
            int i22 = 0;
            while (true) {
                int i32 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                if (i >= length) {
                }
                i++;
            }
        }
        wq4Var.c = intValue;
        yq4Var.c();
    }

    public final void w(hke hkeVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.H.c(1);
            }
            this.G = this.G.g(hkeVar);
        }
        float f2 = hkeVar.a;
        y6c y6cVar = (y6c) this.r.m;
        while (true) {
            i = 0;
            if (y6cVar == null) {
                break;
            }
            nh6[] nh6VarArr = (nh6[]) y6cVar.o.e;
            int length = nh6VarArr.length;
            while (i < length) {
                nh6 nh6Var = nh6VarArr[i];
                if (nh6Var != null) {
                    nh6Var.onPlaybackSpeed(f2);
                }
                i++;
            }
            y6cVar = y6cVar.m;
        }
        tyf[] tyfVarArr = this.a;
        int length2 = tyfVarArr.length;
        while (i < length2) {
            tyf tyfVar = tyfVarArr[i];
            float f3 = hkeVar.a;
            ((n51) tyfVar.e).z(f, f3);
            n51 n51Var = (n51) tyfVar.f;
            if (n51Var != null) {
                n51Var.z(f, f3);
            }
            i++;
        }
    }

    public final void w0(int i, int i2, List list) {
        this.H.c(1);
        tdc tdcVar = this.s;
        tdcVar.getClass();
        ArrayList arrayList = (ArrayList) tdcVar.b;
        z1a.s(i >= 0 && i <= i2 && i2 <= arrayList.size());
        z1a.s(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((sdc) arrayList.get(i3)).a.b((h6c) list.get(i3 - i));
        }
        u(tdcVar.e(), false);
    }

    public final fke x(scc sccVar, long j, long j2, long j3, boolean z, int i) {
        vvf vvfVar;
        boolean z2;
        this.Y = (!this.Y && j == this.G.s && sccVar.equals(this.G.b)) ? false : true;
        O();
        fke fkeVar = this.G;
        qsj qsjVar = fkeVar.h;
        gtj gtjVar = fkeVar.i;
        List list = fkeVar.j;
        if (this.s.g) {
            y6c y6cVar = (y6c) this.r.m;
            qsjVar = y6cVar == null ? qsj.d : y6cVar.n;
            gtjVar = y6cVar == null ? this.e : y6cVar.o;
            nh6[] nh6VarArr = (nh6[]) gtjVar.e;
            zu9 zu9Var = new zu9(4);
            boolean z3 = false;
            for (nh6 nh6Var : nh6VarArr) {
                if (nh6Var != null) {
                    ric ricVar = nh6Var.getFormat(0).l;
                    if (ricVar == null) {
                        zu9Var.c(new ric(new lic[0]));
                    } else {
                        zu9Var.c(ricVar);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                vvfVar = zu9Var.g();
            } else {
                av9 av9Var = hv9.b;
                vvfVar = vvf.e;
            }
            list = vvfVar;
            if (y6cVar != null) {
                b7c b7cVar = y6cVar.g;
                if (b7cVar.d != j2) {
                    y6cVar.g = b7cVar.a(j2);
                }
            }
            tyf[] tyfVarArr = this.a;
            d7c d7cVar = this.r;
            y6c y6cVar2 = (y6c) d7cVar.m;
            if (y6cVar2 == ((y6c) d7cVar.n) && y6cVar2 != null) {
                gtj gtjVar2 = y6cVar2.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= tyfVarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (gtjVar2.r(i2)) {
                        if (((n51) tyfVarArr[i2].e).b != 1) {
                            z2 = false;
                            break;
                        }
                        if (((syf[]) gtjVar2.d)[i2].a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.S) {
                    this.S = z5;
                    if (!z5 && this.G.p) {
                        this.h.g(2);
                    }
                }
            }
        } else if (!sccVar.equals(fkeVar.b)) {
            qsjVar = qsj.d;
            gtjVar = this.e;
            av9 av9Var2 = hv9.b;
            list = vvf.e;
        }
        gtj gtjVar3 = gtjVar;
        List list2 = list;
        qsj qsjVar2 = qsjVar;
        if (z) {
            w2d w2dVar = this.H;
            if (!w2dVar.d || w2dVar.f == 5) {
                w2dVar.c = true;
                w2dVar.d = true;
                w2dVar.f = i;
            } else {
                z1a.s(i == 5);
            }
        }
        fke fkeVar2 = this.G;
        return fkeVar2.d(sccVar, j, j2, j3, o(fkeVar2.q), qsjVar2, gtjVar3, list2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x02c5, code lost:
    
        if (((long) ((r3.e() - r23.V) / r23.o.mo9getPlaybackParameters().a)) > 10000000) goto L249;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0() {
        y6c y6cVar;
        long j;
        y6c y6cVar2;
        y6c y6cVar3;
        tyf[] tyfVarArr;
        d7c d7cVar;
        boolean z;
        y6c y6cVar4;
        y6c y6cVar5;
        y6c a;
        boolean z2;
        int i;
        tyf[] tyfVarArr2;
        int i2;
        boolean z3;
        boolean z4;
        char c;
        int i3;
        int i4;
        y6c y6cVar6;
        y6c y6cVar7;
        boolean z5;
        int i5;
        if (this.G.a.p() || !this.s.g) {
            return;
        }
        this.r.l(this.V);
        d7c d7cVar2 = this.r;
        y6c y6cVar8 = (y6c) d7cVar2.p;
        if (y6cVar8 == null || (!y6cVar8.g.k && y6cVar8.g() && ((y6c) d7cVar2.p).g.f != C.TIME_UNSET && d7cVar2.d < 100)) {
            d7c d7cVar3 = this.r;
            long j2 = this.V;
            fke fkeVar = this.G;
            y6c y6cVar9 = (y6c) d7cVar3.p;
            b7c d = y6cVar9 == null ? d7cVar3.d(fkeVar.a, fkeVar.b, fkeVar.c, fkeVar.s, C.TIME_UNSET) : d7cVar3.c(fkeVar.a, y6cVar9, j2);
            if (d != null) {
                d7c d7cVar4 = this.r;
                y6c y6cVar10 = (y6c) d7cVar4.p;
                long j3 = y6cVar10 == null ? 1000000000000L : (y6cVar10.p + y6cVar10.g.f) - d.b;
                int i6 = 0;
                while (true) {
                    if (i6 >= d7cVar4.g.size()) {
                        y6cVar = null;
                        break;
                    }
                    b7c b7cVar = ((y6c) d7cVar4.g.get(i6)).g;
                    long j4 = b7cVar.f;
                    long j5 = d.f;
                    if ((j4 == C.TIME_UNSET || j4 == j5) && b7cVar.b == d.b && b7cVar.a.equals(d.a)) {
                        y6cVar = (y6c) d7cVar4.g.remove(i6);
                        break;
                    }
                    i6++;
                }
                if (y6cVar == null) {
                    ih6 ih6Var = (ih6) ((kt4) d7cVar4.l).b;
                    n51[] n51VarArr = ih6Var.b;
                    iu4 iu4Var = ih6Var.d;
                    yq4 yq4Var = ih6Var.f;
                    cse cseVar = ih6Var.u;
                    yq4Var.getClass();
                    j = -9223372036854775807L;
                    l2a l2aVar = new l2a(yq4Var, cseVar);
                    tdc tdcVar = ih6Var.s;
                    gtj gtjVar = ih6Var.e;
                    ih6Var.b0.getClass();
                    y6cVar = new y6c(n51VarArr, j3, iu4Var, l2aVar, tdcVar, d, gtjVar);
                } else {
                    j = -9223372036854775807L;
                    y6cVar.g = d;
                    y6cVar.p = j3;
                }
                y6c y6cVar11 = (y6c) d7cVar4.p;
                if (y6cVar11 == null) {
                    d7cVar4.m = y6cVar;
                    d7cVar4.n = y6cVar;
                    d7cVar4.o = y6cVar;
                } else if (y6cVar != y6cVar11.m) {
                    y6cVar11.b();
                    y6cVar11.m = y6cVar;
                    y6cVar11.c();
                }
                d7cVar4.e = null;
                d7cVar4.p = y6cVar;
                d7cVar4.d++;
                d7cVar4.k();
                if (!y6cVar.d) {
                    long j6 = d.b;
                    y6cVar.d = true;
                    y6cVar.a.f(this, j6);
                } else if (y6cVar.e) {
                    this.h.c(8, y6cVar.a).b();
                }
                if (((y6c) this.r.m) == y6cVar) {
                    P(d.b, true);
                }
                t(false);
                if (this.N) {
                    B();
                } else {
                    this.N = y((y6c) this.r.p);
                    u0();
                }
                d7c d7cVar5 = this.r;
                if (!this.K && this.x && !this.d0 && !f() && (y6cVar6 = (y6c) d7cVar5.o) != null && y6cVar6 == ((y6c) d7cVar5.n) && (y6cVar7 = y6cVar6.m) != null && (z5 = y6cVar7.e)) {
                    z1a.E(z5);
                    if (((long) ((y6cVar7.e() - this.V) / this.o.mo9getPlaybackParameters().a)) <= 10000000) {
                        y6c y6cVar12 = (y6c) d7cVar5.o;
                        y6cVar12.getClass();
                        d7cVar5.o = y6cVar12.m;
                        d7cVar5.k();
                        ((y6c) d7cVar5.o).getClass();
                        tyf[] tyfVarArr3 = this.a;
                        y6c y6cVar13 = (y6c) d7cVar5.o;
                        if (y6cVar13 != null) {
                            gtj gtjVar2 = y6cVar13.o;
                            for (int i7 = 0; i7 < tyfVarArr3.length; i7++) {
                                if (gtjVar2.r(i7)) {
                                    tyf tyfVar = tyfVarArr3[i7];
                                    if (((n51) tyfVar.f) != null && !tyfVar.f()) {
                                        tyf tyfVar2 = tyfVarArr3[i7];
                                        z1a.E(!tyfVar2.f());
                                        if (tyf.h((n51) tyfVar2.e)) {
                                            i5 = 3;
                                        } else {
                                            n51 n51Var = (n51) tyfVar2.f;
                                            i5 = (n51Var == null || n51Var.h == 0) ? 2 : 4;
                                        }
                                        tyfVar2.d = i5;
                                        j(y6cVar13, i7, false, y6cVar13.e());
                                    }
                                }
                            }
                            if (f()) {
                                this.c0 = y6cVar13.a.readDiscontinuity();
                                if (!y6cVar13.g()) {
                                    d7cVar5.m(y6cVar13);
                                    t(false);
                                    B();
                                }
                            }
                        }
                    }
                }
                boolean z6 = this.x;
                tyf[] tyfVarArr4 = this.a;
                d7c d7cVar6 = this.r;
                y6cVar2 = (y6c) d7cVar6.n;
                if (y6cVar2 != null) {
                    if (y6cVar2.m == null || this.K) {
                        if (y6cVar2.g.k || this.K) {
                            for (tyf tyfVar3 : tyfVarArr4) {
                                if (tyfVar3.d(y6cVar2) != null) {
                                    n51 d2 = tyfVar3.d(y6cVar2);
                                    d2.getClass();
                                    if (d2.i()) {
                                        long j7 = y6cVar2.g.f;
                                        long j8 = (j7 == C.TIME_UNSET || j7 == Long.MIN_VALUE) ? -9223372036854775807L : j7 + y6cVar2.p;
                                        n51 d3 = tyfVar3.d(y6cVar2);
                                        d3.getClass();
                                        tyf.l(d3, j8);
                                    }
                                }
                            }
                        }
                    } else if (y6cVar2.e) {
                        int i8 = 0;
                        while (true) {
                            if (i8 < tyfVarArr4.length) {
                                tyf tyfVar4 = tyfVarArr4[i8];
                                if (!tyfVar4.e(y6cVar2, (n51) tyfVar4.e) || !tyfVar4.e(y6cVar2, (n51) tyfVar4.f)) {
                                    break;
                                } else {
                                    i8++;
                                }
                            } else if (!f() || ((y6c) d7cVar6.o) != ((y6c) d7cVar6.n)) {
                                y6c y6cVar14 = y6cVar2.m;
                                if (y6cVar14.e || this.V >= y6cVar14.e()) {
                                    boolean z7 = y6cVar2.m.e;
                                    if (z7) {
                                        z1a.E(z7);
                                    }
                                    gtj gtjVar3 = y6cVar2.o;
                                    y6c y6cVar15 = (y6c) d7cVar6.o;
                                    y6c y6cVar16 = (y6c) d7cVar6.n;
                                    if (y6cVar15 == y6cVar16) {
                                        y6cVar16.getClass();
                                        d7cVar6.o = y6cVar16.m;
                                    }
                                    y6c y6cVar17 = (y6c) d7cVar6.n;
                                    y6cVar17.getClass();
                                    d7cVar6.n = y6cVar17.m;
                                    d7cVar6.k();
                                    y6c y6cVar18 = (y6c) d7cVar6.n;
                                    y6cVar18.getClass();
                                    gtj gtjVar4 = y6cVar18.o;
                                    mij mijVar = this.G.a;
                                    A0(mijVar, y6cVar18.g.a, mijVar, y6cVar2.g.a, C.TIME_UNSET, false);
                                    if (y6cVar18.e && ((z6 && this.c0 != j) || y6cVar18.a.readDiscontinuity() != j)) {
                                        this.c0 = j;
                                        boolean z8 = z6 && !this.d0;
                                        if (z8) {
                                            int i9 = 0;
                                            while (true) {
                                                if (i9 >= tyfVarArr4.length) {
                                                    break;
                                                }
                                                boolean r = gtjVar4.r(i9);
                                                nh6[] nh6VarArr = (nh6[]) gtjVar4.e;
                                                if (r && ((n51) tyfVarArr4[i9].e).b != -2 && !sjc.a(nh6VarArr[i9].getSelectedFormat().o, nh6VarArr[i9].getSelectedFormat().k) && !tyfVarArr4[i9].f()) {
                                                    z8 = false;
                                                    break;
                                                }
                                                i9++;
                                            }
                                        }
                                        if (!z8) {
                                            long e = y6cVar18.e();
                                            for (tyf tyfVar5 : tyfVarArr4) {
                                                n51 n51Var2 = (n51) tyfVar5.f;
                                                n51 n51Var3 = (n51) tyfVar5.e;
                                                if (tyf.h(n51Var3) && (i4 = tyfVar5.d) != 4 && i4 != 2) {
                                                    tyf.l(n51Var3, e);
                                                }
                                                if (n51Var2 != null && n51Var2.h != 0 && tyfVar5.d != 3) {
                                                    tyf.l(n51Var2, e);
                                                }
                                            }
                                            if (!y6cVar18.g()) {
                                                d7cVar6.m(y6cVar18);
                                                t(false);
                                                B();
                                            }
                                        }
                                    }
                                    for (tyf tyfVar6 : tyfVarArr4) {
                                        long e2 = y6cVar18.e();
                                        n51 n51Var4 = (n51) tyfVar6.e;
                                        int i10 = tyfVar6.c;
                                        boolean r2 = gtjVar3.r(i10);
                                        boolean r3 = gtjVar4.r(i10);
                                        n51 n51Var5 = (n51) tyfVar6.f;
                                        if (n51Var5 == null || (i3 = tyfVar6.d) == 3 || (i3 == 0 && tyf.h(n51Var4))) {
                                            n51Var5 = n51Var4;
                                        }
                                        if (!r2 || n51Var5.n) {
                                            c = 65534;
                                        } else {
                                            int i11 = n51Var4.b;
                                            c = 65534;
                                            boolean z9 = i11 == -2;
                                            syf syfVar = ((syf[]) gtjVar3.d)[i10];
                                            syf syfVar2 = ((syf[]) gtjVar4.d)[i10];
                                            if (!r3 || !Objects.equals(syfVar2, syfVar) || z9 || tyfVar6.f()) {
                                                tyf.l(n51Var5, e2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                d7c d7cVar7 = this.r;
                y6cVar3 = (y6c) d7cVar7.n;
                if (y6cVar3 != null && ((y6c) d7cVar7.m) != y6cVar3 && !y6cVar3.h) {
                    tyfVarArr2 = this.a;
                    gtj gtjVar5 = y6cVar3.o;
                    z3 = true;
                    for (i2 = 0; i2 < tyfVarArr2.length; i2++) {
                        int c2 = tyfVarArr2[i2].c();
                        tyf tyfVar7 = tyfVarArr2[i2];
                        ar4 ar4Var = this.o;
                        int j9 = tyfVar7.j((n51) tyfVar7.e, y6cVar3, gtjVar5, ar4Var);
                        int j10 = tyfVar7.j((n51) tyfVar7.f, y6cVar3, gtjVar5, ar4Var);
                        if (j9 == 1) {
                            j9 = j10;
                        }
                        if ((j9 & 2) != 0 && (z4 = this.S) && z4) {
                            this.S = false;
                            if (this.G.p) {
                                this.h.g(2);
                            }
                        }
                        this.T -= c2 - tyfVarArr2[i2].c();
                        z3 &= (j9 & 1) != 0;
                    }
                    if (z3) {
                        for (int i12 = 0; i12 < tyfVarArr2.length; i12++) {
                            if (gtjVar5.r(i12) && tyfVarArr2[i12].d(y6cVar3) == null) {
                                j(y6cVar3, i12, false, y6cVar3.e());
                            }
                        }
                    }
                    if (z3) {
                        ((y6c) d7cVar7.n).h = true;
                    }
                }
                tyfVarArr = this.a;
                d7cVar = this.r;
                z = false;
                while (p0() && !this.K && (y6cVar4 = (y6c) d7cVar.m) != null && (y6cVar5 = y6cVar4.m) != null && this.V >= y6cVar5.e() && y6cVar5.h) {
                    if (z) {
                        D();
                    }
                    this.d0 = false;
                    a = d7cVar.a();
                    a.getClass();
                    if (this.G.b.a.equals(a.g.a.a)) {
                        scc sccVar = this.G.b;
                        if (sccVar.b == -1) {
                            scc sccVar2 = a.g.a;
                            if (sccVar2.b == -1 && sccVar.e != sccVar2.e) {
                                z2 = true;
                                b7c b7cVar2 = a.g;
                                boolean z10 = z2;
                                scc sccVar3 = b7cVar2.a;
                                long j11 = b7cVar2.b;
                                this.G = x(sccVar3, j11, b7cVar2.d, j11, !z10, 0);
                                O();
                                z0();
                                if (f() && a == ((y6c) d7cVar.o)) {
                                    for (tyf tyfVar8 : tyfVarArr) {
                                        int i13 = tyfVar8.d;
                                        if (i13 == 3 || i13 == 4) {
                                            boolean z11 = i13 == 4;
                                            n51 n51Var6 = (n51) tyfVar8.e;
                                            n51 n51Var7 = (n51) tyfVar8.f;
                                            if (z11) {
                                                n51Var7.getClass();
                                                n51Var7.handleMessage(17, n51Var6);
                                            } else {
                                                n51Var7.getClass();
                                                n51Var6.handleMessage(17, n51Var7);
                                            }
                                            tyfVar8.d = tyfVar8.d == 4 ? 0 : 1;
                                        } else if (i13 == 2) {
                                            tyfVar8.d = 0;
                                        }
                                    }
                                }
                                if (this.G.e == 3) {
                                    r0();
                                }
                                gtj gtjVar6 = ((y6c) d7cVar.m).o;
                                for (i = 0; i < tyfVarArr.length; i++) {
                                    if (gtjVar6.r(i)) {
                                        tyf tyfVar9 = tyfVarArr[i];
                                        n51 n51Var8 = (n51) tyfVar9.f;
                                        n51 n51Var9 = (n51) tyfVar9.e;
                                        if (tyf.h(n51Var9)) {
                                            n51Var9.e();
                                        } else if (n51Var8 != null && n51Var8.h != 0) {
                                            n51Var8.e();
                                        }
                                    }
                                }
                                z = true;
                            }
                        }
                    }
                    z2 = false;
                    b7c b7cVar22 = a.g;
                    boolean z102 = z2;
                    scc sccVar32 = b7cVar22.a;
                    long j112 = b7cVar22.b;
                    this.G = x(sccVar32, j112, b7cVar22.d, j112, !z102, 0);
                    O();
                    z0();
                    if (f()) {
                        while (r2 < r1) {
                        }
                    }
                    if (this.G.e == 3) {
                    }
                    gtj gtjVar62 = ((y6c) d7cVar.m).o;
                    while (i < tyfVarArr.length) {
                    }
                    z = true;
                }
                this.b0.getClass();
            }
        }
        j = -9223372036854775807L;
        if (this.N) {
        }
        d7c d7cVar52 = this.r;
        if (!this.K) {
            z1a.E(z5);
            if (((long) ((y6cVar7.e() - this.V) / this.o.mo9getPlaybackParameters().a)) <= 10000000) {
            }
        }
        boolean z62 = this.x;
        tyf[] tyfVarArr42 = this.a;
        d7c d7cVar62 = this.r;
        y6cVar2 = (y6c) d7cVar62.n;
        if (y6cVar2 != null) {
        }
        d7c d7cVar72 = this.r;
        y6cVar3 = (y6c) d7cVar72.n;
        if (y6cVar3 != null) {
            tyfVarArr2 = this.a;
            gtj gtjVar52 = y6cVar3.o;
            z3 = true;
            while (i2 < tyfVarArr2.length) {
            }
            if (z3) {
            }
            if (z3) {
            }
        }
        tyfVarArr = this.a;
        d7cVar = this.r;
        z = false;
        while (p0()) {
            if (z) {
            }
            this.d0 = false;
            a = d7cVar.a();
            a.getClass();
            if (this.G.b.a.equals(a.g.a.a)) {
            }
            z2 = false;
            b7c b7cVar222 = a.g;
            boolean z1022 = z2;
            scc sccVar322 = b7cVar222.a;
            long j1122 = b7cVar222.b;
            this.G = x(sccVar322, j1122, b7cVar222.d, j1122, !z1022, 0);
            O();
            z0();
            if (f()) {
            }
            if (this.G.e == 3) {
            }
            gtj gtjVar622 = ((y6c) d7cVar.m).o;
            while (i < tyfVarArr.length) {
            }
            z = true;
        }
        this.b0.getClass();
    }

    public final void y0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.C;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        fke fkeVar = this.G;
        if (fkeVar.l == z2 && fkeVar.n == i2 && fkeVar.m == i3) {
            return;
        }
        this.G = fkeVar.e(i3, i2, z2);
        B0(false, false);
        d7c d7cVar = this.r;
        for (y6c y6cVar = (y6c) d7cVar.m; y6cVar != null; y6cVar = y6cVar.m) {
            for (nh6 nh6Var : (nh6[]) y6cVar.o.e) {
                if (nh6Var != null) {
                    nh6Var.b(z2);
                }
            }
        }
        if (!p0()) {
            t0();
            z0();
            fke fkeVar2 = this.G;
            if (fkeVar2.p) {
                this.G = fkeVar2.i(false);
            }
            d7cVar.l(this.V);
            return;
        }
        int i4 = this.G.e;
        zqi zqiVar = this.h;
        if (i4 != 3) {
            if (i4 == 2) {
                zqiVar.g(2);
            }
        } else {
            ar4 ar4Var = this.o;
            ar4Var.c = true;
            ((i9i) ar4Var.d).d();
            r0();
            zqiVar.g(2);
        }
    }

    public final boolean z(int i, scc sccVar) {
        d7c d7cVar = this.r;
        y6c y6cVar = (y6c) d7cVar.o;
        if (y6cVar != null && y6cVar.g.a.equals(sccVar)) {
            tyf tyfVar = this.a[i];
            y6c y6cVar2 = (y6c) d7cVar.o;
            int i2 = tyfVar.d;
            boolean z = (i2 == 2 || i2 == 4) && tyfVar.d(y6cVar2) == ((n51) tyfVar.e);
            boolean z2 = tyfVar.d == 3 && tyfVar.d(y6cVar2) == ((n51) tyfVar.f);
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final void z0() {
        long j;
        float f;
        long k;
        y6c y6cVar = (y6c) this.r.m;
        if (y6cVar == null) {
            return;
        }
        long readDiscontinuity = y6cVar.e ? y6cVar.a.readDiscontinuity() : -9223372036854775807L;
        if (readDiscontinuity != C.TIME_UNSET) {
            if (!y6cVar.g()) {
                this.r.m(y6cVar);
                t(false);
                B();
            }
            P(readDiscontinuity, true);
            if (readDiscontinuity != this.G.s) {
                fke fkeVar = this.G;
                this.G = x(fkeVar.b, readDiscontinuity, fkeVar.c, readDiscontinuity, true, 5);
            }
        } else {
            ar4 ar4Var = this.o;
            boolean z = y6cVar != ((y6c) this.r.n);
            i9i i9iVar = (i9i) ar4Var.d;
            n51 n51Var = (n51) ar4Var.f;
            if (n51Var == null || n51Var.j() || ((z && ((n51) ar4Var.f).h != 2) || (!((n51) ar4Var.f).l() && (z || ((n51) ar4Var.f).i())))) {
                ar4Var.b = true;
                if (ar4Var.c) {
                    i9iVar.d();
                }
            } else {
                m2c m2cVar = (m2c) ar4Var.g;
                m2cVar.getClass();
                long positionUs = m2cVar.getPositionUs();
                if (ar4Var.b) {
                    if (positionUs >= i9iVar.getPositionUs()) {
                        ar4Var.b = false;
                        if (ar4Var.c) {
                            i9iVar.d();
                        }
                    } else if (i9iVar.a) {
                        i9iVar.a(i9iVar.getPositionUs());
                        i9iVar.a = false;
                    }
                }
                i9iVar.a(positionUs);
                hke mo9getPlaybackParameters = m2cVar.mo9getPlaybackParameters();
                if (!mo9getPlaybackParameters.equals(i9iVar.d)) {
                    i9iVar.b(mo9getPlaybackParameters);
                    ((ih6) ar4Var.e).h.c(16, mo9getPlaybackParameters).b();
                }
            }
            long positionUs2 = ar4Var.getPositionUs();
            this.V = positionUs2;
            long j2 = positionUs2 - y6cVar.p;
            long j3 = this.G.s;
            if (!this.p.isEmpty() && !this.G.b.b()) {
                if (this.Y) {
                    this.Y = false;
                }
                fke fkeVar2 = this.G;
                fkeVar2.a.b(fkeVar2.b.a);
                int min = Math.min(this.X, this.p.size());
                if (min > 0 && this.p.get(min - 1) != null) {
                    pvd.j();
                    return;
                } else {
                    if (min < this.p.size() && this.p.get(min) != null) {
                        pvd.j();
                        return;
                    }
                    this.X = min;
                }
            }
            if (this.o.c()) {
                boolean z2 = !this.H.d;
                fke fkeVar3 = this.G;
                this.G = x(fkeVar3.b, j2, fkeVar3.c, j2, z2, 6);
            } else {
                fke fkeVar4 = this.G;
                fkeVar4.s = j2;
                fkeVar4.t = SystemClock.elapsedRealtime();
            }
        }
        this.G.q = ((y6c) this.r.p).d();
        fke fkeVar5 = this.G;
        fkeVar5.r = o(fkeVar5.q);
        fke fkeVar6 = this.G;
        if (fkeVar6.l && fkeVar6.e == 3 && q0(fkeVar6.a, fkeVar6.b)) {
            fke fkeVar7 = this.G;
            float f2 = 1.0f;
            if (fkeVar7.o.a == 1.0f) {
                uq4 uq4Var = this.t;
                long l = l(fkeVar7.a, fkeVar7.b.a, fkeVar7.s);
                long j4 = this.G.r;
                if (uq4Var.d != C.TIME_UNSET) {
                    long j5 = l - j4;
                    long j6 = uq4Var.n;
                    if (j6 == C.TIME_UNSET) {
                        uq4Var.n = j5;
                        uq4Var.o = 0L;
                    } else {
                        uq4Var.n = Math.max(j5, (long) ((j5 * 9.999871E-4f) + (j6 * 0.999f)));
                        uq4Var.o = (long) ((9.999871E-4f * Math.abs(j5 - r9)) + (uq4Var.o * 0.999f));
                    }
                    if (uq4Var.m != C.TIME_UNSET) {
                        j = 1000;
                        if (SystemClock.elapsedRealtime() - uq4Var.m < 1000) {
                            f2 = uq4Var.l;
                        }
                    } else {
                        j = 1000;
                    }
                    uq4Var.m = SystemClock.elapsedRealtime();
                    long j7 = (uq4Var.o * 3) + uq4Var.n;
                    if (uq4Var.i > j7) {
                        float T = nik.T(j);
                        f = 1.0E-7f;
                        k = jaa.H(j7, uq4Var.f, uq4Var.i - (((long) ((uq4Var.l - 1.0f) * T)) + ((long) ((uq4Var.j - 1.0f) * T))));
                        uq4Var.i = k;
                    } else {
                        f = 1.0E-7f;
                        k = nik.k(l - ((long) (Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, uq4Var.l - 1.0f) / 1.0E-7f)), uq4Var.i, j7);
                        uq4Var.i = k;
                        long j8 = uq4Var.h;
                        if (j8 != C.TIME_UNSET && k > j8) {
                            uq4Var.i = j8;
                            k = j8;
                        }
                    }
                    long j9 = l - k;
                    if (Math.abs(j9) < uq4Var.b) {
                        uq4Var.l = 1.0f;
                    } else {
                        f2 = nik.i((f * j9) + 1.0f, uq4Var.k, uq4Var.j);
                        uq4Var.l = f2;
                    }
                }
                if (this.o.mo9getPlaybackParameters().a != f2) {
                    hke hkeVar = new hke(f2, this.G.o.b);
                    this.h.f(16);
                    this.o.b(hkeVar);
                    w(this.G.o, this.o.mo9getPlaybackParameters().a, false, false);
                }
            }
        }
    }
}
