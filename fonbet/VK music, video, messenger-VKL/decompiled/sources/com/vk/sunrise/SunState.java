package com.vk.sunrise;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SunState.kt */
/* loaded from: classes11.dex */
public final class SunState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SunState[] $VALUES;
    public static final SunState DOWN;
    public static final SunState UNKNOWN;
    public static final SunState UP;

    static {
        SunState sunState = new SunState("UP", 0);
        UP = sunState;
        SunState sunState2 = new SunState("DOWN", 1);
        DOWN = sunState2;
        SunState sunState3 = new SunState(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        UNKNOWN = sunState3;
        SunState[] sunStateArr = {sunState, sunState2, sunState3};
        $VALUES = sunStateArr;
        $ENTRIES = new asp(sunStateArr);
    }

    public SunState() {
        throw null;
    }

    public static SunState valueOf(String str) {
        return (SunState) Enum.valueOf(SunState.class, str);
    }

    public static SunState[] values() {
        return (SunState[]) $VALUES.clone();
    }
}
