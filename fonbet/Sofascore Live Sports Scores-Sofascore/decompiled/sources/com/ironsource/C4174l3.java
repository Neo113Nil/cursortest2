package com.ironsource;

import com.ironsource.H;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.lnb;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.l3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4174l3 extends H {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4174l3(@NotNull AbstractC4386x0 abstractC4386x0, @NotNull Mg mg) {
        super(abstractC4386x0, mg);
        abstractC4386x0.getClass();
        mg.getClass();
    }

    @Override // com.ironsource.H
    public void a(@NotNull B b, @NotNull H.b bVar) {
        String o;
        b.getClass();
        bVar.getClass();
        if (!b.v()) {
            IronLog.INTERNAL.verbose(b.d().name() + " - Instance " + b.p() + " (non-bidder) is ready to load");
            bVar.a().add(b);
            return;
        }
        bVar.a(true);
        if (bVar.e()) {
            o = lnb.o("Advanced Loading: Starting to load bidder ", b.p(), ". No other instances will be loaded at the same time.");
            bVar.a().add(b);
        } else {
            o = lnb.o("Advanced Loading: Won't start loading bidder ", b.p(), " as a non bidder is being loaded");
        }
        IronLog.INTERNAL.verbose(b.d().name() + " - " + o);
    }

    @Override // com.ironsource.H
    public boolean a(@NotNull H.b bVar) {
        bVar.getClass();
        return super.a(bVar) || bVar.d();
    }
}
