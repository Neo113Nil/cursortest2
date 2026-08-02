package io.appmetrica.analytics.impl;

import android.location.Location;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class P0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f12716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f12717b;

    public P0(C0493t1 c0493t1, Location location) {
        this.f12717b = c0493t1;
        this.f12716a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0642z0 c0642z0 = this.f12717b.f14654a;
        Location location = this.f12716a;
        c0642z0.getClass();
        C0617y0.c().a(location);
    }
}
