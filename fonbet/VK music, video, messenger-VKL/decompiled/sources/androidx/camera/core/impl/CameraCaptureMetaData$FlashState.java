package androidx.camera.core.impl;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class CameraCaptureMetaData$FlashState {
    private static final /* synthetic */ CameraCaptureMetaData$FlashState[] $VALUES;
    public static final CameraCaptureMetaData$FlashState FIRED;
    public static final CameraCaptureMetaData$FlashState NONE;
    public static final CameraCaptureMetaData$FlashState READY;
    public static final CameraCaptureMetaData$FlashState UNKNOWN;

    static {
        CameraCaptureMetaData$FlashState cameraCaptureMetaData$FlashState = new CameraCaptureMetaData$FlashState(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        UNKNOWN = cameraCaptureMetaData$FlashState;
        CameraCaptureMetaData$FlashState cameraCaptureMetaData$FlashState2 = new CameraCaptureMetaData$FlashState("NONE", 1);
        NONE = cameraCaptureMetaData$FlashState2;
        CameraCaptureMetaData$FlashState cameraCaptureMetaData$FlashState3 = new CameraCaptureMetaData$FlashState("READY", 2);
        READY = cameraCaptureMetaData$FlashState3;
        CameraCaptureMetaData$FlashState cameraCaptureMetaData$FlashState4 = new CameraCaptureMetaData$FlashState("FIRED", 3);
        FIRED = cameraCaptureMetaData$FlashState4;
        $VALUES = new CameraCaptureMetaData$FlashState[]{cameraCaptureMetaData$FlashState, cameraCaptureMetaData$FlashState2, cameraCaptureMetaData$FlashState3, cameraCaptureMetaData$FlashState4};
    }

    public CameraCaptureMetaData$FlashState() {
        throw null;
    }

    public static CameraCaptureMetaData$FlashState valueOf(String str) {
        return (CameraCaptureMetaData$FlashState) Enum.valueOf(CameraCaptureMetaData$FlashState.class, str);
    }

    public static CameraCaptureMetaData$FlashState[] values() {
        return (CameraCaptureMetaData$FlashState[]) $VALUES.clone();
    }
}
