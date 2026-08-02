package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCoreSettingsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset[] $VALUES;

    @pmi0("auto")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset AUTO;

    @pmi0("downloaded")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset DOWNLOADED;

    @pmi0("economy")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset ECONOMY;

    @pmi0("high")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset HIGH;

    @pmi0("other")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset OTHER;

    static {
        MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset = new MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset("AUTO", 0);
        AUTO = mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset;
        MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset2 = new MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset("ECONOMY", 1);
        ECONOMY = mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset2;
        MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset3 = new MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset("HIGH", 2);
        HIGH = mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset3;
        MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset4 = new MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset("DOWNLOADED", 3);
        DOWNLOADED = mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset4;
        MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset5 = new MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset(NativeAdContent.ViewTag.OTHER, 4);
        OTHER = mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset5;
        MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset[] mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPresetArr = {mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset, mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset2, mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset3, mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset4, mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset5};
        $VALUES = mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPresetArr;
        $ENTRIES = new asp(mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPresetArr);
    }

    private MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset(String str, int i) {
    }

    public static MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset valueOf(String str) {
        return (MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset) Enum.valueOf(MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset.class, str);
    }

    public static MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset[] values() {
        return (MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset[]) $VALUES.clone();
    }
}
