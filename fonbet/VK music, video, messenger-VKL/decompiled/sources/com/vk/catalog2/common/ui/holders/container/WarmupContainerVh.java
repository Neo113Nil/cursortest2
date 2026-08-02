package com.vk.catalog2.common.ui.holders.container;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import xsna.bnn0;

/* compiled from: WarmupContainerVh.kt */
/* loaded from: classes16.dex */
public final class WarmupContainerVh implements CatalogStatesViewHolder {
    public final SwitchCatalogVh b;
    public View c;

    public WarmupContainerVh(SwitchCatalogVh switchCatalogVh) {
        this.b = switchCatalogVh;
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.b.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder, xsna.gha
    public final void A2(String str) {
        this.b.A2(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.b.L();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.b.N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.b.r;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        this.b.i8(bnn0Var);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this.b.k5(layoutInflater, viewGroup, bundle));
        this.c = null;
        return frameLayout;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.b.onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        this.b.N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
