package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class S6 implements T6 {
    private final long a;

    @NotNull
    private final W6 b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public S6(@NotNull V6 v6) {
        this(v6.a(), v6.c());
        v6.getClass();
    }

    @Override // com.ironsource.T6
    public long a() {
        return this.a;
    }

    @Override // com.ironsource.T6
    @NotNull
    public W6 b() {
        return this.b;
    }

    public S6(long j, @NotNull W6 w6) {
        w6.getClass();
        this.a = j;
        this.b = w6;
    }
}
