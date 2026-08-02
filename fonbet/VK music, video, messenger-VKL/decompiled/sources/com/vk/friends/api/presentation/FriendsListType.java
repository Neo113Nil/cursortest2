package com.vk.friends.api.presentation;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsListType.kt */
/* loaded from: classes11.dex */
public final class FriendsListType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsListType[] $VALUES;
    public static final FriendsListType ALL;
    public static final FriendsListType MUTUAL;
    public static final FriendsListType ONLINE;

    static {
        FriendsListType friendsListType = new FriendsListType("ALL", 0);
        ALL = friendsListType;
        FriendsListType friendsListType2 = new FriendsListType("ONLINE", 1);
        ONLINE = friendsListType2;
        FriendsListType friendsListType3 = new FriendsListType("MUTUAL", 2);
        MUTUAL = friendsListType3;
        FriendsListType[] friendsListTypeArr = {friendsListType, friendsListType2, friendsListType3};
        $VALUES = friendsListTypeArr;
        $ENTRIES = new asp(friendsListTypeArr);
    }

    public FriendsListType() {
        throw null;
    }

    public static FriendsListType valueOf(String str) {
        return (FriendsListType) Enum.valueOf(FriendsListType.class, str);
    }

    public static FriendsListType[] values() {
        return (FriendsListType[]) $VALUES.clone();
    }
}
