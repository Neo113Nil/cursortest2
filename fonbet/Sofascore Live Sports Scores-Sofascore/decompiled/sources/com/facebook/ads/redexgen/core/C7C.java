package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7C extends C2681hB {
    public InterfaceC2524ee A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A08(NativeAdLayout nativeAdLayout, C2652gi c2652gi, NativeAd nativeAd, C2116Vd c2116Vd) {
        C2346bk c2346bk = new C2346bk(c2652gi);
        MediaView mediaView = new MediaView(c2652gi);
        AdOptionsView adOptionsView = new AdOptionsView(c2652gi, nativeAd, nativeAdLayout);
        c2116Vd.A09(adOptionsView, 28);
        this.A00 = new F2(c2652gi, nativeAd, c2116Vd, UK.A0L(nativeAd.getInternalNativeAd()).A1C(), c2346bk, mediaView, adOptionsView);
        YB.A0N(nativeAdLayout, c2116Vd.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c2346bk, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C2022Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
