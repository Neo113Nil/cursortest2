package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class j0 implements Runnable {
    public final /* synthetic */ t0 a;
    public final /* synthetic */ l0 b;

    public j0(l0 l0Var, t0 t0Var) {
        this.b = l0Var;
        this.a = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.e("retryNetworkRequest pre-execute - %s", this.a.getClass().getName());
        this.b.a(this.a);
    }
}
