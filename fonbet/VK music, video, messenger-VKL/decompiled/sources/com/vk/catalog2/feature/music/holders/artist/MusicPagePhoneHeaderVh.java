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
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage;
import com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPagePhoneHeaderVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPageToolbarVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vk.typography.b;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.iah0;
import xsna.too0;

/* compiled from: MusicPagePhoneHeaderVh.kt */
/* loaded from: classes16.dex */
public final class MusicPagePhoneHeaderVh implements CatalogViewHolder, too0 {
    public final MusicPageInfoBlockVh b;
    public final MusicPageToolbarVh c;
    public CollapsingToolbarLayout d;
    public AppBarLayout e;
    public boolean f = true;
    public final Handler g = new Handler(Looper.getMainLooper());

    public MusicPagePhoneHeaderVh(MusicPageInfoBlockVh musicPageInfoBlockVh, MusicPageToolbarVh musicPageToolbarVh) {
        this.b = musicPageInfoBlockVh;
        this.c = musicPageToolbarVh;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.c.getClass();
        this.b.L();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockMusicPage) {
            UIBlockMusicPage uIBlockMusicPage = (UIBlockMusicPage) uIBlock;
            this.b.N6(uIBlock);
            this.c.N6(uIBlock);
            CollapsingToolbarLayout collapsingToolbarLayout = this.d;
            if (collapsingToolbarLayout != null) {
                collapsingToolbarLayout.setExpandedTitleMarginBottom(e3m.a(uIBlockMusicPage.Rb() ? R.dimen.music_artist_header_bottom_margin_genre : R.dimen.music_artist_header_bottom_margin_genre_no, collapsingToolbarLayout.getContext()));
                collapsingToolbarLayout.setTitle(uIBlockMusicPage.getName());
            }
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        this.c.Ng();
        CollapsingToolbarLayout collapsingToolbarLayout = this.d;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setCollapsedTitleTextColor(e3m.f(R.attr.vk_ui_vkontakte_im_bubble_button_foreground, collapsingToolbarLayout.getContext()));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final AppBarLayout appBarLayout = (AppBarLayout) layoutInflater.inflate(R.layout.catalog_artist_header, viewGroup, false);
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
        collapsingToolbarLayout.setCollapsedTitleTextColor(e3m.f(R.attr.vk_ui_text_primary, appBarLayout.getContext()));
        int rint = (int) (Math.rint((iah0.w(layoutInflater.getContext()) * 3) / 16.0d) * 4);
        collapsingToolbarLayout.getLayoutParams().height = rint;
        View k5 = this.b.k5(layoutInflater, collapsingToolbarLayout, bundle);
        k5.getLayoutParams().height = rint;
        collapsingToolbarLayout.addView(k5, 0);
        collapsingToolbarLayout.addView(this.c.k5(layoutInflater, collapsingToolbarLayout, bundle), 1);
        this.d = collapsingToolbarLayout;
        appBarLayout.a(new AppBarLayout.f() { // from class: xsna.kr40
            @Override // com.google.android.material.appbar.AppBarLayout.a
            public final void a(AppBarLayout appBarLayout2, int i2) {
                MusicPagePhoneHeaderVh musicPagePhoneHeaderVh = MusicPagePhoneHeaderVh.this;
                CollapsingToolbarLayout collapsingToolbarLayout2 = musicPagePhoneHeaderVh.d;
                if (collapsingToolbarLayout2 == null || appBarLayout2.getTotalScrollRange() == 0) {
                    return;
                }
                boolean z = appBarLayout2.getTotalScrollRange() + i2 > collapsingToolbarLayout2.getScrimVisibleHeightTrigger() - (collapsingToolbarLayout2.getHeight() - appBarLayout2.getTotalScrollRange());
                if (!dhr0.M() && musicPagePhoneHeaderVh.f != z) {
                    musicPagePhoneHeaderVh.f = z;
                    AppBarLayout appBarLayout3 = appBarLayout;
                    appBarLayout3.post(new od6(2, appBarLayout3, musicPagePhoneHeaderVh));
                }
                float totalScrollRange = (i2 / appBarLayout2.getTotalScrollRange()) + 1;
                MusicPageToolbarVh musicPageToolbarVh = musicPagePhoneHeaderVh.c;
                int f2 = l8g.f(totalScrollRange, -1);
                Drawable drawable = musicPageToolbarVh.j;
                if (drawable != null) {
                    drawable.setTint(f2);
                }
                Drawable drawable2 = musicPageToolbarVh.k;
                if (drawable2 != null) {
                    drawable2.setTint(f2);
                }
                MusicPageInfoBlockVh musicPageInfoBlockVh = musicPagePhoneHeaderVh.b;
                View view = musicPageInfoBlockVh.i;
                if (view == null) {
                    view = null;
                }
                view.setAlpha(totalScrollRange);
                TextView textView = musicPageInfoBlockVh.g;
                if (textView == null) {
                    textView = null;
                }
                textView.setAlpha(totalScrollRange);
                View view2 = musicPageInfoBlockVh.h;
                (view2 != null ? view2 : null).setAlpha(totalScrollRange);
            }
        });
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
