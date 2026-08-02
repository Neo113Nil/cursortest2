package com.vk.catalog2.feature.music.holders;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vkontakte.android.R;
import java.util.List;
import xsna.c98;
import xsna.ccr0;
import xsna.cn70;
import xsna.e3m;
import xsna.epx;
import xsna.fl4;
import xsna.iah0;
import xsna.lqk0;
import xsna.lyd;
import xsna.s490;
import xsna.u2b0;
import xsna.y050;
import xsna.y2q;

/* compiled from: ExclusiveAlbumVh.kt */
/* loaded from: classes16.dex */
public final class ExclusiveAlbumVh implements CatalogViewHolder, View.OnClickListener {
    public final u2b0 b;
    public final fl4 c;
    public final int d;
    public final int e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final y2q k;
    public View l;
    public VKImageView m;
    public TextView n;
    public TextView o;
    public ImageView p;
    public ccr0 q;
    public String r;
    public UIBlockMusicPlaylist s;

    public ExclusiveAlbumVh(u2b0 u2b0Var) {
        fl4 g = lyd.g();
        this.b = u2b0Var;
        this.c = g;
        this.d = cn70.b(24);
        this.e = cn70.b(16);
        this.f = cn70.a() * 20.0f;
        this.g = cn70.b(360);
        this.h = cn70.b(200);
        this.i = R.drawable.vk_icon_play_24;
        this.j = R.drawable.vk_icon_pause_24;
        this.k = new y2q();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        String str;
        UIBlockMusicPlaylist uIBlockMusicPlaylist = uIBlock instanceof UIBlockMusicPlaylist ? (UIBlockMusicPlaylist) uIBlock : null;
        if (uIBlockMusicPlaylist == null) {
            return;
        }
        this.s = uIBlockMusicPlaylist;
        int i = uIBlockMusicPlaylist.F ? this.e : this.d;
        View view = this.l;
        if (view == null) {
            view = null;
        }
        Point j = iah0.j(view.getContext());
        int min = Math.min(j.x, j.y) - (i * 2);
        int i2 = this.g;
        if (min > i2) {
            min = i2;
        }
        View view2 = this.l;
        if (view2 == null) {
            view2 = null;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = min;
        layoutParams.height = (int) (min * 1.09d);
        view2.setLayoutParams(layoutParams);
        View view3 = this.l;
        if (view3 == null) {
            view3 = null;
        }
        view3.requestLayout();
        Thumb thumb = uIBlockMusicPlaylist.z.m;
        if (thumb != null) {
            Serializer.c<Thumb> cVar = Thumb.CREATOR;
            str = thumb.Ab(this.h, false);
        } else {
            str = null;
        }
        if (!epx.f(this.r, str)) {
            VKImageView vKImageView = this.m;
            if (vKImageView == null) {
                vKImageView = null;
            }
            vKImageView.load(str);
            ccr0 ccr0Var = this.q;
            if (ccr0Var == null) {
                ccr0Var = null;
            }
            ccr0Var.r(str);
            this.r = str;
        }
        TextView textView = this.n;
        if (textView == null) {
            textView = null;
        }
        textView.setText(uIBlockMusicPlaylist.z.h);
        TextView textView2 = this.n;
        if (textView2 == null) {
            textView2 = null;
        }
        boolean z = uIBlockMusicPlaylist.z.k;
        View view4 = this.l;
        if (view4 == null) {
            view4 = null;
        }
        s490.a(textView2, z, e3m.f(R.attr.vk_ui_text_primary, view4.getContext()));
        TextView textView3 = this.o;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setText(s490.i(uIBlockMusicPlaylist.z.r));
        ImageView imageView = this.p;
        ImageView imageView2 = imageView != null ? imageView : null;
        u2b0 u2b0Var = this.b;
        PlayState m0 = (u2b0Var.m0().h() && a()) ? u2b0Var.m0() : PlayState.STOPPED;
        imageView2.setImageResource(m0.h() ? this.j : this.i);
        imageView2.setContentDescription(imageView2.getContext().getString(m0.i() ? R.string.music_talkback_play : R.string.music_talkback_pause));
    }

    public final boolean a() {
        Playlist playlist;
        u2b0 u2b0Var = this.b;
        if (!(u2b0Var.j() instanceof StartPlayPlaylistSource)) {
            return false;
        }
        UIBlockMusicPlaylist uIBlockMusicPlaylist = this.s;
        return epx.f((uIBlockMusicPlaylist == null || (playlist = uIBlockMusicPlaylist.z) == null) ? null : playlist.Ib(), u2b0Var.x0().Kb());
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_exclusive_album_slider, viewGroup, false);
        inflate.setOnClickListener(new c98(this, 1));
        this.l = inflate;
        this.m = (VKImageView) inflate.findViewById(R.id.album_cover);
        this.n = (TextView) inflate.findViewById(R.id.album_title);
        this.o = (TextView) inflate.findViewById(R.id.album_artist);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.play_button);
        imageView.setOnClickListener(new c98(this, 1));
        this.p = imageView;
        ccr0 ccr0Var = new ccr0(inflate.getContext());
        this.q = ccr0Var;
        ccr0Var.g.u(RoundingParams.b(this.f));
        ccr0 ccr0Var2 = this.q;
        (ccr0Var2 == null ? null : ccr0Var2).i = this.k;
        if (ccr0Var2 == null) {
            ccr0Var2 = null;
        }
        ccr0Var2.setAlpha(76);
        ccr0 ccr0Var3 = this.q;
        inflate.setBackground(ccr0Var3 != null ? ccr0Var3 : null);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockMusicPlaylist uIBlockMusicPlaylist;
        Playlist playlist;
        Playlist playlist2;
        if (view.getId() != R.id.play_button) {
            Activity h = e3m.h(view.getContext());
            if (h == null || (uIBlockMusicPlaylist = this.s) == null || (playlist = uIBlockMusicPlaylist.z) == null) {
                return;
            }
            y050 U = this.c.U();
            UIBlockMusicPlaylist uIBlockMusicPlaylist2 = this.s;
            U.a(h, new y050.b.a(playlist, uIBlockMusicPlaylist2 != null ? uIBlockMusicPlaylist2.f : null, uIBlockMusicPlaylist2 != null ? uIBlockMusicPlaylist2.b : null, null, null, 24));
            return;
        }
        boolean a = a();
        u2b0 u2b0Var = this.b;
        if (a) {
            u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
            return;
        }
        UIBlockMusicPlaylist uIBlockMusicPlaylist3 = this.s;
        if (uIBlockMusicPlaylist3 == null || (playlist2 = uIBlockMusicPlaylist3.z) == null) {
            return;
        }
        String str = playlist2.x;
        String str2 = uIBlockMusicPlaylist3.b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = uIBlockMusicPlaylist3.c;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = playlist2.h;
        if (str4 == null) {
            str4 = "";
        }
        StartPlayPlaylistSource startPlayPlaylistSource = new StartPlayPlaylistSource(new PlaySourceMeta.PlaylistPlaySourceMeta(str4, playlist2.Eb(), playlist2.c, playlist2.b, playlist2.O, playlist2.z), str2, str3, str);
        ShuffleMode shuffleMode = ShuffleMode.SHUFFLE_OFF;
        UIBlockMusicPlaylist uIBlockMusicPlaylist4 = this.s;
        u2b0Var.N0(new lqk0(startPlayPlaylistSource, (MusicTrack) null, (List) null, MusicPlaybackLaunchContext.Fb(uIBlockMusicPlaylist4 != null ? uIBlockMusicPlaylist4.f : null).Db(playlist2), 0, shuffleMode, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 822));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
