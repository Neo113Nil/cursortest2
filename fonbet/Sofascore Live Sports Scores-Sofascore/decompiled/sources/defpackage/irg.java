package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class irg extends AtomicInteger implements ajf {
    public final Object a;
    public final ed8 b;

    public irg(ed8 ed8Var, Object obj) {
        this.b = ed8Var;
        this.a = obj;
    }

    @Override // defpackage.zif
    public final int c(int i) {
        return 1;
    }

    @Override // defpackage.iki
    public final void cancel() {
        lazySet(2);
    }

    @Override // defpackage.ohh
    public final void clear() {
        lazySet(1);
    }

    @Override // defpackage.ohh
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // defpackage.ohh
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.ohh
    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.a;
    }

    @Override // defpackage.iki
    public final void request(long j) {
        if (pki.c(j) && compareAndSet(0, 1)) {
            Object obj = this.a;
            ed8 ed8Var = this.b;
            ed8Var.onNext(obj);
            if (get() != 2) {
                ed8Var.onComplete();
            }
        }
    }
}
