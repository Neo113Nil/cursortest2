package defpackage;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wx3 implements Thread.UncaughtExceptionHandler {
    public final t9d a;
    public final ng2 b;
    public final Thread.UncaughtExceptionHandler c;
    public final ow3 d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public wx3(t9d t9dVar, ng2 ng2Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ow3 ow3Var) {
        this.a = t9dVar;
        this.b = ng2Var;
        this.c = uncaughtExceptionHandler;
        this.d = ow3Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        AtomicBoolean atomicBoolean = this.e;
        atomicBoolean.set(true);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        if (thread != null && th != null) {
            try {
                if (!this.d.b()) {
                    this.a.g(this.b, thread, th);
                }
            } catch (Exception unused) {
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    System.exit(1);
                }
                atomicBoolean.set(false);
                return;
            } catch (Throwable th2) {
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    System.exit(1);
                }
                atomicBoolean.set(false);
                throw th2;
            }
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            System.exit(1);
        }
        atomicBoolean.set(false);
    }
}
