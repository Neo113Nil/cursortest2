package com.vk.dto.profile;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunityInternalMenu.kt */
/* loaded from: classes18.dex */
public final class CommunityInternalMenu$Companion$MenuItemType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunityInternalMenu$Companion$MenuItemType[] $VALUES;
    public static final CommunityInternalMenu$Companion$MenuItemType ADMIN_GEAR;
    public static final CommunityInternalMenu$Companion$MenuItemType BUSINESS_APP;
    public static final CommunityInternalMenu$Companion$MenuItemType REGULAR;

    static {
        CommunityInternalMenu$Companion$MenuItemType communityInternalMenu$Companion$MenuItemType = new CommunityInternalMenu$Companion$MenuItemType("ADMIN_GEAR", 0);
        ADMIN_GEAR = communityInternalMenu$Companion$MenuItemType;
        CommunityInternalMenu$Companion$MenuItemType communityInternalMenu$Companion$MenuItemType2 = new CommunityInternalMenu$Companion$MenuItemType("REGULAR", 1);
        REGULAR = communityInternalMenu$Companion$MenuItemType2;
        CommunityInternalMenu$Companion$MenuItemType communityInternalMenu$Companion$MenuItemType3 = new CommunityInternalMenu$Companion$MenuItemType("BUSINESS_APP", 2);
        BUSINESS_APP = communityInternalMenu$Companion$MenuItemType3;
        CommunityInternalMenu$Companion$MenuItemType[] communityInternalMenu$Companion$MenuItemTypeArr = {communityInternalMenu$Companion$MenuItemType, communityInternalMenu$Companion$MenuItemType2, communityInternalMenu$Companion$MenuItemType3};
        $VALUES = communityInternalMenu$Companion$MenuItemTypeArr;
        $ENTRIES = new asp(communityInternalMenu$Companion$MenuItemTypeArr);
    }

    public CommunityInternalMenu$Companion$MenuItemType() {
        throw null;
    }

    public static CommunityInternalMenu$Companion$MenuItemType valueOf(String str) {
        return (CommunityInternalMenu$Companion$MenuItemType) Enum.valueOf(CommunityInternalMenu$Companion$MenuItemType.class, str);
    }

    public static CommunityInternalMenu$Companion$MenuItemType[] values() {
        return (CommunityInternalMenu$Companion$MenuItemType[]) $VALUES.clone();
    }
}
