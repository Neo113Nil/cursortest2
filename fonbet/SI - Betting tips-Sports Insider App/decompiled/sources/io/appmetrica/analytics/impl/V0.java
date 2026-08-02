package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f12997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f12998b;

    public V0(C0493t1 c0493t1, Revenue revenue) {
        this.f12998b = c0493t1;
        this.f12997a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0493t1.a(this.f12998b).reportRevenue(this.f12997a);
    }
}
