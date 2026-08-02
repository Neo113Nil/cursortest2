package com.vk.friends.groupinvite.impl.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InviteFriendsTabIndex.kt */
/* loaded from: classes14.dex */
public final class InviteFriendsTabIndex {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ InviteFriendsTabIndex[] $VALUES;
    public static final a Companion;
    public static final InviteFriendsTabIndex INVITED;
    public static final InviteFriendsTabIndex NOT_INVITED;
    public static final InviteFriendsTabIndex SELECTED;
    private final int value;

    /* compiled from: InviteFriendsTabIndex.kt */
    public static final class a {
    }

    static {
        InviteFriendsTabIndex inviteFriendsTabIndex = new InviteFriendsTabIndex("NOT_INVITED", 0, 0);
        NOT_INVITED = inviteFriendsTabIndex;
        InviteFriendsTabIndex inviteFriendsTabIndex2 = new InviteFriendsTabIndex("SELECTED", 1, 1);
        SELECTED = inviteFriendsTabIndex2;
        InviteFriendsTabIndex inviteFriendsTabIndex3 = new InviteFriendsTabIndex("INVITED", 2, 2);
        INVITED = inviteFriendsTabIndex3;
        InviteFriendsTabIndex[] inviteFriendsTabIndexArr = {inviteFriendsTabIndex, inviteFriendsTabIndex2, inviteFriendsTabIndex3};
        $VALUES = inviteFriendsTabIndexArr;
        $ENTRIES = new asp(inviteFriendsTabIndexArr);
        Companion = new a();
    }

    public InviteFriendsTabIndex(String str, int i, int i2) {
        this.value = i2;
    }

    public static InviteFriendsTabIndex valueOf(String str) {
        return (InviteFriendsTabIndex) Enum.valueOf(InviteFriendsTabIndex.class, str);
    }

    public static InviteFriendsTabIndex[] values() {
        return (InviteFriendsTabIndex[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
