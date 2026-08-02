package com.vk.catalog2.feature.music.ui.holder;

import androidx.recyclerview.widget.m;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.header.TopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder;
import java.util.List;
import xsna.bpn0;
import xsna.cfp0;
import xsna.cvs;
import xsna.u4a;
import xsna.w950;
import xsna.zd40;

/* compiled from: MusicShowAllListVh.kt */
/* loaded from: classes16.dex */
public final class MusicShowAllListVh extends ShowAllListVh {
    public final CatalogSearchQueryViewHolder A;
    public final boolean B;
    public final bpn0 C;
    public final String v;
    public final u4a w;
    public final TopBarVh x;
    public final w950 y;
    public final boolean z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MusicShowAllListVh(String str, u4a u4aVar, TopBarVh topBarVh, CatalogPaginatedListViewHolder catalogPaginatedListViewHolder, w950 w950Var, CatalogSearchQueryViewHolder catalogSearchQueryViewHolder, boolean z, int i) {
        super(u4aVar, topBarVh, catalogPaginatedListViewHolder, false, r5, r6, r7, 56);
        boolean z2 = (i & 32) == 0;
        boolean z3 = (i & 64) == 0;
        CatalogSearchQueryViewHolder catalogSearchQueryViewHolder2 = (i & 128) != 0 ? null : catalogSearchQueryViewHolder;
        boolean z4 = (i & 256) != 0 ? false : z;
        this.v = str;
        this.w = u4aVar;
        this.x = topBarVh;
        this.y = w950Var;
        this.z = z3;
        this.A = catalogSearchQueryViewHolder2;
        this.B = z4;
        this.C = new bpn0(new cvs(this, 23));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.SectionWithSearchListVh
    public final void b(cfp0 cfp0Var) {
        super.b(cfp0Var);
        ((zd40) this.C.getValue()).c(cfp0Var.a, cfp0Var.b);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh, com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
    public final void dj(m.d dVar, List<? extends UIBlock> list, List<? extends UIBlock> list2, UIBlockList uIBlockList) {
        super.dj(dVar, list, list2, uIBlockList);
        if (this.z && this.B) {
            this.x.N6(uIBlockList);
            d(uIBlockList);
        }
    }
}
