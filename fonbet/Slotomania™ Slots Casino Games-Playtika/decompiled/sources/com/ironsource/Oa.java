package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Oa implements Sa {
    private final Na a;

    public Oa(Na strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
    }

    @Override // com.ironsource.Sa
    public void a(C2677u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Received load success before load called");
    }

    @Override // com.ironsource.Sa
    public void b() {
        L2 a = this.a.i().a(true);
        this.a.a(a);
        Na na = this.a;
        na.a(new Ra(na, a));
        a.a(this.a.g());
    }

    @Override // com.ironsource.Sa
    public void c() {
        L2 k = this.a.k();
        if (k != null) {
            k.a(false);
        }
        this.a.a((L2) null);
        Na na = this.a;
        na.a(new Pa(na));
    }

    @Override // com.ironsource.Sa
    public void a(IronSourceError ironSourceError) {
        this.a.a("Received load failed before load called");
    }
}
