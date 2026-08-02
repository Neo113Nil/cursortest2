package com.vk.catalog2.feature.music.holders.search;

import android.content.Context;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.SearchHistoryViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistOwner;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.podcast.Podcast;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.cfp0;
import xsna.dvh0;
import xsna.epx;
import xsna.evh0;
import xsna.g6;
import xsna.ini;
import xsna.mba;
import xsna.rw;
import xsna.un7;
import xsna.z5a;

/* compiled from: SearchHistoryOtherVh.kt */
/* loaded from: classes16.dex */
public final class SearchHistoryOtherVh extends SearchHistoryItemVh {
    public final Context g;
    public final b5a h;
    public final UserId i;
    public final un7 j;
    public final ini k;
    public final SearchStatInfoProvider l;

    /* compiled from: SearchHistoryOtherVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchHistoryViewStyle.Style.values().length];
            try {
                iArr[SearchHistoryViewStyle.Style.Artist.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchHistoryViewStyle.Style.Podcast.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchHistoryViewStyle.Style.AudioBook.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchHistoryViewStyle.Style.Album.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchHistoryViewStyle.Style.Playlist.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SearchHistoryOtherVh(Context context, mba mbaVar, b5a b5aVar, UserId userId, un7 un7Var, ini iniVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(context, mbaVar);
        this.g = context;
        this.h = b5aVar;
        this.i = userId;
        this.j = un7Var;
        this.k = iniVar;
        this.l = searchStatInfoProvider;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        String str;
        if (uIBlock instanceof UIBlockSearchHistory) {
            UIBlockSearchHistory<?> uIBlockSearchHistory = (UIBlockSearchHistory) uIBlock;
            this.d = uIBlockSearchHistory;
            CatalogViewStyle catalogViewStyle = uIBlock.l;
            SearchHistoryViewStyle searchHistoryViewStyle = catalogViewStyle instanceof SearchHistoryViewStyle ? (SearchHistoryViewStyle) catalogViewStyle : null;
            SearchHistoryViewStyle.Style style = searchHistoryViewStyle != null ? searchHistoryViewStyle.b : null;
            int i = style == null ? -1 : a.$EnumSwitchMapping$0[style.ordinal()];
            if (i == 1) {
                Object Pb = uIBlockSearchHistory.Pb();
                g(new dvh0(0, Pb instanceof Artist ? (Artist) Pb : null, this));
                return;
            }
            if (i == 2) {
                Object Pb2 = uIBlockSearchHistory.Pb();
                g(new g6(27, Pb2 instanceof Podcast ? (Podcast) Pb2 : null, this));
                return;
            }
            if (i == 3) {
                Object Pb3 = uIBlockSearchHistory.Pb();
                g(new evh0(0, Pb3 instanceof AudioBook ? (AudioBook) Pb3 : null, this));
                return;
            }
            if (i == 4) {
                Object Pb4 = uIBlockSearchHistory.Pb();
                g(new z5a(26, Pb4 instanceof Playlist ? (Playlist) Pb4 : null, this));
                return;
            }
            if (i != 5) {
                return;
            }
            Object Pb5 = uIBlockSearchHistory.Pb();
            Playlist playlist = Pb5 instanceof Playlist ? (Playlist) Pb5 : null;
            UserId userId = this.i;
            if (epx.f(playlist != null ? playlist.Bb(userId).c : null, userId)) {
                str = this.g.getString(R.string.music_my_playlist);
            } else {
                PlaylistOwner playlistOwner = playlist != null ? playlist.q : null;
                str = "";
                if (playlistOwner != null) {
                    if (playlistOwner.b.b < 0) {
                        str = playlistOwner.c;
                    } else {
                        String str2 = playlistOwner.e;
                        if (str2 != null) {
                            str = str2;
                        }
                    }
                }
            }
            g(new rw(playlist, this, str, 12));
        }
    }

    @Override // com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh
    public final void b(UIBlockSearchHistory<?> uIBlockSearchHistory, Context context) {
        SearchHistoryViewStyle.Style style = ((SearchHistoryViewStyle) uIBlockSearchHistory.l).b;
        boolean z = uIBlockSearchHistory instanceof UIBlockSearchHistory.a;
        SearchStatInfoProvider searchStatInfoProvider = this.l;
        b5a b5aVar = this.h;
        if (z) {
            b5aVar.a(new cfp0(uIBlockSearchHistory, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Open)));
            this.j.invoke(context, uIBlockSearchHistory, searchStatInfoProvider);
        } else if (uIBlockSearchHistory instanceof UIBlockSearchHistory.UIBlockSearchHistoryPlaylist) {
            int i = a.$EnumSwitchMapping$0[style.ordinal()];
            if (i == 4 || i == 5) {
                UIBlockSearchHistory.UIBlockSearchHistoryPlaylist uIBlockSearchHistoryPlaylist = (UIBlockSearchHistory.UIBlockSearchHistoryPlaylist) uIBlockSearchHistory;
                b5aVar.a(new cfp0(uIBlockSearchHistoryPlaylist, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Open)));
                this.k.invoke(context, uIBlockSearchHistoryPlaylist, searchStatInfoProvider);
            }
        }
    }

    @Override // com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh
    public final void a(UIBlockSearchHistory<?> uIBlockSearchHistory, Context context) {
    }

    @Override // com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh
    public final void d(UIBlockSearchHistory<?> uIBlockSearchHistory, Context context) {
    }
}
