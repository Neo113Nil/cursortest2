package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface M0 {
    default void a() {
    }

    void a(IronSourceError ironSourceError);

    void a(C2677u0 c2677u0);

    default void b(C2677u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
    }
}
