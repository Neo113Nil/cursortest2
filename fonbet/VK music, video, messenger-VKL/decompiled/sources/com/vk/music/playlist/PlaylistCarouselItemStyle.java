package com.vk.music.playlist;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlaylistCarouselItemStyle.kt */
/* loaded from: classes3.dex */
public final class PlaylistCarouselItemStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlaylistCarouselItemStyle[] $VALUES;
    public static final PlaylistCarouselItemStyle COMPACT;
    public static final PlaylistCarouselItemStyle EXTENDED;

    static {
        PlaylistCarouselItemStyle playlistCarouselItemStyle = new PlaylistCarouselItemStyle("COMPACT", 0);
        COMPACT = playlistCarouselItemStyle;
        PlaylistCarouselItemStyle playlistCarouselItemStyle2 = new PlaylistCarouselItemStyle("EXTENDED", 1);
        EXTENDED = playlistCarouselItemStyle2;
        PlaylistCarouselItemStyle[] playlistCarouselItemStyleArr = {playlistCarouselItemStyle, playlistCarouselItemStyle2};
        $VALUES = playlistCarouselItemStyleArr;
        $ENTRIES = new asp(playlistCarouselItemStyleArr);
    }

    public PlaylistCarouselItemStyle() {
        throw null;
    }

    public static PlaylistCarouselItemStyle valueOf(String str) {
        return (PlaylistCarouselItemStyle) Enum.valueOf(PlaylistCarouselItemStyle.class, str);
    }

    public static PlaylistCarouselItemStyle[] values() {
        return (PlaylistCarouselItemStyle[]) $VALUES.clone();
    }
}
