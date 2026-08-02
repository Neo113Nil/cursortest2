package defpackage;

import com.blaze.blazesdk.ads.ima.BlazeIMAHandlerEventType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class drl {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BlazeIMAHandlerEventType.values().length];
        try {
            iArr[BlazeIMAHandlerEventType.ALL_ADS_COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlazeIMAHandlerEventType.AD_CLICKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BlazeIMAHandlerEventType.AD_COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BlazeIMAHandlerEventType.AD_LOADED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BlazeIMAHandlerEventType.AD_PAUSED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BlazeIMAHandlerEventType.AD_RESUMED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[BlazeIMAHandlerEventType.AD_SKIPPED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[BlazeIMAHandlerEventType.AD_STARTED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[BlazeIMAHandlerEventType.AD_TAPPED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[BlazeIMAHandlerEventType.AD_FIRST_QUARTILE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[BlazeIMAHandlerEventType.AD_MIDPOINT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[BlazeIMAHandlerEventType.AD_THIRD_QUARTILE.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[BlazeIMAHandlerEventType.AD_REQUESTED.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        a = iArr;
    }
}
