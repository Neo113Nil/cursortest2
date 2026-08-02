package com.vk.ecomm.product_list.presentation;

import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.ecomm.product_list.presentation.e;
import xsna.izs;
import xsna.s3q0;
import xsna.upd0;

/* compiled from: ProductListMviComposeComponent.kt */
/* loaded from: classes18.dex */
public final class i implements izs<MarketProductTileConfig.f, s3q0> {
    public final /* synthetic */ izs<e, s3q0> b;
    public final /* synthetic */ upd0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(izs<? super e, s3q0> izsVar, upd0 upd0Var) {
        this.b = izsVar;
        this.c = upd0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(MarketProductTileConfig.f fVar) {
        String str = fVar.a;
        this.b.invoke(new e.a(this.c.a));
        return s3q0.a;
    }
}
