package com.ironsource;

import com.ironsource.AbstractC2412f3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Ha implements La {
    private final Ba a;
    private final L2 b;

    public Ha(Ba strategy, L2 currentAdUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
    }

    @Override // com.ironsource.M0
    public void a(C2677u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Received load success while paused");
    }

    @Override // com.ironsource.La
    public void b() {
        this.a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.La
    public void c() {
        this.b.a(true);
        Ba ba = this.a;
        ba.a((La) new Ea(ba));
    }

    @Override // com.ironsource.La
    public void d() {
    }

    @Override // com.ironsource.La
    public void f() {
        Ba.a(this.a, this.b, (AbstractC2412f3) new AbstractC2412f3.a(AbstractC2412f3.b.c.a), false, 4, (Object) null);
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.a.a("Received load failed while paused");
    }
}
