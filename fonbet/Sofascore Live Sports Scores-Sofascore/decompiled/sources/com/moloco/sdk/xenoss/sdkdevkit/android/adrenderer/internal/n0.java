package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class n0 {
    public final Integer a;
    public final String b;
    public final o0 c;

    public n0(Integer num, String str, o0 o0Var) {
        this.a = num;
        this.b = str;
        this.c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.c(this.a, n0Var.a) && Intrinsics.c(this.b, n0Var.b) && Intrinsics.c(this.c, n0Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        o0 o0Var = this.c;
        return hashCode2 + (o0Var != null ? o0Var.hashCode() : 0);
    }

    public final String toString() {
        return "DECAppIcon(size=" + this.a + ", appIconUri=" + this.b + ", border=" + this.c + ')';
    }
}
