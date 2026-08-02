package com.vk.catalog2.feature.music.offline.content;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asp;
import xsna.e43;
import xsna.epx;
import xsna.fn4;
import xsna.gzs;
import xsna.nh;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OfflineCatalogCategories.kt */
/* loaded from: classes16.dex */
public final class OfflineCatalogCategories {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OfflineCatalogCategories[] $VALUES;
    public static final OfflineCatalogCategories Albums;
    public static final OfflineCatalogCategories All;
    public static final OfflineCatalogCategories Audiobooks;
    public static final OfflineCatalogCategories AutoDownload;
    public static final c Companion;
    public static final OfflineCatalogCategories Playlists;
    public static final OfflineCatalogCategories Podcasts;
    public static final OfflineCatalogCategories Tracks;
    private static final List<OfflineCatalogCategories> sortedForSearchSections;
    private final int downloadedSectionTitleRes;
    private final int searchHintRes;
    private final String searchSectionId;
    private final String sectionId;
    private final int sectionTitleRes;
    private final int severalItemsTitleRes;
    private final gzs<Boolean> shouldDisplay;

    /* compiled from: OfflineCatalogCategories.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(((MusicFeatures) this.receiver).h());
        }
    }

    /* compiled from: OfflineCatalogCategories.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(((MusicFeatures) this.receiver).h());
        }
    }

    /* compiled from: OfflineCatalogCategories.kt */
    public static final class c {
        public static OfflineCatalogCategories a(String str) {
            Object obj = null;
            if (str == null) {
                return null;
            }
            Iterator<E> it = OfflineCatalogCategories.l().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((OfflineCatalogCategories) next).j(str)) {
                    obj = next;
                    break;
                }
            }
            return (OfflineCatalogCategories) obj;
        }
    }

    /* compiled from: OfflineCatalogCategories.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OfflineCatalogCategories.values().length];
            try {
                iArr[OfflineCatalogCategories.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfflineCatalogCategories.Tracks.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OfflineCatalogCategories.AutoDownload.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OfflineCatalogCategories.Albums.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OfflineCatalogCategories.Playlists.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OfflineCatalogCategories.Podcasts.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OfflineCatalogCategories.Audiobooks.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        OfflineCatalogCategories offlineCatalogCategories = new OfflineCatalogCategories("All", 0, "synthetic_offline_section", "synthetic_offline_search_section", R.string.music_catalog_offline_all, R.string.music_catalog_offline_all, R.string.music_hint_downloads_search, R.plurals.music_title_several_tracks);
        All = offlineCatalogCategories;
        OfflineCatalogCategories offlineCatalogCategories2 = new OfflineCatalogCategories("Tracks", 1, "synthetic_offline_tracks", "synthetic_offline_music_search_tracks_all", R.string.music_catalog_offline_tracks, R.string.music_title_my_audios_downloaded, R.string.music_hint_downloads_search_tracks, R.plurals.music_title_several_tracks);
        Tracks = offlineCatalogCategories2;
        OfflineCatalogCategories offlineCatalogCategories3 = new OfflineCatalogCategories("AutoDownload", 2, "synthetic_offline_music_autodownload_all", "synthetic_offline_music_search_autodownload_all", R.string.music_catalog_offline_autodownload, R.string.music_catalog_offline_autodownload, R.string.music_hint_downloads_search, R.plurals.music_title_several_tracks, new fn4(28));
        AutoDownload = offlineCatalogCategories3;
        OfflineCatalogCategories offlineCatalogCategories4 = new OfflineCatalogCategories("Albums", 3, "synthetic_offline_music_album_all", "synthetic_offline_music_search_album_all", R.string.music_catalog_offline_albums, R.string.music_title_my_albums_downloaded, R.string.music_hint_downloads_search_albums, R.plurals.music_title_several_albums);
        Albums = offlineCatalogCategories4;
        OfflineCatalogCategories offlineCatalogCategories5 = new OfflineCatalogCategories("Playlists", 4, "synthetic_offline_music_playlist_all", "synthetic_offline_music_search_playlist_all", R.string.music_catalog_offline_playlists, R.string.music_title_my_playlists_downloaded, R.string.music_hint_downloads_search_playlists, R.plurals.music_title_several_playlist);
        Playlists = offlineCatalogCategories5;
        OfflineCatalogCategories offlineCatalogCategories6 = new OfflineCatalogCategories("Podcasts", 5, "synthetic_offline_music_podcast_all", "synthetic_offline_music_search_podcast_all", R.string.music_catalog_offline_podcasts, R.string.music_title_my_podcasts_downloaded, R.string.music_hint_downloads_search_podcasts, R.plurals.music_title_several_podcast_episodes_with_duration, new a(0, MusicFeatures.PODCAST_EPISODE_DOWNLOAD, MusicFeatures.class, "hasFeatureEnabled", "hasFeatureEnabled()Z", 0));
        Podcasts = offlineCatalogCategories6;
        OfflineCatalogCategories offlineCatalogCategories7 = new OfflineCatalogCategories("Audiobooks", 6, "synthetic_offline_music_audiobook_all", "synthetic_offline_music_search_audio_book_all", R.string.music_catalog_offline_audiobooks, R.string.music_title_my_audiobooks_downloaded, R.string.music_hint_downloads_search_audiobooks, R.plurals.music_title_several_audio_books, new b(0, MusicFeatures.AUDIO_BOOK_CHAPTER_DOWNLOAD, MusicFeatures.class, "hasFeatureEnabled", "hasFeatureEnabled()Z", 0));
        Audiobooks = offlineCatalogCategories7;
        OfflineCatalogCategories[] offlineCatalogCategoriesArr = {offlineCatalogCategories, offlineCatalogCategories2, offlineCatalogCategories3, offlineCatalogCategories4, offlineCatalogCategories5, offlineCatalogCategories6, offlineCatalogCategories7};
        $VALUES = offlineCatalogCategoriesArr;
        $ENTRIES = new asp(offlineCatalogCategoriesArr);
        Companion = new c();
        sortedForSearchSections = e43.l(offlineCatalogCategories, offlineCatalogCategories2, offlineCatalogCategories5, offlineCatalogCategories4, offlineCatalogCategories6, offlineCatalogCategories7);
    }

    public OfflineCatalogCategories(String str, int i, String str2, String str3, int i2, int i3, int i4, int i5, gzs gzsVar) {
        this.sectionId = str2;
        this.searchSectionId = str3;
        this.sectionTitleRes = i2;
        this.downloadedSectionTitleRes = i3;
        this.searchHintRes = i4;
        this.severalItemsTitleRes = i5;
        this.shouldDisplay = gzsVar;
    }

    public static zrp<OfflineCatalogCategories> l() {
        return $ENTRIES;
    }

    public static OfflineCatalogCategories valueOf(String str) {
        return (OfflineCatalogCategories) Enum.valueOf(OfflineCatalogCategories.class, str);
    }

    public static OfflineCatalogCategories[] values() {
        return (OfflineCatalogCategories[]) $VALUES.clone();
    }

    public final CatalogDataType i() {
        switch (d.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
                return CatalogDataType.DATA_TYPE_MUSIC_TRACKS;
            case 4:
            case 5:
                return CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS;
            case 6:
                return CatalogDataType.DATA_TYPE_OFFLINE_PODCASTS;
            case 7:
                return CatalogDataType.DATA_TYPE_AUDIOBOOKS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean j(String str) {
        return epx.f(this.sectionId, str) || epx.f(this.searchSectionId, str);
    }

    public final int k() {
        return this.downloadedSectionTitleRes;
    }

    public final int m() {
        return this.searchHintRes;
    }

    public final String n() {
        return this.searchSectionId;
    }

    public final String o() {
        return this.sectionId;
    }

    public final int p() {
        return this.sectionTitleRes;
    }

    public final int q() {
        return this.severalItemsTitleRes;
    }

    public final gzs<Boolean> r() {
        return this.shouldDisplay;
    }

    public /* synthetic */ OfflineCatalogCategories(String str, int i, String str2, String str3, int i2, int i3, int i4, int i5) {
        this(str, i, str2, str3, i2, i3, i4, i5, new nh(21));
    }
}
