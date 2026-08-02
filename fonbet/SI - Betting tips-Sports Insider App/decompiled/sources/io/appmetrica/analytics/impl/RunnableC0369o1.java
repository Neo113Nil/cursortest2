package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0369o1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f14380c;

    public RunnableC0369o1(C0493t1 c0493t1, String str, String str2) {
        this.f14380c = c0493t1;
        this.f14378a = str;
        this.f14379b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0493t1.a(this.f14380c).reportEvent(this.f14378a, this.f14379b);
    }
}
