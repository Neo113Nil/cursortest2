package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.internal.l0;
import defpackage.lnb;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c {
    public final l0 a;
    public final String b;

    public c(l0 l0Var, String str) {
        l0Var.getClass();
        this.a = l0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.c(this.a, cVar.a) && this.b.equals(cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FetchState(sdkInitResult=");
        sb.append(this.a);
        sb.append(", fetchType=");
        return lnb.q(sb, this.b, ')');
    }
}
