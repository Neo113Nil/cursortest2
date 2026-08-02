package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class dv4 extends ao1 {
    public final ed8 a;
    public Object b;

    public dv4(ed8 ed8Var) {
        this.a = ed8Var;
    }

    @Override // defpackage.zif
    public final int c(int i) {
        lazySet(8);
        return 2;
    }

    @Override // defpackage.ohh
    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    public final void d(Object obj) {
        int i = get();
        do {
            ed8 ed8Var = this.a;
            if (i == 8) {
                this.b = obj;
                lazySet(16);
                ed8Var.onNext(obj);
                if (get() != 4) {
                    ed8Var.onComplete();
                    return;
                }
                return;
            }
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                ed8Var.onNext(obj);
                if (get() != 4) {
                    ed8Var.onComplete();
                    return;
                }
                return;
            }
            this.b = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i = get();
            }
        } while (i != 4);
        this.b = null;
    }

    @Override // defpackage.ohh
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj) {
        d(obj);
    }

    @Override // defpackage.ohh
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // defpackage.iki
    public final void request(long j) {
        Object obj;
        if (pki.c(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.b) == null) {
                        return;
                    }
                    this.b = null;
                    ed8 ed8Var = this.a;
                    ed8Var.onNext(obj);
                    if (get() != 4) {
                        ed8Var.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}
