package com.vk.newsfeed.posting.impl.presentation.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class GroupAdminLevel {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupAdminLevel[] $VALUES;
    public static final GroupAdminLevel ADMINISTRATOR;
    public static final GroupAdminLevel EDITOR;
    public static final GroupAdminLevel MODERATOR;

    static {
        GroupAdminLevel groupAdminLevel = new GroupAdminLevel("MODERATOR", 0);
        MODERATOR = groupAdminLevel;
        GroupAdminLevel groupAdminLevel2 = new GroupAdminLevel("EDITOR", 1);
        EDITOR = groupAdminLevel2;
        GroupAdminLevel groupAdminLevel3 = new GroupAdminLevel("ADMINISTRATOR", 2);
        ADMINISTRATOR = groupAdminLevel3;
        GroupAdminLevel[] groupAdminLevelArr = {groupAdminLevel, groupAdminLevel2, groupAdminLevel3};
        $VALUES = groupAdminLevelArr;
        $ENTRIES = new asp(groupAdminLevelArr);
    }

    public GroupAdminLevel() {
        throw null;
    }

    public static GroupAdminLevel valueOf(String str) {
        return (GroupAdminLevel) Enum.valueOf(GroupAdminLevel.class, str);
    }

    public static GroupAdminLevel[] values() {
        return (GroupAdminLevel[]) $VALUES.clone();
    }
}
