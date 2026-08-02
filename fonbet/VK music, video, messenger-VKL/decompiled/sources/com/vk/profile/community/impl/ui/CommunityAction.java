package com.vk.profile.community.impl.ui;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunityAction.kt */
/* loaded from: classes5.dex */
public final class CommunityAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunityAction[] $VALUES;
    public static final CommunityAction ADD_TO_HOMESCREEN;
    public static final CommunityAction COPY_LINK;
    public static final CommunityAction DELETE;
    public static final CommunityAction EDIT_COMMUNITY_AVATAR;
    public static final CommunityAction EDIT_GROUP;
    public static final CommunityAction FAVORITES_ADD;
    public static final CommunityAction FAVORITES_REMOVE;
    public static final CommunityAction GROUPS_SUGGESTIONS;
    public static final CommunityAction INVITE;
    public static final CommunityAction MESSAGES;
    public static final CommunityAction OPEN_IN_BROWSER;
    public static final CommunityAction STATS;
    public static final CommunityAction SUBSCRIBE;
    public static final CommunityAction SUBSCRIBE_LIVE;
    public static final CommunityAction SUBSCRIBE_PODCASTS;

    static {
        CommunityAction communityAction = new CommunityAction("EDIT_GROUP", 0);
        EDIT_GROUP = communityAction;
        CommunityAction communityAction2 = new CommunityAction("DELETE", 1);
        DELETE = communityAction2;
        CommunityAction communityAction3 = new CommunityAction("INVITE", 2);
        INVITE = communityAction3;
        CommunityAction communityAction4 = new CommunityAction("SUBSCRIBE", 3);
        SUBSCRIBE = communityAction4;
        CommunityAction communityAction5 = new CommunityAction("SUBSCRIBE_LIVE", 4);
        SUBSCRIBE_LIVE = communityAction5;
        CommunityAction communityAction6 = new CommunityAction("SUBSCRIBE_PODCASTS", 5);
        SUBSCRIBE_PODCASTS = communityAction6;
        CommunityAction communityAction7 = new CommunityAction("FAVORITES_ADD", 6);
        FAVORITES_ADD = communityAction7;
        CommunityAction communityAction8 = new CommunityAction("FAVORITES_REMOVE", 7);
        FAVORITES_REMOVE = communityAction8;
        CommunityAction communityAction9 = new CommunityAction("COPY_LINK", 8);
        COPY_LINK = communityAction9;
        CommunityAction communityAction10 = new CommunityAction("OPEN_IN_BROWSER", 9);
        OPEN_IN_BROWSER = communityAction10;
        CommunityAction communityAction11 = new CommunityAction("STATS", 10);
        STATS = communityAction11;
        CommunityAction communityAction12 = new CommunityAction("EDIT_COMMUNITY_AVATAR", 11);
        EDIT_COMMUNITY_AVATAR = communityAction12;
        CommunityAction communityAction13 = new CommunityAction("MESSAGES", 12);
        MESSAGES = communityAction13;
        CommunityAction communityAction14 = new CommunityAction("GROUPS_SUGGESTIONS", 13);
        GROUPS_SUGGESTIONS = communityAction14;
        CommunityAction communityAction15 = new CommunityAction("ADD_TO_HOMESCREEN", 14);
        ADD_TO_HOMESCREEN = communityAction15;
        CommunityAction[] communityActionArr = {communityAction, communityAction2, communityAction3, communityAction4, communityAction5, communityAction6, communityAction7, communityAction8, communityAction9, communityAction10, communityAction11, communityAction12, communityAction13, communityAction14, communityAction15};
        $VALUES = communityActionArr;
        $ENTRIES = new asp(communityActionArr);
    }

    public CommunityAction() {
        throw null;
    }

    public static CommunityAction valueOf(String str) {
        return (CommunityAction) Enum.valueOf(CommunityAction.class, str);
    }

    public static CommunityAction[] values() {
        return (CommunityAction[]) $VALUES.clone();
    }
}
