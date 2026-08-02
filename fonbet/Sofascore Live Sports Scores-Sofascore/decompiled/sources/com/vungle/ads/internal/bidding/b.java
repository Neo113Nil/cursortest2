package com.vungle.ads.internal.bidding;

import com.iab.omid.library.vungle.internal.l;
import defpackage.lnb;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b {
    public final String a;
    public final String b;

    public b(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.c(this.a, bVar.a) && Intrinsics.c(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a = l.a("BiddingTokenInfo(bidToken=");
        a.append(this.a);
        a.append(", errorMessage=");
        return lnb.q(a, this.b, ')');
    }
}
