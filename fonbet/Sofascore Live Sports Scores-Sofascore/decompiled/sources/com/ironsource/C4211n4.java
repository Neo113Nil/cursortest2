package com.ironsource;

import defpackage.dmi;
import defpackage.fc6;
import defpackage.mz1;
import defpackage.w1l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.n4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4211n4 {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @NotNull
    private final String c;

    @NotNull
    private final String d;

    public /* synthetic */ C4211n4(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public static /* synthetic */ C4211n4 a(C4211n4 c4211n4, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4211n4.a;
        }
        if ((i & 2) != 0) {
            str2 = c4211n4.b;
        }
        if ((i & 4) != 0) {
            str3 = c4211n4.c;
        }
        if ((i & 8) != 0) {
            str4 = c4211n4.d;
        }
        return c4211n4.a(str, str2, str3, str4);
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.d;
    }

    @NotNull
    public final String e() {
        return this.d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4211n4)) {
            return false;
        }
        C4211n4 c4211n4 = (C4211n4) obj;
        return Intrinsics.c(this.a, c4211n4.a) && Intrinsics.c(this.b, c4211n4.b) && Intrinsics.c(this.c, c4211n4.c) && Intrinsics.c(this.d, c4211n4.d);
    }

    @NotNull
    public final String f() {
        return this.c;
    }

    @NotNull
    public final String g() {
        return this.a;
    }

    @NotNull
    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return this.d.hashCode() + dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @NotNull
    public String toString() {
        String str = this.a;
        String str2 = this.b;
        return fc6.o(mz1.s("CustomAdapterSettings(customNetworkAdapterName=", str, ", customRewardedVideoAdapterName=", str2, ", customInterstitialAdapterName="), this.c, ", customBannerAdapterName=", this.d, ")");
    }

    public C4211n4() {
        this(null, null, null, null, 15, null);
    }

    public C4211n4(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        w1l.y(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @NotNull
    public final C4211n4 a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new C4211n4(str, str2, str3, str4);
    }

    @NotNull
    public final String a() {
        return this.a;
    }
}
