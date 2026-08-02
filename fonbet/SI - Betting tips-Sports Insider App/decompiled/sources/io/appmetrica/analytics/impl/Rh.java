package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Rh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f12819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0183gi f12820b;

    public Rh(C0183gi c0183gi, ECommerceEvent eCommerceEvent) {
        this.f12820b = c0183gi;
        this.f12819a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0183gi c0183gi = this.f12820b;
        C0183gi.a(c0183gi.f13834a, c0183gi.f13837d, c0183gi.f13838e).reportECommerce(this.f12819a);
    }
}
