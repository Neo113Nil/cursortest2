package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0140f1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f13716c;

    public RunnableC0140f1(C0493t1 c0493t1, String str, String str2) {
        this.f13716c = c0493t1;
        this.f13714a = str;
        this.f13715b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0642z0 c0642z0 = this.f13716c.f14654a;
        String str = this.f13714a;
        String str2 = this.f13715b;
        c0642z0.getClass();
        C0617y0.c().putAppEnvironmentValue(str, str2);
    }
}
