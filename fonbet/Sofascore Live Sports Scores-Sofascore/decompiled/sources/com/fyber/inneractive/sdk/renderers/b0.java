package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b0 implements Runnable {
    public final /* synthetic */ c0 a;

    public b0(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var = this.a;
        if (c0Var.b != null && !c0Var.m) {
            c0Var.m = true;
            IAlog.a("%sTracking impression", IAlog.a(c0Var));
            com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = new com.fyber.inneractive.sdk.flow.nativead.trackers.a((w0) c0Var.b);
            c0Var.n = aVar;
            aVar.a(c0Var);
        }
        c0Var.E();
    }
}
