package com.vk.catalog2.common.ui.holders.api;

import xsna.alj;
import xsna.bnn0;
import xsna.g380;
import xsna.gha;
import xsna.hha;

/* compiled from: CatalogStatesViewHolder.kt */
/* loaded from: classes16.dex */
public interface CatalogStatesViewHolder extends CatalogViewHolder, hha, gha, g380 {
    @Override // xsna.gha
    default void A2(String str) {
        i8(alj.a);
        A(str);
    }

    bnn0 getState();

    void i8(bnn0 bnn0Var);
}
