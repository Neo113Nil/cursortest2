package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.s;
import defpackage.bf3;
import defpackage.r5h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class x0 {

    @NotNull
    public static final s.b Companion = new s.b();
    public final Float a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;

    public /* synthetic */ x0(int i, Float f, String str, String str2, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = f;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.c(this.a, x0Var.a) && Intrinsics.c(this.b, x0Var.b) && Intrinsics.c(this.c, x0Var.c) && Intrinsics.c(this.d, x0Var.d) && Intrinsics.c(this.e, x0Var.e);
    }

    public final int hashCode() {
        Float f = this.a;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DECRatingSerializable(ratingValue=");
        sb.append(this.a);
        sb.append(", foregroundColor=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        sb.append(this.c);
        sb.append(", size=");
        sb.append(this.d);
        sb.append(", fontSize=");
        return bf3.n(sb, this.e, ')');
    }
}
