package androidx.media3.exoplayer;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.f;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.r;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import xsna.ahn;
import xsna.c0;
import xsna.chp0;
import xsna.cq10;
import xsna.czf0;
import xsna.d7q;
import xsna.dpk0;
import xsna.dvf;
import xsna.ehp0;
import xsna.eo4;
import xsna.et10;
import xsna.ewo0;
import xsna.fi20;
import xsna.fih0;
import xsna.fq1;
import xsna.fqn0;
import xsna.ft10;
import xsna.fwa0;
import xsna.fxc0;
import xsna.gil;
import xsna.gms0;
import xsna.hkz;
import xsna.hwa0;
import xsna.ieb0;
import xsna.io20;
import xsna.jeb0;
import xsna.jwa0;
import xsna.kr10;
import xsna.m0h0;
import xsna.mjp0;
import xsna.nc4;
import xsna.o3i0;
import xsna.otu;
import xsna.p06;
import xsna.q6q;
import xsna.qfp0;
import xsna.shl;
import xsna.sn;
import xsna.u5;
import xsna.wwi;
import xsna.wyf0;
import xsna.x1b0;
import xsna.xg0;
import xsna.xqc;
import xsna.xu1;
import xsna.y2r0;
import xsna.zw1;

/* compiled from: ExoPlayerImplInternal.java */
/* loaded from: classes12.dex */
public final class d implements Handler.Callback, h.a, chp0.b, i.a, gms0 {
    public static final long i0 = y2r0.j0(10000);
    public final boolean A;
    public final eo4 B;
    public final boolean C;
    public o3i0 D;
    public boolean F;
    public boolean G;

    @Nullable
    public g H;
    public int I;
    public fwa0 J;
    public e K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean Q;
    public int R;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;

    @Nullable
    public g X;
    public long Y;
    public long Z;
    public int a0;
    public final czf0[] b;
    public boolean b0;
    public final k[] c;

    @Nullable
    public ExoPlaybackException c0;
    public final boolean[] d;
    public final chp0 e;
    public ExoPlayer.c e0;
    public final ehp0 f;
    public final androidx.media3.exoplayer.e g;
    public boolean g0;
    public final p06 h;
    public final otu i;
    public final hwa0 j;
    public final Looper k;
    public final ewo0.c l;
    public final ewo0.b m;
    public final long n;
    public final boolean o;
    public final gil p;
    public final ArrayList<C0052d> q;
    public final dvf r;
    public final fq1 s;
    public final androidx.media3.exoplayer.g t;
    public final h u;
    public final hkz v;
    public final long w;
    public final x1b0 x;
    public final zw1 y;
    public final otu z;
    public long f0 = C.TIME_UNSET;
    public boolean S = false;
    public float h0 = 1.0f;
    public fih0 E = fih0.b;
    public long d0 = C.TIME_UNSET;
    public long P = C.TIME_UNSET;

    /* compiled from: ExoPlayerImplInternal.java */
    public class a implements j.a {
        public a() {
        }

        @Override // androidx.media3.exoplayer.j.a
        public final void a() {
            d.this.U = true;
        }

