package androidx.media3.transformer;

import android.content.Context;
import android.media.metrics.EditingEndedEvent;
import android.media.metrics.EditingSession;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.transformer.MuxerWrapper;
import androidx.media3.transformer.b0;
import androidx.media3.transformer.e;
import androidx.media3.transformer.f;
import androidx.media3.transformer.h;
import androidx.media3.transformer.k;
import androidx.media3.transformer.l;
import androidx.media3.transformer.m;
import androidx.media3.transformer.n;
import androidx.media3.transformer.o;
import androidx.media3.transformer.t;
import androidx.media3.transformer.w;
import androidx.media3.transformer.z;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.ironsource.V2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import xsna.a7l;
import xsna.ahn;
import xsna.ar;
import xsna.ar4;
import xsna.atv0;
import xsna.bdx0;
import xsna.crl;
import xsna.dds0;
import xsna.dj50;
import xsna.dvf;
import xsna.e2p;
import xsna.fkk0;
import xsna.fxc0;
import xsna.g7l;
import xsna.gv2;
import xsna.hkc0;
import xsna.i2e0;
import xsna.ihz;
import xsna.io20;
import xsna.kms0;
import xsna.kr10;
import xsna.llp0;
import xsna.mlh0;
import xsna.mlp0;
import xsna.mrc0;
import xsna.ne7;
import xsna.nr10;
import xsna.otu;
import xsna.owj0;
import xsna.p8p;
import xsna.sd9;
import xsna.uxo0;
import xsna.v9p;
import xsna.vp;
import xsna.y2r0;
import xsna.ypn0;

/* compiled from: Transformer.java */
/* loaded from: classes12.dex */
public final class a0 {
    public static final long C;
    public o A;

    @Nullable
    public bdx0 B;
    public final Context a;
    public final z b;
    public final ImmutableList<AudioProcessor> c;
    public final ImmutableList<p8p> d;
    public final ImmutableList<Integer> e;
    public final boolean f;
    public final long g;
    public final int h;
    public final ihz<c> i;
    public final ar4 j;
    public final kms0.b k;
    public final e.b l;
    public final dj50.a m;
    public final Looper n;
    public final g7l o;
    public final dvf p;
    public final otu q;
    public final t.a s;

    @Nullable
    public final o.b.a t;

    @Nullable
    public b0 u;

    @Nullable
    public MuxerWrapper v;
    public f w;
    public f x;
    public String y;
    public int z = 0;
    public final b r = new b();

    /* compiled from: Transformer.java */
    public static final class a {
        public static final com.google.common.collect.g r;
        public final Context a;
        public z b;
        public final com.google.common.collect.g c;
        public final com.google.common.collect.g d;
        public final com.google.common.collect.g e;
        public final boolean f;
        public final long g;
        public final int h;
        public final ihz<c> i;
        public final h.a j;
        public final crl.b k;
        public final k l;
        public final l.a m;
        public final Looper n;
        public final vp o;
        public final ypn0 p;
        public final o.a.C0072a q;

        static {
            Integer valueOf = Integer.valueOf(atv0.b);
            ImmutableList.b bVar = ImmutableList.c;
            Object[] objArr = {0, 90, 180, valueOf};
            ne7.l(objArr);
            r = ImmutableList.l(4, objArr);
        }

        public a(Context context) {
            Context applicationContext = context.getApplicationContext();
            this.a = applicationContext;
            this.g = a0.C;
            this.h = -1;
            com.google.common.collect.g gVar = com.google.common.collect.g.f;
            this.c = gVar;
            this.d = gVar;
            this.j = new h.a();
            this.k = new crl.b.a().a();
            this.l = new k(new k.a(applicationContext));
            this.m = new l.a();
            Looper myLooper = Looper.myLooper();
            myLooper = myLooper == null ? Looper.getMainLooper() : myLooper;
            this.n = myLooper;
            this.o = g7l.j7;
            this.p = dvf.a;
            this.i = new ihz<>(myLooper);
            if (Build.VERSION.SDK_INT >= 35) {
                this.f = true;
                this.q = new o.a.C0072a(context);
            }
            this.e = r;
        }

