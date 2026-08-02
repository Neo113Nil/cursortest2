package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCoreSettingsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem[] $VALUES;

    @pmi0("vk")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem VK;

    @pmi0("vk_calls")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem VK_CALLS;

    @pmi0("vk_clips")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem VK_CLIPS;

    @pmi0("vk_me")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem VK_ME;

    @pmi0("vk_music")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem VK_MUSIC;

    @pmi0("vk_video")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem VK_VIDEO;

    static {
        MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem = new MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem("VK", 0);
        VK = mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem;
        MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem2 = new MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem("VK_VIDEO", 1);
        VK_VIDEO = mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem2;
        MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem3 = new MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem("VK_CLIPS", 2);
        VK_CLIPS = mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem3;
        MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem4 = new MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem("VK_CALLS", 3);
        VK_CALLS = mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem4;
        MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem5 = new MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem("VK_ME", 4);
        VK_ME = mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem5;
        MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem6 = new MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem("VK_MUSIC", 5);
        VK_MUSIC = mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem6;
        MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem[] mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItemArr = {mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem, mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem2, mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem3, mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem4, mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem5, mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem6};
        $VALUES = mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItemArr;
        $ENTRIES = new asp(mobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItemArr);
    }

    private MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem(String str, int i) {
    }

    public static MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem valueOf(String str) {
        return (MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem) Enum.valueOf(MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem.class, str);
    }

    public static MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem[] values() {
        return (MobileOfficialAppsCoreSettingsStat$SettingsApplicationNameItem[]) $VALUES.clone();
    }
}
