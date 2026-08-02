package com.vk.catalog.mvi.block.impl.debug;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.impl.debug.UnknownVariantView;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import xsna.yzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class a implements yzs {
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
        CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj3;
        return new UnknownVariantView.ViewState(new BlockId.Unique(catalogBlockDto.getId()), catalogBlockVariant, catalogBlockDto, (CatalogExtraResponseObjectDto) obj);
    }
}
