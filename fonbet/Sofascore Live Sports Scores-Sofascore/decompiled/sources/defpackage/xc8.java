package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xc8 extends ao1 implements ed8 {
    public final ed8 a;
    public final mhh b;
    public iki c;
    public volatile boolean d;
    public volatile boolean e;
    public Throwable f;
    public final AtomicLong g = new AtomicLong();
    public boolean h;

    public xc8(ed8 ed8Var, int i) {
        this.a = ed8Var;
        this.b = new i0i(i);
    }

    @Override // defpackage.ed8
    public final void b(iki ikiVar) {
        if (pki.d(this.c, ikiVar)) {
            this.c = ikiVar;
            this.a.b(this);
            ikiVar.request(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.zif
    public final int c(int i) {
        this.h = true;
        return 2;
    }

    @Override // defpackage.iki
    public final void cancel() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.cancel();
        if (this.h || getAndIncrement() != 0) {
            return;
        }
        this.b.clear();
    }

    @Override // defpackage.ohh
    public final void clear() {
        this.b.clear();
    }

    public final boolean d(boolean z, boolean z2, ed8 ed8Var) {
        if (this.d) {
            this.b.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.f;
        if (th != null) {
            this.b.clear();
            ed8Var.onError(th);
            return true;
        }
        if (!z2) {
            return false;
        }
        ed8Var.onComplete();
        return true;
    }

    public final void g() {
        if (getAndIncrement() == 0) {
            mhh mhhVar = this.b;
            ed8 ed8Var = this.a;
            int i = 1;
            while (!d(this.e, mhhVar.isEmpty(), ed8Var)) {
                long j = this.g.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.e;
                    Object poll = mhhVar.poll();
                    boolean z2 = poll == null;
                    if (d(z, z2, ed8Var)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    ed8Var.onNext(poll);
                    j2++;
                }
                if (j2 == j && d(this.e, mhhVar.isEmpty(), ed8Var)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.g.addAndGet(-j2);
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.ohh
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // defpackage.ed8
    public final void onComplete() {
        this.e = true;
        if (this.h) {
            this.a.onComplete();
        } else {
            g();
        }
    }

    @Override // defpackage.ed8
    public final void onError(Throwable th) {
        this.f = th;
        this.e = true;
        if (this.h) {
            this.a.onError(th);
        } else {
            g();
        }
    }

    @Override // defpackage.ed8
    public final void onNext(Object obj) {
        if (!this.b.offer(obj)) {
            this.c.cancel();
            onError(new qkc("Buffer is full"));
        } else if (this.h) {
            this.a.onNext(null);
        } else {
            g();
        }
    }

    @Override // defpackage.ohh
    public final Object poll() {
        return this.b.poll();
    }

    @Override // defpackage.iki
    public final void request(long j) {
        if (this.h || !pki.c(j)) {
            return;
        }
        wkn.n(this.g, j);
        g();
    }
}
