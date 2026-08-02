package com.vk.im.ui.reporters;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShareType.kt */
/* loaded from: classes2.dex */
public final class ShareType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShareType[] $VALUES;
    public static final ShareType BUTTON;
    public static final ShareType MSG_ACTION;
    public static final ShareType SELECTION_ACTION;

    static {
        ShareType shareType = new ShareType("BUTTON", 0);
        BUTTON = shareType;
        ShareType shareType2 = new ShareType("MSG_ACTION", 1);
        MSG_ACTION = shareType2;
        ShareType shareType3 = new ShareType("SELECTION_ACTION", 2);
        SELECTION_ACTION = shareType3;
        ShareType[] shareTypeArr = {shareType, shareType2, shareType3};
        $VALUES = shareTypeArr;
        $ENTRIES = new asp(shareTypeArr);
    }

    public ShareType() {
        throw null;
    }

    public static ShareType valueOf(String str) {
        return (ShareType) Enum.valueOf(ShareType.class, str);
    }

    public static ShareType[] values() {
        return (ShareType[]) $VALUES.clone();
    }
}
