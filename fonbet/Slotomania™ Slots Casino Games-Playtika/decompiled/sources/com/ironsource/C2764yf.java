package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.yf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2764yf extends Pg {
    private final Uc d;
    private final Jg e;
    private final H f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2764yf(V0 adTools, Uc outcomeReporter, Jg waterfallInstances, H adInstanceLoadStrategy) {
        super(adTools, outcomeReporter);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
        this.d = outcomeReporter;
        this.e = waterfallInstances;
        this.f = adInstanceLoadStrategy;
    }

    @Override // com.ironsource.Pg
    public void a(B instance) {
        B a;
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (this.f.a(instance)) {
            this.d.a(this.e.b(), instance);
        } else {
            if (!this.f.a() || (a = this.f.c().a()) == null) {
                return;
            }
            this.d.a(this.e.b(), a);
        }
    }

    @Override // com.ironsource.Pg
    public void b(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // com.ironsource.Pg
    public void c(B instanceToShow) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
        this.d.a(this.e.b(), instanceToShow);
    }

    @Override // com.ironsource.Pg
    public void a() {
        B a = this.f.c().a();
        if (a != null) {
            this.d.a(this.e.b(), a);
        }
    }
}
