package com.vk.catalog2.feature.music.myaudio;

import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.asp;
import xsna.c5g;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicCollectionType.kt */
/* loaded from: classes16.dex */
public final class MusicCollectionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicCollectionType[] $VALUES;
    public static final MusicCollectionType ALBUMS;
    public static final MusicCollectionType AUDIOS;
    public static final a Companion;
    public static final MusicCollectionType PLAYLISTS;
    private final int emptyPlaceholderRes;
    private final int emptySearchPlaceholderRes;
    private final String offlineReplacementId = "offline_music_replacement_default";
    private final String offlineSectionId;
    private final String path;
    private final int titleRes;

    /* compiled from: MusicCollectionType.kt */
    public static final class a {
        public static MusicCollectionType a(String str) {
            Object obj;
            Iterator<E> it = MusicCollectionType.j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((MusicCollectionType) obj).m(), str)) {
                    break;
                }
            }
            MusicCollectionType musicCollectionType = (MusicCollectionType) obj;
            return musicCollectionType == null ? MusicCollectionType.AUDIOS : musicCollectionType;
        }

        public static ArrayList b() {
            zrp<MusicCollectionType> j = MusicCollectionType.j();
            ArrayList arrayList = new ArrayList(c5g.u(j, 10));
            Iterator<E> it = j.iterator();
            while (it.hasNext()) {
                arrayList.add(((MusicCollectionType) it.next()).m());
            }
            return arrayList;
        }
    }

    static {
        MusicCollectionType musicCollectionType = new MusicCollectionType(0, R.string.music_title_my_audios, R.string.music_my_audios_offline_empty_placeholder, R.string.music_my_audios_offline_empty_search_placeholder, "AUDIOS", "my_audios", "synthetic_offline_tracks");
        AUDIOS = musicCollectionType;
        MusicCollectionType musicCollectionType2 = new MusicCollectionType(1, R.string.music_title_my_playlists, R.string.music_my_playlists_offline_empty_placeholder, R.string.music_my_playlists_offline_empty_search_placeholder, "PLAYLISTS", "my_playlists", "synthetic_offline_music_playlist_all");
        PLAYLISTS = musicCollectionType2;
        MusicCollectionType musicCollectionType3 = new MusicCollectionType(2, R.string.music_title_my_albums, R.string.music_my_albums_offline_empty_placeholder, R.string.music_my_albums_offline_empty_search_placeholder, "ALBUMS", "my_albums", "synthetic_offline_music_album_all");
        ALBUMS = musicCollectionType3;
        MusicCollectionType[] musicCollectionTypeArr = {musicCollectionType, musicCollectionType2, musicCollectionType3};
        $VALUES = musicCollectionTypeArr;
        $ENTRIES = new asp(musicCollectionTypeArr);
        Companion = new a();
    }

    public MusicCollectionType(int i, int i2, int i3, int i4, String str, String str2, String str3) {
        this.path = str2;
        this.offlineSectionId = str3;
        this.titleRes = i2;
        this.emptyPlaceholderRes = i3;
        this.emptySearchPlaceholderRes = i4;
    }

    public static zrp<MusicCollectionType> j() {
        return $ENTRIES;
    }

    public static MusicCollectionType valueOf(String str) {
        return (MusicCollectionType) Enum.valueOf(MusicCollectionType.class, str);
    }

    public static MusicCollectionType[] values() {
        return (MusicCollectionType[]) $VALUES.clone();
    }

    public final int h() {
        return this.emptyPlaceholderRes;
    }

    public final int i() {
        return this.emptySearchPlaceholderRes;
    }

    public final String k() {
        return this.offlineReplacementId;
    }

    public final String l() {
        return this.offlineSectionId;
    }

    public final String m() {
        return this.path;
    }

    public final int n() {
        return this.titleRes;
    }
}
