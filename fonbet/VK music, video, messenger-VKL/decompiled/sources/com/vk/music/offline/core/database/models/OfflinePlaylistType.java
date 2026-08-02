package com.vk.music.offline.core.database.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OfflinePlaylistType.kt */
/* loaded from: classes3.dex */
public final class OfflinePlaylistType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OfflinePlaylistType[] $VALUES;
    public static final OfflinePlaylistType ALBUM;
    public static final int ALBUM_TYPE_ID = 1;
    public static final a Companion;
    public static final OfflinePlaylistType PLAYLIST;
    public static final int PLAYLIST_TYPE_ID = 0;
    private final int value;

    /* compiled from: OfflinePlaylistType.kt */
    public static final class a {
    }

    static {
        OfflinePlaylistType offlinePlaylistType = new OfflinePlaylistType("PLAYLIST", 0, 0);
        PLAYLIST = offlinePlaylistType;
        OfflinePlaylistType offlinePlaylistType2 = new OfflinePlaylistType("ALBUM", 1, 1);
        ALBUM = offlinePlaylistType2;
        OfflinePlaylistType[] offlinePlaylistTypeArr = {offlinePlaylistType, offlinePlaylistType2};
        $VALUES = offlinePlaylistTypeArr;
        $ENTRIES = new asp(offlinePlaylistTypeArr);
        Companion = new a();
    }

    public OfflinePlaylistType(String str, int i, int i2) {
        this.value = i2;
    }

    public static OfflinePlaylistType valueOf(String str) {
        return (OfflinePlaylistType) Enum.valueOf(OfflinePlaylistType.class, str);
    }

    public static OfflinePlaylistType[] values() {
        return (OfflinePlaylistType[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
