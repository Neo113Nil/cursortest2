package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w5h implements Executor {
    public static final Logger c = Logger.getLogger(w5h.class.getName());
    public boolean a;
    public ArrayDeque b;

    public final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.b.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        z1a.y(runnable, "'task' must not be null.");
        if (this.a) {
            ArrayDeque arrayDeque = this.b;
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque(4);
                this.b = arrayDeque;
            }
            arrayDeque.add(runnable);
            return;
        }
        this.a = true;
        try {
            runnable.run();
        } catch (Throwable th) {
            try {
                c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
                if (this.b != null) {
                    a();
                }
                this.a = false;
            } finally {
                if (this.b != null) {
                    a();
                }
                this.a = false;
            }
        }
    }
}
