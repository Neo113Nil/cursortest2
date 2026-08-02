package com.vk.catalog2.feature.music.holders.artist;

import android.content.Context;
import android.util.Size;
import android.view.View;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtistNew;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage;
import com.vk.dto.music.Artist;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import xsna.b5a;
import xsna.b7a;
import xsna.c750;
import xsna.dcn;
import xsna.ikv0;
import xsna.j22;
import xsna.k840;
import xsna.kbj0;
import xsna.mba;
import xsna.md;
import xsna.mk6;
import xsna.pd;
import xsna.pkv0;
import xsna.r5v0;
import xsna.s41;
import xsna.u2b0;
import xsna.uq3;
import xsna.vq3;
import xsna.zc40;

/* compiled from: ArtistInfoNewVh.kt */
/* loaded from: classes16.dex */
public final class ArtistInfoNewVh extends MusicPageInfoBlockNewVh {
    public final zc40 A;
    public dcn B;
    public c C;
    public String D;
    public vq3 E;
    public final mk6 x;
    public final c750 y;
    public final b7a z;

    public ArtistInfoNewVh(mk6 mk6Var, u2b0 u2b0Var, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, c750 c750Var, b7a b7aVar, mba mbaVar, kbj0 kbj0Var, zc40 zc40Var, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        super(u2b0Var, b5aVar, searchStatInfoProvider, musicPlaybackLaunchContext, mbaVar, kbj0Var);
        this.x = mk6Var;
        this.y = c750Var;
        this.z = b7aVar;
        this.A = zc40Var;
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockNewVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        super.L();
        vq3 vq3Var = this.E;
        if (vq3Var != null) {
            View view = this.j;
            if (view == null) {
                view = null;
            }
            view.removeCallbacks(vq3Var);
        }
        this.E = null;
        dcn dcnVar = this.B;
        if (dcnVar != null) {
            dcnVar.dismiss();
        }
        c cVar = this.C;
        if (cVar != null) {
            cVar.dispose();
        }
        this.C = null;
        zc40 zc40Var = this.A;
        if (zc40Var != null) {
            zc40.b();
            zc40Var.d.dispose();
        }
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockNewVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        UIBlockMusicArtistNew uIBlockMusicArtistNew = uIBlock instanceof UIBlockMusicArtistNew ? (UIBlockMusicArtistNew) uIBlock : null;
        if (uIBlockMusicArtistNew == null) {
            return;
        }
        Artist artist = uIBlockMusicArtistNew.z;
        this.D = artist.b;
        c cVar = this.C;
        if (cVar != null) {
            cVar.dispose();
        }
        r5v0 r5v0Var = k840.a.h;
        if (r5v0Var == null) {
            r5v0Var = null;
        }
        int i = 2;
        this.C = new i0(r5v0Var.a.a, new s41(new md(4), i)).f(uq3.class).subscribe(new j22(new pd(this, 5), i));
        if (artist.g) {
            VKImageView vKImageView = this.h;
            (vKImageView != null ? vKImageView : null).setPostprocessor(this.x);
        }
        zc40 zc40Var = this.A;
        if (zc40Var != null) {
            zc40Var.a(this, uIBlock);
        }
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockNewVh
    public final q<Integer> a(UIBlockMusicPage uIBlockMusicPage) {
        Artist artist;
        UIBlockMusicArtistNew uIBlockMusicArtistNew = uIBlockMusicPage instanceof UIBlockMusicArtistNew ? (UIBlockMusicArtistNew) uIBlockMusicPage : null;
        if (uIBlockMusicArtistNew == null || (artist = uIBlockMusicArtistNew.z) == null) {
            return null;
        }
        return this.y.a(artist, uIBlockMusicPage.b);
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockNewVh
    public final void d(Context context) {
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_notification_outline_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
        aVar.u = new ikv0.d(new ikv0.d.c(context.getString(R.string.music_artist_just_followed), 3), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.e = 7000L;
        pkv0.f(aVar);
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockNewVh
    public final void e() {
        vq3 vq3Var = this.E;
        if (vq3Var != null) {
            View view = this.j;
            if (view == null) {
                view = null;
            }
            view.removeCallbacks(vq3Var);
        }
        vq3 vq3Var2 = new vq3(this, 0);
        this.E = vq3Var2;
        View view2 = this.j;
        (view2 != null ? view2 : null).postDelayed(vq3Var2, 300L);
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockNewVh
    public final q<Integer> g(UIBlockMusicPage uIBlockMusicPage) {
        Artist artist;
        UIBlockMusicArtistNew uIBlockMusicArtistNew = uIBlockMusicPage instanceof UIBlockMusicArtistNew ? (UIBlockMusicArtistNew) uIBlockMusicPage : null;
        if (uIBlockMusicArtistNew == null || (artist = uIBlockMusicArtistNew.z) == null) {
            return null;
        }
        return this.y.b(artist, uIBlockMusicPage.b);
    }
}
