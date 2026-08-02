package com.vk.catalog2.common.ui.mvp.holder.container;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionGoToAuthor;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import java.util.ArrayList;
import xsna.u4a;

/* compiled from: PaginatedGridListVh.kt */
/* loaded from: classes16.dex */
public final class b {
    public final /* synthetic */ PaginatedGridListVh a;
    public final /* synthetic */ CatalogConfiguration b;
    public final /* synthetic */ u4a c;

    public b(PaginatedGridListVh paginatedGridListVh, CatalogConfiguration catalogConfiguration, u4a u4aVar) {
        this.a = paginatedGridListVh;
        this.b = catalogConfiguration;
        this.c = u4aVar;
    }

    public final void a(CatalogViewHolder catalogViewHolder, int i) {
        if (b(i)) {
            catalogViewHolder.N6((UIBlock) ((ArrayList) this.a.i.y0()).get(i));
        }
    }

    public final boolean b(int i) {
        return i > 0 && i < ((ArrayList) this.a.i.y0()).size();
    }

    public final boolean c(int i) {
        if (b(i)) {
            return ((UIBlock) ((ArrayList) this.a.i.y0()).get(i)) instanceof UIBlockActionGoToAuthor;
        }
        return false;
    }
}
