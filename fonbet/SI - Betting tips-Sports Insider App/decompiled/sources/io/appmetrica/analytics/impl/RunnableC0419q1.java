package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0419q1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f14500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f14501c;

    public RunnableC0419q1(C0493t1 c0493t1, String str, Throwable th2) {
        this.f14501c = c0493t1;
        this.f14499a = str;
        this.f14500b = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0493t1.a(this.f14501c).reportError(this.f14499a, this.f14500b);
    }
}
