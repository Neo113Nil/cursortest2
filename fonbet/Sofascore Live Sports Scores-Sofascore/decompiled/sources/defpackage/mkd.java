package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mkd extends AtomicInteger implements tif, Runnable {
    public final rkd a;
    public final Object b;

    public mkd(rkd rkdVar, Object obj) {
        this.a = rkdVar;
        this.b = obj;
    }

    @Override // defpackage.ohh
    public final void clear() {
        lazySet(3);
    }

    @Override // defpackage.k55
    public final void d() {
        set(3);
    }

    @Override // defpackage.ohh
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // defpackage.ohh
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.ohh
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.b;
            rkd rkdVar = this.a;
            rkdVar.onNext(obj);
            if (get() == 2) {
                lazySet(3);
                rkdVar.onComplete();
            }
        }
    }
}
