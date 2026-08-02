package com.ironsource;

import com.ironsource.AbstractC2412f3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Ga implements La {
    private final Ba a;
    private final L2 b;
    private boolean c;

    public Ga(Ba strategy, L2 currentAdUnit, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = z;
    }

    @Override // com.ironsource.M0
    public void a(C2677u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a(adUnitCallback, this.b, (L2) null, new AbstractC2412f3.a(AbstractC2412f3.b.C0206b.a), this.c, (Long) null);
    }

    @Override // com.ironsource.La
    public void b() {
        this.a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.La
    public void c() {
        this.b.a(true);
        Ba ba = this.a;
        ba.a((La) new Ea(ba));
    }

    @Override // com.ironsource.La
    public void d() {
        this.c = true;
    }

    @Override // com.ironsource.La
    public void f() {
        this.c = false;
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.a.a(ironSourceError, this.b, (AbstractC2412f3) new AbstractC2412f3.a(AbstractC2412f3.b.a.a), false, this.c, (Long) null);
    }
}
