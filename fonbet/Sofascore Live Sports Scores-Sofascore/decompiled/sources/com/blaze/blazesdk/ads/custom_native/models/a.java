package com.blaze.blazesdk.ads.custom_native.models;

import com.blaze.blazesdk.ads.custom_native.models.BlazeGoogleCustomNativeAdModel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BlazeGoogleCustomNativeAdModel.CtaModel.CTAType.values().length];
        try {
            iArr[BlazeGoogleCustomNativeAdModel.CtaModel.CTAType.DEEPLINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlazeGoogleCustomNativeAdModel.CtaModel.CTAType.WEB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
