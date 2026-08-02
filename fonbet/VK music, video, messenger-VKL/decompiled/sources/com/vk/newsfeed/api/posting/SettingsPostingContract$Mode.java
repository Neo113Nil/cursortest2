package com.vk.newsfeed.api.posting;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SettingsPostingContract.kt */
/* loaded from: classes3.dex */
public final class SettingsPostingContract$Mode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SettingsPostingContract$Mode[] $VALUES;
    public static final SettingsPostingContract$Mode Community;
    public static final SettingsPostingContract$Mode User;

    static {
        SettingsPostingContract$Mode settingsPostingContract$Mode = new SettingsPostingContract$Mode("User", 0);
        User = settingsPostingContract$Mode;
        SettingsPostingContract$Mode settingsPostingContract$Mode2 = new SettingsPostingContract$Mode("Community", 1);
        Community = settingsPostingContract$Mode2;
        SettingsPostingContract$Mode[] settingsPostingContract$ModeArr = {settingsPostingContract$Mode, settingsPostingContract$Mode2};
        $VALUES = settingsPostingContract$ModeArr;
        $ENTRIES = new asp(settingsPostingContract$ModeArr);
    }

    public SettingsPostingContract$Mode() {
        throw null;
    }

    public static SettingsPostingContract$Mode valueOf(String str) {
        return (SettingsPostingContract$Mode) Enum.valueOf(SettingsPostingContract$Mode.class, str);
    }

    public static SettingsPostingContract$Mode[] values() {
        return (SettingsPostingContract$Mode[]) $VALUES.clone();
    }
}
