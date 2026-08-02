package com.vk.video.ui.discovery.minimizable.fullscreen_lock;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FullscreenOrientationLockType.kt */
/* loaded from: classes7.dex */
public final class FullscreenOrientationLockType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FullscreenOrientationLockType[] $VALUES;
    public static final FullscreenOrientationLockType None;
    public static final FullscreenOrientationLockType Portrait;
    public static final FullscreenOrientationLockType SensorLandscape;

    static {
        FullscreenOrientationLockType fullscreenOrientationLockType = new FullscreenOrientationLockType("Portrait", 0);
        Portrait = fullscreenOrientationLockType;
        FullscreenOrientationLockType fullscreenOrientationLockType2 = new FullscreenOrientationLockType("SensorLandscape", 1);
        SensorLandscape = fullscreenOrientationLockType2;
        FullscreenOrientationLockType fullscreenOrientationLockType3 = new FullscreenOrientationLockType("None", 2);
        None = fullscreenOrientationLockType3;
        FullscreenOrientationLockType[] fullscreenOrientationLockTypeArr = {fullscreenOrientationLockType, fullscreenOrientationLockType2, fullscreenOrientationLockType3};
        $VALUES = fullscreenOrientationLockTypeArr;
        $ENTRIES = new asp(fullscreenOrientationLockTypeArr);
    }

    public FullscreenOrientationLockType() {
        throw null;
    }

    public static FullscreenOrientationLockType valueOf(String str) {
        return (FullscreenOrientationLockType) Enum.valueOf(FullscreenOrientationLockType.class, str);
    }

    public static FullscreenOrientationLockType[] values() {
        return (FullscreenOrientationLockType[]) $VALUES.clone();
    }
}
