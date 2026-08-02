package androidx.media3.exoplayer.hls;

import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.StreamKey;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.hls.playlist.b;
import androidx.media3.exoplayer.source.a;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.j;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;
import xsna.alk;
import xsna.anl;
import xsna.b9v;
import xsna.c9v;
import xsna.e9v;
import xsna.ffr;
import xsna.fxc0;
import xsna.fz5;
import xsna.j9v;
import xsna.kr10;
import xsna.mjp0;
import xsna.nr10;
import xsna.p9v;
import xsna.qdl;
import xsna.qfl;
import xsna.r9v;
import xsna.rfl;
import xsna.tfl;
import xsna.x1b0;
import xsna.xu1;
import xsna.y2r0;
import xsna.ylo;
import xsna.zuj0;

/* loaded from: classes12.dex */
public final class HlsMediaSource extends a {
    public final e9v h;
    public final c9v i;
    public final fz5 j;
    public final b k;
    public final androidx.media3.exoplayer.upstream.b l;
    public final boolean m;
    public final int n;
    public final HlsPlaylistTracker o;
    public final long p;
    public kr10.e q;

    @Nullable
    public mjp0 r;
    public kr10 s;

    /* loaded from: classes.dex */
    public static final class Factory implements i.a {
        public final qfl a;

        @Nullable
        public rfl b;

        @Nullable
        public anl c;
        public boolean d;
        public p9v e;
        public HlsPlaylistTracker.a f;
        public final fz5 g;
        public ylo h;
        public androidx.media3.exoplayer.upstream.b i;
        public final boolean j;
        public final int k;
        public final long l;

        public Factory(a.InterfaceC0045a interfaceC0045a) {
            this(new qfl(interfaceC0045a));
        }

        @Override // androidx.media3.exoplayer.source.i.a
        public final void a(anl anlVar) {
            this.c = anlVar;
        }

        @Override // androidx.media3.exoplayer.source.i.a
        @Deprecated
        public final void c(boolean z) {
            this.d = z;
        }

