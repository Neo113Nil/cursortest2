package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.sg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4312sg {

    @NotNull
    private final InterfaceC4193m4 a;

    public C4312sg(@NotNull InterfaceC4193m4 interfaceC4193m4) {
        interfaceC4193m4.getClass();
        this.a = interfaceC4193m4;
    }

    public final boolean a(long j, long j2) {
        long a = this.a.a();
        return j2 <= 0 || j <= 0 || a < j || a - j > j2;
    }
}
