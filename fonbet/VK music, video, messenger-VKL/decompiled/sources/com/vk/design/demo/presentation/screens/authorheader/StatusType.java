package com.vk.design.demo.presentation.screens.authorheader;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthorHeaderState.kt */
/* loaded from: classes18.dex */
public final class StatusType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StatusType[] $VALUES;
    public static final StatusType DeadPerson;
    public static final StatusType None;
    public static final StatusType Offline;
    public static final StatusType Online;

    static {
        StatusType statusType = new StatusType("None", 0);
        None = statusType;
        StatusType statusType2 = new StatusType("Online", 1);
        Online = statusType2;
        StatusType statusType3 = new StatusType("Offline", 2);
        Offline = statusType3;
        StatusType statusType4 = new StatusType("DeadPerson", 3);
        DeadPerson = statusType4;
        StatusType[] statusTypeArr = {statusType, statusType2, statusType3, statusType4};
        $VALUES = statusTypeArr;
        $ENTRIES = new asp(statusTypeArr);
    }

    public StatusType() {
        throw null;
    }

    public static StatusType valueOf(String str) {
        return (StatusType) Enum.valueOf(StatusType.class, str);
    }

    public static StatusType[] values() {
        return (StatusType[]) $VALUES.clone();
    }
}
