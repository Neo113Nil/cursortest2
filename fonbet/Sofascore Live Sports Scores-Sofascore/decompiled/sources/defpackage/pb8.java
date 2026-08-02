package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class pb8 extends AtomicInteger implements ed8, iki {
    public final pw9 b;
    public iki e;
    public int f;
    public ohh g;
    public volatile boolean h;
    public volatile boolean i;
    public volatile boolean k;
    public int l;
    public final int c = 2;
    public final int d = 2;
    public final sb8 a = new sb8(this);
    public final fm0 j = new fm0();

    public pb8(pw9 pw9Var) {
        this.b = pw9Var;
    }

    @Override // defpackage.ed8
    public final void b(iki ikiVar) {
        if (pki.d(this.e, ikiVar)) {
            this.e = ikiVar;
            if (ikiVar instanceof ajf) {
                ajf ajfVar = (ajf) ikiVar;
                int c = ajfVar.c(7);
                if (c == 1) {
                    this.l = c;
                    this.g = ajfVar;
                    this.h = true;
                    h();
                    d();
                    return;
                }
                if (c == 2) {
                    this.l = c;
                    this.g = ajfVar;
                    h();
                    ikiVar.request(this.c);
                    return;
                }
            }
            this.g = new h0i(this.c);
            h();
            ikiVar.request(this.c);
        }
    }

    public abstract void d();

    public abstract void f(Throwable th);

    public abstract void g(Object obj);

    public abstract void h();

    @Override // defpackage.ed8
    public final void onComplete() {
        this.h = true;
        d();
    }

    @Override // defpackage.ed8
    public final void onNext(Object obj) {
        if (this.l == 2 || this.g.offer(obj)) {
            d();
        } else {
            this.e.cancel();
            onError(new IllegalStateException("Queue full?!"));
        }
    }
}
