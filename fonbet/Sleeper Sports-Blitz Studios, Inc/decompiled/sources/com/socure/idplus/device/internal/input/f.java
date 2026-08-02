package com.socure.idplus.device.internal.input;

import android.os.SystemClock;
import com.socure.idplus.device.internal.behavior.model.LifeCycleEvent;
import com.socure.idplus.device.internal.behavior.model.LifeCycleType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class f extends b implements Function1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.socure.idplus.device.internal.thread.c socureThread) {
        super(11, socureThread);
        Intrinsics.checkNotNullParameter(socureThread, "socureThread");
        a();
    }

    public final void b() {
        LifeCycleType lifeCycleType = LifeCycleType.INITIALIZED;
        Intrinsics.checkNotNullParameter(lifeCycleType, "lifeCycleType");
        a(new LifeCycleEvent(SystemClock.uptimeMillis(), lifeCycleType));
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LifeCycleType lifeCycleType = (LifeCycleType) obj;
        Intrinsics.checkNotNullParameter(lifeCycleType, "lifeCycleType");
        a(new LifeCycleEvent(SystemClock.uptimeMillis(), lifeCycleType));
        return Unit.INSTANCE;
    }
}
