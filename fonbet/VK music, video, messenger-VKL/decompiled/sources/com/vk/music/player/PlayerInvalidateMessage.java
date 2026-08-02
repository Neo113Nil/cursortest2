package com.vk.music.player;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayerInvalidateMessage.kt */
/* loaded from: classes3.dex */
public final class PlayerInvalidateMessage {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayerInvalidateMessage[] $VALUES;
    public static final PlayerInvalidateMessage BUFFERING;
    public static final PlayerInvalidateMessage ERROR;
    public static final PlayerInvalidateMessage LOOPING_MODE_CHANGED;
    public static final PlayerInvalidateMessage PARAMETERS_CHANGED;
    public static final PlayerInvalidateMessage PLAYBACK_SPEED_CHANGED;
    public static final PlayerInvalidateMessage PROGRESS;
    public static final PlayerInvalidateMessage SHUFFLE_MODE_CHANGED;
    public static final PlayerInvalidateMessage STATE_CHANGED;
    public static final PlayerInvalidateMessage TRACKS_CHANGED;
    public static final PlayerInvalidateMessage VOLUME_CHANGED;

    static {
        PlayerInvalidateMessage playerInvalidateMessage = new PlayerInvalidateMessage("STATE_CHANGED", 0);
        STATE_CHANGED = playerInvalidateMessage;
        PlayerInvalidateMessage playerInvalidateMessage2 = new PlayerInvalidateMessage("TRACKS_CHANGED", 1);
        TRACKS_CHANGED = playerInvalidateMessage2;
        PlayerInvalidateMessage playerInvalidateMessage3 = new PlayerInvalidateMessage("PROGRESS", 2);
        PROGRESS = playerInvalidateMessage3;
        PlayerInvalidateMessage playerInvalidateMessage4 = new PlayerInvalidateMessage("BUFFERING", 3);
        BUFFERING = playerInvalidateMessage4;
        PlayerInvalidateMessage playerInvalidateMessage5 = new PlayerInvalidateMessage("PARAMETERS_CHANGED", 4);
        PARAMETERS_CHANGED = playerInvalidateMessage5;
        PlayerInvalidateMessage playerInvalidateMessage6 = new PlayerInvalidateMessage("LOOPING_MODE_CHANGED", 5);
        LOOPING_MODE_CHANGED = playerInvalidateMessage6;
        PlayerInvalidateMessage playerInvalidateMessage7 = new PlayerInvalidateMessage("SHUFFLE_MODE_CHANGED", 6);
        SHUFFLE_MODE_CHANGED = playerInvalidateMessage7;
        PlayerInvalidateMessage playerInvalidateMessage8 = new PlayerInvalidateMessage("PLAYBACK_SPEED_CHANGED", 7);
        PLAYBACK_SPEED_CHANGED = playerInvalidateMessage8;
        PlayerInvalidateMessage playerInvalidateMessage9 = new PlayerInvalidateMessage("ERROR", 8);
        ERROR = playerInvalidateMessage9;
        PlayerInvalidateMessage playerInvalidateMessage10 = new PlayerInvalidateMessage("VOLUME_CHANGED", 9);
        VOLUME_CHANGED = playerInvalidateMessage10;
        PlayerInvalidateMessage[] playerInvalidateMessageArr = {playerInvalidateMessage, playerInvalidateMessage2, playerInvalidateMessage3, playerInvalidateMessage4, playerInvalidateMessage5, playerInvalidateMessage6, playerInvalidateMessage7, playerInvalidateMessage8, playerInvalidateMessage9, playerInvalidateMessage10};
        $VALUES = playerInvalidateMessageArr;
        $ENTRIES = new asp(playerInvalidateMessageArr);
    }

    public PlayerInvalidateMessage() {
        throw null;
    }

    public static PlayerInvalidateMessage valueOf(String str) {
        return (PlayerInvalidateMessage) Enum.valueOf(PlayerInvalidateMessage.class, str);
    }

    public static PlayerInvalidateMessage[] values() {
        return (PlayerInvalidateMessage[]) $VALUES.clone();
    }
}
