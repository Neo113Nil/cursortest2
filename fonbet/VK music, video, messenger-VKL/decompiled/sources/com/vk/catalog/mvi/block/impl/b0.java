package com.vk.catalog.mvi.block.impl;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogLayoutDto;
import com.vk.catalog.mvi.block.impl.SeparatorTransparent;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import xsna.yzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements yzs {
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
        CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj3;
        CatalogLayoutDto.SizeDto g = catalogBlockDto.n1().g();
        int i = g == null ? -1 : SeparatorTransparent.b.$EnumSwitchMapping$0[g.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 4;
        } else if (i == 2) {
            i2 = 6;
        } else if (i == 3) {
            i2 = 8;
        } else if (i == 5) {
            i2 = 24;
        } else if (i != 6) {
            i2 = 12;
        }
        return new SeparatorTransparent.ViewState(catalogBlockDto.getId(), catalogBlockVariant, i2, null);
    }
}
