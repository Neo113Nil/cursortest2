package com.vk.catalog2.common.ui.mvp.holder.container;

import androidx.recyclerview.widget.GridLayoutManager;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vkontakte.android.R;
import xsna.j5g;
import xsna.sok0;
import xsna.swe0;
import xsna.tba;
import xsna.u4a;
import xsna.wia;

/* compiled from: VerticalStackedListVh.kt */
/* loaded from: classes16.dex */
public class VerticalStackedListVh extends VerticalListVh {
    public final sok0 G;

    /* compiled from: VerticalStackedListVh.kt */
    public static final class a extends GridLayoutManager.c {
        public final /* synthetic */ int e;

        public a(int i) {
            this.e = i;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            VerticalStackedListVh verticalStackedListVh = VerticalStackedListVh.this;
            UIBlock uIBlock = (UIBlock) j5g.b0(i, verticalStackedListVh.h.d);
            int i2 = this.e;
            return uIBlock == null ? i2 : swe0.g(verticalStackedListVh.G.q(uIBlock), 1, i2);
        }
    }

    public VerticalStackedListVh(CatalogConfiguration catalogConfiguration, c.h hVar, tba tbaVar, u4a u4aVar, wia wiaVar, int i, VerticalListVh.a aVar, sok0 sok0Var, int i2) {
        super(catalogConfiguration, hVar, tbaVar, u4aVar, (i2 & 16) != 0 ? null : wiaVar, true, false, (i2 & 128) != 0 ? R.layout.catalog_list_vertical : i, catalogConfiguration.A(CatalogConfiguration$Companion$ContainerType.VERTICAL, u4aVar), (i2 & 512) != 0 ? new VerticalListVh.a(null, null, null, 63) : aVar);
        this.G = sok0Var;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh
    public final void p(UIBlockList uIBlockList) {
        if (this.G.S(uIBlockList)) {
            RecyclerPaginatedView recyclerPaginatedView = this.n;
            if (recyclerPaginatedView == null) {
                recyclerPaginatedView = null;
            }
            q(recyclerPaginatedView);
        }
        super.p(uIBlockList);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh
    public final void q(AbstractPaginatedView abstractPaginatedView) {
        int spanCount = this.G.getSpanCount();
        if (spanCount < 2) {
            super.q(abstractPaginatedView);
            return;
        }
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, abstractPaginatedView);
        dVar.f = 1;
        dVar.c(spanCount);
        dVar.e = new a(spanCount);
        dVar.a();
    }
}
