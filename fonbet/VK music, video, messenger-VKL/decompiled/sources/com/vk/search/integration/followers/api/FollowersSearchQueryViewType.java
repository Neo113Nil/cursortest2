package com.vk.search.integration.followers.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchFollowersDelegateFactory.kt */
/* loaded from: classes5.dex */
public final class FollowersSearchQueryViewType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FollowersSearchQueryViewType[] $VALUES;
    public static final FollowersSearchQueryViewType BELOW_TOOLBAR;
    public static final FollowersSearchQueryViewType IN_TOOLBAR;

    static {
        FollowersSearchQueryViewType followersSearchQueryViewType = new FollowersSearchQueryViewType("IN_TOOLBAR", 0);
        IN_TOOLBAR = followersSearchQueryViewType;
        FollowersSearchQueryViewType followersSearchQueryViewType2 = new FollowersSearchQueryViewType("BELOW_TOOLBAR", 1);
        BELOW_TOOLBAR = followersSearchQueryViewType2;
        FollowersSearchQueryViewType[] followersSearchQueryViewTypeArr = {followersSearchQueryViewType, followersSearchQueryViewType2};
        $VALUES = followersSearchQueryViewTypeArr;
        $ENTRIES = new asp(followersSearchQueryViewTypeArr);
    }

    public FollowersSearchQueryViewType() {
        throw null;
    }

    public static FollowersSearchQueryViewType valueOf(String str) {
        return (FollowersSearchQueryViewType) Enum.valueOf(FollowersSearchQueryViewType.class, str);
    }

    public static FollowersSearchQueryViewType[] values() {
        return (FollowersSearchQueryViewType[]) $VALUES.clone();
    }
}
