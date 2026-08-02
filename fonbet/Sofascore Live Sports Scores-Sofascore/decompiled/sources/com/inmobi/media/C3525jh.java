package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.jh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3525jh {
    public final InMobiNativeViewData a;
    public final MediaView b;
    public final View c;

    public C3525jh(InMobiNativeViewData inMobiNativeViewData, MediaView mediaView, View view) {
        inMobiNativeViewData.getClass();
        this.a = inMobiNativeViewData;
        this.b = mediaView;
        this.c = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3525jh)) {
            return false;
        }
        C3525jh c3525jh = (C3525jh) obj;
        return Intrinsics.c(this.a, c3525jh.a) && Intrinsics.c(this.b, c3525jh.b) && Intrinsics.c(this.c, c3525jh.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MediaView mediaView = this.b;
        int hashCode2 = (hashCode + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.c;
        return hashCode2 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "PublisherNativeViewData(pubView=" + this.a + ", mediaView=" + this.b + ", adChoice=" + this.c + ")";
    }
}
