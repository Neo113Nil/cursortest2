package org.chromium.net.impl;

import org.chromium.net.impl.CronetUrlRequestContext;

/* loaded from: classes6.dex */
final class P implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CronetUrlRequestContext.a f78889a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CronetUrlRequestContext f78890b;

    P(CronetUrlRequestContext cronetUrlRequestContext, CronetUrlRequestContext.a aVar) {
        this.f78889a = aVar;
        this.f78890b = cronetUrlRequestContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        long j11;
        obj = this.f78890b.f78782a;
        synchronized (obj) {
            vf.c.c("CronetUrlRequestContext#CronetUrlRequestContext initializing request context");
            new S();
            j11 = this.f78890b.f78786e;
            internal.J.N.M6Dz0nZ5(j11, this.f78890b);
        }
        CronetUrlRequestContext.a aVar = this.f78889a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
