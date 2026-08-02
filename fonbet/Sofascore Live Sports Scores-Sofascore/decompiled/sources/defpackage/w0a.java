package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class w0a implements a0h {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public w0a(long[] jArr, long[] jArr2, long j) {
        qx9.r(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.c = j;
    }

    @Override // defpackage.a0h
    public final long getDurationUs() {
        return this.c;
    }

    @Override // defpackage.a0h
    public final yzg getSeekPoints(long j) {
        if (!this.d) {
            e0h e0hVar = e0h.c;
            return new yzg(e0hVar, e0hVar);
        }
        long[] jArr = this.b;
        int e = lik.e(jArr, j, true);
        long j2 = jArr[e];
        long[] jArr2 = this.a;
        e0h e0hVar2 = new e0h(j2, jArr2[e]);
        if (j2 == j || e == jArr.length - 1) {
            return new yzg(e0hVar2, e0hVar2);
        }
        int i = e + 1;
        return new yzg(e0hVar2, new e0h(jArr[i], jArr2[i]));
    }

    @Override // defpackage.a0h
    public final boolean isSeekable() {
        return this.d;
    }
}
