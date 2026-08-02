package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Qa implements Sa {
    private final Na a;
    private final L2 b;

    public Qa(Na strategy, L2 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a = strategy;
        this.b = adUnit;
    }

    @Override // com.ironsource.Sa
    public void a(C2677u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.Sa
    public void b() {
        this.a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Sa
    public void c() {
        this.b.a(true);
        this.a.a((L2) null);
        Na na = this.a;
        na.a(new Pa(na));
    }

    @Override // com.ironsource.Sa
    public void a(IronSourceError ironSourceError) {
        this.a.a("Ad unit is already loaded");
    }
}
