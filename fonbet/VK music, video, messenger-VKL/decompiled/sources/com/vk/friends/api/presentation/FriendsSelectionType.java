package com.vk.friends.api.presentation;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsSelectionType.kt */
/* loaded from: classes11.dex */
public final class FriendsSelectionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsSelectionType[] $VALUES;
    public static final FriendsSelectionType MULTIPLE;
    public static final FriendsSelectionType SINGLE;

    static {
        FriendsSelectionType friendsSelectionType = new FriendsSelectionType("SINGLE", 0);
        SINGLE = friendsSelectionType;
        FriendsSelectionType friendsSelectionType2 = new FriendsSelectionType("MULTIPLE", 1);
        MULTIPLE = friendsSelectionType2;
        FriendsSelectionType[] friendsSelectionTypeArr = {friendsSelectionType, friendsSelectionType2};
        $VALUES = friendsSelectionTypeArr;
        $ENTRIES = new asp(friendsSelectionTypeArr);
    }

    public FriendsSelectionType() {
        throw null;
    }

    public static FriendsSelectionType valueOf(String str) {
        return (FriendsSelectionType) Enum.valueOf(FriendsSelectionType.class, str);
    }

    public static FriendsSelectionType[] values() {
        return (FriendsSelectionType[]) $VALUES.clone();
    }
}
