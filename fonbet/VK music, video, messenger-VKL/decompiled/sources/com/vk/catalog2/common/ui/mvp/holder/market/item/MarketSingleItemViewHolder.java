package com.vk.catalog2.common.ui.mvp.holder.market.item;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItemStyle;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Good;
import com.vk.ecomm.design.view.tile.MarketProductTileView;
import com.vkontakte.android.R;
import xsna.bp7;
import xsna.e3m;
import xsna.e530;
import xsna.fh9;
import xsna.gw00;
import xsna.q530;
import xsna.u4a;

/* compiled from: MarketSingleItemViewHolder.kt */
/* loaded from: classes16.dex */
public final class MarketSingleItemViewHolder implements CatalogViewHolder {
    public final u4a b;
    public final boolean c;
    public MarketProductTileView d;
    public gw00 e;

    public MarketSingleItemViewHolder(u4a u4aVar, boolean z) {
        this.b = u4aVar;
        this.c = z;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        throw new UnsupportedOperationException();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        boolean z = this.c;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(z ? e3m.a(R.dimen.market_catalog_slider_market_item_width, layoutInflater.getContext()) : -1, -2));
        MarketProductTileView marketProductTileView = new MarketProductTileView(layoutInflater.getContext(), null);
        this.d = marketProductTileView;
        frameLayout.addView(marketProductTileView);
        this.e = new gw00(frameLayout, marketProductTileView, this.b, !z);
        return frameLayout;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockMarketItem) {
            MarketProductTileView marketProductTileView = this.d;
            if (marketProductTileView == null) {
                marketProductTileView = null;
            }
            marketProductTileView.setVisibility(0);
            UIBlockMarketItem uIBlockMarketItem = (UIBlockMarketItem) uIBlock;
            Good good = uIBlockMarketItem.y;
            UIBlockMarketItemStyle uIBlockMarketItemStyle = uIBlockMarketItem.A;
            Integer valueOf = Integer.valueOf(uIBlock.u - 1);
            fh9 fh9Var = new fh9(uIBlock, good, uIBlockMarketItemStyle, valueOf);
            gw00 gw00Var = this.e;
            if (gw00Var == null) {
                gw00Var = null;
            }
            gw00Var.getClass();
            gw00Var.g = uIBlock;
            gw00Var.h = good;
            gw00Var.i = uIBlockMarketItemStyle;
            gw00Var.j = valueOf;
            q530 q530Var = gw00Var.d.b.G;
            if (q530Var != null) {
                q530Var.c(e530.b(good, null), gw00Var, new bp7(19, gw00Var, fh9Var));
            } else {
                gw00Var.o1(null);
            }
        }
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
