package defpackage;

import com.blaze.blazesdk.app_configurations.models.logger.LogLevelDTO;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h5m {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LogLevelDTO.values().length];
        try {
            iArr[LogLevelDTO.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LogLevelDTO.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LogLevelDTO.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LogLevelDTO.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LogLevelDTO.CRITICAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
