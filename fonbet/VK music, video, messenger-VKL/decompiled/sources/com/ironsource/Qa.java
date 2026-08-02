package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes13.dex */
public final class Qa implements Ta {
    private final Oa a;

    public Qa(Oa oa) {
        this.a = oa;
    }

    @Override // com.ironsource.Ta
    public void a(C4573u0 c4573u0) {
        this.a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Ta
    public void b() {
        this.a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Ta
    public void c() {
        this.a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Ta
    public void a(IronSourceError ironSourceError) {
        this.a.a("Received load failed on a destroyed ad");
    }
}
