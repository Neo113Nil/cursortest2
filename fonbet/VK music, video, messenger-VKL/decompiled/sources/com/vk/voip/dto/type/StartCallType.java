package com.vk.voip.dto.type;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StartCallType.kt */
/* loaded from: classes7.dex */
public final class StartCallType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StartCallType[] $VALUES;
    public static final StartCallType ANONYMOUS_JOIN;
    public static final StartCallType INCOMING;
    public static final StartCallType JOIN;
    public static final StartCallType NEW_CONTACT_CALL;
    public static final StartCallType NEW_GROUP_CALL;
    public static final StartCallType NEW_ONE_TO_ONE;
    public static final StartCallType NEW_TOKENIZED_GROUP_CALL;
    public static final StartCallType NEW_TOKENIZED_ONE_TO_ONE;
    public static final StartCallType TOKENIZED_JOIN;

    static {
        StartCallType startCallType = new StartCallType("INCOMING", 0);
        INCOMING = startCallType;
        StartCallType startCallType2 = new StartCallType("ANONYMOUS_JOIN", 1);
        ANONYMOUS_JOIN = startCallType2;
        StartCallType startCallType3 = new StartCallType("TOKENIZED_JOIN", 2);
        TOKENIZED_JOIN = startCallType3;
        StartCallType startCallType4 = new StartCallType("JOIN", 3);
        JOIN = startCallType4;
        StartCallType startCallType5 = new StartCallType("NEW_CONTACT_CALL", 4);
        NEW_CONTACT_CALL = startCallType5;
        StartCallType startCallType6 = new StartCallType("NEW_TOKENIZED_GROUP_CALL", 5);
        NEW_TOKENIZED_GROUP_CALL = startCallType6;
        StartCallType startCallType7 = new StartCallType("NEW_GROUP_CALL", 6);
        NEW_GROUP_CALL = startCallType7;
        StartCallType startCallType8 = new StartCallType("NEW_TOKENIZED_ONE_TO_ONE", 7);
        NEW_TOKENIZED_ONE_TO_ONE = startCallType8;
        StartCallType startCallType9 = new StartCallType("NEW_ONE_TO_ONE", 8);
        NEW_ONE_TO_ONE = startCallType9;
        StartCallType[] startCallTypeArr = {startCallType, startCallType2, startCallType3, startCallType4, startCallType5, startCallType6, startCallType7, startCallType8, startCallType9};
        $VALUES = startCallTypeArr;
        $ENTRIES = new asp(startCallTypeArr);
    }

    public StartCallType() {
        throw null;
    }

    public static StartCallType valueOf(String str) {
        return (StartCallType) Enum.valueOf(StartCallType.class, str);
    }

    public static StartCallType[] values() {
        return (StartCallType[]) $VALUES.clone();
    }
}
