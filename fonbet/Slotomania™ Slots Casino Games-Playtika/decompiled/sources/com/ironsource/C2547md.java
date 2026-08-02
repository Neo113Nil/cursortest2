package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.md, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2547md {
    private final Integer a;
    private final String b;
    private final Boolean c;
    private final String d;
    private final Integer e;
    private final Boolean f;
    private final C2752y3 g;
    private final Xc h;

    public C2547md() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final Integer a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Boolean c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final Integer e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2547md)) {
            return false;
        }
        C2547md c2547md = (C2547md) obj;
        return Intrinsics.areEqual(this.a, c2547md.a) && Intrinsics.areEqual(this.b, c2547md.b) && Intrinsics.areEqual(this.c, c2547md.c) && Intrinsics.areEqual(this.d, c2547md.d) && Intrinsics.areEqual(this.e, c2547md.e) && Intrinsics.areEqual(this.f, c2547md.f) && Intrinsics.areEqual(this.g, c2547md.g) && Intrinsics.areEqual(this.h, c2547md.h);
    }

    public final Boolean f() {
        return this.f;
    }

    public final C2752y3 g() {
        return this.g;
    }

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
        C2752y3 c2752y3 = this.g;
        int hashCode7 = (hashCode6 + (c2752y3 == null ? 0 : c2752y3.hashCode())) * 31;
        Xc xc = this.h;
        return hashCode7 + (xc != null ? xc.hashCode() : 0);
    }

    public final C2752y3 i() {
        return this.g;
    }

    public final Boolean j() {
        return this.f;
    }

    public final Xc k() {
        return this.h;
    }

    public final Integer l() {
        return this.a;
    }

    public final String m() {
        return this.b;
    }

    public final Integer n() {
        return this.e;
    }

    public final String o() {
        return this.d;
    }

    public final Boolean p() {
        return this.c;
    }

    public String toString() {
        return "PlacementConfig2(placementId=" + this.a + ", placementName=" + this.b + ", isDefault=" + this.c + ", virtualItemName=" + this.d + ", virtualItemCount=" + this.e + ", delivery=" + this.f + ", capping=" + this.g + ", pacing=" + this.h + ")";
    }

    public C2547md(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C2752y3 c2752y3, Xc xc) {
        this.a = num;
        this.b = str;
        this.c = bool;
        this.d = str2;
        this.e = num2;
        this.f = bool2;
        this.g = c2752y3;
        this.h = xc;
    }

    public final C2547md a(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C2752y3 c2752y3, Xc xc) {
        return new C2547md(num, str, bool, str2, num2, bool2, c2752y3, xc);
    }

    public static /* synthetic */ C2547md a(C2547md c2547md, Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C2752y3 c2752y3, Xc xc, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c2547md.a;
        }
        if ((i & 2) != 0) {
            str = c2547md.b;
        }
        if ((i & 4) != 0) {
            bool = c2547md.c;
        }
        if ((i & 8) != 0) {
            str2 = c2547md.d;
        }
        if ((i & 16) != 0) {
            num2 = c2547md.e;
        }
        if ((i & 32) != 0) {
            bool2 = c2547md.f;
        }
        if ((i & 64) != 0) {
            c2752y3 = c2547md.g;
        }
        if ((i & 128) != 0) {
            xc = c2547md.h;
        }
        C2752y3 c2752y32 = c2752y3;
        Xc xc2 = xc;
        Integer num3 = num2;
        Boolean bool3 = bool2;
        return c2547md.a(num, str, bool, str2, num3, bool3, c2752y32, xc2);
    }

    public /* synthetic */ C2547md(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C2752y3 c2752y3, Xc xc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : c2752y3, (i & 128) != 0 ? null : xc);
    }
}
