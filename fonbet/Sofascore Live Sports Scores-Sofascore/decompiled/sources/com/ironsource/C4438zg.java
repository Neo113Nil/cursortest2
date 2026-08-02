package com.ironsource;

import defpackage.dmi;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.zg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4438zg implements V5 {

    @NotNull
    private final C4005bd a;

    @NotNull
    private final String b;

    public C4438zg(@NotNull C4005bd c4005bd, @NotNull String str) {
        c4005bd.getClass();
        str.getClass();
        this.a = c4005bd;
        this.b = str;
    }

    @NotNull
    public final String a() {
        return this.b;
    }

    @Override // com.ironsource.V5
    @NotNull
    public String value() {
        return dmi.r(this.a.a(), "/versions/", this.b, "/mobileController.html");
    }
}
