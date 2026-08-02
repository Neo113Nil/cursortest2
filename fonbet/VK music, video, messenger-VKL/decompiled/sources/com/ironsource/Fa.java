package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes13.dex */
public final class Fa implements Ma {
    private final Ca a;

    public Fa(Ca ca) {
        this.a = ca;
    }

    @Override // com.ironsource.M0
    public void a(C4573u0 c4573u0) {
        this.a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Ma
    public void c() {
        this.a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Ma
    public void d() {
        this.a.a("Pausing auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.Ma
    public void f() {
        this.a.a("Resuming auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.a.a("Received load failed on a destroyed ad");
    }
}
