package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vc8 extends tc8 {
    public final ed8 m;

    public vc8(ed8 ed8Var, fsg fsgVar, int i) {
        super(fsgVar, i);
        this.m = ed8Var;
    }

    @Override // defpackage.ed8
    public final void b(iki ikiVar) {
        if (pki.d(this.e, ikiVar)) {
            this.e = ikiVar;
            if (ikiVar instanceof ajf) {
                ajf ajfVar = (ajf) ikiVar;
                int c = ajfVar.c(7);
                if (c == 1) {
                    this.j = 1;
                    this.f = ajfVar;
                    this.h = true;
                    this.m.b(this);
                    return;
                }
                if (c == 2) {
                    this.j = 2;
                    this.f = ajfVar;
                    this.m.b(this);
                    ikiVar.request(this.b);
                    return;
                }
            }
            this.f = new h0i(this.b);
            this.m.b(this);
            ikiVar.request(this.b);
        }
    }

    @Override // defpackage.tc8
    public final void g() {
        ed8 ed8Var = this.m;
        ohh ohhVar = this.f;
        long j = this.k;
        int i = 1;
        while (true) {
            long j2 = this.d.get();
            while (j != j2) {
                boolean z = this.h;
                try {
                    Object poll = ohhVar.poll();
                    boolean z2 = poll == null;
                    if (d(z, z2, ed8Var)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    ed8Var.onNext(poll);
                    j++;
                    if (j == this.c) {
                        if (j2 != Long.MAX_VALUE) {
                            j2 = this.d.addAndGet(-j);
                        }
                        this.e.request(j);
                        j = 0;
                    }
                } catch (Throwable th) {
                    td4.w0(th);
                    this.g = true;
                    this.e.cancel();
                    ohhVar.clear();
                    ed8Var.onError(th);
                    this.a.d();
                    return;
                }
            }
            if (j == j2 && d(this.h, ohhVar.isEmpty(), ed8Var)) {
                return;
            }
            int i2 = get();
            if (i == i2) {
                this.k = j;
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                i = i2;
            }
        }
    }

    @Override // defpackage.tc8
    public final void h() {
        int i = 1;
        while (!this.g) {
            boolean z = this.h;
            this.m.onNext(null);
            if (z) {
                this.g = true;
                Throwable th = this.i;
                ed8 ed8Var = this.m;
                if (th != null) {
                    ed8Var.onError(th);
                } else {
                    ed8Var.onComplete();
                }
                this.a.d();
                return;
            }
            i = addAndGet(-i);
            if (i == 0) {
                return;
            }
        }
    }

    @Override // defpackage.tc8
    public final void i() {
        ed8 ed8Var = this.m;
        ohh ohhVar = this.f;
        long j = this.k;
        int i = 1;
        while (true) {
            long j2 = this.d.get();
            while (j != j2) {
                try {
                    Object poll = ohhVar.poll();
                    if (this.g) {
                        return;
                    }
                    if (poll == null) {
                        this.g = true;
                        ed8Var.onComplete();
                        this.a.d();
                        return;
                    }
                    ed8Var.onNext(poll);
                    j++;
                } catch (Throwable th) {
                    td4.w0(th);
                    this.g = true;
                    this.e.cancel();
                    ed8Var.onError(th);
                    this.a.d();
                    return;
                }
            }
            if (this.g) {
                return;
            }
            if (ohhVar.isEmpty()) {
                this.g = true;
                ed8Var.onComplete();
                this.a.d();
                return;
            } else {
                int i2 = get();
                if (i == i2) {
                    this.k = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            }
        }
    }

    @Override // defpackage.ohh
    public final Object poll() {
        Object poll = this.f.poll();
        if (poll != null && this.j != 1) {
            long j = this.k + 1;
            if (j == this.c) {
                this.k = 0L;
                this.e.request(j);
                return poll;
            }
            this.k = j;
        }
        return poll;
    }
}
