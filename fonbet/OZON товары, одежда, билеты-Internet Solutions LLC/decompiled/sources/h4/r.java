package h4;

import m3.N;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final o f64944a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64945b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f64946c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f64947d;

    /* renamed from: e, reason: collision with root package name */
    public final int f64948e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f64949f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f64950g;

    /* renamed from: h, reason: collision with root package name */
    public final long f64951h;

    public r(o oVar, long[] jArr, int[] iArr, int i11, long[] jArr2, int[] iArr2, long j11) {
        G10.a.c(iArr.length == jArr2.length);
        G10.a.c(jArr.length == jArr2.length);
        G10.a.c(iArr2.length == jArr2.length);
        this.f64944a = oVar;
        this.f64946c = jArr;
        this.f64947d = iArr;
        this.f64948e = i11;
        this.f64949f = jArr2;
        this.f64950g = iArr2;
        this.f64951h = j11;
        this.f64945b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j11) {
        long[] jArr = this.f64949f;
        for (int a11 = N.a(jArr, j11, true); a11 < jArr.length; a11++) {
            if ((this.f64950g[a11] & 1) != 0) {
                return a11;
            }
        }
        return -1;
    }
}
