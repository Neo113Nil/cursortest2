package com.fyber.inneractive.sdk.player.ui;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k implements Runnable {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar = this.a;
        int i = lVar.k;
        if (i != 0) {
            int i2 = (lVar.j / i) + lVar.F;
            lVar.F = i2;
            lVar.a(i2);
        }
        l lVar2 = this.a;
        if (lVar2.F < lVar2.G) {
            lVar2.postDelayed(lVar2.E, lVar2.l);
            return;
        }
        lVar2.E = null;
        lVar2.F = 0;
        lVar2.G = 0;
    }
}
