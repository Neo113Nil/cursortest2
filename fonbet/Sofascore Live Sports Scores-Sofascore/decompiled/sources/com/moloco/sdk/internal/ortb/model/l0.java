package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.m;
import defpackage.r5h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class l0 {

    @NotNull
    public static final m.b Companion = new m.b();
    public final String a;
    public final j0 b;

    public /* synthetic */ l0(int i, String str, j0 j0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = j0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.c(this.a, l0Var.a) && Intrinsics.c(this.b, l0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        j0 j0Var = this.b;
        return hashCode + (j0Var != null ? j0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CreativeRenderingCheckEvent(eventLink=" + this.a + ", config=" + this.b + ')';
    }
}
