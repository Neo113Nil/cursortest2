package com.vk.im.engine.models.group;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesFromGroupType.kt */
/* loaded from: classes2.dex */
public final class MessagesFromGroupType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesFromGroupType[] $VALUES;
    public static final MessagesFromGroupType ALL;
    public static final MessagesFromGroupType BUSINESS_NOTIFY;
    public static final MessagesFromGroupType DIRECT;

    static {
        MessagesFromGroupType messagesFromGroupType = new MessagesFromGroupType("ALL", 0);
        ALL = messagesFromGroupType;
        MessagesFromGroupType messagesFromGroupType2 = new MessagesFromGroupType("BUSINESS_NOTIFY", 1);
        BUSINESS_NOTIFY = messagesFromGroupType2;
        MessagesFromGroupType messagesFromGroupType3 = new MessagesFromGroupType("DIRECT", 2);
        DIRECT = messagesFromGroupType3;
        MessagesFromGroupType[] messagesFromGroupTypeArr = {messagesFromGroupType, messagesFromGroupType2, messagesFromGroupType3};
        $VALUES = messagesFromGroupTypeArr;
        $ENTRIES = new asp(messagesFromGroupTypeArr);
    }

    public MessagesFromGroupType() {
        throw null;
    }

    public static MessagesFromGroupType valueOf(String str) {
        return (MessagesFromGroupType) Enum.valueOf(MessagesFromGroupType.class, str);
    }

    public static MessagesFromGroupType[] values() {
        return (MessagesFromGroupType[]) $VALUES.clone();
    }
}
