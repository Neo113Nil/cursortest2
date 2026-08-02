package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0106di implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0183gi f13595a;

    public RunnableC0106di(C0183gi c0183gi) {
        this.f13595a = c0183gi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0183gi c0183gi = this.f13595a;
        C0183gi.a(c0183gi.f13834a, c0183gi.f13837d, c0183gi.f13838e).clearAppEnvironment();
    }
}
