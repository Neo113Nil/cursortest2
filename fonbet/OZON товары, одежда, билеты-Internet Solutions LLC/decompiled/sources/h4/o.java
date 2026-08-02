package h4;

import j3.C7272n;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f64910a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64911b;

    /* renamed from: c, reason: collision with root package name */
    public final long f64912c;

    /* renamed from: d, reason: collision with root package name */
    public final long f64913d;

    /* renamed from: e, reason: collision with root package name */
    public final long f64914e;

    /* renamed from: f, reason: collision with root package name */
    public final long f64915f;

    /* renamed from: g, reason: collision with root package name */
    public final C7272n f64916g;

    /* renamed from: h, reason: collision with root package name */
    public final int f64917h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f64918i;

    /* renamed from: j, reason: collision with root package name */
    public final long[] f64919j;

    /* renamed from: k, reason: collision with root package name */
    public final int f64920k;

    /* renamed from: l, reason: collision with root package name */
    private final p[] f64921l;

    public o(int i11, int i12, long j11, long j12, long j13, long j14, C7272n c7272n, int i13, p[] pVarArr, int i14, long[] jArr, long[] jArr2) {
        this.f64910a = i11;
        this.f64911b = i12;
        this.f64912c = j11;
        this.f64913d = j12;
        this.f64914e = j13;
        this.f64915f = j14;
        this.f64916g = c7272n;
        this.f64917h = i13;
        this.f64921l = pVarArr;
        this.f64920k = i14;
        this.f64918i = jArr;
        this.f64919j = jArr2;
    }

    public final o a(C7272n c7272n) {
        return new o(this.f64910a, this.f64911b, this.f64912c, this.f64913d, this.f64914e, this.f64915f, c7272n, this.f64917h, this.f64921l, this.f64920k, this.f64918i, this.f64919j);
    }

    public final p b(int i11) {
        p[] pVarArr = this.f64921l;
        if (pVarArr == null) {
            return null;
        }
        return pVarArr[i11];
    }
}
