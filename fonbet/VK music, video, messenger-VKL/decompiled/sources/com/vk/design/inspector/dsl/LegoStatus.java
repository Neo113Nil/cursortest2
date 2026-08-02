package com.vk.design.inspector.dsl;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: isDsComponent.kt */
/* loaded from: classes18.dex */
public final class LegoStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LegoStatus[] $VALUES;
    public static final LegoStatus Adopted;
    public static final LegoStatus Any;
    public static final LegoStatus NotAdopted;

    static {
        LegoStatus legoStatus = new LegoStatus("Any", 0);
        Any = legoStatus;
        LegoStatus legoStatus2 = new LegoStatus("Adopted", 1);
        Adopted = legoStatus2;
        LegoStatus legoStatus3 = new LegoStatus("NotAdopted", 2);
        NotAdopted = legoStatus3;
        LegoStatus[] legoStatusArr = {legoStatus, legoStatus2, legoStatus3};
        $VALUES = legoStatusArr;
        $ENTRIES = new asp(legoStatusArr);
    }

    public LegoStatus() {
        throw null;
    }

    public static LegoStatus valueOf(String str) {
        return (LegoStatus) Enum.valueOf(LegoStatus.class, str);
    }

    public static LegoStatus[] values() {
        return (LegoStatus[]) $VALUES.clone();
    }
}
