package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.Context;
import android.content.res.Configuration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipGlobalSearchFeatureRootVh;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import xsna.j5g;
import xsna.swe0;

/* compiled from: ClipsFloorsVh.kt */
/* loaded from: classes16.dex */
public final class ClipsFloorsVh extends HorizontalListVh {

    /* compiled from: ClipsFloorsVh.kt */
    public static final class a extends GridLayoutManager.c {
        public final /* synthetic */ int e;
        public final /* synthetic */ ClipGlobalSearchFeatureRootVh.a f;

        public a(int i, ClipGlobalSearchFeatureRootVh.a aVar) {
            this.e = i;
            this.f = aVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            UIBlock uIBlock = (UIBlock) j5g.b0(i, ClipsFloorsVh.this.h.d);
            int i2 = this.e;
            return uIBlock == null ? i2 : swe0.g(this.f.q(uIBlock), 1, i2);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh, com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RecyclerPaginatedView recyclerPaginatedView = this.n;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        RecyclerView.o layoutManager = recyclerPaginatedView.getRecyclerView().getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        RecyclerPaginatedView recyclerPaginatedView2 = this.n;
        if (recyclerPaginatedView2 == null) {
            recyclerPaginatedView2 = null;
        }
        Context context = recyclerPaginatedView2.getContext();
        VideoItemListSettings videoItemListSettings = VideoItemListSettings.i;
        if (gridLayoutManager.s != VideoItemListSettings.a.a(context)) {
            RecyclerPaginatedView recyclerPaginatedView3 = this.n;
            q(recyclerPaginatedView3 != null ? recyclerPaginatedView3 : null);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh
    public final void q(AbstractPaginatedView abstractPaginatedView) {
        ClipGlobalSearchFeatureRootVh.a aVar = new ClipGlobalSearchFeatureRootVh.a(abstractPaginatedView.getContext());
        int spanCount = aVar.getSpanCount();
        if (spanCount < 2) {
            super.q(abstractPaginatedView);
            return;
        }
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, abstractPaginatedView);
        dVar.f = 1;
        dVar.c(spanCount);
        dVar.e = new a(spanCount, aVar);
        dVar.a();
        RecyclerPaginatedView recyclerPaginatedView = this.n;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        recyclerPaginatedView.setCanScroll(false);
    }
}
