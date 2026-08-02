package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rb8 extends pb8 {
    public final ed8 m;
    public final AtomicInteger n;

    public rb8(ed8 ed8Var, pw9 pw9Var) {
        super(pw9Var);
        this.m = ed8Var;
        this.n = new AtomicInteger();
    }

    @Override // defpackage.iki
    public final void cancel() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.a.cancel();
        this.e.cancel();
    }

    @Override // defpackage.pb8
    public final void d() {
        if (this.n.getAndIncrement() == 0) {
            while (!this.i) {
                if (!this.k) {
                    boolean z = this.h;
                    try {
                        Object poll = this.g.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            this.m.onComplete();
                            return;
                        }
                        if (!z2) {
                            try {
                                Object apply = this.b.apply(poll);
                                rha.x(apply, "The mapper returned a null Publisher");
                                xgf xgfVar = (xgf) apply;
                                if (this.l != 1) {
                                    int i = this.f + 1;
                                    if (i == this.d) {
                                        this.f = 0;
                                        this.e.request(i);
                                    } else {
                                        this.f = i;
                                    }
                                }
                                if (xgfVar instanceof Callable) {
                                    try {
                                        Object call = ((Callable) xgfVar).call();
                                        if (call == null) {
                                            continue;
                                        } else if (!this.a.g) {
                                            this.k = true;
                                            this.a.i(new tb8(this.a, call));
                                        } else if (get() == 0 && compareAndSet(0, 1)) {
                                            this.m.onNext(call);
                                            if (!compareAndSet(1, 0)) {
                                                ed8 ed8Var = this.m;
                                                fm0 fm0Var = this.j;
                                                fm0Var.getClass();
                                                ed8Var.onError(be6.b(fm0Var));
                                                return;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        td4.w0(th);
                                        this.e.cancel();
                                        fm0 fm0Var2 = this.j;
                                        fm0Var2.getClass();
                                        be6.a(fm0Var2, th);
                                        ed8 ed8Var2 = this.m;
                                        fm0 fm0Var3 = this.j;
                                        fm0Var3.getClass();
                                        ed8Var2.onError(be6.b(fm0Var3));
                                        return;
                                    }
                                } else {
                                    this.k = true;
                                    xgfVar.a(this.a);
                                }
                            } catch (Throwable th2) {
                                td4.w0(th2);
                                this.e.cancel();
                                fm0 fm0Var4 = this.j;
                                fm0Var4.getClass();
                                be6.a(fm0Var4, th2);
                                ed8 ed8Var3 = this.m;
                                fm0 fm0Var5 = this.j;
                                fm0Var5.getClass();
                                ed8Var3.onError(be6.b(fm0Var5));
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        td4.w0(th3);
                        this.e.cancel();
                        fm0 fm0Var6 = this.j;
                        fm0Var6.getClass();
                        be6.a(fm0Var6, th3);
                        ed8 ed8Var4 = this.m;
                        fm0 fm0Var7 = this.j;
                        fm0Var7.getClass();
                        ed8Var4.onError(be6.b(fm0Var7));
                        return;
                    }
                }
                if (this.n.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.pb8
    public final void f(Throwable th) {
        fm0 fm0Var = this.j;
        fm0Var.getClass();
        if (!be6.a(fm0Var, th)) {
            hda.L(th);
            return;
        }
        this.e.cancel();
        if (getAndIncrement() == 0) {
            this.m.onError(be6.b(fm0Var));
        }
    }

    @Override // defpackage.pb8
    public final void g(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            ed8 ed8Var = this.m;
            ed8Var.onNext(obj);
            if (compareAndSet(1, 0)) {
                return;
            }
            fm0 fm0Var = this.j;
            fm0Var.getClass();
            ed8Var.onError(be6.b(fm0Var));
        }
    }

    @Override // defpackage.pb8
    public final void h() {
        this.m.b(this);
    }

    @Override // defpackage.ed8
    public final void onError(Throwable th) {
        fm0 fm0Var = this.j;
        fm0Var.getClass();
        if (!be6.a(fm0Var, th)) {
            hda.L(th);
            return;
        }
        this.a.cancel();
        if (getAndIncrement() == 0) {
            fm0Var.getClass();
            this.m.onError(be6.b(fm0Var));
        }
    }

    @Override // defpackage.iki
    public final void request(long j) {
        this.a.request(j);
    }
}
