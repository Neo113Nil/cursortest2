package com.braze.managers;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class d0 extends FunctionReferenceImpl implements Function1 {
    public d0(g0 g0Var) {
        super(1, g0Var, g0.class, "ingestDustMessages", "ingestDustMessages$android_sdk_base_release(Lcom/braze/models/dust/IDustMessage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.braze.models.dust.g p0 = (com.braze.models.dust.g) obj;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((g0) this.receiver).a(p0);
        return Unit.INSTANCE;
    }
}
