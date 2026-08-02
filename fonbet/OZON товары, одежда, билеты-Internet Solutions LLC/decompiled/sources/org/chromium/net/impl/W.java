package org.chromium.net.impl;

/* loaded from: classes6.dex */
public class W extends org.chromium.net.r {

    /* renamed from: a, reason: collision with root package name */
    protected final int f78894a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f78895b;

    public W(String str, int i11, int i12) {
        super(str, null);
        this.f78894a = i11;
        this.f78895b = i12;
    }

    @Override // org.chromium.net.r
    public final int a() {
        return this.f78894a;
    }

    public boolean b() {
        int i11 = this.f78894a;
        return i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 8;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder(super.getMessage());
        sb2.append(", ErrorCode=");
        sb2.append(this.f78894a);
        int i11 = this.f78895b;
        if (i11 != 0) {
            sb2.append(", InternalErrorCode=");
            sb2.append(i11);
        }
        sb2.append(", Retryable=");
        sb2.append(b());
        return sb2.toString();
    }
}
