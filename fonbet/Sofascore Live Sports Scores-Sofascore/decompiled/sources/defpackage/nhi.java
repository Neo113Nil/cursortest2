package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nhi extends AtomicInteger implements ed8, iki {
    public final ed8 a;
    public final fm0 b = new fm0();
    public final AtomicLong c = new AtomicLong();
    public final AtomicReference d = new AtomicReference();
    public final AtomicBoolean e = new AtomicBoolean();
    public volatile boolean f;

    public nhi(ed8 ed8Var) {
        this.a = ed8Var;
    }

    @Override // defpackage.ed8
    public final void b(iki ikiVar) {
        if (!this.e.compareAndSet(false, true)) {
            ikiVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
            return;
        }
        this.a.b(this);
        if (pki.b(this.d, ikiVar)) {
            long andSet = this.c.getAndSet(0L);
            if (andSet != 0) {
                ikiVar.request(andSet);
            }
        }
    }

    @Override // defpackage.iki
    public final void cancel() {
        if (this.f) {
            return;
        }
        pki.a(this.d);
    }

    @Override // defpackage.ed8
    public final void onComplete() {
        this.f = true;
        ed8 ed8Var = this.a;
        fm0 fm0Var = this.b;
        if (getAndIncrement() == 0) {
            Throwable b = be6.b(fm0Var);
            if (b != null) {
                ed8Var.onError(b);
            } else {
                ed8Var.onComplete();
            }
        }
    }

    @Override // defpackage.ed8
    public final void onError(Throwable th) {
        this.f = true;
        ed8 ed8Var = this.a;
        fm0 fm0Var = this.b;
        if (!be6.a(fm0Var, th)) {
            hda.L(th);
        } else if (getAndIncrement() == 0) {
            ed8Var.onError(be6.b(fm0Var));
        }
    }

    @Override // defpackage.ed8
    public final void onNext(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            ed8 ed8Var = this.a;
            ed8Var.onNext(obj);
            if (decrementAndGet() != 0) {
                Throwable b = be6.b(this.b);
                if (b != null) {
                    ed8Var.onError(b);
                } else {
                    ed8Var.onComplete();
                }
            }
        }
    }

    @Override // defpackage.iki
    public final void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException(vxd.l(j, "§3.9 violated: positive request amount required but it was ")));
            return;
        }
        AtomicReference atomicReference = this.d;
        iki ikiVar = (iki) atomicReference.get();
        if (ikiVar != null) {
            ikiVar.request(j);
            return;
        }
        if (pki.c(j)) {
            AtomicLong atomicLong = this.c;
            wkn.n(atomicLong, j);
            iki ikiVar2 = (iki) atomicReference.get();
            if (ikiVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    ikiVar2.request(andSet);
                }
            }
        }
    }
}
