package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.0n, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C0n extends C0q {
    @Override // com.facebook.ads.redexgen.core.C1968Pg
    public final C1983Py A07(View view, C1983Py c1983Py) {
        WindowInsets result = (WindowInsets) C1983Py.A01(c1983Py);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C1983Py.A00(result);
    }

    @Override // com.facebook.ads.redexgen.core.C1968Pg
    public final C1983Py A08(View view, C1983Py c1983Py) {
        WindowInsets result = (WindowInsets) C1983Py.A01(c1983Py);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C1983Py.A00(result);
    }

    @Override // com.facebook.ads.redexgen.core.C1968Pg
    public final void A0A(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.core.C1968Pg
    public final void A0E(View view, PR pr) {
        if (pr == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC1967Pf(this, pr));
        }
    }
}
