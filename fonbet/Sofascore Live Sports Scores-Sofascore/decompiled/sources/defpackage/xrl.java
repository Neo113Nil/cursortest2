package defpackage;

import com.blaze.blazesdk.ads.models.ui.AdInfoType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class xrl {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AdInfoType.values().length];
        try {
            iArr[AdInfoType.CUSTOM_NATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdInfoType.IMA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
