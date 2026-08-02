package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h {
    public final float a;
    public final float b;

    public h(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.a, hVar.a) == 0 && Float.compare(this.b, hVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Size(widthDp=");
        sb.append(this.a);
        sb.append(", heightDp=");
        return wt3.n(sb, this.b, ')');
    }
}
