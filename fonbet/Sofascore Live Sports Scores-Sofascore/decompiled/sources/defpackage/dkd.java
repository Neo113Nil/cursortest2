package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dkd implements rkd, k55 {
    public final zhh a;
    public final ih2 b;
    public k55 c;
    public boolean d;

    public dkd(zhh zhhVar, ih2 ih2Var) {
        this.a = zhhVar;
        this.b = ih2Var;
    }

    @Override // defpackage.rkd
    public final void a(k55 k55Var) {
        if (r55.f(this.c, k55Var)) {
            this.c = k55Var;
            this.a.a(this);
        }
    }

    @Override // defpackage.k55
    public final void d() {
        this.c.d();
    }

    @Override // defpackage.rkd
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.onSuccess(Boolean.FALSE);
    }

    @Override // defpackage.rkd
    public final void onError(Throwable th) {
        if (this.d) {
            hda.L(th);
        } else {
            this.d = true;
            this.a.onError(th);
        }
    }

    @Override // defpackage.rkd
    public final void onNext(Object obj) {
        if (this.d) {
            return;
        }
        try {
            if (this.b.test(obj)) {
                this.d = true;
                this.c.d();
                this.a.onSuccess(Boolean.TRUE);
            }
        } catch (Throwable th) {
            td4.w0(th);
            this.c.d();
            onError(th);
        }
    }
}
