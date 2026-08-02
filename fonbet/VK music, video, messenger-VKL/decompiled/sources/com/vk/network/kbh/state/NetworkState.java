package com.vk.network.kbh.state;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetworkState.kt */
/* loaded from: classes3.dex */
public final class NetworkState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NetworkState[] $VALUES;
    public static final NetworkState STABLE;
    public static final NetworkState UNKNOWN;
    public static final NetworkState UNSTABLE;

    static {
        NetworkState networkState = new NetworkState(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        UNKNOWN = networkState;
        NetworkState networkState2 = new NetworkState("STABLE", 1);
        STABLE = networkState2;
        NetworkState networkState3 = new NetworkState("UNSTABLE", 2);
        UNSTABLE = networkState3;
        NetworkState[] networkStateArr = {networkState, networkState2, networkState3};
        $VALUES = networkStateArr;
        $ENTRIES = new asp(networkStateArr);
    }

    public NetworkState() {
        throw null;
    }

    public static NetworkState valueOf(String str) {
        return (NetworkState) Enum.valueOf(NetworkState.class, str);
    }

    public static NetworkState[] values() {
        return (NetworkState[]) $VALUES.clone();
    }
}
