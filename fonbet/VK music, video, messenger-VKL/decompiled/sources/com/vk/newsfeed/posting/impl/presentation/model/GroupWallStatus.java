package com.vk.newsfeed.posting.impl.presentation.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class GroupWallStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupWallStatus[] $VALUES;
    public static final GroupWallStatus DISABLED;
    public static final GroupWallStatus LIMITED;
    public static final GroupWallStatus OPEN;
    public static final GroupWallStatus RESTRICTED;

    static {
        GroupWallStatus groupWallStatus = new GroupWallStatus("DISABLED", 0);
        DISABLED = groupWallStatus;
        GroupWallStatus groupWallStatus2 = new GroupWallStatus("OPEN", 1);
        OPEN = groupWallStatus2;
        GroupWallStatus groupWallStatus3 = new GroupWallStatus("LIMITED", 2);
        LIMITED = groupWallStatus3;
        GroupWallStatus groupWallStatus4 = new GroupWallStatus("RESTRICTED", 3);
        RESTRICTED = groupWallStatus4;
        GroupWallStatus[] groupWallStatusArr = {groupWallStatus, groupWallStatus2, groupWallStatus3, groupWallStatus4};
        $VALUES = groupWallStatusArr;
        $ENTRIES = new asp(groupWallStatusArr);
    }

    public GroupWallStatus() {
        throw null;
    }

    public static GroupWallStatus valueOf(String str) {
        return (GroupWallStatus) Enum.valueOf(GroupWallStatus.class, str);
    }

    public static GroupWallStatus[] values() {
        return (GroupWallStatus[]) $VALUES.clone();
    }
}
