package com.vk.im.ui.views.msg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class MsgStatus {
    private static final /* synthetic */ MsgStatus[] $VALUES;
    public static final MsgStatus ERROR;
    public static final MsgStatus READ;
    public static final MsgStatus SENDING;
    public static final MsgStatus UNREAD;

    static {
        MsgStatus msgStatus = new MsgStatus("SENDING", 0);
        SENDING = msgStatus;
        MsgStatus msgStatus2 = new MsgStatus("UNREAD", 1);
        UNREAD = msgStatus2;
        MsgStatus msgStatus3 = new MsgStatus("READ", 2);
        READ = msgStatus3;
        MsgStatus msgStatus4 = new MsgStatus("ERROR", 3);
        ERROR = msgStatus4;
        $VALUES = new MsgStatus[]{msgStatus, msgStatus2, msgStatus3, msgStatus4};
    }

    public MsgStatus() {
        throw null;
    }

    public static MsgStatus valueOf(String str) {
        return (MsgStatus) Enum.valueOf(MsgStatus.class, str);
    }

    public static MsgStatus[] values() {
        return (MsgStatus[]) $VALUES.clone();
    }
}
