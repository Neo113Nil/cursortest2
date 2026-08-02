package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h0c extends AtomicReference implements k55, w0c, ya3 {
    public final /* synthetic */ int a;
    public final Object b;

    public h0c(w0c w0cVar) {
        this.a = 0;
        this.b = w0cVar;
    }

    @Override // defpackage.w0c
    public void a(k55 k55Var) {
        switch (this.a) {
            case 1:
                r55.e(this, k55Var);
                break;
            default:
                r55.e(this, k55Var);
                break;
        }
    }

    @Override // defpackage.k55
    public final void d() {
        switch (this.a) {
            case 0:
                r55.a(this);
                break;
            case 1:
                r55.a(this);
                break;
            default:
                r55.a(this);
                break;
        }
    }

    @Override // defpackage.w0c
    public final void onComplete() {
        k55 k55Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object obj2 = get();
                r55 r55Var = r55.a;
                if (obj2 == r55Var || (k55Var = (k55) getAndSet(r55Var)) == r55Var) {
                    return;
                }
                try {
                    ((w0c) obj).onComplete();
                    if (k55Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (k55Var != null) {
                        k55Var.d();
                    }
                }
            case 1:
                mc8 mc8Var = (mc8) obj;
                AtomicInteger atomicInteger = mc8Var.d;
                mc8Var.c.b(this);
                if (mc8Var.get() == 0) {
                    if (mc8Var.compareAndSet(0, 1)) {
                        boolean z = atomicInteger.decrementAndGet() == 0;
                        i0i i0iVar = (i0i) mc8Var.g.get();
                        if (!z || (i0iVar != null && !i0iVar.isEmpty())) {
                            if (mc8Var.decrementAndGet() == 0) {
                                return;
                            }
                            mc8Var.h();
                            return;
                        } else {
                            Throwable b = be6.b(mc8Var.e);
                            ed8 ed8Var = mc8Var.a;
                            if (b != null) {
                                ed8Var.onError(b);
                                return;
                            } else {
                                ed8Var.onComplete();
                                return;
                            }
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                mc8Var.g();
                return;
            default:
                hkd hkdVar = (hkd) obj;
                hkdVar.d.b(this);
                hkdVar.onComplete();
                return;
        }
    }

    @Override // defpackage.w0c
    public final void onError(Throwable th) {
        k55 k55Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Throwable nullPointerException = th == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th;
                Object obj2 = get();
                r55 r55Var = r55.a;
                if (obj2 == r55Var || (k55Var = (k55) getAndSet(r55Var)) == r55Var) {
                    hda.L(th);
                    return;
                }
                try {
                    ((w0c) obj).onError(nullPointerException);
                    if (k55Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (k55Var != null) {
                        k55Var.d();
                    }
                }
            case 1:
                mc8 mc8Var = (mc8) obj;
                vf3 vf3Var = mc8Var.c;
                vf3Var.b(this);
                if (!be6.a(mc8Var.e, th)) {
                    hda.L(th);
                    return;
                }
                mc8Var.h.cancel();
                vf3Var.d();
                mc8Var.d.decrementAndGet();
                mc8Var.g();
                return;
            default:
                hkd hkdVar = (hkd) obj;
                hkdVar.d.b(this);
                hkdVar.onError(th);
                return;
        }
    }

    @Override // defpackage.w0c
    public void onSuccess(Object obj) {
        mc8 mc8Var = (mc8) this.b;
        mc8Var.c.b(this);
        if (mc8Var.get() == 0) {
            if (mc8Var.compareAndSet(0, 1)) {
                boolean z = mc8Var.d.decrementAndGet() == 0;
                if (mc8Var.b.get() != 0) {
                    mc8Var.a.onNext(obj);
                    i0i i0iVar = (i0i) mc8Var.g.get();
                    if (z && (i0iVar == null || i0iVar.isEmpty())) {
                        Throwable b = be6.b(mc8Var.e);
                        ed8 ed8Var = mc8Var.a;
                        if (b != null) {
                            ed8Var.onError(b);
                            return;
                        } else {
                            ed8Var.onComplete();
                            return;
                        }
                    }
                    wkn.J(mc8Var.b, 1L);
                } else {
                    i0i i = mc8Var.i();
                    synchronized (i) {
                        i.offer(obj);
                    }
                }
                if (mc8Var.decrementAndGet() == 0) {
                    return;
                }
                mc8Var.h();
            }
        }
        i0i i2 = mc8Var.i();
        synchronized (i2) {
            i2.offer(obj);
        }
        mc8Var.d.decrementAndGet();
        if (mc8Var.getAndIncrement() != 0) {
            return;
        }
        mc8Var.h();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.a) {
            case 0:
                return fc6.n(h0c.class.getSimpleName(), "{", super.toString(), "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ h0c(AtomicInteger atomicInteger, int i) {
        this.a = i;
        this.b = atomicInteger;
    }
}
