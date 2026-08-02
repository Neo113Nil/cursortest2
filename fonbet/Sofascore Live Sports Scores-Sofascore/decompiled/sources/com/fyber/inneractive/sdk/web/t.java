package com.fyber.inneractive.sdk.web;

import android.window.OnBackInvokedCallback;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t implements OnBackInvokedCallback {
    public final /* synthetic */ i0 a;

    public t(i0 i0Var) {
        this.a = i0Var;
    }

    public final void onBackInvoked() {
        i0 i0Var = this.a;
        if (i0Var.p()) {
            IAlog.e("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
            i0Var.o();
        }
    }
}
