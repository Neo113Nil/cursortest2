package com.ironsource;

import com.ironsource.H;
import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class D4 extends H {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4(@NotNull AbstractC4386x0 abstractC4386x0, @NotNull Mg mg) {
        super(abstractC4386x0, mg);
        abstractC4386x0.getClass();
        mg.getClass();
    }

    @Override // com.ironsource.H
    public void a(@NotNull B b, @NotNull H.b bVar) {
        b.getClass();
        bVar.getClass();
        IronLog.INTERNAL.verbose(b.d().name() + " - Instance " + b.q() + " is ready to load");
        bVar.a().add(b);
    }
}
