package com.vk.ecomm.catalog.impl.catalog.common.ui.holder.infoblock;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.market.MarketInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import xsna.bzw;
import xsna.d010;
import xsna.e010;
import xsna.m3a;

/* compiled from: MarketInfoComposeVh.kt */
/* loaded from: classes18.dex */
public final class MarketInfoComposeVh implements CatalogViewHolder {
    public final m3a b;
    public d010 c;

    public MarketInfoComposeVh(m3a m3aVar) {
        this.b = m3aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockMarketInfo) {
            MarketInfo marketInfo = ((UIBlockMarketInfo) uIBlock).y;
            if (marketInfo.d != MarketInfo.MarketInfoSubtype.OZON_ONBOARDING) {
                return;
            }
            d010 d010Var = this.c;
            if (d010Var == null) {
                d010Var = null;
            }
            d010Var.setState(new e010(marketInfo.b, marketInfo.h));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        d010 d010Var = new d010(layoutInflater.getContext());
        d010Var.setOnClickListener(new bzw(this, 5));
        this.c = d010Var;
        return d010Var;
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
