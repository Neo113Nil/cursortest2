package com.vk.stories.design.view.camera;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryMediaPickerTabView.kt */
/* loaded from: classes6.dex */
public final class StoryTabType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoryTabType[] $VALUES;
    public static final StoryTabType GALLERY;
    public static final StoryTabType NONE;
    public static final StoryTabType TEMPLATE;

    static {
        StoryTabType storyTabType = new StoryTabType("NONE", 0);
        NONE = storyTabType;
        StoryTabType storyTabType2 = new StoryTabType("GALLERY", 1);
        GALLERY = storyTabType2;
        StoryTabType storyTabType3 = new StoryTabType("TEMPLATE", 2);
        TEMPLATE = storyTabType3;
        StoryTabType[] storyTabTypeArr = {storyTabType, storyTabType2, storyTabType3};
        $VALUES = storyTabTypeArr;
        $ENTRIES = new asp(storyTabTypeArr);
    }

    public StoryTabType() {
        throw null;
    }

    public static StoryTabType valueOf(String str) {
        return (StoryTabType) Enum.valueOf(StoryTabType.class, str);
    }

    public static StoryTabType[] values() {
        return (StoryTabType[]) $VALUES.clone();
    }
}
