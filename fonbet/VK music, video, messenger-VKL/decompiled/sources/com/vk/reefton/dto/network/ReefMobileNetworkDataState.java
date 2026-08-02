package com.vk.reefton.dto.network;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReefMobileNetworkDataState.kt */
/* loaded from: classes5.dex */
public final class ReefMobileNetworkDataState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReefMobileNetworkDataState[] $VALUES;
    public static final ReefMobileNetworkDataState DATA_CONNECTED;
    public static final ReefMobileNetworkDataState DATA_CONNECTING;
    public static final ReefMobileNetworkDataState DATA_DISCONNECTED;
    public static final ReefMobileNetworkDataState DATA_SUSPENDED;
    public static final ReefMobileNetworkDataState DATA_UNKNOWN;

    static {
        ReefMobileNetworkDataState reefMobileNetworkDataState = new ReefMobileNetworkDataState("DATA_UNKNOWN", 0);
        DATA_UNKNOWN = reefMobileNetworkDataState;
        ReefMobileNetworkDataState reefMobileNetworkDataState2 = new ReefMobileNetworkDataState("DATA_DISCONNECTED", 1);
        DATA_DISCONNECTED = reefMobileNetworkDataState2;
        ReefMobileNetworkDataState reefMobileNetworkDataState3 = new ReefMobileNetworkDataState("DATA_CONNECTING", 2);
        DATA_CONNECTING = reefMobileNetworkDataState3;
        ReefMobileNetworkDataState reefMobileNetworkDataState4 = new ReefMobileNetworkDataState("DATA_CONNECTED", 3);
        DATA_CONNECTED = reefMobileNetworkDataState4;
        ReefMobileNetworkDataState reefMobileNetworkDataState5 = new ReefMobileNetworkDataState("DATA_SUSPENDED", 4);
        DATA_SUSPENDED = reefMobileNetworkDataState5;
        ReefMobileNetworkDataState[] reefMobileNetworkDataStateArr = {reefMobileNetworkDataState, reefMobileNetworkDataState2, reefMobileNetworkDataState3, reefMobileNetworkDataState4, reefMobileNetworkDataState5};
        $VALUES = reefMobileNetworkDataStateArr;
        $ENTRIES = new asp(reefMobileNetworkDataStateArr);
    }

    public ReefMobileNetworkDataState() {
        throw null;
    }

    public static ReefMobileNetworkDataState valueOf(String str) {
        return (ReefMobileNetworkDataState) Enum.valueOf(ReefMobileNetworkDataState.class, str);
    }

    public static ReefMobileNetworkDataState[] values() {
        return (ReefMobileNetworkDataState[]) $VALUES.clone();
    }
}
