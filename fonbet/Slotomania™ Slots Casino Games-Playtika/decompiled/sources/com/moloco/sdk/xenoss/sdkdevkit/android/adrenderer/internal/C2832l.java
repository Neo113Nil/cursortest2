package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2832l {
    public static final int h = 8;
    public final Integer a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final C2831k e;
    public final String f;
    public final String g;

    public C2832l(Integer num, String str, Integer num2, Integer num3, C2831k c2831k, String str2, String str3) {
        this.a = num;
        this.b = str;
        this.c = num2;
        this.d = num3;
        this.e = c2831k;
        this.f = str2;
        this.g = str3;
    }

    public final Integer a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Integer c() {
        return this.c;
    }

    public final Integer d() {
        return this.d;
    }

    public final C2831k e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2832l)) {
            return false;
        }
        C2832l c2832l = (C2832l) obj;
        return Intrinsics.areEqual(this.a, c2832l.a) && Intrinsics.areEqual(this.b, c2832l.b) && Intrinsics.areEqual(this.c, c2832l.c) && Intrinsics.areEqual(this.d, c2832l.d) && Intrinsics.areEqual(this.e, c2832l.e) && Intrinsics.areEqual(this.f, c2832l.f) && Intrinsics.areEqual(this.g, c2832l.g);
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        C2831k c2831k = this.e;
        int hashCode5 = (hashCode4 + (c2831k == null ? 0 : c2831k.hashCode())) * 31;
        String str2 = this.f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final C2831k i() {
        return this.e;
    }

    public final Integer j() {
        return this.c;
    }

    public final String k() {
        return this.b;
    }

    public final Integer l() {
        return this.d;
    }

    public final String m() {
        return this.f;
    }

    public final Integer n() {
        return this.a;
    }

    public String toString() {
        return "DECCta(verticalSpacing=" + this.a + ", ctaText=" + this.b + ", buttonWidth=" + this.c + ", fontSize=" + this.d + ", border=" + this.e + ", foregroundColor=" + this.f + ", backgroundColor=" + this.g + ')';
    }

    public final C2832l a(Integer num, String str, Integer num2, Integer num3, C2831k c2831k, String str2, String str3) {
        return new C2832l(num, str, num2, num3, c2831k, str2, str3);
    }

    public static /* synthetic */ C2832l a(C2832l c2832l, Integer num, String str, Integer num2, Integer num3, C2831k c2831k, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c2832l.a;
        }
        if ((i & 2) != 0) {
            str = c2832l.b;
        }
        if ((i & 4) != 0) {
            num2 = c2832l.c;
        }
        if ((i & 8) != 0) {
            num3 = c2832l.d;
        }
        if ((i & 16) != 0) {
            c2831k = c2832l.e;
        }
        if ((i & 32) != 0) {
            str2 = c2832l.f;
        }
        if ((i & 64) != 0) {
            str3 = c2832l.g;
        }
        String str4 = str2;
        String str5 = str3;
        C2831k c2831k2 = c2831k;
        Integer num4 = num2;
        return c2832l.a(num, str, num4, num3, c2831k2, str4, str5);
    }
}
