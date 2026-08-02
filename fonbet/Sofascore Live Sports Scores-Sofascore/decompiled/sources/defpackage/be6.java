package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class be6 {
    public static final ae6 a = new ae6("No further exceptions", 0);

    public static boolean a(AtomicReference atomicReference, Throwable th) {
        while (true) {
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 == a) {
                return false;
            }
            Throwable yf3Var = th2 == null ? th : new yf3(th2, th);
            while (!atomicReference.compareAndSet(th2, yf3Var)) {
                if (atomicReference.get() != th2) {
                    break;
                }
            }
            return true;
        }
    }

    public static Throwable b(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        ae6 ae6Var = a;
        return th != ae6Var ? (Throwable) atomicReference.getAndSet(ae6Var) : th;
    }

    public static RuntimeException c(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
