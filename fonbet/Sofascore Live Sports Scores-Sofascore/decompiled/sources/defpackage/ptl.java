package defpackage;

import com.blaze.blazesdk.shared.models.BlazeEntryPointTriggerSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class ptl {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BlazeEntryPointTriggerSource.values().length];
        try {
            iArr[BlazeEntryPointTriggerSource.NOTIFICATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlazeEntryPointTriggerSource.DEEPLINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BlazeEntryPointTriggerSource.ENTRYPOINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
