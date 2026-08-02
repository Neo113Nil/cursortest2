package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.api.NativeAdViewApi;

/* loaded from: assets/audience_network/classes2.dex */
public final class S4 implements NativeAdViewApi {
    public static View A00(C1695gi c1695gi, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C1159Vd c1159Vd = (C1159Vd) nativeAdViewAttributes.getInternalAttributes();
        UK internalNativeAd = UK.A0L(nativeAd.getInternalNativeAd());
        internalNativeAd.A1h(EnumC1160Ve.A00(type.getEnumCode()));
        internalNativeAd.A1g(c1159Vd);
        C7C c7c = new C7C();
        NativeAdLayout mediumRectTemplateLayout = new NativeAdLayout(c1695gi, c7c);
        c7c.A08(mediumRectTemplateLayout, c1695gi, nativeAd, c1159Vd);
        mediumRectTemplateLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (XX.A02 * type.getHeight())));
        return mediumRectTemplateLayout;
    }

    public static View A01(C1695gi c1695gi, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        UK A0L = UK.A0L(nativeAd.getInternalNativeAd());
        C1159Vd c1159Vd = (C1159Vd) nativeAdViewAttributes.getInternalAttributes();
        A0L.A1h(EnumC1160Ve.A0B);
        A0L.A1g(c1159Vd);
        C7C c7c = new C7C();
        NativeAdLayout nativeAdLayout = new NativeAdLayout(c1695gi, c7c);
        c7c.A08(nativeAdLayout, c1695gi, nativeAd, c1159Vd);
        return nativeAdLayout;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd) {
        return render(context, nativeAd, (NativeAdViewAttributes) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type) {
        return render(context, nativeAd, type, null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        try {
            return A00(C1068Rp.A03(context), nativeAd, type, nativeAdViewAttributes);
        } catch (Throwable th) {
            return Z4.A00(C1068Rp.A03(context), th);
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        C1695gi contextWrapper;
        try {
            if (context instanceof C1695gi) {
                contextWrapper = (C1695gi) context;
            } else {
                contextWrapper = C1068Rp.A03(context);
            }
            return A01(contextWrapper, nativeAd, nativeAdViewAttributes);
        } catch (Throwable th) {
            return Z4.A00(C1068Rp.A03(context), th);
        }
    }
}
