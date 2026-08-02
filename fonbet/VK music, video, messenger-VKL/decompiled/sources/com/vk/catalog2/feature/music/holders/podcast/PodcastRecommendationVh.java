package com.vk.catalog2.feature.music.holders.podcast;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockPodcastItem;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.Podcast;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayPodcastSource;
import com.vk.music.player.e;
import com.vk.music.player.f;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.c98;
import xsna.e3m;
import xsna.epx;
import xsna.lqk0;
import xsna.maz;
import xsna.u2b0;
import xsna.xwk;

/* compiled from: PodcastRecommendationVh.kt */
/* loaded from: classes16.dex */
public final class PodcastRecommendationVh implements CatalogViewHolder, View.OnClickListener {
    public final u2b0 b;
    public UIBlockPodcastItem c;
    public ThumbsImageView d;
    public TextView e;
    public TextView f;
    public ImageView g;
    public final a h = new a();

    /* compiled from: PodcastRecommendationVh.kt */
    public static final class a extends e.a {
        public a() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, f fVar) {
            PodcastRecommendationVh.this.a();
        }
    }

    public PodcastRecommendationVh(u2b0 u2b0Var) {
        this.b = u2b0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.b.n0(this.h);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockPodcastItem) {
            UIBlockPodcastItem uIBlockPodcastItem = (UIBlockPodcastItem) uIBlock;
            this.c = uIBlockPodcastItem;
            Podcast podcast = uIBlockPodcastItem.y;
            ThumbsImageView thumbsImageView = this.d;
            if (thumbsImageView == null) {
                thumbsImageView = null;
            }
            thumbsImageView.setThumbs(podcast.f);
            TextView textView = this.e;
            if (textView == null) {
                textView = null;
            }
            textView.setText(podcast.d);
            TextView textView2 = this.f;
            (textView2 != null ? textView2 : null).setText(podcast.i);
            a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        PlayState playState;
        Podcast podcast;
        ImageView imageView = this.g;
        if (imageView != null) {
            u2b0 u2b0Var = this.b;
            if (u2b0Var.m0().h()) {
                UIBlockPodcastItem uIBlockPodcastItem = this.c;
                UserId userId = (uIBlockPodcastItem == null || (podcast = uIBlockPodcastItem.y) == null) ? null : podcast.c;
                MusicTrack b = u2b0Var.b();
                if (epx.f(userId, b != null ? b.c : null)) {
                    playState = u2b0Var.m0();
                    imageView.setImageResource(!playState.h() ? R.drawable.vk_icon_pause_24 : R.drawable.vk_icon_play_24);
                    imageView.setContentDescription(imageView.getContext().getString(!playState.i() ? R.string.music_talkback_play : R.string.music_talkback_pause));
                }
            }
            playState = PlayState.STOPPED;
            imageView.setImageResource(!playState.h() ? R.drawable.vk_icon_pause_24 : R.drawable.vk_icon_play_24);
            imageView.setContentDescription(imageView.getContext().getString(!playState.i() ? R.string.music_talkback_play : R.string.music_talkback_pause));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.P0(this.h, true);
        View inflate = layoutInflater.inflate(R.layout.catalog2_podcast_recomms, viewGroup, false);
        this.d = (ThumbsImageView) inflate.findViewById(R.id.image_thumb);
        this.g = (ImageView) inflate.findViewById(R.id.image_button_play);
        this.e = (TextView) inflate.findViewById(R.id.text_title);
        this.f = (TextView) inflate.findViewById(R.id.text_subtitle);
        inflate.setOnClickListener(new c98(this, 1));
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setOnClickListener(new c98(this, 1));
        }
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        UIBlockPodcastItem uIBlockPodcastItem;
        Podcast podcast;
        Podcast podcast2;
        if (view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null || (uIBlockPodcastItem = this.c) == null || (podcast = uIBlockPodcastItem.y) == null) {
            return;
        }
        if (view.getId() != R.id.image_button_play) {
            maz e = xwk.d().e();
            Uri parse = Uri.parse(podcast.d());
            LaunchContext.a aVar = new LaunchContext.a();
            UIBlockPodcastItem uIBlockPodcastItem2 = this.c;
            aVar.d = uIBlockPodcastItem2 != null ? uIBlockPodcastItem2.f : null;
            e.d(h, parse, aVar.a(), null);
            return;
        }
        UIBlockPodcastItem uIBlockPodcastItem3 = this.c;
        UserId userId = (uIBlockPodcastItem3 == null || (podcast2 = uIBlockPodcastItem3.y) == null) ? null : podcast2.c;
        u2b0 u2b0Var = this.b;
        MusicTrack b = u2b0Var.b();
        if (epx.f(userId, b != null ? b.c : null)) {
            u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
            return;
        }
        StartPlayPodcastSource startPlayPodcastSource = new StartPlayPodcastSource(podcast.c, 0);
        UIBlockPodcastItem uIBlockPodcastItem4 = this.c;
        u2b0Var.N0(new lqk0(startPlayPodcastSource, (MusicTrack) null, (List) null, MusicPlaybackLaunchContext.Fb(uIBlockPodcastItem4 != null ? uIBlockPodcastItem4.f : null), 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 886));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
