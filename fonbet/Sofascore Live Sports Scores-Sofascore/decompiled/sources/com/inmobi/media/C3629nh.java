package com.inmobi.media;

import defpackage.lnb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.nh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3629nh {
    public int a = 0;
    public int b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3629nh)) {
            return false;
        }
        C3629nh c3629nh = (C3629nh) obj;
        return this.a == c3629nh.a && this.b == c3629nh.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return lnb.j(this.a, this.b, "PurchaseData(noOfInAppPurchases=", ", noOfSubscriptions=", ")");
    }
}
