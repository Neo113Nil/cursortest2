package defpackage;

import com.blaze.blazesdk.analytics.enums.SeekType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class tym {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SeekType.values().length];
        try {
            iArr[SeekType.SEEK_BAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SeekType.DOUBLE_TAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SeekType.SEEK_BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
