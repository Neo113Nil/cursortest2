package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes13.dex */
public final class Pa implements Ta {
    private final Oa a;

    public Pa(Oa oa) {
        this.a = oa;
    }

    @Override // com.ironsource.Ta
    public void a(C4573u0 c4573u0) {
        this.a.a("Received load success before load called");
    }

    @Override // com.ironsource.Ta
    public void b() {
        L2 a = this.a.i().a(true);
        this.a.a(a);
        Oa oa = this.a;
        oa.a(new Sa(oa, a));
        a.a(this.a.g());
    }

    @Override // com.ironsource.Ta
    public void c() {
        L2 k = this.a.k();
        if (k != null) {
            k.a(false);
        }
        this.a.a((L2) null);
        Oa oa = this.a;
        oa.a(new Qa(oa));
    }

    @Override // com.ironsource.Ta
    public void a(IronSourceError ironSourceError) {
        this.a.a("Received load failed before load called");
    }
}
