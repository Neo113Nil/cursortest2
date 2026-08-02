package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Q7 implements N1 {
    @Override // com.ironsource.N1
    public void a(@NotNull InterfaceC4128ia interfaceC4128ia) {
        interfaceC4128ia.getClass();
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        com.ironsource.lifecycle.b.d().a(interfaceC4128ia);
    }

    @Override // com.ironsource.N1
    public void b(@NotNull InterfaceC4128ia interfaceC4128ia) {
        interfaceC4128ia.getClass();
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        com.ironsource.lifecycle.b.d().b(interfaceC4128ia);
    }
}
