package com.braze.managers;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class f1 extends FunctionReferenceImpl implements Function4 {
    public f1(h1 h1Var) {
        super(4, h1Var, h1.class, "log", "log$android_sdk_base_release(Ljava/lang/String;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/String;Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String p0 = (String) obj;
        BrazeLogger.Priority p1 = (BrazeLogger.Priority) obj2;
        String p2 = (String) obj3;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        ((h1) this.receiver).a(p0, p1, p2, (Throwable) obj4);
        return Unit.INSTANCE;
    }
}
