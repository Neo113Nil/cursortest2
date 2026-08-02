package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class P1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0024ae f12718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0624y7 f12719b;

    public P1(R1 r12, C0624y7 c0624y7) {
        this.f12718a = r12;
        this.f12719b = c0624y7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12718a.consume(this.f12719b);
    }
}
