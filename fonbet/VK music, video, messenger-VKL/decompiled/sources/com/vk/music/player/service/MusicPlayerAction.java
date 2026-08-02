package com.vk.music.player.service;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicPlayerAction.kt */
/* loaded from: classes3.dex */
public final class MusicPlayerAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicPlayerAction[] $VALUES;
    public static final MusicPlayerAction ACTION_ADD_CURRENT;
    public static final MusicPlayerAction ACTION_CONNECT;
    public static final MusicPlayerAction ACTION_CONNECT_AND_CLOSE;
    public static final MusicPlayerAction ACTION_CONNECT_AND_PLAY;
    public static final MusicPlayerAction ACTION_LOAD_MORE_TRACKS;
    public static final MusicPlayerAction ACTION_LOGOUT;
    public static final MusicPlayerAction ACTION_NEXT;
    public static final MusicPlayerAction ACTION_NEXT_15;
    public static final MusicPlayerAction ACTION_PLAY_NEXT;
    public static final MusicPlayerAction ACTION_PLAY_UUID;
    public static final MusicPlayerAction ACTION_PREV;
    public static final MusicPlayerAction ACTION_PREV_15;
    public static final MusicPlayerAction ACTION_RESTORE_PLAYBACK_QUEUE;
    public static final MusicPlayerAction ACTION_RESUME;
    public static final MusicPlayerAction ACTION_SET_PODCAST_PLAYBACK_SPEED;
    public static final MusicPlayerAction ACTION_SHOW_PLAYER;
    public static final MusicPlayerAction ACTION_STOP;
    public static final MusicPlayerAction ACTION_TOGGLE_REPEAT;
    public static final MusicPlayerAction ACTION_TOGGLE_RESUME_PAUSE;
    public static final MusicPlayerAction ACTION_TOGGLE_SHUFFLE;

    static {
        MusicPlayerAction musicPlayerAction = new MusicPlayerAction("ACTION_STOP", 0);
        ACTION_STOP = musicPlayerAction;
        MusicPlayerAction musicPlayerAction2 = new MusicPlayerAction("ACTION_LOGOUT", 1);
        ACTION_LOGOUT = musicPlayerAction2;
        MusicPlayerAction musicPlayerAction3 = new MusicPlayerAction("ACTION_RESUME", 2);
        ACTION_RESUME = musicPlayerAction3;
        MusicPlayerAction musicPlayerAction4 = new MusicPlayerAction("ACTION_TOGGLE_RESUME_PAUSE", 3);
        ACTION_TOGGLE_RESUME_PAUSE = musicPlayerAction4;
        MusicPlayerAction musicPlayerAction5 = new MusicPlayerAction("ACTION_NEXT", 4);
        ACTION_NEXT = musicPlayerAction5;
        MusicPlayerAction musicPlayerAction6 = new MusicPlayerAction("ACTION_NEXT_15", 5);
        ACTION_NEXT_15 = musicPlayerAction6;
        MusicPlayerAction musicPlayerAction7 = new MusicPlayerAction("ACTION_PREV", 6);
        ACTION_PREV = musicPlayerAction7;
        MusicPlayerAction musicPlayerAction8 = new MusicPlayerAction("ACTION_PREV_15", 7);
        ACTION_PREV_15 = musicPlayerAction8;
        MusicPlayerAction musicPlayerAction9 = new MusicPlayerAction("ACTION_TOGGLE_SHUFFLE", 8);
        ACTION_TOGGLE_SHUFFLE = musicPlayerAction9;
        MusicPlayerAction musicPlayerAction10 = new MusicPlayerAction("ACTION_TOGGLE_REPEAT", 9);
        ACTION_TOGGLE_REPEAT = musicPlayerAction10;
        MusicPlayerAction musicPlayerAction11 = new MusicPlayerAction("ACTION_SET_PODCAST_PLAYBACK_SPEED", 10);
        ACTION_SET_PODCAST_PLAYBACK_SPEED = musicPlayerAction11;
        MusicPlayerAction musicPlayerAction12 = new MusicPlayerAction("ACTION_PLAY_UUID", 11);
        ACTION_PLAY_UUID = musicPlayerAction12;
        MusicPlayerAction musicPlayerAction13 = new MusicPlayerAction("ACTION_ADD_CURRENT", 12);
        ACTION_ADD_CURRENT = musicPlayerAction13;
        MusicPlayerAction musicPlayerAction14 = new MusicPlayerAction("ACTION_SHOW_PLAYER", 13);
        ACTION_SHOW_PLAYER = musicPlayerAction14;
        MusicPlayerAction musicPlayerAction15 = new MusicPlayerAction("ACTION_PLAY_NEXT", 14);
        ACTION_PLAY_NEXT = musicPlayerAction15;
        MusicPlayerAction musicPlayerAction16 = new MusicPlayerAction("ACTION_LOAD_MORE_TRACKS", 15);
        ACTION_LOAD_MORE_TRACKS = musicPlayerAction16;
        MusicPlayerAction musicPlayerAction17 = new MusicPlayerAction("ACTION_RESTORE_PLAYBACK_QUEUE", 16);
        ACTION_RESTORE_PLAYBACK_QUEUE = musicPlayerAction17;
        MusicPlayerAction musicPlayerAction18 = new MusicPlayerAction("ACTION_CONNECT_AND_PLAY", 17);
        ACTION_CONNECT_AND_PLAY = musicPlayerAction18;
        MusicPlayerAction musicPlayerAction19 = new MusicPlayerAction("ACTION_CONNECT_AND_CLOSE", 18);
        ACTION_CONNECT_AND_CLOSE = musicPlayerAction19;
        MusicPlayerAction musicPlayerAction20 = new MusicPlayerAction("ACTION_CONNECT", 19);
        ACTION_CONNECT = musicPlayerAction20;
        MusicPlayerAction[] musicPlayerActionArr = {musicPlayerAction, musicPlayerAction2, musicPlayerAction3, musicPlayerAction4, musicPlayerAction5, musicPlayerAction6, musicPlayerAction7, musicPlayerAction8, musicPlayerAction9, musicPlayerAction10, musicPlayerAction11, musicPlayerAction12, musicPlayerAction13, musicPlayerAction14, musicPlayerAction15, musicPlayerAction16, musicPlayerAction17, musicPlayerAction18, musicPlayerAction19, musicPlayerAction20};
        $VALUES = musicPlayerActionArr;
        $ENTRIES = new asp(musicPlayerActionArr);
    }

    public MusicPlayerAction() {
        throw null;
    }

    public static MusicPlayerAction valueOf(String str) {
        return (MusicPlayerAction) Enum.valueOf(MusicPlayerAction.class, str);
    }

    public static MusicPlayerAction[] values() {
        return (MusicPlayerAction[]) $VALUES.clone();
    }
}
