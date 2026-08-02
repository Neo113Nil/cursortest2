package com.vk.catalog.mvi.block.impl;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.impl.LinksSmallListVideoLibrary;
import com.vk.catalog.mvi.section.domain.CatalogImageDo;
import com.vk.catalog.mvi.section.domain.CatalogLinkDo;
import xsna.j5g;
import xsna.r2a;
import xsna.s2a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements s2a {
    @Override // xsna.s2a
    public final r2a a(CatalogBlockState catalogBlockState) {
        LinksSmallListVideoLibrary.State state = (LinksSmallListVideoLibrary.State) catalogBlockState;
        BlockId.CompositeId compositeId = state.b;
        CatalogLinkDo catalogLinkDo = state.d;
        String title = catalogLinkDo.getTitle();
        if (title == null) {
            title = "";
        }
        CatalogImageDo catalogImageDo = (CatalogImageDo) j5g.a0(catalogLinkDo.e());
        String url = catalogImageDo != null ? catalogImageDo.getUrl() : null;
        return new LinksSmallListVideoLibrary.d(compositeId, title, url != null ? url : "");
    }
}
