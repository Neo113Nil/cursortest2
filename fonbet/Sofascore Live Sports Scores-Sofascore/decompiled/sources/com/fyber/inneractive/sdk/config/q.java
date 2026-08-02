package com.fyber.inneractive.sdk.config;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class q implements Runnable {
    public final /* synthetic */ s a;

    public q(s sVar) {
        this.a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.a;
        Iterator it = sVar.c.iterator();
        while (it.hasNext()) {
            ((r) it.next()).onGlobalConfigChanged(sVar, sVar.b);
        }
    }
}
