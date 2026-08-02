package com.vk.catalog.mvi.block.music.impl.buttons;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogButtonDto;
import com.vk.catalog.mvi.block.music.impl.buttons.SavePlaylistByFilterButton;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.List;
import xsna.j5g;
import xsna.yzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements yzs {
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
        CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj3;
        List<CatalogButtonDto> e = catalogBlockDto.e();
        CatalogButtonDto catalogButtonDto = e != null ? (CatalogButtonDto) j5g.a0(e) : null;
        return new SavePlaylistByFilterButton.State(catalogBlockDto.getId(), catalogBlockVariant, new SavePlaylistByFilterButton.ViewState(catalogBlockDto.getId(), catalogButtonDto != null ? catalogButtonDto.getTitle() : null, null), catalogButtonDto != null ? catalogButtonDto.T() : null, null);
    }
}
