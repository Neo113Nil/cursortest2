package com.vk.music.stickyplayer.presentation.components;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayerSheetTab.kt */
/* loaded from: classes3.dex */
public final class PlayerSheetTab {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayerSheetTab[] $VALUES;
    public static final PlayerSheetTab LYRICS;
    public static final PlayerSheetTab QUEUE;

    static {
        PlayerSheetTab playerSheetTab = new PlayerSheetTab("QUEUE", 0);
        QUEUE = playerSheetTab;
        PlayerSheetTab playerSheetTab2 = new PlayerSheetTab("LYRICS", 1);
        LYRICS = playerSheetTab2;
        PlayerSheetTab[] playerSheetTabArr = {playerSheetTab, playerSheetTab2};
        $VALUES = playerSheetTabArr;
        $ENTRIES = new asp(playerSheetTabArr);
    }

    public PlayerSheetTab() {
        throw null;
    }

    public static PlayerSheetTab valueOf(String str) {
        return (PlayerSheetTab) Enum.valueOf(PlayerSheetTab.class, str);
    }

    public static PlayerSheetTab[] values() {
        return (PlayerSheetTab[]) $VALUES.clone();
    }
}
