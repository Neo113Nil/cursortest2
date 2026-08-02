package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import defpackage.fc6;
import defpackage.wv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j {
    public final boolean a;
    public final float b;
    public final int c;
    public final int d;

    public j(boolean z, int i, float f, int i2) {
        this.a = z;
        this.b = f;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && Float.compare(this.b, jVar.b) == 0 && this.c == jVar.c && this.d == jVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wv8.a(this.c, fc6.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdaptiveBlurConfig(enabled=");
        sb.append(this.a);
        sb.append(", gapThresholdFraction=");
        sb.append(this.b);
        sb.append(", creativeWidthPx=");
        sb.append(this.c);
        sb.append(", creativeHeightPx=");
        return wv8.j(sb, this.d, ')');
    }

    public /* synthetic */ j() {
        this(false, 0, 0.1f, 0);
    }
}
