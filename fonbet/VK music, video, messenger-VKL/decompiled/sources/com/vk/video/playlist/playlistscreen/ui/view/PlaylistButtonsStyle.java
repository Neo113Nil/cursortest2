package com.vk.video.playlist.playlistscreen.ui.view;

import com.vk.core.compose.component.defaults.ButtonAppearance;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlaylistButtons.kt */
/* loaded from: classes6.dex */
public final class PlaylistButtonsStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlaylistButtonsStyle[] $VALUES;
    public static final PlaylistButtonsStyle Lego;
    public static final PlaylistButtonsStyle Milkshake;
    private final ButtonAppearance buttonAppearance;

    static {
        PlaylistButtonsStyle playlistButtonsStyle = new PlaylistButtonsStyle("Milkshake", 0, ButtonAppearance.Overlay);
        Milkshake = playlistButtonsStyle;
        PlaylistButtonsStyle playlistButtonsStyle2 = new PlaylistButtonsStyle("Lego", 1, ButtonAppearance.Neutral);
        Lego = playlistButtonsStyle2;
        PlaylistButtonsStyle[] playlistButtonsStyleArr = {playlistButtonsStyle, playlistButtonsStyle2};
        $VALUES = playlistButtonsStyleArr;
        $ENTRIES = new asp(playlistButtonsStyleArr);
    }

    public PlaylistButtonsStyle(String str, int i, ButtonAppearance buttonAppearance) {
        this.buttonAppearance = buttonAppearance;
    }

    public static PlaylistButtonsStyle valueOf(String str) {
        return (PlaylistButtonsStyle) Enum.valueOf(PlaylistButtonsStyle.class, str);
    }

    public static PlaylistButtonsStyle[] values() {
        return (PlaylistButtonsStyle[]) $VALUES.clone();
    }

    public final ButtonAppearance h() {
        return this.buttonAppearance;
    }
}
