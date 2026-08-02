package defpackage;

import com.blaze.blazesdk.analytics.enums.ContentType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class kxl {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ContentType.values().length];
        try {
            iArr[ContentType.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContentType.STORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ContentType.MOMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
