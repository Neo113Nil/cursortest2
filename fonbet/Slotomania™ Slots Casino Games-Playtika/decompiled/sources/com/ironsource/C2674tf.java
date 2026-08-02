package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.tf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2674tf {
    private final int a;
    private final H3 b;

    public C2674tf(int i, H3 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.a = i;
        this.b = unit;
    }

    public final int a() {
        return this.a;
    }

    public final H3 b() {
        return this.b;
    }

    public String toString() {
        return "ShowCountCappingConfig(maxImpressions=" + this.a + ", unit=" + this.b + ")";
    }
}
