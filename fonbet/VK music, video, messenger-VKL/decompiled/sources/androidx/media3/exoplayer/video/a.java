package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import xsna.c300;
import xsna.dvf;
import xsna.dwo0;
import xsna.frl;
import xsna.fxc0;
import xsna.gms0;
import xsna.grl;
import xsna.jxj0;
import xsna.kv3;
import xsna.kzm;
import xsna.mms0;
import xsna.nms0;
import xsna.p8p;
import xsna.xgt0;

/* compiled from: DefaultVideoSink.java */
/* loaded from: classes12.dex */
public final class a implements VideoSink {
    public final e a;
    public final mms0 b;
    public final f c;
    public final ArrayDeque d;

    @Nullable
    public Surface e;
    public androidx.media3.common.a f;
    public long g;
    public VideoSink.a h;
    public Executor i;
    public gms0 j;

    /* compiled from: DefaultVideoSink.java */
    /* renamed from: androidx.media3.exoplayer.video.a$a, reason: collision with other inner class name */
    public final class C0067a {
        public androidx.media3.common.a a;

        public C0067a() {
        }
    }

    public a(e eVar, mms0 mms0Var, dvf dvfVar) {
        this.a = eVar;
        this.b = mms0Var;
        eVar.l = dvfVar;
        this.c = new f(new C0067a(), eVar, mms0Var);
        this.d = new ArrayDeque();
        this.f = new androidx.media3.common.a(new a.C0043a());
        this.g = C.TIME_UNSET;
        this.h = VideoSink.a.a;
        this.i = new frl();
        this.j = new grl();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final Surface b() {
        Surface surface = this.e;
        surface.getClass();
        return surface;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void f() {
        f fVar = this.c;
        if (fVar.h == C.TIME_UNSET) {
            fVar.h = Long.MIN_VALUE;
            fVar.i = Long.MIN_VALUE;
        }
        fVar.j = fVar.h;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean g(androidx.media3.common.a aVar) {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void h() {
        this.b.b();
        e eVar = this.a;
        eVar.d = false;
        eVar.i = C.TIME_UNSET;
        nms0 nms0Var = eVar.b;
        nms0Var.d = false;
        nms0.a aVar = nms0Var.c;
        if (aVar != null) {
            aVar.b();
        }
        nms0Var.a();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void i(int i) {
        nms0 nms0Var = this.a.b;
        if (nms0Var.j == i) {
            return;
        }
        nms0Var.j = i;
        nms0Var.d(true);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean isEnded() {
        f fVar = this.c;
        long j = fVar.j;
        return j != C.TIME_UNSET && fVar.i == j;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean isInitialized() {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void j(b bVar, kzm kzmVar) {
        this.h = bVar;
        this.i = kzmVar;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean k(long j, VideoSink.b bVar) {
        this.d.add(bVar);
        f fVar = this.c;
        fVar.f.a(j);
        fVar.h = j;
        fVar.j = C.TIME_UNSET;
        this.i.execute(new kv3(this, 7));
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void l(gms0 gms0Var) {
        this.j = gms0Var;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void m(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void n(int i, long j, androidx.media3.common.a aVar, List list) {
        fxc0.z(list.isEmpty());
        int i2 = aVar.u;
        int i3 = aVar.v;
        androidx.media3.common.a aVar2 = this.f;
        int i4 = aVar2.u;
        f fVar = this.c;
        if (i2 != i4 || i3 != aVar2.v) {
            dwo0<xgt0> dwo0Var = fVar.d;
            long j2 = fVar.h;
            dwo0Var.a(j2 == C.TIME_UNSET ? 0L : j2 + 1, new xgt0(i2, i3));
        }
        float f = aVar.y;
        if (f != this.f.y) {
            this.a.f(f);
        }
        this.f = aVar;
        if (j != this.g) {
            if (fVar.f.c == 0) {
                fVar.b.e(i);
                fVar.l = j;
            } else {
                dwo0<Long> dwo0Var2 = fVar.e;
                long j3 = fVar.h;
                dwo0Var2.a(j3 == C.TIME_UNSET ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.g = j;
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void o(boolean z) {
        this.a.c(z);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void p() {
        e eVar = this.a;
        if (eVar.e == 0) {
            eVar.e = 1;
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void q() {
        this.b.b();
        this.a.d();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void r(List<p8p> list) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void render(long j, long j2) throws VideoSink.VideoSinkException {
        try {
            this.c.a(j, j2);
        } catch (ExoPlaybackException e) {
            throw new VideoSink.VideoSinkException(e, this.f);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean s(boolean z) {
        return this.a.b(z);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void setPlaybackSpeed(float f) {
        this.a.h(f);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void t() {
        this.e = null;
        this.a.g(null);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void u(boolean z) {
        if (z) {
            e eVar = this.a;
            eVar.b.b();
            eVar.h = C.TIME_UNSET;
            eVar.f = C.TIME_UNSET;
            eVar.e = Math.min(eVar.e, 1);
            eVar.i = C.TIME_UNSET;
        }
        this.b.b();
        f fVar = this.c;
        dwo0<xgt0> dwo0Var = fVar.d;
        c300 c300Var = fVar.f;
        c300Var.a = 0;
        c300Var.b = -1;
        c300Var.c = 0;
        fVar.h = C.TIME_UNSET;
        fVar.i = C.TIME_UNSET;
        fVar.j = C.TIME_UNSET;
        dwo0<Long> dwo0Var2 = fVar.e;
        if (dwo0Var2.h() > 0) {
            fxc0.p(dwo0Var2.h() > 0);
            while (dwo0Var2.h() > 1) {
                dwo0Var2.e();
            }
            Long e = dwo0Var2.e();
            e.getClass();
            fVar.l = e.longValue();
        }
        if (dwo0Var.h() > 0) {
            fxc0.p(dwo0Var.h() > 0);
            while (dwo0Var.h() > 1) {
                dwo0Var.e();
            }
            xgt0 e2 = dwo0Var.e();
            e2.getClass();
            dwo0Var.a(0L, e2);
        }
        this.d.clear();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void v(Surface surface, jxj0 jxj0Var) {
        this.e = surface;
        this.a.g(surface);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void release() {
    }
}
