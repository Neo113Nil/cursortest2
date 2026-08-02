package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class M6 {
    public final float a;
    public final N6 b;
    public final ArrayList c;

    public M6(float f, N6 n6, ArrayList arrayList) {
        this.a = f;
        this.b = n6;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M6)) {
            return false;
        }
        M6 m6 = (M6) obj;
        return Float.compare(this.a, m6.a) == 0 && Intrinsics.c(this.b, m6.b) && Intrinsics.c(this.c, m6.c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        N6 n6 = this.b;
        int hashCode2 = (hashCode + (n6 == null ? 0 : n6.hashCode())) * 31;
        ArrayList arrayList = this.c;
        return hashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ExposureMetrics(exposedPercentage=" + this.a + ", visibleRectangle=" + this.b + ", occlusionRectangles=" + this.c + ")";
    }
}
