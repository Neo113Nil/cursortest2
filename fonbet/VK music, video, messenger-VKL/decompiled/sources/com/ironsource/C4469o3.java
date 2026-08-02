package com.ironsource;

import com.ironsource.H;
import com.ironsource.mediationsdk.logger.IronLog;
import xsna.zr;

/* renamed from: com.ironsource.o3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4469o3 extends H {
    public C4469o3(AbstractC4627x0 abstractC4627x0, Pg pg) {
        super(abstractC4627x0, pg);
    }

    @Override // com.ironsource.H
    public void a(B b, H.b bVar) {
        String a;
        if (!b.v()) {
            IronLog.INTERNAL.verbose(b.d().name() + " - Instance " + b.p() + " (non-bidder) is ready to load");
            bVar.a().add(b);
            return;
        }
        bVar.a(true);
        if (bVar.e()) {
            a = zr.a("Advanced Loading: Starting to load bidder ", b.p(), ". No other instances will be loaded at the same time.");
            bVar.a().add(b);
        } else {
            a = zr.a("Advanced Loading: Won't start loading bidder ", b.p(), " as a non bidder is being loaded");
        }
        IronLog.INTERNAL.verbose(b.d().name() + " - " + a);
    }

    @Override // com.ironsource.H
    public boolean a(H.b bVar) {
        return super.a(bVar) || bVar.d();
    }
}
