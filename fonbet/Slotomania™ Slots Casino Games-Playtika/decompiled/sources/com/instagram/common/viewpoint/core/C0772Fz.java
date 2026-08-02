package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0772Fz implements InterfaceC1459cs {
    public final /* synthetic */ C0771Fy A00;

    public C0772Fz(C0771Fy c0771Fy) {
        this.A00 = c0771Fy;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1459cs
    public final void AGW(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1459cs
    public final void AGY(View view) {
        AbstractC0856Jg abstractC0856Jg = (AbstractC0856Jg) view;
        abstractC0856Jg.A1T();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC0856Jg.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
