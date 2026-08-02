package com.vk.catalog2.feature.music.holders.artist;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtistNew;
import com.vk.catalog2.feature.music.holders.artist.ArtistInfoNewVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPagePhoneHeaderNewVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPageToolbarNewVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vk.typography.b;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.iah0;
import xsna.jr40;
import xsna.l8g;
import xsna.too0;

/* compiled from: MusicPagePhoneHeaderNewVh.kt */
/* loaded from: classes16.dex */
public final class MusicPagePhoneHeaderNewVh implements CatalogViewHolder, too0 {
    public final ArtistInfoNewVh b;
    public final MusicPageToolbarNewVh c;
    public CollapsingToolbarLayout d;
    public AppBarLayout e;
    public Integer h;
    public boolean f = true;
    public final Handler g = new Handler(Looper.getMainLooper());
    public float i = Float.NaN;
    public final jr40 j = new AppBarLayout.f() { // from class: xsna.jr40
        @Override // com.google.android.material.appbar.AppBarLayout.a
        public final void a(AppBarLayout appBarLayout, int i) {
            MusicPagePhoneHeaderNewVh musicPagePhoneHeaderNewVh = MusicPagePhoneHeaderNewVh.this;
            CollapsingToolbarLayout collapsingToolbarLayout = musicPagePhoneHeaderNewVh.d;
            if (collapsingToolbarLayout == null || appBarLayout.getTotalScrollRange() == 0) {
                return;
            }
            boolean z = appBarLayout.getTotalScrollRange() + i > collapsingToolbarLayout.getScrimVisibleHeightTrigger() - (collapsingToolbarLayout.getHeight() - appBarLayout.getTotalScrollRange());
            if (!dhr0.M() && musicPagePhoneHeaderNewVh.f != z) {
                musicPagePhoneHeaderNewVh.f = z;
                appBarLayout.post(new zz9(3, appBarLayout, musicPagePhoneHeaderNewVh));
            }
            float f = swe0.f((i / appBarLayout.getTotalScrollRange()) + 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            MusicPageToolbarNewVh musicPageToolbarNewVh = musicPagePhoneHeaderNewVh.c;
            int f2 = dhr0.M() ? -1 : l8g.f(f, -1);
            Drawable drawable = musicPageToolbarNewVh.i;
            if (drawable != null) {
                drawable.setTint(f2);
            }
            Drawable drawable2 = musicPageToolbarNewVh.j;
            if (drawable2 != null) {
                drawable2.setTint(f2);
            }
            ArtistInfoNewVh artistInfoNewVh = musicPagePhoneHeaderNewVh.b;
            View view = artistInfoNewVh.k;
            if (view == null) {
                view = null;
            }
            view.setAlpha(f);
            TextView textView = artistInfoNewVh.i;
            if (textView == null) {
                textView = null;
            }
            textView.setAlpha(f);
            View view2 = artistInfoNewVh.j;
            if (view2 == null) {
                view2 = null;
            }
            view2.setAlpha(f);
            RecyclerView recyclerView = artistInfoNewVh.l;
            (recyclerView != null ? recyclerView : null).setAlpha(f);
            float f3 = swe0.f(((1.0f - f) - 0.9f) / 0.100000024f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            if (Float.isNaN(musicPagePhoneHeaderNewVh.i) || Math.abs(musicPagePhoneHeaderNewVh.i - f3) > 0.001f) {
                musicPagePhoneHeaderNewVh.i = f3;
                Integer num = musicPagePhoneHeaderNewVh.h;
                if (num != null) {
                    int intValue = num.intValue();
                    CollapsingToolbarLayout collapsingToolbarLayout2 = musicPagePhoneHeaderNewVh.d;
                    if (collapsingToolbarLayout2 != null) {
                        collapsingToolbarLayout2.setCollapsedTitleTextColor(l8g.f(f3, intValue));
                    }
                }
            }
        }
    };

    /* JADX WARN: Type inference failed for: r1v4, types: [xsna.jr40] */
    public MusicPagePhoneHeaderNewVh(ArtistInfoNewVh artistInfoNewVh, MusicPageToolbarNewVh musicPageToolbarNewVh) {
        this.b = artistInfoNewVh;
        this.c = musicPageToolbarNewVh;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        AppBarLayout appBarLayout = this.e;
        if (appBarLayout != null) {
            appBarLayout.f(this.j);
        }
        this.g.removeCallbacksAndMessages(null);
        this.b.L();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockMusicArtistNew uIBlockMusicArtistNew = uIBlock instanceof UIBlockMusicArtistNew ? (UIBlockMusicArtistNew) uIBlock : null;
        if (uIBlockMusicArtistNew == null) {
            return;
        }
        this.b.N6(uIBlockMusicArtistNew);
        this.c.N6(uIBlockMusicArtistNew);
        CollapsingToolbarLayout collapsingToolbarLayout = this.d;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setExpandedTitleMarginBottom(e3m.a(uIBlockMusicArtistNew.Rb() ? R.dimen.music_artist_header_bottom_margin_genre : R.dimen.music_artist_header_bottom_margin_genre_no, collapsingToolbarLayout.getContext()));
            collapsingToolbarLayout.setTitle(uIBlockMusicArtistNew.getName());
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        this.c.Ng();
        CollapsingToolbarLayout collapsingToolbarLayout = this.d;
        if (collapsingToolbarLayout != null) {
            this.h = Integer.valueOf(e3m.f(R.attr.vk_ui_vkontakte_im_bubble_button_foreground, collapsingToolbarLayout.getContext()));
            float f = this.i;
            Float valueOf = Float.valueOf(f);
            if (Float.isNaN(f)) {
                valueOf = null;
            }
            float floatValue = valueOf != null ? valueOf.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            Integer num = this.h;
            if (num != null) {
                int intValue = num.intValue();
                CollapsingToolbarLayout collapsingToolbarLayout2 = this.d;
                if (collapsingToolbarLayout2 != null) {
                    collapsingToolbarLayout2.setCollapsedTitleTextColor(l8g.f(floatValue, intValue));
                }
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AppBarLayout appBarLayout = (AppBarLayout) layoutInflater.inflate(R.layout.catalog_artist_header_new, viewGroup, false);
        this.e = appBarLayout;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) appBarLayout.findViewById(R.id.collapsing_layout);
        collapsingToolbarLayout.setScrimAnimationDuration(300L);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.catalog_artist_title);
        Context context = appBarLayout.getContext();
        FontFamily fontFamily = FontFamily.BOLD;
        int i = a.C1933a.C1934a.$EnumSwitchMapping$0[TextSizeUnit.SP.ordinal()];
        float f = 28.0f;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = b.b(28.0f);
        }
        Font.Companion.getClass();
        collapsingToolbarLayout.setCollapsedTitleTypeface(Font.a.a(fontFamily, f).k(context));
        collapsingToolbarLayout.setExpandedTitleColor(0);
        collapsingToolbarLayout.setCollapsedTitleTextColor(e3m.f(R.attr.vk_ui_text_primary, appBarLayout.getContext()));
        this.h = Integer.valueOf(e3m.f(R.attr.vk_ui_text_primary, appBarLayout.getContext()));
        Context context2 = layoutInflater.getContext();
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.catalog_artist_new_cover_height);
        HashSet hashSet = iah0.a;
        int min = Math.min(dimensionPixelSize, context2.getResources().getDisplayMetrics().heightPixels);
        collapsingToolbarLayout.getLayoutParams().height = min;
        View k5 = this.b.k5(layoutInflater, collapsingToolbarLayout, bundle);
        k5.getLayoutParams().height = min;
        collapsingToolbarLayout.addView(k5, 0);
        collapsingToolbarLayout.addView(this.c.k5(layoutInflater, collapsingToolbarLayout, bundle), 1);
        this.d = collapsingToolbarLayout;
        appBarLayout.a(this.j);
        return appBarLayout;
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
