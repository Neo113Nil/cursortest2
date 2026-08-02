package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.o;
import defpackage.r5h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class p0 {

    @NotNull
    public static final o.b Companion = new o.b();
    public final Integer a;
    public final String b;
    public final t0 c;

    public /* synthetic */ p0(int i, Integer num, String str, t0 t0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = t0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.c(this.a, p0Var.a) && Intrinsics.c(this.b, p0Var.b) && Intrinsics.c(this.c, p0Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        t0 t0Var = this.c;
        return hashCode2 + (t0Var != null ? t0Var.hashCode() : 0);
    }

    public final String toString() {
        return "DECAppIconSerializable(size=" + this.a + ", appIconUri=" + this.b + ", border=" + this.c + ')';
    }
}
