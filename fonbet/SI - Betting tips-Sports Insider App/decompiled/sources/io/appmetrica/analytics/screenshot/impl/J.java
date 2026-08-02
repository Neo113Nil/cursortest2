package io.appmetrica.analytics.screenshot.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15310a;

    /* renamed from: b, reason: collision with root package name */
    public final W f15311b;

    public J(boolean z5, W w10) {
        this.f15310a = z5;
        this.f15311b = w10;
    }

    public final W a() {
        return this.f15311b;
    }

    public final boolean b() {
        return this.f15310a;
    }

    public final String toString() {
        return "RemoteScreenshotConfig(enabled=" + this.f15310a + ", config=" + this.f15311b + ')';
    }

    public J() {
        this(new S().f15330a, new W());
    }
}
