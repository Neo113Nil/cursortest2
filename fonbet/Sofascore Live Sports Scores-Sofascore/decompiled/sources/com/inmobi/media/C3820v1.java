package com.inmobi.media;

import defpackage.lnb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.v1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3820v1 {
    public final int a;
    public final int b;

    public C3820v1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3820v1)) {
            return false;
        }
        C3820v1 c3820v1 = (C3820v1) obj;
        return this.a == c3820v1.a && this.b == c3820v1.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return lnb.j(this.a, this.b, "BannerSize(widthDp=", ", heightDp=", ")");
    }
}
