package com.playtika.pras.d;

/* loaded from: classes8.dex */
public final class f implements Runnable {
    public final /* synthetic */ g a;

    public f(g gVar) {
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.a;
        synchronized (gVar) {
            gVar.i = false;
            gVar.g.removeCallbacksAndMessages(null);
            c a = gVar.a();
            if (a != null) {
                gVar.j.add(a);
            }
            if (!gVar.j.isEmpty()) {
                c cVar = (c) gVar.j.remove(0);
                if (cVar.b < gVar.n) {
                    i iVar = gVar.a;
                    iVar.b.execute(new h(iVar, cVar, gVar.c));
                }
                if (!gVar.i) {
                    gVar.i = true;
                    gVar.g.postDelayed(gVar.h, gVar.o);
                }
            }
            gVar.c();
        }
    }
}
