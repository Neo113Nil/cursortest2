package com.vk.im.ui.components.viewcontrollers.msg_send;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MsgSendOptionsPopup.kt */
/* loaded from: classes2.dex */
public final class MsgSendOptionsPopup$Option {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MsgSendOptionsPopup$Option[] $VALUES;
    public static final MsgSendOptionsPopup$Option DELAYED;
    public static final MsgSendOptionsPopup$Option MUTED;

    static {
        MsgSendOptionsPopup$Option msgSendOptionsPopup$Option = new MsgSendOptionsPopup$Option("MUTED", 0);
        MUTED = msgSendOptionsPopup$Option;
        MsgSendOptionsPopup$Option msgSendOptionsPopup$Option2 = new MsgSendOptionsPopup$Option("DELAYED", 1);
        DELAYED = msgSendOptionsPopup$Option2;
        MsgSendOptionsPopup$Option[] msgSendOptionsPopup$OptionArr = {msgSendOptionsPopup$Option, msgSendOptionsPopup$Option2};
        $VALUES = msgSendOptionsPopup$OptionArr;
        $ENTRIES = new asp(msgSendOptionsPopup$OptionArr);
    }

    public MsgSendOptionsPopup$Option() {
        throw null;
    }

    public static MsgSendOptionsPopup$Option valueOf(String str) {
        return (MsgSendOptionsPopup$Option) Enum.valueOf(MsgSendOptionsPopup$Option.class, str);
    }

    public static MsgSendOptionsPopup$Option[] values() {
        return (MsgSendOptionsPopup$Option[]) $VALUES.clone();
    }
}
