package com.vk.superapp.browser.ui.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PersonalDiscountTransitionFrom.kt */
/* loaded from: classes6.dex */
public final class PersonalDiscountTransitionFrom {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PersonalDiscountTransitionFrom[] $VALUES;
    public static final PersonalDiscountTransitionFrom FROM_MENU;
    public static final PersonalDiscountTransitionFrom FROM_SNACK_BAR;

    static {
        PersonalDiscountTransitionFrom personalDiscountTransitionFrom = new PersonalDiscountTransitionFrom("FROM_SNACK_BAR", 0);
        FROM_SNACK_BAR = personalDiscountTransitionFrom;
        PersonalDiscountTransitionFrom personalDiscountTransitionFrom2 = new PersonalDiscountTransitionFrom("FROM_MENU", 1);
        FROM_MENU = personalDiscountTransitionFrom2;
        PersonalDiscountTransitionFrom[] personalDiscountTransitionFromArr = {personalDiscountTransitionFrom, personalDiscountTransitionFrom2};
        $VALUES = personalDiscountTransitionFromArr;
        $ENTRIES = new asp(personalDiscountTransitionFromArr);
    }

    public PersonalDiscountTransitionFrom() {
        throw null;
    }

    public static PersonalDiscountTransitionFrom valueOf(String str) {
        return (PersonalDiscountTransitionFrom) Enum.valueOf(PersonalDiscountTransitionFrom.class, str);
    }

    public static PersonalDiscountTransitionFrom[] values() {
        return (PersonalDiscountTransitionFrom[]) $VALUES.clone();
    }
}
