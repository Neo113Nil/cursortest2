package com.vk.dto.stories.model.ideas;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryIdeaPayload.kt */
/* loaded from: classes18.dex */
public final class StoryIdeaType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoryIdeaType[] $VALUES;
    public static final StoryIdeaType BIRTHDAY;
    public static final StoryIdeaType GALLERY;
    public static final StoryIdeaType MUSIC;
    private final String value;

    static {
        StoryIdeaType storyIdeaType = new StoryIdeaType("BIRTHDAY", 0, "birthday");
        BIRTHDAY = storyIdeaType;
        StoryIdeaType storyIdeaType2 = new StoryIdeaType("MUSIC", 1, "music");
        MUSIC = storyIdeaType2;
        StoryIdeaType storyIdeaType3 = new StoryIdeaType("GALLERY", 2, "gallery");
        GALLERY = storyIdeaType3;
        StoryIdeaType[] storyIdeaTypeArr = {storyIdeaType, storyIdeaType2, storyIdeaType3};
        $VALUES = storyIdeaTypeArr;
        $ENTRIES = new asp(storyIdeaTypeArr);
    }

    public StoryIdeaType(String str, int i, String str2) {
        this.value = str2;
    }

    public static StoryIdeaType valueOf(String str) {
        return (StoryIdeaType) Enum.valueOf(StoryIdeaType.class, str);
    }

    public static StoryIdeaType[] values() {
        return (StoryIdeaType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
