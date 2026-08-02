package com.vk.catalog2.feature.music.holders.artist;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtist;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Genre;
import com.vk.dto.music.MusicTrack;
import com.vk.imageloader.view.VKImageView;
import com.vk.movika.sdk.base.logic.interactor.d;
import com.vk.movika.sdk.base.logic.interactor.i;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.typography.FontFamily;
import com.vk.typography.b;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.util.List;
import xsna.b7a;
import xsna.bwt0;
import xsna.c750;
import xsna.c98;
import xsna.dcn;
import xsna.e3m;
import xsna.enj;
import xsna.ga;
import xsna.ha;
import xsna.hh7;
import xsna.ia;
import xsna.iah0;
import xsna.j5g;
import xsna.lqk0;
import xsna.lt0;
import xsna.m33;
import xsna.mf1;
import xsna.mk6;
import xsna.nf1;
import xsna.u2b0;
import xsna.xq3;
import xsna.yx0;

/* compiled from: ArtistInfoVhOld.kt */
/* loaded from: classes16.dex */
public final class ArtistInfoVhOld implements CatalogViewHolder, View.OnClickListener {
    public final u2b0 b;
    public final c750 c;
    public final b7a d;
    public VKImageView e;
    public View f;
    public TextView g;
    public ImageView h;
    public View i;
    public int j;
    public TextView k;
    public UIBlockMusicArtist l;
    public c m;
    public dcn n;
    public final mk6 o;
    public Drawable p;
    public Drawable q;

