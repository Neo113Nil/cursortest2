package com.braze.models.response;

import com.braze.requests.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class n extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o request, com.braze.communication.d connectionResult) {
        super(request, connectionResult);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
    }
}
