package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final p0 g;
    public final n0 h;
    public final r0 i;

    public m0(String str, String str2, String str3, String str4, String str5, Integer num, p0 p0Var, n0 n0Var, r0 r0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = num;
        this.g = p0Var;
        this.h = n0Var;
        this.i = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.c(this.a, m0Var.a) && Intrinsics.c(this.b, m0Var.b) && Intrinsics.c(this.c, m0Var.c) && Intrinsics.c(this.d, m0Var.d) && Intrinsics.c(this.e, m0Var.e) && Intrinsics.c(this.f, m0Var.f) && Intrinsics.c(this.g, m0Var.g) && Intrinsics.c(this.h, m0Var.h) && Intrinsics.c(this.i, m0Var.i);
    }

    public final int hashCode() {
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
        p0 p0Var = this.g;
        int hashCode7 = (hashCode6 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        n0 n0Var = this.h;
        int hashCode8 = (hashCode7 + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        r0 r0Var = this.i;
        return hashCode8 + (r0Var != null ? r0Var.hashCode() : 0);
    }

    public final String toString() {
        return "DEC(appName=" + this.a + ", ctaUrl=" + this.b + ", ctaTrackingUrl=" + this.c + ", impressionTrackingUrl=" + this.d + ", skipToDECTrackingUrl=" + this.e + ", appNameFontSize=" + this.f + ", decCta=" + this.g + ", decAppIcon=" + this.h + ", decRating=" + this.i + ')';
    }
}
