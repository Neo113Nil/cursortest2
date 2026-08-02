package com.vk.network.eventhub.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConnectionState.kt */
/* loaded from: classes3.dex */
public final class ConnectionState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ConnectionState[] $VALUES;
    public static final ConnectionState CONNECTED;
    public static final ConnectionState CONNECTING;
    public static final ConnectionState DISCONNECTED;

    static {
        ConnectionState connectionState = new ConnectionState("DISCONNECTED", 0);
        DISCONNECTED = connectionState;
        ConnectionState connectionState2 = new ConnectionState("CONNECTING", 1);
        CONNECTING = connectionState2;
        ConnectionState connectionState3 = new ConnectionState("CONNECTED", 2);
        CONNECTED = connectionState3;
        ConnectionState[] connectionStateArr = {connectionState, connectionState2, connectionState3};
        $VALUES = connectionStateArr;
        $ENTRIES = new asp(connectionStateArr);
    }

    public ConnectionState() {
        throw null;
    }

    public static ConnectionState valueOf(String str) {
        return (ConnectionState) Enum.valueOf(ConnectionState.class, str);
    }

    public static ConnectionState[] values() {
        return (ConnectionState[]) $VALUES.clone();
    }
}