        public final a0 a() {
            z.a a;
            z zVar = this.b;
            if (zVar == null) {
                a = new z.a();
                a.a = -1;
            } else {
                a = zVar.a();
            }
            z a2 = a.a();
            this.b = a2;
            String str = a2.b;
            if (str != null) {
                fxc0.y(str, "Unsupported sample MIME type %s", this.m.a.b(io20.i(str)).contains(str));
            }
            String str2 = this.b.c;
            if (str2 != null) {
                fxc0.y(str2, "Unsupported sample MIME type %s", this.m.a.b(io20.i(str2)).contains(str2));
            }
            StringBuilder sb = new StringBuilder("Muxer.Factory ");
            l.a aVar = this.m;
            sb.append(aVar);
            return new a0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, aVar, this.n, this.o, this.p, this.q);
        }
    }

    /* compiled from: Transformer.java */
    public final class b implements b0.b, MuxerWrapper.a {
        public b() {
        }

        public final void a(long j, long j2) {
            a0 a0Var = a0.this;
            t.a aVar = a0Var.s;
            aVar.getClass();
            boolean z = true;
            fxc0.p(j >= 0 || j == C.TIME_UNSET);
            aVar.b = j;
            if (j2 <= 0 && j2 != -1) {
                z = false;
            }
            fxc0.n(j2, "Invalid file size = %s", z);
            aVar.c = j2;
            b0 b0Var = a0Var.u;
            b0Var.getClass();
            b0Var.e();
            b0Var.j.obtainMessage(4, 0, 0, null).b();
        }
    }

    static {
        nr10.a("media3.transformer");
        C = y2r0.P() ? V2.h : 10000L;
    }

    public a0(Context context, z zVar, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, boolean z, long j, int i, ihz ihzVar, h.a aVar, crl.b bVar, k kVar, l.a aVar2, Looper looper, vp vpVar, ypn0 ypn0Var, o.a.C0072a c0072a) {
        this.a = context;
        this.b = zVar;
        this.c = immutableList;
        this.d = immutableList2;
        this.e = immutableList3;
        this.f = z;
        this.g = j;
        this.h = i;
        this.i = ihzVar;
        this.j = aVar;
        this.k = bVar;
        this.l = kVar;
        this.m = aVar2;
        this.n = looper;
        this.o = vpVar;
        this.p = ypn0Var;
        this.t = c0072a;
        this.q = ypn0Var.createHandler(looper, null);
        t.a aVar3 = new t.a();
        aVar3.b();
        this.s = aVar3;
    }

    public static void a(a0 a0Var) {
        EditingEndedEvent.Builder finalProgressPercent;
        EditingEndedEvent build;
        EditingSession editingSession;
        a0Var.f();
        t a2 = a0Var.s.a();
        a0Var.i.f(-1, new mlh0(a0Var, a2));
        if (a0Var.b()) {
            o oVar = a0Var.A;
            oVar.getClass();
            boolean e = a0Var.e();
            o.b bVar = oVar.e;
            finalProgressPercent = oVar.a(1).setFinalProgressPercent(100.0f);
            oVar.f(finalProgressPercent, a2, e);
            ArrayList c2 = o.c(a2.q);
            for (int i = 0; i < c2.size(); i++) {
                finalProgressPercent.addInputMediaItemInfo(e2p.a(c2.get(i)));
            }
            finalProgressPercent.setOutputMediaItemInfo(o.d(a2));
            build = finalProgressPercent.build();
            o.a aVar = (o.a) bVar;
            if (!aVar.c && (editingSession = aVar.b) != null) {
                editingSession.reportEditingEndedEvent(build);
                aVar.c = true;
            }
            try {
                ar.d(bVar);
            } catch (Exception e2) {
                ahn.o("EditingMetricsCollector", "error while closing the metrics reporter", e2);
            }
        }
        a0Var.z = 0;
    }

    public final boolean b() {
        return Build.VERSION.SDK_INT >= 35 && this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(float f, float f2, i2e0 i2e0Var) {
        int i;
        b0 b0Var = this.u;
        if (b0Var == null) {
            i2e0Var.a = Math.round(f);
            return f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : 2;
        }
        synchronized (b0Var.r) {
            try {
                i = b0Var.B;
                if (i == 2) {
                    i2e0Var.a = b0Var.C;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i != 0 && i != 1) {
            if (i == 2) {
                i2e0Var.a = Math.round((i2e0Var.a * f2) + f);
                return 2;
            }
            if (i == 3) {
                return 3;
            }
            throw new IllegalStateException();
        }
        i2e0Var.a = Math.round(f);
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
    }

    public final int d(i2e0 i2e0Var) {
        int i;
        i();
        if (e()) {
            int i2 = this.z;
            if (i2 == 1) {
                return c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.15f, i2e0Var);
            }
            if (i2 == 2) {
                return c(15.000001f, 0.4f, i2e0Var);
            }
            if (i2 == 3) {
                return c(55.0f, 0.3f, i2e0Var);
            }
            i2e0Var.a = Math.round(85.0f);
            return 2;
        }
        int i3 = this.z;
        if (i3 == 5 || i3 == 6) {
            return 1;
        }
        b0 b0Var = this.u;
        if (b0Var == null) {
            return 0;
        }
        synchronized (b0Var.r) {
            try {
                i = b0Var.B;
                if (i == 2) {
                    i2e0Var.a = b0Var.C;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final boolean e() {
        int i = this.z;
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public final void f() {
        bdx0 bdx0Var = this.B;
        if (bdx0Var != null) {
            ScheduledFuture<?> scheduledFuture = bdx0Var.d;
            scheduledFuture.getClass();
            scheduledFuture.cancel(false);
            bdx0Var.c.shutdownNow();
            this.B = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(kr10 kr10Var, String str) {
        n nVar;
        m.a aVar = new m.a();
        aVar.a = kr10Var;
        kr10.f fVar = kr10Var.b;
        aVar.d = fVar == null ? -9223372036854775807L : y2r0.S(fVar.f);
        aVar.e = -2147483647;
        v9p v9pVar = v9p.c;
        aVar.f = v9pVar;
        fkk0.a aVar2 = fkk0.a;
        aVar.g = aVar2;
        aVar.b = false;
        aVar.c = false;
        aVar.f = new v9p(this.c, this.d);
        n nVar2 = new n(new n.a(new m(aVar)));
        ImmutableList.a aVar3 = new ImmutableList.a();
        aVar3.c(nVar2);
        aVar3.d(new n[0]);
        com.google.common.collect.g g = aVar3.g();
        f.a aVar4 = new f.a();
        fxc0.q(!g.isEmpty(), "The composition must contain at least one EditedMediaItemSequence.");
        aVar4.a = ImmutableList.m(g);
        aVar4.b = dds0.a;
        aVar4.c = v9pVar;
        f a2 = aVar4.a();
        i();
        long j = this.g;
        if (j != C.TIME_UNSET) {
            hkc0 hkc0Var = new hkc0(this, 6);
            bdx0 bdx0Var = new bdx0(j, hkc0Var);
            this.B = bdx0Var;
            bdx0Var.d = bdx0Var.c.schedule(new gv2(hkc0Var, 20), j, TimeUnit.MILLISECONDS);
        }
        this.x = a2;
        ArrayList arrayList = new ArrayList();
        ImmutableList.b listIterator = a2.a.listIterator(0);
        while (listIterator.hasNext()) {
            n nVar3 = (n) listIterator.next();
            ArrayList arrayList2 = new ArrayList();
            ImmutableList.b listIterator2 = nVar3.a.listIterator(0);
            while (listIterator2.hasNext()) {
                m mVar = (m) listIterator2.next();
                fkk0.a aVar5 = mVar.g;
                if (aVar5 == aVar2) {
                    arrayList2.add(mVar);
                } else {
                    androidx.media3.common.audio.f fVar2 = new androidx.media3.common.audio.f(aVar5);
                    uxo0 uxo0Var = new uxo0(new mrc0(fVar2, 9), aVar5);
                    m.a a3 = mVar.a();
                    fxc0.p(fVar2.c == aVar5);
                    a3.h = true;
                    ImmutableList.a aVar6 = new ImmutableList.a();
                    aVar6.c(fVar2);
                    aVar6.e(a3.f.a);
                    com.google.common.collect.g g2 = aVar6.g();
                    ImmutableList.a aVar7 = new ImmutableList.a();
                    aVar7.c(uxo0Var);
                    aVar7.e(a3.f.b);
                    a3.f = new v9p(g2, aVar7.g());
                    arrayList2.add(new m(a3));
                }
            }
            fxc0.p(!arrayList2.isEmpty());
            ImmutableSet<Integer> immutableSet = nVar3.b;
            if (immutableSet.contains(-2)) {
                n.a aVar8 = new n.a(arrayList2);
                boolean z = nVar3.c;
                fxc0.z(aVar8.b.contains(-2));
                if (z) {
                    ImmutableSet.a aVar9 = new ImmutableSet.a(4);
                    aVar9.h(aVar8.b);
                    aVar9.c(1);
                    aVar8.b = aVar9.i();
                } else {
                    ImmutableSet<Integer> immutableSet2 = aVar8.b;
                    int i = ImmutableSet.d;
                    owj0 owj0Var = new owj0(1);
                    fxc0.t(immutableSet2, "set1");
                    aVar8.b = ImmutableSet.n(new com.google.common.collect.k(immutableSet2, owj0Var));
                }
                boolean z2 = nVar3.d;
                fxc0.z(aVar8.b.contains(-2));
                if (z2) {
                    ImmutableSet.a aVar10 = new ImmutableSet.a(4);
                    aVar10.h(aVar8.b);
                    aVar10.c(2);
                    aVar8.b = aVar10.i();
                } else {
                    ImmutableSet<Integer> immutableSet3 = aVar8.b;
                    int i2 = ImmutableSet.d;
                    owj0 owj0Var2 = new owj0(2);
                    fxc0.t(immutableSet3, "set1");
                    aVar8.b = ImmutableSet.n(new com.google.common.collect.k(immutableSet3, owj0Var2));
                }
                nVar = new n(aVar8);
            } else {
                n.a aVar11 = new n.a(immutableSet);
                aVar11.a.e(arrayList2);
                nVar = new n(aVar11);
            }
            arrayList.add(nVar);
        }
        f.a a4 = a2.a();
        a4.b(arrayList);
        this.w = a4.a();
        this.y = str;
        this.s.b();
        h(this.w, new MuxerWrapper(this.y, this.m, this.r, 0, null), this.r, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(f fVar, MuxerWrapper muxerWrapper, b bVar, long j) {
        LogSessionId logSessionId;
        boolean z;
        f fVar2;
        boolean z2;
        fxc0.A(this.u == null, "There is already an export in progress.");
        z zVar = this.b;
        fVar.getClass();
        String str = null;
        if (b()) {
            o.b.a aVar = this.t;
            aVar.getClass();
            o.a create = aVar.create();
            EditingSession editingSession = create.b;
            LogSessionId sessionId = editingSession != null ? editingSession.getSessionId() : null;
            dj50.a aVar2 = this.m;
            if (aVar2 instanceof w.a) {
                str = "androidx.media3:media3-muxer:1.9.3";
            } else if (aVar2 instanceof l.a) {
                str = l.c;
            }
            f fVar3 = this.w;
            fVar3.getClass();
            if (fVar3.c.a.isEmpty()) {
                f fVar4 = this.w;
                fVar4.getClass();
                if (!sd9.e(fVar4.a, new llp0())) {
                    z = false;
                    fVar2 = this.w;
                    fVar2.getClass();
                    if (fVar2.c.b.isEmpty()) {
                        f fVar5 = this.w;
                        fVar5.getClass();
                        if (!sd9.e(fVar5.a, new mlp0())) {
                            z2 = false;
                            this.A = new o(create, str, z, z2);
                            logSessionId = sessionId;
                        }
                    }
                    z2 = true;
                    this.A = new o(create, str, z, z2);
                    logSessionId = sessionId;
                }
            }
            z = true;
            fVar2 = this.w;
            fVar2.getClass();
            if (fVar2.c.b.isEmpty()) {
            }
            z2 = true;
            this.A = new o(create, str, z, z2);
            logSessionId = sessionId;
        } else {
            logSessionId = null;
        }
        f fVar6 = this.x;
        fVar6.getClass();
        u uVar = new u(fVar6, this.i, this.q, zVar);
        LinkedHashMap linkedHashMap = a7l.a;
        synchronized (a7l.class) {
            a7l.a.clear();
            SystemClock.elapsedRealtime();
        }
        b0 b0Var = new b0(this.a, fVar, zVar, this.j, this.k, this.l, this.e, this.h, muxerWrapper, bVar, uVar, this.q, this.o, this.p, j, logSessionId, false);
        this.u = b0Var;
        b0Var.e();
        b0Var.j.sendEmptyMessage(1);
        synchronized (b0Var.r) {
            b0Var.B = 1;
            b0Var.C = 0;
        }
        String str2 = y2r0.a;
        synchronized (a7l.class) {
        }
    }

    public final void i() {
        if (Looper.myLooper() != this.n) {
            throw new IllegalStateException("Transformer is accessed on the wrong thread.");
        }
    }

    /* compiled from: Transformer.java */
    public interface c {
        default void onCompleted() {
        }

        default void a(ExportException exportException) {
        }
    }
}
