package com.playtika.pras.d;

import org.json.JSONArray;

/* loaded from: classes8.dex */
public final class e implements Runnable {
    public final /* synthetic */ g a;

    public e(g gVar) {
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.a;
        gVar.f = false;
        gVar.d.removeCallbacksAndMessages(null);
        c a = gVar.a();
        if (a != null) {
            gVar.b = new JSONArray();
            i iVar = gVar.a;
            iVar.b.execute(new h(iVar, a, gVar.c));
        }
    }
}
