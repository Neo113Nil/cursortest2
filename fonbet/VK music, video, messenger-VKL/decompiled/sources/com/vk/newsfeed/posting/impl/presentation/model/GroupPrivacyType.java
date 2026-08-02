package com.vk.newsfeed.posting.impl.presentation.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class GroupPrivacyType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupPrivacyType[] $VALUES;
    public static final GroupPrivacyType CLOSED;
    public static final GroupPrivacyType OPEN;
    public static final GroupPrivacyType PRIVATE;

    static {
        GroupPrivacyType groupPrivacyType = new GroupPrivacyType("OPEN", 0);
        OPEN = groupPrivacyType;
        GroupPrivacyType groupPrivacyType2 = new GroupPrivacyType("CLOSED", 1);
        CLOSED = groupPrivacyType2;
        GroupPrivacyType groupPrivacyType3 = new GroupPrivacyType("PRIVATE", 2);
        PRIVATE = groupPrivacyType3;
        GroupPrivacyType[] groupPrivacyTypeArr = {groupPrivacyType, groupPrivacyType2, groupPrivacyType3};
        $VALUES = groupPrivacyTypeArr;
        $ENTRIES = new asp(groupPrivacyTypeArr);
    }

    public GroupPrivacyType() {
        throw null;
    }

    public static GroupPrivacyType valueOf(String str) {
        return (GroupPrivacyType) Enum.valueOf(GroupPrivacyType.class, str);
    }

    public static GroupPrivacyType[] values() {
        return (GroupPrivacyType[]) $VALUES.clone();
    }
}
