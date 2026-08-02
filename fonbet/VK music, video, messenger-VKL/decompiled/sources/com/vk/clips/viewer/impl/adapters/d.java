package com.vk.clips.viewer.impl.adapters;

import com.vk.dto.common.Currency;
import com.vk.dto.common.Price;
import xsna.izs;
import xsna.qcy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class d implements izs {
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Price price = (Price) obj;
        qcy<Object>[] qcyVarArr = GoodWrapper.d;
        long j = price.b;
        long j2 = price.c;
        Currency currency = price.d;
        return new com.vk.clips.sdk.shared.api.deps.Price(j, j2, new com.vk.clips.sdk.shared.api.deps.Currency(currency.b, currency.c, currency.d), price.e, price.f, price.g, price.h, price.i);
    }
}
