package com.instagram.common.viewpoint.core;

import android.text.TextUtils;

/* loaded from: assets/audience_network/classes2.dex */
public class H8 extends AbstractC1639fo {
    public final /* synthetic */ AbstractC0782Gj A00;

    public H8(AbstractC0782Gj abstractC0782Gj) {
        this.A00 = abstractC0782Gj;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1639fo
    public final void A03() {
        if (!this.A00.A08.A07()) {
            this.A00.A08.A05();
            if (!TextUtils.isEmpty(this.A00.A03.A2E())) {
                this.A00.A06.ABJ(this.A00.A03.A2E(), new C1352b9().A03(this.A00.A0C).A02(this.A00.A08).A04(this.A00.A03.A0z()).A05());
                if (this.A00.A03.A1u()) {
                    this.A00.A05.A0F().AEW();
                }
                C1191Wl.A00(this.A00.A05).A0E(this.A00.A0B.A8l(), this.A00.A03.A2E());
                C0959Ng.A07(this.A00.A03.A2A(), this.A00.A05);
                this.A00.A05.A0F().A3L();
                AbstractC0979Oa.A02(this.A00.A03.A0y(), AbstractC1215Xm.A00(this.A00.A03.A10()));
                this.A00.A0A.A4j(this.A00.A0B.A8G());
            }
        }
    }
}
