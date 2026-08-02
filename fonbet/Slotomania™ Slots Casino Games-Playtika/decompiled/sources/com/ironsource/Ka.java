package com.ironsource;

import com.ironsource.AbstractC2412f3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Ka implements La {
    private final Ba a;
    private final L2 b;
    private final L2 c;
    private final long d;
    private final boolean e;

    public Ka(Ba strategy, L2 currentAdUnit, L2 reloadingAdUnit, long j, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadingAdUnit, "reloadingAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = reloadingAdUnit;
        this.d = j;
        this.e = z;
    }

    @Override // com.ironsource.M0
    public void a(C2677u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a(adUnitCallback, this.c, this.b, (AbstractC2412f3) new AbstractC2412f3.c(this.a.p().a() - this.d, AbstractC2412f3.d.C0207d.a), false, Long.valueOf(this.d));
    }

    @Override // com.ironsource.La
    public void b() {
        this.a.a("Loading an ad while reloading after timer finished");
    }

    @Override // com.ironsource.La
    public void c() {
        this.b.a(true);
        this.c.a(true);
        Ba ba = this.a;
        ba.a((La) new Ea(ba));
    }

    @Override // com.ironsource.La
    public void d() {
        Ba ba = this.a;
        ba.a((La) new Ha(ba, this.b));
    }

    @Override // com.ironsource.La
    public void f() {
    }

    public /* synthetic */ Ka(Ba ba, L2 l2, L2 l22, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ba, l2, l22, j, (i & 16) != 0 ? true : z);
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.a.a(ironSourceError, this.b, (AbstractC2412f3) new AbstractC2412f3.c(this.a.p().a() - this.d, AbstractC2412f3.d.c.a), this.e, false, Long.valueOf(this.d));
    }
}
