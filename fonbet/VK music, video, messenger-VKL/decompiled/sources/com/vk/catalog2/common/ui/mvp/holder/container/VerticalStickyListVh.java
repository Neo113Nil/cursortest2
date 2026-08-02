package com.vk.catalog2.common.ui.mvp.holder.container;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh;
import com.vk.lists.RecyclerPaginatedView;
import xsna.lca;
import xsna.p1a;
import xsna.qel0;

/* compiled from: VerticalStickyListVh.kt */
/* loaded from: classes16.dex */
public final class VerticalStickyListVh extends VerticalListVh {
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh
    public final lca j() {
        VerticalStickyListVh verticalStickyListVh;
        p1a p1aVar;
        if (this.f) {
            p1aVar = new p1a(this, CatalogBasePaginatedListVh.class, "scrollToTopStrategy", "getScrollToTopStrategy()Lcom/vk/catalog2/common/ui/holders/api/CatalogScrollToTopStrategy;", 0);
            verticalStickyListVh = this;
        } else {
            verticalStickyListVh = this;
            p1aVar = null;
        }
        return new qel0(verticalStickyListVh.b, verticalStickyListVh.c, verticalStickyListVh.h, verticalStickyListVh.e, p1aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, xsna.rda
    public final void t() {
        RecyclerView recyclerView;
        RecyclerPaginatedView l = l();
        if (l == null || (recyclerView = l.getRecyclerView()) == null) {
            return;
        }
        recyclerView.smoothScrollToPosition(0);
    }
}
