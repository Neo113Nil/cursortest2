package com.vk.story.viewer.impl.presentation.stories.view.reactions;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingType.kt */
/* loaded from: classes6.dex */
public final class OnboardingType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OnboardingType[] $VALUES;
    public static final OnboardingType CLIP_REPOST;
    public static final OnboardingType POST_REPOST;
    public static final OnboardingType STORY_REPOST;
    public static final OnboardingType USER_STORY_AVATAR;
    public static final OnboardingType USER_STORY_REPOST;
    private final String key;
    private final int title;

    static {
        OnboardingType onboardingType = new OnboardingType("STORY_REPOST", 0, "stories:onboarding:repost:story", R.string.story_sum_likes_on_story_repost);
        STORY_REPOST = onboardingType;
        OnboardingType onboardingType2 = new OnboardingType("USER_STORY_REPOST", 1, "stories:onboarding:repost:user_story", R.string.story_sum_likes_on_story_repost);
        USER_STORY_REPOST = onboardingType2;
        OnboardingType onboardingType3 = new OnboardingType("POST_REPOST", 2, "stories:onboarding:repost:post", R.string.story_sum_likes_on_repost);
        POST_REPOST = onboardingType3;
        OnboardingType onboardingType4 = new OnboardingType("CLIP_REPOST", 3, "stories:onboarding:repost:clip", R.string.story_sum_likes_on_clip_repost);
        CLIP_REPOST = onboardingType4;
        OnboardingType onboardingType5 = new OnboardingType("USER_STORY_AVATAR", 4, "stories:onboarding:repost:avatar", R.string.story_sum_likes_avatar);
        USER_STORY_AVATAR = onboardingType5;
        OnboardingType[] onboardingTypeArr = {onboardingType, onboardingType2, onboardingType3, onboardingType4, onboardingType5};
        $VALUES = onboardingTypeArr;
        $ENTRIES = new asp(onboardingTypeArr);
    }

    public OnboardingType(String str, int i, String str2, int i2) {
        this.key = str2;
        this.title = i2;
    }

    public static OnboardingType valueOf(String str) {
        return (OnboardingType) Enum.valueOf(OnboardingType.class, str);
    }

    public static OnboardingType[] values() {
        return (OnboardingType[]) $VALUES.clone();
    }

    public final String h() {
        return this.key;
    }

    public final int i() {
        return this.title;
    }
}
