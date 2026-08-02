package org.chromium.net.impl;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f78899a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    private final A10.c f78900b;

    public Z(A10.c cVar) {
        this.f78900b = cVar;
    }

    public final void a() {
        if (this.f78899a.decrementAndGet() == 0) {
            this.f78900b.run();
        }
    }

    public final void b() {
        this.f78899a.incrementAndGet();
    }
}
