package com.vk.profile.community.details.api.name_history.data.dto;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunityNameHistoryAction.kt */
/* loaded from: classes5.dex */
public final class CommunityNameHistoryAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunityNameHistoryAction[] $VALUES;
    public static final CommunityNameHistoryAction COLLAPSE;
    public static final CommunityNameHistoryAction CREATE;
    public static final CommunityNameHistoryAction RENAME;

    static {
        CommunityNameHistoryAction communityNameHistoryAction = new CommunityNameHistoryAction("CREATE", 0);
        CREATE = communityNameHistoryAction;
        CommunityNameHistoryAction communityNameHistoryAction2 = new CommunityNameHistoryAction("RENAME", 1);
        RENAME = communityNameHistoryAction2;
        CommunityNameHistoryAction communityNameHistoryAction3 = new CommunityNameHistoryAction("COLLAPSE", 2);
        COLLAPSE = communityNameHistoryAction3;
        CommunityNameHistoryAction[] communityNameHistoryActionArr = {communityNameHistoryAction, communityNameHistoryAction2, communityNameHistoryAction3};
        $VALUES = communityNameHistoryActionArr;
        $ENTRIES = new asp(communityNameHistoryActionArr);
    }

    public CommunityNameHistoryAction() {
        throw null;
    }

    public static CommunityNameHistoryAction valueOf(String str) {
        return (CommunityNameHistoryAction) Enum.valueOf(CommunityNameHistoryAction.class, str);
    }

    public static CommunityNameHistoryAction[] values() {
        return (CommunityNameHistoryAction[]) $VALUES.clone();
    }
}
