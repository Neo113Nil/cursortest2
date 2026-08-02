package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class X0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f13136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f13137b;

    public X0(C0493t1 c0493t1, AdRevenue adRevenue) {
        this.f13137b = c0493t1;
        this.f13136a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0493t1.a(this.f13137b).reportAdRevenue(this.f13136a);
    }
}
