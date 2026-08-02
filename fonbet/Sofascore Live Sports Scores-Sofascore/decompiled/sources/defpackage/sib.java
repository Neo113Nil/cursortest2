package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sib implements Runnable {
    public static final Logger b = Logger.getLogger(sib.class.getName());
    public final Runnable a;

    public sib(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.a;
        try {
            runnable.run();
        } catch (Throwable th) {
            b.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            Object obj = mgj.a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            a70.j(th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.a + ")";
    }
}
