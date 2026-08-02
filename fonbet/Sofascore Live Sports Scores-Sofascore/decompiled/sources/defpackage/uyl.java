package defpackage;

import com.blaze.blazesdk.delegates.models.BlazePlayerType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class uyl {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BlazePlayerType.values().length];
        try {
            iArr[BlazePlayerType.STORIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlazePlayerType.MOMENTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BlazePlayerType.VIDEOS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