        @Override // androidx.media3.exoplayer.j.a
        public final void b() {
            d dVar = d.this;
            if (dVar.F) {
                dVar.E.getClass();
            } else if (!dVar.V) {
                return;
            }
            dVar.i.sendEmptyMessage(2);
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    public static final class b {
        public final ArrayList a;
        public final r b;
        public final int c;
        public final long d;

        public b() {
            throw null;
        }

        public b(ArrayList arrayList, r rVar, int i, long j) {
            this.a = arrayList;
            this.b = rVar;
            this.c = i;
            this.d = j;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    public static class c {
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* renamed from: androidx.media3.exoplayer.d$d, reason: collision with other inner class name */
    public static final class C0052d implements Comparable<C0052d> {
        public final i b;
        public int c;
        public long d;

        @Nullable
        public Object e;

        public C0052d(i iVar) {
            this.b = iVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(C0052d c0052d) {
            C0052d c0052d2 = c0052d;
            Object obj = this.e;
            if ((obj == null) != (c0052d2.e == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.c - c0052d2.c;
            return i != 0 ? i : Long.compare(this.d, c0052d2.d);
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    public static final class e {
        public boolean a;
        public fwa0 b;
        public int c;
        public boolean d;
        public int e;

        public e(fwa0 fwa0Var) {
            this.b = fwa0Var;
        }

        public final void a(int i) {
            this.a |= i > 0;
            this.c += i;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    public static final class f {
        public final i.b a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public f(i.b bVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.a = bVar;
            this.b = j;
            this.c = j2;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    public static final class g {
        public final ewo0 a;
        public final int b;
        public final long c;

        public g(ewo0 ewo0Var, int i, long j) {
            this.a = ewo0Var;
            this.b = i;
            this.c = j;
        }
    }

    public d(Context context, j[] jVarArr, j[] jVarArr2, chp0 chp0Var, ehp0 ehp0Var, androidx.media3.exoplayer.e eVar, p06 p06Var, int i, zw1 zw1Var, o3i0 o3i0Var, shl shlVar, long j, boolean z, Looper looper, dvf dvfVar, fq1 fq1Var, x1b0 x1b0Var, @Nullable hwa0 hwa0Var, ExoPlayer.c cVar, final gms0 gms0Var, boolean z2) {
        Looper looper2;
        this.s = fq1Var;
        this.e = chp0Var;
        this.f = ehp0Var;
        this.g = eVar;
        this.h = p06Var;
        this.R = i;
        boolean z3 = false;
        this.D = o3i0Var;
        this.v = shlVar;
        this.w = j;
        this.M = z;
        this.r = dvfVar;
        this.x = x1b0Var;
        this.e0 = cVar;
        this.y = zw1Var;
        this.C = z2;
        this.n = eVar.getBackBufferDurationUs();
        this.o = eVar.retainBackBufferFromKeyframe();
        ewo0.a aVar = ewo0.a;
        fwa0 k = fwa0.k(ehp0Var);
        this.J = k;
        this.K = new e(k);
        this.c = new k[jVarArr.length];
        this.d = new boolean[jVarArr.length];
        k.a b2 = chp0Var.b();
        this.b = new czf0[jVarArr.length];
        boolean z4 = false;
        for (int i2 = 0; i2 < jVarArr.length; i2++) {
            jVarArr[i2].g(i2, x1b0Var, dvfVar);
            this.c[i2] = jVarArr[i2].getCapabilities();
            if (b2 != null) {
                this.c[i2].p(b2);
            }
            j jVar = jVarArr2[i2];
            if (jVar != null) {
                jVar.g(i2, x1b0Var, dvfVar);
                z4 = true;
            }
            this.b[i2] = new czf0(jVarArr[i2], jVarArr2[i2], i2);
        }
        this.A = z4;
        this.p = new gil(this, dvfVar);
        this.q = new ArrayList<>();
        this.l = new ewo0.c();
        this.m = new ewo0.b();
        chp0Var.c(this, p06Var);
        this.b0 = true;
        fqn0 createHandler = dvfVar.createHandler(looper, null);
        this.z = createHandler;
        this.t = new androidx.media3.exoplayer.g(zw1Var, createHandler, new u5(this, 12), cVar);
        this.u = new h(this, zw1Var, createHandler, x1b0Var);
        hwa0 hwa0Var2 = hwa0Var == null ? new hwa0(null) : hwa0Var;
        this.j = hwa0Var2;
        synchronized (hwa0Var2.a) {
            try {
                if (hwa0Var2.b == null) {
                    if (hwa0Var2.d == 0 && hwa0Var2.c == null) {
                        z3 = true;
                    }
                    fxc0.z(z3);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    hwa0Var2.c = handlerThread;
                    handlerThread.start();
                    hwa0Var2.b = hwa0Var2.c.getLooper();
                }
                hwa0Var2.d++;
                looper2 = hwa0Var2.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.k = looper2;
        fqn0 createHandler2 = dvfVar.createHandler(looper2, this);
        this.i = createHandler2;
        this.B = new eo4(context, looper2, this);
        createHandler2.obtainMessage(35, new gms0() { // from class: xsna.s6q
            @Override // xsna.gms0
            public final void a(long j2, long j3, androidx.media3.common.a aVar2, MediaFormat mediaFormat) {
                androidx.media3.exoplayer.d dVar = androidx.media3.exoplayer.d.this;
                dVar.getClass();
                gms0Var.a(j2, j3, aVar2, mediaFormat);
                dVar.a(j2, j3, aVar2, mediaFormat);
            }
        }).b();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.q, java.lang.Object] */
    public static boolean A(@Nullable et10 et10Var) {
        if (et10Var != null) {
            try {
                ?? r1 = et10Var.a;
                if (et10Var.e) {
                    for (m0h0 m0h0Var : et10Var.c) {
                        if (m0h0Var != null) {
                            m0h0Var.maybeThrowError();
                        }
                    }
                } else {
                    r1.maybeThrowPrepareError();
                }
                if ((!et10Var.e ? 0L : r1.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static void R(ewo0 ewo0Var, C0052d c0052d, ewo0.c cVar, ewo0.b bVar) {
        int i = ewo0Var.m(ewo0Var.g(c0052d.e, bVar).c, cVar, 0L).o;
        Object obj = ewo0Var.f(i, bVar, true).b;
        long j = bVar.d;
        long j2 = j != C.TIME_UNSET ? j - 1 : Long.MAX_VALUE;
        c0052d.c = i;
        c0052d.d = j2;
        c0052d.e = obj;
    }

    public static boolean S(C0052d c0052d, ewo0 ewo0Var, ewo0 ewo0Var2, int i, boolean z, ewo0.c cVar, ewo0.b bVar) {
        Object obj = c0052d.e;
        i iVar = c0052d.b;
        if (obj == null) {
            long j = iVar.i;
            Pair<Object, Long> U = U(ewo0Var, new g(iVar.d, iVar.h, j == Long.MIN_VALUE ? C.TIME_UNSET : y2r0.S(j)), false, i, z, cVar, bVar);
            if (U == null) {
                return false;
            }
            int b2 = ewo0Var.b(U.first);
            long longValue = ((Long) U.second).longValue();
            Object obj2 = U.first;
            c0052d.c = b2;
            c0052d.d = longValue;
            c0052d.e = obj2;
            if (iVar.i == Long.MIN_VALUE) {
                R(ewo0Var, c0052d, cVar, bVar);
                return true;
            }
        } else {
            int b3 = ewo0Var.b(obj);
            if (b3 == -1) {
                return false;
            }
            if (iVar.i == Long.MIN_VALUE) {
                R(ewo0Var, c0052d, cVar, bVar);
                return true;
            }
            c0052d.c = b3;
            ewo0Var2.g(c0052d.e, bVar);
            if (bVar.f && ewo0Var2.m(bVar.c, cVar, 0L).n == ewo0Var2.b(c0052d.e)) {
                Pair<Object, Long> i2 = ewo0Var.i(cVar, bVar, ewo0Var.g(c0052d.e, bVar).c, c0052d.d + bVar.e);
                int b4 = ewo0Var.b(i2.first);
                long longValue2 = ((Long) i2.second).longValue();
                Object obj3 = i2.first;
                c0052d.c = b4;
                c0052d.d = longValue2;
                c0052d.e = obj3;
            }
        }
        return true;
    }

    @Nullable
    public static Pair<Object, Long> U(ewo0 ewo0Var, g gVar, boolean z, int i, boolean z2, ewo0.c cVar, ewo0.b bVar) {
        int V;
        ewo0 ewo0Var2 = gVar.a;
        if (ewo0Var.p()) {
            return null;
        }
        ewo0 ewo0Var3 = ewo0Var2.p() ? ewo0Var : ewo0Var2;
        try {
            Pair<Object, Long> i2 = ewo0Var3.i(cVar, bVar, gVar.b, gVar.c);
            if (!ewo0Var.equals(ewo0Var3)) {
                if (ewo0Var.b(i2.first) == -1) {
                    if (!z || (V = V(cVar, bVar, i, z2, i2.first, ewo0Var3, ewo0Var)) == -1) {
                        return null;
                    }
                    return ewo0Var.i(cVar, bVar, V, C.TIME_UNSET);
                }
                if (ewo0Var3.g(i2.first, bVar).f && ewo0Var3.m(bVar.c, cVar, 0L).n == ewo0Var3.b(i2.first)) {
                    return ewo0Var.i(cVar, bVar, ewo0Var.g(i2.first, bVar).c, gVar.c);
                }
            }
            return i2;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int V(ewo0.c cVar, ewo0.b bVar, int i, boolean z, Object obj, ewo0 ewo0Var, ewo0 ewo0Var2) {
        ewo0.c cVar2 = cVar;
        ewo0 ewo0Var3 = ewo0Var;
        Object obj2 = ewo0Var3.m(ewo0Var3.g(obj, bVar).c, cVar, 0L).a;
        for (int i2 = 0; i2 < ewo0Var2.o(); i2++) {
            if (ewo0Var2.m(i2, cVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int b2 = ewo0Var3.b(obj);
        int h = ewo0Var3.h();
        int i3 = -1;
        int i4 = 0;
        while (i4 < h && i3 == -1) {
            ewo0 ewo0Var4 = ewo0Var3;
            int d = ewo0Var4.d(b2, bVar, cVar2, i, z);
            if (d == -1) {
                break;
            }
            i3 = ewo0Var2.b(ewo0Var4.l(d));
            i4++;
            ewo0Var3 = ewo0Var4;
            b2 = d;
            cVar2 = cVar;
        }
        if (i3 == -1) {
            return -1;
        }
        return ewo0Var2.f(i3, bVar, false).c;
    }

    public static void h(i iVar) throws ExoPlaybackException {
        boolean z;
        synchronized (iVar) {
            z = iVar.l;
        }
        if (z) {
            return;
        }
        try {
            iVar.a.handleMessage(iVar.e, iVar.f);
        } finally {
            iVar.a(true);
        }
    }

    public final void A0(int i, int i2, List<kr10> list) throws ExoPlaybackException {
        this.K.a(1);
        h hVar = this.u;
        hVar.getClass();
        ArrayList arrayList = hVar.b;
        fxc0.p(i >= 0 && i <= i2 && i2 <= arrayList.size());
        fxc0.p(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((h.c) arrayList.get(i3)).a.l(list.get(i3 - i));
        }
        w(hVar.b(), false);
    }

    public final boolean B(int i, i.b bVar) {
        androidx.media3.exoplayer.g gVar = this.t;
        et10 et10Var = gVar.l;
        if (et10Var != null && et10Var.g.a.equals(bVar)) {
            czf0 czf0Var = this.b[i];
            et10 et10Var2 = gVar.l;
            int i2 = czf0Var.d;
            boolean z = (i2 == 2 || i2 == 4) && czf0Var.c(et10Var2) == czf0Var.a;
            boolean z2 = czf0Var.d == 3 && czf0Var.c(et10Var2) == czf0Var.c;
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:235:0x02a0, code lost:
    
        if (((long) ((r5.e() - r21.Y) / r21.p.getPlaybackParameters().a)) > 10000000) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04a3  */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.media3.exoplayer.source.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v62, types: [androidx.media3.exoplayer.source.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.media3.exoplayer.source.h, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0() throws ExoPlaybackException {
        et10 et10Var;
        int i;
        int i2;
        char c2;
        int i3;
        int i4;
        et10 et10Var2;
        czf0[] czf0VarArr;
        androidx.media3.exoplayer.g gVar;
        boolean z;
        et10 et10Var3;
        et10 et10Var4;
        et10 a2;
        boolean z2;
        int i5;
        czf0[] czf0VarArr2;
        int i6;
        boolean z3;
        boolean z4;
        et10 et10Var5;
        et10 et10Var6;
        boolean z5;
        czf0[] czf0VarArr3;
        ehp0 ehp0Var;
        et10 et10Var7;
        int i7;
        if (this.J.a.p() || !this.u.k) {
            return;
        }
        this.t.m(this.Y);
        androidx.media3.exoplayer.g gVar2 = this.t;
        et10 et10Var8 = gVar2.m;
        if (et10Var8 == null || (!et10Var8.g.j && et10Var8.g() && gVar2.m.g.e != C.TIME_UNSET && gVar2.o < 100)) {
            androidx.media3.exoplayer.g gVar3 = this.t;
            long j = this.Y;
            fwa0 fwa0Var = this.J;
            et10 et10Var9 = gVar3.m;
            ft10 d = et10Var9 == null ? gVar3.d(fwa0Var.a, fwa0Var.b, fwa0Var.c, fwa0Var.s) : gVar3.c(fwa0Var.a, et10Var9, j);
            if (d != null) {
                androidx.media3.exoplayer.g gVar4 = this.t;
                et10 et10Var10 = gVar4.m;
                long j2 = et10Var10 == null ? 1000000000000L : (et10Var10.p + et10Var10.g.e) - d.b;
                int i8 = 0;
                while (true) {
                    if (i8 >= gVar4.r.size()) {
                        et10Var = null;
                        break;
                    }
                    ft10 ft10Var = ((et10) gVar4.r.get(i8)).g;
                    long j3 = ft10Var.e;
                    long j4 = d.e;
                    if ((j3 == C.TIME_UNSET || j3 == j4) && ft10Var.b == d.b && ft10Var.a.equals(d.a)) {
                        et10Var = (et10) gVar4.r.remove(i8);
                        break;
                    }
                    i8++;
                }
                if (et10Var == null) {
                    d dVar = (d) gVar4.e.c;
                    k[] kVarArr = dVar.c;
                    chp0 chp0Var = dVar.e;
                    xu1 e2 = dVar.g.e(dVar.x);
                    h hVar = dVar.u;
                    ehp0 ehp0Var2 = dVar.f;
                    dVar.e0.getClass();
                    et10Var = new et10(kVarArr, j2, chp0Var, e2, hVar, d, ehp0Var2);
                } else {
                    et10Var.g = d;
                    et10Var.p = j2;
                }
                et10 et10Var11 = gVar4.m;
                if (et10Var11 == null) {
                    gVar4.j = et10Var;
                    gVar4.k = et10Var;
                    gVar4.l = et10Var;
                } else if (et10Var != et10Var11.m) {
                    et10Var11.b();
                    et10Var11.m = et10Var;
                    et10Var11.c();
                }
                gVar4.p = null;
                gVar4.m = et10Var;
                gVar4.o++;
                gVar4.l();
                if (!et10Var.d) {
                    long j5 = d.b;
                    et10Var.d = true;
                    et10Var.a.e(this, j5);
                } else if (et10Var.e) {
                    this.i.obtainMessage(8, et10Var.a).b();
                }
                if (this.t.j == et10Var) {
                    Q(d.b, true);
                }
                v(false);
            }
        }
        if (this.Q) {
            this.Q = A(this.t.m);
            y0();
        } else {
            D();
        }
        androidx.media3.exoplayer.g gVar5 = this.t;
        if (!this.N && this.A && !this.g0 && !f() && (et10Var5 = gVar5.l) != null && et10Var5 == gVar5.k && (et10Var6 = et10Var5.m) != null && (z5 = et10Var6.e)) {
            fxc0.z(z5);
            if (((long) ((et10Var6.e() - this.Y) / this.p.getPlaybackParameters().a)) <= 10000000) {
                et10 et10Var12 = gVar5.l;
                et10Var12.getClass();
                gVar5.l = et10Var12.m;
                gVar5.l();
                gVar5.l.getClass();
                czf0[] czf0VarArr4 = this.b;
                et10 et10Var13 = gVar5.l;
                if (et10Var13 != null) {
                    ehp0 ehp0Var3 = et10Var13.o;
                    et10 et10Var14 = et10Var13;
                    int i9 = 0;
                    while (i9 < czf0VarArr4.length) {
                        if (ehp0Var3.b(i9)) {
                            czf0 czf0Var = czf0VarArr4[i9];
                            if (czf0Var.c != null && !czf0Var.e()) {
                                czf0 czf0Var2 = czf0VarArr4[i9];
                                fxc0.z(!czf0Var2.e());
                                if (czf0.g(czf0Var2.a)) {
                                    i7 = 3;
                                } else {
                                    j jVar = czf0Var2.c;
                                    i7 = (jVar == null || jVar.getState() == 0) ? 2 : 4;
                                }
                                czf0Var2.d = i7;
                                czf0VarArr3 = czf0VarArr4;
                                et10Var7 = et10Var14;
                                ehp0Var = ehp0Var3;
                                l(et10Var7, i9, false, et10Var7.e());
                                i9++;
                                et10Var14 = et10Var7;
                                czf0VarArr4 = czf0VarArr3;
                                ehp0Var3 = ehp0Var;
                            }
                        }
                        czf0VarArr3 = czf0VarArr4;
                        ehp0Var = ehp0Var3;
                        et10Var7 = et10Var14;
                        i9++;
                        et10Var14 = et10Var7;
                        czf0VarArr4 = czf0VarArr3;
                        ehp0Var3 = ehp0Var;
                    }
                    et10 et10Var15 = et10Var14;
                    if (f()) {
                        this.f0 = et10Var15.a.readDiscontinuity();
                        if (!et10Var15.g()) {
                            gVar5.o(et10Var15);
                            v(false);
                            D();
                        }
                    }
                }
            }
        }
        boolean z6 = this.A;
        czf0[] czf0VarArr5 = this.b;
        androidx.media3.exoplayer.g gVar6 = this.t;
        et10 et10Var16 = gVar6.k;
        if (et10Var16 != null) {
            if (et10Var16.m == null || this.N) {
                i = 2;
                if (et10Var16.g.j || this.N) {
                    for (czf0 czf0Var3 : czf0VarArr5) {
                        if (czf0Var3.c(et10Var16) != null) {
                            j c3 = czf0Var3.c(et10Var16);
                            c3.getClass();
                            if (c3.hasReadStreamToEnd()) {
                                long j6 = et10Var16.g.e;
                                long j7 = (j6 == C.TIME_UNSET || j6 == Long.MIN_VALUE) ? -9223372036854775807L : et10Var16.p + j6;
                                j c4 = czf0Var3.c(et10Var16);
                                c4.getClass();
                                czf0.k(c4, j7);
                            }
                        }
                    }
                }
            } else if (et10Var16.e) {
                int i10 = 0;
                while (true) {
                    if (i10 < czf0VarArr5.length) {
                        czf0 czf0Var4 = czf0VarArr5[i10];
                        if (!czf0Var4.d(et10Var16, czf0Var4.a) || !czf0Var4.d(et10Var16, czf0Var4.c)) {
                            break;
                        } else {
                            i10++;
                        }
                    } else if (!f() || gVar6.l != gVar6.k) {
                        et10 et10Var17 = et10Var16.m;
                        if (et10Var17.e || this.Y >= et10Var17.e()) {
                            boolean z7 = et10Var16.m.e;
                            if (z7) {
                                fxc0.z(z7);
                            }
                            ehp0 ehp0Var4 = et10Var16.o;
                            et10 et10Var18 = gVar6.l;
                            et10 et10Var19 = gVar6.k;
                            if (et10Var18 == et10Var19) {
                                et10Var19.getClass();
                                gVar6.l = et10Var19.m;
                            }
                            et10 et10Var20 = gVar6.k;
                            et10Var20.getClass();
                            gVar6.k = et10Var20.m;
                            gVar6.l();
                            et10 et10Var21 = gVar6.k;
                            et10Var21.getClass();
                            ehp0 ehp0Var5 = et10Var21.o;
                            ewo0 ewo0Var = this.J.a;
                            E0(ewo0Var, et10Var21.g.a, ewo0Var, et10Var16.g.a, C.TIME_UNSET, false);
                            if (et10Var21.e && ((z6 && this.f0 != C.TIME_UNSET) || et10Var21.a.readDiscontinuity() != C.TIME_UNSET)) {
                                this.f0 = C.TIME_UNSET;
                                boolean z8 = z6 && !this.g0;
                                if (z8) {
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= czf0VarArr5.length) {
                                            break;
                                        }
                                        boolean b2 = ehp0Var5.b(i11);
                                        d7q[] d7qVarArr = ehp0Var5.c;
                                        if (b2 && czf0VarArr5[i11].a.getTrackType() != -2 && !io20.a(d7qVarArr[i11].getSelectedFormat().n, d7qVarArr[i11].getSelectedFormat().k) && !czf0VarArr5[i11].e()) {
                                            z8 = false;
                                            break;
                                        }
                                        i11++;
                                    }
                                }
                                if (!z8) {
                                    long e3 = et10Var21.e();
                                    for (czf0 czf0Var5 : czf0VarArr5) {
                                        j jVar2 = czf0Var5.c;
                                        j jVar3 = czf0Var5.a;
                                        if (czf0.g(jVar3) && (i4 = czf0Var5.d) != 4) {
                                            if (i4 != 2) {
                                                czf0.k(jVar3, e3);
                                            }
                                        }
                                        if (jVar2 != null) {
                                            if ((jVar2.getState() != 0) && czf0Var5.d != 3) {
                                                czf0.k(jVar2, e3);
                                            }
                                        }
                                    }
                                    i2 = 2;
                                    if (!et10Var21.g()) {
                                        gVar6.o(et10Var21);
                                        v(false);
                                        D();
                                    }
                                    i = i2;
                                }
                            }
                            i2 = 2;
                            int length = czf0VarArr5.length;
                            int i12 = 0;
                            while (i12 < length) {
                                czf0 czf0Var6 = czf0VarArr5[i12];
                                long e4 = et10Var21.e();
                                j jVar4 = czf0Var6.a;
                                int i13 = czf0Var6.b;
                                boolean b3 = ehp0Var4.b(i13);
                                boolean b4 = ehp0Var5.b(i13);
                                j jVar5 = czf0Var6.c;
                                if (jVar5 == null || (i3 = czf0Var6.d) == 3 || (i3 == 0 && czf0.g(jVar4))) {
                                    jVar5 = jVar4;
                                }
                                if (!b3 || jVar5.isCurrentStreamFinal()) {
                                    c2 = 65534;
                                } else {
                                    int trackType = jVar4.getTrackType();
                                    c2 = 65534;
                                    boolean z9 = trackType == -2;
                                    wyf0 wyf0Var = ehp0Var4.b[i13];
                                    wyf0 wyf0Var2 = ehp0Var5.b[i13];
                                    if (!b4 || !Objects.equals(wyf0Var2, wyf0Var) || z9 || czf0Var6.e()) {
                                        czf0.k(jVar5, e4);
                                    }
                                }
                                i12++;
                                i2 = 2;
                            }
                            i = i2;
                        }
                    }
                }
            }
            androidx.media3.exoplayer.g gVar7 = this.t;
            et10Var2 = gVar7.k;
            if (et10Var2 != null && gVar7.j != et10Var2 && !et10Var2.h) {
                czf0VarArr2 = this.b;
                ehp0 ehp0Var6 = et10Var2.o;
                z3 = true;
                for (i6 = 0; i6 < czf0VarArr2.length; i6++) {
                    int b5 = czf0VarArr2[i6].b();
                    czf0 czf0Var7 = czf0VarArr2[i6];
                    gil gilVar = this.p;
                    int i14 = czf0Var7.i(czf0Var7.a, et10Var2, ehp0Var6, gilVar);
                    int i15 = czf0Var7.i(czf0Var7.c, et10Var2, ehp0Var6, gilVar);
                    if (i14 == 1) {
                        i14 = i15;
                    }
                    if ((i14 & 2) != 0 && (z4 = this.V) && z4) {
                        this.V = false;
                        if (this.J.p) {
                            this.i.sendEmptyMessage(i);
                        }
                    }
                    this.W -= b5 - czf0VarArr2[i6].b();
                    z3 &= (i14 & 1) != 0;
                }
                if (z3) {
                    for (int i16 = 0; i16 < czf0VarArr2.length; i16++) {
                        if (ehp0Var6.b(i16)) {
                            if (!(czf0VarArr2[i16].c(et10Var2) != null)) {
                                l(et10Var2, i16, false, et10Var2.e());
                            }
                        }
                    }
                }
                if (z3) {
                    gVar7.k.h = true;
                }
            }
            czf0VarArr = this.b;
            gVar = this.t;
            z = false;
            while (t0() && !this.N && (et10Var3 = gVar.j) != null && (et10Var4 = et10Var3.m) != null && this.Y >= et10Var4.e() && et10Var4.h) {
                if (z) {
                    F();
                }
                this.g0 = false;
                a2 = gVar.a();
                a2.getClass();
                if (this.J.b.a.equals(a2.g.a.a)) {
                    i.b bVar = this.J.b;
                    if (bVar.b == -1) {
                        i.b bVar2 = a2.g.a;
                        if (bVar2.b == -1 && bVar.e != bVar2.e) {
                            z2 = true;
                            ft10 ft10Var2 = a2.g;
                            boolean z10 = z2;
                            i.b bVar3 = ft10Var2.a;
                            long j8 = ft10Var2.b;
                            this.J = z(bVar3, j8, ft10Var2.c, j8, !z10, 0);
                            P();
                            D0();
                            if (f() && a2 == gVar.l) {
                                for (czf0 czf0Var8 : czf0VarArr) {
                                    int i17 = czf0Var8.d;
                                    if (i17 == 3 || i17 == 4) {
                                        boolean z11 = i17 == 4;
                                        j jVar6 = czf0Var8.a;
                                        j jVar7 = czf0Var8.c;
                                        if (z11) {
                                            jVar7.getClass();
                                            jVar7.handleMessage(17, jVar6);
                                        } else {
                                            jVar7.getClass();
                                            jVar6.handleMessage(17, jVar7);
                                        }
                                        czf0Var8.d = czf0Var8.d == 4 ? 0 : 1;
                                    } else if (i17 == i) {
                                        czf0Var8.d = 0;
                                    }
                                }
                            }
                            if (this.J.e == 3) {
                                v0();
                            }
                            ehp0 ehp0Var7 = gVar.j.o;
                            for (i5 = 0; i5 < czf0VarArr.length; i5++) {
                                if (ehp0Var7.b(i5)) {
                                    czf0 czf0Var9 = czf0VarArr[i5];
                                    j jVar8 = czf0Var9.c;
                                    j jVar9 = czf0Var9.a;
                                    if (czf0.g(jVar9)) {
                                        jVar9.h();
                                    } else if (jVar8 != null) {
                                        if (jVar8.getState() != 0) {
                                            jVar8.h();
                                        }
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                }
                z2 = false;
                ft10 ft10Var22 = a2.g;
                boolean z102 = z2;
                i.b bVar32 = ft10Var22.a;
                long j82 = ft10Var22.b;
                this.J = z(bVar32, j82, ft10Var22.c, j82, !z102, 0);
                P();
                D0();
                if (f()) {
                    while (r2 < r1) {
                    }
                }
                if (this.J.e == 3) {
                }
                ehp0 ehp0Var72 = gVar.j.o;
                while (i5 < czf0VarArr.length) {
                }
                z = true;
            }
            this.e0.getClass();
        }
        i = 2;
        androidx.media3.exoplayer.g gVar72 = this.t;
        et10Var2 = gVar72.k;
        if (et10Var2 != null) {
            czf0VarArr2 = this.b;
            ehp0 ehp0Var62 = et10Var2.o;
            z3 = true;
            while (i6 < czf0VarArr2.length) {
            }
            if (z3) {
            }
            if (z3) {
            }
        }
        czf0VarArr = this.b;
        gVar = this.t;
        z = false;
        while (t0()) {
            if (z) {
            }
            this.g0 = false;
            a2 = gVar.a();
            a2.getClass();
            if (this.J.b.a.equals(a2.g.a.a)) {
            }
            z2 = false;
            ft10 ft10Var222 = a2.g;
            boolean z1022 = z2;
            i.b bVar322 = ft10Var222.a;
            long j822 = ft10Var222.b;
            this.J = z(bVar322, j822, ft10Var222.c, j822, !z1022, 0);
            P();
            D0();
            if (f()) {
            }
            if (this.J.e == 3) {
            }
            ehp0 ehp0Var722 = gVar.j.o;
            while (i5 < czf0VarArr.length) {
            }
            z = true;
        }
        this.e0.getClass();
    }

    public final boolean C() {
        et10 et10Var = this.t.j;
        long j = et10Var.g.e;
        if (et10Var.e) {
            return j == C.TIME_UNSET || this.J.s < j || !t0();
        }
        return false;
    }

    public final void C0(int i, int i2, int i3, boolean z) throws ExoPlaybackException {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.F;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        fwa0 fwa0Var = this.J;
        if (fwa0Var.l == z2 && fwa0Var.n == i2 && fwa0Var.m == i3) {
            return;
        }
        this.J = fwa0Var.e(i3, i2, z2);
        F0(false, false);
        androidx.media3.exoplayer.g gVar = this.t;
        for (et10 et10Var = gVar.j; et10Var != null; et10Var = et10Var.m) {
            for (d7q d7qVar : et10Var.o.c) {
                if (d7qVar != null) {
                    d7qVar.c(z2);
                }
            }
        }
        if (!t0()) {
            x0();
            D0();
            fwa0 fwa0Var2 = this.J;
            if (fwa0Var2.p) {
                this.J = fwa0Var2.i(false);
            }
            gVar.m(this.Y);
            return;
        }
        int i4 = this.J.e;
        otu otuVar = this.i;
        if (i4 != 3) {
            if (i4 == 2) {
                otuVar.sendEmptyMessage(2);
                return;
            }
            return;
        }
        gil gilVar = this.p;
        gilVar.g = true;
        dpk0 dpk0Var = gilVar.b;
        if (!dpk0Var.c) {
            dpk0Var.e = dpk0Var.b.elapsedRealtime();
            dpk0Var.c = true;
        }
        v0();
        otuVar.sendEmptyMessage(2);
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.media3.exoplayer.source.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [androidx.media3.exoplayer.source.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.media3.exoplayer.source.q, java.lang.Object] */
    public final void D() {
        long j;
        long j2;
        boolean a2;
        if (A(this.t.m)) {
            et10 et10Var = this.t.m;
            long q = q(!et10Var.e ? 0L : et10Var.a.getNextLoadPositionUs());
            if (et10Var == this.t.j) {
                j = this.Y;
                j2 = et10Var.p;
            } else {
                j = this.Y - et10Var.p;
                j2 = et10Var.g.b;
            }
            long j3 = j - j2;
            long c2 = u0(this.J.a, et10Var.g.a) ? this.v.c() : -9223372036854775807L;
            x1b0 x1b0Var = this.x;
            ewo0 ewo0Var = this.J.a;
            i.b bVar = et10Var.g.a;
            float f2 = this.p.getPlaybackParameters().a;
            boolean z = this.J.l;
            e.a aVar = new e.a(x1b0Var, ewo0Var, bVar, j3, q, f2, this.O, c2);
            a2 = this.g.a(aVar);
            et10 et10Var2 = this.t.j;
            if (!a2 && et10Var2.e && q < 500000 && (this.n > 0 || this.o)) {
                et10Var2.a.discardBuffer(this.J.s, false);
                a2 = this.g.a(aVar);
            }
        } else {
            a2 = false;
        }
        this.Q = a2;
        if (a2) {
            et10 et10Var3 = this.t.m;
            et10Var3.getClass();
            f.a aVar2 = new f.a();
            aVar2.a = this.Y - et10Var3.p;
            float f3 = this.p.getPlaybackParameters().a;
            fxc0.p(f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3 == -3.4028235E38f);
            aVar2.b = f3;
            long j4 = this.P;
            fxc0.p(j4 >= 0 || j4 == C.TIME_UNSET);
            aVar2.c = j4;
            androidx.media3.exoplayer.f fVar = new androidx.media3.exoplayer.f(aVar2);
            fxc0.z(et10Var3.m == null);
            et10Var3.a.k(fVar);
        }
        y0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01d6, code lost:
    
        if (r13.l != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0170, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v30, types: [androidx.media3.exoplayer.source.h, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D0() throws ExoPlaybackException {
        C0052d c0052d;
        boolean z;
        et10 et10Var = this.t.j;
        if (et10Var == null) {
            return;
        }
        long readDiscontinuity = et10Var.e ? et10Var.a.readDiscontinuity() : -9223372036854775807L;
        if (readDiscontinuity != C.TIME_UNSET) {
            if (!et10Var.g()) {
                this.t.o(et10Var);
                v(false);
                D();
            }
            Q(readDiscontinuity, true);
            if (readDiscontinuity != this.J.s) {
                fwa0 fwa0Var = this.J;
                this.J = z(fwa0Var.b, readDiscontinuity, fwa0Var.c, readDiscontinuity, true, 5);
            }
        } else {
            gil gilVar = this.p;
            boolean z2 = et10Var != this.t.k;
            dpk0 dpk0Var = gilVar.b;
            j jVar = gilVar.d;
            if (jVar == null || jVar.isEnded() || ((z2 && gilVar.d.getState() != 2) || (!gilVar.d.isReady() && (z2 || gilVar.d.hasReadStreamToEnd())))) {
                gilVar.f = true;
                if (gilVar.g && !dpk0Var.c) {
                    dpk0Var.e = dpk0Var.b.elapsedRealtime();
                    dpk0Var.c = true;
                }
            } else {
                cq10 cq10Var = gilVar.e;
                cq10Var.getClass();
                long positionUs = cq10Var.getPositionUs();
                if (gilVar.f) {
                    if (positionUs >= dpk0Var.getPositionUs()) {
                        gilVar.f = false;
                        if (gilVar.g && !dpk0Var.c) {
                            dpk0Var.e = dpk0Var.b.elapsedRealtime();
                            dpk0Var.c = true;
                        }
                    } else if (dpk0Var.c) {
                        dpk0Var.a(dpk0Var.getPositionUs());
                        dpk0Var.c = false;
                    }
                }
                dpk0Var.a(positionUs);
                jwa0 playbackParameters = cq10Var.getPlaybackParameters();
                if (!playbackParameters.equals(dpk0Var.f)) {
                    dpk0Var.b(playbackParameters);
                    gilVar.c.i.obtainMessage(16, playbackParameters).b();
                }
            }
            long positionUs2 = gilVar.getPositionUs();
            this.Y = positionUs2;
            long j = positionUs2 - et10Var.p;
            long j2 = this.J.s;
            ArrayList<C0052d> arrayList = this.q;
            if (!arrayList.isEmpty() && !this.J.b.b()) {
                if (this.b0) {
                    j2--;
                    this.b0 = false;
                }
                fwa0 fwa0Var2 = this.J;
                int b2 = fwa0Var2.a.b(fwa0Var2.b.a);
                int min = Math.min(this.a0, arrayList.size());
                C0052d c0052d2 = min > 0 ? arrayList.get(min - 1) : null;
                while (c0052d2 != null) {
                    int i = c0052d2.c;
                    if (i <= b2 && (i != b2 || c0052d2.d <= j2)) {
                        break;
                    }
                    int i2 = min - 1;
                    c0052d2 = i2 > 0 ? arrayList.get(min - 2) : null;
                    min = i2;
                }
                if (min < arrayList.size()) {
                    c0052d = arrayList.get(min);
                    while (c0052d != null && c0052d.e != null) {
                        int i3 = c0052d.c;
                        if (i3 >= b2 && (i3 != b2 || c0052d.d > j2)) {
                            break;
                        }
                        min++;
                        if (min < arrayList.size()) {
                            c0052d = arrayList.get(min);
                        }
                    }
                    while (c0052d != null) {
                        i iVar = c0052d.b;
                        if (c0052d.e == null || c0052d.c != b2) {
                            break;
                        }
                        long j3 = c0052d.d;
                        if (j3 <= j2 || j3 > j) {
                            break;
                        }
                        try {
                            b0(iVar);
                            if (!iVar.j) {
                                synchronized (iVar) {
                                    z = iVar.l;
                                }
                                if (!z) {
                                    min++;
                                    c0052d = min >= arrayList.size() ? arrayList.get(min) : null;
                                }
                            }
                            arrayList.remove(min);
                            if (min >= arrayList.size()) {
                            }
                        } catch (Throwable th) {
                            if (!iVar.j) {
                                synchronized (iVar) {
                                }
                            }
                            arrayList.remove(min);
                            throw th;
                        }
                    }
                    this.a0 = min;
                }
                c0052d = null;
            }
            if (this.p.l()) {
                boolean z3 = !this.K.d;
                fwa0 fwa0Var3 = this.J;
                this.J = z(fwa0Var3.b, j, fwa0Var3.c, j, z3, 6);
            } else {
                fwa0 fwa0Var4 = this.J;
                fwa0Var4.s = j;
                fwa0Var4.t = SystemClock.elapsedRealtime();
            }
        }
        this.J.q = this.t.m.d();
        fwa0 fwa0Var5 = this.J;
        fwa0Var5.r = q(fwa0Var5.q);
        fwa0 fwa0Var6 = this.J;
        if (fwa0Var6.l && fwa0Var6.e == 3 && u0(fwa0Var6.a, fwa0Var6.b)) {
            fwa0 fwa0Var7 = this.J;
            if (fwa0Var7.o.a == 1.0f) {
                float b3 = this.v.b(n(fwa0Var7.a, fwa0Var7.b.a, fwa0Var7.s), this.J.r);
                if (this.p.getPlaybackParameters().a != b3) {
                    jwa0 jwa0Var = new jwa0(b3, this.J.o.b);
                    this.i.removeMessages(16);
                    this.p.b(jwa0Var);
                    y(this.J.o, this.p.getPlaybackParameters().a, false, false);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.q, java.lang.Object] */
    public final void E() {
        androidx.media3.exoplayer.g gVar = this.t;
        gVar.k();
        et10 et10Var = gVar.n;
        if (et10Var != null) {
            ?? r1 = et10Var.a;
            if ((!et10Var.d || et10Var.e) && !r1.isLoading()) {
                ewo0 ewo0Var = this.J.a;
                if (et10Var.e) {
                    r1.getBufferedPositionUs();
                }
                if (this.g.b()) {
                    if (!et10Var.d) {
                        long j = et10Var.g.b;
                        et10Var.d = true;
                        r1.e(this, j);
                        return;
                    }
                    f.a aVar = new f.a();
                    aVar.a = this.Y - et10Var.p;
                    float f2 = this.p.getPlaybackParameters().a;
                    fxc0.p(f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 == -3.4028235E38f);
                    aVar.b = f2;
                    long j2 = this.P;
                    fxc0.p(j2 >= 0 || j2 == C.TIME_UNSET);
                    aVar.c = j2;
                    androidx.media3.exoplayer.f fVar = new androidx.media3.exoplayer.f(aVar);
                    fxc0.z(et10Var.m == null);
                    r1.k(fVar);
                }
            }
        }
    }

    public final void E0(ewo0 ewo0Var, i.b bVar, ewo0 ewo0Var2, i.b bVar2, long j, boolean z) throws ExoPlaybackException {
        boolean u0 = u0(ewo0Var, bVar);
        Object obj = bVar.a;
        if (!u0) {
            jwa0 jwa0Var = bVar.b() ? jwa0.d : this.J.o;
            gil gilVar = this.p;
            if (gilVar.getPlaybackParameters().equals(jwa0Var)) {
                return;
            }
            this.i.removeMessages(16);
            gilVar.b(jwa0Var);
            y(this.J.o, jwa0Var.a, false, false);
            return;
        }
        ewo0.b bVar3 = this.m;
        int i = ewo0Var.g(obj, bVar3).c;
        ewo0.c cVar = this.l;
        ewo0Var.n(i, cVar);
        kr10.e eVar = cVar.j;
        hkz hkzVar = this.v;
        hkzVar.a(eVar);
        if (j != C.TIME_UNSET) {
            hkzVar.e(n(ewo0Var, obj, j));
            return;
        }
        if (!Objects.equals(!ewo0Var2.p() ? ewo0Var2.m(ewo0Var2.g(bVar2.a, bVar3).c, cVar, 0L).a : null, cVar.a) || z) {
            hkzVar.e(C.TIME_UNSET);
        }
    }

    public final void F() {
        e eVar = this.K;
        fwa0 fwa0Var = this.J;
        boolean z = eVar.a | (eVar.b != fwa0Var);
        eVar.a = z;
        eVar.b = fwa0Var;
        if (z) {
            androidx.media3.exoplayer.c cVar = (androidx.media3.exoplayer.c) this.s.c;
            cVar.k.post(new c0(3, cVar, eVar));
            this.K = new e(this.J);
        }
    }

    public final void F0(boolean z, boolean z2) {
        this.O = z;
        this.P = (!z || z2) ? C.TIME_UNSET : this.r.elapsedRealtime();
    }

    public final void G(int i) throws IOException, ExoPlaybackException {
        czf0 czf0Var = this.b[i];
        try {
            et10 et10Var = this.t.j;
            et10Var.getClass();
            j c2 = czf0Var.c(et10Var);
            c2.getClass();
            c2.maybeThrowStreamError();
        } catch (IOException | RuntimeException e2) {
            int trackType = czf0Var.a.getTrackType();
            if (trackType != 3 && trackType != 5) {
                throw e2;
            }
            ehp0 ehp0Var = this.t.j.o;
            ahn.o("ExoPlayerImplInternal", "Disabling track due to error: " + androidx.media3.common.a.d(ehp0Var.c[i].getSelectedFormat()), e2);
            ehp0 ehp0Var2 = new ehp0((wyf0[]) ehp0Var.b.clone(), (d7q[]) ehp0Var.c.clone(), ehp0Var.d, ehp0Var.e);
            ehp0Var2.b[i] = null;
            ehp0Var2.c[i] = null;
            j(i);
            et10 et10Var2 = this.t.j;
            et10Var2.a(ehp0Var2, this.J.s, false, new boolean[et10Var2.j.length]);
        }
    }

    public final void H(final int i, final boolean z) {
        boolean[] zArr = this.d;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.z.post(new Runnable() { // from class: xsna.r6q
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.exoplayer.d dVar = androidx.media3.exoplayer.d.this;
                    zw1 zw1Var = dVar.y;
                    czf0[] czf0VarArr = dVar.b;
                    int i2 = i;
                    zw1Var.c0(i2, czf0VarArr[i2].a.getTrackType(), z);
                }
            });
        }
    }

    public final void I() throws ExoPlaybackException {
        w(this.u.b(), true);
    }

    public final void J(c cVar) throws ExoPlaybackException {
        this.K.a(1);
        cVar.getClass();
        h hVar = this.u;
        fxc0.p(hVar.b.size() >= 0);
        hVar.j = null;
        w(hVar.b(), false);
    }

    public final void K() throws ExoPlaybackException {
        this.K.a(1);
        O(false, false, false, true);
        this.g.g(this.x);
        p0(this.J.a.p() ? 4 : 2);
        fwa0 fwa0Var = this.J;
        boolean z = fwa0Var.l;
        C0(this.B.d(fwa0Var.e, z), fwa0Var.n, fwa0Var.m, z);
        mjp0 d = this.h.d();
        h hVar = this.u;
        ArrayList arrayList = hVar.b;
        fxc0.z(!hVar.k);
        hVar.l = d;
        for (int i = 0; i < arrayList.size(); i++) {
            h.c cVar = (h.c) arrayList.get(i);
            hVar.e(cVar);
            hVar.g.add(cVar);
        }
        hVar.k = true;
        this.i.sendEmptyMessage(2);
    }

    public final void L(wwi wwiVar) {
        hwa0 hwa0Var = this.j;
        otu otuVar = this.i;
        try {
            O(true, false, true, false);
            czf0[] czf0VarArr = this.b;
            for (int i = 0; i < czf0VarArr.length; i++) {
                this.c[i].c();
                czf0 czf0Var = czf0VarArr[i];
                czf0Var.a.release();
                czf0Var.e = false;
                j jVar = czf0Var.c;
                if (jVar != null) {
                    jVar.release();
                    czf0Var.f = false;
                }
            }
            this.g.h(this.x);
            eo4 eo4Var = this.B;
            eo4Var.c = null;
            eo4Var.a();
            eo4Var.c(0);
            this.e.f();
            p0(1);
        } finally {
            otuVar.a();
            hwa0Var.a();
            wwiVar.f();
        }
    }

    public final void M(int i, int i2, r rVar) throws ExoPlaybackException {
        this.K.a(1);
        h hVar = this.u;
        hVar.getClass();
        fxc0.p(i >= 0 && i <= i2 && i2 <= hVar.b.size());
        hVar.j = rVar;
        hVar.g(i, i2);
        w(hVar.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N() throws ExoPlaybackException {
        int i;
        int i2;
        float f2 = this.p.getPlaybackParameters().a;
        androidx.media3.exoplayer.g gVar = this.t;
        et10 et10Var = gVar.j;
        et10 et10Var2 = gVar.k;
        ehp0 ehp0Var = null;
        et10 et10Var3 = et10Var;
        boolean z = true;
        while (et10Var3 != null && et10Var3.e) {
            fwa0 fwa0Var = this.J;
            ehp0 j = et10Var3.j(f2, fwa0Var.a, fwa0Var.l);
            ehp0 ehp0Var2 = et10Var3 == this.t.j ? j : ehp0Var;
            ehp0 ehp0Var3 = et10Var3.o;
            d7q[] d7qVarArr = j.c;
            if (ehp0Var3 != null && ehp0Var3.c.length == d7qVarArr.length) {
                for (int i3 = 0; i3 < d7qVarArr.length; i3++) {
                    if (j.a(ehp0Var3, i3)) {
                    }
                }
                if (et10Var3 == et10Var2) {
                    z = false;
                }
                et10Var3 = et10Var3.m;
                ehp0Var = ehp0Var2;
            }
            if (z) {
                androidx.media3.exoplayer.g gVar2 = this.t;
                et10 et10Var4 = gVar2.j;
                boolean z2 = (gVar2.o(et10Var4) & 1) != 0;
                boolean[] zArr = new boolean[this.b.length];
                ehp0Var2.getClass();
                long a2 = et10Var4.a(ehp0Var2, this.J.s, z2, zArr);
                fwa0 fwa0Var2 = this.J;
                boolean z3 = (fwa0Var2.e == 4 || a2 == fwa0Var2.s) ? false : true;
                fwa0 fwa0Var3 = this.J;
                i = 4;
                this.J = z(fwa0Var3.b, a2, fwa0Var3.c, fwa0Var3.d, z3, 5);
                if (z3) {
                    Q(a2, true);
                }
                i();
                boolean[] zArr2 = new boolean[this.b.length];
                int i4 = 0;
                while (true) {
                    czf0[] czf0VarArr = this.b;
                    if (i4 >= czf0VarArr.length) {
                        break;
                    }
                    int b2 = czf0VarArr[i4].b();
                    zArr2[i4] = this.b[i4].f();
                    czf0 czf0Var = this.b[i4];
                    m0h0 m0h0Var = et10Var4.c[i4];
                    gil gilVar = this.p;
                    long j2 = this.Y;
                    boolean z4 = zArr[i4];
                    j jVar = czf0Var.a;
                    if (czf0.g(jVar)) {
                        if (m0h0Var != jVar.getStream()) {
                            czf0Var.a(jVar, gilVar);
                        } else if (z4) {
                            jVar.d(j2, true);
                        }
                    }
                    j jVar2 = czf0Var.c;
                    if (jVar2 != null && czf0.g(jVar2)) {
                        if (m0h0Var != jVar2.getStream()) {
                            czf0Var.a(jVar2, gilVar);
                        } else if (z4) {
                            jVar2.d(j2, true);
                        }
                    }
                    if (b2 - this.b[i4].b() > 0) {
                        H(i4, false);
                    }
                    this.W -= b2 - this.b[i4].b();
                    i4++;
                }
                m(zArr2, this.Y);
                et10Var4.h = true;
            } else {
                i = 4;
                this.t.o(et10Var3);
                if (et10Var3.e) {
                    long max = Math.max(et10Var3.g.b, this.Y - et10Var3.p);
                    if (this.A && f() && this.t.l == et10Var3) {
                        i();
                    }
                    i2 = 4;
                    et10Var3.a(j, max, false, new boolean[et10Var3.j.length]);
                    v(true);
                    if (this.J.e == i2) {
                        D();
                        D0();
                        this.i.sendEmptyMessage(2);
                        return;
                    }
                    return;
                }
            }
            i2 = i;
            v(true);
            if (this.J.e == i2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        ewo0 ewo0Var;
        ewo0 ewo0Var2;
        i.b bVar;
        List list;
        this.i.removeMessages(2);
        this.G = false;
        if (this.H != null) {
            this.K.a(1);
            this.H = null;
        }
        this.c0 = null;
        F0(false, true);
        gil gilVar = this.p;
        gilVar.g = false;
        dpk0 dpk0Var = gilVar.b;
        if (dpk0Var.c) {
            dpk0Var.a(dpk0Var.getPositionUs());
            dpk0Var.c = false;
        }
        this.Y = 1000000000000L;
        for (int i = 0; i < this.b.length; i++) {
            try {
                j(i);
            } catch (ExoPlaybackException e2) {
                e = e2;
                ahn.o("ExoPlayerImplInternal", "Disable failed.", e);
                if (z) {
                }
                this.W = 0;
                fwa0 fwa0Var = this.J;
                i.b bVar2 = fwa0Var.b;
                long j4 = fwa0Var.s;
                if (!this.J.b.b()) {
                }
                j = this.J.c;
                if (z2) {
                }
                this.t.b();
                this.Q = false;
                ewo0Var = this.J.a;
                if (z3) {
                }
                ewo0Var2 = ewo0Var;
                bVar = bVar2;
                fwa0 fwa0Var2 = this.J;
                int i2 = fwa0Var2.e;
                ExoPlaybackException exoPlaybackException = z4 ? null : fwa0Var2.f;
                qfp0 qfp0Var = z5 ? qfp0.d : fwa0Var2.h;
                ehp0 ehp0Var = z5 ? this.f : fwa0Var2.i;
                if (z5) {
                }
                this.J = new fwa0(ewo0Var2, bVar, j3, j2, i2, exoPlaybackException, false, qfp0Var, ehp0Var, list, bVar, fwa0Var2.l, fwa0Var2.m, fwa0Var2.n, fwa0Var2.o, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            } catch (RuntimeException e3) {
                e = e3;
                ahn.o("ExoPlayerImplInternal", "Disable failed.", e);
                if (z) {
                }
                this.W = 0;
                fwa0 fwa0Var3 = this.J;
                i.b bVar22 = fwa0Var3.b;
                long j42 = fwa0Var3.s;
                if (!this.J.b.b()) {
                }
                j = this.J.c;
                if (z2) {
                }
                this.t.b();
                this.Q = false;
                ewo0Var = this.J.a;
                if (z3) {
                }
                ewo0Var2 = ewo0Var;
                bVar = bVar22;
                fwa0 fwa0Var22 = this.J;
                int i22 = fwa0Var22.e;
                ExoPlaybackException exoPlaybackException2 = z4 ? null : fwa0Var22.f;
                qfp0 qfp0Var2 = z5 ? qfp0.d : fwa0Var22.h;
                ehp0 ehp0Var2 = z5 ? this.f : fwa0Var22.i;
                if (z5) {
                }
                this.J = new fwa0(ewo0Var2, bVar, j3, j2, i22, exoPlaybackException2, false, qfp0Var2, ehp0Var2, list, bVar, fwa0Var22.l, fwa0Var22.m, fwa0Var22.n, fwa0Var22.o, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            }
        }
        this.f0 = C.TIME_UNSET;
        if (z) {
            for (czf0 czf0Var : this.b) {
                try {
                    czf0Var.j();
                } catch (RuntimeException e4) {
                    ahn.o("ExoPlayerImplInternal", "Reset failed.", e4);
                }
            }
        }
        this.W = 0;
        fwa0 fwa0Var32 = this.J;
        i.b bVar222 = fwa0Var32.b;
        long j422 = fwa0Var32.s;
        if (!this.J.b.b()) {
            fwa0 fwa0Var4 = this.J;
            ewo0.b bVar3 = this.m;
            i.b bVar4 = fwa0Var4.b;
            ewo0 ewo0Var3 = fwa0Var4.a;
            if (!ewo0Var3.p() && !ewo0Var3.g(bVar4.a, bVar3).f) {
                j = this.J.s;
                if (z2) {
                    j2 = j422;
                    j3 = j;
                    z5 = false;
                } else {
                    this.X = null;
                    Pair<i.b, Long> p = p(this.J.a);
                    bVar222 = (i.b) p.first;
                    long longValue = ((Long) p.second).longValue();
                    z5 = bVar222.equals(this.J.b) ? false : true;
                    j2 = longValue;
                    j3 = -9223372036854775807L;
                }
                this.t.b();
                this.Q = false;
                ewo0Var = this.J.a;
                if (z3 || !(ewo0Var instanceof jeb0)) {
                    ewo0Var2 = ewo0Var;
                } else {
                    jeb0 jeb0Var = (jeb0) ewo0Var;
                    r rVar = this.u.j;
                    ewo0[] ewo0VarArr = jeb0Var.i;
                    ewo0[] ewo0VarArr2 = new ewo0[ewo0VarArr.length];
                    for (int i3 = 0; i3 < ewo0VarArr.length; i3++) {
                        ewo0VarArr2[i3] = new ieb0(ewo0VarArr[i3]);
                    }
                    ewo0Var2 = new jeb0(ewo0VarArr2, jeb0Var.j, rVar);
                    if (bVar222.b != -1) {
                        ewo0Var2.g(bVar222.a, this.m);
                        int i4 = this.m.c;
                        ewo0.c cVar = this.l;
                        ewo0Var2.m(i4, cVar, 0L);
                        if (cVar.a()) {
                            bVar = new i.b(bVar222.a, bVar222.d);
                            fwa0 fwa0Var222 = this.J;
                            int i222 = fwa0Var222.e;
                            ExoPlaybackException exoPlaybackException22 = z4 ? null : fwa0Var222.f;
                            qfp0 qfp0Var22 = z5 ? qfp0.d : fwa0Var222.h;
                            ehp0 ehp0Var22 = z5 ? this.f : fwa0Var222.i;
                            if (z5) {
                                ImmutableList.b bVar5 = ImmutableList.c;
                                list = com.google.common.collect.g.f;
                            } else {
                                list = fwa0Var222.j;
                            }
                            this.J = new fwa0(ewo0Var2, bVar, j3, j2, i222, exoPlaybackException22, false, qfp0Var22, ehp0Var22, list, bVar, fwa0Var222.l, fwa0Var222.m, fwa0Var222.n, fwa0Var222.o, j2, 0L, j2, 0L, false);
                            if (z3) {
                                androidx.media3.exoplayer.g gVar = this.t;
                                if (!gVar.r.isEmpty()) {
                                    gVar.n(new ArrayList());
                                }
                                h hVar = this.u;
                                HashMap<h.c, h.b> hashMap = hVar.f;
                                for (h.b bVar6 : hashMap.values()) {
                                    try {
                                        bVar6.a.b(bVar6.b);
                                    } catch (RuntimeException e5) {
                                        ahn.o("MediaSourceList", "Failed to release child source.", e5);
                                    }
                                    androidx.media3.exoplayer.source.i iVar = bVar6.a;
                                    h.a aVar = bVar6.c;
                                    iVar.j(aVar);
                                    bVar6.a.k(aVar);
                                }
                                hashMap.clear();
                                hVar.g.clear();
                                hVar.k = false;
                                return;
                            }
                            return;
                        }
                    }
                }
                bVar = bVar222;
                fwa0 fwa0Var2222 = this.J;
                int i2222 = fwa0Var2222.e;
                ExoPlaybackException exoPlaybackException222 = z4 ? null : fwa0Var2222.f;
                qfp0 qfp0Var222 = z5 ? qfp0.d : fwa0Var2222.h;
                ehp0 ehp0Var222 = z5 ? this.f : fwa0Var2222.i;
                if (z5) {
                }
                this.J = new fwa0(ewo0Var2, bVar, j3, j2, i2222, exoPlaybackException222, false, qfp0Var222, ehp0Var222, list, bVar, fwa0Var2222.l, fwa0Var2222.m, fwa0Var2222.n, fwa0Var2222.o, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            }
        }
        j = this.J.c;
        if (z2) {
        }
        this.t.b();
        this.Q = false;
        ewo0Var = this.J.a;
        if (z3) {
        }
        ewo0Var2 = ewo0Var;
        bVar = bVar222;
        fwa0 fwa0Var22222 = this.J;
        int i22222 = fwa0Var22222.e;
        ExoPlaybackException exoPlaybackException2222 = z4 ? null : fwa0Var22222.f;
        qfp0 qfp0Var2222 = z5 ? qfp0.d : fwa0Var22222.h;
        ehp0 ehp0Var2222 = z5 ? this.f : fwa0Var22222.i;
        if (z5) {
        }
        this.J = new fwa0(ewo0Var2, bVar, j3, j2, i22222, exoPlaybackException2222, false, qfp0Var2222, ehp0Var2222, list, bVar, fwa0Var22222.l, fwa0Var22222.m, fwa0Var22222.n, fwa0Var22222.o, j2, 0L, j2, 0L, false);
        if (z3) {
        }
    }

    public final void P() {
        et10 et10Var = this.t.j;
        this.N = et10Var != null && et10Var.g.i && this.M;
    }

    public final void Q(long j, boolean z) throws ExoPlaybackException {
        et10 et10Var = this.t.j;
        long j2 = j + (et10Var == null ? 1000000000000L : et10Var.p);
        this.Y = j2;
        this.p.b.a(j2);
        for (czf0 czf0Var : this.b) {
            long j3 = this.Y;
            j c2 = czf0Var.c(et10Var);
            if (c2 != null) {
                c2.d(j3, z);
            }
        }
        for (et10 et10Var2 = r0.j; et10Var2 != null; et10Var2 = et10Var2.m) {
            for (d7q d7qVar : et10Var2.o.c) {
                if (d7qVar != null) {
                    d7qVar.e();
                }
            }
        }
    }

    public final void T(ewo0 ewo0Var, ewo0 ewo0Var2) {
        if (ewo0Var.p() && ewo0Var2.p()) {
            return;
        }
        ArrayList<C0052d> arrayList = this.q;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            ewo0 ewo0Var3 = ewo0Var;
            ewo0 ewo0Var4 = ewo0Var2;
            if (!S(arrayList.get(size), ewo0Var3, ewo0Var4, this.R, this.S, this.l, this.m)) {
                arrayList.get(size).b.a(false);
                arrayList.remove(size);
            }
            size--;
            ewo0Var = ewo0Var3;
            ewo0Var2 = ewo0Var4;
        }
        Collections.sort(arrayList);
    }

    public final void W(long j) {
        boolean z = this.F;
        long j2 = i0;
        if (z) {
            this.E.getClass();
            r2 = this.J.e != 3 ? j2 : 1000L;
            for (czf0 czf0Var : this.b) {
                long j3 = this.Y;
                long j4 = this.Z;
                j jVar = czf0Var.c;
                j jVar2 = czf0Var.a;
                long o = czf0.g(jVar2) ? jVar2.o(j3, j4) : Long.MAX_VALUE;
                if (jVar != null && jVar.getState() != 0) {
                    o = Math.min(o, jVar.o(j3, j4));
                }
                r2 = Math.min(r2, y2r0.j0(o));
            }
            if (this.J.m()) {
                et10 et10Var = this.t.j;
                if ((et10Var != null ? et10Var.m : null) != null) {
                    if ((y2r0.S(r2) * this.J.o.a) + this.Y >= r1.e()) {
                        r2 = Math.min(r2, j2);
                    }
                }
            }
        } else if (this.J.e != 3 || t0()) {
            r2 = j2;
        }
        this.i.c(j + r2);
    }

    public final void X(boolean z) throws ExoPlaybackException {
        i.b bVar = this.t.j.g.a;
        long Z = Z(bVar, this.J.s, true, false);
        if (Z != this.J.s) {
            fwa0 fwa0Var = this.J;
            this.J = z(bVar, Z, fwa0Var.c, fwa0Var.d, z, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [androidx.media3.exoplayer.source.h, java.lang.Object] */
    public final void Y(g gVar) throws ExoPlaybackException {
        long longValue;
        long j;
        i.b q;
        long j2;
        boolean z;
        boolean z2;
        i.b bVar;
        long j3;
        long j4;
        long j5;
        boolean z3;
        long j6;
        boolean z4;
        long Z;
        fwa0 fwa0Var;
        i.b bVar2;
        ewo0 ewo0Var;
        long j7;
        i.b bVar3;
        long j8;
        long j9;
        fwa0 fwa0Var2;
        int i;
        int i2;
        long j10;
        d dVar = this;
        if (dVar.G) {
            if (dVar.H != null) {
                dVar.I++;
                dVar.K.a(1);
            }
            dVar.H = gVar;
            return;
        }
        dVar.K.a(1);
        Pair<Object, Long> U = U(dVar.J.a, gVar, true, dVar.R, dVar.S, dVar.l, dVar.m);
        if (U == null) {
            Pair<i.b, Long> p = dVar.p(dVar.J.a);
            q = (i.b) p.first;
            longValue = ((Long) p.second).longValue();
            z = !dVar.J.a.p();
            j2 = 0;
            j = -9223372036854775807L;
        } else {
            Object obj = U.first;
            longValue = ((Long) U.second).longValue();
            j = gVar.c == C.TIME_UNSET ? -9223372036854775807L : longValue;
            q = dVar.t.q(dVar.J.a, obj, longValue);
            if (q.b()) {
                dVar.J.a.g(q.a, dVar.m);
                if (dVar.m.e(q.b) == q.c) {
                    dVar.m.g.getClass();
                }
                dVar.m.g.a(q.b).getClass();
                j = Math.max(j, 0L);
                longValue = 0;
                j2 = 0;
            } else {
                j2 = 0;
                if (gVar.c != C.TIME_UNSET) {
                    z = false;
                }
            }
            z = true;
        }
        try {
            try {
                if (dVar.J.a.p()) {
                    dVar.X = gVar;
                } else if (U == null) {
                    if (dVar.J.e != 1) {
                        dVar.p0(4);
                    }
                    dVar.O(false, true, false, true);
                } else {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (q.equals(dVar.J.b)) {
                                            et10 et10Var = dVar.t.j;
                                            if (et10Var == null || !et10Var.e || longValue == j2) {
                                                j5 = longValue;
                                            } else {
                                                ?? r0 = et10Var.a;
                                                long j11 = dVar.l.m;
                                                if (dVar.F && j11 != C.TIME_UNSET) {
                                                    dVar.E.getClass();
                                                }
                                                j5 = r0.a(longValue, dVar.D);
                                            }
                                            if (y2r0.j0(j5) != y2r0.j0(dVar.J.s) || ((i = (fwa0Var2 = dVar.J).e) != 2 && i != 3)) {
                                                z2 = z;
                                                bVar = q;
                                            }
                                            j9 = fwa0Var2.s;
                                            z2 = z;
                                            bVar3 = q;
                                            i2 = 2;
                                            j10 = j9;
                                            j8 = j;
                                            dVar.J = dVar.z(bVar3, j9, j8, j10, z2, i2);
                                        }
                                        z2 = z;
                                        bVar = q;
                                        j5 = longValue;
                                        dVar.E0(ewo0Var, bVar2, ewo0Var, fwa0Var.b, j7, true);
                                        bVar3 = bVar2;
                                        j8 = j7;
                                        j9 = Z;
                                        i2 = 2;
                                        j10 = j9;
                                        dVar = this;
                                        dVar.J = dVar.z(bVar3, j9, j8, j10, z2, i2);
                                    } catch (Throwable th) {
                                        th = th;
                                        bVar = bVar2;
                                        j3 = j7;
                                        j4 = Z;
                                        dVar.J = dVar.z(bVar, j4, j3, j4, z2, 2);
                                        throw th;
                                    }
                                    ewo0Var = fwa0Var.a;
                                    j7 = j;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bVar = bVar2;
                                    j3 = j;
                                    j4 = Z;
                                    dVar.J = dVar.z(bVar, j4, j3, j4, z2, 2);
                                    throw th;
                                }
                                fwa0Var = dVar.J;
                                bVar2 = bVar;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            androidx.media3.exoplayer.g gVar2 = dVar.t;
                            Z = dVar.Z(bVar, j6, gVar2.j != gVar2.k ? z3 : false, z4);
                            z2 |= longValue != Z ? z3 : false;
                        } catch (Throwable th4) {
                            th = th4;
                            j3 = j;
                            j4 = longValue;
                            dVar.J = dVar.z(bVar, j4, j3, j4, z2, 2);
                            throw th;
                        }
                        if (dVar.F) {
                            try {
                                for (czf0 czf0Var : dVar.b) {
                                    if (czf0Var.f() && czf0Var.a.getTrackType() == 2) {
                                        z3 = true;
                                        dVar.G = true;
                                        break;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                j4 = longValue;
                                j3 = j;
                                dVar.J = dVar.z(bVar, j4, j3, j4, z2, 2);
                                throw th;
                            }
                        }
                        z3 = true;
                        if (dVar.J.e == 4) {
                            j6 = j5;
                            z4 = z3;
                        } else {
                            j6 = j5;
                            z4 = false;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                z2 = z;
                bVar3 = q;
                j9 = longValue;
                j8 = j;
                i2 = 2;
                j10 = j9;
                dVar = this;
                dVar.J = dVar.z(bVar3, j9, j8, j10, z2, i2);
            } catch (Throwable th7) {
                th = th7;
                z2 = z;
                bVar = q;
            }
        } catch (Throwable th8) {
            th = th8;
            z2 = z;
            bVar = q;
        }
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [androidx.media3.exoplayer.source.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v15, types: [androidx.media3.exoplayer.source.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v24, types: [androidx.media3.exoplayer.source.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v25, types: [androidx.media3.exoplayer.source.h, java.lang.Object] */
    public final long Z(i.b bVar, long j, boolean z, boolean z2) throws ExoPlaybackException {
        androidx.media3.exoplayer.g gVar;
        x0();
        boolean z3 = true;
        F0(false, true);
        if (z2 || this.J.e == 3) {
            p0(2);
        }
        et10 et10Var = this.t.j;
        et10 et10Var2 = et10Var;
        while (et10Var2 != null && !bVar.equals(et10Var2.g.a)) {
            et10Var2 = et10Var2.m;
        }
        if (z || et10Var != et10Var2 || (et10Var2 != null && et10Var2.p + j < 0)) {
            for (int i = 0; i < this.b.length; i++) {
                j(i);
            }
            this.f0 = C.TIME_UNSET;
            if (et10Var2 != null) {
                while (true) {
                    gVar = this.t;
                    if (gVar.j == et10Var2) {
                        break;
                    }
                    gVar.a();
                }
                gVar.o(et10Var2);
                et10Var2.p = 1000000000000L;
                m(new boolean[this.b.length], this.t.k.e());
                et10Var2.h = true;
            }
        }
        i();
        if (et10Var2 != null) {
            this.t.o(et10Var2);
            if (!et10Var2.e) {
                et10Var2.g = et10Var2.g.b(j);
            } else if (et10Var2.f) {
                if (this.F) {
                    this.E.getClass();
                    if (!this.J.a.p() && et10Var2.g.a.equals(this.J.b)) {
                        long j2 = et10Var2.p + j;
                        boolean z4 = true;
                        for (czf0 czf0Var : this.b) {
                            if (czf0Var.f()) {
                                j c2 = czf0Var.c(et10Var2);
                                z4 &= c2 != null && c2.n(j2);
                            }
                        }
                        if (z4) {
                            ?? r10 = et10Var2.a;
                            long j3 = this.J.s;
                            o3i0 o3i0Var = o3i0.c;
                            if (r10.a(j3, o3i0Var) == et10Var2.a.a(j, o3i0Var)) {
                                z3 = false;
                            }
                        }
                    }
                }
                j = et10Var2.a.seekToUs(j);
                et10Var2.a.discardBuffer(j - this.n, this.o);
            }
            Q(j, z3);
            D();
        } else {
            this.t.b();
            Q(j, true);
        }
        v(false);
        this.i.sendEmptyMessage(2);
        return j;
    }

    @Override // xsna.gms0
    public final void a(long j, long j2, androidx.media3.common.a aVar, @Nullable MediaFormat mediaFormat) {
        if (this.G) {
            this.i.obtainMessage(37).b();
        }
    }

    public final void a0(i iVar) throws ExoPlaybackException {
        if (iVar.i == C.TIME_UNSET) {
            b0(iVar);
            return;
        }
        boolean p = this.J.a.p();
        ArrayList<C0052d> arrayList = this.q;
        if (p) {
            arrayList.add(new C0052d(iVar));
            return;
        }
        C0052d c0052d = new C0052d(iVar);
        ewo0 ewo0Var = this.J.a;
        if (!S(c0052d, ewo0Var, ewo0Var, this.R, this.S, this.l, this.m)) {
            iVar.a(false);
        } else {
            arrayList.add(c0052d);
            Collections.sort(arrayList);
        }
    }

    @Override // androidx.media3.exoplayer.source.h.a
    public final void b(androidx.media3.exoplayer.source.h hVar) {
        this.i.obtainMessage(8, hVar).b();
    }

    public final void b0(i iVar) throws ExoPlaybackException {
        Looper looper = iVar.g;
        Looper looper2 = this.k;
        otu otuVar = this.i;
        if (looper != looper2) {
            otuVar.obtainMessage(15, iVar).b();
            return;
        }
        h(iVar);
        int i = this.J.e;
        if (i == 3 || i == 2) {
            otuVar.sendEmptyMessage(2);
        }
    }

    public final void c(b bVar, int i) throws ExoPlaybackException {
        this.K.a(1);
        h hVar = this.u;
        if (i == -1) {
            i = hVar.b.size();
        }
        w(hVar.a(i, bVar.a, bVar.b), false);
    }

    public final void c0(i iVar) {
        Looper looper = iVar.g;
        if (looper.getThread().isAlive()) {
            this.r.createHandler(looper, null).post(new xqc(this, iVar));
        } else {
            ahn.F("Trying to send message on a dead thread.");
            iVar.a(false);
        }
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public final void d(androidx.media3.exoplayer.source.h hVar) {
        this.i.obtainMessage(9, hVar).b();
    }

    public final void d0(nc4 nc4Var, boolean z) throws ExoPlaybackException {
        int i;
        this.e.h(nc4Var);
        if (!z) {
            nc4Var = null;
        }
        eo4 eo4Var = this.B;
        if (!Objects.equals(eo4Var.d, nc4Var)) {
            eo4Var.d = nc4Var;
            boolean z2 = true;
            if (nc4Var != null) {
                int i2 = nc4Var.a;
                if (i2 == 0) {
                    ahn.F("Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                } else if (i2 != 1) {
                    sn.d(i2, "Unidentified audio usage: ");
                }
                i = 1;
                eo4Var.f = i;
                if (i != 1 && i != 0) {
                    z2 = false;
                }
                fxc0.q(z2, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
            }
            i = 0;
            eo4Var.f = i;
            if (i != 1) {
                z2 = false;
            }
            fxc0.q(z2, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
        fwa0 fwa0Var = this.J;
        boolean z3 = fwa0Var.l;
        C0(eo4Var.d(fwa0Var.e, z3), fwa0Var.n, fwa0Var.m, z3);
    }

    public final void e() throws ExoPlaybackException {
        for (czf0 czf0Var : this.b) {
            fih0 fih0Var = this.F ? this.E : null;
            czf0Var.a.handleMessage(18, fih0Var);
            j jVar = czf0Var.c;
            if (jVar != null) {
                jVar.handleMessage(18, fih0Var);
            }
        }
    }

    public final void e0(boolean z, @Nullable wwi wwiVar) {
        if (this.T != z) {
            this.T = z;
            if (!z) {
                for (czf0 czf0Var : this.b) {
                    czf0Var.j();
                }
            }
        }
        if (wwiVar != null) {
            wwiVar.f();
        }
    }

    public final boolean f() {
        if (!this.A) {
            return false;
        }
        for (czf0 czf0Var : this.b) {
            if (czf0Var.e()) {
                return true;
            }
        }
        return false;
    }

    public final void f0(b bVar) throws ExoPlaybackException {
        this.K.a(1);
        int i = bVar.c;
        r rVar = bVar.b;
        ArrayList arrayList = bVar.a;
        if (i != -1) {
            this.X = new g(new jeb0(arrayList, rVar), bVar.c, bVar.d);
        }
        h hVar = this.u;
        ArrayList arrayList2 = hVar.b;
        hVar.g(0, arrayList2.size());
        w(hVar.a(arrayList2.size(), arrayList, rVar), false);
    }

    public final void g() throws ExoPlaybackException {
        N();
        X(true);
    }

    public final void g0(boolean z) throws ExoPlaybackException {
        this.M = z;
        P();
        if (this.N) {
            androidx.media3.exoplayer.g gVar = this.t;
            if (gVar.k != gVar.j) {
                X(true);
                v(false);
            }
        }
    }

    public final void h0(jwa0 jwa0Var) throws ExoPlaybackException {
        this.i.removeMessages(16);
        gil gilVar = this.p;
        gilVar.b(jwa0Var);
        jwa0 playbackParameters = gilVar.getPlaybackParameters();
        y(playbackParameters, playbackParameters.a, true, true);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        et10 et10Var;
        i.b bVar;
        et10 et10Var2;
        int i2;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    this.K.a(1);
                    C0(this.B.d(this.J.e, z), i3 >> 4, i3 & 15, z);
                    break;
                case 2:
                    k();
                    break;
                case 3:
                    Y((g) message.obj);
                    break;
                case 4:
                    h0((jwa0) message.obj);
                    break;
                case 5:
                    m0((o3i0) message.obj);
                    break;
                case 6:
                    w0(false, true);
                    break;
                case 7:
                    L((wwi) message.obj);
                    return true;
                case 8:
                    x((androidx.media3.exoplayer.source.h) message.obj);
                    break;
                case 9:
                    t((androidx.media3.exoplayer.source.h) message.obj);
                    break;
                case 10:
                    N();
                    break;
                case 11:
                    j0(message.arg1);
                    break;
                case 12:
                    n0(message.arg1 != 0);
                    break;
                case 13:
                    e0(message.arg1 != 0, (wwi) message.obj);
                    break;
                case 14:
                    a0((i) message.obj);
                    break;
                case 15:
                    c0((i) message.obj);
                    break;
                case 16:
                    jwa0 jwa0Var = (jwa0) message.obj;
                    y(jwa0Var, jwa0Var.a, true, false);
                    break;
                case 17:
                    f0((b) message.obj);
                    break;
                case 18:
                    c((b) message.obj, message.arg1);
                    break;
                case 19:
                    J((c) message.obj);
                    break;
                case 20:
                    M(message.arg1, message.arg2, (r) message.obj);
                    break;
                case 21:
                    o0((r) message.obj);
                    break;
                case 22:
                    I();
                    break;
                case 23:
                    g0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    g();
                    break;
                case 26:
                    N();
                    X(true);
                    break;
                case 27:
                    A0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    i0((ExoPlayer.c) message.obj);
                    break;
                case 29:
                    K();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    r0(pair.first, (wwi) pair.second);
                    break;
                case 31:
                    d0((nc4) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    s0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    r(message.arg1);
                    break;
                case 34:
                    s();
                    break;
                case 35:
                    q0((gms0) message.obj);
                    break;
                case 36:
                    k0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.G = false;
                    g gVar = this.H;
                    if (gVar != null) {
                        Y(gVar);
                        this.H = null;
                        break;
                    }
                    break;
                case 38:
                    l0((fih0) message.obj);
                    break;
            }
        } catch (ParserException e2) {
            int i4 = e2.dataType;
            if (i4 == 1) {
                i2 = e2.contentIsMalformed ? 3001 : Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE;
            } else {
                if (i4 == 4) {
                    i2 = e2.contentIsMalformed ? 3002 : 3004;
                }
                u(e2, r3);
            }
            r3 = i2;
            u(e2, r3);
        } catch (DataSourceException e3) {
            u(e3, e3.reason);
        } catch (ExoPlaybackException e4) {
            e = e4;
            int i5 = e.type;
            androidx.media3.exoplayer.g gVar2 = this.t;
            if (i5 == 1 && (et10Var2 = gVar2.k) != null && e.mediaPeriodId == null) {
                e = e.e(et10Var2.g.a);
            }
            int i6 = e.type;
            otu otuVar = this.i;
            if (i6 == 1 && (bVar = e.mediaPeriodId) != null && B(e.rendererIndex, bVar)) {
                this.g0 = true;
                i();
                et10 g2 = gVar2.g();
                et10 et10Var3 = gVar2.j;
                if (et10Var3 != g2) {
                    while (et10Var3 != null) {
                        et10 et10Var4 = et10Var3.m;
                        if (et10Var4 == g2) {
                            break;
                        }
                        et10Var3 = et10Var4;
                    }
                }
                gVar2.o(et10Var3);
                if (this.J.e != 4) {
                    D();
                    otuVar.sendEmptyMessage(2);
                }
            } else {
                ExoPlaybackException exoPlaybackException = this.c0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.c0;
                }
                if (e.type == 1 && gVar2.j != gVar2.k) {
                    while (true) {
                        et10Var = gVar2.j;
                        if (et10Var == gVar2.k) {
                            break;
                        }
                        gVar2.a();
                    }
                    fxc0.u(et10Var);
                    F();
                    ft10 ft10Var = et10Var.g;
                    i.b bVar2 = ft10Var.a;
                    long j = ft10Var.b;
                    this.J = z(bVar2, j, ft10Var.c, j, true, 0);
                }
                if (e.isRecoverable && (this.c0 == null || (i = e.errorCode) == 5004 || i == 5003)) {
                    ahn.G("Recoverable renderer error", e);
                    if (this.c0 == null) {
                        this.c0 = e;
                    }
                    otuVar.b(otuVar.obtainMessage(25, e));
                } else {
                    ahn.o("ExoPlayerImplInternal", "Playback error", e);
                    w0(true, false);
                    this.J = this.J.f(e);
                }
            }
        } catch (DrmSession.DrmSessionException e5) {
            u(e5, e5.errorCode);
        } catch (BehindLiveWindowException e6) {
            u(e6, 1002);
        } catch (IOException e7) {
            u(e7, 2000);
        } catch (RuntimeException e8) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e8, ((e8 instanceof IllegalStateException) || (e8 instanceof IllegalArgumentException)) ? 1004 : 1000);
            ahn.o("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            w0(true, false);
            this.J = this.J.f(exoPlaybackException2);
        }
        F();
        return true;
    }

    public final void i() {
        j jVar;
        if (this.A && f()) {
            for (czf0 czf0Var : this.b) {
                int b2 = czf0Var.b();
                if (czf0Var.e()) {
                    int i = czf0Var.d;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        jVar = czf0Var.a;
                    } else {
                        jVar = czf0Var.c;
                        jVar.getClass();
                    }
                    czf0Var.a(jVar, this.p);
                    czf0Var.h(z);
                    czf0Var.d = i2;
                }
                this.W -= b2 - czf0Var.b();
            }
            this.f0 = C.TIME_UNSET;
        }
    }

    public final void i0(ExoPlayer.c cVar) {
        this.e0 = cVar;
        ewo0 ewo0Var = this.J.a;
        androidx.media3.exoplayer.g gVar = this.t;
        gVar.i = cVar;
        gVar.i.getClass();
        if (gVar.r.isEmpty()) {
            return;
        }
        gVar.n(new ArrayList());
    }

    public final void j(int i) throws ExoPlaybackException {
        czf0[] czf0VarArr = this.b;
        int b2 = czf0VarArr[i].b();
        czf0 czf0Var = czf0VarArr[i];
        j jVar = czf0Var.a;
        gil gilVar = this.p;
        czf0Var.a(jVar, gilVar);
        j jVar2 = czf0Var.c;
        if (jVar2 != null) {
            boolean z = (jVar2.getState() == 0 || czf0Var.d == 3) ? false : true;
            czf0Var.a(jVar2, gilVar);
            czf0Var.h(false);
            if (z) {
                j jVar3 = czf0Var.a;
                jVar2.getClass();
                jVar2.handleMessage(17, jVar3);
            }
        }
        czf0Var.d = 0;
        H(i, false);
        this.W -= b2;
    }

    public final void j0(int i) throws ExoPlaybackException {
        this.R = i;
        ewo0 ewo0Var = this.J.a;
        androidx.media3.exoplayer.g gVar = this.t;
        gVar.g = i;
        int s = gVar.s(ewo0Var);
        if ((s & 1) != 0) {
            X(true);
        } else if ((s & 2) != 0) {
            i();
        }
        v(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0248  */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.media3.exoplayer.source.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v32, types: [androidx.media3.exoplayer.source.h, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() throws ExoPlaybackException, IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean f2;
        boolean z4;
        fwa0 fwa0Var;
        int i;
        boolean z5;
        long uptimeMillis = this.r.uptimeMillis();
        this.i.removeMessages(2);
        if (!this.C) {
            B0();
        }
        int i2 = this.J.e;
        if (i2 == 1 || i2 == 4) {
            return;
        }
        if (this.C) {
            B0();
        }
        et10 et10Var = this.t.j;
        if (et10Var == null) {
            W(uptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        D0();
        if (et10Var.e) {
            this.Z = y2r0.S(this.r.elapsedRealtime());
            et10Var.a.discardBuffer(this.J.s - this.n, this.o);
            z = true;
            z2 = true;
            int i3 = 0;
            while (true) {
                czf0[] czf0VarArr = this.b;
                if (i3 >= czf0VarArr.length) {
                    break;
                }
                czf0 czf0Var = czf0VarArr[i3];
                if (czf0Var.b() == 0) {
                    H(i3, false);
                } else {
                    long j = this.Y;
                    long j2 = this.Z;
                    j jVar = czf0Var.c;
                    j jVar2 = czf0Var.a;
                    if (czf0.g(jVar2)) {
                        jVar2.render(j, j2);
                    }
                    if (jVar != null && jVar.getState() != 0) {
                        jVar.render(j, j2);
                    }
                    if (z) {
                        j jVar3 = czf0Var.c;
                        j jVar4 = czf0Var.a;
                        boolean isEnded = czf0.g(jVar4) ? jVar4.isEnded() : true;
                        if (jVar3 != null && jVar3.getState() != 0) {
                            isEnded &= jVar3.isEnded();
                        }
                        if (isEnded) {
                            z = true;
                            j c2 = czf0Var.c(et10Var);
                            z5 = c2 != null || c2.hasReadStreamToEnd() || c2.isReady() || c2.isEnded();
                            H(i3, z5);
                            z2 = !z2 && z5;
                            if (z5) {
                                G(i3);
                            }
                        }
                    }
                    z = false;
                    j c22 = czf0Var.c(et10Var);
                    if (c22 != null) {
                    }
                    H(i3, z5);
                    if (z2) {
                    }
                    if (z5) {
                    }
                }
                i3++;
            }
        } else {
            et10Var.a.maybeThrowPrepareError();
            z = true;
            z2 = true;
        }
        long j3 = et10Var.g.e;
        boolean z6 = z && et10Var.e && (j3 == C.TIME_UNSET || j3 <= this.J.s);
        if (z6 && this.N) {
            this.N = false;
            int i4 = this.J.n;
            this.K.a(0);
            C0(this.B.d(this.J.e, false), i4, 5, false);
        }
        if (!z6 || !et10Var.g.j) {
            fwa0 fwa0Var2 = this.J;
            if (fwa0Var2.e == 2) {
                androidx.media3.exoplayer.g gVar = this.t;
                if (this.W == 0) {
                    f2 = C();
                } else if (z2) {
                    if (fwa0Var2.g) {
                        et10 et10Var2 = gVar.j;
                        long c3 = u0(fwa0Var2.a, et10Var2.g.a) ? this.v.c() : -9223372036854775807L;
                        et10 et10Var3 = gVar.m;
                        boolean z7 = et10Var3.g() && et10Var3.g.j;
                        boolean z8 = et10Var3.g.a.b() && !et10Var3.e;
                        if (!z7 && !z8) {
                            long q = q(et10Var3.d());
                            androidx.media3.exoplayer.e eVar = this.g;
                            x1b0 x1b0Var = this.x;
                            ewo0 ewo0Var = this.J.a;
                            i.b bVar = et10Var2.g.a;
                            long j4 = this.Y - et10Var2.p;
                            float f3 = this.p.getPlaybackParameters().a;
                            boolean z9 = this.J.l;
                            f2 = eVar.f(new e.a(x1b0Var, ewo0Var, bVar, j4, q, f3, this.O, c3));
                        }
                    }
                    f2 = true;
                } else {
                    f2 = false;
                }
                if (f2) {
                    p0(3);
                    this.c0 = null;
                    if (t0()) {
                        F0(false, false);
                        gil gilVar = this.p;
                        z3 = true;
                        gilVar.g = true;
                        dpk0 dpk0Var = gilVar.b;
                        if (!dpk0Var.c) {
                            dpk0Var.e = dpk0Var.b.elapsedRealtime();
                            dpk0Var.c = true;
                        }
                        v0();
                        if (this.J.e == 2) {
                            int i5 = 0;
                            while (true) {
                                czf0[] czf0VarArr2 = this.b;
                                if (i5 >= czf0VarArr2.length) {
                                    break;
                                }
                                if (czf0VarArr2[i5].c(et10Var) != null ? z3 : false) {
                                    G(i5);
                                }
                                i5++;
                            }
                            fwa0 fwa0Var3 = this.J;
                            if (!fwa0Var3.g && fwa0Var3.r < 500000 && A(this.t.m) && t0()) {
                                z4 = z3;
                                if (z4) {
                                    this.d0 = C.TIME_UNSET;
                                } else if (this.d0 == C.TIME_UNSET) {
                                    this.d0 = this.r.elapsedRealtime();
                                } else if (this.r.elapsedRealtime() - this.d0 >= 4000) {
                                    throw new StuckPlayerException(0, 4000);
                                }
                                boolean z10 = (t0() || this.J.e != 3) ? false : z3;
                                if (this.V || !this.U || !z10) {
                                    z3 = false;
                                }
                                fwa0Var = this.J;
                                if (fwa0Var.p != z3) {
                                    this.J = fwa0Var.i(z3);
                                }
                                this.U = false;
                                if (!z3 && (i = this.J.e) != 4 && (z10 || i == 2 || (i == 3 && this.W != 0))) {
                                    W(uptimeMillis);
                                }
                                Trace.endSection();
                            }
                        }
                        z4 = false;
                        if (z4) {
                        }
                        if (t0()) {
                        }
                        if (this.V) {
                        }
                        z3 = false;
                        fwa0Var = this.J;
                        if (fwa0Var.p != z3) {
                        }
                        this.U = false;
                        if (!z3) {
                            W(uptimeMillis);
                        }
                        Trace.endSection();
                    }
                }
            }
            z3 = true;
            if (this.J.e == 3 && (this.W != 0 ? !z2 : !C())) {
                F0(t0(), false);
                p0(2);
                if (this.O) {
                    for (et10 et10Var4 = this.t.j; et10Var4 != null; et10Var4 = et10Var4.m) {
                        for (d7q d7qVar : et10Var4.o.c) {
                            if (d7qVar != null) {
                                d7qVar.f();
                            }
                        }
                    }
                    this.v.d();
                }
                x0();
            }
            if (this.J.e == 2) {
            }
            z4 = false;
            if (z4) {
            }
            if (t0()) {
            }
            if (this.V) {
            }
            z3 = false;
            fwa0Var = this.J;
            if (fwa0Var.p != z3) {
            }
            this.U = false;
            if (!z3) {
            }
            Trace.endSection();
        }
        p0(4);
        x0();
        z3 = true;
        if (this.J.e == 2) {
        }
        z4 = false;
        if (z4) {
        }
        if (t0()) {
        }
        if (this.V) {
        }
        z3 = false;
        fwa0Var = this.J;
        if (fwa0Var.p != z3) {
        }
        this.U = false;
        if (!z3) {
        }
        Trace.endSection();
    }

    public final void k0(boolean z) throws ExoPlaybackException {
        if (!z) {
            g gVar = this.H;
            otu otuVar = this.i;
            if (gVar != null && this.G && !otuVar.e(37)) {
                this.I++;
            }
            int i = this.I;
            if (i > 0) {
                this.z.post(new q6q(this, i, 0));
            }
            this.I = 0;
            this.G = false;
            otuVar.removeMessages(37);
            g gVar2 = this.H;
            if (gVar2 != null) {
                Y(gVar2);
                this.H = null;
                this.G = false;
            }
        }
        this.F = z;
        e();
    }

    public final void l(et10 et10Var, int i, boolean z, long j) throws ExoPlaybackException {
        czf0 czf0Var = this.b[i];
        if (czf0Var.f()) {
            return;
        }
        boolean z2 = et10Var == this.t.j;
        ehp0 ehp0Var = et10Var.o;
        wyf0 wyf0Var = ehp0Var.b[i];
        d7q d7qVar = ehp0Var.c[i];
        boolean z3 = t0() && this.J.e == 3;
        boolean z4 = !z && z3;
        this.W++;
        m0h0 m0h0Var = et10Var.c[i];
        long j2 = et10Var.p;
        i.b bVar = et10Var.g.a;
        j jVar = czf0Var.c;
        int length = d7qVar != null ? d7qVar.length() : 0;
        androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[length];
        for (int i2 = 0; i2 < length; i2++) {
            d7qVar.getClass();
            aVarArr[i2] = d7qVar.getFormat(i2);
        }
        int i3 = czf0Var.d;
        gil gilVar = this.p;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            czf0Var.e = true;
            czf0Var.a.k(wyf0Var, aVarArr, m0h0Var, z4, z2, j, j2, bVar);
            gilVar.a(czf0Var.a);
        } else {
            czf0Var.f = true;
            jVar.getClass();
            jVar.k(wyf0Var, aVarArr, m0h0Var, z4, z2, j, j2, bVar);
            gilVar.a(jVar);
        }
        a aVar = new a();
        j c2 = czf0Var.c(et10Var);
        c2.getClass();
        c2.handleMessage(11, aVar);
        if (z3 && z2) {
            czf0Var.l();
        }
    }

    public final void l0(fih0 fih0Var) throws ExoPlaybackException {
        this.E = fih0Var;
        e();
    }

    public final void m(boolean[] zArr, long j) throws ExoPlaybackException {
        czf0[] czf0VarArr;
        long j2;
        et10 et10Var = this.t.k;
        ehp0 ehp0Var = et10Var.o;
        int i = 0;
        while (true) {
            czf0VarArr = this.b;
            if (i >= czf0VarArr.length) {
                break;
            }
            if (!ehp0Var.b(i)) {
                czf0VarArr[i].j();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < czf0VarArr.length) {
            if (ehp0Var.b(i2) && czf0VarArr[i2].c(et10Var) == null) {
                j2 = j;
                l(et10Var, i2, zArr[i2], j2);
            } else {
                j2 = j;
            }
            i2++;
            j = j2;
        }
    }

    public final void m0(o3i0 o3i0Var) {
        this.D = o3i0Var;
    }

    public final long n(ewo0 ewo0Var, Object obj, long j) {
        ewo0.b bVar = this.m;
        int i = ewo0Var.g(obj, bVar).c;
        ewo0.c cVar = this.l;
        ewo0Var.n(i, cVar);
        return (cVar.f != C.TIME_UNSET && cVar.a() && cVar.i) ? y2r0.S(y2r0.E(cVar.g) - cVar.f) - (j + bVar.e) : C.TIME_UNSET;
    }

    public final void n0(boolean z) throws ExoPlaybackException {
        this.S = z;
        ewo0 ewo0Var = this.J.a;
        androidx.media3.exoplayer.g gVar = this.t;
        gVar.h = z;
        int s = gVar.s(ewo0Var);
        if ((s & 1) != 0) {
            X(true);
        } else if ((s & 2) != 0) {
            i();
        }
        v(false);
    }

    public final long o(et10 et10Var) {
        if (et10Var == null) {
            return 0L;
        }
        long j = et10Var.p;
        if (!et10Var.e) {
            return j;
        }
        int i = 0;
        while (true) {
            czf0[] czf0VarArr = this.b;
            if (i >= czf0VarArr.length) {
                return j;
            }
            if (czf0VarArr[i].c(et10Var) != null) {
                j c2 = czf0VarArr[i].c(et10Var);
                Objects.requireNonNull(c2);
                long e2 = c2.e();
                if (e2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j = Math.max(e2, j);
            }
            i++;
        }
    }

    public final void o0(r rVar) throws ExoPlaybackException {
        this.K.a(1);
        h hVar = this.u;
        int size = hVar.b.size();
        if (rVar.getLength() != size) {
            rVar = rVar.cloneAndClear().cloneAndInsert(0, size);
        }
        hVar.j = rVar;
        w(hVar.b(), false);
    }

    @Override // xsna.chp0.b
    public final void onTrackSelectionsInvalidated() {
        this.i.sendEmptyMessage(10);
    }

    public final Pair<i.b, Long> p(ewo0 ewo0Var) {
        long j = 0;
        if (ewo0Var.p()) {
            return Pair.create(fwa0.u, 0L);
        }
        int a2 = ewo0Var.a(this.S);
        Pair<Object, Long> i = ewo0Var.i(this.l, this.m, a2, C.TIME_UNSET);
        i.b q = this.t.q(ewo0Var, i.first, 0L);
        long longValue = ((Long) i.second).longValue();
        if (q.b()) {
            Object obj = q.a;
            ewo0.b bVar = this.m;
            ewo0Var.g(obj, bVar);
            if (q.c == bVar.e(q.b)) {
                bVar.g.getClass();
            }
        } else {
            j = longValue;
        }
        return Pair.create(q, Long.valueOf(j));
    }

    public final void p0(int i) {
        fwa0 fwa0Var = this.J;
        if (fwa0Var.e != i) {
            if (i != 2) {
                this.d0 = C.TIME_UNSET;
            }
            if (i != 3 && fwa0Var.p) {
                this.J = fwa0Var.i(false);
            }
            this.J = this.J.h(i);
        }
    }

    public final long q(long j) {
        et10 et10Var = this.t.m;
        if (et10Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.Y - et10Var.p));
    }

    public final void q0(gms0 gms0Var) throws ExoPlaybackException {
        for (czf0 czf0Var : this.b) {
            j jVar = czf0Var.a;
            if (jVar.getTrackType() == 2 || jVar.getTrackType() == 4) {
                jVar.handleMessage(7, gms0Var);
                j jVar2 = czf0Var.c;
                if (jVar2 != null) {
                    jVar2.handleMessage(7, gms0Var);
                }
            }
        }
    }

    public final void r(int i) throws ExoPlaybackException {
        fwa0 fwa0Var = this.J;
        C0(i, fwa0Var.n, fwa0Var.m, fwa0Var.l);
    }

    public final void r0(@Nullable Object obj, @Nullable wwi wwiVar) throws ExoPlaybackException {
        for (czf0 czf0Var : this.b) {
            j jVar = czf0Var.a;
            if (jVar.getTrackType() == 2) {
                int i = czf0Var.d;
                if (i == 4 || i == 1) {
                    j jVar2 = czf0Var.c;
                    jVar2.getClass();
                    jVar2.handleMessage(1, obj);
                } else {
                    jVar.handleMessage(1, obj);
                }
            }
        }
        int i2 = this.J.e;
        if (i2 == 3 || i2 == 2) {
            this.i.sendEmptyMessage(2);
        }
        if (wwiVar != null) {
            wwiVar.f();
        }
    }

    public final void s() throws ExoPlaybackException {
        s0(this.h0);
    }

    public final void s0(float f2) throws ExoPlaybackException {
        this.h0 = f2;
        float f3 = f2 * this.B.g;
        for (czf0 czf0Var : this.b) {
            j jVar = czf0Var.a;
            if (jVar.getTrackType() == 1) {
                jVar.handleMessage(2, Float.valueOf(f3));
                j jVar2 = czf0Var.c;
                if (jVar2 != null) {
                    jVar2.handleMessage(2, Float.valueOf(f3));
                }
            }
        }
    }

    public final void t(androidx.media3.exoplayer.source.h hVar) {
        androidx.media3.exoplayer.g gVar = this.t;
        et10 et10Var = gVar.m;
        if (et10Var != null && et10Var.a == hVar) {
            gVar.m(this.Y);
            D();
            return;
        }
        et10 et10Var2 = gVar.n;
        if (et10Var2 == null || et10Var2.a != hVar) {
            return;
        }
        E();
    }

    public final boolean t0() {
        fwa0 fwa0Var = this.J;
        return fwa0Var.l && fwa0Var.n == 0;
    }

    public final void u(IOException iOException, int i) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        et10 et10Var = this.t.j;
        if (et10Var != null) {
            exoPlaybackException = exoPlaybackException.e(et10Var.g.a);
        }
        ahn.o("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        w0(false, false);
        this.J = this.J.f(exoPlaybackException);
    }

    public final boolean u0(ewo0 ewo0Var, i.b bVar) {
        if (bVar.b() || ewo0Var.p()) {
            return false;
        }
        int i = ewo0Var.g(bVar.a, this.m).c;
        ewo0.c cVar = this.l;
        ewo0Var.n(i, cVar);
        return cVar.a() && cVar.i && cVar.f != C.TIME_UNSET;
    }

    public final void v(boolean z) {
        et10 et10Var = this.t.m;
        i.b bVar = et10Var == null ? this.J.b : et10Var.g.a;
        boolean equals = this.J.k.equals(bVar);
        if (!equals) {
            this.J = this.J.c(bVar);
        }
        fwa0 fwa0Var = this.J;
        fwa0Var.q = et10Var == null ? fwa0Var.s : et10Var.d();
        fwa0 fwa0Var2 = this.J;
        fwa0Var2.r = q(fwa0Var2.q);
        if ((!equals || z) && et10Var != null && et10Var.e) {
            z0(et10Var.g.a, et10Var.n, et10Var.o);
        }
    }

    public final void v0() throws ExoPlaybackException {
        et10 et10Var = this.t.j;
        if (et10Var == null) {
            return;
        }
        ehp0 ehp0Var = et10Var.o;
        int i = 0;
        while (true) {
            czf0[] czf0VarArr = this.b;
            if (i >= czf0VarArr.length) {
                return;
            }
            if (ehp0Var.b(i)) {
                czf0VarArr[i].l();
            }
            i++;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:113|114|(1:116)(1:154)|117|(8:(11:122|123|124|125|126|127|128|129|130|131|(2:133|134)(2:135|(1:137)))|126|127|128|129|130|131|(0)(0))|152|123|124|125) */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0342, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0343, code lost:
    
        r8 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0345, code lost:
    
        r20 = r4;
        r24 = r5;
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x032a A[Catch: all -> 0x0325, TryCatch #3 {all -> 0x0325, blocks: (B:134:0x0321, B:135:0x032a, B:137:0x0330, B:24:0x034d, B:59:0x035b, B:61:0x0361, B:63:0x036b, B:65:0x0378), top: B:22:0x02e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x044f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0467  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v7, types: [long] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v18 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r2v33, types: [androidx.media3.exoplayer.g] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v21, types: [xsna.ewo0] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(ewo0 ewo0Var, boolean z) throws ExoPlaybackException {
        i.b bVar;
        int i;
        long j;
        ewo0 ewo0Var2;
        ewo0.c cVar;
        long j2;
        int i2;
        long j3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        f fVar;
        int i4;
        long longValue;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i5;
        ?? r20;
        ewo0 ewo0Var3;
        i.b bVar2;
        g gVar;
        boolean z10;
        int i6;
        boolean z11;
        char c2;
        int i7;
        boolean z12;
        g gVar2;
        ewo0 ewo0Var4;
        long j9;
        boolean z13;
        int t;
        et10 et10Var;
        int i8;
        boolean z14;
        g gVar3;
        int i9;
        boolean z15;
        androidx.media3.exoplayer.g gVar4;
        fwa0 fwa0Var = this.J;
        g gVar5 = this.X;
        androidx.media3.exoplayer.g gVar6 = this.t;
        int i10 = this.R;
        boolean z16 = this.S;
        ewo0.c cVar2 = this.l;
        ewo0.b bVar3 = this.m;
        if (ewo0Var.p()) {
            r20 = 0;
            i5 = 0;
            ewo0Var2 = ewo0Var;
            fVar = new f(fwa0.u, 0L, C.TIME_UNSET, false, true, false);
            j6 = 0;
        } else {
            i.b bVar4 = fwa0Var.b;
            Object obj = bVar4.a;
            ewo0 ewo0Var5 = fwa0Var.a;
            boolean p = ewo0Var5.p();
            boolean z17 = p || ewo0Var5.g(bVar4.a, bVar3).f;
            long j10 = (fwa0Var.b.b() || z17) ? fwa0Var.c : fwa0Var.s;
            if (gVar5 != null) {
                bVar = bVar4;
                i = -1;
                j = 1;
                ewo0Var2 = ewo0Var;
                Pair<Object, Long> U = U(ewo0Var2, gVar5, true, i10, z16, cVar2, bVar3);
                if (U == null) {
                    i2 = ewo0Var2.a(z16);
                    longValue = j10;
                    z9 = true;
                    z7 = false;
                    z8 = false;
                } else {
                    if (gVar5.c == C.TIME_UNSET) {
                        i2 = ewo0Var2.g(U.first, bVar3).c;
                        longValue = j10;
                        z6 = false;
                    } else {
                        obj = U.first;
                        longValue = ((Long) U.second).longValue();
                        i2 = -1;
                        z6 = true;
                    }
                    z7 = fwa0Var.e == 4;
                    z8 = z6;
                    z9 = false;
                }
                z3 = z9;
                z2 = z7;
                z4 = z8;
                long j11 = longValue;
                cVar = cVar2;
                j2 = j11;
            } else {
                bVar = bVar4;
                i = -1;
                j = 1;
                ewo0Var2 = ewo0Var;
                if (fwa0Var.a.p()) {
                    i2 = ewo0Var2.a(z16);
                    cVar = cVar2;
                } else if (ewo0Var2.b(obj) == -1) {
                    int V = V(cVar2, bVar3, i10, z16, obj, fwa0Var.a, ewo0Var2);
                    cVar = cVar2;
                    ewo0Var2 = ewo0Var2;
                    bVar3 = bVar3;
                    if (V == -1) {
                        i3 = ewo0Var2.a(z16);
                        z5 = true;
                    } else {
                        i3 = V;
                        z5 = false;
                    }
                    z3 = z5;
                    obj = obj;
                    i2 = i3;
                    j2 = j10;
                    z2 = false;
                    z4 = false;
                } else {
                    cVar = cVar2;
                    if (j10 == C.TIME_UNSET) {
                        int i11 = ewo0Var2.g(obj, bVar3).c;
                        obj = obj;
                        i2 = i11;
                    } else if (z17) {
                        fwa0Var.a.g(bVar.a, bVar3);
                        if (fwa0Var.a.m(bVar3.c, cVar, 0L).n == fwa0Var.a.b(bVar.a)) {
                            Pair<Object, Long> i12 = ewo0Var2.i(cVar, bVar3, ewo0Var2.g(obj, bVar3).c, j10 + bVar3.e);
                            obj = i12.first;
                            j3 = ((Long) i12.second).longValue();
                        } else if (ewo0Var2.g(obj, bVar3).d != C.TIME_UNSET) {
                            j3 = y2r0.k(j10, 0L, bVar3.d - 1);
                            obj = obj;
                        } else {
                            obj = obj;
                            j3 = j10;
                        }
                        j2 = j3;
                        i2 = -1;
                        i = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        obj = obj;
                        j2 = j10;
                        i2 = -1;
                        i = -1;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                }
                j2 = j10;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            if (i2 != i) {
                Pair<Object, Long> i13 = ewo0Var2.i(cVar, bVar3, i2, C.TIME_UNSET);
                obj = i13.first;
                j4 = ((Long) i13.second).longValue();
                j2 = -9223372036854775807L;
            } else {
                j4 = j2;
            }
            i.b q = gVar6.q(ewo0Var2, obj, j4);
            int i14 = q.e;
            boolean z18 = i14 == i || ((i4 = bVar.e) != i && i14 >= i4);
            boolean equals = bVar.a.equals(obj);
            boolean z19 = equals && !bVar.b() && !q.b() && z18;
            ewo0.b g2 = ewo0Var2.g(obj, bVar3);
            if (z17 || j10 != j2) {
                j5 = j2;
            } else {
                Object obj2 = bVar.a;
                int i15 = bVar.b;
                j5 = j2;
                if (obj2.equals(q.a)) {
                    if (bVar.b()) {
                        g2.g(i15);
                    }
                    if (q.b()) {
                        g2.g(q.b);
                    }
                }
            }
            i.b bVar5 = !z19 ? q : bVar;
            if (!bVar5.b()) {
                if (equals && bVar.b()) {
                    xg0.a a2 = ewo0Var2.g(obj, bVar3).g.a(bVar.b);
                    a2.getClass();
                    long j12 = fwa0Var.c;
                    j6 = 0;
                    if (j12 == C.TIME_UNSET || 0 > j12) {
                        int i16 = a2.a;
                        int i17 = bVar.c;
                        if (i16 > i17 && a2.e[i17] == 2) {
                            long j13 = ewo0Var2.g(obj, bVar3).d;
                            if (j13 != C.TIME_UNSET) {
                                j4 = Math.min(j13 - j, j4);
                            }
                            j7 = j4;
                            j8 = j7;
                        }
                    }
                } else {
                    j6 = 0;
                }
                j7 = j4;
                j8 = j5;
            } else if (bVar5.equals(bVar)) {
                j7 = fwa0Var.s;
                j8 = j5;
                j6 = 0;
            } else {
                ewo0Var2.g(bVar5.a, bVar3);
                if (bVar5.c == bVar3.e(bVar5.b)) {
                    bVar3.g.getClass();
                }
                j8 = j5;
                j6 = 0;
                j7 = 0;
            }
            fVar = new f(bVar5, j7, j8, z2, z3, z4);
            r20 = p;
            i5 = j10;
        }
        i.b bVar6 = fVar.a;
        ?? r12 = fVar.c;
        boolean z20 = fVar.d;
        long j14 = fVar.b;
        boolean z21 = (this.J.b.equals(bVar6) && j14 == this.J.s) ? false : true;
        try {
            if (fVar.e) {
                try {
                    z11 = true;
                    if (this.J.e != 1) {
                        c2 = 4;
                        try {
                            p0(4);
                        } catch (Throwable th) {
                            th = th;
                            ewo0Var3 = ewo0Var2;
                            bVar2 = bVar6;
                            z10 = z11;
                            i6 = c2;
                            j6 = r12;
                            gVar = null;
                            fwa0 fwa0Var2 = this.J;
                            ewo0 ewo0Var6 = fwa0Var2.a;
                            i.b bVar7 = fwa0Var2.b;
                            i.b bVar8 = bVar2;
                            E0(ewo0Var3, bVar8, ewo0Var6, bVar7, fVar.f ? j14 : -9223372036854775807L, false);
                            if (!z21) {
                            }
                            fwa0 fwa0Var3 = this.J;
                            Object obj3 = fwa0Var3.b.a;
                            ewo0 ewo0Var7 = fwa0Var3.a;
                            if (z21) {
                            }
                            this.J = z(bVar8, j14, j6, r9 ? j14 : this.J.d, r9, ewo0Var3.b(obj3) == -1 ? i6 : 3);
                            P();
                            T(ewo0Var3, this.J.a);
                            this.J = this.J.j(ewo0Var3);
                            if (!ewo0Var3.p()) {
                            }
                            v(false);
                            this.i.sendEmptyMessage(2);
                            throw th;
                        }
                    } else {
                        c2 = 4;
                    }
                    O(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    z11 = true;
                    c2 = 4;
                    ewo0Var3 = ewo0Var2;
                    bVar2 = bVar6;
                    z10 = z11;
                    i6 = c2;
                    j6 = r12;
                    gVar = null;
                    fwa0 fwa0Var22 = this.J;
                    ewo0 ewo0Var62 = fwa0Var22.a;
                    i.b bVar72 = fwa0Var22.b;
                    i.b bVar82 = bVar2;
                    E0(ewo0Var3, bVar82, ewo0Var62, bVar72, fVar.f ? j14 : -9223372036854775807L, false);
                    if (!z21) {
                    }
                    fwa0 fwa0Var32 = this.J;
                    Object obj32 = fwa0Var32.b.a;
                    ewo0 ewo0Var72 = fwa0Var32.a;
                    if (z21) {
                    }
                    this.J = z(bVar82, j14, j6, r9 ? j14 : this.J.d, r9, ewo0Var3.b(obj32) == -1 ? i6 : 3);
                    P();
                    T(ewo0Var3, this.J.a);
                    this.J = this.J.j(ewo0Var3);
                    if (!ewo0Var3.p()) {
                    }
                    v(false);
                    this.i.sendEmptyMessage(2);
                    throw th;
                }
            } else {
                z11 = true;
                c2 = 4;
            }
            czf0[] czf0VarArr = this.b;
            int length = czf0VarArr.length;
            ?? r8 = 0;
            while (r8 < length) {
                czf0 czf0Var = czf0VarArr[r8];
                czf0Var.a.j(ewo0Var2);
                j jVar = czf0Var.c;
                if (jVar != null) {
                    jVar.j(ewo0Var2);
                }
                r8++;
            }
            try {
                if (z21) {
                    r8 = ewo0Var2;
                    r20 = z11;
                    i5 = c2;
                    j6 = r12;
                    gVar3 = null;
                    gVar3 = null;
                    gVar2 = null;
                    r12 = 0;
                    z15 = r20;
                    i9 = i5;
                    if (!r8.p()) {
                        for (et10 et10Var2 = this.t.j; et10Var2 != null; et10Var2 = et10Var2.m) {
                            if (et10Var2.g.a.equals(bVar6)) {
                                et10Var2.g = this.t.h(r8, et10Var2.g);
                                et10Var2.k();
                            }
                        }
                        try {
                            gVar4 = this.t;
                            bVar2 = bVar6;
                        } catch (Throwable th3) {
                            th = th3;
                            bVar2 = bVar6;
                            ewo0Var4 = r8;
                            gVar2 = r12;
                            z12 = r20;
                            i7 = i5;
                            ewo0Var3 = ewo0Var4;
                            gVar = gVar2;
                            z10 = z12;
                            i6 = i7;
                            fwa0 fwa0Var222 = this.J;
                            ewo0 ewo0Var622 = fwa0Var222.a;
                            i.b bVar722 = fwa0Var222.b;
                            i.b bVar822 = bVar2;
                            E0(ewo0Var3, bVar822, ewo0Var622, bVar722, fVar.f ? j14 : -9223372036854775807L, false);
                            if (!z21 || j6 != this.J.c) {
                                fwa0 fwa0Var322 = this.J;
                                Object obj322 = fwa0Var322.b.a;
                                ewo0 ewo0Var722 = fwa0Var322.a;
                                boolean z22 = (z21 || !z || ewo0Var722.p() || ewo0Var722.g(obj322, this.m).f) ? false : z10;
                                this.J = z(bVar822, j14, j6, z22 ? j14 : this.J.d, z22, ewo0Var3.b(obj322) == -1 ? i6 : 3);
                            }
                            P();
                            T(ewo0Var3, this.J.a);
                            this.J = this.J.j(ewo0Var3);
                            if (!ewo0Var3.p()) {
                                this.X = gVar;
                            }
                            v(false);
                            this.i.sendEmptyMessage(2);
                            throw th;
                        }
                        try {
                            j14 = Z(bVar2, j14, gVar4.j != gVar4.k ? r20 == true ? 1 : 0 : false, z20);
                            z14 = r20;
                            i8 = i5;
                            fwa0 fwa0Var4 = this.J;
                            i.b bVar9 = bVar2;
                            E0(ewo0Var, bVar9, fwa0Var4.a, fwa0Var4.b, !fVar.f ? j14 : -9223372036854775807L, false);
                            if (!z21 || j6 != this.J.c) {
                                fwa0 fwa0Var5 = this.J;
                                Object obj4 = fwa0Var5.b.a;
                                ewo0 ewo0Var8 = fwa0Var5.a;
                                boolean z23 = (z21 || !z || ewo0Var8.p() || ewo0Var8.g(obj4, this.m).f) ? false : z14;
                                this.J = z(bVar9, j14, j6, !z23 ? j14 : this.J.d, z23, ewo0Var.b(obj4) != -1 ? i8 : 3);
                            }
                            P();
                            T(ewo0Var, this.J.a);
                            this.J = this.J.j(ewo0Var);
                            if (!ewo0Var.p()) {
                                this.X = gVar3;
                            }
                            v(false);
                            this.i.sendEmptyMessage(2);
                        } catch (Throwable th4) {
                            th = th4;
                            j14 = j14;
                            ewo0Var4 = r8;
                            z12 = r20;
                            i7 = i5;
                            ewo0Var3 = ewo0Var4;
                            gVar = gVar2;
                            z10 = z12;
                            i6 = i7;
                            fwa0 fwa0Var2222 = this.J;
                            ewo0 ewo0Var6222 = fwa0Var2222.a;
                            i.b bVar7222 = fwa0Var2222.b;
                            i.b bVar8222 = bVar2;
                            E0(ewo0Var3, bVar8222, ewo0Var6222, bVar7222, fVar.f ? j14 : -9223372036854775807L, false);
                            if (!z21) {
                            }
                            fwa0 fwa0Var3222 = this.J;
                            Object obj3222 = fwa0Var3222.b.a;
                            ewo0 ewo0Var7222 = fwa0Var3222.a;
                            if (z21) {
                            }
                            this.J = z(bVar8222, j14, j6, z22 ? j14 : this.J.d, z22, ewo0Var3.b(obj3222) == -1 ? i6 : 3);
                            P();
                            T(ewo0Var3, this.J.a);
                            this.J = this.J.j(ewo0Var3);
                            if (!ewo0Var3.p()) {
                            }
                            v(false);
                            this.i.sendEmptyMessage(2);
                            throw th;
                        }
                    }
                } else {
                    try {
                        et10 et10Var3 = this.t.k;
                        long o = et10Var3 == null ? j6 : o(et10Var3);
                        try {
                            try {
                                if (f() && (et10Var = this.t.l) != null) {
                                    j9 = o(et10Var);
                                    z13 = z11;
                                    i5 = c2;
                                    r20 = z13;
                                    j6 = r12;
                                    r12 = 0;
                                    gVar3 = null;
                                    gVar3 = null;
                                    gVar3 = null;
                                    t = this.t.t(ewo0Var, this.Y, o, j9);
                                    if ((t & 1) == 0) {
                                        X(false);
                                        z15 = r20;
                                        i9 = i5;
                                    } else {
                                        z15 = r20;
                                        i9 = i5;
                                        if ((t & 2) != 0) {
                                            i();
                                            z15 = r20;
                                            i9 = i5;
                                        }
                                    }
                                }
                                t = this.t.t(ewo0Var, this.Y, o, j9);
                                if ((t & 1) == 0) {
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                r8 = ewo0Var;
                                bVar2 = bVar6;
                                ewo0Var4 = r8;
                                gVar2 = r12;
                                z12 = r20;
                                i7 = i5;
                                ewo0Var3 = ewo0Var4;
                                gVar = gVar2;
                                z10 = z12;
                                i6 = i7;
                                fwa0 fwa0Var22222 = this.J;
                                ewo0 ewo0Var62222 = fwa0Var22222.a;
                                i.b bVar72222 = fwa0Var22222.b;
                                i.b bVar82222 = bVar2;
                                E0(ewo0Var3, bVar82222, ewo0Var62222, bVar72222, fVar.f ? j14 : -9223372036854775807L, false);
                                if (!z21) {
                                }
                                fwa0 fwa0Var32222 = this.J;
                                Object obj32222 = fwa0Var32222.b.a;
                                ewo0 ewo0Var72222 = fwa0Var32222.a;
                                if (z21) {
                                }
                                this.J = z(bVar82222, j14, j6, z22 ? j14 : this.J.d, z22, ewo0Var3.b(obj32222) == -1 ? i6 : 3);
                                P();
                                T(ewo0Var3, this.J.a);
                                this.J = this.J.j(ewo0Var3);
                                if (!ewo0Var3.p()) {
                                }
                                v(false);
                                this.i.sendEmptyMessage(2);
                                throw th;
                            }
                            r20 = z13;
                            j6 = r12;
                            r12 = 0;
                            gVar3 = null;
                            gVar3 = null;
                            gVar3 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            r8 = ewo0Var;
                            r20 = z13;
                            i5 = i5;
                            j6 = r12;
                            r12 = 0;
                            bVar2 = bVar6;
                            ewo0Var4 = r8;
                            gVar2 = r12;
                            z12 = r20;
                            i7 = i5;
                            ewo0Var3 = ewo0Var4;
                            gVar = gVar2;
                            z10 = z12;
                            i6 = i7;
                            fwa0 fwa0Var222222 = this.J;
                            ewo0 ewo0Var622222 = fwa0Var222222.a;
                            i.b bVar722222 = fwa0Var222222.b;
                            i.b bVar822222 = bVar2;
                            E0(ewo0Var3, bVar822222, ewo0Var622222, bVar722222, fVar.f ? j14 : -9223372036854775807L, false);
                            if (!z21) {
                            }
                            fwa0 fwa0Var322222 = this.J;
                            Object obj322222 = fwa0Var322222.b.a;
                            ewo0 ewo0Var722222 = fwa0Var322222.a;
                            if (z21) {
                            }
                            this.J = z(bVar822222, j14, j6, z22 ? j14 : this.J.d, z22, ewo0Var3.b(obj322222) == -1 ? i6 : 3);
                            P();
                            T(ewo0Var3, this.J.a);
                            this.J = this.J.j(ewo0Var3);
                            if (!ewo0Var3.p()) {
                            }
                            v(false);
                            this.i.sendEmptyMessage(2);
                            throw th;
                        }
                        j9 = j6;
                        z13 = z11;
                        i5 = c2;
                    } catch (Throwable th7) {
                        th = th7;
                        ewo0 ewo0Var9 = ewo0Var2;
                    }
                }
                bVar2 = bVar6;
                z14 = z15;
                i8 = i9;
                fwa0 fwa0Var42 = this.J;
                i.b bVar92 = bVar2;
                E0(ewo0Var, bVar92, fwa0Var42.a, fwa0Var42.b, !fVar.f ? j14 : -9223372036854775807L, false);
                if (!z21) {
                }
                fwa0 fwa0Var52 = this.J;
                Object obj42 = fwa0Var52.b.a;
                ewo0 ewo0Var82 = fwa0Var52.a;
                if (z21) {
                }
                this.J = z(bVar92, j14, j6, !z23 ? j14 : this.J.d, z23, ewo0Var.b(obj42) != -1 ? i8 : 3);
                P();
                T(ewo0Var, this.J.a);
                this.J = this.J.j(ewo0Var);
                if (!ewo0Var.p()) {
                }
                v(false);
                this.i.sendEmptyMessage(2);
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
            ewo0Var3 = ewo0Var2;
            bVar2 = bVar6;
            j6 = r12;
            gVar = null;
            z10 = true;
            i6 = 4;
        }
    }

    public final void w0(boolean z, boolean z2) {
        O(z || !this.T, false, true, false);
        this.K.a(z2 ? 1 : 0);
        this.g.d(this.x);
        this.B.d(1, this.J.l);
        p0(1);
    }

    public final void x(androidx.media3.exoplayer.source.h hVar) throws ExoPlaybackException {
        et10 et10Var;
        androidx.media3.exoplayer.g gVar = this.t;
        et10 et10Var2 = gVar.m;
        gil gilVar = this.p;
        if (et10Var2 != null && et10Var2.a == hVar) {
            et10Var2.getClass();
            if (!et10Var2.e) {
                float f2 = gilVar.getPlaybackParameters().a;
                fwa0 fwa0Var = this.J;
                et10Var2.f(f2, fwa0Var.a, fwa0Var.l);
            }
            z0(et10Var2.g.a, et10Var2.n, et10Var2.o);
            if (et10Var2 == gVar.j) {
                Q(et10Var2.g.b, true);
                m(new boolean[this.b.length], gVar.k.e());
                et10Var2.h = true;
                fwa0 fwa0Var2 = this.J;
                i.b bVar = fwa0Var2.b;
                long j = et10Var2.g.b;
                this.J = z(bVar, j, fwa0Var2.c, j, false, 5);
            }
            D();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= gVar.r.size()) {
                et10Var = null;
                break;
            }
            et10Var = (et10) gVar.r.get(i);
            if (et10Var.a == hVar) {
                break;
            } else {
                i++;
            }
        }
        if (et10Var != null) {
            fxc0.z(true ^ et10Var.e);
            float f3 = gilVar.getPlaybackParameters().a;
            fwa0 fwa0Var3 = this.J;
            et10Var.f(f3, fwa0Var3.a, fwa0Var3.l);
            et10 et10Var3 = gVar.n;
            if (et10Var3 == null || et10Var3.a != hVar) {
                return;
            }
            E();
        }
    }

    public final void x0() throws ExoPlaybackException {
        gil gilVar = this.p;
        gilVar.g = false;
        dpk0 dpk0Var = gilVar.b;
        if (dpk0Var.c) {
            dpk0Var.a(dpk0Var.getPositionUs());
            dpk0Var.c = false;
        }
        for (czf0 czf0Var : this.b) {
            j jVar = czf0Var.c;
            j jVar2 = czf0Var.a;
            if (czf0.g(jVar2) && jVar2.getState() == 2) {
                jVar2.stop();
            }
            if (jVar != null && jVar.getState() != 0 && jVar.getState() == 2) {
                jVar.stop();
            }
        }
    }

    public final void y(jwa0 jwa0Var, float f2, boolean z, boolean z2) throws ExoPlaybackException {
        int i;
        if (z) {
            if (z2) {
                this.K.a(1);
            }
            this.J = this.J.g(jwa0Var);
        }
        float f3 = jwa0Var.a;
        et10 et10Var = this.t.j;
        while (true) {
            i = 0;
            if (et10Var == null) {
                break;
            }
            d7q[] d7qVarArr = et10Var.o.c;
            int length = d7qVarArr.length;
            while (i < length) {
                d7q d7qVar = d7qVarArr[i];
                if (d7qVar != null) {
                    d7qVar.onPlaybackSpeed(f3);
                }
                i++;
            }
            et10Var = et10Var.m;
        }
        czf0[] czf0VarArr = this.b;
        int length2 = czf0VarArr.length;
        while (i < length2) {
            czf0 czf0Var = czf0VarArr[i];
            float f4 = jwa0Var.a;
            czf0Var.a.q(f2, f4);
            j jVar = czf0Var.c;
            if (jVar != null) {
                jVar.q(f2, f4);
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.media3.exoplayer.source.q, java.lang.Object] */
    public final void y0() {
        et10 et10Var = this.t.m;
        boolean z = this.Q || (et10Var != null && et10Var.a.isLoading());
        fwa0 fwa0Var = this.J;
        if (z != fwa0Var.g) {
            this.J = fwa0Var.b(z);
        }
    }

    @CheckResult
    public final fwa0 z(i.b bVar, long j, long j2, long j3, boolean z, int i) {
        com.google.common.collect.g gVar;
        boolean z2;
        this.b0 = (!this.b0 && j == this.J.s && bVar.equals(this.J.b)) ? false : true;
        P();
        fwa0 fwa0Var = this.J;
        qfp0 qfp0Var = fwa0Var.h;
        ehp0 ehp0Var = fwa0Var.i;
        List<fi20> list = fwa0Var.j;
        if (this.u.k) {
            et10 et10Var = this.t.j;
            qfp0Var = et10Var == null ? qfp0.d : et10Var.n;
            ehp0Var = et10Var == null ? this.f : et10Var.o;
            d7q[] d7qVarArr = ehp0Var.c;
            ImmutableList.a aVar = new ImmutableList.a();
            boolean z3 = false;
            for (d7q d7qVar : d7qVarArr) {
                if (d7qVar != null) {
                    fi20 fi20Var = d7qVar.getFormat(0).l;
                    if (fi20Var == null) {
                        aVar.c(new fi20(new fi20.a[0]));
                    } else {
                        aVar.c(fi20Var);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                gVar = aVar.g();
            } else {
                ImmutableList.b bVar2 = ImmutableList.c;
                gVar = com.google.common.collect.g.f;
            }
            list = gVar;
            if (et10Var != null) {
                ft10 ft10Var = et10Var.g;
                if (ft10Var.c != j2) {
                    et10Var.g = ft10Var.a(j2);
                }
            }
            czf0[] czf0VarArr = this.b;
            androidx.media3.exoplayer.g gVar2 = this.t;
            et10 et10Var2 = gVar2.j;
            if (et10Var2 == gVar2.k && et10Var2 != null) {
                ehp0 ehp0Var2 = et10Var2.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= czf0VarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (ehp0Var2.b(i2)) {
                        if (czf0VarArr[i2].a.getTrackType() != 1) {
                            z2 = false;
                            break;
                        }
                        if (ehp0Var2.b[i2].a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.V) {
                    this.V = z5;
                    if (!z5 && this.J.p) {
                        this.i.sendEmptyMessage(2);
                    }
                }
            }
        } else if (!bVar.equals(fwa0Var.b)) {
            qfp0Var = qfp0.d;
            ehp0Var = this.f;
            list = com.google.common.collect.g.f;
        }
        qfp0 qfp0Var2 = qfp0Var;
        ehp0 ehp0Var3 = ehp0Var;
        List<fi20> list2 = list;
        if (z) {
            e eVar = this.K;
            if (!eVar.d || eVar.e == 5) {
                eVar.a = true;
                eVar.d = true;
                eVar.e = i;
            } else {
                fxc0.p(i == 5);
            }
        }
        fwa0 fwa0Var2 = this.J;
        return fwa0Var2.d(bVar, j, j2, j3, q(fwa0Var2.q), qfp0Var2, ehp0Var3, list2);
    }

    public final void z0(i.b bVar, qfp0 qfp0Var, ehp0 ehp0Var) {
        long j;
        long j2;
        androidx.media3.exoplayer.g gVar = this.t;
        et10 et10Var = gVar.m;
        et10Var.getClass();
        if (et10Var == gVar.j) {
            j = this.Y;
            j2 = et10Var.p;
        } else {
            j = this.Y - et10Var.p;
            j2 = et10Var.g.b;
        }
        long j3 = j - j2;
        long q = q(et10Var.d());
        long c2 = u0(this.J.a, et10Var.g.a) ? this.v.c() : C.TIME_UNSET;
        ewo0 ewo0Var = this.J.a;
        float f2 = this.p.getPlaybackParameters().a;
        boolean z = this.J.l;
        this.g.c(new e.a(this.x, ewo0Var, bVar, j3, q, f2, this.O, c2), ehp0Var.c);
    }
}
