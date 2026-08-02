package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wb8 extends vb8 {
    public final /* synthetic */ int c = 1;
    public Throwable d;
    public volatile boolean e;
    public final AtomicInteger f;
    public final Object g;

    public wb8(ed8 ed8Var, int i) {
        super(ed8Var);
        this.g = new i0i(i);
        this.f = new AtomicInteger();
    }

    @Override // defpackage.vb8
    public final void g(Object obj) {
        switch (this.c) {
            case 0:
                if (!this.e && !this.b.g()) {
                    if (obj != null) {
                        ((i0i) this.g).offer(obj);
                        k();
                        break;
                    } else {
                        f(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                        break;
                    }
                }
                break;
            default:
                if (!this.e && !this.b.g()) {
                    if (obj != null) {
                        ((AtomicReference) this.g).set(obj);
                        k();
                        break;
                    } else {
                        f(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.vb8
    public final void h() {
        switch (this.c) {
            case 0:
                k();
                break;
            default:
                k();
                break;
        }
    }

    @Override // defpackage.vb8
    public final void i() {
        switch (this.c) {
            case 0:
                if (this.f.getAndIncrement() == 0) {
                    ((i0i) this.g).clear();
                    break;
                }
                break;
            default:
                if (this.f.getAndIncrement() == 0) {
                    ((AtomicReference) this.g).lazySet(null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.vb8
    public final boolean j(Throwable th) {
        switch (this.c) {
            case 0:
                if (!this.e && !this.b.g()) {
                    this.d = th;
                    this.e = true;
                    k();
                    break;
                }
                break;
            default:
                if (!this.e && !this.b.g()) {
                    this.d = th;
                    this.e = true;
                    k();
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        switch (this.c) {
            case 0:
                if (this.f.getAndIncrement() == 0) {
                    ed8 ed8Var = this.a;
                    i0i i0iVar = (i0i) this.g;
                    int i = 1;
                    do {
                        long j = get();
                        for (long j2 = 0; j2 != j; j2++) {
                            if (this.b.g()) {
                                i0iVar.clear();
                                break;
                            } else {
                                boolean z = this.e;
                                Object poll = i0iVar.poll();
                                boolean z2 = poll == null;
                                if (z && z2) {
                                    Throwable th = this.d;
                                    if (th != null) {
                                        e(th);
                                        break;
                                    } else {
                                        d();
                                        break;
                                    }
                                } else if (z2) {
                                    if (j2 == j) {
                                        if (this.b.g()) {
                                            i0iVar.clear();
                                            break;
                                        } else {
                                            boolean z3 = this.e;
                                            boolean isEmpty = i0iVar.isEmpty();
                                            if (z3 && isEmpty) {
                                                Throwable th2 = this.d;
                                                if (th2 != null) {
                                                    e(th2);
                                                    break;
                                                } else {
                                                    d();
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    if (j2 != 0) {
                                        wkn.J(this, j2);
                                    }
                                    i = this.f.addAndGet(-i);
                                } else {
                                    ed8Var.onNext(poll);
                                }
                            }
                        }
                        if (j2 == j) {
                        }
                        if (j2 != 0) {
                        }
                        i = this.f.addAndGet(-i);
                    } while (i != 0);
                }
                break;
            default:
                if (this.f.getAndIncrement() == 0) {
                    ed8 ed8Var2 = this.a;
                    AtomicReference atomicReference = (AtomicReference) this.g;
                    int i2 = 1;
                    do {
                        long j3 = get();
                        for (long j4 = 0; j4 != j3; j4++) {
                            if (this.b.g()) {
                                atomicReference.lazySet(null);
                                break;
                            } else {
                                boolean z4 = this.e;
                                Object andSet = atomicReference.getAndSet(null);
                                boolean z5 = andSet == null;
                                if (z4 && z5) {
                                    Throwable th3 = this.d;
                                    if (th3 != null) {
                                        e(th3);
                                        break;
                                    } else {
                                        d();
                                        break;
                                    }
                                } else if (z5) {
                                    if (j4 == j3) {
                                        if (this.b.g()) {
                                            atomicReference.lazySet(null);
                                            break;
                                        } else {
                                            boolean z6 = this.e;
                                            boolean z7 = atomicReference.get() == null;
                                            if (z6 && z7) {
                                                Throwable th4 = this.d;
                                                if (th4 != null) {
                                                    e(th4);
                                                    break;
                                                } else {
                                                    d();
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    if (j4 != 0) {
                                        wkn.J(this, j4);
                                    }
                                    i2 = this.f.addAndGet(-i2);
                                } else {
                                    ed8Var2.onNext(andSet);
                                }
                            }
                        }
                        if (j4 == j3) {
                        }
                        if (j4 != 0) {
                        }
                        i2 = this.f.addAndGet(-i2);
                    } while (i2 != 0);
                }
                break;
        }
    }

    public wb8(ed8 ed8Var) {
        super(ed8Var);
        this.g = new AtomicReference();
        this.f = new AtomicInteger();
    }
}
