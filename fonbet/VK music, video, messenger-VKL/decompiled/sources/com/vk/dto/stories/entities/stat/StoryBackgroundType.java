package com.vk.dto.stories.entities.stat;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryBackgroundType.kt */
/* loaded from: classes18.dex */
public final class StoryBackgroundType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoryBackgroundType[] $VALUES;
    public static final StoryBackgroundType ANIMATED;
    public static final StoryBackgroundType BLUR;
    public static final StoryBackgroundType COLOR;
    public static final StoryBackgroundType DEFAULT;
    public static final StoryBackgroundType EMOJIES;
    public static final StoryBackgroundType GRADIENTS;
    public static final StoryBackgroundType GRAPHICS;
    public static final StoryBackgroundType MARUSIA;

    static {
        StoryBackgroundType storyBackgroundType = new StoryBackgroundType("DEFAULT", 0);
        DEFAULT = storyBackgroundType;
        StoryBackgroundType storyBackgroundType2 = new StoryBackgroundType("EMOJIES", 1);
        EMOJIES = storyBackgroundType2;
        StoryBackgroundType storyBackgroundType3 = new StoryBackgroundType("GRADIENTS", 2);
        GRADIENTS = storyBackgroundType3;
        StoryBackgroundType storyBackgroundType4 = new StoryBackgroundType("BLUR", 3);
        BLUR = storyBackgroundType4;
        StoryBackgroundType storyBackgroundType5 = new StoryBackgroundType("COLOR", 4);
        COLOR = storyBackgroundType5;
        StoryBackgroundType storyBackgroundType6 = new StoryBackgroundType("GRAPHICS", 5);
        GRAPHICS = storyBackgroundType6;
        StoryBackgroundType storyBackgroundType7 = new StoryBackgroundType("ANIMATED", 6);
        ANIMATED = storyBackgroundType7;
        StoryBackgroundType storyBackgroundType8 = new StoryBackgroundType("MARUSIA", 7);
        MARUSIA = storyBackgroundType8;
        StoryBackgroundType[] storyBackgroundTypeArr = {storyBackgroundType, storyBackgroundType2, storyBackgroundType3, storyBackgroundType4, storyBackgroundType5, storyBackgroundType6, storyBackgroundType7, storyBackgroundType8};
        $VALUES = storyBackgroundTypeArr;
        $ENTRIES = new asp(storyBackgroundTypeArr);
    }

    public StoryBackgroundType() {
        throw null;
    }

    public static StoryBackgroundType valueOf(String str) {
        return (StoryBackgroundType) Enum.valueOf(StoryBackgroundType.class, str);
    }

    public static StoryBackgroundType[] values() {
        return (StoryBackgroundType[]) $VALUES.clone();
    }
}
