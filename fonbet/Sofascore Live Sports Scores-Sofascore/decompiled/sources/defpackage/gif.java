package defpackage;

import com.blaze.blazesdk.analytics.enums.SeekDirection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class gif {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SeekDirection.values().length];
        try {
            iArr[SeekDirection.FORWARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SeekDirection.BACKWARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
