package com.vk.catalog2.feature.music.holders.audiobook;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
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
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.design.view.download.DownloadingView;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import xsna.bi40;
import xsna.bwt0;
import xsna.c98;
import xsna.di40;
import xsna.e3m;
import xsna.e43;
import xsna.enj;
import xsna.epx;
import xsna.ey2;
import xsna.fl4;

/* compiled from: AudioBookOfflineSliderVh.kt */
/* loaded from: classes16.dex */
public final class AudioBookOfflineSliderVh implements CatalogViewHolder, View.OnClickListener {
    public final fl4 b;
    public UIBlockAudioBookItem c;
    public View d;
    public ThumbsImageView e;
    public TextView f;
    public DownloadingView g;
    public TextView h;
    public TextView i;
    public final b j = new b();

    public AudioBookOfflineSliderVh(fl4 fl4Var) {
        this.b = fl4Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.j.dispose();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockAudioBookItem) {
            UIBlockAudioBookItem uIBlockAudioBookItem = (UIBlockAudioBookItem) uIBlock;
            this.c = uIBlockAudioBookItem;
            AudioBook audioBook = uIBlockAudioBookItem.y;
            ThumbsImageView thumbsImageView = this.e;
            if (thumbsImageView != null) {
                Image image = audioBook.j;
                thumbsImageView.setThumb(image != null ? new Thumb(image) : null);
            }
            DownloadingView downloadingView = this.g;
            if (downloadingView != null) {
                bi40 a = di40.a(DownloadingState.Downloaded.b);
                int i = DownloadingView.m;
                downloadingView.a(a, true);
            }
            TextView textView = this.f;
            if (textView != null) {
                textView.setText(audioBook.c);
            }
            TextView textView2 = this.h;
            if (textView2 != null) {
                ey2.i(textView2, audioBook.Db());
            }
            TextView textView3 = this.i;
            if (textView3 != null) {
                View view = this.d;
                if (view == null) {
                    view = null;
                }
                Context context = view.getContext();
                if (context == null && (context = e43.a) == null) {
                    context = null;
                }
                Iterable iterable = audioBook.k;
                if (iterable == null) {
                    iterable = EmptyList.b;
                }
                Iterable iterable2 = iterable;
                int i2 = 0;
                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    Iterator it = iterable2.iterator();
                    while (it.hasNext()) {
                        if (epx.f(((AudioBookChapter) it.next()).j, DownloadingState.Downloaded.b) && (i2 = i2 + 1) < 0) {
                            e43.s();
                            throw null;
                        }
                    }
                }
                ey2.i(textView3, enj.f(R.plurals.music_title_several_audio_book_chapters, i2, context));
            }
            View view2 = this.d;
            bwt0.Q(view2 != null ? view2 : null, R.id.catalog_ui_test_playlist, uIBlockAudioBookItem.Fb());
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_playlist_slider, viewGroup, false);
        this.d = inflate;
        this.e = (ThumbsImageView) inflate.findViewById(R.id.playlist_image);
        bwt0.p0((ImageView) inflate.findViewById(R.id.playlist_explicit), false);
        this.f = (TextView) inflate.findViewById(R.id.playlist_title);
        DownloadingView downloadingView = (DownloadingView) bwt0.q(inflate, R.id.downloading_container, null, 6);
        if (downloadingView != null) {
            downloadingView.setOnClickListener(new c98(this, 1));
        } else {
            downloadingView = null;
        }
        this.g = downloadingView;
        this.h = (TextView) inflate.findViewById(R.id.playlist_snippet1);
        this.i = (TextView) inflate.findViewById(R.id.playlist_snippet2);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.playlist_play_button_on_cover);
        if (imageView != null) {
            imageView.setOnClickListener(new c98(this, 1));
            bwt0.p0(imageView, false);
        }
        inflate.setOnClickListener(new c98(this, 1));
        Context context = inflate.getContext();
        if (context == null && (context = e43.a) == null) {
            context = null;
        }
        int a = e3m.a(R.dimen.music_playlist_slider_image_size, context);
        View view = this.d;
        bwt0.r0((e3m.a(R.dimen.music_playlist_slider_layout_padding, context) * 2) + a, view != null ? view : null);
        ThumbsImageView thumbsImageView = this.e;
        if (thumbsImageView != null) {
            bwt0.m0(a, a, thumbsImageView);
        }
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        UIBlockAudioBookItem uIBlockAudioBookItem;
        AudioBook audioBook;
        if (view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null || (uIBlockAudioBookItem = this.c) == null || (audioBook = uIBlockAudioBookItem.y) == null) {
            return;
        }
        CatalogLaunchOrigin catalogLaunchOrigin = uIBlockAudioBookItem.p;
        if (catalogLaunchOrigin == null) {
            catalogLaunchOrigin = CatalogLaunchOrigin.UNKNOWN;
        }
        String str = uIBlockAudioBookItem.b;
        if (str == null) {
            str = "";
        }
        this.b.o(h, audioBook.b, MusicPlaybackLaunchContext.Fb(str).Cb(catalogLaunchOrigin.h()), audioBook.c);
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
