package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class upd {
    public final Runnable a;
    public final mqi b = ypa.b(new xxb(this, 19));

    public upd(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(u6b u6bVar, ppd ppdVar) {
        u6bVar.getClass();
        ppdVar.getClass();
        final g6b lifecycle = u6bVar.getLifecycle();
        if (lifecycle.b() == e6b.a) {
            return;
        }
        opd opdVar = new opd(ppdVar, new qpd(u6bVar, ppdVar));
        ppdVar.a.add(opdVar);
        opdVar.h(false);
        f8d.a(b().c, opdVar);
        final tq4 tq4Var = new tq4(opdVar, this, lifecycle);
        lifecycle.a(tq4Var);
        ppdVar.c.add(new AutoCloseable() { // from class: rpd
            @Override // java.lang.AutoCloseable
            public final void close() {
                g6b.this.d(tq4Var);
            }
        });
    }

    public final spd b() {
        return (spd) this.b.getValue();
    }

    public final void c() {
        b().a();
    }

    public final void d(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        onBackInvokedDispatcher.getClass();
        b().c.c(new lpd(onBackInvokedDispatcher, 0), 1);
        b().c.c(new lpd(onBackInvokedDispatcher, 1000000), 0);
    }
}
