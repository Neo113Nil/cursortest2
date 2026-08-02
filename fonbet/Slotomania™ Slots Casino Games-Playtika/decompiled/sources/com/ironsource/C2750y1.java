package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.y1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2750y1 extends AbstractC2519l3 {
    public C2750y1() {
        this.H = "outcome";
        this.G = 4;
        this.I = "APP";
        e();
    }

    @Override // com.ironsource.AbstractC2519l3
    protected int c(C2736x5 c2736x5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC2519l3
    protected void d() {
    }

    @Override // com.ironsource.AbstractC2519l3
    protected String e(int i) {
        return "";
    }

    @Override // com.ironsource.AbstractC2519l3
    protected void f(C2736x5 c2736x5) {
    }

    @Override // com.ironsource.AbstractC2519l3
    protected boolean h(C2736x5 c2736x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC2519l3
    protected boolean j(C2736x5 c2736x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC2519l3
    protected boolean d(C2736x5 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int c = event.c();
        return c == EnumC2754y5.FIRST_INSTANCE.b() || c == EnumC2754y5.INIT_COMPLETE.b() || c == EnumC2754y5.SDK_INIT_FAILED.b() || c == EnumC2754y5.SDK_INIT_SUCCESS.b();
    }
}
