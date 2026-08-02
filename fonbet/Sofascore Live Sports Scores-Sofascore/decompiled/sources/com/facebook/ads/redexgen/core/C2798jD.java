package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.jD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2798jD implements InterfaceC2050Sp {
    public final /* synthetic */ AbstractC2817jd A00;
    public final /* synthetic */ InterfaceC1929Nt A01;
    public final /* synthetic */ C1930Nu A02;
    public final /* synthetic */ C2652gi A03;
    public final /* synthetic */ boolean A04;

    public C2798jD(C1930Nu c1930Nu, C2652gi c2652gi, boolean z, AbstractC2817jd abstractC2817jd, InterfaceC1929Nt interfaceC1929Nt) {
        this.A02 = c1930Nu;
        this.A03 = c2652gi;
        this.A04 = z;
        this.A00 = abstractC2817jd;
        this.A01 = interfaceC1929Nt;
    }

    private void A00(boolean z) {
        ArrayList arrayList;
        if (z) {
            if (C2102Up.A1q(this.A03) && this.A04) {
                arrayList = this.A02.A02;
                arrayList.add(AbstractC2437dD.A01(this.A03, this.A00, 1, new C2799jE(this)));
                return;
            } else {
                this.A01.ACp();
                return;
            }
        }
        this.A01.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2050Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2050Sp
    public final void ADT() {
        A00(true);
    }
}
