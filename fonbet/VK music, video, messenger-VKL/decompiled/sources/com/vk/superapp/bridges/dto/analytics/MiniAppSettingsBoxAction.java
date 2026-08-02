package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MiniAppSettingsBoxEvent.kt */
/* loaded from: classes6.dex */
public final class MiniAppSettingsBoxAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MiniAppSettingsBoxAction[] $VALUES;
    public static final MiniAppSettingsBoxAction ALLOW;
    public static final MiniAppSettingsBoxAction DENY;
    public static final MiniAppSettingsBoxAction SHOW;

    static {
        MiniAppSettingsBoxAction miniAppSettingsBoxAction = new MiniAppSettingsBoxAction("SHOW", 0);
        SHOW = miniAppSettingsBoxAction;
        MiniAppSettingsBoxAction miniAppSettingsBoxAction2 = new MiniAppSettingsBoxAction("ALLOW", 1);
        ALLOW = miniAppSettingsBoxAction2;
        MiniAppSettingsBoxAction miniAppSettingsBoxAction3 = new MiniAppSettingsBoxAction("DENY", 2);
        DENY = miniAppSettingsBoxAction3;
        MiniAppSettingsBoxAction[] miniAppSettingsBoxActionArr = {miniAppSettingsBoxAction, miniAppSettingsBoxAction2, miniAppSettingsBoxAction3};
        $VALUES = miniAppSettingsBoxActionArr;
        $ENTRIES = new asp(miniAppSettingsBoxActionArr);
    }

    public MiniAppSettingsBoxAction() {
        throw null;
    }

    public static MiniAppSettingsBoxAction valueOf(String str) {
        return (MiniAppSettingsBoxAction) Enum.valueOf(MiniAppSettingsBoxAction.class, str);
    }

    public static MiniAppSettingsBoxAction[] values() {
        return (MiniAppSettingsBoxAction[]) $VALUES.clone();
    }
}
