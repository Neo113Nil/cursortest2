package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Y5 implements InterfaceC2473ia {
    private final Ye a;
    private long b;

    public Y5(InterfaceC2505k7 applicationLifecycleService, Ye task) {
        Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        Intrinsics.checkNotNullParameter(task, "task");
        this.a = task;
        applicationLifecycleService.a(this);
        f();
    }

    private final long e() {
        return System.currentTimeMillis() - this.b;
    }

    private final void f() {
        this.b = System.currentTimeMillis();
    }

    @Override // com.ironsource.InterfaceC2473ia
    public void a() {
        this.a.a(Long.valueOf(e()));
        this.a.run();
    }

    @Override // com.ironsource.InterfaceC2473ia
    public void b() {
        f();
    }

    @Override // com.ironsource.InterfaceC2473ia
    public void c() {
    }

    @Override // com.ironsource.InterfaceC2473ia
    public void d() {
    }
}
