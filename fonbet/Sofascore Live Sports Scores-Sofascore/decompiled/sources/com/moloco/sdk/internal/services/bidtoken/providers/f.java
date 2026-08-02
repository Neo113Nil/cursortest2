package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.services.d0;
import defpackage.bf3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f {
    public final d0 a;
    public final Integer b;

    public f(d0 d0Var, Integer num) {
        this.a = d0Var;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && Intrinsics.c(this.b, fVar.b);
    }

    public final int hashCode() {
        d0 d0Var = this.a;
        int hashCode = (d0Var == null ? 0 : d0Var.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSignal(muteSwitchState=");
        sb.append(this.a);
        sb.append(", mediaVolume=");
        return bf3.n(sb, this.b, ')');
    }
}
