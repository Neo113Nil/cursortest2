package com.ironsource;

/* loaded from: classes13.dex */
public final class Zg implements bh {
    private final Ug a;
    private int b;

    public Zg(Ug ug) {
        this.a = ug;
    }

    @Override // com.ironsource.bh
    public void a(B b) {
        this.b++;
        this.a.a(b);
    }

    @Override // com.ironsource.bh
    public Nd b() {
        return this.b >= 2 ? Nd.MAX_ATTEMPTS_REACHED : !this.a.b() ? Nd.NO_LOADED_ADS : Nd.CAN_RECOVER;
    }

    @Override // com.ironsource.bh
    public B c() {
        return this.a.a(this.b);
    }

    @Override // com.ironsource.bh
    public void a() {
        this.a.a();
    }
}
