package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.c0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class u implements Runnable {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ Exception b;

    public u(c0 c0Var, Exception exc) {
        this.a = c0Var;
        this.b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var = this.a;
        if (c0Var != null) {
            c0Var.a(this.b, InneractiveErrorCode.INVALID_INPUT, new com.fyber.inneractive.sdk.response.e[0]);
        }
    }
}
