package com.vk.catalog.mvi.block.impl;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogButtonDto;
import com.vk.api.generated.catalog.dto.CatalogLayoutDto;
import com.vk.catalog.mvi.block.impl.HeaderView;
import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogButtonDo;
import java.util.List;
import xsna.j5g;
import xsna.p4a;
import xsna.yzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements yzs {
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CatalogButtonDto catalogButtonDto;
        CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
        CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj3;
        List<CatalogButtonDto> e = catalogBlockDto.e();
        CatalogButtonDo c = (e == null || (catalogButtonDto = (CatalogButtonDto) j5g.a0(e)) == null) ? null : p4a.c(catalogButtonDto, catalogBlockDto);
        boolean z = catalogBlockDto.n1().i() == CatalogLayoutDto.StyleDto.PROFILE_HEADER;
        String id = catalogBlockDto.getId();
        String id2 = catalogBlockDto.getId();
        String title = catalogBlockDto.getTitle();
        if (title == null) {
            title = "";
        }
        String str = title;
        String title2 = c != null ? c.getTitle() : null;
        CatalogLinkButtonActionDo d = c != null ? c.d() : null;
        CatalogLinkButtonActionDo.OpenShowAllFragmentLegacySection openShowAllFragmentLegacySection = d instanceof CatalogLinkButtonActionDo.OpenShowAllFragmentLegacySection ? (CatalogLinkButtonActionDo.OpenShowAllFragmentLegacySection) d : null;
        return new HeaderView.State(id, catalogBlockVariant, new HeaderView.ViewState(id2, str, title2, openShowAllFragmentLegacySection != null ? openShowAllFragmentLegacySection.d() : null, z, null), c, null);
    }
}
