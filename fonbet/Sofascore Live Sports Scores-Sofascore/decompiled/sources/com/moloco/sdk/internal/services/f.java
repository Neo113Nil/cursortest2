package com.moloco.sdk.internal.services;

import defpackage.fc6;
import defpackage.wt3;
import defpackage.wv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f {
    public final int a;
    public final float b;
    public final int c;
    public final float d;
    public final float e;
    public final int f;
    public final float g;
    public final float h;

    public f(int i, float f, int i2, float f2, float f3, int i3, float f4, float f5) {
        this.a = i;
        this.b = f;
        this.c = i2;
        this.d = f2;
        this.e = f3;
        this.f = i3;
        this.g = f4;
        this.h = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && Float.compare(this.b, fVar.b) == 0 && this.c == fVar.c && Float.compare(this.d, fVar.d) == 0 && Float.compare(this.e, fVar.e) == 0 && this.f == fVar.f && Float.compare(this.g, fVar.g) == 0 && Float.compare(this.h, fVar.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + fc6.a(this.g, wv8.a(this.f, fc6.a(this.e, fc6.a(this.d, wv8.a(this.c, fc6.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenInfo(screenWidthPx=");
        sb.append(this.a);
        sb.append(", screenWidthDp=");
        sb.append(this.b);
        sb.append(", screenHeightPx=");
        sb.append(this.c);
        sb.append(", screenHeightDp=");
        sb.append(this.d);
        sb.append(", density=");
        sb.append(this.e);
        sb.append(", dpi=");
        sb.append(this.f);
        sb.append(", xdpi=");
        sb.append(this.g);
        sb.append(", ydpi=");
        return wt3.n(sb, this.h, ')');
    }
}
