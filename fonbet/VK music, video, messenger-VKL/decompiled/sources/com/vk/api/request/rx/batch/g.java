package com.vk.api.request.rx.batch;

import com.vk.api.request.rx.batch.BatchRxApiRequest;
import org.json.JSONObject;
import xsna.bv6;
import xsna.rsg0;

/* compiled from: BatchRxApiRequest.kt */
/* loaded from: classes15.dex */
public final class g extends BatchRxApiRequest<bv6<? extends Object>[]> {
    public final /* synthetic */ rsg0<? extends Object>[] v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(rsg0<? extends Object>[] rsg0VarArr) {
        super(rsg0VarArr);
        this.v = rsg0VarArr;
    }

    @Override // com.vk.api.request.rx.batch.BatchRxApiRequest
    public final bv6<? extends Object>[] H0(JSONObject jSONObject) {
        return BatchRxApiRequest.a.a(jSONObject, this.v, this.u, this.t);
    }
}
