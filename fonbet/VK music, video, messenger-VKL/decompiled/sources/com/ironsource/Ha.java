package com.ironsource;

import com.ironsource.AbstractC4308f3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes13.dex */
public final class Ha implements Ma {
    private final Ca a;
    private final L2 b;
    private boolean c;

    public Ha(Ca ca, L2 l2, boolean z) {
        this.a = ca;
        this.b = l2;
        this.c = z;
    }

    @Override // com.ironsource.M0
    public void a(C4573u0 c4573u0) {
        this.a.a(c4573u0, this.b, (L2) null, new AbstractC4308f3.a(AbstractC4308f3.b.C0217b.a), this.c, (Long) null);
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.Ma
    public void c() {
        this.b.a(true);
        Ca ca = this.a;
        ca.a((Ma) new Fa(ca));
    }

    @Override // com.ironsource.Ma
    public void d() {
        this.c = true;
    }

    @Override // com.ironsource.Ma
    public void f() {
        this.c = false;
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.a.a(ironSourceError, this.b, (AbstractC4308f3) new AbstractC4308f3.a(AbstractC4308f3.b.a.a), false, this.c, (Long) null);
    }
}
