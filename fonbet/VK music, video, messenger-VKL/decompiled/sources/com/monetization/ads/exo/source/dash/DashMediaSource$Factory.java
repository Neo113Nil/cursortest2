package com.monetization.ads.exo.source.dash;

import java.util.List;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import yads.a30;
import yads.ae0;
import yads.e30;
import yads.fv0;
import yads.gn1;
import yads.hc0;
import yads.hd0;
import yads.kc0;
import yads.mo;
import yads.ni;
import yads.o30;
import yads.yn1;

/* loaded from: classes14.dex */
public final class DashMediaSource$Factory implements yn1 {
    private final a30 a;
    private final o30 b;
    private hd0 c;
    private final hc0 d;
    private ae0 e;
    private final long f;

    public DashMediaSource$Factory(o30 o30Var) {
        this(new kc0(o30Var), o30Var);
    }

    @Override // yads.yn1
    public final mo a(gn1 gn1Var) {
        gn1Var.c.getClass();
        e30 e30Var = new e30();
        List list = gn1Var.c.d;
        return new i(gn1Var, this.b, !list.isEmpty() ? new fv0(e30Var, list) : e30Var, this.a, this.d, this.c.a(gn1Var), this.e, this.f);
    }

    public DashMediaSource$Factory(kc0 kc0Var, o30 o30Var) {
        this.a = (a30) ni.a(kc0Var);
        this.b = o30Var;
        this.c = new hd0();
        this.e = new ae0();
        this.f = ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS;
        this.d = new hc0();
    }

    @Override // yads.yn1
    public final yn1 a(hd0 hd0Var) {
        if (hd0Var != null) {
            this.c = hd0Var;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // yads.yn1
    public final yn1 a(ae0 ae0Var) {
        if (ae0Var != null) {
            this.e = ae0Var;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }
}
