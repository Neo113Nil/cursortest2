package com.ironsource;

import defpackage.vxd;
import defpackage.wv8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.ld, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4184ld {

    @Nullable
    private final Integer a;

    @Nullable
    private final String b;

    @Nullable
    private final Boolean c;

    @Nullable
    private final String d;

    @Nullable
    private final Integer e;

    @Nullable
    private final Boolean f;

    @Nullable
    private final C4353v3 g;

    @Nullable
    private final Xc h;

    public /* synthetic */ C4184ld(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C4353v3 c4353v3, Xc xc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : c4353v3, (i & 128) != 0 ? null : xc);
    }

    public static /* synthetic */ C4184ld a(C4184ld c4184ld, Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C4353v3 c4353v3, Xc xc, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c4184ld.a;
        }
        if ((i & 2) != 0) {
            str = c4184ld.b;
        }
        if ((i & 4) != 0) {
            bool = c4184ld.c;
        }
        if ((i & 8) != 0) {
            str2 = c4184ld.d;
        }
        if ((i & 16) != 0) {
            num2 = c4184ld.e;
        }
        if ((i & 32) != 0) {
            bool2 = c4184ld.f;
        }
        if ((i & 64) != 0) {
            c4353v3 = c4184ld.g;
        }
        if ((i & 128) != 0) {
            xc = c4184ld.h;
        }
        C4353v3 c4353v32 = c4353v3;
        Xc xc2 = xc;
        Integer num3 = num2;
        Boolean bool3 = bool2;
        return c4184ld.a(num, str, bool, str2, num3, bool3, c4353v32, xc2);
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final Boolean c() {
        return this.c;
    }

    @Nullable
    public final String d() {
        return this.d;
    }

    @Nullable
    public final Integer e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4184ld)) {
            return false;
        }
        C4184ld c4184ld = (C4184ld) obj;
        return Intrinsics.c(this.a, c4184ld.a) && Intrinsics.c(this.b, c4184ld.b) && Intrinsics.c(this.c, c4184ld.c) && Intrinsics.c(this.d, c4184ld.d) && Intrinsics.c(this.e, c4184ld.e) && Intrinsics.c(this.f, c4184ld.f) && Intrinsics.c(this.g, c4184ld.g) && Intrinsics.c(this.h, c4184ld.h);
    }

    @Nullable
    public final Boolean f() {
        return this.f;
    }

    @Nullable
    public final C4353v3 g() {
        return this.g;
    }

    @Nullable
    public final Xc h() {
        return this.h;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.f;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C4353v3 c4353v3 = this.g;
        int hashCode7 = (hashCode6 + (c4353v3 == null ? 0 : c4353v3.hashCode())) * 31;
        Xc xc = this.h;
        return hashCode7 + (xc != null ? xc.hashCode() : 0);
    }

    @Nullable
    public final C4353v3 i() {
        return this.g;
    }

    @Nullable
    public final Boolean j() {
        return this.f;
    }

    @Nullable
    public final Xc k() {
        return this.h;
    }

    @Nullable
    public final Integer l() {
        return this.a;
    }

    @Nullable
    public final String m() {
        return this.b;
    }

    @Nullable
    public final Integer n() {
        return this.e;
    }

    @Nullable
    public final String o() {
        return this.d;
    }

    @Nullable
    public final Boolean p() {
        return this.c;
    }

    @NotNull
    public String toString() {
        Integer num = this.a;
        String str = this.b;
        Boolean bool = this.c;
        String str2 = this.d;
        Integer num2 = this.e;
        Boolean bool2 = this.f;
        C4353v3 c4353v3 = this.g;
        Xc xc = this.h;
        StringBuilder m = wv8.m("PlacementConfig2(placementId=", num, ", placementName=", str, ", isDefault=");
        m.append(bool);
        m.append(", virtualItemName=");
        m.append(str2);
        m.append(", virtualItemCount=");
        vxd.v(m, num2, ", delivery=", bool2, ", capping=");
        m.append(c4353v3);
        m.append(", pacing=");
        m.append(xc);
        m.append(")");
        return m.toString();
    }

    public C4184ld(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable C4353v3 c4353v3, @Nullable Xc xc) {
        this.a = num;
        this.b = str;
        this.c = bool;
        this.d = str2;
        this.e = num2;
        this.f = bool2;
        this.g = c4353v3;
        this.h = xc;
    }

    public C4184ld() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @NotNull
    public final C4184ld a(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable C4353v3 c4353v3, @Nullable Xc xc) {
        return new C4184ld(num, str, bool, str2, num2, bool2, c4353v3, xc);
    }

    @Nullable
    public final Integer a() {
        return this.a;
    }
}
