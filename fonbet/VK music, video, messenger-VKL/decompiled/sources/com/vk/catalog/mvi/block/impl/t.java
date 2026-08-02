package com.vk.catalog.mvi.block.impl;

import com.vk.catalog.mvi.block.impl.OpenSectionArrowButtonView;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogImageDo;
import com.vk.catalog.mvi.section.domain.CatalogLinkDo;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.dto.common.ImageSize;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.c5g;
import xsna.wzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements wzs {
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ContentType zb;
        CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj;
        UIBlock uIBlock = (UIBlock) obj2;
        UIBlockLink uIBlockLink = uIBlock instanceof UIBlockLink ? (UIBlockLink) uIBlock : null;
        if (uIBlockLink == null) {
            return null;
        }
        String url = uIBlockLink.Pb().getUrl();
        String title = uIBlockLink.Pb().getTitle();
        String Bb = uIBlockLink.Pb().Bb();
        ArrayList arrayList = uIBlockLink.Pb().getImage().b;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ImageSize imageSize = (ImageSize) it.next();
            arrayList2.add(new CatalogImageDo(imageSize.getUrl(), imageSize.getWidth(), imageSize.getHeight()));
        }
        Meta Ab = uIBlockLink.Pb().Ab();
        String r = Ab != null ? Ab.r() : null;
        Meta Ab2 = uIBlockLink.Pb().Ab();
        return new OpenSectionArrowButtonView.State(uIBlock.w(), catalogBlockVariant, new CatalogLinkDo(url, title, Bb, arrayList2, r, (Ab2 == null || (zb = Ab2.zb()) == null) ? null : zb.i()), null);
    }
}
