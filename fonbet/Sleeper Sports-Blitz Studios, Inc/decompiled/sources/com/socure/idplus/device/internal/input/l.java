package com.socure.idplus.device.internal.input;

import com.socure.idplus.device.internal.behavior.model.ViewportSizeEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class l extends b implements Function1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.socure.idplus.device.internal.thread.c socureThread) {
        super(12, socureThread);
        Intrinsics.checkNotNullParameter(socureThread, "socureThread");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewportSizeEvent viewportSizeEvent = (ViewportSizeEvent) obj;
        Intrinsics.checkNotNullParameter(viewportSizeEvent, "viewportSizeEvent");
        a(viewportSizeEvent);
        return Unit.INSTANCE;
    }
}
