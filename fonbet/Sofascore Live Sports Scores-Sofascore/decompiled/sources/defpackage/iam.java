package defpackage;

import com.blaze.blazesdk.features.shared.models.ui_shared.BaseLayerType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class iam {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[n3m.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            n3m n3mVar = n3m.MP4;
            iArr[0] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            n3m n3mVar2 = n3m.MP4;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[BaseLayerType.values().length];
        try {
            iArr2[BaseLayerType.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[BaseLayerType.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr2;
    }
}
