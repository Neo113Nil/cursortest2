package com.ironsource;

import com.ironsource.H;
import com.ironsource.mediationsdk.logger.IronLog;

/* loaded from: classes13.dex */
public class G4 extends H {
    public G4(AbstractC4627x0 abstractC4627x0, Pg pg) {
        super(abstractC4627x0, pg);
    }

    @Override // com.ironsource.H
    public void a(B b, H.b bVar) {
        IronLog.INTERNAL.verbose(b.d().name() + " - Instance " + b.q() + " is ready to load");
        bVar.a().add(b);
    }
}
