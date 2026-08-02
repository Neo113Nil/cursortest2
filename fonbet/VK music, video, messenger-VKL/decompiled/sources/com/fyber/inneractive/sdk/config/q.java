package com.fyber.inneractive.sdk.config;

import java.util.Iterator;

/* loaded from: classes12.dex */
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
