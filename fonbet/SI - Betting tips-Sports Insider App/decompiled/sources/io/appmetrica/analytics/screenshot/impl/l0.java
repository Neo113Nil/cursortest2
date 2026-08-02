package io.appmetrica.analytics.screenshot.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15380a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15381b;

    public l0(boolean z5, long j) {
        this.f15380a = z5;
        this.f15381b = j;
    }

    public final long a() {
        return this.f15381b;
    }

    public final boolean b() {
        return this.f15380a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceSideServiceCaptorConfig(enabled=");
        sb2.append(this.f15380a);
        sb2.append(", delaySeconds=");
        return d9.e.j(sb2, this.f15381b, ')');
    }

    public l0(a0 a0Var) {
        this(a0Var.b(), a0Var.a());
    }
}
