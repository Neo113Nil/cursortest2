package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Vc {
    private final long a;
    private final H3 b;

    public Vc(long j, H3 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.a = j;
        this.b = unit;
    }

    public final long a() {
        return this.a;
    }

    public final H3 b() {
        return this.b;
    }

    public String toString() {
        return "PacingCappingConfig(timeInterval=" + this.a + " unit=" + this.b + ")";
    }

    public /* synthetic */ Vc(long j, H3 h3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? H3.Second : h3);
    }
}
