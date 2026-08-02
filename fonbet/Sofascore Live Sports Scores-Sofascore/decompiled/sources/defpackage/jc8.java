package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jc8 extends AtomicReference implements ed8, k55 {
    public final long a;
    public final kc8 b;
    public final int c;
    public final int d;
    public volatile boolean e;
    public volatile ohh f;
    public long g;
    public int h;

    public jc8(kc8 kc8Var, long j) {
        this.a = j;
        this.b = kc8Var;
        int i = kc8Var.b;
        this.d = i;
        this.c = i >> 2;
    }

    public final void a(long j) {
        if (this.h != 1) {
            long j2 = this.g + j;
            if (j2 < this.c) {
                this.g = j2;
            } else {
                this.g = 0L;
                ((iki) get()).request(j2);
            }
        }
    }

    @Override // defpackage.ed8
    public final void b(iki ikiVar) {
        if (pki.b(this, ikiVar)) {
            if (ikiVar instanceof ajf) {
                ajf ajfVar = (ajf) ikiVar;
                int c = ajfVar.c(7);
                if (c == 1) {
                    this.h = c;
                    this.f = ajfVar;
                    this.e = true;
                    this.b.g();
                    return;
                }
                if (c == 2) {
                    this.h = c;
                    this.f = ajfVar;
                }
            }
            ikiVar.request(this.d);
        }
    }

    @Override // defpackage.k55
    public final void d() {
        pki.a(this);
    }

    @Override // defpackage.ed8
    public final void onComplete() {
        this.e = true;
        this.b.g();
    }

    @Override // defpackage.ed8
    public final void onError(Throwable th) {
        lazySet(pki.a);
        kc8 kc8Var = this.b;
        if (!be6.a(kc8Var.e, th)) {
            hda.L(th);
            return;
        }
        this.e = true;
        kc8Var.i.cancel();
        for (jc8 jc8Var : (jc8[]) kc8Var.g.getAndSet(kc8.p)) {
            jc8Var.getClass();
            pki.a(jc8Var);
        }
        kc8Var.g();
    }

    @Override // defpackage.ed8
    public final void onNext(Object obj) {
        int i = this.h;
        kc8 kc8Var = this.b;
        if (i == 2) {
            kc8Var.g();
            return;
        }
        if (kc8Var.get() == 0 && kc8Var.compareAndSet(0, 1)) {
            long j = kc8Var.h.get();
            ohh ohhVar = this.f;
            if (j == 0 || !(ohhVar == null || ohhVar.isEmpty())) {
                if (ohhVar == null && (ohhVar = this.f) == null) {
                    ohhVar = new h0i(kc8Var.b);
                    this.f = ohhVar;
                }
                if (!ohhVar.offer(obj)) {
                    kc8Var.onError(new qkc("Inner queue full?!"));
                    return;
                }
            } else {
                kc8Var.a.onNext(obj);
                if (j != Long.MAX_VALUE) {
                    kc8Var.h.decrementAndGet();
                }
                a(1L);
            }
            if (kc8Var.decrementAndGet() == 0) {
                return;
            }
        } else {
            ohh ohhVar2 = this.f;
            if (ohhVar2 == null) {
                ohhVar2 = new h0i(kc8Var.b);
                this.f = ohhVar2;
            }
            if (!ohhVar2.offer(obj)) {
                kc8Var.onError(new qkc("Inner queue full?!"));
                return;
            } else if (kc8Var.getAndIncrement() != 0) {
                return;
            }
        }
        kc8Var.h();
    }
}
