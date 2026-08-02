package com.moloco.sdk.internal.services.bidtoken;

import defpackage.dmi;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m {
    public final String a;
    public final String b;
    public final g c;

    public m(String str, String str2, g gVar) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.c(this.a, mVar.a) && Intrinsics.c(this.b, mVar.b) && this.c.equals(mVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c.a) + dmi.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "BidTokenResponseComponents(bidToken=" + this.a + ", publicKey=" + this.b + ", bidTokenConfig=" + this.c + ')';
    }
}
