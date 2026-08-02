package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.wj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0586wj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f14850a;

    public C0586wj(Revenue revenue) {
        this.f14850a = revenue;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra2) {
        ra2.reportRevenue(this.f14850a);
    }
}
