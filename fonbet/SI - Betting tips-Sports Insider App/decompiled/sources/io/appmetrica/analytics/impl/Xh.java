package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Xh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f13191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0183gi f13193c;

    public Xh(C0183gi c0183gi, AdRevenue adRevenue, boolean z5) {
        this.f13193c = c0183gi;
        this.f13191a = adRevenue;
        this.f13192b = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0183gi c0183gi = this.f13193c;
        C0183gi.a(c0183gi.f13834a, c0183gi.f13837d, c0183gi.f13838e).reportAdRevenue(this.f13191a, this.f13192b);
    }
}
