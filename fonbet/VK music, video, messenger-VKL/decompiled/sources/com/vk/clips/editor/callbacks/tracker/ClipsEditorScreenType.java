package com.vk.clips.editor.callbacks.tracker;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsEditorScreenType.kt */
/* loaded from: classes16.dex */
public final class ClipsEditorScreenType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsEditorScreenType[] $VALUES;
    public static final ClipsEditorScreenType CLIPS_EDITOR;
    public static final ClipsEditorScreenType CLIPS_EDITOR_FRAGMENTS_SWAP;
    public static final ClipsEditorScreenType CLIPS_EDITOR_FULLSCREEN;
    public static final ClipsEditorScreenType CLIPS_FRAGMENT_AUDIO_EFFECT_EDITOR;
    public static final ClipsEditorScreenType CLIPS_FRAGMENT_COLOR_CORRECTION_EDITOR;
    public static final ClipsEditorScreenType CLIPS_FRAGMENT_SPEED_EDITOR;
    public static final ClipsEditorScreenType CLIPS_FRAGMENT_VOLUME_EDITOR;

    static {
        ClipsEditorScreenType clipsEditorScreenType = new ClipsEditorScreenType("CLIPS_EDITOR", 0);
        CLIPS_EDITOR = clipsEditorScreenType;
        ClipsEditorScreenType clipsEditorScreenType2 = new ClipsEditorScreenType("CLIPS_FRAGMENT_SPEED_EDITOR", 1);
        CLIPS_FRAGMENT_SPEED_EDITOR = clipsEditorScreenType2;
        ClipsEditorScreenType clipsEditorScreenType3 = new ClipsEditorScreenType("CLIPS_FRAGMENT_AUDIO_EFFECT_EDITOR", 2);
        CLIPS_FRAGMENT_AUDIO_EFFECT_EDITOR = clipsEditorScreenType3;
        ClipsEditorScreenType clipsEditorScreenType4 = new ClipsEditorScreenType("CLIPS_FRAGMENT_VOLUME_EDITOR", 3);
        CLIPS_FRAGMENT_VOLUME_EDITOR = clipsEditorScreenType4;
        ClipsEditorScreenType clipsEditorScreenType5 = new ClipsEditorScreenType("CLIPS_FRAGMENT_COLOR_CORRECTION_EDITOR", 4);
        CLIPS_FRAGMENT_COLOR_CORRECTION_EDITOR = clipsEditorScreenType5;
        ClipsEditorScreenType clipsEditorScreenType6 = new ClipsEditorScreenType("CLIPS_EDITOR_FRAGMENTS_SWAP", 5);
        CLIPS_EDITOR_FRAGMENTS_SWAP = clipsEditorScreenType6;
        ClipsEditorScreenType clipsEditorScreenType7 = new ClipsEditorScreenType("CLIPS_EDITOR_FULLSCREEN", 6);
        CLIPS_EDITOR_FULLSCREEN = clipsEditorScreenType7;
        ClipsEditorScreenType[] clipsEditorScreenTypeArr = {clipsEditorScreenType, clipsEditorScreenType2, clipsEditorScreenType3, clipsEditorScreenType4, clipsEditorScreenType5, clipsEditorScreenType6, clipsEditorScreenType7};
        $VALUES = clipsEditorScreenTypeArr;
        $ENTRIES = new asp(clipsEditorScreenTypeArr);
    }

    public ClipsEditorScreenType() {
        throw null;
    }

    public static ClipsEditorScreenType valueOf(String str) {
        return (ClipsEditorScreenType) Enum.valueOf(ClipsEditorScreenType.class, str);
    }

    public static ClipsEditorScreenType[] values() {
        return (ClipsEditorScreenType[]) $VALUES.clone();
    }
}
