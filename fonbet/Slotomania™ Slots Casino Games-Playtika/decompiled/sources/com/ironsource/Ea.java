package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Ea implements La {
    private final Ba a;

    public Ea(Ba strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
    }

    @Override // com.ironsource.M0
    public void a(C2677u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.La
    public void b() {
        this.a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.La
    public void c() {
        this.a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.La
    public void d() {
        this.a.a("Pausing auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.La
    public void f() {
        this.a.a("Resuming auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.a.a("Received load failed on a destroyed ad");
    }
}
