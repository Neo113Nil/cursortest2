package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qb8 extends pb8 {
    public final ed8 m;
    public final boolean n;

    public qb8(ed8 ed8Var, pw9 pw9Var, boolean z) {
        super(pw9Var);
        this.m = ed8Var;
        this.n = z;
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
        Object obj;
        if (getAndIncrement() == 0) {
            while (!this.i) {
                if (!this.k) {
                    boolean z = this.h;
                    if (z && !this.n && ((Throwable) this.j.get()) != null) {
                        ed8 ed8Var = this.m;
                        fm0 fm0Var = this.j;
                        fm0Var.getClass();
                        ed8Var.onError(be6.b(fm0Var));
                        return;
                    }
                    try {
                        Object poll = this.g.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            fm0 fm0Var2 = this.j;
                            fm0Var2.getClass();
                            Throwable b = be6.b(fm0Var2);
                            ed8 ed8Var2 = this.m;
                            if (b != null) {
                                ed8Var2.onError(b);
                                return;
                            } else {
                                ed8Var2.onComplete();
                                return;
                            }
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
                                        obj = ((Callable) xgfVar).call();
                                    } catch (Throwable th) {
                                        td4.w0(th);
                                        fm0 fm0Var3 = this.j;
                                        fm0Var3.getClass();
                                        be6.a(fm0Var3, th);
                                        if (!this.n) {
                                            this.e.cancel();
                                            ed8 ed8Var3 = this.m;
                                            fm0 fm0Var4 = this.j;
                                            fm0Var4.getClass();
                                            ed8Var3.onError(be6.b(fm0Var4));
                                            return;
                                        }
                                        obj = null;
                                    }
                                    if (obj == null) {
                                        continue;
                                    } else if (this.a.g) {
                                        this.m.onNext(obj);
                                    } else {
                                        this.k = true;
                                        this.a.i(new tb8(this.a, obj));
                                    }
                                } else {
                                    this.k = true;
                                    xgfVar.a(this.a);
                                }
                            } catch (Throwable th2) {
                                td4.w0(th2);
                                this.e.cancel();
                                fm0 fm0Var5 = this.j;
                                fm0Var5.getClass();
                                be6.a(fm0Var5, th2);
                                ed8 ed8Var4 = this.m;
                                fm0 fm0Var6 = this.j;
                                fm0Var6.getClass();
                                ed8Var4.onError(be6.b(fm0Var6));
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        td4.w0(th3);
                        this.e.cancel();
                        fm0 fm0Var7 = this.j;
                        fm0Var7.getClass();
                        be6.a(fm0Var7, th3);
                        ed8 ed8Var5 = this.m;
                        fm0 fm0Var8 = this.j;
                        fm0Var8.getClass();
                        ed8Var5.onError(be6.b(fm0Var8));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
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
        if (!this.n) {
            this.e.cancel();
            this.h = true;
        }
        this.k = false;
        d();
    }

    @Override // defpackage.pb8
    public final void g(Object obj) {
        this.m.onNext(obj);
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
        } else {
            this.h = true;
            d();
        }
    }

    @Override // defpackage.iki
    public final void request(long j) {
        this.a.request(j);
    }
}
