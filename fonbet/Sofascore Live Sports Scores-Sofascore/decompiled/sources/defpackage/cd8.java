package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cd8 extends ob8 {
    public final ob8 b;
    public final AtomicReference c;
    public final int d;
    public final zc8 e;

    public cd8(zc8 zc8Var, ob8 ob8Var, AtomicReference atomicReference, int i) {
        this.e = zc8Var;
        this.b = ob8Var;
        this.c = atomicReference;
        this.d = i;
    }

    @Override // defpackage.ob8
    public final void e(ed8 ed8Var) {
        this.e.a(ed8Var);
    }

    public final void f() {
        bd8 bd8Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.c;
            bd8Var = (bd8) atomicReference.get();
            if (bd8Var != null && !bd8Var.h()) {
                break;
            }
            bd8 bd8Var2 = new bd8(atomicReference, this.d);
            while (!atomicReference.compareAndSet(bd8Var, bd8Var2)) {
                if (atomicReference.get() != bd8Var) {
                    break;
                }
            }
            bd8Var = bd8Var2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = bd8Var.d;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        this.b.d(bd8Var);
    }
}
