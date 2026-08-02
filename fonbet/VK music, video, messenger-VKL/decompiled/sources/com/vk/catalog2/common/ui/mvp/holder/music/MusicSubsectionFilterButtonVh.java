package com.vk.catalog2.common.ui.mvp.holder.music;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import xsna.eda;
import xsna.gd1;
import xsna.jai;
import xsna.m33;
import xsna.mut0;

/* compiled from: MusicSubsectionFilterButtonVh.kt */
/* loaded from: classes16.dex */
public final class MusicSubsectionFilterButtonVh implements CatalogViewHolder {
    public final eda b;
    public View c;
    public ComposeView d;

    public MusicSubsectionFilterButtonVh(eda edaVar) {
        this.b = edaVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockActionFilter) {
            CatalogFilterData catalogFilterData = ((UIBlockActionFilter) uIBlock).z;
            View view = this.c;
            if (view == null) {
                view = null;
            }
            view.setSelected(catalogFilterData.e);
            View view2 = this.c;
            View view3 = view2 == null ? null : view2;
            if (view2 == null) {
                view2 = null;
            }
            view3.setBackground(m33.a(R.drawable.catalog_bg_filter_button, view2.getContext()));
            ComposeView composeView = this.d;
            (composeView != null ? composeView : null).setContent(new jai(-1465720864, new gd1(3, catalogFilterData, this), true));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_subsection_filter_button_item, viewGroup, false);
        this.c = inflate;
        ComposeView composeView = (ComposeView) inflate.findViewById(R.id.filter_button_compose);
        this.d = composeView;
        composeView.setViewCompositionStrategy(mut0.c.a);
        return inflate;
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
