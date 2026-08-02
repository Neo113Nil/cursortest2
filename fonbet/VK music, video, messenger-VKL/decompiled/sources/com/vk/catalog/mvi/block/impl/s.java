package com.vk.catalog.mvi.block.impl;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogLinkDto;
import com.vk.catalog.mvi.block.impl.OpenSectionArrowButtonView;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.Iterator;
import java.util.List;
import xsna.epx;
import xsna.j5g;
import xsna.p4a;
import xsna.yzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements yzs {
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        List<CatalogCatalogLinkDto> j;
        Object obj4;
        CatalogExtraResponseObjectDto catalogExtraResponseObjectDto = (CatalogExtraResponseObjectDto) obj;
        CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
        CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj3;
        List<String> o1 = catalogBlockDto.o1();
        if (o1 != null && (str = (String) j5g.a0(o1)) != null && (j = catalogExtraResponseObjectDto.j()) != null) {
            Iterator<T> it = j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it.next();
                if (epx.f(((CatalogCatalogLinkDto) obj4).getId(), str)) {
                    break;
                }
            }
            CatalogCatalogLinkDto catalogCatalogLinkDto = (CatalogCatalogLinkDto) obj4;
            if (catalogCatalogLinkDto != null) {
                return new OpenSectionArrowButtonView.State(catalogBlockDto.getId(), catalogBlockVariant, p4a.g(catalogCatalogLinkDto), null);
            }
        }
        return null;
    }
}
