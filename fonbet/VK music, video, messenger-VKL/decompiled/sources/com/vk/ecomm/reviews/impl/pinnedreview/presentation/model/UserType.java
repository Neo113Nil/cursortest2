package com.vk.ecomm.reviews.impl.pinnedreview.presentation.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PinReviewManageServiceState.kt */
/* loaded from: classes18.dex */
public final class UserType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UserType[] $VALUES;
    public static final UserType Buyer;
    public static final UserType BuyerWithoutRole;
    public static final UserType None;
    public static final UserType NotBuyer;

    static {
        UserType userType = new UserType("Buyer", 0);
        Buyer = userType;
        UserType userType2 = new UserType("NotBuyer", 1);
        NotBuyer = userType2;
        UserType userType3 = new UserType("BuyerWithoutRole", 2);
        BuyerWithoutRole = userType3;
        UserType userType4 = new UserType("None", 3);
        None = userType4;
        UserType[] userTypeArr = {userType, userType2, userType3, userType4};
        $VALUES = userTypeArr;
        $ENTRIES = new asp(userTypeArr);
    }

    public UserType() {
        throw null;
    }

    public static UserType valueOf(String str) {
        return (UserType) Enum.valueOf(UserType.class, str);
    }

    public static UserType[] values() {
        return (UserType[]) $VALUES.clone();
    }
}
