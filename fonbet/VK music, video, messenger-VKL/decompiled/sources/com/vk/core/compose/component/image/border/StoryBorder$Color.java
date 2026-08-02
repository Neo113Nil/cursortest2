package com.vk.core.compose.component.image.border;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryBorder.kt */
/* loaded from: classes17.dex */
public final class StoryBorder$Color {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoryBorder$Color[] $VALUES;
    public static final StoryBorder$Color Blue;
    public static final StoryBorder$Color Green;
    public static final StoryBorder$Color Grey;
    public static final StoryBorder$Color Red;

    static {
        StoryBorder$Color storyBorder$Color = new StoryBorder$Color("Blue", 0);
        Blue = storyBorder$Color;
        StoryBorder$Color storyBorder$Color2 = new StoryBorder$Color("Grey", 1);
        Grey = storyBorder$Color2;
        StoryBorder$Color storyBorder$Color3 = new StoryBorder$Color("Red", 2);
        Red = storyBorder$Color3;
        StoryBorder$Color storyBorder$Color4 = new StoryBorder$Color("Green", 3);
        Green = storyBorder$Color4;
        StoryBorder$Color[] storyBorder$ColorArr = {storyBorder$Color, storyBorder$Color2, storyBorder$Color3, storyBorder$Color4};
        $VALUES = storyBorder$ColorArr;
        $ENTRIES = new asp(storyBorder$ColorArr);
    }

    public StoryBorder$Color() {
        throw null;
    }

    public static StoryBorder$Color valueOf(String str) {
        return (StoryBorder$Color) Enum.valueOf(StoryBorder$Color.class, str);
    }

    public static StoryBorder$Color[] values() {
        return (StoryBorder$Color[]) $VALUES.clone();
    }
}
