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
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.b5a;
import xsna.bwt0;
import xsna.c98;
import xsna.dhr0;
import xsna.e3m;
import xsna.g22;
import xsna.kbj0;
import xsna.m33;
import xsna.mba;
import xsna.too0;

/* compiled from: MusicPageToolbarVh.kt */
/* loaded from: classes16.dex */
public final class MusicPageToolbarVh extends CatalogClickableViewHolder implements too0, View.OnClickListener {
    public final kbj0 e;
    public final boolean f;
    public final boolean g;
    public Drawable h;
    public Drawable i;
    public Drawable j;
    public Drawable k;
    public MenuItem l;
    public Toolbar m;

    public MusicPageToolbarVh(mba mbaVar, b5a b5aVar, kbj0 kbj0Var, boolean z, boolean z2) {
        super(mbaVar, b5aVar);
        this.e = kbj0Var;
        this.f = z;
        this.g = z2;
    }

    @Override // xsna.too0
    public final void Ng() {
        Drawable drawable = this.h;
        int i = R.attr.vk_ui_text_primary;
        if (drawable != null) {
            drawable.setTint(dhr0.t.c(dhr0.L() ? R.attr.vk_ui_icon_accent_themed : R.attr.vk_ui_text_primary));
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            if (dhr0.L()) {
                i = R.attr.vk_ui_icon_accent_themed;
            }
            drawable2.setTint(dhr0.t.c(i));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder
    public final void b(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockMusicPage) {
            MenuItem menuItem = this.l;
            if (menuItem != null) {
                menuItem.setVisible(((UIBlockMusicPage) uIBlock).Qb());
            }
            if (this.f) {
                Toolbar toolbar = this.m;
                Context context = toolbar != null ? toolbar.getContext() : null;
                if (toolbar == null || context == null) {
                    return;
                }
                toolbar.setTitle(((UIBlockMusicPage) uIBlock).getName());
                toolbar.setBackgroundColor(e3m.f(R.attr.vk_ui_header_background, context));
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_artist_toolbar, viewGroup, false);
        this.j = m33.a(R.drawable.vk_icon_arrow_left_outline_28, inflate.getContext());
        this.k = m33.a(R.drawable.vk_icon_more_vertical_24, inflate.getContext());
        abg0 abg0Var = dhr0.t;
        Drawable a = abg0Var.a(R.drawable.vk_icon_arrow_left_outline_28);
        int i = R.attr.vk_ui_text_primary;
        Drawable drawable = null;
        if (a != null) {
            a.setTint(abg0Var.c(dhr0.L() ? R.attr.vk_ui_icon_accent_themed : R.attr.vk_ui_text_primary));
        } else {
            a = null;
        }
        this.h = a;
        Drawable a2 = abg0Var.a(R.drawable.vk_icon_more_vertical_24);
        if (a2 != null) {
            if (dhr0.L()) {
                i = R.attr.vk_ui_icon_accent_themed;
            }
            a2.setTint(abg0Var.c(i));
            drawable = a2;
        }
        this.i = drawable;
        Toolbar toolbar = (Toolbar) inflate;
        this.m = toolbar;
        boolean z = this.f;
        if (!z) {
            toolbar.setNavigationIcon(new LayerDrawable(new Drawable[]{this.h, this.j}));
            toolbar.setNavigationContentDescription(R.string.accessibility_back);
            toolbar.setNavigationOnClickListener(new c98(this, 1));
        }
        toolbar.setOverflowIcon(z ? this.i : new LayerDrawable(new Drawable[]{this.i, this.k}));
        MenuItem add = toolbar.getMenu().add(R.string.share);
        add.setShowAsAction(0);
        bwt0.l0(toolbar, new g22(20, this, toolbar));
        add.setVisible(false);
        this.l = add;
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
