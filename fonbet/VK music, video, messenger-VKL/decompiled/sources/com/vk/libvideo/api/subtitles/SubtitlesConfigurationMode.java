package com.vk.libvideo.api.subtitles;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SubtitlesConfigurationMode.kt */
/* loaded from: classes2.dex */
public final class SubtitlesConfigurationMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SubtitlesConfigurationMode[] $VALUES;
    public static final SubtitlesConfigurationMode ALWAYS_DISABLED;
    public static final SubtitlesConfigurationMode ALWAYS_ENABLED;
    public static final SubtitlesConfigurationMode FROM_PERSISTENT_STORAGE;

    static {
        SubtitlesConfigurationMode subtitlesConfigurationMode = new SubtitlesConfigurationMode("FROM_PERSISTENT_STORAGE", 0);
        FROM_PERSISTENT_STORAGE = subtitlesConfigurationMode;
        SubtitlesConfigurationMode subtitlesConfigurationMode2 = new SubtitlesConfigurationMode("ALWAYS_ENABLED", 1);
        ALWAYS_ENABLED = subtitlesConfigurationMode2;
        SubtitlesConfigurationMode subtitlesConfigurationMode3 = new SubtitlesConfigurationMode("ALWAYS_DISABLED", 2);
        ALWAYS_DISABLED = subtitlesConfigurationMode3;
        SubtitlesConfigurationMode[] subtitlesConfigurationModeArr = {subtitlesConfigurationMode, subtitlesConfigurationMode2, subtitlesConfigurationMode3};
        $VALUES = subtitlesConfigurationModeArr;
        $ENTRIES = new asp(subtitlesConfigurationModeArr);
    }

    public SubtitlesConfigurationMode() {
        throw null;
    }

    public static SubtitlesConfigurationMode valueOf(String str) {
        return (SubtitlesConfigurationMode) Enum.valueOf(SubtitlesConfigurationMode.class, str);
    }

    public static SubtitlesConfigurationMode[] values() {
        return (SubtitlesConfigurationMode[]) $VALUES.clone();
    }
}
