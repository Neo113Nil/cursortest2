package defpackage;

import com.blaze.blazesdk.ads.custom_native.BlazeGoogleCustomNativeAdsHandler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class e94 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BlazeGoogleCustomNativeAdsHandler.EventType.values().length];
        try {
            iArr[BlazeGoogleCustomNativeAdsHandler.EventType.OPENED_AD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlazeGoogleCustomNativeAdsHandler.EventType.CTA_CLICKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
