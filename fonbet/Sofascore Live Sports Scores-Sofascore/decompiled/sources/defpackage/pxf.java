package defpackage;

import com.sofascore.model.firebase.ParamJsonDepthLevel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class pxf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ParamJsonDepthLevel.values().length];
        try {
            iArr[ParamJsonDepthLevel.PARAM_NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ParamJsonDepthLevel.OBJECT_NAME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ParamJsonDepthLevel.OBJECT_TEXT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ParamJsonDepthLevel.PARAM_TEXT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
