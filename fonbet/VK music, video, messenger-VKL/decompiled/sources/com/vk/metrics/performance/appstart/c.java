package com.vk.metrics.performance.appstart;

import com.vk.metrics.performance.appstart.a;
import xsna.jw90;
import xsna.ow90;

/* compiled from: AppStartTimesListener.kt */
/* loaded from: classes.dex */
public final class c implements a.InterfaceC1278a {
    public final ow90.a a;

    public c(ow90.a aVar) {
        this.a = aVar;
    }

    @Override // com.vk.metrics.performance.appstart.a.InterfaceC1278a
    public final void a() {
        this.a.b.compareAndSet(0L, System.currentTimeMillis());
    }

    @Override // com.vk.metrics.performance.appstart.a.InterfaceC1278a
    public final void b(jw90 jw90Var) {
        this.a.c.compareAndSet(0L, System.currentTimeMillis());
    }

    @Override // com.vk.metrics.performance.appstart.a.InterfaceC1278a
    public final void c() {
        this.a.d.set(true);
    }

    @Override // com.vk.metrics.performance.appstart.a.InterfaceC1278a
    public final void d() {
        this.a.a.compareAndSet(0L, System.currentTimeMillis());
    }
}
