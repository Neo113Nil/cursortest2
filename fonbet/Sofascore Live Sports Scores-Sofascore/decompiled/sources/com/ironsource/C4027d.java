package com.ironsource;

import defpackage.dmi;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4027d implements V5 {

    @NotNull
    private final C4005bd a;

    public C4027d(@NotNull C4005bd c4005bd) {
        c4005bd.getClass();
        this.a = c4005bd;
    }

    @Override // com.ironsource.V5
    @NotNull
    public String value() {
        return dmi.y(this.a.a(), "/abTestMap.json");
    }
}
