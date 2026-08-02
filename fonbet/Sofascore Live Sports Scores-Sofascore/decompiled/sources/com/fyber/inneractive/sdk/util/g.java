package com.fyber.inneractive.sdk.util;

import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum g {
    DISPLAY("DISPLAY"),
    VIDEO_CTA("VIDEO_CTA"),
    VIDEO_CLICK("VIDEO_CLICK"),
    VAST_ENDCARD("VAST_ENDCARD"),
    DEFAULT_ENDCARD("DEFAULT_ENDCARD"),
    VIDEO_APP_INFO("VIDEO_APP_INFO"),
    FMP_ENDCARD("FMP_ENDCARD"),
    STORE_PROMO_CTA("STORE_PROMO_CTA"),
    NATIVE_CTA("NATIVE_CTA"),
    NATIVE_AD_TITLE("NATIVE_AD_TITLE"),
    NATIVE_AD_DESCRIPTION("NATIVE_AD_DESCRIPTION"),
    NATIVE_AD_RATING("NATIVE_AD_RATING"),
    NATIVE_AD_IMAGE("NATIVE_AD_IMAGE"),
    NATIVE_AD_VIDEO("NATIVE_AD_VIDEO"),
    NATIVE_AD_ICON("NATIVE_AD_ICON"),
    NATIVE_AD_ROOT("NATIVE_AD_ROOT"),
    NATIVE("NATIVE");

    private final String key;
    private String mVersion = "";
    private int mOrderShown = 0;

    g(String str) {
        this.key = str;
    }

    public final void a(String str) {
        this.mVersion = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i;
        if ((this != FMP_ENDCARD || (i = this.mOrderShown) != 1) && (i = this.mOrderShown) != 2) {
            return this.key;
        }
        Locale locale = Locale.US;
        return this.key + "_" + i;
    }

    public final String a() {
        return this.mVersion;
    }

    public final void a(int i) {
        this.mOrderShown = i;
    }
}
