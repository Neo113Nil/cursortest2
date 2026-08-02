package com.vk.api.request.rx.batch;

import xsna.bv6;
import xsna.rsg0;
import xsna.yzs;

/* compiled from: BatchRxApiRequest.kt */
/* loaded from: classes15.dex */
public final class f extends b<Object, Object, Object, Object> {
    public final /* synthetic */ yzs<bv6<Object>, bv6<Object>, bv6<Object>, Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(rsg0<Object> rsg0Var, rsg0<Object> rsg0Var2, rsg0<Object> rsg0Var3, yzs<? super bv6<Object>, ? super bv6<Object>, ? super bv6<Object>, Object> yzsVar) {
        super(rsg0Var, rsg0Var2, rsg0Var3);
        this.v = yzsVar;
    }

    @Override // com.vk.api.request.rx.batch.b
    public final Object K0(bv6<Object> bv6Var, bv6<Object> bv6Var2, bv6<Object> bv6Var3) {
        return this.v.invoke(bv6Var, bv6Var2, bv6Var3);
    }
}
