package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.v5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2700v5 implements Ab {
    private final InterstitialAdRequest a;
    private final C2776z9 b;
    private final InterfaceC2642s1 c;
    private final IronSourceError d;

    public C2700v5(InterstitialAdRequest adRequest, C2776z9 adLoadTaskListener, InterfaceC2642s1 analytics, IronSourceError error) {
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
