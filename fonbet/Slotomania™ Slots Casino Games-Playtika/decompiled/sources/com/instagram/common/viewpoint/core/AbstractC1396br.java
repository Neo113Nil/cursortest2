package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.br, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1396br {
    public static final int A00 = YB.A00();

    public static void A00(C1695gi c1695gi, ViewGroup viewGroup, String str) {
        new LM(viewGroup, c1695gi).A07(str);
        View view = new View(c1695gi);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        YB.A0U(view, c1695gi);
        viewGroup.addView(view, 0);
    }
}
