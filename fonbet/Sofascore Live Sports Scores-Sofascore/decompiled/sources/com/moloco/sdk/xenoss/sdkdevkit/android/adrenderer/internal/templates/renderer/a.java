package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import defpackage.dmi;
import defpackage.wt3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a {
    public final String a;
    public final String b;
    public final float c;

    public a(String str, String str2, float f) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && Intrinsics.c(this.b, aVar.b) && Float.compare(this.c, aVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + dmi.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreativeRenderingCheckParams(eventUrl=");
        sb.append(this.a);
        sb.append(", creativeType=");
        sb.append(this.b);
        sb.append(", opacityRate=");
        return wt3.n(sb, this.c, ')');
    }
}
