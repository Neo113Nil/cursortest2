package com.vk.catalog2.common.ui.mvp.recycler;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.core.sticky_header.StickyHeadersLinearLayoutManager;
import com.vk.lists.AbstractPaginatedView;
import xsna.qel0;
import xsna.sv1;

/* compiled from: CatalogStickyRecyclerPaginatedView.kt */
/* loaded from: classes16.dex */
public final class CatalogStickyRecyclerPaginatedView extends CatalogRecyclerPaginatedView {

    /* compiled from: CatalogStickyRecyclerPaginatedView.kt */
    public final class a extends StickyHeadersLinearLayoutManager<qel0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(null, CatalogStickyRecyclerPaginatedView.this, new sv1(21));
            CatalogStickyRecyclerPaginatedView.this.getContext();
        }

        @Override // com.vk.core.sticky_header.StickyHeadersLinearLayoutManager
        public final void W() {
            int i = this.z;
            int i2 = this.A;
            this.z = -1;
            this.A = Integer.MIN_VALUE;
            if (i == -1) {
                return;
            }
            if (i == 0 && i2 == Integer.MIN_VALUE) {
                return;
            }
            View view = this.x;
            if (view == null || T(i) != S(this.y)) {
                K(i, i2);
                return;
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            K(i, view.getHeight() + i2);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean canScrollHorizontally() {
            return this.b == 0 && CatalogStickyRecyclerPaginatedView.this.A;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean canScrollVertically() {
            return this.b == 1 && CatalogStickyRecyclerPaginatedView.this.A;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean supportsPredictiveItemAnimations() {
            return false;
        }
    }

    public CatalogStickyRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public void setLayoutManagerFromBuilder(AbstractPaginatedView.d dVar) {
        if (dVar.a != AbstractPaginatedView.LayoutType.LINEAR) {
            super.setLayoutManagerFromBuilder(dVar);
            return;
        }
        RecyclerView recyclerView = this.x;
        a aVar = new a();
        aVar.setOrientation(dVar.f);
        aVar.setReverseLayout(false);
        recyclerView.setLayoutManager(aVar);
    }
}
