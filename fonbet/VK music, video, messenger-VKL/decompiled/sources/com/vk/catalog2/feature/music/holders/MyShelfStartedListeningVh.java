package com.vk.catalog2.feature.music.holders;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMyShelfPlayable;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBooksChapterProgressStatus;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayAudioBookSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.e;
import com.vk.music.player.f;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.awt0;
import xsna.c5g;
import xsna.c98;
import xsna.dhr0;
import xsna.epx;
import xsna.gz80;
import xsna.iah0;
import xsna.lqk0;
import xsna.maz;
import xsna.r5b0;
import xsna.u2b0;
import xsna.xwk;

/* compiled from: MyShelfStartedListeningVh.kt */
/* loaded from: classes16.dex */
public final class MyShelfStartedListeningVh implements CatalogViewHolder, View.OnClickListener {
    public final u2b0 b;
    public ThumbsImageView c;
    public TextView d;
    public TextView e;
    public ImageView f;
    public ImageView g;
    public ImageView h;
    public UIBlockMyShelfPlayable i;
    public final a j = new a();

    /* compiled from: MyShelfStartedListeningVh.kt */
    public static final class a extends e.a {
        public a() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, f fVar) {
            MyShelfStartedListeningVh.this.a();
        }
    }

    public MyShelfStartedListeningVh(u2b0 u2b0Var) {
        this.b = u2b0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.b.n0(this.j);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        String str;
        Thumb thumb;
        if (uIBlock instanceof UIBlockMyShelfPlayable) {
            UIBlockMyShelfPlayable uIBlockMyShelfPlayable = (UIBlockMyShelfPlayable) uIBlock;
            AudioBook audioBook = uIBlockMyShelfPlayable.A;
            MusicTrack musicTrack = uIBlockMyShelfPlayable.z;
            this.i = uIBlockMyShelfPlayable;
            this.b.P0(this.j, true);
            TextView textView = this.d;
            if (textView == null) {
                textView = null;
            }
            textView.setText(uIBlockMyShelfPlayable.y.e);
            TextView textView2 = this.e;
            if (textView2 == null) {
                textView2 = null;
            }
            if (musicTrack == null || (str = musicTrack.h) == null) {
                str = audioBook != null ? audioBook.c : "";
            }
            textView2.setText(str);
            ThumbsImageView thumbsImageView = this.c;
            if (thumbsImageView == null) {
                thumbsImageView = null;
            }
            if ((audioBook != null ? audioBook.j : null) == null) {
                if (musicTrack != null) {
                    thumb = musicTrack.Jb();
                }
                thumb = null;
            } else {
                Image image = audioBook.j;
                if (image != null) {
                    thumb = new Thumb(image);
                }
                thumb = null;
            }
            thumbsImageView.setThumb(thumb);
            ImageView imageView = this.f;
            awt0.u(imageView != null ? imageView : null, audioBook != null ? audioBook.f : musicTrack != null ? musicTrack.s : false);
            a();
        }
    }

    public final void a() {
        boolean z;
        MusicTrack musicTrack;
        AudioBook audioBook;
        List<AudioBookChapter> list;
        AudioBookChapter audioBookChapter;
        u2b0 u2b0Var = this.b;
        MusicTrack b = u2b0Var.b();
        Integer valueOf = b != null ? Integer.valueOf(b.b) : null;
        UIBlockMyShelfPlayable uIBlockMyShelfPlayable = this.i;
        if (uIBlockMyShelfPlayable != null && (audioBook = uIBlockMyShelfPlayable.A) != null && (list = audioBook.k) != null) {
            List<AudioBookChapter> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (epx.f(((AudioBookChapter) it.next()).b, (b == null || (audioBookChapter = b.O) == null) ? null : audioBookChapter.b)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        UIBlockMyShelfPlayable uIBlockMyShelfPlayable2 = this.i;
        boolean z2 = epx.f(valueOf, (uIBlockMyShelfPlayable2 == null || (musicTrack = uIBlockMyShelfPlayable2.z) == null) ? null : Integer.valueOf(musicTrack.b)) || z;
        ImageView imageView = this.g;
        if (imageView == null) {
            imageView = null;
        }
        Drawable a2 = ((!u2b0Var.m0().h() || !z2) ? PlayState.STOPPED : u2b0Var.m0()).h() ? dhr0.t.a(R.drawable.vk_icon_pause_circle_fill_white_28) : dhr0.t.a(R.drawable.vk_icon_play_circle_fill_white_28);
        Context context = imageView.getContext();
        UIBlockMyShelfPlayable uIBlockMyShelfPlayable3 = this.i;
        boolean z3 = (uIBlockMyShelfPlayable3 != null ? uIBlockMyShelfPlayable3.A : null) != null;
        imageView.setContentDescription(context.getString(u2b0Var.m0().h() ? z3 ? R.string.audio_books_talkback_pause : R.string.podcasts_talkback_pause : z3 ? R.string.audio_books_talkback_play : R.string.podcasts_talkback_play));
        imageView.setImageDrawable(a2);
        if (z2 && !u2b0Var.m0().i()) {
            ImageView imageView2 = this.h;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setVisibility(0);
            ImageView imageView3 = this.h;
            (imageView3 != null ? imageView3 : null).setActivated(u2b0Var.h());
            return;
        }
        ImageView imageView4 = this.h;
        if (imageView4 == null) {
            imageView4 = null;
        }
        imageView4.setVisibility(8);
        ImageView imageView5 = this.h;
        (imageView5 != null ? imageView5 : null).setActivated(false);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.music_item_started_listening_track, viewGroup, false);
        this.c = (ThumbsImageView) inflate.findViewById(R.id.audio_image);
        this.d = (TextView) inflate.findViewById(R.id.audio_title);
        this.e = (TextView) inflate.findViewById(R.id.audio_subtitle);
        this.f = (ImageView) inflate.findViewById(R.id.image_explicit);
        this.g = (ImageView) inflate.findViewById(R.id.image_button_play);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.audio_playing_indicator);
        float b = iah0.b(10.0f);
        r5b0.b bVar = new r5b0.b(inflate.getContext());
        bVar.a(R.integer.music_playing_drawable_rect_count);
        bVar.g(R.dimen.music_playing_drawable_rect_width);
        bVar.d(R.dimen.music_playing_drawable_rect_corners);
        bVar.e(R.dimen.music_playing_drawable_rect_height);
        bVar.f(R.dimen.music_playing_drawable_rect_min_height);
        bVar.c(R.color.music_playing_drawable_rect_white);
        bVar.b(R.dimen.music_playing_drawable_gap);
        bVar.j = new float[]{b, iah0.b(16.0f), iah0.b(18.0f), b};
        imageView.setImageDrawable(new r5b0(bVar));
        this.h = imageView;
        if (gz80.a(28)) {
            int color = inflate.getContext().getColor(R.color.vk_black_alpha20);
            ((CardView) inflate.findViewById(R.id.card_container)).setOutlineSpotShadowColor(color);
            ((CardView) inflate.findViewById(R.id.image_card_container)).setOutlineSpotShadowColor(color);
        }
        inflate.setOnClickListener(new c98(this, 1));
        ImageView imageView2 = this.g;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lqk0 lqk0Var;
        AudioBook audioBook;
        ArrayList arrayList;
        MusicTrack musicTrack;
        AudioBookChapter audioBookChapter;
        Object obj;
        if (view == null) {
            return;
        }
        if (view.getId() != R.id.image_button_play) {
            Context context = view.getContext();
            UIBlockMyShelfPlayable uIBlockMyShelfPlayable = this.i;
            if (uIBlockMyShelfPlayable != null) {
                ActionOpenUrl actionOpenUrl = uIBlockMyShelfPlayable.y.f;
                String str = actionOpenUrl != null ? actionOpenUrl.c : null;
                if (str != null) {
                    maz e = xwk.d().e();
                    LaunchContext.a aVar = new LaunchContext.a();
                    UIBlockMyShelfPlayable uIBlockMyShelfPlayable2 = this.i;
                    aVar.d = uIBlockMyShelfPlayable2 != null ? uIBlockMyShelfPlayable2.f : null;
                    maz.c(e, context, str, aVar.a(), null, null, 24);
                    return;
                }
                return;
            }
            return;
        }
        UIBlockMyShelfPlayable uIBlockMyShelfPlayable3 = this.i;
        if (uIBlockMyShelfPlayable3 == null || (audioBook = uIBlockMyShelfPlayable3.A) == null) {
            lqk0Var = new lqk0((StartPlaySource) null, uIBlockMyShelfPlayable3 != null ? uIBlockMyShelfPlayable3.z : null, (List) null, (MusicPlaybackLaunchContext) null, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT);
        } else {
            List<AudioBookChapter> list = audioBook.k;
            if (list != null) {
                List<AudioBookChapter> list2 = list;
                arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.vk.dto.music.audiobook.a.d(audioBook, (AudioBookChapter) it.next()));
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    AudioBookChapter audioBookChapter2 = ((MusicTrack) obj).O;
                    if ((audioBookChapter2 != null ? audioBookChapter2.f : null) == AudioBooksChapterProgressStatus.IN_PROGRESS) {
                        break;
                    }
                }
                musicTrack = (MusicTrack) obj;
            } else {
                musicTrack = null;
            }
            UIBlockMyShelfPlayable uIBlockMyShelfPlayable4 = this.i;
            String str2 = uIBlockMyShelfPlayable4 != null ? uIBlockMyShelfPlayable4.c : null;
            StartPlayAudioBookSource startPlayAudioBookSource = new StartPlayAudioBookSource(audioBook, null, str2 == null ? "" : str2, 2, null);
            ShuffleMode shuffleMode = ShuffleMode.SHUFFLE_OFF;
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = MusicPlaybackLaunchContext.L;
            UIBlockMyShelfPlayable uIBlockMyShelfPlayable5 = this.i;
            String str3 = uIBlockMyShelfPlayable5 != null ? uIBlockMyShelfPlayable5.b : null;
            lqk0Var = new lqk0(startPlayAudioBookSource, musicTrack, arrayList, musicPlaybackLaunchContext.Bb(str3 != null ? str3 : ""), (musicTrack == null || (audioBookChapter = musicTrack.O) == null) ? 0 : audioBookChapter.e * 1000, shuffleMode, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 912);
        }
        this.b.N0(lqk0Var);
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
