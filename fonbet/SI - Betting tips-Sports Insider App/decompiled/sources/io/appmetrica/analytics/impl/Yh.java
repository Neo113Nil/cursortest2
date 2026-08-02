package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Yh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Qn f13229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0183gi f13230b;

    public Yh(C0183gi c0183gi, Qn qn) {
        this.f13230b = c0183gi;
        this.f13229a = qn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0183gi c0183gi = this.f13230b;
        C0183gi.a(c0183gi.f13834a, c0183gi.f13837d, c0183gi.f13838e).a(this.f13229a);
    }
}
