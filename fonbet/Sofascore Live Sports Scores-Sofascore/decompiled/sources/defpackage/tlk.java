package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tlk implements s0h {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public tlk(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j3;
        this.e = i;
    }

    @Override // defpackage.s0h
    public final long a() {
        return this.d;
    }

    @Override // defpackage.s0h
    public final int c() {
        return this.e;
    }

    @Override // defpackage.b0h
    public final long getDurationUs() {
        return this.c;
    }

    @Override // defpackage.b0h
    public final zzg getSeekPoints(long j) {
        long[] jArr = this.a;
        int f = nik.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.b;
        f0h f0hVar = new f0h(j2, jArr2[f]);
        if (j2 >= j || f == jArr.length - 1) {
            return new zzg(f0hVar, f0hVar);
        }
        int i = f + 1;
        return new zzg(f0hVar, new f0h(jArr[i], jArr2[i]));
    }

    @Override // defpackage.s0h
    public final long getTimeUs(long j) {
        return this.a[nik.f(this.b, j, true)];
    }

    @Override // defpackage.b0h
    public final boolean isSeekable() {
        return true;
    }
}
