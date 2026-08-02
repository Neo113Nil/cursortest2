package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.0n, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C0n extends C0q {
    @Override // com.instagram.common.viewpoint.core.C1011Pg
    public final C1026Py A07(View view, C1026Py c1026Py) {
        WindowInsets result = (WindowInsets) C1026Py.A01(c1026Py);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C1026Py.A00(result);
    }

    @Override // com.instagram.common.viewpoint.core.C1011Pg
    public final C1026Py A08(View view, C1026Py c1026Py) {
        WindowInsets result = (WindowInsets) C1026Py.A01(c1026Py);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C1026Py.A00(result);
    }

    @Override // com.instagram.common.viewpoint.core.C1011Pg
    public final void A0A(View view) {
        view.stopNestedScroll();
    }

    @Override // com.instagram.common.viewpoint.core.C1011Pg
    public final void A0E(View view, PR pr) {
        if (pr == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC1010Pf(this, pr));
        }
    }
}
