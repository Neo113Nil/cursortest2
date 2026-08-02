package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wsj {
    public final isj a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public wsj(isj isjVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        qx9.r(iArr.length == jArr2.length);
        qx9.r(jArr.length == jArr2.length);
        qx9.r(iArr2.length == jArr2.length);
        this.a = isjVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        for (int b = lik.b(jArr, j, true); b < jArr.length; b++) {
            if ((this.g[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
