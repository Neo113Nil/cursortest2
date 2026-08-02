package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class S7 implements P1 {
    @Override // com.ironsource.P1
    public void a(InterfaceC2473ia observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        com.ironsource.lifecycle.b.d().a(observer);
    }

    @Override // com.ironsource.P1
    public void b(InterfaceC2473ia observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        com.ironsource.lifecycle.b.d().b(observer);
    }
}
