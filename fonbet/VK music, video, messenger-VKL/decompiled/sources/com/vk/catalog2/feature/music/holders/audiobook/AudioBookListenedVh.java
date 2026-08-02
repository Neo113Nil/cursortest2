package com.vk.catalog2.feature.music.holders.audiobook;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioBookItem;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBooksChapterProgressStatus;
import com.vk.music.bottomsheets.audiobook.AudioBookBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayAudioBookSource;
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
import xsna.e3m;
import xsna.enj;
import xsna.epx;
import xsna.fl4;
import xsna.iah0;
import xsna.ic40;
import xsna.lqk0;
import xsna.pq3;
import xsna.r5b0;
import xsna.u2b0;

/* compiled from: AudioBookListenedVh.kt */
/* loaded from: classes16.dex */
public final class AudioBookListenedVh implements CatalogViewHolder, View.OnClickListener {
    public final u2b0 b;
    public final fl4 c;
    public UIBlockAudioBookItem d;
    public AudioBook e;
    public ThumbsImageView f;
    public TextView g;
    public TextView h;
    public ImageView i;
    public ImageView j;
    public ImageView k;
    public ImageView l;
    public final a m = new a();

    /* compiled from: AudioBookListenedVh.kt */
    public static final class a extends e.a {
        public a() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, f fVar) {
            AudioBookListenedVh.this.a();
        }
    }

    public AudioBookListenedVh(u2b0 u2b0Var, fl4 fl4Var) {
        this.b = u2b0Var;
        this.c = fl4Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.b.n0(this.m);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        Image image;
        List<AudioBookChapter> list;
        if (uIBlock instanceof UIBlockAudioBookItem) {
            UIBlockAudioBookItem uIBlockAudioBookItem = (UIBlockAudioBookItem) uIBlock;
            this.d = uIBlockAudioBookItem;
            AudioBook audioBook = uIBlockAudioBookItem.y;
            this.e = audioBook;
            TextView textView = this.g;
            if (textView == null) {
                textView = null;
            }
            textView.setText(audioBook != null ? audioBook.c : null);
            TextView textView2 = this.h;
            TextView textView3 = textView2 == null ? null : textView2;
            if (textView2 == null) {
                textView2 = null;
            }
            Context context = textView2.getContext();
            AudioBook audioBook2 = this.e;
            long j = 0;
            long j2 = audioBook2 != null ? audioBook2.g * 1000 : 0L;
            if (audioBook2 != null && (list = audioBook2.k) != null) {
                Iterator<T> it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i += ((AudioBookChapter) it.next()).e;
                }
                j = i * 1000;
            }
            textView3.setText(pq3.d(context, j2, j).toString());
            AudioBook audioBook3 = this.e;
            if (audioBook3 != null && (image = audioBook3.j) != null) {
                ThumbsImageView thumbsImageView = this.f;
                if (thumbsImageView == null) {
                    thumbsImageView = null;
                }
                thumbsImageView.setThumb(new Thumb(image));
            }
            ImageView imageView = this.j;
            ImageView imageView2 = imageView != null ? imageView : null;
            AudioBook audioBook4 = this.e;
            awt0.u(imageView2, audioBook4 != null ? audioBook4.f : false);
            a();
        }
    }

    public final void a() {
        boolean z;
        List<AudioBookChapter> list;
        AudioBookChapter audioBookChapter;
        if (this.k == null) {
            return;
        }
        u2b0 u2b0Var = this.b;
        MusicTrack b = u2b0Var.b();
        AudioBook audioBook = this.e;
        if (audioBook != null && (list = audioBook.k) != null) {
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
        Drawable a2 = (z && u2b0Var.m0().h()) ? dhr0.t.a(R.drawable.bg_circle_pause) : dhr0.t.a(R.drawable.bg_circle_play);
        Drawable mutate = a2 != null ? a2.mutate() : null;
        LayerDrawable layerDrawable = mutate instanceof LayerDrawable ? (LayerDrawable) mutate : null;
        if (layerDrawable != null) {
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.icon);
            if (findDrawableByLayerId != null) {
                ImageView imageView = this.k;
                if (imageView == null) {
                    imageView = null;
                }
                Context context = imageView.getContext();
                e3m.a aVar = e3m.a;
                findDrawableByLayerId.setTint(context.getColor(R.color.vk_white));
            }
        } else {
            layerDrawable = null;
        }
        ImageView imageView2 = this.k;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setImageDrawable(layerDrawable);
        if (z && !u2b0Var.m0().i()) {
            ImageView imageView3 = this.l;
            if (imageView3 == null) {
                imageView3 = null;
            }
            imageView3.setVisibility(0);
            ImageView imageView4 = this.l;
            (imageView4 != null ? imageView4 : null).setActivated(u2b0Var.h());
            return;
        }
        ImageView imageView5 = this.l;
        if (imageView5 == null) {
            imageView5 = null;
        }
        imageView5.setVisibility(8);
        ImageView imageView6 = this.l;
        (imageView6 != null ? imageView6 : null).setActivated(false);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.P0(this.m, true);
        View inflate = layoutInflater.inflate(R.layout.audio_book_item_listened, viewGroup, false);
        this.f = (ThumbsImageView) inflate.findViewById(R.id.audio_image);
        this.g = (TextView) inflate.findViewById(R.id.audio_title);
        this.h = (TextView) inflate.findViewById(R.id.audio_duration);
        this.i = (ImageView) inflate.findViewById(R.id.audio_menu);
        this.j = (ImageView) inflate.findViewById(R.id.image_explicit);
        this.k = (ImageView) inflate.findViewById(R.id.image_button_play);
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
        this.l = imageView;
        inflate.setOnClickListener(new c98(this, 1));
        ImageView imageView2 = this.i;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setOnClickListener(new c98(this, 1));
        ImageView imageView3 = this.k;
        (imageView3 != null ? imageView3 : null).setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AudioBook audioBook;
        AudioBook audioBook2;
        ArrayList arrayList;
        MusicTrack musicTrack;
        AudioBookChapter audioBookChapter;
        Object obj;
        AudioBook audioBook3;
        AudioBook audioBook4;
        if (view == null) {
            return;
        }
        int id = view.getId();
        fl4 fl4Var = this.c;
        if (id == R.id.audio_menu) {
            Activity b = enj.b(view);
            UIBlockAudioBookItem uIBlockAudioBookItem = this.d;
            Integer valueOf = (uIBlockAudioBookItem == null || (audioBook4 = uIBlockAudioBookItem.y) == null) ? null : Integer.valueOf(audioBook4.b);
            if (b == null || valueOf == null) {
                return;
            }
            int intValue = valueOf.intValue();
            UIBlockAudioBookItem uIBlockAudioBookItem2 = this.d;
            if (uIBlockAudioBookItem2 == null || (audioBook3 = uIBlockAudioBookItem2.y) == null) {
                return;
            }
            ic40 w = fl4Var.w();
            AudioBookBottomSheetLaunchPoint.AudioBookListPoint.AudioBookListenedList audioBookListenedList = new AudioBookBottomSheetLaunchPoint.AudioBookListPoint.AudioBookListenedList(intValue, audioBook3.r, audioBook3.t);
            UIBlockAudioBookItem uIBlockAudioBookItem3 = this.d;
            w.o(b, audioBook3, audioBookListenedList, MusicPlaybackLaunchContext.Fb(uIBlockAudioBookItem3 != null ? uIBlockAudioBookItem3.f : null), false);
            return;
        }
        if (id != R.id.image_button_play) {
            Context context = view.getContext();
            UIBlockAudioBookItem uIBlockAudioBookItem4 = this.d;
            if (uIBlockAudioBookItem4 == null || (audioBook = uIBlockAudioBookItem4.y) == null) {
                return;
            }
            CatalogLaunchOrigin catalogLaunchOrigin = uIBlockAudioBookItem4.p;
            if (catalogLaunchOrigin == null) {
                catalogLaunchOrigin = CatalogLaunchOrigin.UNKNOWN;
            }
            String str = uIBlockAudioBookItem4.b;
            fl4Var.s(context, audioBook.b, MusicPlaybackLaunchContext.Fb(str != null ? str : "").Cb(catalogLaunchOrigin.h()));
            return;
        }
        UIBlockAudioBookItem uIBlockAudioBookItem5 = this.d;
        if (uIBlockAudioBookItem5 == null || (audioBook2 = uIBlockAudioBookItem5.y) == null) {
            return;
        }
        UIBlockAudioBookItem uIBlockAudioBookItem6 = this.d;
        String str2 = uIBlockAudioBookItem6 != null ? uIBlockAudioBookItem6.c : null;
        StartPlayAudioBookSource startPlayAudioBookSource = new StartPlayAudioBookSource(audioBook2, null, str2 == null ? "" : str2, 2, null);
        List<AudioBookChapter> list = audioBook2.k;
        if (list != null) {
            List<AudioBookChapter> list2 = list;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.vk.dto.music.audiobook.a.d(audioBook2, (AudioBookChapter) it.next()));
            }
            arrayList = arrayList2;
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
        ShuffleMode shuffleMode = ShuffleMode.SHUFFLE_OFF;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = MusicPlaybackLaunchContext.K;
        UIBlockAudioBookItem uIBlockAudioBookItem7 = this.d;
        String str3 = uIBlockAudioBookItem7 != null ? uIBlockAudioBookItem7.b : null;
        this.b.N0(new lqk0(startPlayAudioBookSource, musicTrack, arrayList, musicPlaybackLaunchContext.Bb(str3 != null ? str3 : ""), (musicTrack == null || (audioBookChapter = musicTrack.O) == null) ? 0 : audioBookChapter.e * 1000, shuffleMode, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 784));
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
