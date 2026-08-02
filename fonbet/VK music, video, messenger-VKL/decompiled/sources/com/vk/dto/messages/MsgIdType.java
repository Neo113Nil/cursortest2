package com.vk.dto.messages;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MsgIdType.kt */
/* loaded from: classes18.dex */
public final class MsgIdType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MsgIdType[] $VALUES;
    public static final MsgIdType CNV_ID;
    public static final a Companion;
    public static final MsgIdType LOCAL_ID;
    private final int id;

    /* compiled from: MsgIdType.kt */
    public static final class a {
    }

    static {
        MsgIdType msgIdType = new MsgIdType("LOCAL_ID", 0, 1);
        LOCAL_ID = msgIdType;
        MsgIdType msgIdType2 = new MsgIdType("CNV_ID", 1, 3);
        CNV_ID = msgIdType2;
        MsgIdType[] msgIdTypeArr = {msgIdType, msgIdType2};
        $VALUES = msgIdTypeArr;
        $ENTRIES = new asp(msgIdTypeArr);
        Companion = new a();
    }

    public MsgIdType(String str, int i, int i2) {
        this.id = i2;
    }

    public static MsgIdType valueOf(String str) {
        return (MsgIdType) Enum.valueOf(MsgIdType.class, str);
    }

    public static MsgIdType[] values() {
        return (MsgIdType[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
