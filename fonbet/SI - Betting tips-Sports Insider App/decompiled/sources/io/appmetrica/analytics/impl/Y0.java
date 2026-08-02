package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f13202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f13203b;

    public Y0(C0493t1 c0493t1, ECommerceEvent eCommerceEvent) {
        this.f13203b = c0493t1;
        this.f13202a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0493t1.a(this.f13203b).reportECommerce(this.f13202a);
    }
}
