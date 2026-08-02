package com.vk.im.ui.components.dialogs_sync_state.vc;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SyncProgressInfo.kt */
/* loaded from: classes2.dex */
public final class SyncProgressInfo {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SyncProgressInfo[] $VALUES;
    public static final SyncProgressInfo ACTUAL;
    public static final SyncProgressInfo CONNECTING;
    public static final SyncProgressInfo REFRESHING;

    static {
        SyncProgressInfo syncProgressInfo = new SyncProgressInfo("CONNECTING", 0);
        CONNECTING = syncProgressInfo;
        SyncProgressInfo syncProgressInfo2 = new SyncProgressInfo("REFRESHING", 1);
        REFRESHING = syncProgressInfo2;
        SyncProgressInfo syncProgressInfo3 = new SyncProgressInfo("ACTUAL", 2);
        ACTUAL = syncProgressInfo3;
        SyncProgressInfo[] syncProgressInfoArr = {syncProgressInfo, syncProgressInfo2, syncProgressInfo3};
        $VALUES = syncProgressInfoArr;
        $ENTRIES = new asp(syncProgressInfoArr);
    }

    public SyncProgressInfo() {
        throw null;
    }

    public static SyncProgressInfo valueOf(String str) {
        return (SyncProgressInfo) Enum.valueOf(SyncProgressInfo.class, str);
    }

    public static SyncProgressInfo[] values() {
        return (SyncProgressInfo[]) $VALUES.clone();
    }
}
