package com.vk.catalog2.common.ui.holders.group.cell;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupCellConfiguration.kt */
/* loaded from: classes16.dex */
public final class GroupCellViewState$VerifyType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupCellViewState$VerifyType[] $VALUES;
    public static final GroupCellViewState$VerifyType ConfirmedBusiness;
    public static final GroupCellViewState$VerifyType NonProfitOrganization;
    public static final GroupCellViewState$VerifyType None;
    public static final GroupCellViewState$VerifyType PremiumBusiness;
    public static final GroupCellViewState$VerifyType Verified;

    static {
        GroupCellViewState$VerifyType groupCellViewState$VerifyType = new GroupCellViewState$VerifyType("None", 0);
        None = groupCellViewState$VerifyType;
        GroupCellViewState$VerifyType groupCellViewState$VerifyType2 = new GroupCellViewState$VerifyType("Verified", 1);
        Verified = groupCellViewState$VerifyType2;
        GroupCellViewState$VerifyType groupCellViewState$VerifyType3 = new GroupCellViewState$VerifyType("NonProfitOrganization", 2);
        NonProfitOrganization = groupCellViewState$VerifyType3;
        GroupCellViewState$VerifyType groupCellViewState$VerifyType4 = new GroupCellViewState$VerifyType("ConfirmedBusiness", 3);
        ConfirmedBusiness = groupCellViewState$VerifyType4;
        GroupCellViewState$VerifyType groupCellViewState$VerifyType5 = new GroupCellViewState$VerifyType("PremiumBusiness", 4);
        PremiumBusiness = groupCellViewState$VerifyType5;
        GroupCellViewState$VerifyType[] groupCellViewState$VerifyTypeArr = {groupCellViewState$VerifyType, groupCellViewState$VerifyType2, groupCellViewState$VerifyType3, groupCellViewState$VerifyType4, groupCellViewState$VerifyType5};
        $VALUES = groupCellViewState$VerifyTypeArr;
        $ENTRIES = new asp(groupCellViewState$VerifyTypeArr);
    }

    public GroupCellViewState$VerifyType() {
        throw null;
    }

    public static GroupCellViewState$VerifyType valueOf(String str) {
        return (GroupCellViewState$VerifyType) Enum.valueOf(GroupCellViewState$VerifyType.class, str);
    }

    public static GroupCellViewState$VerifyType[] values() {
        return (GroupCellViewState$VerifyType[]) $VALUES.clone();
    }
}
