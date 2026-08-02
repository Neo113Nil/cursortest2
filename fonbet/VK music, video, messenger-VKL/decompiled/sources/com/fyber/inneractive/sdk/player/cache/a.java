package com.fyber.inneractive.sdk.player.cache;

import java.util.concurrent.Callable;

/* loaded from: classes12.dex */
public final class a implements Callable {
    public final /* synthetic */ g a;

    public a(g gVar) {
        this.a = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.a) {
            try {
                g gVar = this.a;
                if (gVar.i == null) {
                    return null;
                }
                gVar.d();
                g gVar2 = this.a;
                int i = gVar2.k;
                if (i >= 2000 && i >= gVar2.j.size()) {
                    this.a.c();
                    this.a.k = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
