package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.n6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3016n6 implements InterfaceExecutorC1706Fb {
    public final /* synthetic */ AnonymousClass49 A00;
    public final /* synthetic */ Executor A01;

    public C3016n6(Executor executor, AnonymousClass49 anonymousClass49) {
        this.A01 = executor;
        this.A00 = anonymousClass49;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceExecutorC1706Fb
    public final void AHb() {
        this.A00.A39(this.A01);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A01.execute(runnable);
    }
}
