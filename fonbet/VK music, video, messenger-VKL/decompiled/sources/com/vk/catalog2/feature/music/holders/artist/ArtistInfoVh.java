package com.vk.catalog2.feature.music.holders.artist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.View;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtist;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Genre;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.b5a;
import xsna.b7a;
import xsna.bwt0;
import xsna.c750;
import xsna.ca;
import xsna.dcn;
import xsna.enj;
import xsna.hh7;
import xsna.ikv0;
import xsna.j5g;
import xsna.k840;
import xsna.mk6;
import xsna.mp0;
import xsna.msy;
import xsna.pkv0;
import xsna.ql2;
import xsna.r5v0;
import xsna.u2b0;
import xsna.uq3;
import xsna.wc2;
import xsna.wl0;
import xsna.wq3;
import xsna.xl40;
import xsna.zc40;
import xsna.zj;

/* compiled from: ArtistInfoVh.kt */
/* loaded from: classes16.dex */
public final class ArtistInfoVh extends MusicPageInfoBlockVh {
    public final c750 r;
    public final b7a s;
    public final zc40 t;
    public final mk6 u;
    public dcn v;
    public c w;
    public String x;
    public final Object y;

    public /* synthetic */ ArtistInfoVh(hh7 hh7Var, u2b0 u2b0Var, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, c750 c750Var, b7a b7aVar) {
        this(hh7Var, u2b0Var, b5aVar, searchStatInfoProvider, c750Var, b7aVar, null, null);
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        super.L();
        c cVar = this.w;
        if (cVar != null) {
            cVar.dispose();
        }
        this.w = null;
        zc40 zc40Var = this.t;
        if (zc40Var != null) {
            zc40.b();
            zc40Var.d.dispose();
        }
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        Artist artist;
        String str;
        super.N6(uIBlock);
        UIBlockMusicArtist uIBlockMusicArtist = uIBlock instanceof UIBlockMusicArtist ? (UIBlockMusicArtist) uIBlock : null;
        if (uIBlockMusicArtist == null || (artist = uIBlockMusicArtist.z) == null) {
            return;
        }
        this.x = artist.b;
        c cVar = this.w;
        if (cVar != null) {
            cVar.dispose();
        }
        r5v0 r5v0Var = k840.a.h;
        if (r5v0Var == null) {
            r5v0Var = null;
        }
        this.w = new i0(r5v0Var.a.a, new ql2(new wq3(0), 1)).f(uq3.class).subscribe(new mp0(new wl0(this, 2), 2));
        if (artist.g) {
            VKImageView vKImageView = this.f;
            if (vKImageView == null) {
                vKImageView = null;
            }
            vKImageView.setPostprocessor(this.u);
        }
        List<Genre> list = artist.e;
        if (list == null || (str = j5g.g0(list, null, null, null, 0, new zj(2), 31)) == null) {
            str = "";
        }
        TextView textView = this.g;
        TextView textView2 = textView != null ? textView : null;
        bwt0.p0(textView2, str.length() > 0);
        textView2.setText(str);
        zc40 zc40Var = this.t;
        if (zc40Var != null) {
            zc40Var.a(this, uIBlock);
        }
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh
    public final q<Integer> a(UIBlockMusicPage uIBlockMusicPage) {
        Artist artist;
        UIBlockMusicArtist uIBlockMusicArtist = uIBlockMusicPage instanceof UIBlockMusicArtist ? (UIBlockMusicArtist) uIBlockMusicPage : null;
        if (uIBlockMusicArtist == null || (artist = uIBlockMusicArtist.z) == null) {
            return null;
        }
        return this.r.a(artist, uIBlockMusicPage.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh
    public final Drawable b(View view) {
        return enj.d(((xl40) this.y.getValue()).isEnabled().getValue().booleanValue() ? R.drawable.vk_icon_like_outline_24 : R.drawable.vk_icon_add_24, R.color.vk_white, view.getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh
    public final Drawable c(View view) {
        return enj.d(((xl40) this.y.getValue()).isEnabled().getValue().booleanValue() ? R.drawable.vk_icon_like_24 : R.drawable.vk_icon_done_24, R.color.vk_white, view.getContext());
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh
    public final int d() {
        return R.string.music_unfollow_artist;
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh
    public final void g(Context context) {
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_notification_outline_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
        aVar.u = new ikv0.d(new ikv0.d.c(context.getString(R.string.music_artist_just_followed), 3), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.e = 7000L;
        pkv0.f(aVar);
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh
    public final void h() {
        View view = this.h;
        if (view == null) {
            view = null;
        }
        view.postDelayed(new wc2(this, 2), 300L);
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh
    public final q<Integer> j(UIBlockMusicPage uIBlockMusicPage) {
        Artist artist;
        UIBlockMusicArtist uIBlockMusicArtist = uIBlockMusicPage instanceof UIBlockMusicArtist ? (UIBlockMusicArtist) uIBlockMusicPage : null;
        if (uIBlockMusicArtist == null || (artist = uIBlockMusicArtist.z) == null) {
            return null;
        }
        return this.r.b(artist, uIBlockMusicPage.b);
    }

    public ArtistInfoVh(mk6 mk6Var, u2b0 u2b0Var, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, c750 c750Var, b7a b7aVar, MusicPlaybackLaunchContext musicPlaybackLaunchContext, zc40 zc40Var) {
        super(u2b0Var, b5aVar, searchStatInfoProvider, musicPlaybackLaunchContext);
        this.r = c750Var;
        this.s = b7aVar;
        this.t = zc40Var;
        this.u = mk6Var == null ? new hh7(25) : mk6Var;
        this.y = msy.a(LazyThreadSafetyMode.NONE, new ca(this, 5));
    }
}
