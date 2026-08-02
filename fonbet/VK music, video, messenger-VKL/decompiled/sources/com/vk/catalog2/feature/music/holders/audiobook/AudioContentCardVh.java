package com.vk.catalog2.feature.music.holders.audiobook;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.music.CatalogAudioContentCard;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioContentCard;
import com.vk.catalog2.feature.music.holders.audiobook.AudioContentCardVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.podcast.Podcast;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayPodcastSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.b5a;
import xsna.c98;
import xsna.cfp0;
import xsna.cvk;
import xsna.db;
import xsna.e3m;
import xsna.epx;
import xsna.eu0;
import xsna.f4m;
import xsna.fl4;
import xsna.gzs;
import xsna.hm4;
import xsna.lqk0;
import xsna.lyd;
import xsna.nt;
import xsna.phb0;
import xsna.s3q0;
import xsna.u2b0;

/* compiled from: AudioContentCardVh.kt */
/* loaded from: classes16.dex */
public final class AudioContentCardVh implements CatalogViewHolder, View.OnClickListener {
    public final int b;
    public final u2b0 c;
    public final fl4 d;
    public final b5a e;
    public final phb0 f;
    public ThumbsImageView g;
    public TextView h;
    public TextView i;
    public VkButton j;
    public VkButton k;
    public Podcast l;
    public UIBlockAudioContentCard m;
    public final io.reactivex.rxjava3.disposables.b n;
    public Context o;
    public final hm4 p;

    /* compiled from: ViewExt.kt */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ View b;
        public final /* synthetic */ Ref$IntRef c;
        public final /* synthetic */ Ref$IntRef d;
        public final /* synthetic */ AudioContentCardVh e;

        public a(View view, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, AudioContentCardVh audioContentCardVh) {
            this.b = view;
            this.c = ref$IntRef;
            this.d = ref$IntRef2;
            this.e = audioContentCardVh;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            View view = this.b;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            Ref$IntRef ref$IntRef = this.c;
            int i = ref$IntRef.element;
            Ref$IntRef ref$IntRef2 = this.d;
            if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
                ref$IntRef.element = measuredWidth;
                ref$IntRef2.element = measuredHeight;
                VkButton vkButton = this.e.k;
                if (vkButton != null) {
                    f4m.k(measuredHeight, vkButton);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class b implements gzs<s3q0> {
        public final /* synthetic */ View b;
        public final /* synthetic */ Ref$IntRef c;
        public final /* synthetic */ Ref$IntRef d;
        public final /* synthetic */ TextView e;

        public b(View view, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, TextView textView) {
            this.b = view;
            this.c = ref$IntRef;
            this.d = ref$IntRef2;
            this.e = textView;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            View view = this.b;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            Ref$IntRef ref$IntRef = this.c;
            int i = ref$IntRef.element;
            Ref$IntRef ref$IntRef2 = this.d;
            if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
                ref$IntRef.element = measuredWidth;
                ref$IntRef2.element = measuredHeight;
                TextView textView = this.e;
                int height = textView.getHeight() / textView.getLineHeight();
                if (textView.getMaxLines() != height) {
                    textView.setMaxLines(height);
                }
            }
            return s3q0.a;
        }
    }

    public AudioContentCardVh(u2b0 u2b0Var, b5a b5aVar, phb0 phb0Var) {
        fl4 g = lyd.g();
        this.b = R.layout.catalog_music_audio_content_item;
        this.c = u2b0Var;
        this.d = g;
        this.e = b5aVar;
        this.f = phb0Var;
        this.n = new io.reactivex.rxjava3.disposables.b();
        this.p = new hm4(this);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.c.n0(this.p);
        this.n.e();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockAudioContentCard uIBlockAudioContentCard = uIBlock instanceof UIBlockAudioContentCard ? (UIBlockAudioContentCard) uIBlock : null;
        if (uIBlockAudioContentCard == null) {
            return;
        }
        this.m = uIBlockAudioContentCard;
        CatalogAudioContentCard Qb = uIBlockAudioContentCard.Qb();
        if (uIBlockAudioContentCard instanceof UIBlockAudioContentCard.AudioBookCard) {
            AudioBook audioBook = ((UIBlockAudioContentCard.AudioBookCard) uIBlockAudioContentCard).A;
            TextView textView = this.h;
            if (textView != null) {
                textView.setText(audioBook != null ? audioBook.c : null);
            }
            TextView textView2 = this.i;
            if (textView2 != null) {
                textView2.setText(Qb.e);
                return;
            }
            return;
        }
        if (!(uIBlockAudioContentCard instanceof UIBlockAudioContentCard.PodcastCard)) {
            throw new NoWhenBranchMatchedException();
        }
        Podcast podcast = ((UIBlockAudioContentCard.PodcastCard) uIBlockAudioContentCard).A;
        this.l = podcast;
        TextView textView3 = this.h;
        if (textView3 != null) {
            textView3.setText(podcast != null ? podcast.d : null);
        }
        TextView textView4 = this.i;
        if (textView4 != null) {
            textView4.setText(Qb.e);
        }
        TextView textView5 = this.i;
        if (textView5 != null) {
            textView5.requestLayout();
        }
        ThumbsImageView thumbsImageView = this.g;
        if (thumbsImageView != null) {
            Podcast podcast2 = this.l;
            thumbsImageView.setThumbs(podcast2 != null ? podcast2.f : null);
        }
        VkButton vkButton = this.k;
        if (vkButton != null) {
            Podcast podcast3 = this.l;
            if (podcast3 == null || !podcast3.l) {
                Integer valueOf = Integer.valueOf(R.drawable.vk_icon_add_16);
                int[] iArr = VkButton.W;
                vkButton.a5(true, valueOf);
                vkButton.setContentDescription(vkButton.getContext().getString(R.string.podcast_subscribe));
            } else {
                Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_done_16);
                int[] iArr2 = VkButton.W;
                vkButton.a5(true, valueOf2);
                vkButton.setContentDescription(vkButton.getContext().getString(R.string.podcast_unsubscribe));
            }
        }
        a();
    }

