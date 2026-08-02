package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Da implements La {
    private final Ba a;
    private boolean b;

    public Da(Ba strategy, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
        this.b = z;
    }

    @Override // com.ironsource.M0
    public void a(C2677u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Received load success before load");
    }

    @Override // com.ironsource.La
    public void b() {
        L2 a = this.a.j().a(true);
        this.a.a((La) new Ga(this.a, a, this.b));
        a.a(this.a.g());
    }

    @Override // com.ironsource.La
    public void c() {
        Ba ba = this.a;
        ba.a((La) new Ea(ba));
    }

    @Override // com.ironsource.La
    public void d() {
        this.b = true;
    }

    @Override // com.ironsource.La
    public void f() {
        this.b = false;
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.a.a("Received load failed before load");
    }

    public /* synthetic */ Da(Ba ba, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ba, (i & 2) != 0 ? false : z);
    }
}
