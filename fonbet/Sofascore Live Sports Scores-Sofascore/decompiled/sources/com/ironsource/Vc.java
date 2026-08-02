package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Vc {
    private final long a;

    @NotNull
    private final E3 b;

    public Vc(long j, @NotNull E3 e3) {
        e3.getClass();
        this.a = j;
        this.b = e3;
    }

    public final long a() {
        return this.a;
    }

    @NotNull
    public final E3 b() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return "PacingCappingConfig(timeInterval=" + this.a + " unit=" + this.b + ")";
    }

    public /* synthetic */ Vc(long j, E3 e3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? E3.Second : e3);
    }
}