    public final void a() {
        VkButton vkButton = this.j;
        if (vkButton != null) {
            u2b0 u2b0Var = this.c;
            if (u2b0Var.m0().h()) {
                Podcast podcast = this.l;
                UserId userId = podcast != null ? podcast.c : null;
                MusicTrack b2 = u2b0Var.b();
                if (epx.f(userId, b2 != null ? b2.c : null)) {
                    Integer valueOf = Integer.valueOf(R.drawable.vk_icon_pause_16);
                    int[] iArr = VkButton.W;
                    vkButton.a5(true, valueOf);
                    vkButton.setText(R.string.audio_content_pause_button_title);
                    vkButton.setContentDescription(vkButton.getContext().getString(R.string.podcasts_talkback_pause));
                    return;
                }
            }
            Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_play_16);
            int[] iArr2 = VkButton.W;
            vkButton.a5(true, valueOf2);
            vkButton.setText(R.string.audio_content_play_button_title);
            vkButton.setContentDescription(vkButton.getContext().getString(R.string.podcasts_talkback_play));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.b, viewGroup, false);
        this.c.P0(this.p, true);
        this.o = viewGroup != null ? viewGroup.getContext() : null;
        this.h = (TextView) inflate.findViewById(R.id.title);
        this.i = (TextView) inflate.findViewById(R.id.subtitle);
        this.g = (ThumbsImageView) inflate.findViewById(R.id.cover_image);
        this.j = (VkButton) inflate.findViewById(R.id.play_pause_button);
        this.k = (VkButton) inflate.findViewById(R.id.follow_unfollow_button);
        inflate.setBackgroundResource(R.drawable.bg_suggestion_rounded_with_stroke);
        inflate.setOnClickListener(new c98(this, 1));
        VkButton vkButton = this.j;
        if (vkButton != null) {
            vkButton.setOnClickListener(new c98(this, 1));
        }
        VkButton vkButton2 = this.k;
        if (vkButton2 != null) {
            vkButton2.setOnClickListener(new c98(this, 1));
        }
        VkButton vkButton3 = this.j;
        if (vkButton3 != null) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = vkButton3.getMeasuredWidth();
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            ref$IntRef2.element = vkButton3.getMeasuredHeight();
            f4m.a(vkButton3, new a(vkButton3, ref$IntRef, ref$IntRef2, this));
        }
        TextView textView = this.i;
        if (textView != null) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.gm4
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    TextView textView2 = (TextView) view;
                    int ellipsisCount = textView2.getLayout().getEllipsisCount(textView2.getLayout().getLineCount() - 1);
                    if (ellipsisCount > 0) {
                        String obj = textView2.getText().subSequence(0, textView2.getText().length() - ellipsisCount).toString();
                        TextView textView3 = AudioContentCardVh.this.i;
                        if (textView3 != null) {
                            textView3.post(new hc3(1, textView2, obj));
                        }
                    }
                }
            });
        }
        TextView textView2 = this.i;
        if (textView2 != null) {
            Ref$IntRef ref$IntRef3 = new Ref$IntRef();
            ref$IntRef3.element = textView2.getMeasuredWidth();
            Ref$IntRef ref$IntRef4 = new Ref$IntRef();
            ref$IntRef4.element = textView2.getMeasuredHeight();
            f4m.a(textView2, new b(textView2, ref$IntRef3, ref$IntRef4, textView2));
        }
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        MusicAnalyticsInfo.ClickTarget clickTarget;
        String h2;
        CatalogLaunchOrigin catalogLaunchOrigin;
        String h3;
        CatalogLaunchOrigin catalogLaunchOrigin2;
        MusicAnalyticsInfo.ClickTarget clickTarget2;
        if (view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null) {
            return;
        }
        UIBlockAudioContentCard uIBlockAudioContentCard = this.m;
        if (uIBlockAudioContentCard instanceof UIBlockAudioContentCard.PodcastCard) {
            Podcast podcast = ((UIBlockAudioContentCard.PodcastCard) uIBlockAudioContentCard).A;
            int id = view.getId();
            b5a b5aVar = this.e;
            if (id == R.id.play_pause_button) {
                UIBlockAudioContentCard uIBlockAudioContentCard2 = this.m;
                u2b0 u2b0Var = this.c;
                if (uIBlockAudioContentCard2 != null) {
                    if (u2b0Var.T0()) {
                        UserId userId = podcast.c;
                        MusicTrack b2 = u2b0Var.b();
                        if (epx.f(userId, b2 != null ? b2.c : null)) {
                            clickTarget2 = MusicAnalyticsInfo.ClickTarget.Pause;
                            b5aVar.a(new cfp0(uIBlockAudioContentCard2, new MusicAnalyticsInfo(clickTarget2)));
                        }
                    }
                    clickTarget2 = MusicAnalyticsInfo.ClickTarget.Play;
                    b5aVar.a(new cfp0(uIBlockAudioContentCard2, new MusicAnalyticsInfo(clickTarget2)));
                }
                Podcast podcast2 = this.l;
                UserId userId2 = podcast2 != null ? podcast2.c : null;
                MusicTrack b3 = u2b0Var.b();
                if (epx.f(userId2, b3 != null ? b3.c : null)) {
                    u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
                    return;
                }
                StartPlayPodcastSource startPlayPodcastSource = new StartPlayPodcastSource(podcast.c, 0);
                UIBlockAudioContentCard uIBlockAudioContentCard3 = this.m;
                u2b0Var.N0(new lqk0(startPlayPodcastSource, (MusicTrack) null, (List) null, MusicPlaybackLaunchContext.Fb(uIBlockAudioContentCard3 != null ? uIBlockAudioContentCard3.f : null), 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 886));
                return;
            }
            if (id != R.id.follow_unfollow_button) {
                UIBlockAudioContentCard uIBlockAudioContentCard4 = this.m;
                if (uIBlockAudioContentCard4 != null) {
                    b5aVar.a(new cfp0(uIBlockAudioContentCard4, new cfp0(uIBlockAudioContentCard4, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Open))));
                }
                this.d.v(h, podcast.c, MusicPlaybackLaunchContext.v);
                return;
            }
            Podcast podcast3 = this.l;
            if (podcast3 != null) {
                int i = podcast3.b;
                UserId userId3 = podcast3.c;
                boolean z = podcast3.l;
                phb0 phb0Var = this.f;
                if (z) {
                    clickTarget = MusicAnalyticsInfo.ClickTarget.Unsubscribe;
                    Integer valueOf = Integer.valueOf(i);
                    UIBlockAudioContentCard uIBlockAudioContentCard5 = this.m;
                    if (uIBlockAudioContentCard5 == null || (catalogLaunchOrigin2 = uIBlockAudioContentCard5.p) == null || (h3 = catalogLaunchOrigin2.h()) == null) {
                        h3 = CatalogLaunchOrigin.UNKNOWN.h();
                    }
                    UIBlockAudioContentCard uIBlockAudioContentCard6 = this.m;
                    phb0Var.c(userId3, valueOf, h3, uIBlockAudioContentCard6 != null ? uIBlockAudioContentCard6.f : null).i(new com.vk.im.ui.components.dialogs_list.b(new nt(this), 5)).subscribe();
                } else {
                    MusicAnalyticsInfo.ClickTarget clickTarget3 = MusicAnalyticsInfo.ClickTarget.Subscribe;
                    if (podcast3.k) {
                        Integer valueOf2 = Integer.valueOf(i);
                        UIBlockAudioContentCard uIBlockAudioContentCard7 = this.m;
                        if (uIBlockAudioContentCard7 == null || (catalogLaunchOrigin = uIBlockAudioContentCard7.p) == null || (h2 = catalogLaunchOrigin.h()) == null) {
                            h2 = CatalogLaunchOrigin.UNKNOWN.h();
                        }
                        UIBlockAudioContentCard uIBlockAudioContentCard8 = this.m;
                        phb0Var.b(userId3, valueOf2, h2, uIBlockAudioContentCard8 != null ? uIBlockAudioContentCard8.f : null).i(new eu0(new db(this, 9), 2)).subscribe();
                    } else {
                        Context context2 = this.o;
                        cvk.w(context2 != null ? context2.getString(R.string.podcast_subscribe_fail) : null, false);
                        s3q0 s3q0Var = s3q0.a;
                    }
                    clickTarget = clickTarget3;
                }
                UIBlockAudioContentCard uIBlockAudioContentCard9 = this.m;
                if (uIBlockAudioContentCard9 != null) {
                    b5aVar.a(new cfp0(uIBlockAudioContentCard9, new MusicAnalyticsInfo(clickTarget)));
                }
            }
        }
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
