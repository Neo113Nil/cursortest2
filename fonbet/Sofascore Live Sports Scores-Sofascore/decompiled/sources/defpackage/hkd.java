package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hkd extends AtomicInteger implements k55, rkd {
    public final ya3 a;
    public final ymf c;
    public k55 e;
    public volatile boolean f;
    public final fm0 b = new fm0();
    public final vf3 d = new vf3(0);

    public hkd(ya3 ya3Var, ymf ymfVar) {
        this.a = ya3Var;
        this.c = ymfVar;
        lazySet(1);
    }

    @Override // defpackage.rkd
    public final void a(k55 k55Var) {
        if (r55.f(this.e, k55Var)) {
            this.e = k55Var;
            this.a.a(this);
        }
    }

    @Override // defpackage.k55
    public final void d() {
        this.f = true;
        this.e.d();
        this.d.d();
    }

    @Override // defpackage.rkd
    public final void onComplete() {
        if (decrementAndGet() == 0) {
            fm0 fm0Var = this.b;
            fm0Var.getClass();
            Throwable b = be6.b(fm0Var);
            ya3 ya3Var = this.a;
            if (b != null) {
                ya3Var.onError(b);
            } else {
                ya3Var.onComplete();
            }
        }
    }

    @Override // defpackage.rkd
    public final void onError(Throwable th) {
        fm0 fm0Var = this.b;
        fm0Var.getClass();
        if (!be6.a(fm0Var, th)) {
            hda.L(th);
            return;
        }
        d();
        if (getAndSet(0) > 0) {
            this.a.onError(be6.b(fm0Var));
        }
    }

    @Override // defpackage.rkd
    public final void onNext(Object obj) {
        try {
            ma3 ma3Var = (ma3) this.c.apply(obj);
            getAndIncrement();
            h0c h0cVar = new h0c(this, 2);
            if (this.f || !this.d.a(h0cVar)) {
                return;
            }
            ma3Var.c(h0cVar);
        } catch (Throwable th) {
            td4.w0(th);
            this.e.d();
            onError(th);
        }
    }
}
