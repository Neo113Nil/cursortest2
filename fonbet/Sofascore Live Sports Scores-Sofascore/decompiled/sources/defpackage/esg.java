package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class esg implements k55, Runnable {
    public final Runnable a;
    public final fsg b;
    public Thread c;

    public esg(Runnable runnable, fsg fsgVar) {
        this.a = runnable;
        this.b = fsgVar;
    }

    @Override // defpackage.k55
    public final void d() {
        if (this.c == Thread.currentThread()) {
            fsg fsgVar = this.b;
            if (fsgVar instanceof xbd) {
                xbd xbdVar = (xbd) fsgVar;
                if (xbdVar.b) {
                    return;
                }
                xbdVar.b = true;
                xbdVar.a.shutdown();
                return;
            }
        }
        this.b.d();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
        } finally {
            d();
            this.c = null;
        }
    }
}
