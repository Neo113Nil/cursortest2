package com.vk.media.camera;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CameraObject.kt */
/* loaded from: classes3.dex */
public final class CameraObject$CameraMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CameraObject$CameraMode[] $VALUES;
    public static final CameraObject$CameraMode BACK;
    public static final CameraObject$CameraMode FRONT;

    static {
        CameraObject$CameraMode cameraObject$CameraMode = new CameraObject$CameraMode("FRONT", 0);
        FRONT = cameraObject$CameraMode;
        CameraObject$CameraMode cameraObject$CameraMode2 = new CameraObject$CameraMode("BACK", 1);
        BACK = cameraObject$CameraMode2;
        CameraObject$CameraMode[] cameraObject$CameraModeArr = {cameraObject$CameraMode, cameraObject$CameraMode2};
        $VALUES = cameraObject$CameraModeArr;
        $ENTRIES = new asp(cameraObject$CameraModeArr);
    }

    public CameraObject$CameraMode() {
        throw null;
    }

    public static CameraObject$CameraMode valueOf(String str) {
        return (CameraObject$CameraMode) Enum.valueOf(CameraObject$CameraMode.class, str);
    }

    public static CameraObject$CameraMode[] values() {
        return (CameraObject$CameraMode[]) $VALUES.clone();
    }
}
