package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class s0 {
    public final Integer a;
    public final p0 b;
    public final n0 c;
    public final r0 d;

    public s0(Integer num, p0 p0Var, n0 n0Var, r0 r0Var) {
        this.a = num;
        this.b = p0Var;
        this.c = n0Var;
        this.d = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.c(this.a, s0Var.a) && Intrinsics.c(this.b, s0Var.b) && Intrinsics.c(this.c, s0Var.c) && Intrinsics.c(this.d, s0Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        p0 p0Var = this.b;
        int hashCode2 = (hashCode + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        n0 n0Var = this.c;
        int hashCode3 = (hashCode2 + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        r0 r0Var = this.d;
        return hashCode3 + (r0Var != null ? r0Var.hashCode() : 0);
    }

    public final String toString() {
        return "DECRenderingData(appNameFontSize=" + this.a + ", decCTA=" + this.b + ", decAppIcon=" + this.c + ", decRating=" + this.d + ')';
    }
}
