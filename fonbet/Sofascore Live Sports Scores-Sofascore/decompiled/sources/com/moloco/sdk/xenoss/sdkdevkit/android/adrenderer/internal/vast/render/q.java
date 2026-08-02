package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import defpackage.wv8;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class q extends r {
    public final String a;
    public final int b;
    public final int c;

    public q(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.c(this.a, qVar.a) && this.b == qVar.b && this.c == qVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Image(imageUrl=");
        sb.append(this.a);
        sb.append(", w=");
        sb.append(this.b);
        sb.append(", h=");
        return wv8.j(sb, this.c, ')');
    }
}
