package com.braze.managers;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class f0 extends FunctionReferenceImpl implements Function1 {
    public f0(g0 g0Var) {
        super(1, g0Var, g0.class, "onConnectionFailed", "onConnectionFailed(Ljava/lang/Integer;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((g0) this.receiver).a((Integer) obj);
        return Unit.INSTANCE;
    }
}
