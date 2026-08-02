package com.vk.video.growth.api.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGrowthCommunitySource.kt */
/* loaded from: classes6.dex */
public final class VideoGrowthCommunitySource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGrowthCommunitySource[] $VALUES;
    public static final VideoGrowthCommunitySource COMMUNITY_BANNER;
    public static final VideoGrowthCommunitySource COMMUNITY_BUTTON;
    public static final VideoGrowthCommunitySource SUPERAPP_BANNER;
    public static final VideoGrowthCommunitySource SUPERAPP_BUTTON;
    private final String value;

    static {
        VideoGrowthCommunitySource videoGrowthCommunitySource = new VideoGrowthCommunitySource("COMMUNITY_BANNER", 0, "community_banner");
        COMMUNITY_BANNER = videoGrowthCommunitySource;
        VideoGrowthCommunitySource videoGrowthCommunitySource2 = new VideoGrowthCommunitySource("COMMUNITY_BUTTON", 1, "community_button");
        COMMUNITY_BUTTON = videoGrowthCommunitySource2;
        VideoGrowthCommunitySource videoGrowthCommunitySource3 = new VideoGrowthCommunitySource("SUPERAPP_BANNER", 2, "superapp_banner");
        SUPERAPP_BANNER = videoGrowthCommunitySource3;
        VideoGrowthCommunitySource videoGrowthCommunitySource4 = new VideoGrowthCommunitySource("SUPERAPP_BUTTON", 3, "superapp_button");
        SUPERAPP_BUTTON = videoGrowthCommunitySource4;
        VideoGrowthCommunitySource[] videoGrowthCommunitySourceArr = {videoGrowthCommunitySource, videoGrowthCommunitySource2, videoGrowthCommunitySource3, videoGrowthCommunitySource4};
        $VALUES = videoGrowthCommunitySourceArr;
        $ENTRIES = new asp(videoGrowthCommunitySourceArr);
    }

    public VideoGrowthCommunitySource(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoGrowthCommunitySource valueOf(String str) {
        return (VideoGrowthCommunitySource) Enum.valueOf(VideoGrowthCommunitySource.class, str);
    }

    public static VideoGrowthCommunitySource[] values() {
        return (VideoGrowthCommunitySource[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
