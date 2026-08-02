package com.vk.dto.stories.entities;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryEditorMode.kt */
/* loaded from: classes18.dex */
public final class StoryEditorMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoryEditorMode[] $VALUES;
    public static final a Companion;
    public static final StoryEditorMode DEFAULT;
    public static final StoryEditorMode WITH_BACKGROUND;

    /* compiled from: StoryEditorMode.kt */
    public static final class a {

        /* compiled from: StoryEditorMode.kt */
        /* renamed from: com.vk.dto.stories.entities.StoryEditorMode$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0915a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StoryEditorMode.values().length];
                try {
                    iArr[StoryEditorMode.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StoryEditorMode.WITH_BACKGROUND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    static {
        StoryEditorMode storyEditorMode = new StoryEditorMode("DEFAULT", 0);
        DEFAULT = storyEditorMode;
        StoryEditorMode storyEditorMode2 = new StoryEditorMode("WITH_BACKGROUND", 1);
        WITH_BACKGROUND = storyEditorMode2;
        StoryEditorMode[] storyEditorModeArr = {storyEditorMode, storyEditorMode2};
        $VALUES = storyEditorModeArr;
        $ENTRIES = new asp(storyEditorModeArr);
        Companion = new a();
    }

    public StoryEditorMode() {
        throw null;
    }

    public static StoryEditorMode valueOf(String str) {
        return (StoryEditorMode) Enum.valueOf(StoryEditorMode.class, str);
    }

    public static StoryEditorMode[] values() {
        return (StoryEditorMode[]) $VALUES.clone();
    }
}
