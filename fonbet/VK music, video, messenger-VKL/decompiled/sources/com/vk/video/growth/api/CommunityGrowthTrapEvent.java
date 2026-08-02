package com.vk.video.growth.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGrowthStatsTracker.kt */
/* loaded from: classes6.dex */
public final class CommunityGrowthTrapEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunityGrowthTrapEvent[] $VALUES;
    public static final CommunityGrowthTrapEvent BANNER;
    public static final CommunityGrowthTrapEvent BOTTOM_BANNER;
    public static final CommunityGrowthTrapEvent MODAL;

    static {
        CommunityGrowthTrapEvent communityGrowthTrapEvent = new CommunityGrowthTrapEvent("BANNER", 0);
        BANNER = communityGrowthTrapEvent;
        CommunityGrowthTrapEvent communityGrowthTrapEvent2 = new CommunityGrowthTrapEvent("BOTTOM_BANNER", 1);
        BOTTOM_BANNER = communityGrowthTrapEvent2;
        CommunityGrowthTrapEvent communityGrowthTrapEvent3 = new CommunityGrowthTrapEvent("MODAL", 2);
        MODAL = communityGrowthTrapEvent3;
        CommunityGrowthTrapEvent[] communityGrowthTrapEventArr = {communityGrowthTrapEvent, communityGrowthTrapEvent2, communityGrowthTrapEvent3};
        $VALUES = communityGrowthTrapEventArr;
        $ENTRIES = new asp(communityGrowthTrapEventArr);
    }

    public CommunityGrowthTrapEvent() {
        throw null;
    }

    public static CommunityGrowthTrapEvent valueOf(String str) {
        return (CommunityGrowthTrapEvent) Enum.valueOf(CommunityGrowthTrapEvent.class, str);
    }

    public static CommunityGrowthTrapEvent[] values() {
        return (CommunityGrowthTrapEvent[]) $VALUES.clone();
    }
}
