package com.vk.im.ui.components.viewcontrollers.msg_send;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MsgSendHidePopupsReason.kt */
/* loaded from: classes2.dex */
public final class MsgSendHidePopupsReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MsgSendHidePopupsReason[] $VALUES;
    public static final MsgSendHidePopupsReason OTHER;
    public static final MsgSendHidePopupsReason SCROLL;

    static {
        MsgSendHidePopupsReason msgSendHidePopupsReason = new MsgSendHidePopupsReason("SCROLL", 0);
        SCROLL = msgSendHidePopupsReason;
        MsgSendHidePopupsReason msgSendHidePopupsReason2 = new MsgSendHidePopupsReason(NativeAdContent.ViewTag.OTHER, 1);
        OTHER = msgSendHidePopupsReason2;
        MsgSendHidePopupsReason[] msgSendHidePopupsReasonArr = {msgSendHidePopupsReason, msgSendHidePopupsReason2};
        $VALUES = msgSendHidePopupsReasonArr;
        $ENTRIES = new asp(msgSendHidePopupsReasonArr);
    }

    public MsgSendHidePopupsReason() {
        throw null;
    }

    public static MsgSendHidePopupsReason valueOf(String str) {
        return (MsgSendHidePopupsReason) Enum.valueOf(MsgSendHidePopupsReason.class, str);
    }

    public static MsgSendHidePopupsReason[] values() {
        return (MsgSendHidePopupsReason[]) $VALUES.clone();
    }
}
