package com.ironsource;

import com.ironsource.AbstractC4308f3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes13.dex */
public final class Ia implements Ma {
    private final Ca a;
    private final L2 b;

    public Ia(Ca ca, L2 l2) {
        this.a = ca;
        this.b = l2;
    }

    @Override // com.ironsource.M0
    public void a(C4573u0 c4573u0) {
        this.a.a("Received load success while paused");
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ma
    public void c() {
        this.b.a(true);
        Ca ca = this.a;
        ca.a((Ma) new Fa(ca));
    }

    @Override // com.ironsource.Ma
    public void f() {
        Ca.a(this.a, this.b, (AbstractC4308f3) new AbstractC4308f3.a(AbstractC4308f3.b.c.a), false, 4, (Object) null);
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.a.a("Received load failed while paused");
    }

    @Override // com.ironsource.Ma
    public void d() {
    }
}
