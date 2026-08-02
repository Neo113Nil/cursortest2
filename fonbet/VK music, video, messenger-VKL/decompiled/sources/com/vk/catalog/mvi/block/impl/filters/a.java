package com.vk.catalog.mvi.block.impl.filters;

import com.vk.api.generated.base.dto.BaseLinkButtonActionTypeDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogFilterDo;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.e43;
import xsna.j5g;
import xsna.p4a;
import xsna.yzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements yzs {
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
        CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj3;
        CatalogFilterDo catalogFilterDo = (CatalogFilterDo) j5g.a0(p4a.a(catalogBlockDto, BaseLinkButtonActionTypeDto.SHOW_FILTERS));
        ArrayList a = p4a.a(catalogBlockDto, BaseLinkButtonActionTypeDto.BLOCK_FILTER);
        String id = catalogBlockDto.getId();
        Iterator it = a.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                e43.t();
                throw null;
            }
            if (((CatalogFilterDo) next).f()) {
                break;
            }
            i++;
        }
        Integer valueOf = i != -1 ? Integer.valueOf(i) : null;
        return new HorizontalFiltersWithScrollView.State(id, catalogBlockVariant, catalogFilterDo, a, valueOf != null ? valueOf.intValue() : 0, null);
    }
}
