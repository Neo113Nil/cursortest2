package com.vk.music.snippet.api.presentation.model;

import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SnippetSectionType.kt */
/* loaded from: classes3.dex */
public final class SnippetSectionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SnippetSectionType[] $VALUES;
    public static final SnippetSectionType ALBUM;
    public static final SnippetSectionType ALBUM_MIX;
    public static final SnippetSectionType ARTIST;
    public static final SnippetSectionType ARTIST_MIX;
    public static final SnippetSectionType DEFAULT;
    public static final SnippetSectionType EXCLUSIVE_ALBUM;
    public static final SnippetSectionType PLAYLIST;
    public static final SnippetSectionType PLAYLIST_MIX;
    public static final SnippetSectionType TRACK_MIX;
    private final String type;

    static {
        SnippetSectionType snippetSectionType = new SnippetSectionType("DEFAULT", 0, BuildConfig.FLAVOR);
        DEFAULT = snippetSectionType;
        SnippetSectionType snippetSectionType2 = new SnippetSectionType("ALBUM", 1, "album");
        ALBUM = snippetSectionType2;
        SnippetSectionType snippetSectionType3 = new SnippetSectionType("PLAYLIST", 2, "playlist");
        PLAYLIST = snippetSectionType3;
        SnippetSectionType snippetSectionType4 = new SnippetSectionType("ARTIST", 3, "artist");
        ARTIST = snippetSectionType4;
        SnippetSectionType snippetSectionType5 = new SnippetSectionType("PLAYLIST_MIX", 4, "playlist_mix");
        PLAYLIST_MIX = snippetSectionType5;
        SnippetSectionType snippetSectionType6 = new SnippetSectionType("TRACK_MIX", 5, "track_mix");
        TRACK_MIX = snippetSectionType6;
        SnippetSectionType snippetSectionType7 = new SnippetSectionType("ALBUM_MIX", 6, "album_mix");
        ALBUM_MIX = snippetSectionType7;
        SnippetSectionType snippetSectionType8 = new SnippetSectionType("ARTIST_MIX", 7, "artist_mix");
        ARTIST_MIX = snippetSectionType8;
        SnippetSectionType snippetSectionType9 = new SnippetSectionType("EXCLUSIVE_ALBUM", 8, "exclusive_album");
        EXCLUSIVE_ALBUM = snippetSectionType9;
        SnippetSectionType[] snippetSectionTypeArr = {snippetSectionType, snippetSectionType2, snippetSectionType3, snippetSectionType4, snippetSectionType5, snippetSectionType6, snippetSectionType7, snippetSectionType8, snippetSectionType9};
        $VALUES = snippetSectionTypeArr;
        $ENTRIES = new asp(snippetSectionTypeArr);
    }

    public SnippetSectionType(String str, int i, String str2) {
        this.type = str2;
    }

    public static zrp<SnippetSectionType> h() {
        return $ENTRIES;
    }

    public static SnippetSectionType valueOf(String str) {
        return (SnippetSectionType) Enum.valueOf(SnippetSectionType.class, str);
    }

    public static SnippetSectionType[] values() {
        return (SnippetSectionType[]) $VALUES.clone();
    }

    public final String i() {
        return this.type;
    }
}
