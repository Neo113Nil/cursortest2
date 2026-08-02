package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xq4 {
    public final zz0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public int g;
    public boolean h;

    public xq4() {
        zz0 zz0Var = new zz0(4, false);
        zz0Var.d = 0;
        zz0Var.e = new zo[100];
        a(2500, 0, "bufferForPlaybackMs", "0");
        a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 2500, "minBufferMs", "bufferForPlaybackMs");
        a(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = zz0Var;
        long y = lik.y(50000L);
        this.b = y;
        this.c = y;
        this.d = lik.y(2500L);
        this.e = lik.y(5000L);
        this.g = C.DEFAULT_VIDEO_BUFFER_SIZE;
        this.f = lik.y(0L);
    }

    public static void a(int i, int i2, String str, String str2) {
        qx9.q(str + " cannot be less than " + str2, i >= i2);
    }

    public final void b(boolean z) {
        this.g = C.DEFAULT_VIDEO_BUFFER_SIZE;
        this.h = false;
        if (z) {
            zz0 zz0Var = this.a;
            synchronized (zz0Var) {
                zz0Var.a0(0);
            }
        }
    }

    public final boolean c(long j, float f) {
        int i;
        long j2 = this.c;
        zz0 zz0Var = this.a;
        synchronized (zz0Var) {
            i = zz0Var.c * C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        boolean z = i >= this.g;
        long j3 = this.b;
        if (f > 1.0f) {
            j3 = Math.min(lik.n(j3, f), j2);
        }
        if (j < Math.max(j3, 500000L)) {
            this.h = !z;
            if (z && j < 500000) {
                m6k.f0();
            }
        } else if (j >= j2 || z) {
            this.h = false;
        }
        return this.h;
    }
}
