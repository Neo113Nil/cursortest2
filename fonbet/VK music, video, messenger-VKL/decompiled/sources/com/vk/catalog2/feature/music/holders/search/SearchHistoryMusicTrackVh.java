package com.vk.catalog2.feature.music.holders.search;

import android.content.Context;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.SearchHistoryViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.movika.tools.controls.seekbar.t;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$ActionIconParams;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.cfp0;
import xsna.epx;
import xsna.guh0;
import xsna.huh0;
import xsna.mba;
import xsna.o4e;
import xsna.ob50;
import xsna.u2b0;
import xsna.u2l;

/* compiled from: SearchHistoryMusicTrackVh.kt */
/* loaded from: classes16.dex */
public final class SearchHistoryMusicTrackVh extends SearchHistoryPlayableItemVh {
    public final Context k;
    public final b5a l;
    public final o4e m;
    public final guh0 n;
    public final t o;
    public final huh0.b p;
    public final huh0.c q;
    public final SearchStatInfoProvider r;
    public final boolean s;

    /* compiled from: SearchHistoryMusicTrackVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchHistoryViewStyle.Style.values().length];
            try {
                iArr[SearchHistoryViewStyle.Style.Track.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchHistoryViewStyle.Style.TrackLyrics.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SearchHistoryMusicTrackVh(Context context, mba mbaVar, u2b0 u2b0Var, b5a b5aVar, o4e o4eVar, guh0 guh0Var, t tVar, huh0.b bVar, huh0.c cVar, SearchStatInfoProvider searchStatInfoProvider, boolean z) {
        super(context, mbaVar, u2b0Var);
        this.k = context;
        this.l = b5aVar;
        this.m = o4eVar;
        this.n = guh0Var;
        this.o = tVar;
        this.p = bVar;
        this.q = cVar;
        this.r = searchStatInfoProvider;
        this.s = z;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryTrack) {
            this.d = (UIBlockSearchHistory) uIBlock;
            CatalogViewStyle catalogViewStyle = uIBlock.l;
            String str = null;
            SearchHistoryViewStyle searchHistoryViewStyle = catalogViewStyle instanceof SearchHistoryViewStyle ? (SearchHistoryViewStyle) catalogViewStyle : null;
            SearchHistoryViewStyle.Style style = searchHistoryViewStyle != null ? searchHistoryViewStyle.b : null;
            MusicTrack musicTrack = ((UIBlockSearchHistory.UIBlockSearchHistoryTrack) uIBlock).A;
            int i = style == null ? -1 : a.$EnumSwitchMapping$0[style.ordinal()];
            if (i == 1) {
                str = e(R.string.music_search_history_track, ob50.a(musicTrack));
            } else if (i == 2) {
                str = e(R.string.music_search_history_track_lyrics, ob50.a(musicTrack));
            }
            String str2 = str;
            SearchHistoryItemViewParams$ActionIconParams searchHistoryItemViewParams$ActionIconParams = (this.s || !epx.f(musicTrack.J, DownloadingState.NotLoaded.b)) ? SearchHistoryItemViewParams$ActionIconParams.d : ((Boolean) this.q.invoke(musicTrack)).booleanValue() ? new SearchHistoryItemViewParams$ActionIconParams(SearchHistoryItemViewParams$ActionIconParams.IconType.Done, true, Integer.valueOf(R.string.music_talkback_remove_from_my_music), 4) : ((Boolean) this.p.invoke(musicTrack)).booleanValue() ? new SearchHistoryItemViewParams$ActionIconParams(SearchHistoryItemViewParams$ActionIconParams.IconType.Add, true, Integer.valueOf(R.string.music_talkback_add_to_my_music), 4) : SearchHistoryItemViewParams$ActionIconParams.d;
            g(new u2l(musicTrack, this, str2, searchHistoryItemViewParams$ActionIconParams, new SearchHistoryItemViewParams$ActionIconParams(!epx.f(searchHistoryItemViewParams$ActionIconParams, SearchHistoryItemViewParams$ActionIconParams.d) ? SearchHistoryItemViewParams$ActionIconParams.IconType.MoreWithPreAction : SearchHistoryItemViewParams$ActionIconParams.IconType.More, true, Integer.valueOf(R.string.music_talkback_more), 4), 2));
        }
    }

    @Override // com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh
    public final void a(UIBlockSearchHistory<?> uIBlockSearchHistory, Context context) {
        cfp0 cfp0Var = new cfp0(uIBlockSearchHistory, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Menu));
        b5a b5aVar = this.l;
        b5aVar.a(cfp0Var);
        SearchStatInfoProvider searchStatInfoProvider = this.r;
        this.n.invoke(context, b5aVar, (UIBlockSearchHistory.UIBlockSearchHistoryTrack) uIBlockSearchHistory, searchStatInfoProvider);
    }

    @Override // com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh
    public final void b(UIBlockSearchHistory<?> uIBlockSearchHistory, Context context) {
        MusicTrack b;
        MusicTrack b2;
        UIBlockSearchHistory.UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack = uIBlockSearchHistory instanceof UIBlockSearchHistory.UIBlockSearchHistoryTrack ? (UIBlockSearchHistory.UIBlockSearchHistoryTrack) uIBlockSearchHistory : null;
        if (uIBlockSearchHistoryTrack == null) {
            return;
        }
        MusicTrack musicTrack = uIBlockSearchHistoryTrack.A;
        u2b0 u2b0Var = this.g;
        this.l.a(new cfp0(uIBlockSearchHistoryTrack, new MusicAnalyticsInfo((u2b0Var.h() && (b = u2b0Var.b()) != null && b.Tb() && (b2 = u2b0Var.b()) != null && b2.b == musicTrack.b) ? MusicAnalyticsInfo.ClickTarget.Pause : MusicAnalyticsInfo.ClickTarget.Play)));
        h(musicTrack, uIBlockSearchHistoryTrack);
    }

    @Override // com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh
    public final void c(UIBlockSearchHistory<?> uIBlockSearchHistory, Context context) {
        this.l.a(new cfp0(uIBlockSearchHistory, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.LongTap)));
        this.m.invoke(context, (UIBlockSearchHistory.UIBlockSearchHistoryTrack) uIBlockSearchHistory);
    }

    @Override // com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh
    public final void d(UIBlockSearchHistory<?> uIBlockSearchHistory, Context context) {
        this.o.invoke(context, (UIBlockSearchHistory.UIBlockSearchHistoryTrack) uIBlockSearchHistory);
    }
}
