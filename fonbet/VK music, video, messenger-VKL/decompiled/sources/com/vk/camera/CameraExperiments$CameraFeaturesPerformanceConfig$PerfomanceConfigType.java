package com.vk.camera;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CameraExperiments.kt */
/* loaded from: classes13.dex */
public final class CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType[] $VALUES;
    public static final CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType CAMERA1;
    public static final CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType CAMERA2;
    public static final CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType DUETS_SPEED;

    static {
        CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType cameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType = new CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType("CAMERA1", 0);
        CAMERA1 = cameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType;
        CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType cameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType2 = new CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType("CAMERA2", 1);
        CAMERA2 = cameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType2;
        CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType cameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType3 = new CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType("DUETS_SPEED", 2);
        DUETS_SPEED = cameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType3;
        CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType[] cameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigTypeArr = {cameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType, cameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType2, cameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType3};
        $VALUES = cameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigTypeArr;
        $ENTRIES = new asp(cameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigTypeArr);
    }

    public CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType() {
        throw null;
    }

    public static CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType valueOf(String str) {
        return (CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType) Enum.valueOf(CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType.class, str);
    }

    public static CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType[] values() {
        return (CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType[]) $VALUES.clone();
    }
}
