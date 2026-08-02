package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Hj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f12324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12325b;

    public Hj(AdRevenue adRevenue, boolean z5) {
        this.f12324a = adRevenue;
        this.f12325b = z5;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra2) {
        ra2.reportAdRevenue(this.f12324a, this.f12325b);
    }
}
