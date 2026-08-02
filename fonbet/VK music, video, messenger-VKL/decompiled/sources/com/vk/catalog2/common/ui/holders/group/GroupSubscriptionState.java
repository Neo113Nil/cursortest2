package com.vk.catalog2.common.ui.holders.group;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupSubscriptionState.kt */
/* loaded from: classes16.dex */
public final class GroupSubscriptionState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupSubscriptionState[] $VALUES;
    public static final GroupSubscriptionState NotSubscribed;
    public static final GroupSubscriptionState RecentlySubscribed;
    public static final GroupSubscriptionState Subscribed;

    static {
        GroupSubscriptionState groupSubscriptionState = new GroupSubscriptionState("NotSubscribed", 0);
        NotSubscribed = groupSubscriptionState;
        GroupSubscriptionState groupSubscriptionState2 = new GroupSubscriptionState("RecentlySubscribed", 1);
        RecentlySubscribed = groupSubscriptionState2;
        GroupSubscriptionState groupSubscriptionState3 = new GroupSubscriptionState("Subscribed", 2);
        Subscribed = groupSubscriptionState3;
        GroupSubscriptionState[] groupSubscriptionStateArr = {groupSubscriptionState, groupSubscriptionState2, groupSubscriptionState3};
        $VALUES = groupSubscriptionStateArr;
        $ENTRIES = new asp(groupSubscriptionStateArr);
    }

    public GroupSubscriptionState() {
        throw null;
    }

    public static GroupSubscriptionState valueOf(String str) {
        return (GroupSubscriptionState) Enum.valueOf(GroupSubscriptionState.class, str);
    }

    public static GroupSubscriptionState[] values() {
        return (GroupSubscriptionState[]) $VALUES.clone();
    }
}
