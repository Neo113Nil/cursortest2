package com.ironsource;

import defpackage.dmi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.wc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4380wc implements Dd {

    @NotNull
    private final String a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.wc$a */
    public static final class a {

        @NotNull
        public static final a a = new a();

        @NotNull
        public static final String b = "IronSource";

        private a() {
        }
    }

    public C4380wc(@NotNull String str) {
        str.getClass();
        this.a = str;
    }

    @Override // com.ironsource.Dd
    @NotNull
    public String value() {
        return this.a.length() == 0 ? "" : (Intrinsics.c(this.a, "0") || Intrinsics.c(this.a, "IronSource")) ? "IronSource" : dmi.q("IronSource_", this.a);
    }
}
