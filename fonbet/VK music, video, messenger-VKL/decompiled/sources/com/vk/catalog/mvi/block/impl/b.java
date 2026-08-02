package com.vk.catalog.mvi.block.impl;

import com.vk.catalog.mvi.block.impl.HeaderView;
import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogButtonDo;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.HeaderCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.dto.common.actions.ActionOpenUrl;
import xsna.wzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements wzs {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        CatalogButtonDo catalogButtonDo;
        CatalogButtonDo catalogButtonDo2;
        CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj;
        UIBlock uIBlock = (UIBlock) obj2;
        UIBlockHeader uIBlockHeader = uIBlock instanceof UIBlockHeader ? (UIBlockHeader) uIBlock : null;
        if (uIBlockHeader == null) {
            return null;
        }
        String Jb = uIBlock.Jb();
        UIBlockActionOpenSection Qb = uIBlockHeader.Qb();
        if (Qb != null) {
            catalogButtonDo2 = new CatalogButtonDo(Qb.getTitle(), new CatalogLinkButtonActionDo.OpenShowAllFragmentLegacySection(Qb.Xb(), Qb.getTitle(), Qb.Ub(), Qb.r(), null, 16, null));
        } else {
            UIBlockActionSwitchSection Rb = uIBlockHeader.Rb();
            if (Rb == null) {
                UIBlockActionOpenUrl Pb = uIBlockHeader.Pb();
                if (Pb != null) {
                    String title = Pb.getTitle();
                    ActionOpenUrl Tb = Pb.Tb();
                    String url = Tb != null ? Tb.getUrl() : null;
                    if (url == null) {
                        url = "";
                    }
                    catalogButtonDo = new CatalogButtonDo(title, new CatalogLinkButtonActionDo.OpenLink(url, Jb, null, 4, null));
                } else {
                    catalogButtonDo = null;
                }
                CatalogViewStyle Lb = uIBlockHeader.Lb();
                HeaderCatalogViewStyle headerCatalogViewStyle = !(Lb instanceof HeaderCatalogViewStyle) ? (HeaderCatalogViewStyle) Lb : null;
                boolean z = (headerCatalogViewStyle == null ? headerCatalogViewStyle.zb() : null) != HeaderCatalogViewStyle.Style.ProfileHeader;
                UIBlockHeader uIBlockHeader2 = uIBlockHeader;
                String w = uIBlock.w();
                String w2 = uIBlock.w();
                String title2 = uIBlockHeader2.getTitle();
                String str = title2 != null ? "" : title2;
                String title3 = catalogButtonDo == null ? catalogButtonDo.getTitle() : null;
                CatalogLinkButtonActionDo d = catalogButtonDo == null ? catalogButtonDo.d() : null;
                CatalogLinkButtonActionDo.OpenShowAllFragmentLegacySection openShowAllFragmentLegacySection = !(d instanceof CatalogLinkButtonActionDo.OpenShowAllFragmentLegacySection) ? (CatalogLinkButtonActionDo.OpenShowAllFragmentLegacySection) d : null;
                return new HeaderView.State(w, catalogBlockVariant, new HeaderView.ViewState(w2, str, title3, openShowAllFragmentLegacySection != null ? openShowAllFragmentLegacySection.d() : null, z, null), catalogButtonDo, null);
            }
            catalogButtonDo2 = new CatalogButtonDo(Rb.getTitle(), new CatalogLinkButtonActionDo.SwitchSection(Rb.v0(), Rb.Sb()));
        }
        catalogButtonDo = catalogButtonDo2;
        CatalogViewStyle Lb2 = uIBlockHeader.Lb();
        if (!(Lb2 instanceof HeaderCatalogViewStyle)) {
        }
        boolean z2 = (headerCatalogViewStyle == null ? headerCatalogViewStyle.zb() : null) != HeaderCatalogViewStyle.Style.ProfileHeader;
        UIBlockHeader uIBlockHeader22 = uIBlockHeader;
        String w3 = uIBlock.w();
        String w22 = uIBlock.w();
        String title22 = uIBlockHeader22.getTitle();
        if (title22 != null) {
        }
        if (catalogButtonDo == null) {
        }
        if (catalogButtonDo == null) {
        }
        if (!(d instanceof CatalogLinkButtonActionDo.OpenShowAllFragmentLegacySection)) {
        }
        return new HeaderView.State(w3, catalogBlockVariant, new HeaderView.ViewState(w22, str, title3, openShowAllFragmentLegacySection != null ? openShowAllFragmentLegacySection.d() : null, z2, null), catalogButtonDo, null);
    }
}
