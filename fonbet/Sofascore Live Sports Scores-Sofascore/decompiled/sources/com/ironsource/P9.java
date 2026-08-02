package com.ironsource;

import defpackage.bf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class P9 {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    public P9(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public static /* synthetic */ P9 a(P9 p9, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = p9.a;
        }
        if ((i & 2) != 0) {
            str2 = p9.b;
        }
        return p9.a(str, str2);
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.a;
    }

    @NotNull
    public final String d() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P9)) {
            return false;
        }
        P9 p9 = (P9) obj;
        return Intrinsics.c(this.a, p9.a) && Intrinsics.c(this.b, p9.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return bf3.k("IronSourceAdvId(advId=", this.a, ", advIdType=", this.b, ")");
    }

    @NotNull
    public final P9 a(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        return new P9(str, str2);
    }

    @NotNull
    public final String a() {
        return this.a;
    }
}
