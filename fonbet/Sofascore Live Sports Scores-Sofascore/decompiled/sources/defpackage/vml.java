package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vml implements s0h {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public vml(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.s0h
    public final long a() {
        return this.f;
    }

    @Override // defpackage.s0h
    public final int c() {
        return this.d;
    }

    @Override // defpackage.b0h
    public final long getDurationUs() {
        return this.c;
    }

    @Override // defpackage.b0h
    public final zzg getSeekPoints(long j) {
        double d;
        double d2;
        boolean isSeekable = isSeekable();
        int i = this.b;
        long j2 = this.a;
        if (!isSeekable) {
            f0h f0hVar = new f0h(0L, j2 + i);
            return new zzg(f0hVar, f0hVar);
        }
        long k = nik.k(j, 0L, this.c);
        double d3 = (k * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j3 = this.e;
        f0h f0hVar2 = new f0h(k, j2 + nik.k(Math.round((d4 / d) * j3), i, j3 - 1));
        return new zzg(f0hVar2, f0hVar2);
    }

    @Override // defpackage.s0h
    public final long getTimeUs(long j) {
        long j2 = j - this.a;
        if (!isSeekable() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.e;
        int f = nik.f(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (f * j3) / 100;
        long j5 = jArr[f];
        int i = f + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (f == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.b0h
    public final boolean isSeekable() {
        return this.g != null;
    }
}
