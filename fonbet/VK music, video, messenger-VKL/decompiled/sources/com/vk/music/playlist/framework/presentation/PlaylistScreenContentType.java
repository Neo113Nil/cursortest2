package com.vk.music.playlist.framework.presentation;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlaylistScreenContentType.kt */
/* loaded from: classes3.dex */
public final class PlaylistScreenContentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlaylistScreenContentType[] $VALUES;
    public static final PlaylistScreenContentType CATALOG_BANNER;
    public static final PlaylistScreenContentType ERROR;
    public static final PlaylistScreenContentType HORIZONTAL_LIST;
    public static final PlaylistScreenContentType LIST_FOOTER;
    public static final PlaylistScreenContentType LIST_HEADER;
    public static final PlaylistScreenContentType PART_ITEM;
    public static final PlaylistScreenContentType PLACEHOLDER;
    public static final PlaylistScreenContentType PROGRESS;
    public static final PlaylistScreenContentType SPACER;
    public static final PlaylistScreenContentType SUMMARY;
    public static final PlaylistScreenContentType TRACK_ITEM;

    static {
        PlaylistScreenContentType playlistScreenContentType = new PlaylistScreenContentType("SUMMARY", 0);
        SUMMARY = playlistScreenContentType;
        PlaylistScreenContentType playlistScreenContentType2 = new PlaylistScreenContentType("LIST_HEADER", 1);
        LIST_HEADER = playlistScreenContentType2;
        PlaylistScreenContentType playlistScreenContentType3 = new PlaylistScreenContentType("TRACK_ITEM", 2);
        TRACK_ITEM = playlistScreenContentType3;
        PlaylistScreenContentType playlistScreenContentType4 = new PlaylistScreenContentType("PART_ITEM", 3);
        PART_ITEM = playlistScreenContentType4;
        PlaylistScreenContentType playlistScreenContentType5 = new PlaylistScreenContentType("LIST_FOOTER", 4);
        LIST_FOOTER = playlistScreenContentType5;
        PlaylistScreenContentType playlistScreenContentType6 = new PlaylistScreenContentType("SPACER", 5);
        SPACER = playlistScreenContentType6;
        PlaylistScreenContentType playlistScreenContentType7 = new PlaylistScreenContentType("PROGRESS", 6);
        PROGRESS = playlistScreenContentType7;
        PlaylistScreenContentType playlistScreenContentType8 = new PlaylistScreenContentType("ERROR", 7);
        ERROR = playlistScreenContentType8;
        PlaylistScreenContentType playlistScreenContentType9 = new PlaylistScreenContentType("PLACEHOLDER", 8);
        PLACEHOLDER = playlistScreenContentType9;
        PlaylistScreenContentType playlistScreenContentType10 = new PlaylistScreenContentType("HORIZONTAL_LIST", 9);
        HORIZONTAL_LIST = playlistScreenContentType10;
        PlaylistScreenContentType playlistScreenContentType11 = new PlaylistScreenContentType("CATALOG_BANNER", 10);
        CATALOG_BANNER = playlistScreenContentType11;
        PlaylistScreenContentType[] playlistScreenContentTypeArr = {playlistScreenContentType, playlistScreenContentType2, playlistScreenContentType3, playlistScreenContentType4, playlistScreenContentType5, playlistScreenContentType6, playlistScreenContentType7, playlistScreenContentType8, playlistScreenContentType9, playlistScreenContentType10, playlistScreenContentType11};
        $VALUES = playlistScreenContentTypeArr;
        $ENTRIES = new asp(playlistScreenContentTypeArr);
    }

    public PlaylistScreenContentType() {
        throw null;
    }

    public static PlaylistScreenContentType valueOf(String str) {
        return (PlaylistScreenContentType) Enum.valueOf(PlaylistScreenContentType.class, str);
    }

    public static PlaylistScreenContentType[] values() {
        return (PlaylistScreenContentType[]) $VALUES.clone();
    }
}
