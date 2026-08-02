package com.vk.catalog2.common.ui.mvp.holder.friends;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import xsna.fha;

/* compiled from: FriendsViewPagerVh.kt */
/* loaded from: classes16.dex */
public final class FriendsViewPagerVh extends ViewPagerVh {
    public fha A;
    public int z;

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        super.L();
        this.A.b();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh
    public final void d(View view) {
        CatalogRecyclerPaginatedView catalogRecyclerPaginatedView = view instanceof CatalogRecyclerPaginatedView ? (CatalogRecyclerPaginatedView) view : null;
        if (catalogRecyclerPaginatedView != null) {
            catalogRecyclerPaginatedView.setBottomInsetForScrollableContent(this.z);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.A.a();
        return super.k5(layoutInflater, viewGroup, bundle);
    }
}
