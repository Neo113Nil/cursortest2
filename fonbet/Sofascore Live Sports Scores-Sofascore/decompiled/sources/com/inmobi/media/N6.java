package com.inmobi.media;

import defpackage.fc6;
import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class N6 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public N6(float f, float f2, int i, int i2) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N6)) {
            return false;
        }
        N6 n6 = (N6) obj;
        return Float.compare(this.a, n6.a) == 0 && Float.compare(this.b, n6.b) == 0 && this.c == n6.c && this.d == n6.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + Ai.a(this.c, fc6.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        int i = this.c;
        int i2 = this.d;
        StringBuilder sb = new StringBuilder("ExposureRectangle(x=");
        sb.append(f);
        sb.append(", y=");
        sb.append(f2);
        sb.append(", width=");
        return me4.i(sb, i, ", height=", i2, ")");
    }
}
