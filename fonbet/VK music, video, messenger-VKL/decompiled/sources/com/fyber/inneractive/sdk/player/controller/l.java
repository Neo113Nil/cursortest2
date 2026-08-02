package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public l(q qVar, int i) {
        this.b = qVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.b.c.iterator();
            while (it.hasNext()) {
                ((o) it.next()).a(this.a);
            }
        } catch (Exception e) {
            if (IAlog.a <= 3) {
                q qVar = this.b;
                qVar.getClass();
                IAlog.a("%sonPlayerProgress callback threw an exception!", e, IAlog.a(qVar));
            }
        }
    }
}
