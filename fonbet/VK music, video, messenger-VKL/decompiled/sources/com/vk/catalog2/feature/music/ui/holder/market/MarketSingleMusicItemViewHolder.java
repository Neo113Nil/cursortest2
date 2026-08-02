package com.vk.catalog2.feature.music.ui.holder.market;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItemStyle;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Good;
import com.vk.ecomm.design.view.tile.MarketProductTileView;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.e530;
import xsna.epx;
import xsna.fh9;
import xsna.fy00;
import xsna.i910;
import xsna.lt00;
import xsna.q530;
import xsna.smq;
import xsna.sz00;
import xsna.u4a;
import xsna.wqb;

/* compiled from: MarketSingleMusicItemViewHolder.kt */
/* loaded from: classes16.dex */
public final class MarketSingleMusicItemViewHolder implements CatalogViewHolder {
    public final u4a b;
    public final boolean c;
    public final MarketMusicItemSource d;
    public final lt00 e;
    public final fy00 f;
    public final sz00 g;
    public final smq h;
    public MarketProductTileView i;
    public i910 j;
    public Good k;

    public MarketSingleMusicItemViewHolder(u4a u4aVar, boolean z, MarketMusicItemSource marketMusicItemSource, lt00 lt00Var, fy00 fy00Var, sz00 sz00Var, smq smqVar) {
        this.b = u4aVar;
        this.c = z;
        this.d = marketMusicItemSource;
        this.e = lt00Var;
        this.f = fy00Var;
        this.g = sz00Var;
        this.h = smqVar;
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
        this.i = marketProductTileView;
        frameLayout.addView(marketProductTileView);
        this.j = new i910(frameLayout, marketProductTileView, this.b, this.d.h(), this.f, this.g, this.e, this.h, !z);
        return frameLayout;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockMarketItem) {
            MarketProductTileView marketProductTileView = this.i;
            if (marketProductTileView == null) {
                marketProductTileView = null;
            }
            marketProductTileView.setVisibility(0);
            Good good = this.k;
            boolean z = good == null || !epx.f(good, ((UIBlockMarketItem) uIBlock).y);
            Good good2 = ((UIBlockMarketItem) uIBlock).y;
            this.k = good2;
            if (good2 == null) {
                good2 = null;
            }
            UIBlockMarketItemStyle uIBlockMarketItemStyle = UIBlockMarketItemStyle.MARKET_ITEM_ARTIST;
            Integer valueOf = Integer.valueOf(uIBlock.u - 1);
            fh9 fh9Var = new fh9(uIBlock, good2, uIBlockMarketItemStyle, valueOf);
            i910 i910Var = this.j;
            if (i910Var == null) {
                i910Var = null;
            }
            i910Var.getClass();
            i910Var.h = uIBlock;
            i910Var.i = good2;
            i910Var.j = uIBlockMarketItemStyle;
            i910Var.k = valueOf;
            q530 q530Var = i910Var.d.b.G;
            if (q530Var != null) {
                q530Var.c(e530.b(good2, null), i910Var, new wqb(13, i910Var, fh9Var));
            } else {
                i910Var.o1(null);
            }
            if (z) {
                Good good3 = this.k;
                if (good3 == null) {
                    good3 = null;
                }
                Long valueOf2 = Long.valueOf(good3.b);
                Good good4 = this.k;
                lt00.h(this.e, valueOf2, Long.valueOf((good4 != null ? good4 : null).c.b), Integer.valueOf(uIBlock.u - 1), this.d.h(), null, null, null, null, PsExtractor.VIDEO_STREAM_MASK);
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
