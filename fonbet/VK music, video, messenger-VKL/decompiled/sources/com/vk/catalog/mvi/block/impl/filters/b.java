package com.vk.catalog.mvi.block.impl.filters;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView;
import com.vk.catalog.mvi.section.domain.CatalogFilterDo;
import java.util.ArrayList;
import java.util.List;
import xsna.c5g;
import xsna.r2a;
import xsna.s2a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements s2a {
    @Override // xsna.s2a
    public final r2a a(CatalogBlockState catalogBlockState) {
        HorizontalFiltersWithScrollView.State state = (HorizontalFiltersWithScrollView.State) catalogBlockState;
        String str = state.b;
        CatalogFilterDo catalogFilterDo = state.d;
        HorizontalFiltersWithScrollView.f.a aVar = catalogFilterDo != null ? new HorizontalFiltersWithScrollView.f.a(catalogFilterDo.d(), catalogFilterDo.getTitle(), false) : null;
        List<CatalogFilterDo> list = state.e;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (CatalogFilterDo catalogFilterDo2 : list) {
            arrayList.add(new HorizontalFiltersWithScrollView.f.a(catalogFilterDo2.d(), catalogFilterDo2.getTitle(), catalogFilterDo2.f()));
        }
        return new HorizontalFiltersWithScrollView.f(str, aVar, arrayList, state.f);
    }
}
