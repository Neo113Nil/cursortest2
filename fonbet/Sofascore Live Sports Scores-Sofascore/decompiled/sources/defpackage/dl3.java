package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dl3 implements s0h, b0h {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final long m;

    public dl3(long j, long j2, int i, int i2, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        this.h = z2;
        if (j == -1) {
            this.d = -1L;
            this.f = C.TIME_UNSET;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = (Math.max(0L, j3) * 8000000) / i;
        }
        this.i = j2;
        this.j = i;
        this.k = i2;
        this.l = z;
        this.m = j == -1 ? -1L : j;
    }

    @Override // defpackage.s0h
    public final long a() {
        return this.m;
    }

    @Override // defpackage.b0h
    public final boolean b() {
        return this.h;
    }

    @Override // defpackage.s0h
    public final int c() {
        return this.j;
    }

    @Override // defpackage.b0h
    public final long getDurationUs() {
        return this.f;
    }

    @Override // defpackage.b0h
    public final zzg getSeekPoints(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1 && !this.g) {
            f0h f0hVar = new f0h(0L, j3);
            return new zzg(f0hVar, f0hVar);
        }
        int i = this.e;
        long j4 = this.c;
        long j5 = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            j5 = Math.min(j5, j2 - j4);
        }
        long max = Math.max(j5, 0L) + j3;
        long max2 = (Math.max(0L, max - j3) * 8000000) / i;
        f0h f0hVar2 = new f0h(max2, max);
        if (j2 != -1 && max2 < j) {
            long j6 = max + j4;
            if (j6 < this.a) {
                return new zzg(f0hVar2, new f0h((Math.max(0L, j6 - j3) * 8000000) / i, j6));
            }
        }
        return new zzg(f0hVar2, f0hVar2);
    }

    @Override // defpackage.s0h
    public final long getTimeUs(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / this.e;
    }

    @Override // defpackage.b0h
    public final boolean isSeekable() {
        return this.d != -1 || this.g;
    }
}
