package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1539eB implements WS {
    @Override // com.instagram.common.viewpoint.core.WS
    public final void AIZ(Throwable th, Object obj) {
        if (obj instanceof T4) {
            C1695gi adContext = ((T4) obj).A6m();
            if (adContext != null) {
                adContext.A0Q(th);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C1695gi)) {
            return;
        }
        ((C1695gi) context).A0Q(th);
    }
}
