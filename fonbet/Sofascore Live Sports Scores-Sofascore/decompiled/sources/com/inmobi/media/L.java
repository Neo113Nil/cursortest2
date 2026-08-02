package com.inmobi.media;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class L {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final RectF d;

    public L(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4) {
        this.a = rectF;
        this.b = rectF2;
        this.c = rectF3;
        this.d = rectF4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l = (L) obj;
        return Intrinsics.c(this.a, l.a) && Intrinsics.c(this.b, l.b) && Intrinsics.c(this.c, l.c) && Intrinsics.c(this.d, l.d);
    }

    public final int hashCode() {
        RectF rectF = this.a;
        int hashCode = (rectF == null ? 0 : rectF.hashCode()) * 31;
        RectF rectF2 = this.b;
        int hashCode2 = (hashCode + (rectF2 == null ? 0 : rectF2.hashCode())) * 31;
        RectF rectF3 = this.c;
        int hashCode3 = (hashCode2 + (rectF3 == null ? 0 : rectF3.hashCode())) * 31;
        RectF rectF4 = this.d;
        return hashCode3 + (rectF4 != null ? rectF4.hashCode() : 0);
    }

    public final String toString() {
        return "CurvedEdges(topLeft=" + this.a + ", topRight=" + this.b + ", bottomLeft=" + this.c + ", bottomRight=" + this.d + ")";
    }
}
