package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class k implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ q b;

    public k(f fVar, boolean z) {
        this.b = fVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.b;
        if (qVar.g) {
            return;
        }
        try {
            Iterator it = qVar.b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).c(this.a);
            }
        } catch (Exception e) {
            if (IAlog.a <= 3) {
                q qVar2 = this.b;
                qVar2.getClass();
                IAlog.a("%sonPlayerError callback threw an exception!", e, IAlog.a(qVar2));
            }
        }
    }
}
