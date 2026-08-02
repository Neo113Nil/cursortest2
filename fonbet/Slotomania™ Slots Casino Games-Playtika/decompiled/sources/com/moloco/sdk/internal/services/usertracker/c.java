package com.moloco.sdk.internal.services.usertracker;

import com.moloco.sdk.internal.services.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class c implements b {
    public static final int b = 8;
    public final w a;

    public c(w dataStoreService) {
        Intrinsics.checkNotNullParameter(dataStoreService, "dataStoreService");
        this.a = dataStoreService;
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    public Object a(String str, Continuation<? super Unit> continuation) {
        Object a = this.a.a(d.a, str, continuation);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    public Object b(Continuation<? super String> continuation) {
        return this.a.d(d.a, continuation);
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    public Object a(Continuation<? super Unit> continuation) {
        Object a = this.a.a(d.a, continuation);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }
}
