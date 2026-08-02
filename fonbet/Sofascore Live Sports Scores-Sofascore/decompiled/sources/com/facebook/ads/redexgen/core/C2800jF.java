package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.jF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2800jF implements SM {
    public final /* synthetic */ AbstractC2817jd A00;
    public final /* synthetic */ InterfaceC1929Nt A01;
    public final /* synthetic */ C1930Nu A02;
    public final /* synthetic */ C2652gi A03;
    public final /* synthetic */ boolean A04;

    public C2800jF(C1930Nu c1930Nu, C2652gi c2652gi, boolean z, AbstractC2817jd abstractC2817jd, InterfaceC1929Nt interfaceC1929Nt) {
        this.A02 = c1930Nu;
        this.A03 = c2652gi;
        this.A04 = z;
        this.A00 = abstractC2817jd;
        this.A01 = interfaceC1929Nt;
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACx() {
        ArrayList arrayList;
        if (C2102Up.A1q(this.A03) && this.A04) {
            arrayList = this.A02.A02;
            arrayList.add(AbstractC2437dD.A01(this.A03, this.A00, 1, new C2801jG(this)));
        } else {
            this.A01.ACp();
        }
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACy() {
        this.A01.ACo(AdError.CACHE_ERROR);
    }
}
