package defpackage;

import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class op0 {
    public boolean A;
    public long B;
    public final j0l a;
    public final tqi b;
    public final long[] c;
    public final AudioTrack d;
    public final int e;
    public final long f;
    public final boolean g;
    public final fp0 h;
    public float i;
    public long j;
    public long k;
    public long l;
    public Method m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public op0(j0l j0lVar, tqi tqiVar, AudioTrack audioTrack, int i, int i2, int i3) {
        this.a = j0lVar;
        this.b = tqiVar;
        this.d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.c = new long[10];
        this.z = C.TIME_UNSET;
        this.y = C.TIME_UNSET;
        this.h = new fp0(audioTrack, j0lVar);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean P = nik.P(i);
        this.g = P;
        this.f = P ? nik.Z(sampleRate, i3 / i2) : -9223372036854775807L;
        this.q = 0L;
        this.r = 0L;
        this.A = false;
        this.B = 0L;
        this.u = C.TIME_UNSET;
        this.v = C.TIME_UNSET;
        this.o = 0L;
        this.n = 0L;
        this.i = 1.0f;
        this.j = C.TIME_UNSET;
    }

    public final long a() {
        if (this.u != C.TIME_UNSET) {
            return Math.min(this.x, c());
        }
        this.b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = r4.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.q <= 0 || playState != 3) {
                        this.v = C.TIME_UNSET;
                    } else if (this.v == C.TIME_UNSET) {
                        this.v = elapsedRealtime;
                    }
                }
                long j = this.q;
                if (j > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j;
                        this.A = false;
                    } else {
                        this.r++;
                    }
                }
                this.q = playbackHeadPosition;
            }
            this.p = elapsedRealtime;
        }
        return this.q + this.B + (this.r << 32);
    }

    public final long b(long j) {
        int i = this.t;
        int i2 = this.e;
        long max = Math.max(0L, (i == 0 ? this.u != C.TIME_UNSET ? nik.Z(i2, c()) : nik.Z(i2, a()) : nik.C(j + this.k, this.i)) - this.n);
        return this.u != C.TIME_UNSET ? Math.min(nik.Z(i2, this.x), max) : max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.w;
        }
        this.b.getClass();
        return this.w + nik.b0(nik.C(nik.T(SystemClock.elapsedRealtime()) - this.u, this.i), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j) {
        long j2 = this.j;
        if (j2 == C.TIME_UNSET || j < j2) {
            return;
        }
        long F = nik.F(j - j2, this.i);
        this.b.getClass();
        final long currentTimeMillis = System.currentTimeMillis() - nik.h0(F);
        this.j = C.TIME_UNSET;
        vdb vdbVar = ((lp0) this.a.b).i;
        vdbVar.getClass();
        if (Thread.currentThread() == ((Thread) vdbVar.c)) {
            vdbVar.g(-1, new qdb() { // from class: hp0
                @Override // defpackage.qdb
                public final void invoke(Object obj) {
                    d4a d4aVar;
                    in4 in4Var = (in4) obj;
                    pn4 pn4Var = in4Var.a;
                    if (in4Var == pn4Var.j && (d4aVar = pn4Var.n) != null) {
                        u2c u2cVar = (u2c) d4aVar.b;
                        u2cVar.S0 = true;
                        ro0 ro0Var = u2cVar.H0;
                        Handler handler = ro0Var.a;
                        if (handler != null) {
                            handler.post(new oo0(ro0Var, currentTimeMillis));
                        }
                    }
                }
            });
        }
    }
}
