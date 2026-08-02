package com.vk.im.ui.components.dialogs_header.vc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HeaderInfo {
    private static final /* synthetic */ HeaderInfo[] $VALUES;
    public static final HeaderInfo CONNECTED;
    public static final HeaderInfo CONNECTING;
    public static final HeaderInfo REFRESHING;
    public static final HeaderInfo WAIT_FOR_NETWORK;

    static {
        HeaderInfo headerInfo = new HeaderInfo("WAIT_FOR_NETWORK", 0);
        WAIT_FOR_NETWORK = headerInfo;
        HeaderInfo headerInfo2 = new HeaderInfo("CONNECTING", 1);
        CONNECTING = headerInfo2;
        HeaderInfo headerInfo3 = new HeaderInfo("CONNECTED", 2);
        CONNECTED = headerInfo3;
        HeaderInfo headerInfo4 = new HeaderInfo("REFRESHING", 3);
        REFRESHING = headerInfo4;
        $VALUES = new HeaderInfo[]{headerInfo, headerInfo2, headerInfo3, headerInfo4};
    }

    public HeaderInfo() {
        throw null;
    }

    public static HeaderInfo valueOf(String str) {
        return (HeaderInfo) Enum.valueOf(HeaderInfo.class, str);
    }

    public static HeaderInfo[] values() {
        return (HeaderInfo[]) $VALUES.clone();
    }
}
