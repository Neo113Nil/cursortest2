package com.vk.catalog2.common.ui.mvp.holder.container;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.lists.c;
import com.vkontakte.android.R;
import xsna.cn70;
import xsna.tba;
import xsna.u4a;

/* compiled from: ClipTrendsVerticalListVh.kt */
/* loaded from: classes16.dex */
public final class ClipTrendsVerticalListVh extends VerticalListVh {
    public ClipTrendsVerticalListVh(com.vk.catalog2.common.ui.mvp.configuration.a aVar, c.h hVar, tba tbaVar, u4a u4aVar) {
        super(aVar, hVar, tbaVar, u4aVar, null, true, 0, null, 912);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        CatalogRecyclerPaginatedView catalogRecyclerPaginatedView = (CatalogRecyclerPaginatedView) k5.findViewById(R.id.paginated_list);
        if (catalogRecyclerPaginatedView != null) {
            catalogRecyclerPaginatedView.setBottomInsetForScrollableContent(cn70.b(84));
        }
        return k5;
    }
}
