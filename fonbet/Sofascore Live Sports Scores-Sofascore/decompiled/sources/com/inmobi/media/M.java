package com.inmobi.media;

import android.graphics.RectF;
import defpackage.me4;
import defpackage.vxd;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class M {
    public final RectF a;
    public final ArrayList b;
    public final int c;
    public final int d;

    public M(RectF rectF, ArrayList arrayList, int i, int i2) {
        rectF.getClass();
        arrayList.getClass();
        this.a = rectF;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m = (M) obj;
        return Intrinsics.c(this.a, m.a) && Intrinsics.c(this.b, m.b) && this.c == m.c && this.d == m.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + Ai.a(this.c, vxd.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        RectF rectF = this.a;
        ArrayList arrayList = this.b;
        int i = this.c;
        int i2 = this.d;
        StringBuilder sb = new StringBuilder("ExposureInputData(visibleRect=");
        sb.append(rectF);
        sb.append(", obstructions=");
        sb.append(arrayList);
        sb.append(", screenWidth=");
        return me4.i(sb, i, ", screenHeight=", i2, ")");
    }
}
