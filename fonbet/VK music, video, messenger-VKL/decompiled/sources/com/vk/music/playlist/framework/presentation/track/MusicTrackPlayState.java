package com.vk.music.playlist.framework.presentation.track;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlaylistItem.kt */
/* loaded from: classes3.dex */
public final class MusicTrackPlayState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicTrackPlayState[] $VALUES;
    public static final MusicTrackPlayState NONE;
    public static final MusicTrackPlayState PAUSED;
    public static final MusicTrackPlayState PLAYING;
    public static final MusicTrackPlayState REQUESTED;

    static {
        MusicTrackPlayState musicTrackPlayState = new MusicTrackPlayState("PLAYING", 0);
        PLAYING = musicTrackPlayState;
        MusicTrackPlayState musicTrackPlayState2 = new MusicTrackPlayState("PAUSED", 1);
        PAUSED = musicTrackPlayState2;
        MusicTrackPlayState musicTrackPlayState3 = new MusicTrackPlayState("REQUESTED", 2);
        REQUESTED = musicTrackPlayState3;
        MusicTrackPlayState musicTrackPlayState4 = new MusicTrackPlayState("NONE", 3);
        NONE = musicTrackPlayState4;
        MusicTrackPlayState[] musicTrackPlayStateArr = {musicTrackPlayState, musicTrackPlayState2, musicTrackPlayState3, musicTrackPlayState4};
        $VALUES = musicTrackPlayStateArr;
        $ENTRIES = new asp(musicTrackPlayStateArr);
    }

    public MusicTrackPlayState() {
        throw null;
    }

    public static MusicTrackPlayState valueOf(String str) {
        return (MusicTrackPlayState) Enum.valueOf(MusicTrackPlayState.class, str);
    }

    public static MusicTrackPlayState[] values() {
        return (MusicTrackPlayState[]) $VALUES.clone();
    }
}
