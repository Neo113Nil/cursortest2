package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Pa implements Sa {
    private final Na a;

    public Pa(Na strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
    }

    @Override // com.ironsource.Sa
    public void a(C2677u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Sa
    public void b() {
        this.a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Sa
    public void c() {
        this.a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Sa
    public void a(IronSourceError ironSourceError) {
        this.a.a("Received load failed on a destroyed ad");
    }
}
