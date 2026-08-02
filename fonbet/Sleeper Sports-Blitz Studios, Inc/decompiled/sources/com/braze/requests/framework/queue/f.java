package com.braze.requests.framework.queue;

import com.braze.requests.n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class f extends com.braze.requests.framework.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.braze.dispatch.h dispatchDataProvider) {
        super(n.e, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j) {
        c(j);
    }
}
