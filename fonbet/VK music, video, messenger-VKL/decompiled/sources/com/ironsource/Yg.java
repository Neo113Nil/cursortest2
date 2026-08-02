package com.ironsource;

/* loaded from: classes13.dex */
public final class Yg implements bh {
    private final Ug a;

    public Yg(Ug ug) {
        this.a = ug;
    }

    @Override // com.ironsource.bh
    public void a() {
    }

    @Override // com.ironsource.bh
    public Nd b() {
        return Nd.FEATURE_DISABLED;
    }

    @Override // com.ironsource.bh
    public B c() {
        return this.a.a(0);
    }

    @Override // com.ironsource.bh
    public void a(B b) {
        this.a.a(b);
        this.a.a();
    }
}
