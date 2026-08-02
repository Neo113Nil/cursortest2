package defpackage;

import com.blaze.blazesdk.ads.models.ui.AdInfoType;
import com.blaze.blazesdk.ads.models.ui.BlazeMomentsAdsConfigType;
import com.blaze.blazesdk.ads.models.ui.BlazeStoriesAdsConfigType;
import com.blaze.blazesdk.ads.models.ui.BlazeVideosAdsConfigType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ssl {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[BlazeStoriesAdsConfigType.values().length];
        try {
            iArr[BlazeStoriesAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlazeStoriesAdsConfigType.EVERY_X_STORIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BlazeStoriesAdsConfigType.FIXED_PAGES_INDEX.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BlazeStoriesAdsConfigType.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[BlazeMomentsAdsConfigType.values().length];
        try {
            iArr2[BlazeMomentsAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[BlazeMomentsAdsConfigType.EVERY_X_MOMENTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[BlazeMomentsAdsConfigType.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[BlazeVideosAdsConfigType.values().length];
        try {
            iArr3[BlazeVideosAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[BlazeVideosAdsConfigType.FIXED_PERCENTAGES.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[BlazeVideosAdsConfigType.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
        int[] iArr4 = new int[AdInfoType.values().length];
        try {
            iArr4[AdInfoType.IMA.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[AdInfoType.CUSTOM_NATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
    }
}
