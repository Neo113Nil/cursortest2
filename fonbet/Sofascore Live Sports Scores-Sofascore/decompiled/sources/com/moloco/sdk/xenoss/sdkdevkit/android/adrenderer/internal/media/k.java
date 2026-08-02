package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import defpackage.dmi;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class k {
    public final int a;
    public final boolean b;
    public final double c;

    public k(double d, int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b == kVar.b && Double.compare(this.c, kVar.c) == 0;
    }

    public final int hashCode() {
        return Integer.hashCode(209715200) + dmi.b(dmi.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "MediaConfig(chunkSize=" + this.a + ", isStreamingEnabled=" + this.b + ", minStreamingPlayableDurationOnTimeoutSecs=" + this.c + ", mediaCacheDiskCleanUpLimit=209715200)";
    }
}
