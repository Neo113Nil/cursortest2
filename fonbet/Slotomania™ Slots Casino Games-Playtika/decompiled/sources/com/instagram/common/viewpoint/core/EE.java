package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public final class EE implements InterfaceC1580er {
    public final View A00;
    public final C1695gi A01;

    public EE(C1695gi c1695gi, View view) {
        this.A01 = c1695gi;
        this.A00 = view;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1580er
    public final double A9V() {
        C1641fq result = C1640fp.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
