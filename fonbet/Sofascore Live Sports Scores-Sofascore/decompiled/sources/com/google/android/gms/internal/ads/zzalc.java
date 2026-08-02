package com.google.android.gms.internal.ads;

import defpackage.me4;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzalc {
    public final int a;
    public final int b;
    public final float c;

    public zzalc(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public static /* synthetic */ zzalc a(int i) {
        int i2 = i >> 13;
        if (i2 == 0) {
            return null;
        }
        return new zzalc(i2, (i >> 10) & 7, ((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzalc)) {
            return false;
        }
        zzalc zzalcVar = (zzalc) obj;
        return this.a == zzalcVar.a && this.b == zzalcVar.b && Float.compare(this.c, zzalcVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        float f = this.c;
        StringBuilder sb = new StringBuilder(wt3.h(length, 28, length2, 7, String.valueOf(f).length()) + 1);
        me4.r(sb, "GainField{name=", i, ", originator=", i2);
        sb.append(", gain=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
