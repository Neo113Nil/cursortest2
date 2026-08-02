package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes13.dex */
public final class Sa implements Ta {
    private final Oa a;
    private final L2 b;

    public Sa(Oa oa, L2 l2) {
        this.a = oa;
        this.b = l2;
    }

    @Override // com.ironsource.Ta
    public void a(C4573u0 c4573u0) {
        this.a.a(c4573u0, this.b);
        Oa oa = this.a;
        oa.a(new Ra(oa, this.b));
    }

    @Override // com.ironsource.Ta
    public void b() {
        this.a.a("Loading an ad while loading");
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
        this.a.a(ironSourceError);
        this.b.a(false);
        this.a.a((L2) null);
        Oa oa = this.a;
        oa.a(new Qa(oa));
    }
}
