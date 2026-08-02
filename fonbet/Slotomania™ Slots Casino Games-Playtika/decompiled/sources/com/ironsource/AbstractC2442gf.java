package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.gf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC2442gf {
    private final P a;

    public AbstractC2442gf(P p) {
        this.a = p;
    }

    public final P a() {
        return this.a;
    }

    public abstract EnumC2567nf b();

    public final C2712w a(Ib<AbstractC2442gf, C2712w> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
