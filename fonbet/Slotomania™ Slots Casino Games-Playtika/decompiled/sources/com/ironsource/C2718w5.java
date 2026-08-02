package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.w5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2718w5 implements Ab {
    private final RewardedAdRequest a;
    private final C2333ae b;
    private final InterfaceC2642s1 c;
    private final IronSourceError d;

    public C2718w5(RewardedAdRequest adRequest, C2333ae adLoadTaskListener, InterfaceC2642s1 analytics, IronSourceError error) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(error, "error");
        this.a = adRequest;
        this.b = adLoadTaskListener;
        this.c = analytics;
        this.d = error;
    }

    public final IronSourceError a() {
        return this.d;
    }

    @Override // com.ironsource.Ab
    public void start() {
        C2628r5 c2628r5 = new C2628r5(this.c, this.a.getAdId$mediationsdk_release(), this.a.getProviderName$mediationsdk_release());
        c2628r5.a();
        c2628r5.a(this.d);
        this.b.b(this.d);
    }
}
