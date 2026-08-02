package com.braze.models.response;

import com.braze.requests.o;
import com.braze.support.q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.communication.d f649a;
    public final Long b;

    public a(o request, com.braze.communication.d connectionResult) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
        this.f649a = connectionResult;
        String str = (String) connectionResult.b.get("retry-after");
        this.b = str != null ? q.a(str) : null;
    }
}
