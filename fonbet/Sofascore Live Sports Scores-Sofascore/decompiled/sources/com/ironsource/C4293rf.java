package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.rf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4293rf {
    private final int a;

    @NotNull
    private final E3 b;

    public C4293rf(int i, @NotNull E3 e3) {
        e3.getClass();
        this.a = i;
        this.b = e3;
    }

    public final int a() {
        return this.a;
    }

    @NotNull
    public final E3 b() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return "ShowCountCappingConfig(maxImpressions=" + this.a + ", unit=" + this.b + ")";
    }
}
