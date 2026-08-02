package androidx.camera.core.impl;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class CameraCaptureMetaData$AfMode {
    private static final /* synthetic */ CameraCaptureMetaData$AfMode[] $VALUES;
    public static final CameraCaptureMetaData$AfMode OFF;
    public static final CameraCaptureMetaData$AfMode ON_CONTINUOUS_AUTO;
    public static final CameraCaptureMetaData$AfMode ON_MANUAL_AUTO;
    public static final CameraCaptureMetaData$AfMode UNKNOWN;

    static {
        CameraCaptureMetaData$AfMode cameraCaptureMetaData$AfMode = new CameraCaptureMetaData$AfMode(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        UNKNOWN = cameraCaptureMetaData$AfMode;
        CameraCaptureMetaData$AfMode cameraCaptureMetaData$AfMode2 = new CameraCaptureMetaData$AfMode("OFF", 1);
        OFF = cameraCaptureMetaData$AfMode2;
        CameraCaptureMetaData$AfMode cameraCaptureMetaData$AfMode3 = new CameraCaptureMetaData$AfMode("ON_MANUAL_AUTO", 2);
        ON_MANUAL_AUTO = cameraCaptureMetaData$AfMode3;
        CameraCaptureMetaData$AfMode cameraCaptureMetaData$AfMode4 = new CameraCaptureMetaData$AfMode("ON_CONTINUOUS_AUTO", 3);
        ON_CONTINUOUS_AUTO = cameraCaptureMetaData$AfMode4;
        $VALUES = new CameraCaptureMetaData$AfMode[]{cameraCaptureMetaData$AfMode, cameraCaptureMetaData$AfMode2, cameraCaptureMetaData$AfMode3, cameraCaptureMetaData$AfMode4};
    }

    public CameraCaptureMetaData$AfMode() {
        throw null;
    }

    public static CameraCaptureMetaData$AfMode valueOf(String str) {
        return (CameraCaptureMetaData$AfMode) Enum.valueOf(CameraCaptureMetaData$AfMode.class, str);
    }

    public static CameraCaptureMetaData$AfMode[] values() {
        return (CameraCaptureMetaData$AfMode[]) $VALUES.clone();
    }
}
