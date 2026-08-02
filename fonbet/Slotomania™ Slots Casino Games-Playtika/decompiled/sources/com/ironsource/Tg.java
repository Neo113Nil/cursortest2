package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Tg implements Vg {
    private final Og a;
    private int b;

    public Tg(Og waterfallOperations) {
        Intrinsics.checkNotNullParameter(waterfallOperations, "waterfallOperations");
        this.a = waterfallOperations;
    }

    @Override // com.ironsource.Vg
    public void a(B it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.b++;
        this.a.a(it);
    }

    @Override // com.ironsource.Vg
    public Nd b() {
        return this.b >= 2 ? Nd.MAX_ATTEMPTS_REACHED : !this.a.b() ? Nd.NO_LOADED_ADS : Nd.CAN_RECOVER;
    }

    @Override // com.ironsource.Vg
    public B c() {
        return this.a.a(this.b);
    }

    @Override // com.ironsource.Vg
    public void a() {
        this.a.a();
    }
}
