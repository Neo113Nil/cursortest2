package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.tg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC2675tg {
    void a() throws C2637re;

    default void a(boolean z, Function0<? extends IronSourceError> lazyError) {
        Intrinsics.checkNotNullParameter(lazyError, "lazyError");
        if (!z) {
            throw new C2637re(lazyError.invoke());
        }
    }
}
