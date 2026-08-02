package com.unity3d.ads.core.domain;

import xsna.gzs;
import xsna.myc0;
import xsna.ovj;
import xsna.s3q0;
import xsna.zvj;

/* compiled from: CommonSafeCallbackInvoke.kt */
/* loaded from: classes14.dex */
public final class CommonSafeCallbackInvoke implements SafeCallbackInvoke {
    private final ovj mainDispatcher;

    public CommonSafeCallbackInvoke(ovj ovjVar) {
        this.mainDispatcher = ovjVar;
    }

    @Override // com.unity3d.ads.core.domain.SafeCallbackInvoke
    public void invoke(gzs<s3q0> gzsVar) {
        myc0.h(zvj.a(this.mainDispatcher), null, null, new CommonSafeCallbackInvoke$invoke$1(gzsVar, null), 3);
    }
}
