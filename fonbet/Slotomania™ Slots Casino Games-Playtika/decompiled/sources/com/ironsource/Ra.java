package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Ra implements Sa {
    private final Na a;
    private final L2 b;

    public Ra(Na strategy, L2 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a = strategy;
        this.b = adUnit;
    }

    @Override // com.ironsource.Sa
    public void a(C2677u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a(adUnitCallback, this.b);
        Na na = this.a;
        na.a(new Qa(na, this.b));
    }

    @Override // com.ironsource.Sa
    public void b() {
        this.a.a("Loading an ad while loading");
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
        this.a.a(ironSourceError);
        this.b.a(false);
        this.a.a((L2) null);
        Na na = this.a;
        na.a(new Pa(na));
    }
}
