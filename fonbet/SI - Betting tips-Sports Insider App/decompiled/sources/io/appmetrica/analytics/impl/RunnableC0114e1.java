package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0114e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f13634b;

    public RunnableC0114e1(C0493t1 c0493t1, String str) {
        this.f13634b = c0493t1;
        this.f13633a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0493t1.a(this.f13634b).b(this.f13633a);
    }
}
