package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class I6 extends K6 {
    public final MediaView a;
    public final Jl b;

    public I6(MediaView mediaView, Jl jl) {
        mediaView.getClass();
        this.a = mediaView;
        this.b = jl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I6)) {
            return false;
        }
        I6 i6 = (I6) obj;
        return Intrinsics.c(this.a, i6.a) && Intrinsics.c(this.b, i6.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Jl jl = this.b;
        return hashCode + (jl == null ? 0 : jl.hashCode());
    }

    public final String toString() {
        return "Success(mediaView=" + this.a + ", vastBeaconData=" + this.b + ")";
    }
}
