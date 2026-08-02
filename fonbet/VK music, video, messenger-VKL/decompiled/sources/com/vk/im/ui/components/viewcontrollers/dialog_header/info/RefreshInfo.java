package com.vk.im.ui.components.viewcontrollers.dialog_header.info;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RefreshInfo.kt */
/* loaded from: classes2.dex */
public final class RefreshInfo {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RefreshInfo[] $VALUES;
    public static final RefreshInfo CONNECTED;
    public static final RefreshInfo CONNECTING;
    public static final RefreshInfo DISCONNECTED;
    public static final RefreshInfo REFRESHING;
    public static final RefreshInfo WAIT_FOR_NETWORK;

    static {
        RefreshInfo refreshInfo = new RefreshInfo("DISCONNECTED", 0);
        DISCONNECTED = refreshInfo;
        RefreshInfo refreshInfo2 = new RefreshInfo("WAIT_FOR_NETWORK", 1);
        WAIT_FOR_NETWORK = refreshInfo2;
        RefreshInfo refreshInfo3 = new RefreshInfo("CONNECTING", 2);
        CONNECTING = refreshInfo3;
        RefreshInfo refreshInfo4 = new RefreshInfo("CONNECTED", 3);
        CONNECTED = refreshInfo4;
        RefreshInfo refreshInfo5 = new RefreshInfo("REFRESHING", 4);
        REFRESHING = refreshInfo5;
        RefreshInfo[] refreshInfoArr = {refreshInfo, refreshInfo2, refreshInfo3, refreshInfo4, refreshInfo5};
        $VALUES = refreshInfoArr;
        $ENTRIES = new asp(refreshInfoArr);
    }

    public RefreshInfo() {
        throw null;
    }

    public static RefreshInfo valueOf(String str) {
        return (RefreshInfo) Enum.valueOf(RefreshInfo.class, str);
    }

    public static RefreshInfo[] values() {
        return (RefreshInfo[]) $VALUES.clone();
    }
}
