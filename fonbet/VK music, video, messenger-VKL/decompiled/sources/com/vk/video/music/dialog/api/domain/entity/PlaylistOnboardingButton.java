package com.vk.video.music.dialog.api.domain.entity;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlaylistOnboardingButton.kt */
/* loaded from: classes6.dex */
public final class PlaylistOnboardingButton {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlaylistOnboardingButton[] $VALUES;
    public static final PlaylistOnboardingButton ContinueWatching;
    public static final PlaylistOnboardingButton OpenPlayList;
    public static final PlaylistOnboardingButton Understand;

    static {
        PlaylistOnboardingButton playlistOnboardingButton = new PlaylistOnboardingButton("ContinueWatching", 0);
        ContinueWatching = playlistOnboardingButton;
        PlaylistOnboardingButton playlistOnboardingButton2 = new PlaylistOnboardingButton("OpenPlayList", 1);
        OpenPlayList = playlistOnboardingButton2;
        PlaylistOnboardingButton playlistOnboardingButton3 = new PlaylistOnboardingButton("Understand", 2);
        Understand = playlistOnboardingButton3;
        PlaylistOnboardingButton[] playlistOnboardingButtonArr = {playlistOnboardingButton, playlistOnboardingButton2, playlistOnboardingButton3};
        $VALUES = playlistOnboardingButtonArr;
        $ENTRIES = new asp(playlistOnboardingButtonArr);
    }

    public PlaylistOnboardingButton() {
        throw null;
    }

    public static PlaylistOnboardingButton valueOf(String str) {
        return (PlaylistOnboardingButton) Enum.valueOf(PlaylistOnboardingButton.class, str);
    }

    public static PlaylistOnboardingButton[] values() {
        return (PlaylistOnboardingButton[]) $VALUES.clone();
    }
}
