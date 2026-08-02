package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Oh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f12693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0183gi f12694b;

    public Oh(C0183gi c0183gi, Revenue revenue) {
        this.f12694b = c0183gi;
        this.f12693a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0183gi c0183gi = this.f12694b;
        C0183gi.a(c0183gi.f13834a, c0183gi.f13837d, c0183gi.f13838e).reportRevenue(this.f12693a);
    }
}
