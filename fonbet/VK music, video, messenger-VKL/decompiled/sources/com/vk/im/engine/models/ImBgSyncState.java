package com.vk.im.engine.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImBgSyncState.kt */
/* loaded from: classes.dex */
public final class ImBgSyncState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImBgSyncState[] $VALUES;
    public static final ImBgSyncState CONNECTED;
    public static final ImBgSyncState CONNECTING;
    public static final ImBgSyncState DISCONNECTED;
    public static final ImBgSyncState REFRESHED;
    public static final ImBgSyncState REFRESHING;

    static {
        ImBgSyncState imBgSyncState = new ImBgSyncState("DISCONNECTED", 0);
        DISCONNECTED = imBgSyncState;
        ImBgSyncState imBgSyncState2 = new ImBgSyncState("CONNECTING", 1);
        CONNECTING = imBgSyncState2;
        ImBgSyncState imBgSyncState3 = new ImBgSyncState("REFRESHING", 2);
        REFRESHING = imBgSyncState3;
        ImBgSyncState imBgSyncState4 = new ImBgSyncState("REFRESHED", 3);
        REFRESHED = imBgSyncState4;
        ImBgSyncState imBgSyncState5 = new ImBgSyncState("CONNECTED", 4);
        CONNECTED = imBgSyncState5;
        ImBgSyncState[] imBgSyncStateArr = {imBgSyncState, imBgSyncState2, imBgSyncState3, imBgSyncState4, imBgSyncState5};
        $VALUES = imBgSyncStateArr;
        $ENTRIES = new asp(imBgSyncStateArr);
    }

    public ImBgSyncState() {
        throw null;
    }

    public static ImBgSyncState valueOf(String str) {
        return (ImBgSyncState) Enum.valueOf(ImBgSyncState.class, str);
    }

    public static ImBgSyncState[] values() {
        return (ImBgSyncState[]) $VALUES.clone();
    }
}
