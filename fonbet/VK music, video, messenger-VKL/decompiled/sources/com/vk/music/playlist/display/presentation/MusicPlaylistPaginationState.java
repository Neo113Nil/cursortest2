package com.vk.music.playlist.display.presentation;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicPlaylistPaginationState.kt */
/* loaded from: classes3.dex */
public final class MusicPlaylistPaginationState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicPlaylistPaginationState[] $VALUES;
    public static final MusicPlaylistPaginationState COMPLETED;
    public static final MusicPlaylistPaginationState ERROR;
    public static final MusicPlaylistPaginationState LOADING;

    static {
        MusicPlaylistPaginationState musicPlaylistPaginationState = new MusicPlaylistPaginationState("LOADING", 0);
        LOADING = musicPlaylistPaginationState;
        MusicPlaylistPaginationState musicPlaylistPaginationState2 = new MusicPlaylistPaginationState("ERROR", 1);
        ERROR = musicPlaylistPaginationState2;
        MusicPlaylistPaginationState musicPlaylistPaginationState3 = new MusicPlaylistPaginationState("COMPLETED", 2);
        COMPLETED = musicPlaylistPaginationState3;
        MusicPlaylistPaginationState[] musicPlaylistPaginationStateArr = {musicPlaylistPaginationState, musicPlaylistPaginationState2, musicPlaylistPaginationState3};
        $VALUES = musicPlaylistPaginationStateArr;
        $ENTRIES = new asp(musicPlaylistPaginationStateArr);
    }

    public MusicPlaylistPaginationState() {
        throw null;
    }

    public static MusicPlaylistPaginationState valueOf(String str) {
        return (MusicPlaylistPaginationState) Enum.valueOf(MusicPlaylistPaginationState.class, str);
    }

    public static MusicPlaylistPaginationState[] values() {
        return (MusicPlaylistPaginationState[]) $VALUES.clone();
    }
}
