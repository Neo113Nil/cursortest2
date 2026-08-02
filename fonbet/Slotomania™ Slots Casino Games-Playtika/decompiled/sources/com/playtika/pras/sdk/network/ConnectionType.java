package com.playtika.pras.sdk.network;

import org.apache.cordova.networkinformation.NetworkManager;

/* loaded from: classes7.dex */
public enum ConnectionType {
    MOBILE(NetworkManager.MOBILE),
    WIFI("wifi"),
    UNKNOWN("unknown");

    private final String connectionType;

    ConnectionType(String str) {
        this.connectionType = str;
    }

    public String getType() {
        return this.connectionType;
    }
}
