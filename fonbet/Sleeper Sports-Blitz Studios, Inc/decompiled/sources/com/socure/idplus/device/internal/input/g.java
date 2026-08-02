package com.socure.idplus.device.internal.input;

import com.socure.idplus.device.internal.behavior.model.LocationEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class g extends b implements Function1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.socure.idplus.device.internal.thread.c socureThread) {
        super(10, socureThread);
        Intrinsics.checkNotNullParameter(socureThread, "socureThread");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LocationEvent locationEvent = (LocationEvent) obj;
        Intrinsics.checkNotNullParameter(locationEvent, "locationEvent");
        a(locationEvent);
        return Unit.INSTANCE;
    }
}
