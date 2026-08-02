package com.vk.catalog2.feature.music.holders.search;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.e;
import com.vk.music.player.f;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$PlayingState;
import java.util.List;
import xsna.lqk0;
import xsna.mba;
import xsna.u2b0;
import xsna.wh50;
import xsna.zak0;

/* compiled from: SearchHistoryItemVh.kt */
/* loaded from: classes16.dex */
public abstract class SearchHistoryPlayableItemVh extends SearchHistoryItemVh {
    public final u2b0 g;
    public final b h;
    public boolean i;
    public final a j;

    /* compiled from: SearchHistoryItemVh.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            SearchHistoryPlayableItemVh searchHistoryPlayableItemVh = SearchHistoryPlayableItemVh.this;
            if (searchHistoryPlayableItemVh.i) {
                return;
            }
            searchHistoryPlayableItemVh.g.P0(searchHistoryPlayableItemVh.h, true);
            searchHistoryPlayableItemVh.i = true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            SearchHistoryPlayableItemVh searchHistoryPlayableItemVh = SearchHistoryPlayableItemVh.this;
            if (searchHistoryPlayableItemVh.i) {
                searchHistoryPlayableItemVh.g.n0(searchHistoryPlayableItemVh.h);
                searchHistoryPlayableItemVh.i = false;
            }
        }
    }

    /* compiled from: SearchHistoryItemVh.kt */
    public static final class b extends e.a {
        public b() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, f fVar) {
            SearchHistoryPlayableItemVh searchHistoryPlayableItemVh = SearchHistoryPlayableItemVh.this;
            u2b0 u2b0Var = searchHistoryPlayableItemVh.g;
            Parcelable parcelable = searchHistoryPlayableItemVh.d;
            UIBlockSearchHistory.b bVar = parcelable instanceof UIBlockSearchHistory.b ? (UIBlockSearchHistory.b) parcelable : null;
            if (bVar == null) {
                return;
            }
            MusicTrack b = u2b0Var.b();
            ((zak0) ((wh50) searchHistoryPlayableItemVh.e.b)).setValue(b == null ? SearchHistoryItemViewParams$PlayingState.NONE : u2b0Var.m0() == PlayState.PLAYING ? bVar.o6(b) ? SearchHistoryItemViewParams$PlayingState.ACTIVE : SearchHistoryItemViewParams$PlayingState.NONE : u2b0Var.m0() == PlayState.PAUSED ? bVar.o6(b) ? SearchHistoryItemViewParams$PlayingState.INACTIVE : SearchHistoryItemViewParams$PlayingState.NONE : SearchHistoryItemViewParams$PlayingState.NONE);
        }
    }

    public SearchHistoryPlayableItemVh(Context context, mba mbaVar, u2b0 u2b0Var) {
        super(context, mbaVar);
        this.g = u2b0Var;
        this.h = new b();
        this.j = new a();
    }

    @Override // com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        ComposeView composeView = this.f;
        if (composeView != null) {
            composeView.removeOnAttachStateChangeListener(this.j);
        }
    }

    public final void h(MusicTrack musicTrack, UIBlockSearchHistory uIBlockSearchHistory) {
        this.g.N0(new lqk0((StartPlaySource) null, musicTrack, (List) null, MusicPlaybackLaunchContext.Fb(uIBlockSearchHistory.f).Bb(uIBlockSearchHistory.b).Cb(uIBlockSearchHistory.p.h()), 0, ShuffleMode.SHUFFLE_OFF, PlayRequestTrigger.FAST_PLAY_SINGLE_AUDIO, (AdsAudioPixelsContainer) null, 0L, 513));
    }

    @Override // com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        k5.addOnAttachStateChangeListener(this.j);
        return k5;
    }

    @Override // com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh, com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onPause() {
        if (this.i) {
            this.g.n0(this.h);
            this.i = false;
        }
    }

    @Override // com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh, com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onResume() {
        if (this.i) {
            return;
        }
        this.g.P0(this.h, true);
        this.i = true;
    }
}
