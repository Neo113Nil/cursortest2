package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cz2 {
    public final fl8 a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public cz2(fl8 fl8Var) {
        this.a = fl8Var;
    }

    public final boolean a() {
        synchronized (this) {
            if (this.c.get()) {
                return false;
            }
            this.b.incrementAndGet();
            return true;
        }
    }

    public final void b() {
        synchronized (this) {
            this.b.decrementAndGet();
            if (this.b.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            Unit unit = Unit.a;
        }
    }
}
