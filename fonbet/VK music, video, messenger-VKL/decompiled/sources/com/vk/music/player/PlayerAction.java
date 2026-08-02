package com.vk.music.player;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PlayerAction {
    private static final /* synthetic */ PlayerAction[] $VALUES;
    public static final PlayerAction changeTrackNext;
    public static final PlayerAction changeTrackPrev;
    public static final PlayerAction more;
    public static final PlayerAction other;
    public static final PlayerAction playPause;
    public static final PlayerAction repeat;
    public static final PlayerAction seek;
    public static final PlayerAction shuffle;

    static {
        PlayerAction playerAction = new PlayerAction("seek", 0);
        seek = playerAction;
        PlayerAction playerAction2 = new PlayerAction("changeTrackPrev", 1);
        changeTrackPrev = playerAction2;
        PlayerAction playerAction3 = new PlayerAction("changeTrackNext", 2);
        changeTrackNext = playerAction3;
        PlayerAction playerAction4 = new PlayerAction("playPause", 3);
        playPause = playerAction4;
        PlayerAction playerAction5 = new PlayerAction("shuffle", 4);
        shuffle = playerAction5;
        PlayerAction playerAction6 = new PlayerAction("repeat", 5);
        repeat = playerAction6;
        PlayerAction playerAction7 = new PlayerAction("more", 6);
        more = playerAction7;
        PlayerAction playerAction8 = new PlayerAction("other", 7);
        other = playerAction8;
        $VALUES = new PlayerAction[]{playerAction, playerAction2, playerAction3, playerAction4, playerAction5, playerAction6, playerAction7, playerAction8};
    }

    public PlayerAction() {
        throw null;
    }

    public static PlayerAction valueOf(String str) {
        return (PlayerAction) Enum.valueOf(PlayerAction.class, str);
    }

    public static PlayerAction[] values() {
        return (PlayerAction[]) $VALUES.clone();
    }
}
