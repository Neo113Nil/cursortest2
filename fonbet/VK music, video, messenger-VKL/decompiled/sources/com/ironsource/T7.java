package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* loaded from: classes13.dex */
public final class T7 implements P1 {
    @Override // com.ironsource.P1
    public void a(InterfaceC4386ja interfaceC4386ja) {
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        com.ironsource.lifecycle.b.d().a(interfaceC4386ja);
    }

    @Override // com.ironsource.P1
    public void b(InterfaceC4386ja interfaceC4386ja) {
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        com.ironsource.lifecycle.b.d().b(interfaceC4386ja);
    }
}
