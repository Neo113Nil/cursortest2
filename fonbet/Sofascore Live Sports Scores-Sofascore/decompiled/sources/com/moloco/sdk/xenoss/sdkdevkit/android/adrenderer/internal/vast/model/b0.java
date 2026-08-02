package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import defpackage.dmi;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b0 {
    public final c0 a;
    public final String b;
    public final y c;

    public b0(c0 c0Var, String str, y yVar) {
        c0Var.getClass();
        str.getClass();
        this.a = c0Var;
        this.b = str;
        this.c = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.a == b0Var.a && Intrinsics.c(this.b, b0Var.b) && Intrinsics.c(this.c, b0Var.c);
    }

    public final int hashCode() {
        int c = dmi.c(this.a.hashCode() * 31, 31, this.b);
        y yVar = this.c;
        return c + (yVar == null ? 0 : yVar.hashCode());
    }

    public final String toString() {
        return "Tracking(event=" + this.a + ", url=" + this.b + ", offset=" + this.c + ')';
    }
}
