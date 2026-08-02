package androidx.media3.exoplayer.video;

import androidx.media3.common.a;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.a;
import androidx.media3.exoplayer.video.e;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import xsna.c300;
import xsna.dwo0;
import xsna.gv2;
import xsna.io20;
import xsna.mms0;
import xsna.wk;
import xsna.xgt0;
import xsna.y2r0;
import xsna.yr2;

/* compiled from: VideoFrameRenderControl.java */
/* loaded from: classes12.dex */
public final class f {
    public final a.C0067a a;
    public final e b;
    public final mms0 g;
    public long l;
    public final e.a c = new e.a();
    public final dwo0<xgt0> d = new dwo0<>();
    public final dwo0<Long> e = new dwo0<>();
    public final c300 f = new c300();
    public long h = C.TIME_UNSET;
    public xgt0 k = xgt0.d;
    public long i = C.TIME_UNSET;
    public long j = C.TIME_UNSET;

    public f(a.C0067a c0067a, e eVar, mms0 mms0Var) {
        this.a = c0067a;
        this.b = eVar;
        this.g = mms0Var;
    }

    public final void a(long j, long j2) throws ExoPlaybackException {
        a.C0067a c0067a = this.a;
        a aVar = a.this;
        while (true) {
            c300 c300Var = this.f;
            if (c300Var.c == 0) {
                return;
            }
            long b = c300Var.b();
            Long f = this.e.f(b);
            e eVar = this.b;
            if (f != null && f.longValue() != this.l) {
                this.l = f.longValue();
                eVar.e(2);
            }
            long j3 = this.l;
            e eVar2 = this.b;
            e.a aVar2 = this.c;
            int a = eVar2.a(b, j, j2, j3, false, false, aVar2);
            if (a != 5 && a != 4) {
                this.g.a(b, aVar2.a);
            }
            if (a == 0 || a == 1) {
                this.i = b;
                boolean z = a == 0;
                long c = c300Var.c();
                xgt0 f2 = this.d.f(c);
                if (f2 != null && !f2.equals(xgt0.d) && !f2.equals(this.k)) {
                    this.k = f2;
                    a.C0043a c0043a = new a.C0043a();
                    c0043a.t = f2.a;
                    c0043a.u = f2.b;
                    c0043a.m = io20.q("video/raw");
                    c0067a.a = new androidx.media3.common.a(c0043a);
                    aVar.i.execute(new yr2(3, c0067a, f2));
                }
                long nanoTime = z ? System.nanoTime() : aVar2.b;
                boolean z2 = eVar.e != 3;
                eVar.e = 3;
                eVar.g = y2r0.S(eVar.l.elapsedRealtime());
                if (z2 && aVar.e != null) {
                    aVar.i.execute(new wk(c0067a, 8));
                }
                androidx.media3.common.a aVar3 = c0067a.a;
                aVar.j.a(c, nanoTime, aVar3 == null ? new androidx.media3.common.a(new a.C0043a()) : aVar3, null);
                ((VideoSink.b) aVar.d.remove()).b(nanoTime);
            } else if (a == 2 || a == 3) {
                this.i = b;
                c300Var.c();
                aVar.i.execute(new gv2(c0067a, 6));
                ((VideoSink.b) aVar.d.remove()).a();
            } else {
                if (a != 4) {
                    if (a != 5) {
                        throw new IllegalStateException(String.valueOf(a));
                    }
                    return;
                }
                this.i = b;
            }
        }
    }
}
