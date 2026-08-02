package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.p;
import defpackage.bf3;
import defpackage.r5h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class r0 {

    @NotNull
    public static final p.b Companion = new p.b();
    public final String a;
    public final Integer b;

    public /* synthetic */ r0(int i, String str, Integer num) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.c(this.a, r0Var.a) && Intrinsics.c(this.b, r0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DECAppNameSerializable(text=");
        sb.append(this.a);
        sb.append(", fontSize=");
        return bf3.n(sb, this.b, ')');
    }
}
