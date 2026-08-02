package com.vk.catalog2.common.ui.holders.classifieds;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.market.CatalogNavigationTab;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockNavigationTab;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.categories.api.a;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.ahc;
import xsna.bwt0;
import xsna.h3a;
import xsna.i3a;
import xsna.maz;
import xsna.w8i;

/* compiled from: CatalogCategoryTabVh.kt */
/* loaded from: classes16.dex */
public final class CatalogCategoryTabVh implements CatalogViewHolder, w8i {
    public final maz b;
    public final a c;
    public final MarketAnalyticsParams d;
    public final i3a e;
    public ViewGroup f;
    public VKImageView g;
    public TextView h;
    public ahc i;

    public /* synthetic */ CatalogCategoryTabVh(maz mazVar, a aVar) {
        this(mazVar, aVar, null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockNavigationTab uIBlockNavigationTab = uIBlock instanceof UIBlockNavigationTab ? (UIBlockNavigationTab) uIBlock : null;
        if (uIBlockNavigationTab == null) {
            return;
        }
        CatalogNavigationTab catalogNavigationTab = uIBlockNavigationTab.y;
        VKImageView vKImageView = this.g;
        if (vKImageView == null) {
            vKImageView = null;
        }
        bwt0.L(vKImageView, catalogNavigationTab.g);
        TextView textView = this.h;
        if (textView == null) {
            textView = null;
        }
        textView.setText(catalogNavigationTab.c);
        ViewGroup viewGroup = this.f;
        (viewGroup != null ? viewGroup : null).setOnClickListener(new h3a(0, uIBlockNavigationTab, this));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.catalog_category_tab_vh, viewGroup, false);
        this.f = viewGroup2;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        this.g = (VKImageView) viewGroup2.findViewById(R.id.category_image);
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        this.h = (TextView) viewGroup3.findViewById(R.id.category_title);
        ViewGroup viewGroup4 = this.f;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        this.i = new ahc(viewGroup4.getContext(), this.c, this.d);
        ViewGroup viewGroup5 = this.f;
        if (viewGroup5 == null) {
            return null;
        }
        return viewGroup5;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    public CatalogCategoryTabVh(maz mazVar, a aVar, MarketAnalyticsParams marketAnalyticsParams) {
        this.b = mazVar;
        this.c = aVar;
        this.d = marketAnalyticsParams;
        this.e = new i3a();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
