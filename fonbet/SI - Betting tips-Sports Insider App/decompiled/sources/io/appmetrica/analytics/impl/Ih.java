package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ih implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f12387c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0183gi f12388d;

    public Ih(C0183gi c0183gi, String str, String str2, Throwable th2) {
        this.f12388d = c0183gi;
        this.f12385a = str;
        this.f12386b = str2;
        this.f12387c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0183gi c0183gi = this.f12388d;
        C0183gi.a(c0183gi.f13834a, c0183gi.f13837d, c0183gi.f13838e).reportError(this.f12385a, this.f12386b, this.f12387c);
    }
}
