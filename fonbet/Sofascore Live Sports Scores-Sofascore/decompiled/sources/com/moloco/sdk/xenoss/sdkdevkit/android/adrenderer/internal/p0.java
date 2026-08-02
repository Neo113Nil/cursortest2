package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.lnb;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class p0 {
    public final Integer a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final o0 e;
    public final String f;
    public final String g;

    public p0(Integer num, String str, Integer num2, Integer num3, o0 o0Var, String str2, String str3) {
        this.a = num;
        this.b = str;
        this.c = num2;
        this.d = num3;
        this.e = o0Var;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.c(this.a, p0Var.a) && Intrinsics.c(this.b, p0Var.b) && Intrinsics.c(this.c, p0Var.c) && Intrinsics.c(this.d, p0Var.d) && Intrinsics.c(this.e, p0Var.e) && Intrinsics.c(this.f, p0Var.f) && Intrinsics.c(this.g, p0Var.g);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        o0 o0Var = this.e;
        int hashCode5 = (hashCode4 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        String str2 = this.f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DECCta(verticalSpacing=");
        sb.append(this.a);
        sb.append(", ctaText=");
        sb.append(this.b);
        sb.append(", buttonWidth=");
        sb.append(this.c);
        sb.append(", fontSize=");
        sb.append(this.d);
        sb.append(", border=");
        sb.append(this.e);
        sb.append(", foregroundColor=");
        sb.append(this.f);
        sb.append(", backgroundColor=");
        return lnb.q(sb, this.g, ')');
    }
}
