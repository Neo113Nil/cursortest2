package com.vk.catalog2.feature.music.holders.artist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtistNew;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.bwt0;
import xsna.c98;
import xsna.dhr0;
import xsna.e3m;
import xsna.kbj0;
import xsna.m33;
import xsna.mba;
import xsna.too0;
import xsna.wd3;

/* compiled from: MusicPageToolbarNewVh.kt */
/* loaded from: classes16.dex */
public final class MusicPageToolbarNewVh extends CatalogClickableViewHolder implements too0, View.OnClickListener {
    public final kbj0 e;
    public final boolean f;
    public Drawable g;
    public Drawable h;
    public Drawable i;
    public Drawable j;
    public MenuItem k;
    public Toolbar l;

    public MusicPageToolbarNewVh(mba mbaVar, b5a b5aVar, kbj0 kbj0Var, boolean z) {
        super(mbaVar, b5aVar);
        this.e = kbj0Var;
        this.f = z;
    }

    @Override // xsna.too0
    public final void Ng() {
        Drawable drawable = this.g;
        int i = R.attr.vk_ui_text_primary;
        if (drawable != null) {
            drawable.setTint(dhr0.t.c(dhr0.L() ? R.attr.vk_ui_icon_accent_themed : R.attr.vk_ui_text_primary));
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            if (dhr0.L()) {
                i = R.attr.vk_ui_icon_accent_themed;
            }
            drawable2.setTint(dhr0.t.c(i));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder
    public final void b(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockMusicArtistNew) {
            MenuItem menuItem = this.k;
            if (menuItem != null) {
                menuItem.setVisible(true);
            }
            if (this.f) {
                Toolbar toolbar = this.l;
                Context context = toolbar != null ? toolbar.getContext() : null;
                if (toolbar == null || context == null) {
                    return;
                }
                toolbar.setTitle(((UIBlockMusicArtistNew) uIBlock).getName());
                toolbar.setBackgroundColor(e3m.f(R.attr.vk_ui_header_background, context));
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_artist_toolbar_new, viewGroup, false);
        this.i = m33.a(R.drawable.vk_icon_arrow_left_outline_28, inflate.getContext());
        this.j = m33.a(R.drawable.ic_toolbar_more_36, inflate.getContext());
        this.g = dhr0.t.a(R.drawable.ic_toolbar_back_36);
        this.h = this.j;
        Toolbar toolbar = (Toolbar) inflate;
        this.l = toolbar;
        if (!this.f) {
            toolbar.setNavigationIcon(new LayerDrawable(new Drawable[]{this.g, this.i}));
            toolbar.setNavigationContentDescription(R.string.accessibility_back);
            toolbar.setNavigationOnClickListener(new c98(this, 1));
        }
        toolbar.setOverflowIcon(this.h);
        MenuItem add = toolbar.getMenu().add(R.string.share);
        add.setShowAsAction(0);
        bwt0.l0(toolbar, new wd3(17, this, toolbar));
        add.setVisible(false);
        this.k = add;
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
