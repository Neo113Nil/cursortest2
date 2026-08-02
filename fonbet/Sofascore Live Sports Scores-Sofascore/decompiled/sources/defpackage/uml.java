package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class uml implements r0h {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public uml(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.r0h
    public final long a() {
        return this.e;
    }

    @Override // defpackage.a0h
    public final long getDurationUs() {
        return this.c;
    }

    @Override // defpackage.a0h
    public final yzg getSeekPoints(long j) {
        double d;
        double d2;
        boolean isSeekable = isSeekable();
        int i = this.b;
        long j2 = this.a;
        if (!isSeekable) {
            e0h e0hVar = new e0h(0L, j2 + i);
            return new yzg(e0hVar, e0hVar);
        }
        long i2 = lik.i(j, 0L, this.c);
        double d3 = (i2 * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i3 = (int) d3;
            long[] jArr = this.f;
            qx9.u(jArr);
            double d5 = jArr[i3];
            if (i3 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i3 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i3)) + d5;
        }
        long j3 = this.d;
        e0h e0hVar2 = new e0h(i2, j2 + lik.i(Math.round((d4 / d) * j3), i, j3 - 1));
        return new yzg(e0hVar2, e0hVar2);
    }

    @Override // defpackage.r0h
    public final long getTimeUs(long j) {
        long j2 = j - this.a;
        if (!isSeekable() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.f;
        qx9.u(jArr);
        double d = (j2 * 256.0d) / this.d;
        int e = lik.e(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (e * j3) / 100;
        long j5 = jArr[e];
        int i = e + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (e == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.a0h
    public final boolean isSeekable() {
        return this.f != null;
    }
}
