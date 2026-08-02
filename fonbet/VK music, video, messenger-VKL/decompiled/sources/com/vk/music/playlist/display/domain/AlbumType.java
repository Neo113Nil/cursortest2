package com.vk.music.playlist.display.domain;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlaylistMetadata.kt */
/* loaded from: classes3.dex */
public final class AlbumType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AlbumType[] $VALUES;
    public static final AlbumType ALBUM;
    public static final AlbumType COLLECTION;
    public static final AlbumType EP;
    public static final AlbumType SINGLE;

    static {
        AlbumType albumType = new AlbumType("ALBUM", 0);
        ALBUM = albumType;
        AlbumType albumType2 = new AlbumType("SINGLE", 1);
        SINGLE = albumType2;
        AlbumType albumType3 = new AlbumType("EP", 2);
        EP = albumType3;
        AlbumType albumType4 = new AlbumType("COLLECTION", 3);
        COLLECTION = albumType4;
        AlbumType[] albumTypeArr = {albumType, albumType2, albumType3, albumType4};
        $VALUES = albumTypeArr;
        $ENTRIES = new asp(albumTypeArr);
    }

    public AlbumType() {
        throw null;
    }

    public static AlbumType valueOf(String str) {
        return (AlbumType) Enum.valueOf(AlbumType.class, str);
    }

    public static AlbumType[] values() {
        return (AlbumType[]) $VALUES.clone();
    }
}
