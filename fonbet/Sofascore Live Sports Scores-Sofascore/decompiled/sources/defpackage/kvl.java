package defpackage;

import com.blaze.blazesdk.ads.banners.BlazeGAMBannerHandlerEventType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class kvl {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BlazeGAMBannerHandlerEventType.values().length];
        try {
            iArr[BlazeGAMBannerHandlerEventType.AD_LOADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlazeGAMBannerHandlerEventType.AD_CLICKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BlazeGAMBannerHandlerEventType.AD_IMPRESSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BlazeGAMBannerHandlerEventType.AD_REQUESTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
