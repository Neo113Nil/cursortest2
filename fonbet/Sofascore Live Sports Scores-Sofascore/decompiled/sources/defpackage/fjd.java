package defpackage;

import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLinkActionHandleType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class fjd {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BlazeLinkActionHandleType.values().length];
        try {
            iArr[BlazeLinkActionHandleType.DEEPLINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlazeLinkActionHandleType.WEB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BlazeLinkActionHandleType.HANDLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            BlazeLinkActionHandleType.Companion companion = BlazeLinkActionHandleType.b;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
