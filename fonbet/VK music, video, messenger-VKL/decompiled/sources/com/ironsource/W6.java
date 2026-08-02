package com.ironsource;

/* loaded from: classes13.dex */
public final class W6 implements X6 {
    private final long a;
    private final EnumC4222a7 b;

    public W6(long j, EnumC4222a7 enumC4222a7) {
        this.a = j;
        this.b = enumC4222a7;
    }

    @Override // com.ironsource.X6
    public long a() {
        return this.a;
    }

    @Override // com.ironsource.X6
    public EnumC4222a7 b() {
        return this.b;
    }

    public W6(Z6 z6) {
        this(z6.a(), z6.c());
    }
}
