package com.vk.catalog.mvi.block.impl;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogLinkDto;
import com.vk.catalog.mvi.block.impl.LinksSmallListVideoLibrary;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogLinkDo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.f2a;
import xsna.p4a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements f2a {
    @Override // xsna.f2a
    public final List a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        Object obj;
        List<String> o1 = catalogBlockDto.o1();
        if (o1 == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = o1.iterator();
        while (true) {
            CatalogLinkDo catalogLinkDo = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            List<CatalogCatalogLinkDto> j = catalogExtraResponseObjectDto.j();
            if (j != null) {
                Iterator<T> it2 = j.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (epx.f(((CatalogCatalogLinkDto) obj).getId(), str)) {
                        break;
                    }
                }
                CatalogCatalogLinkDto catalogCatalogLinkDto = (CatalogCatalogLinkDto) obj;
                if (catalogCatalogLinkDto != null) {
                    catalogLinkDo = p4a.g(catalogCatalogLinkDto);
                }
            }
            if (catalogLinkDo != null) {
                arrayList.add(catalogLinkDo);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        int i = 0;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            arrayList2.add(new LinksSmallListVideoLibrary.State(com.vk.catalog.mvi.block.a.b(i, catalogBlockDto.getId()), catalogBlockVariant, (CatalogLinkDo) next));
            i = i2;
        }
        return arrayList2;
    }
}
