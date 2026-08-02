package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.v;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class d1 {

    @NotNull
    public static final v.b Companion = new v.b();
    public final String a;

    public d1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            oea.z(i, 1, c1.b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && Intrinsics.c(this.a, ((d1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lnb.q(new StringBuilder("GradientColor(color="), this.a, ')');
    }
}
