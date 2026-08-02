package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.jo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1871jo implements O3 {
    public final /* synthetic */ C05817w A00;

    public C1871jo(C05817w c05817w) {
        this.A00 = c05817w;
    }

    @Override // com.instagram.common.viewpoint.core.O3
    public final void AFF(AdError adError) {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A00, adError);
    }

    @Override // com.instagram.common.viewpoint.core.O3
    public final void AFG() {
        AtomicBoolean atomicBoolean;
        NJ nj;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        nj = this.A00.A01;
        nj.AFm(this.A00);
    }
}
