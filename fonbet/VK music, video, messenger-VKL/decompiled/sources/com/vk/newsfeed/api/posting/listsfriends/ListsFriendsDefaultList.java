package com.vk.newsfeed.api.posting.listsfriends;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListsFriendsDefaultList.kt */
/* loaded from: classes3.dex */
public final class ListsFriendsDefaultList {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ListsFriendsDefaultList[] $VALUES;
    public static final ListsFriendsDefaultList BEST_FRIENDS;
    public static final ListsFriendsDefaultList COLLEAGUES;
    public static final a Companion;
    public static final ListsFriendsDefaultList RELATIVES;
    public static final ListsFriendsDefaultList SCHOOL_FRIENDS;
    public static final ListsFriendsDefaultList UNIVERSITY_FRIENDS;
    private final int id;

    /* compiled from: ListsFriendsDefaultList.kt */
    public static final class a {
        public static boolean a(int i) {
            return i >= ListsFriendsDefaultList.UNIVERSITY_FRIENDS.h() && i <= ListsFriendsDefaultList.RELATIVES.h();
        }
    }

    static {
        ListsFriendsDefaultList listsFriendsDefaultList = new ListsFriendsDefaultList("UNIVERSITY_FRIENDS", 0, 25);
        UNIVERSITY_FRIENDS = listsFriendsDefaultList;
        ListsFriendsDefaultList listsFriendsDefaultList2 = new ListsFriendsDefaultList("SCHOOL_FRIENDS", 1, 26);
        SCHOOL_FRIENDS = listsFriendsDefaultList2;
        ListsFriendsDefaultList listsFriendsDefaultList3 = new ListsFriendsDefaultList("COLLEAGUES", 2, 27);
        COLLEAGUES = listsFriendsDefaultList3;
        ListsFriendsDefaultList listsFriendsDefaultList4 = new ListsFriendsDefaultList("BEST_FRIENDS", 3, 28);
        BEST_FRIENDS = listsFriendsDefaultList4;
        ListsFriendsDefaultList listsFriendsDefaultList5 = new ListsFriendsDefaultList("RELATIVES", 4, 29);
        RELATIVES = listsFriendsDefaultList5;
        ListsFriendsDefaultList[] listsFriendsDefaultListArr = {listsFriendsDefaultList, listsFriendsDefaultList2, listsFriendsDefaultList3, listsFriendsDefaultList4, listsFriendsDefaultList5};
        $VALUES = listsFriendsDefaultListArr;
        $ENTRIES = new asp(listsFriendsDefaultListArr);
        Companion = new a();
    }

    public ListsFriendsDefaultList(String str, int i, int i2) {
        this.id = i2;
    }

    public static ListsFriendsDefaultList valueOf(String str) {
        return (ListsFriendsDefaultList) Enum.valueOf(ListsFriendsDefaultList.class, str);
    }

    public static ListsFriendsDefaultList[] values() {
        return (ListsFriendsDefaultList[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
