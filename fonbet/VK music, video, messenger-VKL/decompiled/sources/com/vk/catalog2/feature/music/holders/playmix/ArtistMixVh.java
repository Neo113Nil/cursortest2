package com.vk.catalog2.feature.music.holders.playmix;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockPlayMixAction;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.Thumb;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.view.MusicRoundPlayView;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ava0;
import xsna.b5a;
import xsna.b780;
import xsna.bv40;
import xsna.bwt0;
import xsna.c98;
import xsna.cfp0;
import xsna.e3m;
import xsna.epx;
import xsna.gzs;
import xsna.u2b0;

/* compiled from: ArtistMixVh.kt */
/* loaded from: classes16.dex */
public final class ArtistMixVh implements CatalogViewHolder, View.OnClickListener {
    public final u2b0 b;
    public final ava0 c;
    public final b5a d;
    public UIBlockPlayMixAction e;
    public MusicRoundPlayView f;
    public VKImageView g;
    public TextView h;
    public TextView i;
    public ThumbsImageView j;
    public final bv40 k;

    /* compiled from: ArtistMixVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(((ArtistMixVh) this.receiver).a());
        }
    }

    public ArtistMixVh(u2b0 u2b0Var, ava0 ava0Var, b5a b5aVar) {
        this.b = u2b0Var;
        this.c = ava0Var;
        this.d = b5aVar;
        this.k = new bv40(u2b0Var, new b(0, this, ArtistMixVh.class, "isSameMix", "isSameMix()Z", 0));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        VKImageView vKImageView = this.g;
        if (vKImageView == null) {
            vKImageView = null;
        }
        vKImageView.setOnLoadCallback(null);
        this.k.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        String str;
        Image image;
        UIBlockPlayMixAction uIBlockPlayMixAction = uIBlock instanceof UIBlockPlayMixAction ? (UIBlockPlayMixAction) uIBlock : null;
        if (uIBlockPlayMixAction == null) {
            return;
        }
        this.e = uIBlockPlayMixAction;
        TextView textView = this.h;
        if (textView == null) {
            textView = null;
        }
        UIBlockPlayMixAction.a aVar = ((UIBlockPlayMixAction) uIBlock).C;
        textView.setText(aVar.a);
        TextView textView2 = this.i;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(aVar.b);
        VKImageView vKImageView = this.g;
        VKImageView vKImageView2 = vKImageView == null ? null : vKImageView;
        Image image2 = aVar.c;
        if (image2 != null) {
            if (vKImageView == null) {
                vKImageView = null;
            }
            ImageSize Cb = image2.Cb(e3m.a(R.dimen.music_smart_playlist_image_width, vKImageView.getContext()), true, false);
            if (Cb != null) {
                str = Cb.d.d;
                vKImageView2.s0(str);
                image = aVar.d;
                if (image == null) {
                    ThumbsImageView thumbsImageView = this.j;
                    if (thumbsImageView == null) {
                        thumbsImageView = null;
                    }
                    bwt0.p0(thumbsImageView, true);
                    ThumbsImageView thumbsImageView2 = this.j;
                    (thumbsImageView2 != null ? thumbsImageView2 : null).setThumb(new Thumb(image));
                } else {
                    ThumbsImageView thumbsImageView3 = this.j;
                    bwt0.p0(thumbsImageView3 != null ? thumbsImageView3 : null, false);
                }
                this.k.e();
            }
        }
        str = null;
        vKImageView2.s0(str);
        image = aVar.d;
        if (image == null) {
        }
        this.k.e();
    }

    public final boolean a() {
        UIBlockPlayMixAction uIBlockPlayMixAction = this.e;
        String str = uIBlockPlayMixAction != null ? uIBlockPlayMixAction.E : null;
        StartPlaySource j = this.b.j();
        StartPlayVkMixSource startPlayVkMixSource = j instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) j : null;
        return epx.f(str, startPlayVkMixSource != null ? startPlayVkMixSource.j : null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_mix_artist_slider, viewGroup, false);
        MusicRoundPlayView musicRoundPlayView = (MusicRoundPlayView) inflate.findViewById(R.id.play_view);
        this.k.a(musicRoundPlayView);
        musicRoundPlayView.setOnClickListener(new c98(this, 1));
        this.f = musicRoundPlayView;
        this.h = (TextView) inflate.findViewById(R.id.artist_title);
        this.i = (TextView) inflate.findViewById(R.id.artist_subtitle);
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.background_image);
        vKImageView.W();
        vKImageView.setOnLoadCallback(new a(vKImageView));
        this.g = vKImageView;
        this.j = (ThumbsImageView) inflate.findViewById(R.id.artist_thumb);
        inflate.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockPlayMixAction uIBlockPlayMixAction = this.e;
        if (uIBlockPlayMixAction != null) {
            boolean a2 = a();
            u2b0 u2b0Var = this.b;
            this.d.a(new cfp0(uIBlockPlayMixAction, new MusicAnalyticsInfo((a2 && u2b0Var.h()) ? MusicAnalyticsInfo.ClickTarget.Pause : MusicAnalyticsInfo.ClickTarget.Play)));
            if (a()) {
                u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
                return;
            }
            MusicRoundPlayView musicRoundPlayView = this.f;
            if (musicRoundPlayView == null) {
                musicRoundPlayView = null;
            }
            if (musicRoundPlayView.a()) {
                return;
            }
            this.k.c();
            UIBlockPlayMixAction uIBlockPlayMixAction2 = this.e;
            if (uIBlockPlayMixAction2 != null) {
                this.c.a(uIBlockPlayMixAction2);
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

    /* compiled from: ArtistMixVh.kt */
    public static final class a implements b780 {
        public final /* synthetic */ VKImageView b;

        public a(VKImageView vKImageView) {
            this.b = vKImageView;
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
            this.b.W();
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
