package com.vk.video.growth.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGrowthStatsTracker.kt */
/* loaded from: classes6.dex */
public final class CommunityGrowthTrapScreen {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunityGrowthTrapScreen[] $VALUES;
    public static final CommunityGrowthTrapScreen GROUP;
    public static final CommunityGrowthTrapScreen VIDEO_GROUP_MAIN;

    static {
        CommunityGrowthTrapScreen communityGrowthTrapScreen = new CommunityGrowthTrapScreen("GROUP", 0);
        GROUP = communityGrowthTrapScreen;
        CommunityGrowthTrapScreen communityGrowthTrapScreen2 = new CommunityGrowthTrapScreen("VIDEO_GROUP_MAIN", 1);
        VIDEO_GROUP_MAIN = communityGrowthTrapScreen2;
        CommunityGrowthTrapScreen[] communityGrowthTrapScreenArr = {communityGrowthTrapScreen, communityGrowthTrapScreen2};
        $VALUES = communityGrowthTrapScreenArr;
        $ENTRIES = new asp(communityGrowthTrapScreenArr);
    }

    public CommunityGrowthTrapScreen() {
        throw null;
    }

    public static CommunityGrowthTrapScreen valueOf(String str) {
        return (CommunityGrowthTrapScreen) Enum.valueOf(CommunityGrowthTrapScreen.class, str);
    }

    public static CommunityGrowthTrapScreen[] values() {
        return (CommunityGrowthTrapScreen[]) $VALUES.clone();
    }
}
