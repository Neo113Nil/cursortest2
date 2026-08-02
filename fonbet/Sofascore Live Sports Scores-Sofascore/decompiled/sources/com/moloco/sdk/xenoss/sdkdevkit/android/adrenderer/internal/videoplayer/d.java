package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import defpackage.dmi;
import defpackage.lnb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public d(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static d a(d dVar, boolean z) {
        boolean z2 = dVar.a;
        boolean z3 = dVar.c;
        dVar.getClass();
        return new d(z2, z, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayingState(isPlaying=");
        sb.append(this.a);
        sb.append(", isVisible=");
        sb.append(this.b);
        sb.append(", hasMore=");
        return lnb.r(sb, this.c, ')');
    }
}
