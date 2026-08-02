package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r55 implements k55 {
    public static final r55 a;
    public static final /* synthetic */ r55[] b;

    static {
        r55 r55Var = new r55("DISPOSED", 0);
        a = r55Var;
        b = new r55[]{r55Var};
    }

    public static void a(AtomicReference atomicReference) {
        k55 k55Var;
        k55 k55Var2 = (k55) atomicReference.get();
        r55 r55Var = a;
        if (k55Var2 == r55Var || (k55Var = (k55) atomicReference.getAndSet(r55Var)) == r55Var || k55Var == null) {
            return;
        }
        k55Var.d();
    }

    public static boolean b(k55 k55Var) {
        return k55Var == a;
    }

    public static void c(AtomicReference atomicReference, k55 k55Var) {
        while (true) {
            k55 k55Var2 = (k55) atomicReference.get();
            if (k55Var2 == a) {
                if (k55Var != null) {
                    k55Var.d();
                    return;
                }
                return;
            } else {
                while (!atomicReference.compareAndSet(k55Var2, k55Var)) {
                    if (atomicReference.get() != k55Var2) {
                        break;
                    }
                }
                return;
            }
        }
    }

    public static boolean e(AtomicReference atomicReference, k55 k55Var) {
        rha.x(k55Var, "d is null");
        while (!atomicReference.compareAndSet(null, k55Var)) {
            if (atomicReference.get() != null) {
                k55Var.d();
                if (atomicReference.get() == a) {
                    return false;
                }
                hda.L(new kx2("Disposable already set!", 5));
                return false;
            }
        }
        return true;
    }

    public static boolean f(k55 k55Var, k55 k55Var2) {
        if (k55Var2 == null) {
            hda.L(new NullPointerException("next is null"));
            return false;
        }
        if (k55Var == null) {
            return true;
        }
        k55Var2.d();
        hda.L(new kx2("Disposable already set!", 5));
        return false;
    }

    public static r55 valueOf(String str) {
        return (r55) Enum.valueOf(r55.class, str);
    }

    public static r55[] values() {
        return (r55[]) b.clone();
    }

    @Override // defpackage.k55
    public final void d() {
    }
}
