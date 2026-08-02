package defpackage;

import com.sofascore.model.database.DisplayType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class uc4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DisplayType.values().length];
        try {
            iArr[DisplayType.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DisplayType.CHRONOLOGICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
