package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.jD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1841jD implements InterfaceC1093Sp {
    public final /* synthetic */ AbstractC1860jd A00;
    public final /* synthetic */ InterfaceC0972Nt A01;
    public final /* synthetic */ C0973Nu A02;
    public final /* synthetic */ C1695gi A03;
    public final /* synthetic */ boolean A04;

    public C1841jD(C0973Nu c0973Nu, C1695gi c1695gi, boolean z, AbstractC1860jd abstractC1860jd, InterfaceC0972Nt interfaceC0972Nt) {
        this.A02 = c0973Nu;
        this.A03 = c1695gi;
        this.A04 = z;
        this.A00 = abstractC1860jd;
        this.A01 = interfaceC0972Nt;
    }

    private void A00(boolean z) {
        ArrayList arrayList;
        if (z) {
            if (C1145Up.A1q(this.A03) && this.A04) {
                arrayList = this.A02.A02;
                arrayList.add(AbstractC1480dD.A01(this.A03, this.A00, 1, new C1842jE(this)));
                return;
            } else {
                this.A01.ACp();
                return;
            }
        }
        this.A01.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1093Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1093Sp
    public final void ADT() {
        A00(true);
    }
}
