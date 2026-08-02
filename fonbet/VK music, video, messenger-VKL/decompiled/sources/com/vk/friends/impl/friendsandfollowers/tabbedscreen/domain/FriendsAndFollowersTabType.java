package com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsAndFollowersTabData.kt */
/* loaded from: classes15.dex */
public final class FriendsAndFollowersTabType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsAndFollowersTabType[] $VALUES;
    public static final FriendsAndFollowersTabType ALL_FRIENDS;
    public static final FriendsAndFollowersTabType FOLLOWERS;
    public static final FriendsAndFollowersTabType MUTUAL;
    public static final FriendsAndFollowersTabType ONLINE_FRIENDS;
    private final long id;

    static {
        FriendsAndFollowersTabType friendsAndFollowersTabType = new FriendsAndFollowersTabType("FOLLOWERS", 0, 0L);
        FOLLOWERS = friendsAndFollowersTabType;
        FriendsAndFollowersTabType friendsAndFollowersTabType2 = new FriendsAndFollowersTabType("ALL_FRIENDS", 1, 1L);
        ALL_FRIENDS = friendsAndFollowersTabType2;
        FriendsAndFollowersTabType friendsAndFollowersTabType3 = new FriendsAndFollowersTabType("MUTUAL", 2, 2L);
        MUTUAL = friendsAndFollowersTabType3;
        FriendsAndFollowersTabType friendsAndFollowersTabType4 = new FriendsAndFollowersTabType("ONLINE_FRIENDS", 3, 3L);
        ONLINE_FRIENDS = friendsAndFollowersTabType4;
        FriendsAndFollowersTabType[] friendsAndFollowersTabTypeArr = {friendsAndFollowersTabType, friendsAndFollowersTabType2, friendsAndFollowersTabType3, friendsAndFollowersTabType4};
        $VALUES = friendsAndFollowersTabTypeArr;
        $ENTRIES = new asp(friendsAndFollowersTabTypeArr);
    }

    public FriendsAndFollowersTabType(String str, int i, long j) {
        this.id = j;
    }

    public static FriendsAndFollowersTabType valueOf(String str) {
        return (FriendsAndFollowersTabType) Enum.valueOf(FriendsAndFollowersTabType.class, str);
    }

    public static FriendsAndFollowersTabType[] values() {
        return (FriendsAndFollowersTabType[]) $VALUES.clone();
    }

    public final long getId() {
        return this.id;
    }
}
