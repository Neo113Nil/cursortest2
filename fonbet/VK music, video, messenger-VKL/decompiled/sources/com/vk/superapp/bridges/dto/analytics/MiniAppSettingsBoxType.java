package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MiniAppSettingsBoxEvent.kt */
/* loaded from: classes6.dex */
public final class MiniAppSettingsBoxType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MiniAppSettingsBoxType[] $VALUES;
    public static final MiniAppSettingsBoxType SETTINGS_BOX_ALLOW_GLOBAL_NOTIFICATIONS;
    public static final MiniAppSettingsBoxType SETTINGS_BOX_ALLOW_GROUP_MESSAGES;
    public static final MiniAppSettingsBoxType SETTINGS_BOX_ALLOW_NOTIFICATIONS;
    public static final MiniAppSettingsBoxType SETTINGS_BOX_GET_EMAIL;
    public static final MiniAppSettingsBoxType SETTINGS_BOX_GET_GEO;
    public static final MiniAppSettingsBoxType SETTINGS_BOX_GET_PHONE;
    public static final MiniAppSettingsBoxType SETTINGS_BOX_JOIN_GROUP;

    static {
        MiniAppSettingsBoxType miniAppSettingsBoxType = new MiniAppSettingsBoxType("SETTINGS_BOX_JOIN_GROUP", 0);
        SETTINGS_BOX_JOIN_GROUP = miniAppSettingsBoxType;
        MiniAppSettingsBoxType miniAppSettingsBoxType2 = new MiniAppSettingsBoxType("SETTINGS_BOX_GET_GEO", 1);
        SETTINGS_BOX_GET_GEO = miniAppSettingsBoxType2;
        MiniAppSettingsBoxType miniAppSettingsBoxType3 = new MiniAppSettingsBoxType("SETTINGS_BOX_ALLOW_NOTIFICATIONS", 2);
        SETTINGS_BOX_ALLOW_NOTIFICATIONS = miniAppSettingsBoxType3;
        MiniAppSettingsBoxType miniAppSettingsBoxType4 = new MiniAppSettingsBoxType("SETTINGS_BOX_ALLOW_GLOBAL_NOTIFICATIONS", 3);
        SETTINGS_BOX_ALLOW_GLOBAL_NOTIFICATIONS = miniAppSettingsBoxType4;
        MiniAppSettingsBoxType miniAppSettingsBoxType5 = new MiniAppSettingsBoxType("SETTINGS_BOX_ALLOW_GROUP_MESSAGES", 4);
        SETTINGS_BOX_ALLOW_GROUP_MESSAGES = miniAppSettingsBoxType5;
        MiniAppSettingsBoxType miniAppSettingsBoxType6 = new MiniAppSettingsBoxType("SETTINGS_BOX_GET_EMAIL", 5);
        SETTINGS_BOX_GET_EMAIL = miniAppSettingsBoxType6;
        MiniAppSettingsBoxType miniAppSettingsBoxType7 = new MiniAppSettingsBoxType("SETTINGS_BOX_GET_PHONE", 6);
        SETTINGS_BOX_GET_PHONE = miniAppSettingsBoxType7;
        MiniAppSettingsBoxType[] miniAppSettingsBoxTypeArr = {miniAppSettingsBoxType, miniAppSettingsBoxType2, miniAppSettingsBoxType3, miniAppSettingsBoxType4, miniAppSettingsBoxType5, miniAppSettingsBoxType6, miniAppSettingsBoxType7};
        $VALUES = miniAppSettingsBoxTypeArr;
        $ENTRIES = new asp(miniAppSettingsBoxTypeArr);
    }

    public MiniAppSettingsBoxType() {
        throw null;
    }

    public static MiniAppSettingsBoxType valueOf(String str) {
        return (MiniAppSettingsBoxType) Enum.valueOf(MiniAppSettingsBoxType.class, str);
    }

    public static MiniAppSettingsBoxType[] values() {
        return (MiniAppSettingsBoxType[]) $VALUES.clone();
    }
}
