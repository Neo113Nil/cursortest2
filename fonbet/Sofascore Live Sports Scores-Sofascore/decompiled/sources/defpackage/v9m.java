package defpackage;

import com.blaze.blazesdk.ads.ima.BlazeIMAHandlerEventType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class v9m {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BlazeIMAHandlerEventType.values().length];
        try {
            iArr[BlazeIMAHandlerEventType.AD_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlazeIMAHandlerEventType.ALL_ADS_COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
