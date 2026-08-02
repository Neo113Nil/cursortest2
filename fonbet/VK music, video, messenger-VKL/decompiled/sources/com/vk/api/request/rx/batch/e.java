package com.vk.api.request.rx.batch;

import xsna.bv6;
import xsna.rsg0;
import xsna.wzs;

/* compiled from: BatchRxApiRequest.kt */
/* loaded from: classes15.dex */
public final class e extends a<Object, Object, Object> {
    public final /* synthetic */ wzs<bv6<Object>, bv6<Object>, Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(rsg0<Object> rsg0Var, rsg0<Object> rsg0Var2, wzs<? super bv6<Object>, ? super bv6<Object>, Object> wzsVar) {
        super(rsg0Var, rsg0Var2);
        this.v = wzsVar;
    }

    @Override // com.vk.api.request.rx.batch.a
    public final Object K0(bv6<Object> bv6Var, bv6<Object> bv6Var2) {
        return this.v.invoke(bv6Var, bv6Var2);
    }
}