        @Override // androidx.media3.exoplayer.source.i.a
        public final i.a e(ylo yloVar) {
            fxc0.t(yloVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            this.h = yloVar;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.i.a
        public final i.a f(androidx.media3.exoplayer.upstream.b bVar) {
            fxc0.t(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            this.i = bVar;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.i.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final HlsMediaSource d(kr10 kr10Var) {
            kr10Var.b.getClass();
            if (this.b == null) {
                this.b = new rfl();
            }
            anl anlVar = this.c;
            if (anlVar != null) {
                this.b.d(anlVar);
            }
            this.b.b(this.d);
            this.b.getClass();
            rfl rflVar = this.b;
            p9v p9vVar = this.e;
            List<StreamKey> list = kr10Var.b.c;
            if (!list.isEmpty()) {
                p9vVar = new ffr(p9vVar, list);
            }
            b a = this.h.a(kr10Var);
            androidx.media3.exoplayer.upstream.b bVar = this.i;
            return new HlsMediaSource(kr10Var, this.a, rflVar, this.g, a, bVar, this.f.a(this.a, bVar, p9vVar), this.l, this.j, this.k);
        }

        public Factory(qfl qflVar) {
            this.a = qflVar;
            this.h = new qdl();
            this.e = new tfl();
            this.f = androidx.media3.exoplayer.hls.playlist.a.p;
            this.i = new androidx.media3.exoplayer.upstream.a();
            this.g = new fz5();
            this.k = 1;
            this.l = C.TIME_UNSET;
            this.j = true;
            this.d = true;
        }

        @Override // androidx.media3.exoplayer.source.i.a
        public final void b() {
        }
    }

    static {
        nr10.a("media3.exoplayer.hls");
    }

    public HlsMediaSource(kr10 kr10Var, qfl qflVar, rfl rflVar, fz5 fz5Var, b bVar, androidx.media3.exoplayer.upstream.b bVar2, HlsPlaylistTracker hlsPlaylistTracker, long j, boolean z, int i) {
        this.s = kr10Var;
        this.q = kr10Var.d;
        this.i = qflVar;
        this.h = rflVar;
        this.j = fz5Var;
        this.k = bVar;
        this.l = bVar2;
        this.o = hlsPlaylistTracker;
        this.p = j;
        this.m = z;
        this.n = i;
    }

    @Nullable
    public static b.c u(long j, List list) {
        b.c cVar = null;
        for (int i = 0; i < list.size(); i++) {
            b.c cVar2 = (b.c) list.get(i);
            long j2 = cVar2.f;
            if (j2 > j || !cVar2.m) {
                if (j2 > j) {
                    break;
                }
            } else {
                cVar = cVar2;
            }
        }
        return cVar;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final synchronized kr10 f() {
        return this.s;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void h(h hVar) {
        j9v j9vVar = (j9v) hVar;
        j9vVar.c.x(j9vVar);
        for (r9v r9vVar : j9vVar.u) {
            if (r9vVar.E) {
                for (r9v.b bVar : r9vVar.w) {
                    bVar.k();
                    DrmSession drmSession = bVar.h;
                    if (drmSession != null) {
                        drmSession.b(bVar.e);
                        bVar.h = null;
                        bVar.g = null;
                    }
                }
            }
            b9v b9vVar = r9vVar.e;
            b9vVar.g.y(b9vVar.e[b9vVar.r.getSelectedIndexInTrackGroup()]);
            b9vVar.n = null;
            r9vVar.k.d(r9vVar);
            r9vVar.s.removeCallbacksAndMessages(null);
            r9vVar.I = true;
            r9vVar.t.clear();
        }
        j9vVar.r = null;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final synchronized void l(kr10 kr10Var) {
        this.s = kr10Var;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final h m(i.b bVar, xu1 xu1Var, long j) {
        j.a o = o(bVar);
        a.C0054a c0054a = new a.C0054a(this.d.c, 0, bVar);
        mjp0 mjp0Var = this.r;
        x1b0 x1b0Var = this.g;
        x1b0Var.getClass();
        return new j9v(this.h, this.o, this.i, mjp0Var, this.k, c0054a, this.l, o, xu1Var, this.j, this.m, this.n, x1b0Var);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void maybeThrowSourceInfoRefreshError() throws IOException {
        this.o.A();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void r(@Nullable mjp0 mjp0Var) {
        this.r = mjp0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        x1b0 x1b0Var = this.g;
        x1b0Var.getClass();
        androidx.media3.exoplayer.drm.b bVar = this.k;
        bVar.b(myLooper, x1b0Var);
        bVar.prepare();
        j.a o = o(null);
        kr10.f fVar = f().b;
        fVar.getClass();
        this.o.w(fVar.a, o, this);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void t() {
        this.o.stop();
        this.k.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(androidx.media3.exoplayer.hls.playlist.b bVar) {
        long j;
        zuj0 zuj0Var;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        boolean z2 = bVar.p;
        boolean z3 = bVar.g;
        ImmutableList immutableList = bVar.r;
        long j6 = bVar.u;
        long j7 = bVar.e;
        int i = bVar.d;
        long j8 = bVar.h;
        long j0 = z2 ? y2r0.j0(j8) : C.TIME_UNSET;
        long j9 = (i == 2 || i == 1) ? j0 : C.TIME_UNSET;
        HlsPlaylistTracker hlsPlaylistTracker = this.o;
        hlsPlaylistTracker.z().getClass();
        alk alkVar = new alk();
        long j10 = 0;
        if (hlsPlaylistTracker.v()) {
            b.g gVar = bVar.v;
            long C = j8 - hlsPlaylistTracker.C();
            boolean z4 = bVar.o;
            long j11 = z4 ? C + j6 : -9223372036854775807L;
            if (bVar.p) {
                z = z3;
                j2 = y2r0.S(y2r0.E(this.p)) - (j8 + j6);
            } else {
                z = z3;
                j2 = 0;
            }
            long j12 = this.q.a;
            if (j12 != C.TIME_UNSET) {
                j4 = y2r0.S(j12);
            } else {
                if (j7 != C.TIME_UNSET) {
                    j3 = j6 - j7;
                } else {
                    j3 = gVar.d;
                    if (j3 == C.TIME_UNSET || bVar.n == C.TIME_UNSET) {
                        j3 = gVar.c;
                        if (j3 == C.TIME_UNSET) {
                            j3 = 3 * bVar.m;
                        }
                    }
                }
                j4 = j3 + j2;
            }
            long j13 = j6 + j2;
            long k = y2r0.k(j4, j2, j13);
            kr10.e eVar = f().d;
            boolean z5 = eVar.d == -3.4028235E38f && eVar.e == -3.4028235E38f && gVar.c == C.TIME_UNSET && gVar.d == C.TIME_UNSET;
            kr10.e.a a = this.q.a();
            a.a = y2r0.j0(k);
            a.d = z5 ? 1.0f : this.q.d;
            a.e = z5 ? 1.0f : this.q.e;
            kr10.e eVar2 = new kr10.e(a);
            this.q = eVar2;
            if (j7 == C.TIME_UNSET) {
                j7 = j13 - y2r0.S(eVar2.a);
            }
            if (z) {
                j10 = j7;
            } else {
                b.c u = u(j7, bVar.s);
                if (u != null) {
                    j5 = u.f;
                } else if (!immutableList.isEmpty()) {
                    b.e eVar3 = (b.e) immutableList.get(y2r0.c(immutableList, Long.valueOf(j7), true));
                    b.c u2 = u(j7, eVar3.n);
                    j5 = u2 != null ? u2.f : eVar3.f;
                }
                j10 = j5;
            }
            zuj0Var = new zuj0(j9, j0, j11, bVar.u, C, j10, true, !z4, i == 2 && bVar.f, alkVar, f(), this.q);
        } else {
            if (j7 == C.TIME_UNSET || immutableList.isEmpty()) {
                j = 0;
            } else {
                if (!z3 && j7 != j6) {
                    j7 = ((b.e) immutableList.get(y2r0.c(immutableList, Long.valueOf(j7), true))).f;
                }
                j = j7;
            }
            long j14 = bVar.u;
            zuj0Var = new zuj0(j9, j0, j14, j14, 0L, j, true, false, true, alkVar, f(), null);
        }
        s(zuj0Var);
    }
}
