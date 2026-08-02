package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class V6 implements W6 {
    private final long a;
    private final Z6 b;

    public V6(long j, Z6 recoveryStrategy) {
        Intrinsics.checkNotNullParameter(recoveryStrategy, "recoveryStrategy");
        this.a = j;
        this.b = recoveryStrategy;
    }

    @Override // com.ironsource.W6
    public long a() {
        return this.a;
    }

    @Override // com.ironsource.W6
    public Z6 b() {
        return this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public V6(Y6 feature) {
        this(feature.a(), feature.c());
        Intrinsics.checkNotNullParameter(feature, "feature");
    }
}
