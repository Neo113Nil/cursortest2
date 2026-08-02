package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Aj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f12008a;

    public Aj(AdRevenue adRevenue) {
        this.f12008a = adRevenue;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra2) {
        ra2.reportAdRevenue(this.f12008a);
    }
}
