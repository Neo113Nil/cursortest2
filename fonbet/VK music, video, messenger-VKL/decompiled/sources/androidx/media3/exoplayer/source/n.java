package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.l;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import xsna.b630;
import xsna.das;
import xsna.do8;
import xsna.ewo0;
import xsna.fxc0;
import xsna.kr10;
import xsna.mjp0;
import xsna.n3i0;
import xsna.qdl;
import xsna.tgq;
import xsna.uel;
import xsna.x1b0;
import xsna.xu1;
import xsna.y2r0;
import xsna.ylo;
import xsna.zuj0;

/* compiled from: ProgressiveMediaSource.java */
/* loaded from: classes12.dex */
public final class n extends androidx.media3.exoplayer.source.a {
    public final a.InterfaceC0045a h;
    public final l.a i;
    public final androidx.media3.exoplayer.drm.b j;
    public final androidx.media3.exoplayer.upstream.b k;
    public final int l;

    @Nullable
    public final androidx.media3.common.a m;
    public boolean n;
    public long o;
    public boolean p;
    public boolean q;
    public boolean r;

    @Nullable
    public mjp0 s;
    public kr10 t;

    @Nullable
    public DownloadHelper.e u;

    /* compiled from: ProgressiveMediaSource.java */
    public class a extends das {
        @Override // xsna.das, xsna.ewo0
        public final ewo0.b f(int i, ewo0.b bVar, boolean z) {
            super.f(i, bVar, z);
            bVar.f = true;
            return bVar;
        }

        @Override // xsna.das, xsna.ewo0
        public final ewo0.c m(int i, ewo0.c cVar, long j) {
            super.m(i, cVar, j);
            cVar.k = true;
            return cVar;
        }
    }

    /* compiled from: ProgressiveMediaSource.java */
    public static final class b implements i.a {
        public final a.InterfaceC0045a a;
        public final b630 b;
        public ylo c;
        public androidx.media3.exoplayer.upstream.b d;
        public final int e;

        public b(a.InterfaceC0045a interfaceC0045a) {
            this(interfaceC0045a, new uel());
        }

        @Override // androidx.media3.exoplayer.source.i.a
        public final i d(kr10 kr10Var) {
            kr10Var.b.getClass();
            return new n(kr10Var, this.a, this.b, this.c.a(kr10Var), this.d, this.e, null);
        }

        @Override // androidx.media3.exoplayer.source.i.a
        public final i.a e(ylo yloVar) {
            fxc0.t(yloVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            this.c = yloVar;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.i.a
        public final i.a f(androidx.media3.exoplayer.upstream.b bVar) {
            fxc0.t(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            this.d = bVar;
            return this;
        }

        public b(a.InterfaceC0045a interfaceC0045a, tgq tgqVar) {
            b630 b630Var = new b630(tgqVar, 8);
            qdl qdlVar = new qdl();
            androidx.media3.exoplayer.upstream.a aVar = new androidx.media3.exoplayer.upstream.a();
            this.a = interfaceC0045a;
            this.b = b630Var;
            this.c = qdlVar;
            this.d = aVar;
            this.e = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        }
    }

    public n() {
        throw null;
    }

    public n(kr10 kr10Var, a.InterfaceC0045a interfaceC0045a, b630 b630Var, androidx.media3.exoplayer.drm.b bVar, androidx.media3.exoplayer.upstream.b bVar2, int i, androidx.media3.common.a aVar) {
        this.t = kr10Var;
        this.h = interfaceC0045a;
        this.i = b630Var;
        this.j = bVar;
        this.k = bVar2;
        this.l = i;
        this.m = aVar;
        this.n = true;
        this.o = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final synchronized kr10 f() {
        return this.t;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void h(h hVar) {
        m mVar = (m) hVar;
        if (mVar.z) {
            for (p pVar : mVar.w) {
                pVar.k();
                DrmSession drmSession = pVar.h;
                if (drmSession != null) {
                    drmSession.b(pVar.e);
                    pVar.h = null;
                    pVar.g = null;
                }
            }
        }
        mVar.n.d(mVar);
        mVar.s.removeCallbacksAndMessages(null);
        mVar.t = null;
        mVar.R = true;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final synchronized void l(kr10 kr10Var) {
        this.t = kr10Var;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final h m(i.b bVar, xu1 xu1Var, long j) {
        androidx.media3.datasource.a createDataSource = this.h.createDataSource();
        mjp0 mjp0Var = this.s;
        if (mjp0Var != null) {
            createDataSource.addTransferListener(mjp0Var);
        }
        kr10.f fVar = f().b;
        fVar.getClass();
        Uri uri = fVar.a;
        this.g.getClass();
        return new m(uri, createDataSource, new do8((tgq) ((b630) this.i).c), this.j, new a.C0054a(this.d.c, 0, bVar), this.k, o(bVar), this, xu1Var, fVar.d, this.l, this.m, y2r0.S(fVar.f), null);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void r(@Nullable mjp0 mjp0Var) {
        this.s = mjp0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        x1b0 x1b0Var = this.g;
        x1b0Var.getClass();
        androidx.media3.exoplayer.drm.b bVar = this.j;
        bVar.b(myLooper, x1b0Var);
        bVar.prepare();
        u();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void t() {
        this.j.release();
    }

    public final void u() {
        long j = this.o;
        boolean z = this.p;
        boolean z2 = this.q;
        kr10 f = f();
        ewo0 zuj0Var = new zuj0(C.TIME_UNSET, C.TIME_UNSET, j, j, 0L, 0L, z, false, false, null, f, z2 ? f.d : null);
        if (this.n) {
            zuj0Var = new a(zuj0Var);
        }
        s(zuj0Var);
    }

    public final void v(long j, n3i0 n3i0Var, boolean z) {
        if (this.r && n3i0Var.c()) {
            return;
        }
        this.r = !n3i0Var.c();
        if (j == C.TIME_UNSET) {
            j = this.o;
        }
        boolean isSeekable = n3i0Var.isSeekable();
        if (!this.n && this.o == j && this.p == isSeekable && this.q == z) {
            return;
        }
        this.o = j;
        this.p = isSeekable;
        this.q = z;
        this.n = false;
        u();
        DownloadHelper.e eVar = this.u;
        if (eVar != null) {
            eVar.j = n3i0Var;
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void maybeThrowSourceInfoRefreshError() {
    }
}
