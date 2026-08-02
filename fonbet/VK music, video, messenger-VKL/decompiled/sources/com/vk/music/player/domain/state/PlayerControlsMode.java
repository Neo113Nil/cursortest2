package com.vk.music.player.domain.state;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayerControlsMode.kt */
/* loaded from: classes3.dex */
public final class PlayerControlsMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayerControlsMode[] $VALUES;
    public static final PlayerControlsMode HIDDEN;
    public static final PlayerControlsMode SHOWN;

    static {
        PlayerControlsMode playerControlsMode = new PlayerControlsMode("SHOWN", 0);
        SHOWN = playerControlsMode;
        PlayerControlsMode playerControlsMode2 = new PlayerControlsMode("HIDDEN", 1);
        HIDDEN = playerControlsMode2;
        PlayerControlsMode[] playerControlsModeArr = {playerControlsMode, playerControlsMode2};
        $VALUES = playerControlsModeArr;
        $ENTRIES = new asp(playerControlsModeArr);
    }

    public PlayerControlsMode() {
        throw null;
    }

    public static PlayerControlsMode valueOf(String str) {
        return (PlayerControlsMode) Enum.valueOf(PlayerControlsMode.class, str);
    }

    public static PlayerControlsMode[] values() {
        return (PlayerControlsMode[]) $VALUES.clone();
    }
}
