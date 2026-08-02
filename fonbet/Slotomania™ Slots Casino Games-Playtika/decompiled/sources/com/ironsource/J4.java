package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class J4 extends Pg {
    private final Uc d;
    private final Jg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J4(V0 adTools, Uc outcomeReporter, Jg waterfallInstances) {
        super(adTools, outcomeReporter);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.d = outcomeReporter;
        this.e = waterfallInstances;
    }

    @Override // com.ironsource.Pg
    public void a() {
    }

    @Override // com.ironsource.Pg
    public void a(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // com.ironsource.Pg
    public void b(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.d.a(this.e.b(), instance);
    }

    @Override // com.ironsource.Pg
    public void c(B instanceToShow) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
    }
}
