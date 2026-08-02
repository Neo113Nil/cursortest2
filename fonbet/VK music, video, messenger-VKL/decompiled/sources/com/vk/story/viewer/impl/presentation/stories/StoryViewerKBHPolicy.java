package com.vk.story.viewer.impl.presentation.stories;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryViewerKBHListener.kt */
/* loaded from: classes6.dex */
public final class StoryViewerKBHPolicy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoryViewerKBHPolicy[] $VALUES;
    public static final StoryViewerKBHPolicy CLOSE;
    public static final StoryViewerKBHPolicy PAUSE;

    static {
        StoryViewerKBHPolicy storyViewerKBHPolicy = new StoryViewerKBHPolicy("CLOSE", 0);
        CLOSE = storyViewerKBHPolicy;
        StoryViewerKBHPolicy storyViewerKBHPolicy2 = new StoryViewerKBHPolicy("PAUSE", 1);
        PAUSE = storyViewerKBHPolicy2;
        StoryViewerKBHPolicy[] storyViewerKBHPolicyArr = {storyViewerKBHPolicy, storyViewerKBHPolicy2};
        $VALUES = storyViewerKBHPolicyArr;
        $ENTRIES = new asp(storyViewerKBHPolicyArr);
    }

    public StoryViewerKBHPolicy() {
        throw null;
    }

    public static StoryViewerKBHPolicy valueOf(String str) {
        return (StoryViewerKBHPolicy) Enum.valueOf(StoryViewerKBHPolicy.class, str);
    }

    public static StoryViewerKBHPolicy[] values() {
        return (StoryViewerKBHPolicy[]) $VALUES.clone();
    }
}
