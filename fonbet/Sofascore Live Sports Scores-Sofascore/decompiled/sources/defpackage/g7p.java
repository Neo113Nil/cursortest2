package defpackage;

import android.media.AudioTrack;
import android.os.Build;
import com.google.android.gms.internal.ads.zzdp;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zztd;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class g7p {
    public final fjn a;
    public final zzdp b;
    public final long[] c;
    public final AudioTrack d;
    public final int e;
    public final long f;
    public final boolean g;
    public final fp0 h;
    public final float i;
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

    public g7p(fjn fjnVar, zzdp zzdpVar, AudioTrack audioTrack, int i, int i2, int i3) {
        this.a = fjnVar;
        this.b = zzdpVar;
        this.d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.c = new long[10];
        this.z = C.TIME_UNSET;
        this.y = C.TIME_UNSET;
        this.h = new fp0(audioTrack, fjnVar);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean d = zzfm.d(i);
        this.g = d;
        this.f = d ? zzfm.v(sampleRate, i3 / i2) : -9223372036854775807L;
        this.q = 0L;
        this.r = 0L;
        this.u = C.TIME_UNSET;
        this.v = C.TIME_UNSET;
        this.o = 0L;
        this.n = 0L;
        this.i = 1.0f;
        this.j = C.TIME_UNSET;
    }

    public final void a(long j) {
        long j2 = this.j;
        if (j2 == C.TIME_UNSET || j < j2) {
            return;
        }
        long j3 = j - j2;
        String str = zzfm.a;
        float f = this.i;
        if (f != 1.0f) {
            j3 = Math.round(j3 / f);
        }
        long zza = this.b.zza() - zzfm.t(j3);
        this.j = C.TIME_UNSET;
        zzeg zzegVar = ((zztd) this.a.b).i;
        zzegVar.getClass();
        if (Thread.currentThread() == zzegVar.a) {
            b78 b78Var = new b78();
            b78Var.a = zza;
            zzegVar.c(-1, b78Var);
            zzegVar.d();
        }
    }

    public final long b(long j) {
        int i = this.t;
        int i2 = this.e;
        long max = Math.max(0L, (i == 0 ? this.u != C.TIME_UNSET ? zzfm.v(i2, d()) : zzfm.v(i2, c()) : zzfm.y(j + this.k, this.i)) - this.n);
        return this.u != C.TIME_UNSET ? Math.min(zzfm.v(i2, this.x), max) : max;
    }

    public final long c() {
        if (this.u != C.TIME_UNSET) {
            return Math.min(this.x, d());
        }
        long zzb = this.b.zzb();
        if (zzb - this.p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = r4.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.q <= 0 || playState != 3) {
                        this.v = C.TIME_UNSET;
                    } else if (this.v == C.TIME_UNSET) {
                        this.v = zzb;
                    }
                }
                if (this.q > playbackHeadPosition) {
                    this.r++;
                }
                this.q = playbackHeadPosition;
            }
            this.p = zzb;
        }
        return this.q + (this.r << 32);
    }

    public final long d() {
        if (this.d.getPlayState() == 2) {
            return this.w;
        }
        return this.w + zzfm.w(zzfm.y(zzfm.u(this.b.zzb()) - this.u, this.i), this.e, 1000000L, RoundingMode.UP);
    }
}
