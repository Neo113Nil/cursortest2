package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.flow.c0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t implements Runnable {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ com.fyber.inneractive.sdk.config.global.r b;
    public final /* synthetic */ y c;

    public t(y yVar, c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.c = yVar;
        this.a = c0Var;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.a, this.b);
    }
}
