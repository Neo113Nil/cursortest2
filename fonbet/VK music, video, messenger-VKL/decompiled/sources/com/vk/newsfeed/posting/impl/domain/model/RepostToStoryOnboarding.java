package com.vk.newsfeed.posting.impl.domain.model;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostEditableData.kt */
/* loaded from: classes4.dex */
public final class RepostToStoryOnboarding {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RepostToStoryOnboarding[] $VALUES;
    public static final RepostToStoryOnboarding NONE;
    public static final RepostToStoryOnboarding SUBTITLE;
    public static final RepostToStoryOnboarding TITLE;

    static {
        RepostToStoryOnboarding repostToStoryOnboarding = new RepostToStoryOnboarding("NONE", 0);
        NONE = repostToStoryOnboarding;
        RepostToStoryOnboarding repostToStoryOnboarding2 = new RepostToStoryOnboarding(NativeAdContent.ViewTag.AD_TITLE, 1);
        TITLE = repostToStoryOnboarding2;
        RepostToStoryOnboarding repostToStoryOnboarding3 = new RepostToStoryOnboarding("SUBTITLE", 2);
        SUBTITLE = repostToStoryOnboarding3;
        RepostToStoryOnboarding[] repostToStoryOnboardingArr = {repostToStoryOnboarding, repostToStoryOnboarding2, repostToStoryOnboarding3};
        $VALUES = repostToStoryOnboardingArr;
        $ENTRIES = new asp(repostToStoryOnboardingArr);
    }

    public RepostToStoryOnboarding() {
        throw null;
    }

    public static RepostToStoryOnboarding valueOf(String str) {
        return (RepostToStoryOnboarding) Enum.valueOf(RepostToStoryOnboarding.class, str);
    }

    public static RepostToStoryOnboarding[] values() {
        return (RepostToStoryOnboarding[]) $VALUES.clone();
    }
}
