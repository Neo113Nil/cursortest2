package com.vk.search.integration.followers.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FollowersSearchState.kt */
/* loaded from: classes5.dex */
public final class FollowersSearchState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FollowersSearchState[] $VALUES;
    public static final FollowersSearchState ACTIVE_EMPTY;
    public static final FollowersSearchState ACTIVE_QUERY;
    public static final FollowersSearchState INACTIVE;

    static {
        FollowersSearchState followersSearchState = new FollowersSearchState("INACTIVE", 0);
        INACTIVE = followersSearchState;
        FollowersSearchState followersSearchState2 = new FollowersSearchState("ACTIVE_EMPTY", 1);
        ACTIVE_EMPTY = followersSearchState2;
        FollowersSearchState followersSearchState3 = new FollowersSearchState("ACTIVE_QUERY", 2);
        ACTIVE_QUERY = followersSearchState3;
        FollowersSearchState[] followersSearchStateArr = {followersSearchState, followersSearchState2, followersSearchState3};
        $VALUES = followersSearchStateArr;
        $ENTRIES = new asp(followersSearchStateArr);
    }

    public FollowersSearchState() {
        throw null;
    }

    public static FollowersSearchState valueOf(String str) {
        return (FollowersSearchState) Enum.valueOf(FollowersSearchState.class, str);
    }

    public static FollowersSearchState[] values() {
        return (FollowersSearchState[]) $VALUES.clone();
    }
}
