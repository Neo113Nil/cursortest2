package com.vk.catalog2.common.ui.mvp.holder.group.topbar;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunitiesSearchTopBarVh.kt */
/* loaded from: classes16.dex */
public final class CommunitiesTopBarSearchState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunitiesTopBarSearchState[] $VALUES;
    public static final CommunitiesTopBarSearchState AlwaysExpanded;
    public static final CommunitiesTopBarSearchState Collapsed;
    public static final CommunitiesTopBarSearchState Expanded;

    static {
        CommunitiesTopBarSearchState communitiesTopBarSearchState = new CommunitiesTopBarSearchState("Collapsed", 0);
        Collapsed = communitiesTopBarSearchState;
        CommunitiesTopBarSearchState communitiesTopBarSearchState2 = new CommunitiesTopBarSearchState("Expanded", 1);
        Expanded = communitiesTopBarSearchState2;
        CommunitiesTopBarSearchState communitiesTopBarSearchState3 = new CommunitiesTopBarSearchState("AlwaysExpanded", 2);
        AlwaysExpanded = communitiesTopBarSearchState3;
        CommunitiesTopBarSearchState[] communitiesTopBarSearchStateArr = {communitiesTopBarSearchState, communitiesTopBarSearchState2, communitiesTopBarSearchState3};
        $VALUES = communitiesTopBarSearchStateArr;
        $ENTRIES = new asp(communitiesTopBarSearchStateArr);
    }

    public CommunitiesTopBarSearchState() {
        throw null;
    }

    public static CommunitiesTopBarSearchState valueOf(String str) {
        return (CommunitiesTopBarSearchState) Enum.valueOf(CommunitiesTopBarSearchState.class, str);
    }

    public static CommunitiesTopBarSearchState[] values() {
        return (CommunitiesTopBarSearchState[]) $VALUES.clone();
    }
}
