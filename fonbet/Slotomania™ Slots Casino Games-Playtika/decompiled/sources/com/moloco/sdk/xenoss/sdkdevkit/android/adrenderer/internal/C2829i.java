package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2829i {
    public static final int j = 8;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final C2832l g;
    public final C2830j h;
    public final C2836p i;

    public C2829i(String str, String str2, String str3, String str4, String str5, Integer num, C2832l c2832l, C2830j c2830j, C2836p c2836p) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = num;
        this.g = c2832l;
        this.h = c2830j;
        this.i = c2836p;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2829i)) {
            return false;
        }
        C2829i c2829i = (C2829i) obj;
        return Intrinsics.areEqual(this.a, c2829i.a) && Intrinsics.areEqual(this.b, c2829i.b) && Intrinsics.areEqual(this.c, c2829i.c) && Intrinsics.areEqual(this.d, c2829i.d) && Intrinsics.areEqual(this.e, c2829i.e) && Intrinsics.areEqual(this.f, c2829i.f) && Intrinsics.areEqual(this.g, c2829i.g) && Intrinsics.areEqual(this.h, c2829i.h) && Intrinsics.areEqual(this.i, c2829i.i);
    }

    public final Integer f() {
        return this.f;
    }

    public final C2832l g() {
        return this.g;
    }

    public final C2830j h() {
        return this.h;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        C2832l c2832l = this.g;
        int hashCode7 = (hashCode6 + (c2832l == null ? 0 : c2832l.hashCode())) * 31;
        C2830j c2830j = this.h;
        int hashCode8 = (hashCode7 + (c2830j == null ? 0 : c2830j.hashCode())) * 31;
        C2836p c2836p = this.i;
        return hashCode8 + (c2836p != null ? c2836p.hashCode() : 0);
    }

    public final C2836p i() {
        return this.i;
    }

    public final String j() {
        return this.a;
    }

    public final Integer k() {
        return this.f;
    }

    public final String l() {
        return this.c;
    }

    public final String m() {
        return this.b;
    }

    public final C2830j n() {
        return this.h;
    }

    public final C2832l o() {
        return this.g;
    }

    public final C2836p p() {
        return this.i;
    }

    public final String q() {
        return this.d;
    }

    public final String r() {
        return this.e;
    }

    public String toString() {
        return "DEC(appName=" + this.a + ", ctaUrl=" + this.b + ", ctaTrackingUrl=" + this.c + ", impressionTrackingUrl=" + this.d + ", skipToDECTrackingUrl=" + this.e + ", appNameFontSize=" + this.f + ", decCta=" + this.g + ", decAppIcon=" + this.h + ", decRating=" + this.i + ')';
    }

    public final C2829i a(String str, String str2, String str3, String str4, String str5, Integer num, C2832l c2832l, C2830j c2830j, C2836p c2836p) {
        return new C2829i(str, str2, str3, str4, str5, num, c2832l, c2830j, c2836p);
    }

    public static /* synthetic */ C2829i a(C2829i c2829i, String str, String str2, String str3, String str4, String str5, Integer num, C2832l c2832l, C2830j c2830j, C2836p c2836p, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c2829i.a;
        }
        if ((i & 2) != 0) {
            str2 = c2829i.b;
        }
        if ((i & 4) != 0) {
            str3 = c2829i.c;
        }
        if ((i & 8) != 0) {
            str4 = c2829i.d;
        }
        if ((i & 16) != 0) {
            str5 = c2829i.e;
        }
        if ((i & 32) != 0) {
            num = c2829i.f;
        }
        if ((i & 64) != 0) {
            c2832l = c2829i.g;
        }
        if ((i & 128) != 0) {
            c2830j = c2829i.h;
        }
        if ((i & 256) != 0) {
            c2836p = c2829i.i;
        }
        C2830j c2830j2 = c2830j;
        C2836p c2836p2 = c2836p;
        Integer num2 = num;
        C2832l c2832l2 = c2832l;
        String str6 = str5;
        String str7 = str3;
        return c2829i.a(str, str2, str7, str4, str6, num2, c2832l2, c2830j2, c2836p2);
    }
}
