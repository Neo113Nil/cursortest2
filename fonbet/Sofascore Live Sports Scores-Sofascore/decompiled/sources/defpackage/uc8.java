package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uc8 extends tc8 {
    public final ai3 m;
    public long n;

    public uc8(ai3 ai3Var, fsg fsgVar, int i) {
        super(fsgVar, i);
        this.m = ai3Var;
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
        ai3 ai3Var = this.m;
        ohh ohhVar = this.f;
        long j = this.k;
        long j2 = this.n;
        int i = 1;
        while (true) {
            long j3 = this.d.get();
            while (j != j3) {
                boolean z = this.h;
                try {
                    Object poll = ohhVar.poll();
                    boolean z2 = poll == null;
                    if (d(z, z2, ai3Var)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    if (ai3Var.e(poll)) {
                        j++;
                    }
                    j2++;
                    if (j2 == this.c) {
                        this.e.request(j2);
                        j2 = 0;
                    }
                } catch (Throwable th) {
                    td4.w0(th);
                    this.g = true;
                    this.e.cancel();
                    ohhVar.clear();
                    ai3Var.onError(th);
                    this.a.d();
                    return;
                }
            }
            if (j == j3 && d(this.h, ohhVar.isEmpty(), ai3Var)) {
                return;
            }
            int i2 = get();
            if (i == i2) {
                this.k = j;
                this.n = j2;
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
                ai3 ai3Var = this.m;
                if (th != null) {
                    ai3Var.onError(th);
                } else {
                    ai3Var.onComplete();
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
        ai3 ai3Var = this.m;
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
                        ai3Var.onComplete();
                        this.a.d();
                        return;
                    } else if (ai3Var.e(poll)) {
                        j++;
                    }
                } catch (Throwable th) {
                    td4.w0(th);
                    this.g = true;
                    this.e.cancel();
                    ai3Var.onError(th);
                    this.a.d();
                    return;
                }
            }
            if (this.g) {
                return;
            }
            if (ohhVar.isEmpty()) {
                this.g = true;
                ai3Var.onComplete();
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
            long j = this.n + 1;
            if (j == this.c) {
                this.n = 0L;
                this.e.request(j);
                return poll;
            }
            this.n = j;
        }
        return poll;
    }
}
