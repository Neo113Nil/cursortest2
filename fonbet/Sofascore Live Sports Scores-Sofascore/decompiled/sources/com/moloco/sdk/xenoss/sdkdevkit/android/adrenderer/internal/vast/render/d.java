package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import defpackage.x7k;
import defpackage.y7k;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d extends f {
    public final int a;

    public d(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.a == ((d) obj).a;
    }

    public final int hashCode() {
        x7k x7kVar = y7k.b;
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Countdown(seconds=");
        x7k x7kVar = y7k.b;
        sb.append((Object) String.valueOf(this.a & 4294967295L));
        sb.append(')');
        return sb.toString();
    }
}
