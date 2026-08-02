package com.vk.httpexecutor.api.utils.debug;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FakeNetworkConditions.kt */
/* loaded from: classes2.dex */
public final class FakeNetworkConditions {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FakeNetworkConditions[] $VALUES;
    public static final FakeNetworkConditions SERVER_ERROR;
    public static final FakeNetworkConditions SLOW_NETWORK;
    public static final FakeNetworkConditions SOCKET_TIMEOUT;

    static {
        FakeNetworkConditions fakeNetworkConditions = new FakeNetworkConditions("SOCKET_TIMEOUT", 0);
        SOCKET_TIMEOUT = fakeNetworkConditions;
        FakeNetworkConditions fakeNetworkConditions2 = new FakeNetworkConditions("SERVER_ERROR", 1);
        SERVER_ERROR = fakeNetworkConditions2;
        FakeNetworkConditions fakeNetworkConditions3 = new FakeNetworkConditions("SLOW_NETWORK", 2);
        SLOW_NETWORK = fakeNetworkConditions3;
        FakeNetworkConditions[] fakeNetworkConditionsArr = {fakeNetworkConditions, fakeNetworkConditions2, fakeNetworkConditions3};
        $VALUES = fakeNetworkConditionsArr;
        $ENTRIES = new asp(fakeNetworkConditionsArr);
    }

    public FakeNetworkConditions() {
        throw null;
    }

    public static FakeNetworkConditions valueOf(String str) {
        return (FakeNetworkConditions) Enum.valueOf(FakeNetworkConditions.class, str);
    }

    public static FakeNetworkConditions[] values() {
        return (FakeNetworkConditions[]) $VALUES.clone();
    }
}
