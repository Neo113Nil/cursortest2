package com.vk.stickers.api.styles;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicStickerStyle.kt */
/* loaded from: classes5.dex */
public final class MusicStickerStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicStickerStyle[] $VALUES;
    public static final MusicStickerStyle Album;
    public static final MusicStickerStyle HeaderMeta;
    public static final MusicStickerStyle Horizontal;
    private final boolean isVisible;
    private final String value;

    static {
        MusicStickerStyle musicStickerStyle = new MusicStickerStyle("Horizontal", 0, "horizontal", true);
        Horizontal = musicStickerStyle;
        MusicStickerStyle musicStickerStyle2 = new MusicStickerStyle("Album", 1, "album", true);
        Album = musicStickerStyle2;
        MusicStickerStyle musicStickerStyle3 = new MusicStickerStyle("HeaderMeta", 2, "header_meta", false);
        HeaderMeta = musicStickerStyle3;
        MusicStickerStyle[] musicStickerStyleArr = {musicStickerStyle, musicStickerStyle2, musicStickerStyle3};
        $VALUES = musicStickerStyleArr;
        $ENTRIES = new asp(musicStickerStyleArr);
    }

    public MusicStickerStyle(String str, int i, String str2, boolean z) {
        this.value = str2;
        this.isVisible = z;
    }

    public static zrp<MusicStickerStyle> h() {
        return $ENTRIES;
    }

    public static MusicStickerStyle valueOf(String str) {
        return (MusicStickerStyle) Enum.valueOf(MusicStickerStyle.class, str);
    }

    public static MusicStickerStyle[] values() {
        return (MusicStickerStyle[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }

    public final boolean j() {
        return this.isVisible;
    }
}
