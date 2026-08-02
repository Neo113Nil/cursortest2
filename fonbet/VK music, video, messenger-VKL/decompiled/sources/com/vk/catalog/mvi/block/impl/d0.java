package com.vk.catalog.mvi.block.impl;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.catalog.mvi.block.impl.SeparatorView;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import xsna.yzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements yzs {
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new SeparatorView.ViewState(((CatalogBlockDto) obj2).getId(), (CatalogBlockVariant) obj3, null);
    }
}
