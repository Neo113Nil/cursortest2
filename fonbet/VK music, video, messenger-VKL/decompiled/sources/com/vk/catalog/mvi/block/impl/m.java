package com.vk.catalog.mvi.block.impl;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.impl.HorizontalButtonsWithScrollView;
import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import com.vk.catalog.mvi.section.domain.CatalogButtonDo;
import java.util.ArrayList;
import java.util.List;
import xsna.c5g;
import xsna.epx;
import xsna.r2a;
import xsna.s2a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements s2a {
    @Override // xsna.s2a
    public final r2a a(CatalogBlockState catalogBlockState) {
        HorizontalButtonsWithScrollView.State state = (HorizontalButtonsWithScrollView.State) catalogBlockState;
        String str = state.b;
        List<CatalogButtonDo> list = state.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (CatalogButtonDo catalogButtonDo : list) {
            arrayList.add(new HorizontalButtonsWithScrollView.d.a(catalogButtonDo.getTitle(), epx.f(catalogButtonDo.d(), CatalogLinkButtonActionDo.OpenAuthorCabinet.b) ? state.e : null));
        }
        return new HorizontalButtonsWithScrollView.d(str, arrayList);
    }
}
