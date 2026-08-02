package com.vk.superapp.base.js.bridge.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PersonalDiscountDialogType.kt */
/* loaded from: classes6.dex */
public final class PersonalDiscountDialogType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PersonalDiscountDialogType[] $VALUES;
    public static final PersonalDiscountDialogType GIFT;
    public static final PersonalDiscountDialogType IMAGE;
    public static final PersonalDiscountDialogType IMAGE_LARGE;

    static {
        PersonalDiscountDialogType personalDiscountDialogType = new PersonalDiscountDialogType("GIFT", 0);
        GIFT = personalDiscountDialogType;
        PersonalDiscountDialogType personalDiscountDialogType2 = new PersonalDiscountDialogType("IMAGE", 1);
        IMAGE = personalDiscountDialogType2;
        PersonalDiscountDialogType personalDiscountDialogType3 = new PersonalDiscountDialogType("IMAGE_LARGE", 2);
        IMAGE_LARGE = personalDiscountDialogType3;
        PersonalDiscountDialogType[] personalDiscountDialogTypeArr = {personalDiscountDialogType, personalDiscountDialogType2, personalDiscountDialogType3};
        $VALUES = personalDiscountDialogTypeArr;
        $ENTRIES = new asp(personalDiscountDialogTypeArr);
    }

    public PersonalDiscountDialogType() {
        throw null;
    }

    public static PersonalDiscountDialogType valueOf(String str) {
        return (PersonalDiscountDialogType) Enum.valueOf(PersonalDiscountDialogType.class, str);
    }

    public static PersonalDiscountDialogType[] values() {
        return (PersonalDiscountDialogType[]) $VALUES.clone();
    }
}
