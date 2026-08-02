package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ad8 extends AtomicLong implements iki {
    public final ed8 a;
    public volatile bd8 b;
    public long c;

    public ad8(ed8 ed8Var) {
        this.a = ed8Var;
    }

    @Override // defpackage.iki
    public final void cancel() {
        bd8 bd8Var;
        if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (bd8Var = this.b) == null) {
            return;
        }
        bd8Var.i(this);
        bd8Var.g();
    }

    @Override // defpackage.iki
    public final void request(long j) {
        long j2;
        if (pki.c(j)) {
            do {
                j2 = get();
                if (j2 == Long.MIN_VALUE || j2 == Long.MAX_VALUE) {
                    break;
                }
            } while (!compareAndSet(j2, wkn.o(j2, j)));
            bd8 bd8Var = this.b;
            if (bd8Var != null) {
                bd8Var.g();
            }
        }
    }
}
