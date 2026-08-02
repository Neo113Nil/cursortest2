package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y0c extends dv4 implements w0c {
    public k55 c;

    @Override // defpackage.w0c
    public final void a(k55 k55Var) {
        if (r55.f(this.c, k55Var)) {
            this.c = k55Var;
            this.a.b(this);
        }
    }

    @Override // defpackage.iki
    public final void cancel() {
        set(4);
        this.b = null;
        this.c.d();
    }

    @Override // defpackage.w0c
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override // defpackage.w0c
    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
