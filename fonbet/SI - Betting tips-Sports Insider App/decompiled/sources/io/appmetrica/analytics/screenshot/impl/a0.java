package io.appmetrica.analytics.screenshot.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15347a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15348b;

    public a0(boolean z5, long j) {
        this.f15347a = z5;
        this.f15348b = j;
    }

    public final long a() {
        return this.f15348b;
    }

    public final boolean b() {
        return this.f15347a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceCaptorConfig(enabled=");
        sb2.append(this.f15347a);
        sb2.append(", delaySeconds=");
        return d9.e.j(sb2, this.f15348b, ')');
    }

    public a0() {
        this(new P().f15323a, new P().f15324b);
    }
}
