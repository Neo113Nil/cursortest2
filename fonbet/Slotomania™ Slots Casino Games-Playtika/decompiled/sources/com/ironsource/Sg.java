package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Sg implements Vg {
    private final Og a;

    public Sg(Og waterfallOperations) {
        Intrinsics.checkNotNullParameter(waterfallOperations, "waterfallOperations");
        this.a = waterfallOperations;
    }

    @Override // com.ironsource.Vg
    public void a() {
    }

    @Override // com.ironsource.Vg
    public void a(B it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.a.a(it);
        this.a.a();
    }

    @Override // com.ironsource.Vg
    public Nd b() {
        return Nd.FEATURE_DISABLED;
    }

    @Override // com.ironsource.Vg
    public B c() {
        return this.a.a(0);
    }
}
