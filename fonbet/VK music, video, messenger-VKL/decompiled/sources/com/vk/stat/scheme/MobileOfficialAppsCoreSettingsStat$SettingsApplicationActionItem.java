package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCoreSettingsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem[] $VALUES;

    @pmi0("open_calls")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem OPEN_CALLS;

    @pmi0("open_chats")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem OPEN_CHATS;

    @pmi0("view_clips")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem VIEW_CLIPS;

    @pmi0("view_video")
    public static final MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem VIEW_VIDEO;

    static {
        MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem mobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem = new MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem("OPEN_CHATS", 0);
        OPEN_CHATS = mobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem;
        MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem mobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem2 = new MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem("OPEN_CALLS", 1);
        OPEN_CALLS = mobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem2;
        MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem mobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem3 = new MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem("VIEW_CLIPS", 2);
        VIEW_CLIPS = mobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem3;
        MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem mobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem4 = new MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem("VIEW_VIDEO", 3);
        VIEW_VIDEO = mobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem4;
        MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem[] mobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItemArr = {mobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem, mobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem2, mobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem3, mobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem4};
        $VALUES = mobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItemArr;
        $ENTRIES = new asp(mobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItemArr);
    }

    private MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem(String str, int i) {
    }

    public static MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem valueOf(String str) {
        return (MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem) Enum.valueOf(MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem.class, str);
    }

    public static MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem[] values() {
        return (MobileOfficialAppsCoreSettingsStat$SettingsApplicationActionItem[]) $VALUES.clone();
    }
}
