package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.fc6;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class o0 {
    public final Integer a;
    public final List b;

    public o0(Integer num, List list) {
        list.getClass();
        this.a = num;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.c(this.a, o0Var.a) && Intrinsics.c(this.b, o0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DECBorder(borderWidth=");
        sb.append(this.a);
        sb.append(", gradient=");
        return fc6.p(sb, this.b, ')');
    }
}
