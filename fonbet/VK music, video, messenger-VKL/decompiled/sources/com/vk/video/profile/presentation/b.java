package com.vk.video.profile.presentation;

import com.vk.log.L;
import xsna.b3k0;
import xsna.fxc0;
import xsna.gzs;
import xsna.qlb0;
import xsna.s3q0;
import xsna.x1o0;

/* compiled from: VideoProfileFeature.kt */
/* loaded from: classes6.dex */
public final class b implements b3k0 {
    public final long a;
    public final x1o0 b;
    public final com.vk.movika.sdk.base.logic.processor.actions.e c;

    public b(c cVar) {
        Long l = fxc0.B().J().e0().c;
        if (l != null) {
            L.e("VideoSlowNetworkHandler", qlb0.a(l.longValue(), "Received time from the toggle = ", " seconds"));
        } else {
            l = null;
        }
        this.a = l != null ? l.longValue() : 10L;
        this.b = x1o0.e;
        this.c = new com.vk.movika.sdk.base.logic.processor.actions.e(25, this, cVar);
    }

    @Override // xsna.b3k0
    public final long a() {
        return this.a;
    }

    @Override // xsna.b3k0
    public final gzs<s3q0> b() {
        return this.c;
    }
}
