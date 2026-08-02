package com.vk.stat.vkstat.event;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SendStatus.kt */
/* loaded from: classes5.dex */
public final class SendStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SendStatus[] $VALUES;
    public static final SendStatus INITIAL;
    public static final SendStatus PENDING_ON_SEND;
    public static final SendStatus SENT;

    static {
        SendStatus sendStatus = new SendStatus("INITIAL", 0);
        INITIAL = sendStatus;
        SendStatus sendStatus2 = new SendStatus("PENDING_ON_SEND", 1);
        PENDING_ON_SEND = sendStatus2;
        SendStatus sendStatus3 = new SendStatus("SENT", 2);
        SENT = sendStatus3;
        SendStatus[] sendStatusArr = {sendStatus, sendStatus2, sendStatus3};
        $VALUES = sendStatusArr;
        $ENTRIES = new asp(sendStatusArr);
    }

    public SendStatus() {
        throw null;
    }

    public static SendStatus valueOf(String str) {
        return (SendStatus) Enum.valueOf(SendStatus.class, str);
    }

    public static SendStatus[] values() {
        return (SendStatus[]) $VALUES.clone();
    }
}
