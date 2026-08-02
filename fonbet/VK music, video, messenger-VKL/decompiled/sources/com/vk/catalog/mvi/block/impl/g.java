package com.vk.catalog.mvi.block.impl;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogButtonDto;
import com.vk.api.generated.catalog.dto.CatalogLayoutDto;
import com.vk.catalog.mvi.block.impl.HorizontalButtonsView;
import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogButtonDo;
import com.vk.core.compose.component.defaults.CellButton$IconBackgroundStyle;
import java.util.List;
import xsna.j5g;
import xsna.p4a;
import xsna.yzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements yzs {
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        HorizontalButtonsView.ViewState.Style style;
        CatalogButtonDto catalogButtonDto;
        CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
        CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj3;
        List<CatalogButtonDto> e = catalogBlockDto.e();
        CatalogButtonDo c = (e == null || (catalogButtonDto = (CatalogButtonDto) j5g.a0(e)) == null) ? null : p4a.c(catalogButtonDto, catalogBlockDto);
        String id = catalogBlockDto.getId();
        String id2 = catalogBlockDto.getId();
        String title = c != null ? c.getTitle() : null;
        CatalogLayoutDto.StyleDto i = catalogBlockDto.n1().i();
        if (i != null) {
            CatalogLinkButtonActionDo d = c != null ? c.d() : null;
            int i2 = HorizontalButtonsView.d.$EnumSwitchMapping$0[i.ordinal()];
            if (i2 == 1) {
                Integer a = HorizontalButtonsView.a(i, d);
                boolean z = d instanceof CatalogLinkButtonActionDo.CreateAlbum;
                style = new HorizontalButtonsView.ViewState.Style.CellButton(a, z ? CellButton$IconBackgroundStyle.SquireMediumRadius : CellButton$IconBackgroundStyle.None, z ? "mvi_catalog_create_album_btn_test_tag" : "");
            } else if (i2 == 2) {
                style = new HorizontalButtonsView.ViewState.Style.Button(HorizontalButtonsView.a(i, d), d instanceof CatalogLinkButtonActionDo.CreateAlbum ? "mvi_catalog_create_album_btn_test_tag" : "");
            }
            return new HorizontalButtonsView.State(id, catalogBlockVariant, new HorizontalButtonsView.ViewState(id2, title, style, null), c, null);
        }
        style = null;
        return new HorizontalButtonsView.State(id, catalogBlockVariant, new HorizontalButtonsView.ViewState(id2, title, style, null), c, null);
    }
}
