package com.fyber.inneractive.sdk.protobuf;

import com.facebook.soloader.MinElf;

/* loaded from: classes12.dex */
public final class g0 {
    public final Object a;
    public final int b;

    public g0(int i, Object obj) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.a == g0Var.a && this.b == g0Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * MinElf.PN_XNUM) + this.b;
    }
}
