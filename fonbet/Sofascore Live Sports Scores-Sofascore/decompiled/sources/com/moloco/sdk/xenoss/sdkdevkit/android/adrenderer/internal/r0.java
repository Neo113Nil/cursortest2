package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.dmi;
import defpackage.wv8;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r0 {
    public final Float a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public r0(Float f, String str, String str2, int i, int i2) {
        this.a = f;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.c(this.a, r0Var.a) && this.b.equals(r0Var.b) && this.c.equals(r0Var.c) && this.d == r0Var.d && this.e == r0Var.e;
    }

    public final int hashCode() {
        Float f = this.a;
        return Integer.hashCode(this.e) + wv8.a(this.d, dmi.c(dmi.c((f == null ? 0 : f.hashCode()) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DECRating(value=");
        sb.append(this.a);
        sb.append(", foregroundColor=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        sb.append(this.c);
        sb.append(", size=");
        sb.append(this.d);
        sb.append(", fontSize=");
        return wv8.j(sb, this.e, ')');
    }
}
