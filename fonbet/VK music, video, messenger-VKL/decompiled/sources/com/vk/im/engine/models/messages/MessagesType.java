package com.vk.im.engine.models.messages;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesType.kt */
/* loaded from: classes2.dex */
public final class MessagesType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesType[] $VALUES;
    public static final MessagesType CHANNEL;
    public static final MessagesType DIALOG;

    static {
        MessagesType messagesType = new MessagesType("DIALOG", 0);
        DIALOG = messagesType;
        MessagesType messagesType2 = new MessagesType("CHANNEL", 1);
        CHANNEL = messagesType2;
        MessagesType[] messagesTypeArr = {messagesType, messagesType2};
        $VALUES = messagesTypeArr;
        $ENTRIES = new asp(messagesTypeArr);
    }

    public MessagesType() {
        throw null;
    }

    public static MessagesType valueOf(String str) {
        return (MessagesType) Enum.valueOf(MessagesType.class, str);
    }

    public static MessagesType[] values() {
        return (MessagesType[]) $VALUES.clone();
    }
}
