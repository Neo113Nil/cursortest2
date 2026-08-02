package defpackage;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lvb implements w6c, u6c {
    public final scc a;
    public final long b;
    public final l2a c;
    public vcc d;
    public w6c e;
    public u6c f;
    public f4a g;
    public boolean h;
    public long i = C.TIME_UNSET;

    public lvb(scc sccVar, l2a l2aVar, long j) {
        this.a = sccVar;
        this.c = l2aVar;
        this.b = j;
    }

    @Override // defpackage.w6c
    public final long a(nh6[] nh6VarArr, boolean[] zArr, jpg[] jpgVarArr, boolean[] zArr2, long j) {
        long j2 = this.i;
        if (j2 != C.TIME_UNSET && j == this.b) {
            j = j2;
        }
        this.i = C.TIME_UNSET;
        w6c w6cVar = this.e;
        String str = nik.a;
        return w6cVar.a(nh6VarArr, zArr, jpgVarArr, zArr2, j);
    }

    @Override // defpackage.y4h
    public final void b(a5h a5hVar) {
        u6c u6cVar = this.f;
        String str = nik.a;
        u6cVar.b(this);
    }

    @Override // defpackage.w6c
    public final long c(long j, d0h d0hVar) {
        w6c w6cVar = this.e;
        String str = nik.a;
        return w6cVar.c(j, d0hVar);
    }

    @Override // defpackage.u6c
    public final void d(w6c w6cVar) {
        u6c u6cVar = this.f;
        String str = nik.a;
        u6cVar.d(this);
        f4a f4aVar = this.g;
        if (f4aVar != null) {
            ((wk) f4aVar.c).r.post(new r0(3, f4aVar, this.a));
        }
    }

    @Override // defpackage.w6c
    public final void discardBuffer(long j, boolean z) {
        w6c w6cVar = this.e;
        String str = nik.a;
        w6cVar.discardBuffer(j, z);
    }

    public final void e(scc sccVar) {
        long j = this.i;
        if (j == C.TIME_UNSET) {
            j = this.b;
        }
        vcc vccVar = this.d;
        vccVar.getClass();
        w6c c = vccVar.c(sccVar, this.c, j);
        this.e = c;
        if (this.f != null) {
            c.f(this, j);
        }
    }

    @Override // defpackage.w6c
    public final void f(u6c u6cVar, long j) {
        this.f = u6cVar;
        w6c w6cVar = this.e;
        if (w6cVar != null) {
            long j2 = this.i;
            if (j2 == C.TIME_UNSET) {
                j2 = this.b;
            }
            w6cVar.f(this, j2);
        }
    }

    @Override // defpackage.a5h
    public final boolean g(mgb mgbVar) {
        w6c w6cVar = this.e;
        return w6cVar != null && w6cVar.g(mgbVar);
    }

    @Override // defpackage.a5h
    public final long getBufferedPositionUs() {
        w6c w6cVar = this.e;
        String str = nik.a;
        return w6cVar.getBufferedPositionUs();
    }

    @Override // defpackage.a5h
    public final long getNextLoadPositionUs() {
        w6c w6cVar = this.e;
        String str = nik.a;
        return w6cVar.getNextLoadPositionUs();
    }

    @Override // defpackage.w6c
    public final qsj getTrackGroups() {
        w6c w6cVar = this.e;
        String str = nik.a;
        return w6cVar.getTrackGroups();
    }

    public final void h() {
        if (this.e != null) {
            vcc vccVar = this.d;
            vccVar.getClass();
            vccVar.f(this.e);
        }
    }

    public final void i(vcc vccVar) {
        z1a.E(this.d == null);
        this.d = vccVar;
    }

    @Override // defpackage.a5h
    public final boolean isLoading() {
        w6c w6cVar = this.e;
        return w6cVar != null && w6cVar.isLoading();
    }

    @Override // defpackage.w6c
    public final void maybeThrowPrepareError() {
        try {
            w6c w6cVar = this.e;
            if (w6cVar != null) {
                w6cVar.maybeThrowPrepareError();
                return;
            }
            vcc vccVar = this.d;
            if (vccVar != null) {
                vccVar.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e) {
            f4a f4aVar = this.g;
            if (f4aVar == null) {
                throw e;
            }
            if (this.h) {
                return;
            }
            this.h = true;
            wk wkVar = (wk) f4aVar.c;
            scc sccVar = this.a;
            b10 g = wkVar.g(sccVar);
            lfb.g.getAndIncrement();
            v5c v5cVar = ((h6c) f4aVar.b).b;
            v5cVar.getClass();
            g.x(new lfb(new xe4(v5cVar.a), SystemClock.elapsedRealtime()), 6, new jz2(e), true);
            wkVar.r.post(new p3(1, f4aVar, sccVar, e));
        }
    }

    @Override // defpackage.w6c
    public final long readDiscontinuity() {
        w6c w6cVar = this.e;
        String str = nik.a;
        return w6cVar.readDiscontinuity();
    }

    @Override // defpackage.a5h
    public final void reevaluateBuffer(long j) {
        w6c w6cVar = this.e;
        String str = nik.a;
        w6cVar.reevaluateBuffer(j);
    }

    @Override // defpackage.w6c
    public final long seekToUs(long j) {
        w6c w6cVar = this.e;
        String str = nik.a;
        return w6cVar.seekToUs(j);
    }
}
