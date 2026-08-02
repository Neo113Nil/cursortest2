package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sb8 extends AtomicInteger implements ed8, iki {
    public iki a;
    public long b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicLong d = new AtomicLong();
    public final AtomicLong e = new AtomicLong();
    public volatile boolean f;
    public boolean g;
    public final pb8 h;
    public long i;

    public sb8(pb8 pb8Var) {
        this.h = pb8Var;
    }

    @Override // defpackage.ed8
    public final void b(iki ikiVar) {
        i(ikiVar);
    }

    @Override // defpackage.iki
    public final void cancel() {
        if (this.f) {
            return;
        }
        this.f = true;
        d();
    }

    public final void d() {
        if (getAndIncrement() != 0) {
            return;
        }
        g();
    }

    public final void g() {
        int i = 1;
        long j = 0;
        iki ikiVar = null;
        do {
            iki ikiVar2 = (iki) this.c.get();
            if (ikiVar2 != null) {
                ikiVar2 = (iki) this.c.getAndSet(null);
            }
            long j2 = this.d.get();
            if (j2 != 0) {
                j2 = this.d.getAndSet(0L);
            }
            long j3 = this.e.get();
            if (j3 != 0) {
                j3 = this.e.getAndSet(0L);
            }
            iki ikiVar3 = this.a;
            if (this.f) {
                if (ikiVar3 != null) {
                    ikiVar3.cancel();
                    this.a = null;
                }
                if (ikiVar2 != null) {
                    ikiVar2.cancel();
                }
            } else {
                long j4 = this.b;
                if (j4 != Long.MAX_VALUE) {
                    j4 = wkn.o(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            hda.L(new kx2(vxd.l(j4, "More produced than requested: "), 5));
                            j4 = 0;
                        }
                    }
                    this.b = j4;
                }
                if (ikiVar2 != null) {
                    this.a = ikiVar2;
                    if (j4 != 0) {
                        j = wkn.o(j, j4);
                        ikiVar = ikiVar2;
                    }
                } else if (ikiVar3 != null && j2 != 0) {
                    j = wkn.o(j, j2);
                    ikiVar = ikiVar3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            ikiVar.request(j);
        }
    }

    public final void h(long j) {
        if (this.g) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            wkn.n(this.e, j);
            d();
            return;
        }
        long j2 = this.b;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - j;
            if (j3 < 0) {
                hda.L(new kx2(vxd.l(j3, "More produced than requested: "), 5));
                j3 = 0;
            }
            this.b = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        g();
    }

    public final void i(iki ikiVar) {
        if (this.f) {
            ikiVar.cancel();
            return;
        }
        rha.x(ikiVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            d();
            return;
        }
        this.a = ikiVar;
        long j = this.b;
        if (decrementAndGet() != 0) {
            g();
        }
        if (j != 0) {
            ikiVar.request(j);
        }
    }

    @Override // defpackage.ed8
    public final void onComplete() {
        long j = this.i;
        if (j != 0) {
            this.i = 0L;
            h(j);
        }
        pb8 pb8Var = this.h;
        pb8Var.k = false;
        pb8Var.d();
    }

    @Override // defpackage.ed8
    public final void onError(Throwable th) {
        long j = this.i;
        if (j != 0) {
            this.i = 0L;
            h(j);
        }
        this.h.f(th);
    }

    @Override // defpackage.ed8
    public final void onNext(Object obj) {
        this.i++;
        this.h.g(obj);
    }

    @Override // defpackage.iki
    public final void request(long j) {
        if (!pki.c(j) || this.g) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            wkn.n(this.d, j);
            d();
            return;
        }
        long j2 = this.b;
        if (j2 != Long.MAX_VALUE) {
            long o = wkn.o(j2, j);
            this.b = o;
            if (o == Long.MAX_VALUE) {
                this.g = true;
            }
        }
        iki ikiVar = this.a;
        if (decrementAndGet() != 0) {
            g();
        }
        if (ikiVar != null) {
            ikiVar.request(j);
        }
    }
}
