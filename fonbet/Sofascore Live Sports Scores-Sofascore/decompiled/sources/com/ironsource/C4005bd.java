package com.ironsource;

import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.bd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4005bd {

    @NotNull
    private final String a;

    public C4005bd(@NotNull String str) {
        str.getClass();
        this.a = str;
    }

    @NotNull
    public final String a() {
        String str = this.a;
        return str.substring(0, StringsKt.T("/", str, 6));
    }
}
