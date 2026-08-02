package com.vk.catalog2.feature.music.holders.artist;

import android.content.Context;
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
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtist;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.ui.utils.TitleColorAttr;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.e;
import com.vk.music.player.f;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.typography.FontFamily;
import com.vk.typography.b;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.c;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import xsna.b5a;
import xsna.bq00;
import xsna.brj0;
import xsna.bwt0;
import xsna.c98;
import xsna.cfp0;
import xsna.dda;
import xsna.dw20;
import xsna.e3m;
import xsna.enj;
import xsna.epx;
import xsna.i0q0;
import xsna.i3r;
import xsna.iah0;
import xsna.jnj;
import xsna.lqk0;
import xsna.m5;
import xsna.mm1;
import xsna.o3y;
import xsna.u2b0;

/* compiled from: MusicPageInfoBlockVh.kt */
/* loaded from: classes16.dex */
public abstract class MusicPageInfoBlockVh implements CatalogViewHolder, View.OnClickListener {
    public final u2b0 b;
    public final b5a c;
    public final SearchStatInfoProvider d;
    public final MusicPlaybackLaunchContext e;
    public VKImageView f;
    public TextView g;
    public View h;
    public View i;
    public int j;
    public TextView k;
    public UIBlockMusicPage l;
    public c m;
    public dw20 n;
    public Drawable o;
    public Drawable p;
    public final a q = new a();

