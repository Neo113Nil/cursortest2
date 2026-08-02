package com.vk.catalog2.feature.music.holders.curator;

import android.content.res.Configuration;
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
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicCurator;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.Curator;
import com.vk.dto.music.MusicTrack;
import com.vk.imageloader.view.VKImageView;
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
import xsna.g380;
import xsna.iah0;
import xsna.igh;
import xsna.ir0;
import xsna.lqk0;
import xsna.lz;
import xsna.m33;
import xsna.oh3;
import xsna.ov;
import xsna.oz;
import xsna.ph3;
import xsna.u2b0;
import xsna.uko;
import xsna.wje;
import xsna.xcd;

/* compiled from: CuratorInfoVhOld.kt */
/* loaded from: classes16.dex */
public final class CuratorInfoVhOld implements CatalogViewHolder, View.OnClickListener, g380 {
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
    public dcn l;
    public UIBlockMusicCurator m;
    public c n;
    public Drawable o;
    public Drawable p;

    public CuratorInfoVhOld(u2b0 u2b0Var, c750 c750Var, b7a b7aVar) {
        this.b = u2b0Var;
        this.c = c750Var;
        this.d = b7aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        c cVar = this.n;
        if (cVar != null) {
            cVar.dispose();
        }
        this.n = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        View view;
        int i;
        String str;
        UIBlockMusicCurator uIBlockMusicCurator = uIBlock instanceof UIBlockMusicCurator ? (UIBlockMusicCurator) uIBlock : null;
        if (uIBlockMusicCurator == null) {
            return;
        }
        this.m = uIBlockMusicCurator;
        UIBlockMusicCurator uIBlockMusicCurator2 = (UIBlockMusicCurator) uIBlock;
        Curator curator = uIBlockMusicCurator2.z;
        TextView textView = this.k;
        if (textView != null) {
            textView.setText(curator.c);
        }
        boolean z = curator.g;
        boolean z2 = curator.h;
        if (z) {
            ImageView imageView = this.h;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setImageDrawable(this.p);
        } else if (z2) {
            ImageView imageView2 = this.h;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setImageDrawable(this.o);
            ImageView imageView3 = this.h;
            if (imageView3 == null) {
                imageView3 = null;
            }
            imageView3.postDelayed(new ov(this, 2), 300L);
        }
        ImageView imageView4 = this.h;
        if (imageView4 == null) {
            imageView4 = null;
        }
        bwt0.p0(imageView4, z2);
        Image image = curator.e;
        if (image != null) {
            VKImageView vKImageView = this.e;
            if (vKImageView == null) {
                vKImageView = null;
            }
            if (vKImageView.getWidth() > 0) {
                VKImageView vKImageView2 = this.e;
                if (vKImageView2 == null) {
                    vKImageView2 = null;
                }
                i = vKImageView2.getWidth();
            } else {
                i = this.j;
            }
            ImageSize Cb = image.Cb(i, true, false);
            if (Cb != null && (str = Cb.d.d) != null) {
                VKImageView vKImageView3 = this.e;
                if (vKImageView3 == null) {
                    vKImageView3 = null;
                }
                vKImageView3.s0(str);
                view = this.i;
                if (view == null) {
                    view = null;
                }
                view.setVisibility(uIBlockMusicCurator2.y == null ? 0 : 4);
                TextView textView2 = this.g;
                TextView textView3 = textView2 != null ? textView2 : null;
                String str2 = curator.c;
                textView3.setVisibility((str2 != null || str2.length() <= 0) ? 4 : 0);
            }
        }
        VKImageView vKImageView4 = this.e;
        if (vKImageView4 == null) {
            vKImageView4 = null;
        }
        vKImageView4.clear();
        view = this.i;
        if (view == null) {
        }
        view.setVisibility(uIBlockMusicCurator2.y == null ? 0 : 4);
        TextView textView22 = this.g;
        if (textView22 != null) {
        }
        String str22 = curator.c;
        textView3.setVisibility((str22 != null || str22.length() <= 0) ? 4 : 0);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_curator_info_old, viewGroup, false);
        this.o = enj.d(R.drawable.vk_icon_add_square_outline_16, R.color.vk_white, inflate.getContext());
        this.p = enj.d(R.drawable.vk_icon_check_square_outline_16, R.color.vk_white, inflate.getContext());
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
        TextView textView2 = (TextView) inflate.findViewById(R.id.artist_genre);
        textView2.setVisibility(4);
        this.g = textView2;
        View findViewById2 = inflate.findViewById(R.id.artist_listen_all);
        findViewById2.setOnClickListener(new c98(this, 1));
        this.i = findViewById2;
        ImageView imageView2 = findViewById2 instanceof ImageView ? (ImageView) findViewById2 : null;
        if (imageView2 != null) {
            imageView2.setImageDrawable(uko.d(R.drawable.vk_icon_play_24, R.color.vk_black, inflate.getContext()));
        }
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
        Curator curator;
        String str;
        UIBlockMusicCurator uIBlockMusicCurator = this.m;
        if (uIBlockMusicCurator == null) {
            return;
        }
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.artist_listen_all) {
            UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = uIBlockMusicCurator.y;
            if (uIBlockActionPlayAudiosFromBlock == null || (str = uIBlockActionPlayAudiosFromBlock.z) == null) {
                return;
            }
            boolean z = uIBlockActionPlayAudiosFromBlock.B;
            StartPlayCatalogSource startPlayCatalogSource = new StartPlayCatalogSource(str, uIBlockMusicCurator.c, null, null, false, null, 60, null);
            ShuffleMode shuffleMode = z ? ShuffleMode.SHUFFLE_ON : ShuffleMode.SHUFFLE_OFF;
            MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(uIBlockMusicCurator.f);
            if (z) {
                Fb = Fb.Ab();
            }
            this.b.N0(new lqk0(startPlayCatalogSource, (MusicTrack) null, (List) null, Fb, 0, shuffleMode, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 822));
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.subscription_state && (curator = uIBlockMusicCurator.z) != null && this.n == null) {
            boolean z2 = curator.g;
            c750 c750Var = this.c;
            if (z2) {
                this.n = c750Var.f(curator).subscribe(new ph3(new oh3(14, this, curator), 24), new oz(new wje(this, 12), 13));
            } else if (curator.h) {
                this.n = c750Var.c(curator).subscribe(new ir0(new igh(this, 7), 11), new lz(new xcd(this, 13), 14));
            }
        }
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        dcn dcnVar = this.l;
        if (dcnVar != null) {
            dcnVar.dismiss();
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
