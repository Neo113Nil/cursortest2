package com.vk.video.profile.presentation.views.creatoronboarding.items;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoProfileCreatorOnboardingItemType.kt */
/* loaded from: classes6.dex */
public final class VideoProfileCreatorOnboardingItemType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoProfileCreatorOnboardingItemType[] $VALUES;
    public static final VideoProfileCreatorOnboardingItemType AVATAR;
    public static final VideoProfileCreatorOnboardingItemType COVER;
    public static final VideoProfileCreatorOnboardingItemType DESCRIPTION;

    static {
        VideoProfileCreatorOnboardingItemType videoProfileCreatorOnboardingItemType = new VideoProfileCreatorOnboardingItemType("AVATAR", 0);
        AVATAR = videoProfileCreatorOnboardingItemType;
        VideoProfileCreatorOnboardingItemType videoProfileCreatorOnboardingItemType2 = new VideoProfileCreatorOnboardingItemType("COVER", 1);
        COVER = videoProfileCreatorOnboardingItemType2;
        VideoProfileCreatorOnboardingItemType videoProfileCreatorOnboardingItemType3 = new VideoProfileCreatorOnboardingItemType(NativeAdContent.ViewTag.AD_DESCRIPTION, 2);
        DESCRIPTION = videoProfileCreatorOnboardingItemType3;
        VideoProfileCreatorOnboardingItemType[] videoProfileCreatorOnboardingItemTypeArr = {videoProfileCreatorOnboardingItemType, videoProfileCreatorOnboardingItemType2, videoProfileCreatorOnboardingItemType3};
        $VALUES = videoProfileCreatorOnboardingItemTypeArr;
        $ENTRIES = new asp(videoProfileCreatorOnboardingItemTypeArr);
    }

    public VideoProfileCreatorOnboardingItemType() {
        throw null;
    }

    public static zrp<VideoProfileCreatorOnboardingItemType> h() {
        return $ENTRIES;
    }

    public static VideoProfileCreatorOnboardingItemType valueOf(String str) {
        return (VideoProfileCreatorOnboardingItemType) Enum.valueOf(VideoProfileCreatorOnboardingItemType.class, str);
    }

    public static VideoProfileCreatorOnboardingItemType[] values() {
        return (VideoProfileCreatorOnboardingItemType[]) $VALUES.clone();
    }
}
