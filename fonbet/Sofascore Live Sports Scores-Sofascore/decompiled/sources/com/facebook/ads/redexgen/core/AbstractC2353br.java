package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.br, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2353br {
    public static final int A00 = YB.A00();

    public static void A00(C2652gi c2652gi, ViewGroup viewGroup, String str) {
        new LM(viewGroup, c2652gi).A07(str);
        View view = new View(c2652gi);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        YB.A0U(view, c2652gi);
        viewGroup.addView(view, 0);
    }
}
