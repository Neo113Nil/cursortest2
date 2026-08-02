package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes13.dex */
public final class Ra implements Ta {
    private final Oa a;
    private final L2 b;

    public Ra(Oa oa, L2 l2) {
        this.a = oa;
        this.b = l2;
    }

    @Override // com.ironsource.Ta
    public void a(C4573u0 c4573u0) {
        this.a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.Ta
    public void b() {
        this.a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ta
    public void c() {
        this.b.a(true);
        this.a.a((L2) null);
        Oa oa = this.a;
        oa.a(new Qa(oa));
    }

    @Override // com.ironsource.Ta
    public void a(IronSourceError ironSourceError) {
        this.a.a("Ad unit is already loaded");
    }
}
