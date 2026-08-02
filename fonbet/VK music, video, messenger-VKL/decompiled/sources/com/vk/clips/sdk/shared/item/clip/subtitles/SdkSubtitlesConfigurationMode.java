package com.vk.clips.sdk.shared.item.clip.subtitles;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SdkSubtitlesConfigurationMode.kt */
/* loaded from: classes17.dex */
public final class SdkSubtitlesConfigurationMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SdkSubtitlesConfigurationMode[] $VALUES;
    public static final SdkSubtitlesConfigurationMode ALWAYS_DISABLED;
    public static final SdkSubtitlesConfigurationMode ALWAYS_ENABLED;

    static {
        SdkSubtitlesConfigurationMode sdkSubtitlesConfigurationMode = new SdkSubtitlesConfigurationMode("ALWAYS_ENABLED", 0);
        ALWAYS_ENABLED = sdkSubtitlesConfigurationMode;
        SdkSubtitlesConfigurationMode sdkSubtitlesConfigurationMode2 = new SdkSubtitlesConfigurationMode("ALWAYS_DISABLED", 1);
        ALWAYS_DISABLED = sdkSubtitlesConfigurationMode2;
        SdkSubtitlesConfigurationMode[] sdkSubtitlesConfigurationModeArr = {sdkSubtitlesConfigurationMode, sdkSubtitlesConfigurationMode2};
        $VALUES = sdkSubtitlesConfigurationModeArr;
        $ENTRIES = new asp(sdkSubtitlesConfigurationModeArr);
    }

    public SdkSubtitlesConfigurationMode() {
        throw null;
    }

    public static SdkSubtitlesConfigurationMode valueOf(String str) {
        return (SdkSubtitlesConfigurationMode) Enum.valueOf(SdkSubtitlesConfigurationMode.class, str);
    }

    public static SdkSubtitlesConfigurationMode[] values() {
        return (SdkSubtitlesConfigurationMode[]) $VALUES.clone();
    }
}
