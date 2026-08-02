package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0468s1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f14608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f14609b;

    public RunnableC0468s1(C0493t1 c0493t1, Throwable th2) {
        this.f14609b = c0493t1;
        this.f14608a = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0493t1.a(this.f14609b).reportUnhandledException(this.f14608a);
    }
}
