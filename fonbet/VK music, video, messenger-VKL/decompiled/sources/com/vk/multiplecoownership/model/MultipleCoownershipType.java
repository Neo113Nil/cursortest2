package com.vk.multiplecoownership.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MultipleCoownershipModel.kt */
/* loaded from: classes3.dex */
public final class MultipleCoownershipType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MultipleCoownershipType[] $VALUES;
    public static final MultipleCoownershipType Approve;
    public static final MultipleCoownershipType Reject;

    static {
        MultipleCoownershipType multipleCoownershipType = new MultipleCoownershipType("Approve", 0);
        Approve = multipleCoownershipType;
        MultipleCoownershipType multipleCoownershipType2 = new MultipleCoownershipType("Reject", 1);
        Reject = multipleCoownershipType2;
        MultipleCoownershipType[] multipleCoownershipTypeArr = {multipleCoownershipType, multipleCoownershipType2};
        $VALUES = multipleCoownershipTypeArr;
        $ENTRIES = new asp(multipleCoownershipTypeArr);
    }

    public MultipleCoownershipType() {
        throw null;
    }

    public static MultipleCoownershipType valueOf(String str) {
        return (MultipleCoownershipType) Enum.valueOf(MultipleCoownershipType.class, str);
    }

    public static MultipleCoownershipType[] values() {
        return (MultipleCoownershipType[]) $VALUES.clone();
    }
}
