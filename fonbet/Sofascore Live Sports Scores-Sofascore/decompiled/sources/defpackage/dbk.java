package defpackage;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerErrorCode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class dbk {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
        d = iArr;
        try {
            iArr[UnityAds.UnityAdsShowError.NOT_INITIALIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            d[UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            d[UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            d[UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            d[UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            d[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            d[UnityAds.UnityAdsShowError.INTERNAL_ERROR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            d[UnityAds.UnityAdsShowError.TIMEOUT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr2 = new int[UnityAds.UnityAdsLoadError.values().length];
        c = iArr2;
        try {
            iArr2[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            c[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            c[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            c[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            c[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        int[] iArr3 = new int[UnityAds.UnityAdsInitializationError.values().length];
        b = iArr3;
        try {
            iArr3[UnityAds.UnityAdsInitializationError.INTERNAL_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            b[UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            b[UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        int[] iArr4 = new int[BannerErrorCode.values().length];
        a = iArr4;
        try {
            iArr4[BannerErrorCode.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            a[BannerErrorCode.NATIVE_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            a[BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            a[BannerErrorCode.NO_FILL.ordinal()] = 4;
        } catch (NoSuchFieldError unused20) {
        }
    }
}