    public ArtistInfoVhOld(mk6 mk6Var, u2b0 u2b0Var, c750 c750Var, b7a b7aVar) {
        this.b = u2b0Var;
        this.c = c750Var;
        this.d = b7aVar;
        this.o = mk6Var == null ? new hh7(25) : mk6Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        c cVar = this.m;
        if (cVar != null) {
            cVar.dispose();
        }
        this.m = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        String str;
        int i;
        String str2;
        UIBlockMusicArtist uIBlockMusicArtist = uIBlock instanceof UIBlockMusicArtist ? (UIBlockMusicArtist) uIBlock : null;
        if (uIBlockMusicArtist == null) {
            return;
        }
        this.l = uIBlockMusicArtist;
        UIBlockMusicArtist uIBlockMusicArtist2 = (UIBlockMusicArtist) uIBlock;
        Artist artist = uIBlockMusicArtist2.z;
        TextView textView = this.k;
        if (textView != null) {
            textView.setText(artist.c);
        }
        if (artist.g) {
            VKImageView vKImageView = this.e;
            if (vKImageView == null) {
                vKImageView = null;
            }
            vKImageView.setPostprocessor(this.o);
        }
        if (artist.i) {
            ImageView imageView = this.h;
            if (imageView == null) {
                imageView = null;
            }
            bwt0.p0(imageView, true);
            ImageView imageView2 = this.h;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setImageDrawable(this.q);
        } else if (artist.h) {
            ImageView imageView3 = this.h;
            if (imageView3 == null) {
                imageView3 = null;
            }
            bwt0.p0(imageView3, true);
            ImageView imageView4 = this.h;
            if (imageView4 == null) {
                imageView4 = null;
            }
            imageView4.setImageDrawable(this.p);
            ImageView imageView5 = this.h;
            if (imageView5 == null) {
                imageView5 = null;
            }
            imageView5.postDelayed(new xq3(this, 0), 300L);
        } else {
            ImageView imageView6 = this.h;
            if (imageView6 == null) {
                imageView6 = null;
            }
            bwt0.p0(imageView6, false);
        }
        Image image = artist.f;
        if (image != null) {
            VKImageView vKImageView2 = this.e;
            if (vKImageView2 == null) {
                vKImageView2 = null;
            }
            if (vKImageView2.getWidth() > 0) {
                VKImageView vKImageView3 = this.e;
                if (vKImageView3 == null) {
                    vKImageView3 = null;
                }
                i = vKImageView3.getWidth();
            } else {
                i = this.j;
            }
            ImageSize Cb = image.Cb(i, true, false);
            if (Cb != null && (str2 = Cb.d.d) != null) {
                VKImageView vKImageView4 = this.e;
                if (vKImageView4 == null) {
                    vKImageView4 = null;
                }
                vKImageView4.s0(str2);
            }
        }
        List<Genre> list = artist.e;
        if (list == null || (str = j5g.g0(list, null, null, null, 0, new lt0(3), 31)) == null) {
            str = "";
        }
        TextView textView2 = this.g;
        if (textView2 == null) {
            textView2 = null;
        }
        bwt0.p0(textView2, str.length() > 0);
        TextView textView3 = this.g;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setText(str);
        View view = this.i;
        (view != null ? view : null).setVisibility(uIBlockMusicArtist2.y == null ? 4 : 0);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_artist_info_old, viewGroup, false);
        this.p = enj.d(R.drawable.vk_icon_add_16, R.color.vk_white, inflate.getContext());
        this.q = enj.d(R.drawable.vk_icon_done_16, R.color.vk_white, inflate.getContext());
        TextView textView = (TextView) inflate.findViewById(R.id.artist_name);
        if (textView != null) {
            b.k(textView, FontFamily.BOLD, null, 6);
        } else {
            textView = null;
        }
        this.k = textView;
        View findViewById = inflate.findViewById(R.id.artist_header_background);
        findViewById.setBackground(m33.a(R.color.music_artist_bg_color, findViewById.getContext()));
        this.f = findViewById;
        this.e = (VKImageView) inflate.findViewById(R.id.artist_header_image);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.subscription_state);
        imageView.setOnClickListener(this);
        this.h = imageView;
        this.g = (TextView) inflate.findViewById(R.id.artist_genre);
        View findViewById2 = inflate.findViewById(R.id.artist_listen_all);
        findViewById2.setOnClickListener(new c98(this, 1));
        this.i = findViewById2;
        int z = iah0.z(inflate.getContext());
        int a = iah0.a(800);
        if (z > a) {
            z = a;
        }
        this.j = z;
        e3m.a(R.dimen.music_artist_header_bottom_margin_genre_no, inflate.getContext());
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        UIBlockMusicArtist uIBlockMusicArtist = this.l;
        if (uIBlockMusicArtist == null) {
            return;
        }
        String str2 = uIBlockMusicArtist.b;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.artist_listen_all) {
            UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = uIBlockMusicArtist.y;
            if (uIBlockActionPlayAudiosFromBlock == null || (str = uIBlockActionPlayAudiosFromBlock.z) == null) {
                return;
            }
            boolean z = uIBlockActionPlayAudiosFromBlock.B;
            StartPlayCatalogSource startPlayCatalogSource = new StartPlayCatalogSource(str, uIBlockMusicArtist.c, null, null, false, null, 60, null);
            ShuffleMode shuffleMode = z ? ShuffleMode.SHUFFLE_ON : ShuffleMode.SHUFFLE_OFF;
            MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(uIBlockMusicArtist.f);
            if (z) {
                Fb = Fb.Ab();
            }
            this.b.N0(new lqk0(startPlayCatalogSource, (MusicTrack) null, (List) null, Fb, 0, shuffleMode, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 822));
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.subscription_state) {
            Artist artist = uIBlockMusicArtist.z;
            if (this.m != null) {
                return;
            }
            boolean z2 = artist.i;
            c750 c750Var = this.c;
            if (z2) {
                this.m = c750Var.b(artist, str2).subscribe(new mf1(new i(4, this, artist), 1), new nf1(new yx0(this, 3), 2));
            } else if (artist.h) {
                this.m = c750Var.a(artist, str2).subscribe(new ga(new d(this, 7), 5), new ia(new ha(this, 4), 4));
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
