package com.braze.requests.framework.queue;

import com.braze.requests.n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class g extends com.braze.requests.framework.b {
    public final boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.braze.dispatch.h dispatchDataProvider) {
        super(n.m, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        this.k = true;
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j) {
        c(j);
    }

    @Override // com.braze.requests.framework.b
    public final boolean c() {
        return this.k;
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j, com.braze.requests.framework.h requestInfo, com.braze.models.response.a apiResponse) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        super.a(j, requestInfo, apiResponse);
        requestInfo.a(j, com.braze.requests.framework.i.e);
    }
}