    /* compiled from: MusicPageInfoBlockVh.kt */
    public static final class a extends e.a {
        public a() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, f fVar) {
            MusicPageInfoBlockVh.this.k();
        }
    }

    public MusicPageInfoBlockVh(u2b0 u2b0Var, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        this.b = u2b0Var;
        this.c = b5aVar;
        this.d = searchStatInfoProvider;
        this.e = musicPlaybackLaunchContext;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void L() {
        c cVar = this.m;
        if (cVar != null) {
            cVar.dispose();
        }
        this.m = null;
        dw20 dw20Var = this.n;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        this.n = null;
        this.b.n0(this.q);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        int i;
        ImageSize Cb;
        Image Sb;
        ImageSize Cb2;
        TextView textView;
        UIBlockMusicPage uIBlockMusicPage = uIBlock instanceof UIBlockMusicPage ? (UIBlockMusicPage) uIBlock : null;
        if (uIBlockMusicPage == null) {
            return;
        }
        UIBlockMusicPage uIBlockMusicPage2 = this.l;
        this.l = uIBlockMusicPage;
        if (!epx.f(uIBlockMusicPage.getName(), uIBlockMusicPage2 != null ? uIBlockMusicPage2.getName() : null) && (textView = this.k) != null) {
            textView.setText(uIBlockMusicPage.getName());
        }
        if (uIBlockMusicPage2 == null || uIBlockMusicPage.Tb() != uIBlockMusicPage2.Tb() || uIBlockMusicPage.Pb() != uIBlockMusicPage2.Pb()) {
            l(uIBlockMusicPage.Tb(), uIBlockMusicPage.Pb());
        }
        VKImageView vKImageView = this.f;
        if (vKImageView == null) {
            vKImageView = null;
        }
        if (vKImageView.getWidth() > 0) {
            VKImageView vKImageView2 = this.f;
            if (vKImageView2 == null) {
                vKImageView2 = null;
            }
            i = vKImageView2.getWidth();
        } else {
            i = this.j;
        }
        String str = (uIBlockMusicPage2 == null || (Sb = uIBlockMusicPage2.Sb()) == null || (Cb2 = Sb.Cb(i, true, false)) == null) ? null : Cb2.d.d;
        Image Sb2 = uIBlockMusicPage.Sb();
        String str2 = (Sb2 == null || (Cb = Sb2.Cb(i, true, false)) == null) ? null : Cb.d.d;
        if (!epx.f(str, str2) && str2 != null) {
            VKImageView vKImageView3 = this.f;
            if (vKImageView3 == null) {
                vKImageView3 = null;
            }
            vKImageView3.s0(str2);
        }
        k();
        View view = this.i;
        (view != null ? view : null).setVisibility(uIBlockMusicPage.y == null ? 4 : 0);
    }

    public abstract q<Integer> a(UIBlockMusicPage uIBlockMusicPage);

    public Drawable b(View view) {
        return enj.d(R.drawable.vk_icon_add_24, R.color.vk_white, view.getContext());
    }

    public Drawable c(View view) {
        return enj.d(R.drawable.vk_icon_done_24, R.color.vk_white, view.getContext());
    }

    public abstract int d();

    public final boolean e() {
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock;
        UIBlockMusicPage uIBlockMusicPage = this.l;
        String str = (uIBlockMusicPage == null || (uIBlockActionPlayAudiosFromBlock = uIBlockMusicPage.y) == null) ? null : uIBlockActionPlayAudiosFromBlock.z;
        StartPlaySource j = this.b.j();
        StartPlayCatalogSource startPlayCatalogSource = j instanceof StartPlayCatalogSource ? (StartPlayCatalogSource) j : null;
        if (str != null) {
            return epx.f(startPlayCatalogSource != null ? startPlayCatalogSource.c : null, str);
        }
        return false;
    }

    public abstract void g(Context context);

    public abstract void h();

    public abstract q<Integer> j(UIBlockMusicPage uIBlockMusicPage);

    public final void k() {
        u2b0 u2b0Var = this.b;
        PlayState m0 = (u2b0Var.m0().h() && e()) ? u2b0Var.m0() : PlayState.STOPPED;
        View view = this.i;
        if (view == null) {
            view = null;
        }
        int i = m0.h() ? R.drawable.vk_icon_pause_36 : R.drawable.vk_icon_play_36;
        if (view instanceof ImageView) {
            ((ImageView) view).setImageResource(i);
        } else if (view instanceof VkButton) {
            Integer valueOf = Integer.valueOf(i);
            int[] iArr = VkButton.W;
            ((VkButton) view).a5(true, valueOf);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.P0(this.q, false);
        View inflate = layoutInflater.inflate(R.layout.catalog_artist_info, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.artist_name);
        if (textView != null) {
            b.k(textView, FontFamily.BOLD, null, 6);
        } else {
            textView = null;
        }
        this.k = textView;
        this.f = (VKImageView) inflate.findViewById(R.id.artist_header_image);
        View findViewById = inflate.findViewById(R.id.subscription_state);
        findViewById.setOnClickListener(this);
        this.h = findViewById;
        this.g = (TextView) inflate.findViewById(R.id.artist_genre);
        View findViewById2 = inflate.findViewById(R.id.artist_listen_all);
        findViewById2.setOnClickListener(new c98(this, 1));
        this.i = findViewById2;
        int z = iah0.z(inflate.getContext());
        int a2 = iah0.a(800);
        if (z > a2) {
            z = a2;
        }
        this.j = z;
        e3m.a(R.dimen.music_artist_header_bottom_margin_genre_no, inflate.getContext());
        this.o = b(inflate);
        this.p = c(inflate);
        return inflate;
    }

    public final void l(boolean z, boolean z2) {
        if (z) {
            View view = this.h;
            if (view == null) {
                view = null;
            }
            bwt0.p0(view, true);
            View view2 = this.h;
            if (view2 == null) {
                view2 = null;
            }
            Drawable drawable = this.p;
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setText(R.string.music_artist_curator_followed);
                return;
            } else {
                if (view2 instanceof ImageView) {
                    ((ImageView) view2).setImageDrawable(drawable);
                    return;
                }
                return;
            }
        }
        if (!z2) {
            View view3 = this.h;
            bwt0.p0(view3 != null ? view3 : null, false);
            return;
        }
        View view4 = this.h;
        if (view4 == null) {
            view4 = null;
        }
        bwt0.p0(view4, true);
        View view5 = this.h;
        if (view5 == null) {
            view5 = null;
        }
        Drawable drawable2 = this.o;
        if (view5 instanceof TextView) {
            TextView textView2 = (TextView) view5;
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setText(R.string.music_follow_artist_curator);
        } else if (view5 instanceof ImageView) {
            ((ImageView) view5).setImageDrawable(drawable2);
        }
        h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        MusicAnalyticsInfo.ClickTarget clickTarget;
        String str;
        Artist artist;
        UIBlockMusicPage uIBlockMusicPage = this.l;
        if (uIBlockMusicPage == null || view == null || (context = view.getContext()) == null) {
            return;
        }
        int id = view.getId();
        b5a b5aVar = this.c;
        c cVar = null;
        if (id != R.id.artist_listen_all) {
            if (id == R.id.subscription_state && this.m == null) {
                if (uIBlockMusicPage.Tb()) {
                    this.n = new dw20.b(context, null).P(Collections.singletonList(new brj0(0, 0, null, 0, context.getString(d()), true, false, null, 0, null, TitleColorAttr.DESTRUCTIVE, null, null, null, 126894)), new mm1(18, this, uIBlockMusicPage)).I0(null);
                    return;
                }
                if (uIBlockMusicPage.Pb()) {
                    b5aVar.a(new cfp0(uIBlockMusicPage, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Subscribe)));
                    q<Integer> a2 = a(uIBlockMusicPage);
                    if (a2 != null) {
                        int i = 6;
                        cVar = a2.subscribe(new m5(new dda(this, uIBlockMusicPage, context, i), 29), new o3y(new bq00(this, 10), i));
                    }
                    this.m = cVar;
                    return;
                }
                return;
            }
            return;
        }
        UIBlockMusicArtist uIBlockMusicArtist = uIBlockMusicPage instanceof UIBlockMusicArtist ? (UIBlockMusicArtist) uIBlockMusicPage : null;
        if (uIBlockMusicArtist != null && (artist = uIBlockMusicArtist.z) != null && jnj.j(artist.m)) {
            i0q0.f(new i3r(context, 2));
            return;
        }
        boolean e = e();
        u2b0 u2b0Var = this.b;
        if (e) {
            clickTarget = u2b0Var.h() ? MusicAnalyticsInfo.ClickTarget.PauseAll : MusicAnalyticsInfo.ClickTarget.PlayAll;
            u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
        } else {
            clickTarget = MusicAnalyticsInfo.ClickTarget.PlayAll;
            UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = uIBlockMusicPage.y;
            if (uIBlockActionPlayAudiosFromBlock == null || (str = uIBlockActionPlayAudiosFromBlock.z) == null) {
                return;
            }
            boolean z = uIBlockActionPlayAudiosFromBlock.B;
            SearchStatInfoProvider searchStatInfoProvider = this.d;
            boolean a3 = searchStatInfoProvider != null ? searchStatInfoProvider.a() : false;
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.e;
            if (musicPlaybackLaunchContext == null) {
                musicPlaybackLaunchContext = a3 ? MusicPlaybackLaunchContext.o.Bb(uIBlockMusicPage.b) : MusicPlaybackLaunchContext.Fb(uIBlockMusicPage.f);
            }
            Pair pair = z ? new Pair(ShuffleMode.SHUFFLE_ON, musicPlaybackLaunchContext.Ab()) : new Pair(ShuffleMode.SHUFFLE_OFF, musicPlaybackLaunchContext);
            u2b0Var.N0(new lqk0((StartPlaySource) new StartPlayCatalogSource(str, uIBlockMusicPage.c, null, null, false, null, 60, null), (MusicTrack) (0 == true ? 1 : 0), (List) null, (MusicPlaybackLaunchContext) pair.g(), 0, (ShuffleMode) pair.d(), PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 822));
        }
        b5aVar.a(new cfp0(uIBlockMusicPage, new MusicAnalyticsInfo(clickTarget)));
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
