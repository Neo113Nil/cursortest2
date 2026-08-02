package io.appmetrica.analytics.screenshot.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15370a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f15371b;

    public j0(boolean z5, k0 k0Var) {
        this.f15370a = z5;
        this.f15371b = k0Var;
    }

    public final k0 a() {
        return this.f15371b;
    }

    public final boolean b() {
        return this.f15370a;
    }

    public final String toString() {
        return "ServiceSideRemoteScreenshotConfig(enabled=" + this.f15370a + ", config=" + this.f15371b + ')';
    }

    public j0() {
        this(new J());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(J j) {
        this(r0, r3 != null ? new k0(r3) : null);
        boolean b10 = j.b();
        W a7 = j.a();
    }
}
