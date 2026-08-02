package com.vk.voip.ui.watchmovie.player;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommandForPlayer.kt */
/* loaded from: classes7.dex */
public final class CommandForPlayer {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommandForPlayer[] $VALUES;
    public static final CommandForPlayer NOTHING;
    public static final CommandForPlayer ROTATED;
    public static final CommandForPlayer TRANSLATION_DOWN;
    public static final CommandForPlayer TRANSLATION_UP;

    static {
        CommandForPlayer commandForPlayer = new CommandForPlayer("TRANSLATION_UP", 0);
        TRANSLATION_UP = commandForPlayer;
        CommandForPlayer commandForPlayer2 = new CommandForPlayer("TRANSLATION_DOWN", 1);
        TRANSLATION_DOWN = commandForPlayer2;
        CommandForPlayer commandForPlayer3 = new CommandForPlayer("ROTATED", 2);
        ROTATED = commandForPlayer3;
        CommandForPlayer commandForPlayer4 = new CommandForPlayer("NOTHING", 3);
        NOTHING = commandForPlayer4;
        CommandForPlayer[] commandForPlayerArr = {commandForPlayer, commandForPlayer2, commandForPlayer3, commandForPlayer4};
        $VALUES = commandForPlayerArr;
        $ENTRIES = new asp(commandForPlayerArr);
    }

    public CommandForPlayer() {
        throw null;
    }

    public static CommandForPlayer valueOf(String str) {
        return (CommandForPlayer) Enum.valueOf(CommandForPlayer.class, str);
    }

    public static CommandForPlayer[] values() {
        return (CommandForPlayer[]) $VALUES.clone();
    }
}
