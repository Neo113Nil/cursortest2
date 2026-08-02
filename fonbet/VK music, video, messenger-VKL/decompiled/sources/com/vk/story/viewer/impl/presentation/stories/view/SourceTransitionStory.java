package com.vk.story.viewer.impl.presentation.stories.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SourceTransitionStory {
    private static final /* synthetic */ SourceTransitionStory[] $VALUES;
    public static final SourceTransitionStory AUTO_AFTER_DELETE_STORY;
    public static final SourceTransitionStory CLICK;
    public static final SourceTransitionStory EXPIRED_TIME;

    static {
        SourceTransitionStory sourceTransitionStory = new SourceTransitionStory("CLICK", 0);
        CLICK = sourceTransitionStory;
        SourceTransitionStory sourceTransitionStory2 = new SourceTransitionStory("AUTO_AFTER_DELETE_STORY", 1);
        AUTO_AFTER_DELETE_STORY = sourceTransitionStory2;
        SourceTransitionStory sourceTransitionStory3 = new SourceTransitionStory("EXPIRED_TIME", 2);
        EXPIRED_TIME = sourceTransitionStory3;
        $VALUES = new SourceTransitionStory[]{sourceTransitionStory, sourceTransitionStory2, sourceTransitionStory3};
    }

    public SourceTransitionStory() {
        throw null;
    }

    public static SourceTransitionStory valueOf(String str) {
        return (SourceTransitionStory) Enum.valueOf(SourceTransitionStory.class, str);
    }

    public static SourceTransitionStory[] values() {
        return (SourceTransitionStory[]) $VALUES.clone();
    }
}
