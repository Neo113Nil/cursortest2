package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o0c extends AtomicReference implements w0c, k55 {
    public final w0c a;
    public final bt8 b;
    public k55 c;

    public o0c(w0c w0cVar, bt8 bt8Var) {
        this.a = w0cVar;
        this.b = bt8Var;
    }

    @Override // defpackage.w0c
    public final void a(k55 k55Var) {
        if (r55.f(this.c, k55Var)) {
            this.c = k55Var;
            this.a.a(this);
        }
    }

    @Override // defpackage.k55
    public final void d() {
        r55.a(this);
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

    @Override // defpackage.w0c
    public final void onSuccess(Object obj) {
        try {
            Object apply = this.b.apply(obj);
            rha.x(apply, "The mapper returned a null MaybeSource");
            g0c g0cVar = (g0c) apply;
            if (r55.b((k55) get())) {
                return;
            }
            g0cVar.b(new cqa(this));
        } catch (Exception e) {
            td4.w0(e);
            this.a.onError(e);
        }
    }
}
