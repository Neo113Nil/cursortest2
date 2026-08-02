package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a0 implements Runnable {
    public final /* synthetic */ b0 a;

    public a0(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.a;
        b0Var.getClass();
        IAlog.a("%sRe-enabling clicks, grace period has passed", IAlog.a(b0Var));
        b0 b0Var2 = this.a;
        b0Var2.f = true;
        b0Var2.g = null;
    }
}
