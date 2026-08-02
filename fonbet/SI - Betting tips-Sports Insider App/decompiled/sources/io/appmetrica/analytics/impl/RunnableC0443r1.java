package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0443r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f14538c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f14539d;

    public RunnableC0443r1(C0493t1 c0493t1, String str, String str2, Throwable th2) {
        this.f14539d = c0493t1;
        this.f14536a = str;
        this.f14537b = str2;
        this.f14538c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0493t1.a(this.f14539d).reportError(this.f14536a, this.f14537b, this.f14538c);
    }
}
