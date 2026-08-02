package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0080ci implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13527b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0183gi f13528c;

    public RunnableC0080ci(C0183gi c0183gi, String str, String str2) {
        this.f13528c = c0183gi;
        this.f13526a = str;
        this.f13527b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0183gi c0183gi = this.f13528c;
        C0183gi.a(c0183gi.f13834a, c0183gi.f13837d, c0183gi.f13838e).putAppEnvironmentValue(this.f13526a, this.f13527b);
    }
}
