package com.vk.newsfeed.impl.posting.settings.mvi.ui;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingSettingsAdapterItem.kt */
/* loaded from: classes4.dex */
public final class SettingType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SettingType[] $VALUES;
    public static final SettingType ADVERTISING_ORD;
    public static final SettingType DETAILS_SOURCE;
    public static final SettingType HIDE_NAME;
    public static final SettingType PRIVACY;
    public static final SettingType SELECTOR_POSTING_TIME;
    public static final SettingType SELECTOR_POST_SOURCE;
    public static final SettingType SWITCH_COMMENTS;
    public static final SettingType SWITCH_NOTIFY;

    static {
        SettingType settingType = new SettingType("SWITCH_COMMENTS", 0);
        SWITCH_COMMENTS = settingType;
        SettingType settingType2 = new SettingType("SWITCH_NOTIFY", 1);
        SWITCH_NOTIFY = settingType2;
        SettingType settingType3 = new SettingType("SELECTOR_POSTING_TIME", 2);
        SELECTOR_POSTING_TIME = settingType3;
        SettingType settingType4 = new SettingType("SELECTOR_POST_SOURCE", 3);
        SELECTOR_POST_SOURCE = settingType4;
        SettingType settingType5 = new SettingType("PRIVACY", 4);
        PRIVACY = settingType5;
        SettingType settingType6 = new SettingType("DETAILS_SOURCE", 5);
        DETAILS_SOURCE = settingType6;
        SettingType settingType7 = new SettingType("HIDE_NAME", 6);
        HIDE_NAME = settingType7;
        SettingType settingType8 = new SettingType("ADVERTISING_ORD", 7);
        ADVERTISING_ORD = settingType8;
        SettingType[] settingTypeArr = {settingType, settingType2, settingType3, settingType4, settingType5, settingType6, settingType7, settingType8};
        $VALUES = settingTypeArr;
        $ENTRIES = new asp(settingTypeArr);
    }

    public SettingType() {
        throw null;
    }

    public static SettingType valueOf(String str) {
        return (SettingType) Enum.valueOf(SettingType.class, str);
    }

    public static SettingType[] values() {
        return (SettingType[]) $VALUES.clone();
    }
}
