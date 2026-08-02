package com.vk.im.engine.internal.storage.delegates.messages;

import android.util.SparseArray;
import xsna.asp;
import xsna.lhg;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MsgDbType.kt */
/* loaded from: classes2.dex */
public final class MsgDbType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MsgDbType[] $VALUES;
    public static final MsgDbType CALL_ASR_FAILED;
    public static final MsgDbType CANNOT_CALL_PRIVACY_SETTINGS;
    public static final MsgDbType CHAT_AVATAR_REMOVE;
    public static final MsgDbType CHAT_AVATAR_UPDATE;
    public static final MsgDbType CHAT_CREATE;
    public static final MsgDbType CHAT_DON_KICK;
    public static final MsgDbType CHAT_JOIN_BY_LINK;
    public static final MsgDbType CHAT_MEMBER_INVITE;
    public static final MsgDbType CHAT_MEMBER_INVITE_BY_CALL;
    public static final MsgDbType CHAT_MEMBER_INVITE_BY_CALL_LINK;
    public static final MsgDbType CHAT_MEMBER_INVITE_BY_MR;
    public static final MsgDbType CHAT_MEMBER_KICK;
    public static final MsgDbType CHAT_MEMBER_KICK_CALL_BLOCK;
    public static final MsgDbType CHAT_OWNER_UDPATE;
    public static final MsgDbType CHAT_REQUEST_REJECT;
    public static final MsgDbType CHAT_REQUEST_SENT;
    public static final MsgDbType CHAT_TITLE_UPDATE;
    public static final MsgDbType CHAT_UPDATE_STYLE;
    public static final MsgDbType CUSTOM;
    public static final a Companion;
    public static final MsgDbType FROM_CHANNEL;
    public static final MsgDbType FROM_USER;
    public static final MsgDbType GROUP_CALL_STARTED;
    private static final SparseArray<MsgDbType> ID_TO_TYPE_MAP;
    public static final MsgDbType MR_ACCEPTED;
    public static final MsgDbType PIN;
    public static final MsgDbType SCREENSHOT;
    public static final MsgDbType UNPIN;
    public static final MsgDbType UNSUPPORTED;
    private final int id;

    /* compiled from: MsgDbType.kt */
    public static final class a {
        public static MsgDbType a(int i) {
            MsgDbType msgDbType = (MsgDbType) MsgDbType.ID_TO_TYPE_MAP.get(i);
            if (msgDbType != null) {
                return msgDbType;
            }
            throw new IllegalArgumentException(lhg.a(i, "Unknown id: "));
        }
    }

    static {
        MsgDbType msgDbType = new MsgDbType("UNSUPPORTED", 0, 0);
        UNSUPPORTED = msgDbType;
        MsgDbType msgDbType2 = new MsgDbType("FROM_USER", 1, 1);
        FROM_USER = msgDbType2;
        MsgDbType msgDbType3 = new MsgDbType("CHAT_CREATE", 2, 2);
        CHAT_CREATE = msgDbType3;
        MsgDbType msgDbType4 = new MsgDbType("CHAT_TITLE_UPDATE", 3, 3);
        CHAT_TITLE_UPDATE = msgDbType4;
        MsgDbType msgDbType5 = new MsgDbType("CHAT_AVATAR_UPDATE", 4, 4);
        CHAT_AVATAR_UPDATE = msgDbType5;
        MsgDbType msgDbType6 = new MsgDbType("CHAT_AVATAR_REMOVE", 5, 5);
        CHAT_AVATAR_REMOVE = msgDbType6;
        MsgDbType msgDbType7 = new MsgDbType("CHAT_MEMBER_INVITE", 6, 6);
        CHAT_MEMBER_INVITE = msgDbType7;
        MsgDbType msgDbType8 = new MsgDbType("CHAT_MEMBER_KICK", 7, 7);
        CHAT_MEMBER_KICK = msgDbType8;
        MsgDbType msgDbType9 = new MsgDbType("CHAT_JOIN_BY_LINK", 8, 8);
        CHAT_JOIN_BY_LINK = msgDbType9;
        MsgDbType msgDbType10 = new MsgDbType("PIN", 9, 9);
        PIN = msgDbType10;
        MsgDbType msgDbType11 = new MsgDbType("UNPIN", 10, 10);
        UNPIN = msgDbType11;
        MsgDbType msgDbType12 = new MsgDbType("CHAT_MEMBER_INVITE_BY_MR", 11, 11);
        CHAT_MEMBER_INVITE_BY_MR = msgDbType12;
        MsgDbType msgDbType13 = new MsgDbType("SCREENSHOT", 12, 12);
        SCREENSHOT = msgDbType13;
        MsgDbType msgDbType14 = new MsgDbType("GROUP_CALL_STARTED", 13, 13);
        GROUP_CALL_STARTED = msgDbType14;
        MsgDbType msgDbType15 = new MsgDbType("MR_ACCEPTED", 14, 14);
        MR_ACCEPTED = msgDbType15;
        MsgDbType msgDbType16 = new MsgDbType("CHAT_MEMBER_INVITE_BY_CALL", 15, 15);
        CHAT_MEMBER_INVITE_BY_CALL = msgDbType16;
        MsgDbType msgDbType17 = new MsgDbType("CHAT_MEMBER_INVITE_BY_CALL_LINK", 16, 16);
        CHAT_MEMBER_INVITE_BY_CALL_LINK = msgDbType17;
        MsgDbType msgDbType18 = new MsgDbType("CUSTOM", 17, 17);
        CUSTOM = msgDbType18;
        MsgDbType msgDbType19 = new MsgDbType("CHAT_MEMBER_KICK_CALL_BLOCK", 18, 18);
        CHAT_MEMBER_KICK_CALL_BLOCK = msgDbType19;
        MsgDbType msgDbType20 = new MsgDbType("CHAT_DON_KICK", 19, 19);
        CHAT_DON_KICK = msgDbType20;
        MsgDbType msgDbType21 = new MsgDbType("CHAT_UPDATE_STYLE", 20, 20);
        CHAT_UPDATE_STYLE = msgDbType21;
        MsgDbType msgDbType22 = new MsgDbType("FROM_CHANNEL", 21, 21);
        FROM_CHANNEL = msgDbType22;
        MsgDbType msgDbType23 = new MsgDbType("CALL_ASR_FAILED", 22, 22);
        CALL_ASR_FAILED = msgDbType23;
        MsgDbType msgDbType24 = new MsgDbType("CHAT_REQUEST_SENT", 23, 23);
        CHAT_REQUEST_SENT = msgDbType24;
        MsgDbType msgDbType25 = new MsgDbType("CHAT_REQUEST_REJECT", 24, 24);
        CHAT_REQUEST_REJECT = msgDbType25;
        MsgDbType msgDbType26 = new MsgDbType("CHAT_OWNER_UDPATE", 25, 25);
        CHAT_OWNER_UDPATE = msgDbType26;
        MsgDbType msgDbType27 = new MsgDbType("CANNOT_CALL_PRIVACY_SETTINGS", 26, 26);
        CANNOT_CALL_PRIVACY_SETTINGS = msgDbType27;
        MsgDbType[] msgDbTypeArr = {msgDbType, msgDbType2, msgDbType3, msgDbType4, msgDbType5, msgDbType6, msgDbType7, msgDbType8, msgDbType9, msgDbType10, msgDbType11, msgDbType12, msgDbType13, msgDbType14, msgDbType15, msgDbType16, msgDbType17, msgDbType18, msgDbType19, msgDbType20, msgDbType21, msgDbType22, msgDbType23, msgDbType24, msgDbType25, msgDbType26, msgDbType27};
        $VALUES = msgDbTypeArr;
        $ENTRIES = new asp(msgDbTypeArr);
        Companion = new a();
        SparseArray<MsgDbType> sparseArray = new SparseArray<>();
        for (MsgDbType msgDbType28 : values()) {
            sparseArray.put(msgDbType28.id, msgDbType28);
        }
        ID_TO_TYPE_MAP = sparseArray;
    }

    public MsgDbType(String str, int i, int i2) {
        this.id = i2;
    }

    public static MsgDbType valueOf(String str) {
        return (MsgDbType) Enum.valueOf(MsgDbType.class, str);
    }

    public static MsgDbType[] values() {
        return (MsgDbType[]) $VALUES.clone();
    }

    public final int i() {
        return this.id;
    }
}
