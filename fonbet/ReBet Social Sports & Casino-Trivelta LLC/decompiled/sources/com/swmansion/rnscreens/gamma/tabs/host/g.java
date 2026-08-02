package com.swmansion.rnscreens.gamma.tabs.host;

import com.facebook.react.bridge.ReactContext;
import com.swmansion.rnscreens.gamma.tabs.container.k;
import com.swmansion.rnscreens.gamma.tabs.container.q;
import com.swmansion.rnscreens.gamma.tabs.container.r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends Pc.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ReactContext reactContext, int i10) {
        super(reactContext, i10);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    public final void h(String selectedScreenKey, int i10, boolean z10, boolean z11, com.swmansion.rnscreens.gamma.tabs.container.b actionOrigin) {
        Intrinsics.checkNotNullParameter(selectedScreenKey, "selectedScreenKey");
        Intrinsics.checkNotNullParameter(actionOrigin, "actionOrigin");
        e().dispatchEvent(new Xc.a(f(), g(), selectedScreenKey, i10, z10, z11, actionOrigin));
    }

    public final void i(k currentNavState, String preventedScreenKey) {
        Intrinsics.checkNotNullParameter(currentNavState, "currentNavState");
        Intrinsics.checkNotNullParameter(preventedScreenKey, "preventedScreenKey");
        e().dispatchEvent(new Xc.b(f(), g(), currentNavState, preventedScreenKey));
    }

    public final void j(k currentNavState, r rejectedRequest, q rejectionReason) {
        Intrinsics.checkNotNullParameter(currentNavState, "currentNavState");
        Intrinsics.checkNotNullParameter(rejectedRequest, "rejectedRequest");
        Intrinsics.checkNotNullParameter(rejectionReason, "rejectionReason");
        e().dispatchEvent(new Xc.c(f(), g(), currentNavState, rejectedRequest, rejectionReason));
    }
}
