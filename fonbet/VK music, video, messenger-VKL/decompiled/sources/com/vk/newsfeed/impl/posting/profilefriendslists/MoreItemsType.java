package com.vk.newsfeed.impl.posting.profilefriendslists;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MoreItemsClass.kt */
/* loaded from: classes4.dex */
public final class MoreItemsType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MoreItemsType[] $VALUES;
    public static final MoreItemsType MORE_CONVERSATIONS;
    public static final MoreItemsType MORE_FRIENDS_LISTS;

    static {
        MoreItemsType moreItemsType = new MoreItemsType("MORE_CONVERSATIONS", 0);
        MORE_CONVERSATIONS = moreItemsType;
        MoreItemsType moreItemsType2 = new MoreItemsType("MORE_FRIENDS_LISTS", 1);
        MORE_FRIENDS_LISTS = moreItemsType2;
        MoreItemsType[] moreItemsTypeArr = {moreItemsType, moreItemsType2};
        $VALUES = moreItemsTypeArr;
        $ENTRIES = new asp(moreItemsTypeArr);
    }

    public MoreItemsType() {
        throw null;
    }

    public static MoreItemsType valueOf(String str) {
        return (MoreItemsType) Enum.valueOf(MoreItemsType.class, str);
    }

    public static MoreItemsType[] values() {
        return (MoreItemsType[]) $VALUES.clone();
    }
}
