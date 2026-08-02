package com.braze.managers;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class e0 extends FunctionReferenceImpl implements Function0 {
    public e0(g0 g0Var) {
        super(0, g0Var, g0.class, "onConnectionSuccess", "onConnectionSuccess()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((g0) this.receiver).g();
        return Unit.INSTANCE;
    }
}
