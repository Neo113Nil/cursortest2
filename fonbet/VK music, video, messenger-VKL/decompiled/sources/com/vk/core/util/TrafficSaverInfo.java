package com.vk.core.util;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MediaLoadingInfo.kt */
/* loaded from: classes17.dex */
public final class TrafficSaverInfo {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TrafficSaverInfo[] $VALUES;
    public static final TrafficSaverInfo SWITCH_OFF;
    public static final TrafficSaverInfo SWITCH_ON;

    static {
        TrafficSaverInfo trafficSaverInfo = new TrafficSaverInfo("SWITCH_OFF", 0);
        SWITCH_OFF = trafficSaverInfo;
        TrafficSaverInfo trafficSaverInfo2 = new TrafficSaverInfo("SWITCH_ON", 1);
        SWITCH_ON = trafficSaverInfo2;
        TrafficSaverInfo[] trafficSaverInfoArr = {trafficSaverInfo, trafficSaverInfo2};
        $VALUES = trafficSaverInfoArr;
        $ENTRIES = new asp(trafficSaverInfoArr);
    }

    public TrafficSaverInfo() {
        throw null;
    }

    public static TrafficSaverInfo valueOf(String str) {
        return (TrafficSaverInfo) Enum.valueOf(TrafficSaverInfo.class, str);
    }

    public static TrafficSaverInfo[] values() {
        return (TrafficSaverInfo[]) $VALUES.clone();
    }
}
