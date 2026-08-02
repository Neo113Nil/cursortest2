package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7C extends C1724hB {
    public InterfaceC1567ee A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A08(NativeAdLayout nativeAdLayout, C1695gi c1695gi, NativeAd nativeAd, C1159Vd c1159Vd) {
        C1389bk c1389bk = new C1389bk(c1695gi);
        MediaView mediaView = new MediaView(c1695gi);
        AdOptionsView adOptionsView = new AdOptionsView(c1695gi, nativeAd, nativeAdLayout);
        c1159Vd.A09(adOptionsView, 28);
        this.A00 = new F2(c1695gi, nativeAd, c1159Vd, UK.A0L(nativeAd.getInternalNativeAd()).A1C(), c1389bk, mediaView, adOptionsView);
        YB.A0N(nativeAdLayout, c1159Vd.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c1389bk, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C1065Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
