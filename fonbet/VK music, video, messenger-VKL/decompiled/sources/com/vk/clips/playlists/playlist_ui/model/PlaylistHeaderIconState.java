package com.vk.clips.playlists.playlist_ui.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlaylistHeaderIconState.kt */
/* loaded from: classes16.dex */
public final class PlaylistHeaderIconState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlaylistHeaderIconState[] $VALUES;
    public static final PlaylistHeaderIconState More;
    public static final PlaylistHeaderIconState None;
    public static final PlaylistHeaderIconState Share;

    static {
        PlaylistHeaderIconState playlistHeaderIconState = new PlaylistHeaderIconState("More", 0);
        More = playlistHeaderIconState;
        PlaylistHeaderIconState playlistHeaderIconState2 = new PlaylistHeaderIconState("Share", 1);
        Share = playlistHeaderIconState2;
        PlaylistHeaderIconState playlistHeaderIconState3 = new PlaylistHeaderIconState("None", 2);
        None = playlistHeaderIconState3;
        PlaylistHeaderIconState[] playlistHeaderIconStateArr = {playlistHeaderIconState, playlistHeaderIconState2, playlistHeaderIconState3};
        $VALUES = playlistHeaderIconStateArr;
        $ENTRIES = new asp(playlistHeaderIconStateArr);
    }

    public PlaylistHeaderIconState() {
        throw null;
    }

    public static PlaylistHeaderIconState valueOf(String str) {
        return (PlaylistHeaderIconState) Enum.valueOf(PlaylistHeaderIconState.class, str);
    }

    public static PlaylistHeaderIconState[] values() {
        return (PlaylistHeaderIconState[]) $VALUES.clone();
    }
}
