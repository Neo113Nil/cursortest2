package com.braze.requests.framework.queue;

import com.braze.requests.n;
import com.braze.requests.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class a extends com.braze.requests.framework.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.braze.dispatch.h dispatchDataProvider) {
        super(n.d, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j) {
        c(j);
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j, com.braze.requests.framework.h requestInfo, com.braze.models.response.g apiResponse) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        super.a(j, requestInfo, apiResponse);
        Long l = apiResponse.b;
        if (l != null) {
            requestInfo.b = l.longValue() + j;
            requestInfo.a(j, com.braze.requests.framework.i.b);
            o oVar = requestInfo.f673a;
            com.braze.requests.f fVar = oVar instanceof com.braze.requests.f ? (com.braze.requests.f) oVar : null;
            if (fVar != null) {
                fVar.m = requestInfo.h;
            }
        }
    }
}
