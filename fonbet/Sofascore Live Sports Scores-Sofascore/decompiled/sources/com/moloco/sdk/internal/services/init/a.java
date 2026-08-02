package com.moloco.sdk.internal.services.init;

import defpackage.lnb;
import defpackage.mz1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a {
    public final String a;

    public a(String str) {
        str.getClass();
        this.a = str;
    }

    public final String a() {
        return mz1.o(new StringBuilder(), this.a, "___v1");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.c(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lnb.q(new StringBuilder("CacheKey(appKey="), this.a, ')');
    }
}
