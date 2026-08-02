package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.xj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0611xj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f14929a;

    public C0611xj(ECommerceEvent eCommerceEvent) {
        this.f14929a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra2) {
        ra2.reportECommerce(this.f14929a);
    }
}
