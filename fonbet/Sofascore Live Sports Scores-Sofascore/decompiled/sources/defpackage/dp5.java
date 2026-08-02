package defpackage;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public final class dp5 implements Runnable {
    public static final Logger b = Logger.getLogger(dp5.class.getName());
    public final LinkedList a = new LinkedList();

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        while (!Thread.currentThread().isInterrupted()) {
            synchronized (this.a) {
                runnable = (Runnable) this.a.poll();
            }
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable unused) {
                }
            } else {
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        Logger logger = b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("entropy thread interrupted - exiting");
        }
    }
}
