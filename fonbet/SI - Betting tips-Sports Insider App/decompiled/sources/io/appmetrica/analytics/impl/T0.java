package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class T0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f12895b;

    public T0(C0493t1 c0493t1, String str) {
        this.f12895b = c0493t1;
        this.f12894a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0642z0 c0642z0 = this.f12895b.f14654a;
        String str = this.f12894a;
        c0642z0.getClass();
        C0617y0.c().setUserProfileID(str);
    }
}
