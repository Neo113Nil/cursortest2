package com.vk.music.player;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayRequestTrigger.kt */
/* loaded from: classes3.dex */
public final class PlayRequestTrigger {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayRequestTrigger[] $VALUES;
    public static final PlayRequestTrigger FAST_PLAY_SINGLE_AUDIO;
    public static final PlayRequestTrigger FAST_PLAY_TRACK_LIST;
    public static final PlayRequestTrigger SHUFFLE_BUTTON;
    public static final PlayRequestTrigger VOICE_COMMAND;

    static {
        PlayRequestTrigger playRequestTrigger = new PlayRequestTrigger("FAST_PLAY_TRACK_LIST", 0);
        FAST_PLAY_TRACK_LIST = playRequestTrigger;
        PlayRequestTrigger playRequestTrigger2 = new PlayRequestTrigger("FAST_PLAY_SINGLE_AUDIO", 1);
        FAST_PLAY_SINGLE_AUDIO = playRequestTrigger2;
        PlayRequestTrigger playRequestTrigger3 = new PlayRequestTrigger("VOICE_COMMAND", 2);
        VOICE_COMMAND = playRequestTrigger3;
        PlayRequestTrigger playRequestTrigger4 = new PlayRequestTrigger("SHUFFLE_BUTTON", 3);
        SHUFFLE_BUTTON = playRequestTrigger4;
        PlayRequestTrigger[] playRequestTriggerArr = {playRequestTrigger, playRequestTrigger2, playRequestTrigger3, playRequestTrigger4};
        $VALUES = playRequestTriggerArr;
        $ENTRIES = new asp(playRequestTriggerArr);
    }

    public PlayRequestTrigger() {
        throw null;
    }

    public static PlayRequestTrigger valueOf(String str) {
        return (PlayRequestTrigger) Enum.valueOf(PlayRequestTrigger.class, str);
    }

    public static PlayRequestTrigger[] values() {
        return (PlayRequestTrigger[]) $VALUES.clone();
    }
}
