package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Mh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0183gi f12598b;

    public Mh(C0183gi c0183gi, String str) {
        this.f12598b = c0183gi;
        this.f12597a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0183gi c0183gi = this.f12598b;
        C0183gi.a(c0183gi.f13834a, c0183gi.f13837d, c0183gi.f13838e).setUserProfileID(this.f12597a);
    }
}
