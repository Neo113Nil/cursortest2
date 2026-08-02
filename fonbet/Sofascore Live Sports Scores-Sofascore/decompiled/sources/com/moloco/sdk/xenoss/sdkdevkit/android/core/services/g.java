package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g {
    public final float a;
    public final float b;

    public g(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.a, gVar.a) == 0 && Float.compare(this.b, gVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Position(topLeftXDp=");
        sb.append(this.a);
        sb.append(", topLeftYDp=");
        return wt3.n(sb, this.b, ')');
    }
}
