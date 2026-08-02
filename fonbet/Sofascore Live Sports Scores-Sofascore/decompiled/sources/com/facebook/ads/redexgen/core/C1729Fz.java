package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1729Fz implements InterfaceC2416cs {
    public final /* synthetic */ C1728Fy A00;

    public C1729Fz(C1728Fy c1728Fy) {
        this.A00 = c1728Fy;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2416cs
    public final void AGW(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2416cs
    public final void AGY(View view) {
        AbstractC1813Jg abstractC1813Jg = (AbstractC1813Jg) view;
        abstractC1813Jg.A1T();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC1813Jg.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
