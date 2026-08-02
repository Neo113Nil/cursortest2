package com.vk.video.ui.discovery.minimizable;

import com.vk.log.L;
import xsna.b3k0;
import xsna.fxc0;
import xsna.gzs;
import xsna.mh3;
import xsna.qlb0;
import xsna.s3q0;
import xsna.x1o0;

/* compiled from: VideoMinimizableDiscoveryFeature.kt */
/* loaded from: classes7.dex */
public final class h implements b3k0 {
    public final long a;
    public final x1o0 b;
    public final mh3 c;

    public h(g gVar) {
        Long l = fxc0.B().J().e0().c;
        if (l != null) {
            L.e("VideoSlowNetworkHandler", qlb0.a(l.longValue(), "Received time from the toggle = ", " seconds"));
        } else {
            l = null;
        }
        this.a = l != null ? l.longValue() : 10L;
        this.b = x1o0.e;
        this.c = new mh3(29, this, gVar);
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
