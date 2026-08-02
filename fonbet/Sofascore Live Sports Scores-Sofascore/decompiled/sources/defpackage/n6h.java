package defpackage;

import com.sofascore.model.branding.ServerImageDisplayType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class n6h {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ServerImageDisplayType.values().length];
        try {
            iArr[ServerImageDisplayType.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ServerImageDisplayType.AD_UNIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
