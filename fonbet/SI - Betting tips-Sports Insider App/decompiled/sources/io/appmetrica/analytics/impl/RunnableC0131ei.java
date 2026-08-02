package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ei, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0131ei implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0183gi f13698b;

    public RunnableC0131ei(C0183gi c0183gi, String str) {
        this.f13698b = c0183gi;
        this.f13697a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0183gi c0183gi = this.f13698b;
        C0183gi.a(c0183gi.f13834a, c0183gi.f13837d, c0183gi.f13838e).reportEvent(this.f13697a);
    }
}
