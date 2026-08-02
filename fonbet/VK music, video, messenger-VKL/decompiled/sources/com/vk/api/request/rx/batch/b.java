package com.vk.api.request.rx.batch;

import com.vk.api.request.rx.batch.BatchRxApiRequest;
import org.json.JSONObject;
import xsna.bv6;
import xsna.ozl;
import xsna.rsg0;

/* compiled from: Batch3RxApiRequest.kt */
@ozl
/* loaded from: classes15.dex */
public abstract class b<R1, R2, R3, T> extends BatchRxApiRequest<T> {
    public b(rsg0<R1> rsg0Var, rsg0<R2> rsg0Var2, rsg0<R3> rsg0Var3) {
        super(new rsg0[]{rsg0Var, rsg0Var2, rsg0Var3});
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.api.request.rx.batch.BatchRxApiRequest
    public final T H0(JSONObject jSONObject) {
        bv6[] a = BatchRxApiRequest.a.a(jSONObject, this.s, this.u, this.t);
        return (T) K0(a[0], a[1], a[2]);
    }

    public abstract T K0(bv6<R1> bv6Var, bv6<R2> bv6Var2, bv6<R3> bv6Var3);
}
