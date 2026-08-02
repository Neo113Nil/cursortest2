package com.ironsource;

import defpackage.a70;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class C4 implements Re<String> {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    public C4(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // com.ironsource.Re
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a() {
        String b = I9.b(this.b, this.a);
        if (b != null && b.length() != 0) {
            return b;
        }
        a70.p("Decryption failed");
        return null;
    }
}
