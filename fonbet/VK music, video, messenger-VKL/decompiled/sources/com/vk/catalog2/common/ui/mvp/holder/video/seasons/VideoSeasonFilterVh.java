package com.vk.catalog2.common.ui.mvp.holder.video.seasons;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.apps.BuildInfo;
import com.vk.core.apps.a;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.tabs.Tab$Mode;
import com.vk.core.view.components.tabs.d;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import xsna.bwt0;
import xsna.nxv0;
import xsna.tbs0;
import xsna.wtm0;

/* compiled from: VideoSeasonFilterVh.kt */
/* loaded from: classes16.dex */
public final class VideoSeasonFilterVh implements CatalogViewHolder {
    public final wtm0 b;
    public nxv0 c;

    public VideoSeasonFilterVh(wtm0 wtm0Var) {
        this.b = wtm0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.c = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        nxv0 nxv0Var;
        if ((uIBlock instanceof UIBlockActionFilter) && (nxv0Var = this.c) != null) {
            CatalogFilterData catalogFilterData = ((UIBlockActionFilter) uIBlock).z;
            boolean z = catalogFilterData.e;
            nxv0Var.setText(catalogFilterData.c);
            BuildInfo.Client client = BuildInfo.a;
            VKApplication vKApplication = a.a;
            nxv0Var.setBackground(z ? nxv0Var.getContext().getDrawable(R.drawable.ds_internal_tabs_secondary_indicator) : null);
            nxv0Var.setTextTint(z ? R.attr.vk_ui_text_primary : R.attr.vk_ui_text_secondary);
            bwt0.i0(nxv0Var, new tbs0(2, this, uIBlock));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = d.G;
        nxv0 a = d.a.a(layoutInflater.getContext());
        a.setMode(Tab$Mode.Secondary);
        this.c = a;
        a.setId(R.id.video_catalog_season_button);
        return a;
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
