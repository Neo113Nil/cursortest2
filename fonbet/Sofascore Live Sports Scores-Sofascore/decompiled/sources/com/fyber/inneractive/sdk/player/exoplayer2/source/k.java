package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k implements Runnable {
    public final /* synthetic */ n a;
    public final /* synthetic */ p b;

    public k(p pVar, n nVar) {
        this.b = pVar;
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.a;
        if (nVar.c != null) {
            nVar.c = null;
        }
        int size = this.b.o.size();
        for (int i = 0; i < size; i++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.b.o.valueAt(i)).b();
        }
    }
}
