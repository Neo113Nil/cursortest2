package com.vk.voip.ui.settings.participants_view;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallParticipantsViewModel.kt */
/* loaded from: classes7.dex */
public final class CallSettingsItem$ChangeBackground$Background {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CallSettingsItem$ChangeBackground$Background[] $VALUES;
    public static final CallSettingsItem$ChangeBackground$Background BOTTOM_CORNER;
    public static final CallSettingsItem$ChangeBackground$Background DEFAULT;
    public static final CallSettingsItem$ChangeBackground$Background RECTANGLE;
    public static final CallSettingsItem$ChangeBackground$Background TOP_CORNER;

    static {
        CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background = new CallSettingsItem$ChangeBackground$Background("TOP_CORNER", 0);
        TOP_CORNER = callSettingsItem$ChangeBackground$Background;
        CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background2 = new CallSettingsItem$ChangeBackground$Background("RECTANGLE", 1);
        RECTANGLE = callSettingsItem$ChangeBackground$Background2;
        CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background3 = new CallSettingsItem$ChangeBackground$Background("BOTTOM_CORNER", 2);
        BOTTOM_CORNER = callSettingsItem$ChangeBackground$Background3;
        CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background4 = new CallSettingsItem$ChangeBackground$Background("DEFAULT", 3);
        DEFAULT = callSettingsItem$ChangeBackground$Background4;
        CallSettingsItem$ChangeBackground$Background[] callSettingsItem$ChangeBackground$BackgroundArr = {callSettingsItem$ChangeBackground$Background, callSettingsItem$ChangeBackground$Background2, callSettingsItem$ChangeBackground$Background3, callSettingsItem$ChangeBackground$Background4};
        $VALUES = callSettingsItem$ChangeBackground$BackgroundArr;
        $ENTRIES = new asp(callSettingsItem$ChangeBackground$BackgroundArr);
    }

    public CallSettingsItem$ChangeBackground$Background() {
        throw null;
    }

    public static CallSettingsItem$ChangeBackground$Background valueOf(String str) {
        return (CallSettingsItem$ChangeBackground$Background) Enum.valueOf(CallSettingsItem$ChangeBackground$Background.class, str);
    }

    public static CallSettingsItem$ChangeBackground$Background[] values() {
        return (CallSettingsItem$ChangeBackground$Background[]) $VALUES.clone();
    }
}
