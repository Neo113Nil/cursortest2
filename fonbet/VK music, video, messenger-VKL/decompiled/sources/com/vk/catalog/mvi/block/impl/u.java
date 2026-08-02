package com.vk.catalog.mvi.block.impl;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.impl.OpenSectionArrowButtonView;
import com.vk.catalog.mvi.section.domain.CatalogImageDo;
import com.vk.catalog.mvi.section.domain.CatalogLinkDo;
import xsna.j5g;
import xsna.r2a;
import xsna.s2a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements s2a {
    @Override // xsna.s2a
    public final r2a a(CatalogBlockState catalogBlockState) {
        OpenSectionArrowButtonView.State state = (OpenSectionArrowButtonView.State) catalogBlockState;
        String str = state.b;
        CatalogLinkDo catalogLinkDo = state.d;
        CatalogImageDo catalogImageDo = (CatalogImageDo) j5g.k0(catalogLinkDo.e());
        String url = catalogImageDo != null ? catalogImageDo.getUrl() : null;
        if (url == null) {
            url = "";
        }
        String title = catalogLinkDo.getTitle();
        if (title == null) {
            title = "";
        }
        String f = catalogLinkDo.f();
        return new OpenSectionArrowButtonView.d(str, url, title, f != null ? f : "");
    }
}
