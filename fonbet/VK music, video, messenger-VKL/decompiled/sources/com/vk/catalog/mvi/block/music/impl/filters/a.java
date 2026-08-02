package com.vk.catalog.mvi.block.music.impl.filters;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.music.impl.filters.MusicTabsFiltersView;
import com.vk.catalog.mvi.section.domain.CatalogFilterOptionDo;
import java.util.ArrayList;
import java.util.List;
import xsna.c5g;
import xsna.r2a;
import xsna.s2a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements s2a {
    @Override // xsna.s2a
    public final r2a a(CatalogBlockState catalogBlockState) {
        MusicTabsFiltersView.TabsState tabsState = (MusicTabsFiltersView.TabsState) catalogBlockState;
        String str = tabsState.b;
        List<CatalogFilterOptionDo> list = tabsState.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (CatalogFilterOptionDo catalogFilterOptionDo : list) {
            arrayList.add(new MusicTabsFiltersView.e(catalogFilterOptionDo.d(), catalogFilterOptionDo.getTitle(), catalogFilterOptionDo.e()));
        }
        return new MusicTabsFiltersView.f(str, arrayList, tabsState.e.b);
    }
}
