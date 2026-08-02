package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Ea implements Ma {
    private final Ca a;
    private boolean b;

    public Ea(Ca ca, boolean z) {
        this.a = ca;
        this.b = z;
    }

    @Override // com.ironsource.M0
    public void a(C4573u0 c4573u0) {
        this.a.a("Received load success before load");
    }

    @Override // com.ironsource.Ma
    public void b() {
        L2 a = this.a.j().a(true);
        this.a.a((Ma) new Ha(this.a, a, this.b));
        a.a(this.a.g());
    }

    @Override // com.ironsource.Ma
    public void c() {
        Ca ca = this.a;
        ca.a((Ma) new Fa(ca));
    }

    @Override // com.ironsource.Ma
    public void d() {
        this.b = true;
    }

    @Override // com.ironsource.Ma
    public void f() {
        this.b = false;
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.a.a("Received load failed before load");
    }

    public /* synthetic */ Ea(Ca ca, boolean z, int i, zcl zclVar) {
        this(ca, (i & 2) != 0 ? false : z);
    }
}
