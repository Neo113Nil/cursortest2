package io.appmetrica.analytics.screenshot.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final C0670e f15333a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f15334b;

    /* renamed from: c, reason: collision with root package name */
    public final C0681p f15335c;

    public W(C0670e c0670e, a0 a0Var, C0681p c0681p) {
        this.f15333a = c0670e;
        this.f15334b = a0Var;
        this.f15335c = c0681p;
    }

    public final C0670e a() {
        return this.f15333a;
    }

    public final C0681p b() {
        return this.f15335c;
    }

    public final a0 c() {
        return this.f15334b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.f15333a + ", serviceCaptorConfig=" + this.f15334b + ", contentObserverCaptorConfig=" + this.f15335c + ')';
    }

    public W() {
        this(new C0670e(), new a0(), new C0681p());
    }
}
