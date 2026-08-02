package org.chromium.net.impl;

/* loaded from: classes6.dex */
public final class Y extends org.chromium.net.v {

    /* renamed from: a, reason: collision with root package name */
    private final int f78896a;

    /* renamed from: b, reason: collision with root package name */
    private final int f78897b;

    /* renamed from: c, reason: collision with root package name */
    private final W f78898c;

    public Y(String str, int i11, int i12, int i13, int i14) {
        super(str, null);
        this.f78898c = new W(str, i11, i12);
        this.f78896a = i13;
        this.f78897b = i14;
    }

    @Override // org.chromium.net.r
    public final int a() {
        return this.f78898c.f78894a;
    }

    public final int b() {
        return this.f78897b;
    }

    public final int d() {
        return this.f78898c.f78895b;
    }

    public final int e() {
        return this.f78896a;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f78898c.getMessage() + ", QuicDetailedErrorCode=" + this.f78896a + ", Source=" + this.f78897b;
    }
}
