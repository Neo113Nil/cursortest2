package com.vk.catalog2.common.ui.mvp.holder.container;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.core.design.tools.view.BannersFrameLayout;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.bwt0;
import xsna.cfp0;
import xsna.dhr0;
import xsna.iah0;

/* compiled from: CatalogGroupBannerVh.kt */
/* loaded from: classes16.dex */
public final class CatalogGroupBannerVh implements CatalogViewHolder, View.OnClickListener {
    public final b5a b;
    public final com.vk.catalog2.common.ui.mvp.util.a c;
    public final boolean d;
    public TextView e;
    public TextView f;
    public VKImageView g;
    public BannersFrameLayout h;
    public UIBlockPlaceholder i;
    public UIBlockAction j;

    public CatalogGroupBannerVh(b5a b5aVar, com.vk.catalog2.common.ui.mvp.util.a aVar, boolean z) {
        this.b = b5aVar;
        this.c = aVar;
        this.d = z;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        int i;
        ImageSize Cb;
        UIBlockPlaceholder uIBlockPlaceholder = uIBlock instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) uIBlock : null;
        if (uIBlockPlaceholder == null) {
            return;
        }
        this.i = uIBlockPlaceholder;
        UIBlockPlaceholder uIBlockPlaceholder2 = (UIBlockPlaceholder) uIBlock;
        UIBlockAction uIBlockAction = uIBlockPlaceholder2.F;
        this.c.getClass();
        if (com.vk.catalog2.common.ui.mvp.util.a.d(uIBlockAction)) {
            this.j = uIBlockAction;
        }
        VKImageView vKImageView = this.g;
        if (vKImageView == null) {
            vKImageView = null;
        }
        if (vKImageView.getLayoutParams().width > 0) {
            VKImageView vKImageView2 = this.g;
            if (vKImageView2 == null) {
                vKImageView2 = null;
            }
            i = vKImageView2.getLayoutParams().width;
        } else {
            BannersFrameLayout bannersFrameLayout = this.h;
            if (bannersFrameLayout == null) {
                bannersFrameLayout = null;
            }
            if (bannersFrameLayout.getLayoutParams().width > 0) {
                BannersFrameLayout bannersFrameLayout2 = this.h;
                if (bannersFrameLayout2 == null) {
                    bannersFrameLayout2 = null;
                }
                i = bannersFrameLayout2.getLayoutParams().width;
            } else {
                i = iah0.f().widthPixels;
            }
        }
        VKImageView vKImageView3 = this.g;
        if (vKImageView3 == null) {
            vKImageView3 = null;
        }
        Image image = uIBlockPlaceholder2.B;
        vKImageView3.s0((image == null || (Cb = image.Cb(i, true, false)) == null) ? null : Cb.d.d);
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        textView.setText(uIBlockPlaceholder2.A);
        TextView textView2 = this.f;
        (textView2 != null ? textView2 : null).setText(uIBlockPlaceholder2.E);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        BannersFrameLayout bannersFrameLayout = (BannersFrameLayout) layoutInflater.inflate(R.layout.catalog_banner_container_group_banner, viewGroup, false);
        boolean z = this.d;
        bannersFrameLayout.setWidthPadding(iah0.a(z ? 44 : 20));
        bannersFrameLayout.setMaxWidthValue(z ? -1 : iah0.a(400));
        this.h = bannersFrameLayout;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.catalog_banner_content_group_banner, bannersFrameLayout);
        this.e = (TextView) viewGroup2.findViewById(R.id.catalog_banner_title);
        this.f = (TextView) viewGroup2.findViewById(R.id.catalog_banner_subtext);
        VKImageView vKImageView = (VKImageView) viewGroup2.findViewById(R.id.catalog_banner_background_image);
        this.g = vKImageView;
        vKImageView.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder));
        bwt0.h0(this, viewGroup2);
        return bannersFrameLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockPlaceholder uIBlockPlaceholder = this.i;
        UIBlockAction uIBlockAction = this.j;
        if (uIBlockPlaceholder == null || uIBlockAction == null) {
            return;
        }
        this.b.a(new cfp0(uIBlockPlaceholder, null));
        com.vk.catalog2.common.ui.mvp.util.a.e(this.c, view.getContext(), uIBlockPlaceholder, uIBlockAction, null, 56);
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
