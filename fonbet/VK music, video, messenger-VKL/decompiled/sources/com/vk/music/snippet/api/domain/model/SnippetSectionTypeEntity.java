package com.vk.music.snippet.api.domain.model;

import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SnippetSectionTypeEntity.kt */
/* loaded from: classes3.dex */
public final class SnippetSectionTypeEntity {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SnippetSectionTypeEntity[] $VALUES;
    public static final SnippetSectionTypeEntity ALBUM;
    public static final SnippetSectionTypeEntity ALBUM_MIX;
    public static final SnippetSectionTypeEntity ARTIST;
    public static final SnippetSectionTypeEntity ARTIST_MIX;
    public static final SnippetSectionTypeEntity DEFAULT;
    public static final SnippetSectionTypeEntity EXCLUSIVE_ALBUM;
    public static final SnippetSectionTypeEntity PLAYLIST;
    public static final SnippetSectionTypeEntity PLAYLIST_MIX;
    public static final SnippetSectionTypeEntity TRACK_MIX;
    private final String type;

    static {
        SnippetSectionTypeEntity snippetSectionTypeEntity = new SnippetSectionTypeEntity("DEFAULT", 0, BuildConfig.FLAVOR);
        DEFAULT = snippetSectionTypeEntity;
        SnippetSectionTypeEntity snippetSectionTypeEntity2 = new SnippetSectionTypeEntity("ALBUM", 1, "album");
        ALBUM = snippetSectionTypeEntity2;
        SnippetSectionTypeEntity snippetSectionTypeEntity3 = new SnippetSectionTypeEntity("PLAYLIST", 2, "playlist");
        PLAYLIST = snippetSectionTypeEntity3;
        SnippetSectionTypeEntity snippetSectionTypeEntity4 = new SnippetSectionTypeEntity("ARTIST", 3, "artist");
        ARTIST = snippetSectionTypeEntity4;
        SnippetSectionTypeEntity snippetSectionTypeEntity5 = new SnippetSectionTypeEntity("PLAYLIST_MIX", 4, "playlist_mix");
        PLAYLIST_MIX = snippetSectionTypeEntity5;
        SnippetSectionTypeEntity snippetSectionTypeEntity6 = new SnippetSectionTypeEntity("TRACK_MIX", 5, "track_mix");
        TRACK_MIX = snippetSectionTypeEntity6;
        SnippetSectionTypeEntity snippetSectionTypeEntity7 = new SnippetSectionTypeEntity("ALBUM_MIX", 6, "album_mix");
        ALBUM_MIX = snippetSectionTypeEntity7;
        SnippetSectionTypeEntity snippetSectionTypeEntity8 = new SnippetSectionTypeEntity("ARTIST_MIX", 7, "artist_mix");
        ARTIST_MIX = snippetSectionTypeEntity8;
        SnippetSectionTypeEntity snippetSectionTypeEntity9 = new SnippetSectionTypeEntity("EXCLUSIVE_ALBUM", 8, "exclusive_album");
        EXCLUSIVE_ALBUM = snippetSectionTypeEntity9;
        SnippetSectionTypeEntity[] snippetSectionTypeEntityArr = {snippetSectionTypeEntity, snippetSectionTypeEntity2, snippetSectionTypeEntity3, snippetSectionTypeEntity4, snippetSectionTypeEntity5, snippetSectionTypeEntity6, snippetSectionTypeEntity7, snippetSectionTypeEntity8, snippetSectionTypeEntity9};
        $VALUES = snippetSectionTypeEntityArr;
        $ENTRIES = new asp(snippetSectionTypeEntityArr);
    }

    public SnippetSectionTypeEntity(String str, int i, String str2) {
        this.type = str2;
    }

    public static zrp<SnippetSectionTypeEntity> h() {
        return $ENTRIES;
    }

    public static SnippetSectionTypeEntity valueOf(String str) {
        return (SnippetSectionTypeEntity) Enum.valueOf(SnippetSectionTypeEntity.class, str);
    }

    public static SnippetSectionTypeEntity[] values() {
        return (SnippetSectionTypeEntity[]) $VALUES.clone();
    }

    public final String i() {
        return this.type;
    }
}
