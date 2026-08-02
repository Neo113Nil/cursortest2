package com.moloco.sdk.acm.services;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class h {
    public final i a;
    public final AtomicLong b;

    public h(i timeProviderService) {
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.a = timeProviderService;
        this.b = new AtomicLong(0L);
    }

    public final long a() {
        return this.a.invoke() - this.b.get();
    }

    public final AtomicLong b() {
        return this.b;
    }

    public final void c() {
        this.b.set(this.a.invoke());
    }
}
