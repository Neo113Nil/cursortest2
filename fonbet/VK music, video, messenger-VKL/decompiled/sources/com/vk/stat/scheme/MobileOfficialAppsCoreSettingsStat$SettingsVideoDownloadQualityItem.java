package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCoreSettingsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem[] $VALUES;

    @pmi0("high")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem HIGH;

    @pmi0("low")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem LOW;

    @pmi0("medium")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem MEDIUM;

    @pmi0("sound_only")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem SOUND_ONLY;

    static {
        MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem = new MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem("SOUND_ONLY", 0);
        SOUND_ONLY = mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem;
        MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem2 = new MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem("LOW", 1);
        LOW = mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem2;
        MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem3 = new MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem("MEDIUM", 2);
        MEDIUM = mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem3;
        MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem4 = new MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem("HIGH", 3);
        HIGH = mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem4;
        MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem[] mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItemArr = {mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem, mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem2, mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem3, mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem4};
        $VALUES = mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItemArr;
        $ENTRIES = new asp(mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItemArr);
    }

    private MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem(String str, int i) {
    }

    public static MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem valueOf(String str) {
        return (MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem) Enum.valueOf(MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem.class, str);
    }

    public static MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem[] values() {
        return (MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem[]) $VALUES.clone();
    }
}
