package com.vk.im.engine.internal.api_commands.diff;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessageFlag.kt */
/* loaded from: classes2.dex */
public final class MessageFlag {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessageFlag[] $VALUES;
    public static final MessageFlag CASPER_DELETION;
    public static final a Companion;
    public static final MessageFlag DELETED;
    public static final MessageFlag EDITED;
    public static final MessageFlag IMPORTANT;
    public static final MessageFlag LISTENED_AUDIO;
    public static final MessageFlag RESTORED;
    public static final MessageFlag UNIMPORTANT;
    private static final zrp<MessageFlag> values;
    private final long mask;

    /* compiled from: MessageFlag.kt */
    public static final class a {
    }

    static {
        MessageFlag messageFlag = new MessageFlag("DELETED", 0, 0);
        DELETED = messageFlag;
        MessageFlag messageFlag2 = new MessageFlag("EDITED", 1, 1);
        EDITED = messageFlag2;
        MessageFlag messageFlag3 = new MessageFlag("LISTENED_AUDIO", 2, 2);
        LISTENED_AUDIO = messageFlag3;
        MessageFlag messageFlag4 = new MessageFlag("CASPER_DELETION", 3, 3);
        CASPER_DELETION = messageFlag4;
        MessageFlag messageFlag5 = new MessageFlag("RESTORED", 4, 4);
        RESTORED = messageFlag5;
        MessageFlag messageFlag6 = new MessageFlag("IMPORTANT", 5, 5);
        IMPORTANT = messageFlag6;
        MessageFlag messageFlag7 = new MessageFlag("UNIMPORTANT", 6, 6);
        UNIMPORTANT = messageFlag7;
        MessageFlag[] messageFlagArr = {messageFlag, messageFlag2, messageFlag3, messageFlag4, messageFlag5, messageFlag6, messageFlag7};
        $VALUES = messageFlagArr;
        asp aspVar = new asp(messageFlagArr);
        $ENTRIES = aspVar;
        Companion = new a();
        values = aspVar;
    }

    public MessageFlag(String str, int i, int i2) {
        this.mask = 1 << i2;
    }

    public static MessageFlag valueOf(String str) {
        return (MessageFlag) Enum.valueOf(MessageFlag.class, str);
    }

    public static MessageFlag[] values() {
        return (MessageFlag[]) $VALUES.clone();
    }

    public final boolean i(long j) {
        return (j & this.mask) != 0;
    }
}
