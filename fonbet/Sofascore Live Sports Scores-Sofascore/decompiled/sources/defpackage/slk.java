package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class slk implements r0h {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public slk(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.r0h
    public final long a() {
        return this.d;
    }

    @Override // defpackage.a0h
    public final long getDurationUs() {
        return this.c;
    }

    @Override // defpackage.a0h
    public final yzg getSeekPoints(long j) {
        long[] jArr = this.a;
        int e = lik.e(jArr, j, true);
        long j2 = jArr[e];
        long[] jArr2 = this.b;
        e0h e0hVar = new e0h(j2, jArr2[e]);
        if (j2 >= j || e == jArr.length - 1) {
            return new yzg(e0hVar, e0hVar);
        }
        int i = e + 1;
        return new yzg(e0hVar, new e0h(jArr[i], jArr2[i]));
    }

    @Override // defpackage.r0h
    public final long getTimeUs(long j) {
        return this.a[lik.e(this.b, j, true)];
    }

    @Override // defpackage.a0h
    public final boolean isSeekable() {
        return true;
    }
}
