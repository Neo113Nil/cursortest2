package com.vk.stickers.api.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotoAlbumStickerInfo.kt */
/* loaded from: classes5.dex */
public final class AlbumStickerStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AlbumStickerStyle[] $VALUES;
    public static final AlbumStickerStyle Miniature;
    public static final AlbumStickerStyle Preview;
    private final String value;

    static {
        AlbumStickerStyle albumStickerStyle = new AlbumStickerStyle("Preview", 0, "preview");
        Preview = albumStickerStyle;
        AlbumStickerStyle albumStickerStyle2 = new AlbumStickerStyle("Miniature", 1, "miniature");
        Miniature = albumStickerStyle2;
        AlbumStickerStyle[] albumStickerStyleArr = {albumStickerStyle, albumStickerStyle2};
        $VALUES = albumStickerStyleArr;
        $ENTRIES = new asp(albumStickerStyleArr);
    }

    public AlbumStickerStyle(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<AlbumStickerStyle> h() {
        return $ENTRIES;
    }

    public static AlbumStickerStyle valueOf(String str) {
        return (AlbumStickerStyle) Enum.valueOf(AlbumStickerStyle.class, str);
    }

    public static AlbumStickerStyle[] values() {
        return (AlbumStickerStyle[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
